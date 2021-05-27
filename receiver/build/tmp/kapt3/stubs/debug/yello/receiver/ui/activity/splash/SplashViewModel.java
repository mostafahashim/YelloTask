package yello.receiver.ui.activity.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lyello/receiver/ui/activity/splash/SplashViewModel;", "Lyello/receiver/ui/activity/baseActivity/BaseActivityViewModel;", "application", "Lyello/receiver/MyApplication;", "(Lyello/receiver/MyApplication;)V", "observer", "Lyello/receiver/ui/activity/splash/SplashViewModel$Observer;", "getObserver", "()Lyello/receiver/ui/activity/splash/SplashViewModel$Observer;", "setObserver", "(Lyello/receiver/ui/activity/splash/SplashViewModel$Observer;)V", "onCleared", "", "Observer", "receiver_debug"})
public final class SplashViewModel extends yello.receiver.ui.activity.baseActivity.BaseActivityViewModel {
    public yello.receiver.ui.activity.splash.SplashViewModel.Observer observer;
    
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    yello.receiver.MyApplication application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final yello.receiver.ui.activity.splash.SplashViewModel.Observer getObserver() {
        return null;
    }
    
    public final void setObserver(@org.jetbrains.annotations.NotNull()
    yello.receiver.ui.activity.splash.SplashViewModel.Observer p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lyello/receiver/ui/activity/splash/SplashViewModel$Observer;", "", "openMainScreen", "", "receiver_debug"})
    public static abstract interface Observer {
        
        public abstract void openMainScreen();
    }
}