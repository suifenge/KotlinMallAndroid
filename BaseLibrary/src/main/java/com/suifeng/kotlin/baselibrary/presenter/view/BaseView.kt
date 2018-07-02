package com.suifeng.kotlin.baselibrary.presenter.view

/**
 * @author ljc
 * @data 2018/6/29
 * @describe
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError()
}