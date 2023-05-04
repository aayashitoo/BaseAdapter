package com.majid.baseadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import com.majid.baseadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding //Declaration
    lateinit var baseAdapter: extended
    private var  data = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //Intialization
        baseAdapter=extended(data)
        data.add("Aayash")
        data.add("itoo")
        binding.lvitems.adapter = baseAdapter

    }
}