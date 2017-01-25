package com.adawolfs.mvp_java.mvp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.toast

/**
 * Created by adawolfs on 1/20/17.
 */

abstract class BaseMvpActivity<V : BaseMvpView, P : BaseMvpPresenter<V>> :
        AppCompatActivity(),  BaseMvpView {

    override fun getContext(): Context {
        return this
    }

    override fun showError(error: String) {
        toast(error)
    }

    override fun showError(error: Int) {
        toast(error)
    }

    override fun showMessage(srtResId: Int) {
        toast(srtResId)
    }

    override fun showMessage(message: String) {
        toast(message)
    }

}