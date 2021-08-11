package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fragment1(view: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragmentFirst =  FirstFragment()
        fragmentTransaction.replace(R.id.FrameLayoutId,fragmentFirst).commit() // add denirse orada farkli bir fragment var ise onun ustune yazar.

    }

    fun fragment2(view: View){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragmentSecond = SecondFragment()
        fragmentTransaction.replace(R.id.FrameLayoutId,fragmentSecond).commit()

    }
}