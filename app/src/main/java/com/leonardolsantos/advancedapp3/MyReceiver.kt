package com.leonardolsantos.advancedapp3

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        println("Grupo 2 na área")
        Toast.makeText(context, "Grupo 2 na Area.", Toast.LENGTH_LONG).show()
    }
}