package com.king.corp.sharex.core;


public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);

    void onDetach();

    void handleApiError(Exception error);

    void setUserAsLoggedOut();
}
