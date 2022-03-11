package com.example.htmlmaster.Activity

import android.os.Bundle
import com.example.htmlmaster.databinding.QuizLayoutBinding
import com.example.htmlmaster.databinding.SighnupLayoutBinding

class MainActivity : BaseAct() {
    lateinit var binding: SighnupLayoutBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SighnupLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hideTool()

    }
}