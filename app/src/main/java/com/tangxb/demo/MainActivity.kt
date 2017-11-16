package com.tangxb.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var rv: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test1()
    }

    fun test1() {
        rv = findViewById(R.id.rv)
        rv?.layoutManager = LinearLayoutManager(this)
        val adapter = PersonAdapter(DataProvider.instance.getNeedData())
        rv?.adapter = adapter

    }
}
