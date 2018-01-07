package com.mm.powermail.mvp.base;



public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}
