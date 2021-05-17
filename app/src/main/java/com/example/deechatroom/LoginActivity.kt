package com.example.deechatroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signIn()

        setupSimpleSpinner()
    }

    private fun signIn() {
        val username = findViewById<TextInputEditText>(R.id.username_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val loginButton = findViewById<MaterialButton>(R.id.login_button)

        loginButton.setOnClickListener(){
            if (username.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()){
                Toast.makeText(this,"Email or Password is not available", Toast.LENGTH_LONG).show()
            }else {
                if(username.toString() == "ProfessorDee" && password.toString() == "12345"){

                    val intent = Intent(this, DetailActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this,"Wrong Email or Password", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    private fun setupSimpleSpinner() {
        val spinner = findViewById<Spinner>(R.id.simple_spinner)

        val adapter = ArrayAdapter.createFromResource(this, R.array.language,android.R.layout.simple_spinner_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent!!.getItemAtPosition(position)
                Toast.makeText(this@LoginActivity, "$selectedItem", Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@LoginActivity, "No Item Was Selected", Toast.LENGTH_LONG).show()
            }

        }
    }
}