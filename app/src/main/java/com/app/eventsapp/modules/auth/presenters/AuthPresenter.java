package com.app.eventsapp.modules.auth.presenters;

import android.content.Context;

import com.app.eventsapp.core.base.BaseFragmentPresenter;
import com.app.eventsapp.modules.auth.views.AuthFragmentView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/**
 * Created by Grigory Kalyashov on 19.02.2017.
 */

public interface AuthPresenter extends BaseFragmentPresenter<AuthFragmentView>
{
    void saveUserData(GoogleSignInAccount account, Context context);
}
