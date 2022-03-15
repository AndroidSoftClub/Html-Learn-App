package com.example.htmlmaster.Activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.htmlmaster.Adapter.FGPagerAdapter
import com.example.htmlmaster.databinding.IntroActivityBinding
import com.example.htmlmaster.databinding.IntroOneLayoutBinding
import com.example.htmlmaster.databinding.IntroThreeLayoutBinding
import com.example.htmlmaster.databinding.IntroTwoLayoutBinding

class IntroActivity : BaseAct() {
    lateinit var binding: IntroActivityBinding
    lateinit var fgadapter: FGPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = IntroActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hideTool()

        fgadapter = FGPagerAdapter(supportFragmentManager)

        fgadapter.add(IntroOne(), "One")
        fgadapter.add(IntroSec(), "Two")
        fgadapter.add(Introthree(), "Three")

        binding.viewpagerID.adapter = fgadapter
        binding.viewpagerID.currentItem = 0

    }


    class IntroSec : Fragment() {
        lateinit var binding: IntroTwoLayoutBinding
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            binding = IntroTwoLayoutBinding.inflate(layoutInflater)

            binding.nextID.setOnClickListener(View.OnClickListener {
                startActivity(Intent(activity, LoginActivity::class.java))

            })


            return binding.root
        }
    }

    class Introthree : Fragment() {
        lateinit var binding: IntroThreeLayoutBinding
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            binding = IntroThreeLayoutBinding.inflate(layoutInflater)

            binding.nextID.setOnClickListener(View.OnClickListener {
                startActivity(Intent(activity, LoginActivity::class.java))

            })

            return binding.root
        }
    }


    class IntroOne : Fragment() {
        lateinit var binding: IntroOneLayoutBinding
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            binding = IntroOneLayoutBinding.inflate(layoutInflater)

            binding.nextID.setOnClickListener(View.OnClickListener {
                startActivity(Intent(activity, LoginActivity::class.java))

            })

            return binding.root
        }
    }
}