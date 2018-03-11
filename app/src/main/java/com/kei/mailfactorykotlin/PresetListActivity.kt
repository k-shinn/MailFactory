package com.kei.mailfactorykotlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.kei.mailfactorykotlin.databinding.ActivityPresetListBinding
import com.kei.mailfactorykotlin.model.MailData
import com.kei.mailfactorykotlin.presetList.PresetListAdapter

class PresetListActivity : AppCompatActivity() {

    private val tag: String = "PresetListActivity"

    private val binding: ActivityPresetListBinding by lazy {
//        ActivityPresetListBinding.inflate(layoutInflater).also { setContentView(R.layout.activity_preset_list) }
        DataBindingUtil.setContentView<ActivityPresetListBinding>(this, R.layout.activity_preset_list)
    }

    private val presetList = arrayListOf<MailData>().apply {
        add(MailData("preset1"))
        add(MailData("preset2"))
        add(MailData("preset3"))
        add(MailData("preset1"))
        add(MailData("preset2"))
        add(MailData("preset3"))
        add(MailData("preset1"))
        add(MailData("preset2"))
        add(MailData("preset3"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "onCreate")
        super.onCreate(savedInstanceState)
//        setSupportActionBar(binding.toolbar)
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show()
        }
        initRecyclerView()
    }

    override fun onResume() {
        Log.d(tag, "onResume")
        super.onResume()
    }

    private fun initRecyclerView() {
        val presetListAdapter = PresetListAdapter(presetList)
        binding.presetList.setHasFixedSize(true)
        binding.presetList.layoutManager = LinearLayoutManager(this)
        binding.presetList.adapter = presetListAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
