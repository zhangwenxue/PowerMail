package com.mm.powermail.mvp.accounts;

import com.mm.powermail.mvp.base.BasePresenter;
import com.mm.powermail.mvp.base.BaseView;

public interface AddAccountContract {
    interface Presenter extends BasePresenter {

    }

    interface View extends BaseView<Presenter> {
        String getEmailAddress();
        String getPsw();
        void onGettingAccountInfo();
        void onCheckingInboxServerInfo();
        void onCheckingOutboxServerInfo();
        void onError();
    }
}
