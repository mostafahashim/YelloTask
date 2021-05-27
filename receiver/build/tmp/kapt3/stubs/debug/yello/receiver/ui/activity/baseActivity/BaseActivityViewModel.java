package yello.receiver.ui.activity.baseActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001a"}, d2 = {"Lyello/receiver/ui/activity/baseActivity/BaseActivityViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Lyello/receiver/MyApplication;", "(Lyello/receiver/MyApplication;)V", "getApplication", "()Lyello/receiver/MyApplication;", "setApplication", "baseViewModelObserver", "Lyello/receiver/ui/activity/baseActivity/BaseActivityViewModel$BaseViewModelObserver;", "getBaseViewModelObserver", "()Lyello/receiver/ui/activity/baseActivity/BaseActivityViewModel$BaseViewModelObserver;", "setBaseViewModelObserver", "(Lyello/receiver/ui/activity/baseActivity/BaseActivityViewModel$BaseViewModelObserver;)V", "db", "Lyello/data/local/AppDatabase;", "getDb", "()Lyello/data/local/AppDatabase;", "setDb", "(Lyello/data/local/AppDatabase;)V", "onButtonAny2Clicked", "", "onButtonBackClicked", "onButtonMenuClicked", "onSearchClicked", "BaseViewModelObserver", "receiver_debug"})
public class BaseActivityViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private yello.receiver.MyApplication application;
    public yello.receiver.ui.activity.baseActivity.BaseActivityViewModel.BaseViewModelObserver baseViewModelObserver;
    @org.jetbrains.annotations.NotNull()
    private yello.data.local.AppDatabase db;
    
    public BaseActivityViewModel(@org.jetbrains.annotations.NotNull()
    yello.receiver.MyApplication application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final yello.receiver.MyApplication getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    yello.receiver.MyApplication p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final yello.receiver.ui.activity.baseActivity.BaseActivityViewModel.BaseViewModelObserver getBaseViewModelObserver() {
        return null;
    }
    
    public final void setBaseViewModelObserver(@org.jetbrains.annotations.NotNull()
    yello.receiver.ui.activity.baseActivity.BaseActivityViewModel.BaseViewModelObserver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final yello.data.local.AppDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    yello.data.local.AppDatabase p0) {
    }
    
    public final void onButtonBackClicked() {
    }
    
    public final void onButtonMenuClicked() {
    }
    
    public final void onButtonAny2Clicked() {
    }
    
    public final void onSearchClicked() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lyello/receiver/ui/activity/baseActivity/BaseActivityViewModel$BaseViewModelObserver;", "", "onAny1ButtonClicked", "", "onAny2ButtonClicked", "onBackButtonClicked", "onLoginAgain", "onMenuButtonClicked", "onRestartApp", "message", "", "onSearchClicked", "openLoginToUseFeature", "receiver_debug"})
    public static abstract interface BaseViewModelObserver {
        
        public abstract void onBackButtonClicked();
        
        public abstract void onMenuButtonClicked();
        
        public abstract void onAny1ButtonClicked();
        
        public abstract void onAny2ButtonClicked();
        
        public abstract void onSearchClicked();
        
        public abstract void onLoginAgain();
        
        public abstract void onRestartApp(int message);
        
        public abstract void openLoginToUseFeature();
    }
}