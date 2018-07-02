package com.suifeng.kotlin.user.presenter

import com.suifeng.kotlin.baselibrary.ext.execute
import com.suifeng.kotlin.baselibrary.presenter.BasePresenter
import com.suifeng.kotlin.baselibrary.rx.BaseSubscriber
import com.suifeng.kotlin.user.presenter.view.RegisterView
import com.suifeng.kotlin.user.service.impl.UserServiceImpl

/**
 * @author ljc
 * @data 2018/6/29
 * @describe
 */
class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register(mobileNumber: String, verifyCode: String, pwd: String) {
        val userService = UserServiceImpl()
        userService.register(mobileNumber, verifyCode, pwd)
                .execute(object : BaseSubscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mView.onRegisterResult(t)
                    }
                })
    }
}