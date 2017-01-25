package com.adawolfs.mvp.mvp

/**
 * Created by adawolfs on 1/20/17.
 */
interface BaseMvpPresenter<V: BaseMvpView>  {

    fun attachView(view: V)

    fun detachView()


    fun getView(): V?

}