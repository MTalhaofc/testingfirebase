package com.project.testingfirebase

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthRegistrar
import com.project.testingfirebase.databinding.ActivitySignupBinding

class signup : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private  lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.tvSignIn.setOnClickListener {
    val intent = Intent(this, MainActivity::class.java)
    startActivity(intent)
}



        firebaseAuth = FirebaseAuth.getInstance()
        binding.btnSignup.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val pass = binding.etPass.text.toString()
            val confirmpass = binding.etConfirmPass.text.toString()
            if(email.isNotEmpty() && pass.isNotEmpty() && confirmpass.isNotEmpty()){
                if (pass == confirmpass){

                    firebaseAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener {
                        if(it.isSuccessful){
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    }
                        else
                        {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()


                        }                        }
            }else{
                Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show()
                }
        }else{
                Toast.makeText(this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()

            }
    }
}}