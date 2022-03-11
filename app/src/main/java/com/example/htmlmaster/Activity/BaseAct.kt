package com.example.htmlmaster.Activity

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    fun tos(txt: String) {
        Toast.makeText(this@BaseAct, txt, Toast.LENGTH_LONG).show()
    }

    fun hideTool() {
        supportActionBar!!.hide()
    }
}