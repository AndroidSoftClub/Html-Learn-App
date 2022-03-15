package com.example.htmlmaster.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.htmlmaster.databinding.ActivityMainBinding
import com.example.htmlmaster.databinding.QuizLayoutBinding
import com.example.htmlmaster.databinding.SighnupLayoutBinding
import com.example.htmlmaster.databinding.TagForHeaderLayoutBinding

class MainActivity : BaseAct() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        hideTool()

    }
}