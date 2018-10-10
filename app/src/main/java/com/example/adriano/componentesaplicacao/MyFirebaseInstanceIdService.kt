package com.example.adriano.componentesaplicacao

import android.media.session.MediaSession
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceIdService :FirebaseInstanceIdService(){

    override fun onTokenRefresh() {
        super.onTokenRefresh()
        val token : String? = FirebaseInstanceId.getInstance().token
        Log.i("TOKEN", token)


    }

}