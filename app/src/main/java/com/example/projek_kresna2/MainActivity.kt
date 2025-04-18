package com.example.projek_kresna2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // GANTI SESUAI ID DI XML
        etUsername = findViewById(R.id.username_input)
        etPassword = findViewById(R.id.password_input)
        btnLogin = findViewById(R.id.Login_btn)
        btnRegister = findViewById(R.id.register_btn)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username == "admin" && password == "1234") {
                Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login gagal. Coba lagi.", Toast.LENGTH_SHORT).show()
            }
        }

        btnRegister.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Registrasi berhasil!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Isi username dan password!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}