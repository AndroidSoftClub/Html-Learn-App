package com.example.htmlmaster.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.htmlmaster.databinding.SighnupLayoutBinding

class SighUpActivity : BaseAct() {
    lateinit var binding: SighnupLayoutBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SighnupLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        hideTool()

        binding.backID.setOnClickListener { onBackPressed() }
        binding.lID.setOnClickListener { onBackPressed() }

        binding.sighupID.setOnClickListener { onBackPressed() }

    }
}