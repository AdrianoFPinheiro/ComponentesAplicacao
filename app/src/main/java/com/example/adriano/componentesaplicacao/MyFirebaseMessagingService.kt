package com.example.adriano.componentesaplicacao

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService(){

    override fun onMessageReceived(p0: RemoteMessage?) {
        super.onMessageReceived(p0)
        Log.d( "NOTIFICAÇÃO_TITULO ", p0?.notification?.title)
        Log.d( "NOTIFICAÇÃO_BODY ",p0?.notification?.body)

        NotificationUtils.showNotification(this,
                                           123456,
                                           "PUSH",
                                           "PUSH",
                                           p0?.notification?.title!!,
                                           p0?.notification?.body!!)
    }

}