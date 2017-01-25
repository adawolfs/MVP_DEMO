package com.adawolfs.mvp.mvp;

/**
 * Created by adawolfs on 1/20/17.
 */

public class BaseMvpPresenterImpl<V extends BaseMvpView> implements BaseMvpPresenter<V> {

    private V mView = null;

    @Override
    public void attachView(V view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    @Override
    public V getView() {
        return mView;
    }
}
