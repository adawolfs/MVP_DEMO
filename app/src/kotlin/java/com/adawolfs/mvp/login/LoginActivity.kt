package com.adawolfs.mvp.login

import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.adawolfs.mvp.R
import com.adawolfs.mvp.login.LoginInjector
import com.adawolfs.mvp.mvp.BaseMvpActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.contentView
import javax.inject.Inject

/**
 * Created by adawolfs on 1/20/17.
 */
class LoginActivity : BaseMvpActivity<LoginContract.View, LoginContract.Presenter>(),
        LoginContract.View, View.OnClickListener {

    @Inject
    lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoginInjector.inject(this)
        setContentView(R.layout.activity_login)
        button.setOnClickListener(this)
    }


    override fun hideProgress() {

    }

    override fun setUsernameError() {

    }

    override fun setPasswordError() {

    }

    override fun navigateToHome() {

    }

    override fun showProgress() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onClick(v: View?) {
        presenter?.validateCredentials(username.text.toString(), password.text.toString())
    }
}