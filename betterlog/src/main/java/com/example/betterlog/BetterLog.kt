package com.example.betterlog

import android.util.Log

 class BetterLog {
     companion object {
         private val TAG = "Obviously this is a better log"
         fun betterD(msg: String){
             Log.d(TAG, msg)
         }
     }
}