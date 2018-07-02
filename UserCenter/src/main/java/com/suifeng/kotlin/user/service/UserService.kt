package com.suifeng.kotlin.user.service

import rx.Observable

/**
 * @author ljc
 * @data 2018/6/29
 * @describe
 */
interface UserService {
    fun register(mobile: String, verifyCode: String, pwd: String) : Observable<Boolean>
}