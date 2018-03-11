package com.kei.mailfactorykotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class EmptyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_empty)
    }

    override fun onResume() {
        super.onResume()
        val intent = Intent(this, PresetListActivity::class.java)
        startActivity(intent)
        finish()
    }
}
