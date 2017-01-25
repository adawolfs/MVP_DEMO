package com.adawolfs.mvp_java.login;

import com.adawolfs.mvp_java.mvp.BaseMvpInteractor;
import com.adawolfs.mvp_java.mvp.BaseMvpView;
import com.adawolfs.mvp_java.mvp.BaseMvpPresenter;

import javax.inject.Inject;

import static android.R.attr.name;

/**
 * Created by adawolfs on 1/20/17.
 */

public class LoginContract {


    interface View extends BaseMvpView {

        void showProgress();

        void hideProgress();

        void setUsernameError();

        void setPasswordError();

        void navigateToHome();

    }

    interface Presenter extends BaseMvpPresenter<View> {
        void validateCredentials(String user, String password);
    }

    interface Interactor extends BaseMvpInteractor{
        void login(String user, String password);
    }

}
