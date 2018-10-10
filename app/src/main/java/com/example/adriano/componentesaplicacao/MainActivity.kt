package com.example.adriano.componentesaplicacao

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(){

    //val notificationTime = Calendar.getInstance().timeInMillis + 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            val alarmeManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            val alarmeIntent = Intent(this, AlarmeReceiver::class.java)
            alarmeIntent.putExtra("MSG2", "Msg Main Activity")

            val pendingIntent = PendingIntent.getBroadcast(this, 0, alarmeIntent, PendingIntent.FLAG_CANCEL_CURRENT)

            alarmeManager.set(AlarmManager.RTC_WAKEUP, Calendar.getInstance().timeInMillis + 5000, pendingIntent)

        }

        button2.setOnClickListener{
             NotificationUtils.showNotification(this,
                                                1234,
                                                "CHANNEL_BOTAO_DOIS",
                                                "CHANNEL_BOTAO_DOIS_NAME",
                                                "Hello notification",
                                                "Este é o primeiro exemplo")


        }
    }
}
