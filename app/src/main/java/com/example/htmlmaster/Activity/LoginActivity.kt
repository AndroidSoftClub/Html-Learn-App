package com.example.htmlmaster.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.htmlmaster.databinding.LoginScreenLayoutBinding

class LoginActivity : BaseAct() {
    lateinit var binding: LoginScreenLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginScreenLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        hideTool()

        binding.sighnID.setOnClickListener {
            startActivity(Intent(this@LoginActivity, SighUpActivity::class.java))
        }
        binding.loginID.setOnClickListener {
            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
        }
    }
}