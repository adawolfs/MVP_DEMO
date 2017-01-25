package com.adawolfs.mvp_java.mvp

/**
 * Created by adawolfs on 1/20/17.
 */
interface BaseMvpPresenter<V: BaseMvpView>  {

    fun attachView(view: V)

    fun detachView()


    fun getView(): V?

}