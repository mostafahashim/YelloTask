package yello.receiver.ui.activity.baseActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b&\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rJ\u0012\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0010\u0010L\u001a\u00020I2\u0006\u0010M\u001a\u00020NH\u0014J\u0010\u0010O\u001a\u00020I2\b\u0010P\u001a\u0004\u0018\u000107J\u0006\u0010Q\u001a\u00020IJ\u0012\u0010R\u001a\u00020I2\b\u0010S\u001a\u0004\u0018\u00010TH$J\b\u0010U\u001a\u00020IH\u0016J\b\u0010V\u001a\u00020IH\u0003J\b\u0010W\u001a\u00020IH\u0003J#\u0010X\u001a\u00020\u00052\b\u0010Y\u001a\u0004\u0018\u00010N2\f\u0010Z\u001a\b\u0012\u0004\u0012\u0002070[\u00a2\u0006\u0002\u0010\\J\u000e\u0010]\u001a\u00020I2\u0006\u0010^\u001a\u00020_J\r\u0010`\u001a\u00020IH\u0000\u00a2\u0006\u0002\baJ\b\u0010b\u001a\u00020IH&J\b\u0010c\u001a\u00020IH\u0002J\b\u0010d\u001a\u00020IH\u0016J\u0012\u0010e\u001a\u00020I2\b\u0010f\u001a\u0004\u0018\u00010TH\u0014J+\u0010g\u001a\u00020I2\u0006\u0010h\u001a\u00020\u00032\f\u0010Z\u001a\b\u0012\u0004\u0012\u0002070[2\u0006\u0010i\u001a\u00020jH\u0016\u00a2\u0006\u0002\u0010kJ\u0006\u0010l\u001a\u00020IJ\u000e\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020\u0003J\r\u0010p\u001a\u00020IH\u0000\u00a2\u0006\u0002\bqJ\u000e\u0010r\u001a\u00020I2\u0006\u0010s\u001a\u00020\u0003J\u000e\u0010t\u001a\u00020I2\u0006\u0010u\u001a\u00020\u0005J\u000e\u0010v\u001a\u00020I2\u0006\u0010u\u001a\u00020\u0005J\u000e\u0010w\u001a\u00020I2\u0006\u0010u\u001a\u00020\u0005J\u0006\u0010x\u001a\u00020IJ\u000e\u0010y\u001a\u00020I2\u0006\u0010z\u001a\u00020\u0003J\u0016\u0010{\u001a\u00020I2\u0006\u0010|\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010}\u001a\u00020I2\u0006\u0010~\u001a\u00020\u0003JP\u0010.\u001a\u00020I2\u0006\u0010\u007f\u001a\u00020\u00052\u0007\u0010\u0080\u0001\u001a\u0002072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0007\u0010\u0081\u0001\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u0010\u0010\u0082\u0001\u001a\u00020I2\u0007\u0010\u0083\u0001\u001a\u00020\u0005J\u0010\u0010\u0084\u0001\u001a\u00020I2\u0007\u0010\u0080\u0001\u001a\u000207J\t\u0010\u0085\u0001\u001a\u00020IH&J\u000f\u0010\u0086\u0001\u001a\u00020I2\u0006\u0010u\u001a\u00020\u0005J\u000f\u0010\u0087\u0001\u001a\u00020I2\u0006\u0010u\u001a\u00020\u0005J\u0017\u0010\u0088\u0001\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000f\u0010\u0089\u0001\u001a\u00020IH\u0000\u00a2\u0006\u0003\b\u008a\u0001J!\u0010\u008b\u0001\u001a\u00020I2\u0007\u0010\u008c\u0001\u001a\u00020\u00052\u0007\u0010\u0080\u0001\u001a\u0002072\u0006\u0010s\u001a\u000207J\u0010\u0010\u008d\u0001\u001a\u00020I2\u0007\u0010\u008c\u0001\u001a\u00020\u0005J\u000f\u0010\u008e\u0001\u001a\u00020I2\u0006\u0010^\u001a\u00020_J\t\u0010\u008f\u0001\u001a\u00020IH\u0002J\u0007\u0010\u0090\u0001\u001a\u00020IR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u0003X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015R+\u00100\u001a\u00020/2\u0006\u0010\u0016\u001a\u00020/8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b5\u0010\u001e\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00106\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0013\"\u0004\bA\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0013\"\u0004\bC\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0013\"\u0004\bE\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0013\"\u0004\bG\u0010\u0015\u00a8\u0006\u0091\u0001"}, d2 = {"Lyello/receiver/ui/activity/baseActivity/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "activityTitleId", "", "showSideTitle", "", "showCenterTitle", "drawHeader", "showBack", "showMenu", "showLogo", "showSearch", "appBarWhite", "(IZZZZZZZZ)V", "getActivityTitleId", "()I", "setActivityTitleId", "(I)V", "getAppBarWhite", "()Z", "setAppBarWhite", "(Z)V", "<set-?>", "Lyello/receiver/MyApplication;", "application", "getApplication", "()Lyello/receiver/MyApplication;", "setApplication", "(Lyello/receiver/MyApplication;)V", "application$delegate", "Lkotlin/properties/ReadWriteProperty;", "baseBinding", "Lyello/receiver/databinding/ActivityBaseBinding;", "getBaseBinding", "()Lyello/receiver/databinding/ActivityBaseBinding;", "setBaseBinding", "(Lyello/receiver/databinding/ActivityBaseBinding;)V", "baseViewModelObserver", "Lyello/receiver/ui/activity/baseActivity/BaseActivityViewModel$BaseViewModelObserver;", "getBaseViewModelObserver", "()Lyello/receiver/ui/activity/baseActivity/BaseActivityViewModel$BaseViewModelObserver;", "setBaseViewModelObserver", "(Lyello/receiver/ui/activity/baseActivity/BaseActivityViewModel$BaseViewModelObserver;)V", "callPermissionRequest", "getCallPermissionRequest$receiver_debug", "getDrawHeader", "setDrawHeader", "Landroid/view/inputmethod/InputMethodManager;", "imm", "getImm", "()Landroid/view/inputmethod/InputMethodManager;", "setImm", "(Landroid/view/inputmethod/InputMethodManager;)V", "imm$delegate", "number", "", "getNumber", "()Ljava/lang/String;", "setNumber", "(Ljava/lang/String;)V", "getShowBack", "setShowBack", "getShowCenterTitle", "setShowCenterTitle", "getShowLogo", "setShowLogo", "getShowMenu", "setShowMenu", "getShowSearch", "setShowSearch", "getShowSideTitle", "setShowSideTitle", "applyOverrideConfiguration", "", "overrideConfiguration", "Landroid/content/res/Configuration;", "attachBaseContext", "newBase", "Landroid/content/Context;", "callMobile", "Number", "closeMenu", "doOnCreate", "arg0", "Landroid/os/Bundle;", "finish_activity", "forceLTRIfSupported", "forceRTLIfSupported", "hasPermissions", "context", "permissions", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "hideKeyPad", "view", "Landroid/view/View;", "initializeSlideMenu", "initializeSlideMenu$receiver_debug", "initializeViews", "liveDataObservers", "onBackPressed", "onCreate", "savedInstanceState", "onRequestPermissionsResult", "requestCode", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openMenu", "putContentView", "Landroidx/databinding/ViewDataBinding;", "activityLayout", "requestReceiveSMSPermission", "requestReceiveSMSPermission$receiver_debug", "restartApp", "message", "setActionBarVisibilty", "isVisible", "setAnyIcon1NotifyVisibility", "setAnyIcon1Visibility", "setAppBarGradient", "setAppBarlightAndStatusBarDark", "color", "setBackIconVisibility", "isShowBackIcon", "setCenterTitleGravity", "gravity", "showHeader", "title", "showNotification", "setDrawerState", "isEnabled", "setHeaderTitle", "setListener", "setLogoVisibility", "setMenuIconVisibility", "setTitlesVisibility", "setTranslucentAppBar", "setTranslucentAppBar$receiver_debug", "showHideMessageDialog", "isShow", "showHideProgressDialog", "showKeyPad", "updateAndroidSecurityProvider", "updateLocale", "receiver_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private int activityTitleId;
    private boolean showSideTitle;
    private boolean showCenterTitle;
    private boolean drawHeader;
    private boolean showBack;
    private boolean showMenu;
    private boolean showLogo;
    private boolean showSearch;
    private boolean appBarWhite;
    @org.jetbrains.annotations.NotNull()
    private yello.receiver.ui.activity.baseActivity.BaseActivityViewModel.BaseViewModelObserver baseViewModelObserver;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty application$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty imm$delegate = null;
    public yello.receiver.databinding.ActivityBaseBinding baseBinding;
    private final int callPermissionRequest = 4;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String number = "";
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity(int activityTitleId, boolean showSideTitle, boolean showCenterTitle, boolean drawHeader, boolean showBack, boolean showMenu, boolean showLogo, boolean showSearch, boolean appBarWhite) {
        super();
    }
    
    public final int getActivityTitleId() {
        return 0;
    }
    
    public final void setActivityTitleId(int p0) {
    }
    
    public final boolean getShowSideTitle() {
        return false;
    }
    
    public final void setShowSideTitle(boolean p0) {
    }
    
    public final boolean getShowCenterTitle() {
        return false;
    }
    
    public final void setShowCenterTitle(boolean p0) {
    }
    
    public final boolean getDrawHeader() {
        return false;
    }
    
    public final void setDrawHeader(boolean p0) {
    }
    
    public final boolean getShowBack() {
        return false;
    }
    
    public final void setShowBack(boolean p0) {
    }
    
    public final boolean getShowMenu() {
        return false;
    }
    
    public final void setShowMenu(boolean p0) {
    }
    
    public final boolean getShowLogo() {
        return false;
    }
    
    public final void setShowLogo(boolean p0) {
    }
    
    public final boolean getShowSearch() {
        return false;
    }
    
    public final void setShowSearch(boolean p0) {
    }
    
    public final boolean getAppBarWhite() {
        return false;
    }
    
    public final void setAppBarWhite(boolean p0) {
    }
    
    protected abstract void doOnCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle arg0);
    
    public abstract void initializeViews();
    
    public abstract void setListener();
    
    public final void updateLocale() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final yello.receiver.ui.activity.baseActivity.BaseActivityViewModel.BaseViewModelObserver getBaseViewModelObserver() {
        return null;
    }
    
    public final void setBaseViewModelObserver(@org.jetbrains.annotations.NotNull()
    yello.receiver.ui.activity.baseActivity.BaseActivityViewModel.BaseViewModelObserver p0) {
    }
    
    public final void restartApp(int message) {
    }
    
    private final void liveDataObservers() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final yello.receiver.MyApplication getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    yello.receiver.MyApplication p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.inputmethod.InputMethodManager getImm() {
        return null;
    }
    
    public final void setImm(@org.jetbrains.annotations.NotNull()
    android.view.inputmethod.InputMethodManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final yello.receiver.databinding.ActivityBaseBinding getBaseBinding() {
        return null;
    }
    
    public final void setBaseBinding(@org.jetbrains.annotations.NotNull()
    yello.receiver.databinding.ActivityBaseBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ViewDataBinding putContentView(int activityLayout) {
        return null;
    }
    
    private final void updateAndroidSecurityProvider() {
    }
    
    public final void setBackIconVisibility(boolean isShowBackIcon, boolean appBarWhite) {
    }
    
    public final void setMenuIconVisibility(boolean isVisible) {
    }
    
    public final void setLogoVisibility(boolean isVisible) {
    }
    
    public final void setAnyIcon1Visibility(boolean isVisible) {
    }
    
    public final void setAnyIcon1NotifyVisibility(boolean isVisible) {
    }
    
    public final void setActionBarVisibilty(boolean isVisible) {
    }
    
    public final void setTranslucentAppBar$receiver_debug() {
    }
    
    public final void setHeaderTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void setTitlesVisibility(boolean showSideTitle, boolean showCenterTitle) {
    }
    
    public final void setDrawHeader(boolean showHeader, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean showSideTitle, boolean showCenterTitle, boolean showBack, boolean showLogo, boolean showMenu, boolean showNotification, boolean appBarWhite) {
    }
    
    public final void setCenterTitleGravity(int gravity) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void initializeSlideMenu$receiver_debug() {
    }
    
    public final void setDrawerState(boolean isEnabled) {
    }
    
    public final void closeMenu() {
    }
    
    public final void openMenu() {
    }
    
    public final void setAppBarlightAndStatusBarDark(int color) {
    }
    
    public final void setAppBarGradient() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    private final void forceRTLIfSupported() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    private final void forceLTRIfSupported() {
    }
    
    @java.lang.Override()
    public void applyOverrideConfiguration(@org.jetbrains.annotations.Nullable()
    android.content.res.Configuration overrideConfiguration) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context newBase) {
    }
    
    public final int getCallPermissionRequest$receiver_debug() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumber() {
        return null;
    }
    
    public final void setNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void callMobile(@org.jetbrains.annotations.Nullable()
    java.lang.String Number) {
    }
    
    public final void requestReceiveSMSPermission$receiver_debug() {
    }
    
    public final boolean hasPermissions(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public void finish_activity() {
    }
    
    public final void hideKeyPad(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void showKeyPad(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void showHideProgressDialog(boolean isShow) {
    }
    
    public final void showHideMessageDialog(boolean isShow, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
}