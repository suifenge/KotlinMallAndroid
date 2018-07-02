package com.suifeng.kotlin.user.ui.activity

import android.os.Bundle
import com.suifeng.kotlin.baselibrary.ui.activity.BaseMvpActivity
import com.suifeng.kotlin.user.R
import com.suifeng.kotlin.user.presenter.RegisterPresenter
import com.suifeng.kotlin.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

/**
 * @author ljc
 * @data 2018/6/29
 * @describe
 */
class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter = RegisterPresenter()
        mPresenter.mView = this
        mRegisterBtn.setOnClickListener {
            mPresenter.register("", "", "")
        }
    }

    override fun onRegisterResult(result: Boolean) {
        toast(if(result) "注册成功" else "注册失败")
    }

}