package com.adawolfs.mvp.mvp

/**
 * Created by adawolfs on 1/20/17.
 */
open class BaseMvpPresenterImpl<V : BaseMvpView>(view: V) : BaseMvpPresenter<V> {

    private var mView : V? = view

    override fun attachView(view: V) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }

    override fun getView(): V? {
        return mView
    }

}