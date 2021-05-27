package yello.receiver.ui.activity.baseActivity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016\u00a2\u0006\u0002\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lyello/receiver/ui/activity/baseActivity/BaseViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "application", "Lyello/receiver/MyApplication;", "(Lyello/receiver/MyApplication;)V", "getApplication", "()Lyello/receiver/MyApplication;", "setApplication", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "receiver_debug"})
public final class BaseViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
    @org.jetbrains.annotations.NotNull()
    private yello.receiver.MyApplication application;
    
    public BaseViewModelFactory(@org.jetbrains.annotations.NotNull()
    yello.receiver.MyApplication application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final yello.receiver.MyApplication getApplication() {
        return null;
    }
    
    public final void setApplication(@org.jetbrains.annotations.NotNull()
    yello.receiver.MyApplication p0) {
    }
    
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}