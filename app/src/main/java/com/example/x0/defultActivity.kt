package com.example.x0

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent



class defultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_defult)
    }

    protected fun buclick(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent);
    }
    protected fun buclick2(view: View){
        val intent = Intent(this,Main2Activity::class.java)
        startActivity(intent);
    }
}

