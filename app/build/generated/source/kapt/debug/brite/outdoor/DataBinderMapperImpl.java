package brite.outdoor;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import brite.outdoor.databinding.ActCameraBindingImpl;
import brite.outdoor.databinding.ActMainBindingImpl;
import brite.outdoor.databinding.ActMainNewBindingImpl;
import brite.outdoor.databinding.ActMediaBindingImpl;
import brite.outdoor.databinding.DialogCancelBindingImpl;
import brite.outdoor.databinding.DialogFrmReportBindingImpl;
import brite.outdoor.databinding.DialogReminderBindingImpl;
import brite.outdoor.databinding.DialogSuccessBindingImpl;
import brite.outdoor.databinding.DialogTwoChooseBindingImpl;
import brite.outdoor.databinding.FrmCommentQuestionBindingImpl;
import brite.outdoor.databinding.FrmEditQuestionBindingImpl;
import brite.outdoor.databinding.FrmFrequentQuestionBindingImpl;
import brite.outdoor.databinding.FrmHomeFocusBindingImpl;
import brite.outdoor.databinding.FrmHomeFollowBindingImpl;
import brite.outdoor.databinding.FrmHomeNewsBindingImpl;
import brite.outdoor.databinding.FrmHotNewsBindingImpl;
import brite.outdoor.databinding.FrmImageBindingImpl;
import brite.outdoor.databinding.FrmImagePagerBindingImpl;
import brite.outdoor.databinding.FrmLanguageBindingImpl;
import brite.outdoor.databinding.FrmListPeopleInteractiveBindingImpl;
import brite.outdoor.databinding.FrmListPostLocationBindingImpl;
import brite.outdoor.databinding.FrmLocationSaveBindingImpl;
import brite.outdoor.databinding.FrmNotificationBindingImpl;
import brite.outdoor.databinding.FrmQuestionBindingImpl;
import brite.outdoor.databinding.FrmSaveQuestionBindingImpl;
import brite.outdoor.databinding.FrmSearchLocationBindingImpl;
import brite.outdoor.databinding.FrmSearchUserBindingImpl;
import brite.outdoor.databinding.FrmSearchUtensilsBindingImpl;
import brite.outdoor.databinding.FrmSearchVer2BindingImpl;
import brite.outdoor.databinding.ItemCommentQuestionBindingImpl;
import brite.outdoor.databinding.ItemCommnetHotNewsBindingImpl;
import brite.outdoor.databinding.ItemContentDetailHotNewsBindingImpl;
import brite.outdoor.databinding.ItemFrequentQuestionBindingImpl;
import brite.outdoor.databinding.ItemHotNewsBindingImpl;
import brite.outdoor.databinding.ItemImageContentBlockBindingImpl;
import brite.outdoor.databinding.ItemIntroBindingImpl;
import brite.outdoor.databinding.ItemListPostLocationBindingImpl;
import brite.outdoor.databinding.ItemLocationNewBindingImpl;
import brite.outdoor.databinding.ItemLocationOrUntensilShimmerPlacerholderBindingImpl;
import brite.outdoor.databinding.ItemLocationSaveBindingImpl;
import brite.outdoor.databinding.ItemMyPageBindingImpl;
import brite.outdoor.databinding.ItemNewsBindingImpl;
import brite.outdoor.databinding.ItemNewsVer2BindingImpl;
import brite.outdoor.databinding.ItemNotificationBindingImpl;
import brite.outdoor.databinding.ItemNotificationShimmerPlaceholderBindingImpl;
import brite.outdoor.databinding.ItemQuestionShimmerPlaceholderBindingImpl;
import brite.outdoor.databinding.ItemReplyCommentHotNewsBindingImpl;
import brite.outdoor.databinding.ItemReplyCommentQuestionBindingImpl;
import brite.outdoor.databinding.ItemReportBindingImpl;
import brite.outdoor.databinding.ItemSearchWithLocateOrToolBindingImpl;
import brite.outdoor.databinding.LayoutCommentHotNewsBindingImpl;
import brite.outdoor.databinding.LayoutDialogBottomItemFrmhomeBindingImpl;
import brite.outdoor.databinding.ProgressDialogLoadingBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTCAMERA = 1;

  private static final int LAYOUT_ACTMAIN = 2;

  private static final int LAYOUT_ACTMAINNEW = 3;

  private static final int LAYOUT_ACTMEDIA = 4;

  private static final int LAYOUT_DIALOGCANCEL = 5;

  private static final int LAYOUT_DIALOGFRMREPORT = 6;

  private static final int LAYOUT_DIALOGREMINDER = 7;

  private static final int LAYOUT_DIALOGSUCCESS = 8;

  private static final int LAYOUT_DIALOGTWOCHOOSE = 9;

  private static final int LAYOUT_FRMCOMMENTQUESTION = 10;

  private static final int LAYOUT_FRMEDITQUESTION = 11;

  private static final int LAYOUT_FRMFREQUENTQUESTION = 12;

  private static final int LAYOUT_FRMHOMEFOCUS = 13;

  private static final int LAYOUT_FRMHOMEFOLLOW = 14;

  private static final int LAYOUT_FRMHOMENEWS = 15;

  private static final int LAYOUT_FRMHOTNEWS = 16;

  private static final int LAYOUT_FRMIMAGE = 17;

  private static final int LAYOUT_FRMIMAGEPAGER = 18;

  private static final int LAYOUT_FRMLANGUAGE = 19;

  private static final int LAYOUT_FRMLISTPEOPLEINTERACTIVE = 20;

  private static final int LAYOUT_FRMLISTPOSTLOCATION = 21;

  private static final int LAYOUT_FRMLOCATIONSAVE = 22;

  private static final int LAYOUT_FRMNOTIFICATION = 23;

  private static final int LAYOUT_FRMQUESTION = 24;

  private static final int LAYOUT_FRMSAVEQUESTION = 25;

  private static final int LAYOUT_FRMSEARCHLOCATION = 26;

  private static final int LAYOUT_FRMSEARCHUSER = 27;

  private static final int LAYOUT_FRMSEARCHUTENSILS = 28;

  private static final int LAYOUT_FRMSEARCHVER2 = 29;

  private static final int LAYOUT_ITEMCOMMENTQUESTION = 30;

  private static final int LAYOUT_ITEMCOMMNETHOTNEWS = 31;

  private static final int LAYOUT_ITEMCONTENTDETAILHOTNEWS = 32;

  private static final int LAYOUT_ITEMFREQUENTQUESTION = 33;

  private static final int LAYOUT_ITEMHOTNEWS = 34;

  private static final int LAYOUT_ITEMIMAGECONTENTBLOCK = 35;

  private static final int LAYOUT_ITEMINTRO = 36;

  private static final int LAYOUT_ITEMLISTPOSTLOCATION = 37;

  private static final int LAYOUT_ITEMLOCATIONNEW = 38;

  private static final int LAYOUT_ITEMLOCATIONORUNTENSILSHIMMERPLACERHOLDER = 39;

  private static final int LAYOUT_ITEMLOCATIONSAVE = 40;

  private static final int LAYOUT_ITEMMYPAGE = 41;

  private static final int LAYOUT_ITEMNEWS = 42;

  private static final int LAYOUT_ITEMNEWSVER2 = 43;

  private static final int LAYOUT_ITEMNOTIFICATION = 44;

  private static final int LAYOUT_ITEMNOTIFICATIONSHIMMERPLACEHOLDER = 45;

  private static final int LAYOUT_ITEMQUESTIONSHIMMERPLACEHOLDER = 46;

  private static final int LAYOUT_ITEMREPLYCOMMENTHOTNEWS = 47;

  private static final int LAYOUT_ITEMREPLYCOMMENTQUESTION = 48;

  private static final int LAYOUT_ITEMREPORT = 49;

  private static final int LAYOUT_ITEMSEARCHWITHLOCATEORTOOL = 50;

  private static final int LAYOUT_LAYOUTCOMMENTHOTNEWS = 51;

  private static final int LAYOUT_LAYOUTDIALOGBOTTOMITEMFRMHOME = 52;

  private static final int LAYOUT_PROGRESSDIALOGLOADING = 53;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(53);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.act_camera, LAYOUT_ACTCAMERA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.act_main, LAYOUT_ACTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.act_main_new, LAYOUT_ACTMAINNEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.act_media, LAYOUT_ACTMEDIA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.dialog_cancel, LAYOUT_DIALOGCANCEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.dialog_frm_report, LAYOUT_DIALOGFRMREPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.dialog_reminder, LAYOUT_DIALOGREMINDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.dialog_success, LAYOUT_DIALOGSUCCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.dialog_two_choose, LAYOUT_DIALOGTWOCHOOSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_comment_question, LAYOUT_FRMCOMMENTQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_edit_question, LAYOUT_FRMEDITQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_frequent_question, LAYOUT_FRMFREQUENTQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_home_focus, LAYOUT_FRMHOMEFOCUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_home_follow, LAYOUT_FRMHOMEFOLLOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_home_news, LAYOUT_FRMHOMENEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_hot_news, LAYOUT_FRMHOTNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_image, LAYOUT_FRMIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_image_pager, LAYOUT_FRMIMAGEPAGER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_language, LAYOUT_FRMLANGUAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_list_people_interactive, LAYOUT_FRMLISTPEOPLEINTERACTIVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_list_post_location, LAYOUT_FRMLISTPOSTLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_location_save, LAYOUT_FRMLOCATIONSAVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_notification, LAYOUT_FRMNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_question, LAYOUT_FRMQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_save_question, LAYOUT_FRMSAVEQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_search_location, LAYOUT_FRMSEARCHLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_search_user, LAYOUT_FRMSEARCHUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_search_utensils, LAYOUT_FRMSEARCHUTENSILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.frm_search_ver2, LAYOUT_FRMSEARCHVER2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_comment_question, LAYOUT_ITEMCOMMENTQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_commnet_hot_news, LAYOUT_ITEMCOMMNETHOTNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_content_detail_hot_news, LAYOUT_ITEMCONTENTDETAILHOTNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_frequent_question, LAYOUT_ITEMFREQUENTQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_hot_news, LAYOUT_ITEMHOTNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_image_content_block, LAYOUT_ITEMIMAGECONTENTBLOCK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_intro, LAYOUT_ITEMINTRO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_list_post_location, LAYOUT_ITEMLISTPOSTLOCATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_location_new, LAYOUT_ITEMLOCATIONNEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_location_or_untensil_shimmer_placerholder, LAYOUT_ITEMLOCATIONORUNTENSILSHIMMERPLACERHOLDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_location_save, LAYOUT_ITEMLOCATIONSAVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_my_page, LAYOUT_ITEMMYPAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_news, LAYOUT_ITEMNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_news_ver2, LAYOUT_ITEMNEWSVER2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_notification, LAYOUT_ITEMNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_notification_shimmer_placeholder, LAYOUT_ITEMNOTIFICATIONSHIMMERPLACEHOLDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_question_shimmer_placeholder, LAYOUT_ITEMQUESTIONSHIMMERPLACEHOLDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_reply_comment_hot_news, LAYOUT_ITEMREPLYCOMMENTHOTNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_reply_comment_question, LAYOUT_ITEMREPLYCOMMENTQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_report, LAYOUT_ITEMREPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.item_search_with_locate_or_tool, LAYOUT_ITEMSEARCHWITHLOCATEORTOOL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.layout_comment_hot_news, LAYOUT_LAYOUTCOMMENTHOTNEWS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.layout_dialog_bottom_item_frmhome, LAYOUT_LAYOUTDIALOGBOTTOMITEMFRMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(brite.outdoor.R.layout.progress_dialog_loading, LAYOUT_PROGRESSDIALOGLOADING);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTCAMERA: {
        if ("layout/act_camera_0".equals(tag)) {
          return new ActCameraBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for act_camera is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTMAIN: {
        if ("layout/act_main_0".equals(tag)) {
          return new ActMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for act_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTMAINNEW: {
        if ("layout/act_main_new_0".equals(tag)) {
          return new ActMainNewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for act_main_new is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTMEDIA: {
        if ("layout/act_media_0".equals(tag)) {
          return new ActMediaBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for act_media is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGCANCEL: {
        if ("layout/dialog_cancel_0".equals(tag)) {
          return new DialogCancelBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_cancel is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGFRMREPORT: {
        if ("layout/dialog_frm_report_0".equals(tag)) {
          return new DialogFrmReportBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_frm_report is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGREMINDER: {
        if ("layout/dialog_reminder_0".equals(tag)) {
          return new DialogReminderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_reminder is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGSUCCESS: {
        if ("layout/dialog_success_0".equals(tag)) {
          return new DialogSuccessBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_success is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGTWOCHOOSE: {
        if ("layout/dialog_two_choose_0".equals(tag)) {
          return new DialogTwoChooseBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_two_choose is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMCOMMENTQUESTION: {
        if ("layout/frm_comment_question_0".equals(tag)) {
          return new FrmCommentQuestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_comment_question is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMEDITQUESTION: {
        if ("layout/frm_edit_question_0".equals(tag)) {
          return new FrmEditQuestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_edit_question is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMFREQUENTQUESTION: {
        if ("layout/frm_frequent_question_0".equals(tag)) {
          return new FrmFrequentQuestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_frequent_question is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMHOMEFOCUS: {
        if ("layout/frm_home_focus_0".equals(tag)) {
          return new FrmHomeFocusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_home_focus is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMHOMEFOLLOW: {
        if ("layout/frm_home_follow_0".equals(tag)) {
          return new FrmHomeFollowBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_home_follow is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMHOMENEWS: {
        if ("layout/frm_home_news_0".equals(tag)) {
          return new FrmHomeNewsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_home_news is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMHOTNEWS: {
        if ("layout/frm_hot_news_0".equals(tag)) {
          return new FrmHotNewsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_hot_news is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMIMAGE: {
        if ("layout/frm_image_0".equals(tag)) {
          return new FrmImageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_image is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMIMAGEPAGER: {
        if ("layout/frm_image_pager_0".equals(tag)) {
          return new FrmImagePagerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_image_pager is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMLANGUAGE: {
        if ("layout/frm_language_0".equals(tag)) {
          return new FrmLanguageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_language is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMLISTPEOPLEINTERACTIVE: {
        if ("layout/frm_list_people_interactive_0".equals(tag)) {
          return new FrmListPeopleInteractiveBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_list_people_interactive is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMLISTPOSTLOCATION: {
        if ("layout/frm_list_post_location_0".equals(tag)) {
          return new FrmListPostLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_list_post_location is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMLOCATIONSAVE: {
        if ("layout/frm_location_save_0".equals(tag)) {
          return new FrmLocationSaveBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_location_save is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMNOTIFICATION: {
        if ("layout/frm_notification_0".equals(tag)) {
          return new FrmNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMQUESTION: {
        if ("layout/frm_question_0".equals(tag)) {
          return new FrmQuestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_question is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMSAVEQUESTION: {
        if ("layout/frm_save_question_0".equals(tag)) {
          return new FrmSaveQuestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_save_question is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMSEARCHLOCATION: {
        if ("layout/frm_search_location_0".equals(tag)) {
          return new FrmSearchLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_search_location is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMSEARCHUSER: {
        if ("layout/frm_search_user_0".equals(tag)) {
          return new FrmSearchUserBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_search_user is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMSEARCHUTENSILS: {
        if ("layout/frm_search_utensils_0".equals(tag)) {
          return new FrmSearchUtensilsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_search_utensils is invalid. Received: " + tag);
      }
      case  LAYOUT_FRMSEARCHVER2: {
        if ("layout/frm_search_ver2_0".equals(tag)) {
          return new FrmSearchVer2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for frm_search_ver2 is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCOMMENTQUESTION: {
        if ("layout/item_comment_question_0".equals(tag)) {
          return new ItemCommentQuestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_comment_question is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCOMMNETHOTNEWS: {
        if ("layout/item_commnet_hot_news_0".equals(tag)) {
          return new ItemCommnetHotNewsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_commnet_hot_news is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCONTENTDETAILHOTNEWS: {
        if ("layout/item_content_detail_hot_news_0".equals(tag)) {
          return new ItemContentDetailHotNewsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_content_detail_hot_news is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMFREQUENTQUESTION: {
        if ("layout/item_frequent_question_0".equals(tag)) {
          return new ItemFrequentQuestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_frequent_question is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHOTNEWS: {
        if ("layout/item_hot_news_0".equals(tag)) {
          return new ItemHotNewsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_hot_news is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMIMAGECONTENTBLOCK: {
        if ("layout/item_image_content_block_0".equals(tag)) {
          return new ItemImageContentBlockBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_image_content_block is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMINTRO: {
        if ("layout/item_intro_0".equals(tag)) {
          return new ItemIntroBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_intro is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMLISTPOSTLOCATION: {
        if ("layout/item_list_post_location_0".equals(tag)) {
          return new ItemListPostLocationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_list_post_location is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMLOCATIONNEW: {
        if ("layout/item_location_new_0".equals(tag)) {
          return new ItemLocationNewBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_location_new is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMLOCATIONORUNTENSILSHIMMERPLACERHOLDER: {
        if ("layout/item_location_or_untensil_shimmer_placerholder_0".equals(tag)) {
          return new ItemLocationOrUntensilShimmerPlacerholderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_location_or_untensil_shimmer_placerholder is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMLOCATIONSAVE: {
        if ("layout/item_location_save_0".equals(tag)) {
          return new ItemLocationSaveBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_location_save is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMMYPAGE: {
        if ("layout/item_my_page_0".equals(tag)) {
          return new ItemMyPageBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_my_page is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMNEWS: {
        if ("layout/item_news_0".equals(tag)) {
          return new ItemNewsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_news is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMNEWSVER2: {
        if ("layout/item_news_ver2_0".equals(tag)) {
          return new ItemNewsVer2BindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_news_ver2 is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMNOTIFICATION: {
        if ("layout/item_notification_0".equals(tag)) {
          return new ItemNotificationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_notification is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMNOTIFICATIONSHIMMERPLACEHOLDER: {
        if ("layout/item_notification_shimmer_placeholder_0".equals(tag)) {
          return new ItemNotificationShimmerPlaceholderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_notification_shimmer_placeholder is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMQUESTIONSHIMMERPLACEHOLDER: {
        if ("layout/item_question_shimmer_placeholder_0".equals(tag)) {
          return new ItemQuestionShimmerPlaceholderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_question_shimmer_placeholder is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMREPLYCOMMENTHOTNEWS: {
        if ("layout/item_reply_comment_hot_news_0".equals(tag)) {
          return new ItemReplyCommentHotNewsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_reply_comment_hot_news is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMREPLYCOMMENTQUESTION: {
        if ("layout/item_reply_comment_question_0".equals(tag)) {
          return new ItemReplyCommentQuestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_reply_comment_question is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMREPORT: {
        if ("layout/item_report_0".equals(tag)) {
          return new ItemReportBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_report is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMSEARCHWITHLOCATEORTOOL: {
        if ("layout/item_search_with_locate_or_tool_0".equals(tag)) {
          return new ItemSearchWithLocateOrToolBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_search_with_locate_or_tool is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_LAYOUTCOMMENTHOTNEWS: {
        if ("layout/layout_comment_hot_news_0".equals(tag)) {
          return new LayoutCommentHotNewsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_comment_hot_news is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTDIALOGBOTTOMITEMFRMHOME: {
        if ("layout/layout_dialog_bottom_item_frmhome_0".equals(tag)) {
          return new LayoutDialogBottomItemFrmhomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_dialog_bottom_item_frmhome is invalid. Received: " + tag);
      }
      case  LAYOUT_PROGRESSDIALOGLOADING: {
        if ("layout/progress_dialog_loading_0".equals(tag)) {
          return new ProgressDialogLoadingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for progress_dialog_loading is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(9);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "isQuestionYou");
      sKeys.put(2, "item");
      sKeys.put(3, "mQuestionViewModel");
      sKeys.put(4, "mSearchViewModel");
      sKeys.put(5, "mViewModel");
      sKeys.put(6, "shareViewModel");
      sKeys.put(7, "urlAvatar");
      sKeys.put(8, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(53);

    static {
      sKeys.put("layout/act_camera_0", brite.outdoor.R.layout.act_camera);
      sKeys.put("layout/act_main_0", brite.outdoor.R.layout.act_main);
      sKeys.put("layout/act_main_new_0", brite.outdoor.R.layout.act_main_new);
      sKeys.put("layout/act_media_0", brite.outdoor.R.layout.act_media);
      sKeys.put("layout/dialog_cancel_0", brite.outdoor.R.layout.dialog_cancel);
      sKeys.put("layout/dialog_frm_report_0", brite.outdoor.R.layout.dialog_frm_report);
      sKeys.put("layout/dialog_reminder_0", brite.outdoor.R.layout.dialog_reminder);
      sKeys.put("layout/dialog_success_0", brite.outdoor.R.layout.dialog_success);
      sKeys.put("layout/dialog_two_choose_0", brite.outdoor.R.layout.dialog_two_choose);
      sKeys.put("layout/frm_comment_question_0", brite.outdoor.R.layout.frm_comment_question);
      sKeys.put("layout/frm_edit_question_0", brite.outdoor.R.layout.frm_edit_question);
      sKeys.put("layout/frm_frequent_question_0", brite.outdoor.R.layout.frm_frequent_question);
      sKeys.put("layout/frm_home_focus_0", brite.outdoor.R.layout.frm_home_focus);
      sKeys.put("layout/frm_home_follow_0", brite.outdoor.R.layout.frm_home_follow);
      sKeys.put("layout/frm_home_news_0", brite.outdoor.R.layout.frm_home_news);
      sKeys.put("layout/frm_hot_news_0", brite.outdoor.R.layout.frm_hot_news);
      sKeys.put("layout/frm_image_0", brite.outdoor.R.layout.frm_image);
      sKeys.put("layout/frm_image_pager_0", brite.outdoor.R.layout.frm_image_pager);
      sKeys.put("layout/frm_language_0", brite.outdoor.R.layout.frm_language);
      sKeys.put("layout/frm_list_people_interactive_0", brite.outdoor.R.layout.frm_list_people_interactive);
      sKeys.put("layout/frm_list_post_location_0", brite.outdoor.R.layout.frm_list_post_location);
      sKeys.put("layout/frm_location_save_0", brite.outdoor.R.layout.frm_location_save);
      sKeys.put("layout/frm_notification_0", brite.outdoor.R.layout.frm_notification);
      sKeys.put("layout/frm_question_0", brite.outdoor.R.layout.frm_question);
      sKeys.put("layout/frm_save_question_0", brite.outdoor.R.layout.frm_save_question);
      sKeys.put("layout/frm_search_location_0", brite.outdoor.R.layout.frm_search_location);
      sKeys.put("layout/frm_search_user_0", brite.outdoor.R.layout.frm_search_user);
      sKeys.put("layout/frm_search_utensils_0", brite.outdoor.R.layout.frm_search_utensils);
      sKeys.put("layout/frm_search_ver2_0", brite.outdoor.R.layout.frm_search_ver2);
      sKeys.put("layout/item_comment_question_0", brite.outdoor.R.layout.item_comment_question);
      sKeys.put("layout/item_commnet_hot_news_0", brite.outdoor.R.layout.item_commnet_hot_news);
      sKeys.put("layout/item_content_detail_hot_news_0", brite.outdoor.R.layout.item_content_detail_hot_news);
      sKeys.put("layout/item_frequent_question_0", brite.outdoor.R.layout.item_frequent_question);
      sKeys.put("layout/item_hot_news_0", brite.outdoor.R.layout.item_hot_news);
      sKeys.put("layout/item_image_content_block_0", brite.outdoor.R.layout.item_image_content_block);
      sKeys.put("layout/item_intro_0", brite.outdoor.R.layout.item_intro);
      sKeys.put("layout/item_list_post_location_0", brite.outdoor.R.layout.item_list_post_location);
      sKeys.put("layout/item_location_new_0", brite.outdoor.R.layout.item_location_new);
      sKeys.put("layout/item_location_or_untensil_shimmer_placerholder_0", brite.outdoor.R.layout.item_location_or_untensil_shimmer_placerholder);
      sKeys.put("layout/item_location_save_0", brite.outdoor.R.layout.item_location_save);
      sKeys.put("layout/item_my_page_0", brite.outdoor.R.layout.item_my_page);
      sKeys.put("layout/item_news_0", brite.outdoor.R.layout.item_news);
      sKeys.put("layout/item_news_ver2_0", brite.outdoor.R.layout.item_news_ver2);
      sKeys.put("layout/item_notification_0", brite.outdoor.R.layout.item_notification);
      sKeys.put("layout/item_notification_shimmer_placeholder_0", brite.outdoor.R.layout.item_notification_shimmer_placeholder);
      sKeys.put("layout/item_question_shimmer_placeholder_0", brite.outdoor.R.layout.item_question_shimmer_placeholder);
      sKeys.put("layout/item_reply_comment_hot_news_0", brite.outdoor.R.layout.item_reply_comment_hot_news);
      sKeys.put("layout/item_reply_comment_question_0", brite.outdoor.R.layout.item_reply_comment_question);
      sKeys.put("layout/item_report_0", brite.outdoor.R.layout.item_report);
      sKeys.put("layout/item_search_with_locate_or_tool_0", brite.outdoor.R.layout.item_search_with_locate_or_tool);
      sKeys.put("layout/layout_comment_hot_news_0", brite.outdoor.R.layout.layout_comment_hot_news);
      sKeys.put("layout/layout_dialog_bottom_item_frmhome_0", brite.outdoor.R.layout.layout_dialog_bottom_item_frmhome);
      sKeys.put("layout/progress_dialog_loading_0", brite.outdoor.R.layout.progress_dialog_loading);
    }
  }
}
