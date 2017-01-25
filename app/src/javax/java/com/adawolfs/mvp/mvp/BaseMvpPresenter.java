package com.adawolfs.mvp.mvp;

/**
 * Created by adawolfs on 1/20/17.
 */

public interface BaseMvpPresenter<V extends BaseMvpView> {

    void attachView(V view);

    void detachView();

    V getView();

}
