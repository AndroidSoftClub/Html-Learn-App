package com.example.htmlmaster.Activity

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.htmlmaster.Adapter.FGPagerAdapter
import com.example.htmlmaster.databinding.*

class MainActivity : BaseAct() {
    lateinit var binding: ActivityMainBinding
    lateinit var fgadapter: FGPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hideTool()

        fgadapter = FGPagerAdapter(supportFragmentManager)

        fgadapter.add(ProfileFragment(), "One")

        binding.viewpagerrID.adapter = fgadapter
        binding.viewpagerrID.currentItem = 0

    }
}

class ProfileFragment : Fragment() {
    lateinit var binding: ActivityMainProfileFgBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ActivityMainProfileFgBinding.inflate(layoutInflater)


        return binding.root
    }
}