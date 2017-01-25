package com.adawolfs.mvp_java.mvp;

import android.content.Context;
import android.support.annotation.StringRes;

/**
 * Created by adawolfs on 1/20/17.
 */

public interface BaseMvpView {

    Context getContext();

    void showError(String error);

    void showError(@StringRes int error);

    void showMessage(@StringRes int srtResId);

    void showMessage(String message);
}
