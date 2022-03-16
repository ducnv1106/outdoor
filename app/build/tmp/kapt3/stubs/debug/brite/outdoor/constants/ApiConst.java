package brite.outdoor.constants;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lbrite/outdoor/constants/ApiConst;", "", "()V", "Companion", "app_debug"})
public final class ApiConst {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String API_KEY = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API = "api_key";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_VERSION = "1";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_DEVICE_TYPE = "device_type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_DEVICE_UUID = "device_uuid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_VERSION = "11";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ANDROID = "2";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_TOKEN = "token";
    public static final int HTTP_OK = 200;
    public static final int HTTP_ERROR_TOKEN = 402;
    public static final int HTTP_ERROR_DELETED_POST = 407;
    public static final int HTTP_ERROR_DELETED_COMMENT = 408;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DOMAIN_NAME = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LOGIN_GG_END_POINT = "v11/userLogin/loginWithGoogle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LOGIN_FB_END_POINT = "v11/userLogin/loginWithFacebook";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LOGOUT_END_POINT = "v11/userLogin/logout";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_LOCATION_END_POINT = "v11/user/listLocation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_UTENSILS_END_POINT = "v11/user/listUtensils";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_POST_LIKES = "v11/post/postLikes";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_POST_SHARES = "v11/post/postShare";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_POST_COMMENT = "v11/post/postComment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_PUSH_POST = "v11/post/create";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_SEARCH_LOCATIONS = "v11/post/searchLocation";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_SEARCH_UTENSILS = "v11/post/searchUtensil";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_REGISTER_TOKEN_PUSH = "v11/user/registerTokenPush/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_COMMENT = "v11/post/listComment/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_COMMENT_LEVEL_2 = "v11/post/listCommentLvl2/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_FOLLOW_END_POINT = "v11/user/follow";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DETAIL_POST = "v11/post/detailPost/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_POST_USER_END_POINT = "v11/post/listPostsOfUser";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_BOOKMARK = "v11/user/bookmark";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DETAIL = "v11/user/detail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_POST_USER_FOLLOW = "v11/post/listPostUserFollow";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_BOOK_MARK = "v11/user/listBookMark";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_UNBOOKMARK = "v11/user/unBookmark/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_POST_HOT = "v11/post/listPostHot";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_POST_NEW = "v11/post/listPostNew";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_SEARCH_USER = "v11/user/searchUser";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_REPORT = "v11/post/reportPost";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_HIDE_POST = "v11/post/hidePosts";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DELETE_POST = "v11/post/deletePost/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CREATE_HASH = "v11/UserLogin/createHash";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CANCEL_MERGE_TO_CREATE_NEW_ACCOUNT = "v11/UserLogin/createNewAccount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CHECK_CODE_HASH = "v11/UserLogin/checkCode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_MERGE_ACCOUNT = "v11/UserLogin/mergeAcount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CANCEL_MERGE_ACCOUNT = "v11/UserLogin/cancelMerge";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_POST_LOCATION = "v11/post/listPostByLocationsId/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_POST_UTENSILS = "v11/post/listPostByUtensilId/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_DELETE_COMMENT = "v11/post/deleteComment/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_FOLLOW = "v11/user/listFollow";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_NOTIFICATION = "v11/notification/index";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_FOLLOWER = "v11/user/listFollower";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_EDIT_POST = "v11/post/edit/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_NOTIFICATION_UNREAD = "v11/notification/countNotiUnread/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_QUESTION = "v11/Question/listQuestion";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CREATE_QUESTION = "v11/Question/create";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_QUESTION_LIKE = "v11/Question/like";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_BOOKMARK_QUESTION = "v11/Question/bookmark";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DELETE_QUESTION = "v11/Question/delete/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_ANSWER_QUESTION = "v11/Question/listAnser/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_ANSWER_QUESTION = "v11/Question/answer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_EDIT_QUESTION = "v11/Question/edit/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DELETE_ANSWER_QUESTION = "v11/Question/deleteAnswer/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_REPLY_ANSWER_QUESTION = "v11/Question/listAnserLvl2/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DETAIL_QUESTION = "v11/Question/detail/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_CAMPING = "v11/Camping/listCamping";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_CREATE_CAMPING = "v11/Camping/create";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DELETE_CAMPING = "v11/Camping/delete/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_CADASTRALS = "v11/user/listCadastrals";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_POST_HOT_NEWS = "v11/Hotnews/listHotNews";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DETAIL_POST_HOT_NEWS = "v11/Hotnews/detail/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_POST_HOT_NEWS_LIKE = "v11/Hotnews/like";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_POST_HOT_NEWS_SHARES = "v11/Hotnews/share";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_COMMENT_HOT_NEWS = "v11/Hotnews/listComment/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_DELETE_COMMENT_HOT_NEWS = "v11/Hotnews/deleteComment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_POST_COMMENT_HOT_NEWS = "v11/Hotnews/comment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_LIST_REPLY_COMMENT_HOT_NEWS = "v11/Hotnews/listCommentLvl2/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_SOCIAL_ID = "social_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_ACCESS_TOKEN = "access_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_TYPE_SOCIAL = "type_social";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_CODE_HASH = "code_hash";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_TOKEN = "token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_TITLE = "title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_CONTENT = "content";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_LOCATION_ID = "location_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_HASHTAG_ID = "hashtag_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_UTENSIL_ID = "utensil_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_LOCATION_NAME = "location_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_LOCATION_ADDRESS = "location_address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_LAT = "lat";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_LNG = "lng";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_UTENSIL_NAME = "utensil_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_HASHTAG_NAME = "hashtag_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_IMG_DELETE = "img_delete";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_TYPE_PUSH_POST = "type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_CONTENT_KEY_DEL = "content_key_del";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_SEARCH = "key_word";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_LAST_SYNC = "last_sync";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_FIREBASE_TOKEN = "firebase_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_IMAGE = "image";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_TYPE_VIDEO = "type_video";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_USER_ID = "user_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_FOLLOW_ID = "follower_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_POST_ID = "post_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_PAGE = "page";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_LASTEST_ID = "lastest_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_LASTEST_CINDEX = "lastest_cIndex";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_HOT_NEWS_ID = "hot_news_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_BOOKMARK_ID = "id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_LIMIT = "limit";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_COMMENT = "comment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_PARENT_ID = "parent_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_THREAD_ID = "thread_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_REPLY_ID = "reply_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_API_COMMENT_ID = "comment_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_REPORT_REASON = "reason";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_LANGUAGE = "language";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_TYPE = "type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_QUESTION_ID = "question_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_NOTE = "note";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_TIME = "time";
    @org.jetbrains.annotations.NotNull()
    public static final brite.outdoor.constants.ApiConst.Companion Companion = null;
    
    public ApiConst() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bG\n\u0002\u0010\b\n\u0002\b5\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010I\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u001dR\u000e\u0010K\u001a\u00020LX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020LX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020LX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020LX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0081\u0001"}, d2 = {"Lbrite/outdoor/constants/ApiConst$Companion;", "", "()V", "ANDROID", "", "API_ANSWER_QUESTION", "API_BOOKMARK", "API_BOOKMARK_QUESTION", "API_CANCEL_MERGE_ACCOUNT", "API_CANCEL_MERGE_TO_CREATE_NEW_ACCOUNT", "API_CHECK_CODE_HASH", "API_CREATE_CAMPING", "API_CREATE_HASH", "API_CREATE_QUESTION", "API_DELETE_ANSWER_QUESTION", "API_DELETE_CAMPING", "API_DELETE_COMMENT_HOT_NEWS", "API_DELETE_POST", "API_DELETE_QUESTION", "API_DETAIL", "API_DETAIL_POST", "API_DETAIL_POST_HOT_NEWS", "API_DETAIL_QUESTION", "API_EDIT_POST", "API_EDIT_QUESTION", "API_FOLLOW_END_POINT", "API_HIDE_POST", "API_KEY", "getAPI_KEY", "()Ljava/lang/String;", "API_LIST_ANSWER_QUESTION", "API_LIST_BOOK_MARK", "API_LIST_CADASTRALS", "API_LIST_CAMPING", "API_LIST_COMMENT", "API_LIST_COMMENT_HOT_NEWS", "API_LIST_COMMENT_LEVEL_2", "API_LIST_DELETE_COMMENT", "API_LIST_FOLLOW", "API_LIST_FOLLOWER", "API_LIST_LOCATION_END_POINT", "API_LIST_NOTIFICATION", "API_LIST_POST_HOT", "API_LIST_POST_HOT_NEWS", "API_LIST_POST_LOCATION", "API_LIST_POST_NEW", "API_LIST_POST_USER_END_POINT", "API_LIST_POST_USER_FOLLOW", "API_LIST_POST_UTENSILS", "API_LIST_QUESTION", "API_LIST_REPLY_ANSWER_QUESTION", "API_LIST_REPLY_COMMENT_HOT_NEWS", "API_LIST_SEARCH_USER", "API_LIST_UTENSILS_END_POINT", "API_LOGIN_FB_END_POINT", "API_LOGIN_GG_END_POINT", "API_LOGOUT_END_POINT", "API_MERGE_ACCOUNT", "API_NOTIFICATION_UNREAD", "API_POST_COMMENT", "API_POST_COMMENT_HOT_NEWS", "API_POST_HOT_NEWS_LIKE", "API_POST_HOT_NEWS_SHARES", "API_POST_LIKES", "API_POST_SHARES", "API_PUSH_POST", "API_QUESTION_LIKE", "API_REGISTER_TOKEN_PUSH", "API_REPORT", "API_SEARCH_LOCATIONS", "API_SEARCH_UTENSILS", "API_UNBOOKMARK", "API_VERSION", "DOMAIN_NAME", "getDOMAIN_NAME", "HTTP_ERROR_DELETED_COMMENT", "", "HTTP_ERROR_DELETED_POST", "HTTP_ERROR_TOKEN", "HTTP_OK", "PARAM_API", "PARAM_API_ACCESS_TOKEN", "PARAM_API_BOOKMARK_ID", "PARAM_API_CODE_HASH", "PARAM_API_COMMENT", "PARAM_API_COMMENT_ID", "PARAM_API_CONTENT", "PARAM_API_FIREBASE_TOKEN", "PARAM_API_FOLLOW_ID", "PARAM_API_HASHTAG_ID", "PARAM_API_HASHTAG_NAME", "PARAM_API_HOT_NEWS_ID", "PARAM_API_IMG_DELETE", "PARAM_API_LASTEST_CINDEX", "PARAM_API_LASTEST_ID", "PARAM_API_LAST_SYNC", "PARAM_API_LAT", "PARAM_API_LIMIT", "PARAM_API_LNG", "PARAM_API_LOCATION_ADDRESS", "PARAM_API_LOCATION_ID", "PARAM_API_LOCATION_NAME", "PARAM_API_PAGE", "PARAM_API_PARENT_ID", "PARAM_API_POST_ID", "PARAM_API_REPLY_ID", "PARAM_API_SEARCH", "PARAM_API_SOCIAL_ID", "PARAM_API_THREAD_ID", "PARAM_API_TITLE", "PARAM_API_TOKEN", "PARAM_API_TYPE_PUSH_POST", "PARAM_API_TYPE_SOCIAL", "PARAM_API_USER_ID", "PARAM_API_UTENSIL_ID", "PARAM_API_UTENSIL_NAME", "PARAM_API_VERSION", "PARAM_CONTENT_KEY_DEL", "PARAM_DEVICE_TYPE", "PARAM_DEVICE_UUID", "PARAM_IMAGE", "PARAM_LANGUAGE", "PARAM_NOTE", "PARAM_QUESTION_ID", "PARAM_REPORT_REASON", "PARAM_TIME", "PARAM_TOKEN", "PARAM_TYPE", "PARAM_TYPE_VIDEO", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAPI_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDOMAIN_NAME() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}