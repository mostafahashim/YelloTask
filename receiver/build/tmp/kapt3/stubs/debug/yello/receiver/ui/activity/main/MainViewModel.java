package yello.receiver.ui.activity.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u000200H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R.\u0010\'\u001a\u0016\u0012\u0004\u0012\u00020)\u0018\u00010(j\n\u0012\u0004\u0012\u00020)\u0018\u0001`*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u00063"}, d2 = {"Lyello/receiver/ui/activity/main/MainViewModel;", "Lyello/receiver/ui/activity/baseActivity/BaseActivityViewModel;", "application", "Lyello/receiver/MyApplication;", "(Lyello/receiver/MyApplication;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setCompositeDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "connectionErrorMessage", "", "getConnectionErrorMessage", "()Ljava/lang/String;", "setConnectionErrorMessage", "(Ljava/lang/String;)V", "isShowNoData", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "setShowNoData", "(Landroidx/lifecycle/MutableLiveData;)V", "observer", "Lyello/receiver/ui/activity/main/MainViewModel$Observer;", "getObserver", "()Lyello/receiver/ui/activity/main/MainViewModel$Observer;", "setObserver", "(Lyello/receiver/ui/activity/main/MainViewModel$Observer;)V", "recyclerUserAdapter", "Lyello/receiver/ui/adapter/RecyclerUserAdapter;", "getRecyclerUserAdapter", "()Lyello/receiver/ui/adapter/RecyclerUserAdapter;", "setRecyclerUserAdapter", "(Lyello/receiver/ui/adapter/RecyclerUserAdapter;)V", "userModelDAO", "Lyello/data/local/UserModelDAO;", "getUserModelDAO", "()Lyello/data/local/UserModelDAO;", "userModels", "Ljava/util/ArrayList;", "Lyello/data/model/UserModel;", "Lkotlin/collections/ArrayList;", "getUserModels", "()Ljava/util/ArrayList;", "setUserModels", "(Ljava/util/ArrayList;)V", "getLocalUsers", "", "onCleared", "Observer", "receiver_debug"})
public final class MainViewModel extends yello.receiver.ui.activity.baseActivity.BaseActivityViewModel {
    public yello.receiver.ui.activity.main.MainViewModel.Observer observer;
    @org.jetbrains.annotations.NotNull()
    private final yello.data.local.UserModelDAO userModelDAO = null;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowNoData;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String connectionErrorMessage = "";
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<yello.data.model.UserModel> userModels;
    @org.jetbrains.annotations.NotNull()
    private yello.receiver.ui.adapter.RecyclerUserAdapter recyclerUserAdapter;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    yello.receiver.MyApplication application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final yello.receiver.ui.activity.main.MainViewModel.Observer getObserver() {
        return null;
    }
    
    public final void setObserver(@org.jetbrains.annotations.NotNull()
    yello.receiver.ui.activity.main.MainViewModel.Observer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final yello.data.local.UserModelDAO getUserModelDAO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public final void setCompositeDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isShowNoData() {
        return null;
    }
    
    public final void setShowNoData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getConnectionErrorMessage() {
        return null;
    }
    
    public final void setConnectionErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<yello.data.model.UserModel> getUserModels() {
        return null;
    }
    
    public final void setUserModels(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<yello.data.model.UserModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final yello.receiver.ui.adapter.RecyclerUserAdapter getRecyclerUserAdapter() {
        return null;
    }
    
    public final void setRecyclerUserAdapter(@org.jetbrains.annotations.NotNull()
    yello.receiver.ui.adapter.RecyclerUserAdapter p0) {
    }
    
    public final void getLocalUsers() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lyello/receiver/ui/activity/main/MainViewModel$Observer;", "", "receiver_debug"})
    public static abstract interface Observer {
    }
}