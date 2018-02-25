package com.example.dicky.dickyaditama_1202153367_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.btnlogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                password.getText().toString();
                if(username.getText().toString().equals("EAD")&& password.getText().toString().equals("MOBILE")){
                    Toast.makeText(LoginActivity.this,"Login Berhasil",Toast.LENGTH_LONG).show();
                    Intent pindah = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(pindah);
                }else {
                    Toast.makeText(LoginActivity.this,"Login Gagal",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}

