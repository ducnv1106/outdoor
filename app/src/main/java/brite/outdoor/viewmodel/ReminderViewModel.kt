package brite.outdoor.viewmodel

import android.app.AlarmManager
import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.*
import brite.outdoor.data.api_entities.response.ResponseCreateCamping
import brite.outdoor.data.api_entities.response.ResponseListCamping
import brite.outdoor.data.remote.ApiController
import brite.outdoor.data.remote.ApiResult
import brite.outdoor.data.repository.AppRepository
import brite.outdoor.entity.Reminders
import brite.outdoor.utils.AlarmUtil
import brite.outdoor.utils.performGetOperation
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ReminderViewModel @Inject constructor(private val gson: Gson, apiController: ApiController,private val repository : AppRepository,private val app: Application): AndroidViewModel(app) {

    companion object {
        private const val TAG = "RemindersListViewModel"
    }
    val _contentEditText = MutableLiveData<String>() //2-way binding
    val _switchCompat = MutableLiveData<Boolean>() //2-way binding
    val switchCompat: Boolean
        get() = _switchCompat.value == true

    private val _dateText = MutableLiveData<String>()
    val dateText: LiveData<String>
        get() = _dateText

    private val _timeText = MutableLiveData<String>()
    val timeText: LiveData<String>
        get() = _timeText

    private val _title = MutableLiveData<String>()
    val title :LiveData<String>
        get() = _title

    private lateinit var editableReminder: Reminders
    private var reminderId: Int?=null
    private val alarmManager = app.getSystemService(Context.ALARM_SERVICE) as AlarmManager
    val reminders = repository.getAllReminders()


    fun initReminderId(reminderId:Int){
        this.reminderId=reminderId
    }

    fun initTextViewContent(content:String){
        _title.value=content
    }
    fun initSwitchCompat(checked:Boolean){
        _switchCompat.value=checked
    }

    fun initializeReminder() {
        viewModelScope.launch {
            if (reminderId != null) {
                val reminder = repository.getReminderById(reminderId ?: -1)
                if (reminder==null){
//                    Log.e(TAG, "initializeReminder: ${dateText.value}  ${timeText.value}", )
                    editableReminder = Reminders(id = reminderId!!,title=title.value ?: "", time = timeText.value?:"", date = dateText.value?:"", content = _contentEditText.value?:"" )
                    reminderId=null
                }else{
                    editableReminder = reminder
                }
            } else {
//                Log.e(TAG, "initializeReminder:2 : ${_dateText.value!!}  ${_timeText.value!!}", )
                editableReminder = Reminders(id = reminderId!!,title=title.value ?: "", time = timeText.value?:"", date = dateText.value?:"", content =  _contentEditText.value?:"")
            }
            updateUI()
        }
    }
    fun updateUI() {
        _contentEditText.value = editableReminder.content
        _dateText.value = editableReminder.date
        _timeText.value = editableReminder.time
    }

    val isEmpty = Transformations.map   (reminders) {
        it.isEmpty()
    }



    fun updateReminder(reminder: Reminders) {
        viewModelScope.launch {
            repository.update(reminder)
        }
    }

    fun updateAlarm(reminder: Reminders) {
        if(reminder.isActive){
            createReminderAlarm(reminder)
        }else{
            cancelExistingAlarm(reminder)
        }
    }

    fun saveReminder() {
        if (_contentEditText.value.isNullOrEmpty()) {
//            _snackBarEvent.value = Event(app.getString(R.string.snackbartext_emptyReminder))
        } else {
            updateReminder()
            viewModelScope.launch {
                if (reminderId == null) {
                    repository.insert(editableReminder)
                    editableReminder = repository.getLatestReminder()!!
                } else {
                    repository.update(editableReminder)
                    cancelExistingAlarm(editableReminder)
                }
                createReminderAlarm(editableReminder)
            }
        }
    }
    fun deleteReminder(){
        if (reminderId!=null){
            viewModelScope.launch {
                repository.delete(editableReminder)
            }
        }
    }
    fun updateReminder() {
        editableReminder.apply {
            content = _contentEditText.value!!
            date = _dateText.value!!
            time = _timeText.value!!

        }
    }

    private  fun createReminderAlarm(reminder: Reminders?) {
        reminder?.let {
            AlarmUtil.createAlarm(
                app.applicationContext,
                reminder,
                alarmManager
            )
        }

    }

    private  fun cancelExistingAlarm(reminder: Reminders?) {
        reminder?.let {
            AlarmUtil.cancelAlarm(
                app.applicationContext,
                reminder,
                alarmManager
            )
        }
    }

    fun updateDateTextView(date: String) {
        _dateText.value = date
    }
    fun updateTimeTextView(time: String) {
        _timeText.value = time
    }
    fun updateContentTextView(content: String) {
        _contentEditText.value = content
    }
    // create camping
    private val _requestCreateCamping : MutableLiveData<HashMap<String, String>> = MutableLiveData()
    fun requestCreateCamping(requestCreateCamping : HashMap<String,String>) {
        _requestCreateCamping.value = requestCreateCamping
    }
    private val _createCampingResult = _requestCreateCamping.switchMap {
        performGetOperation(gson) { apiController.createCamping(it) }
    }
    val createCampingResult : LiveData<ApiResult<ResponseCreateCamping.CreateCampingResult>> = _createCampingResult
}