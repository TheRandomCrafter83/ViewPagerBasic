package com.coderz.f1.viewpagerbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coderz.f1.viewpagerbasic.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    var titles: Array<String> = arrayOf("Details", "Image")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabLayout,binding.viewPager) { tab, position ->
            tab.text = titles[position]
        }.attach()
    }
}