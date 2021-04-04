package com.example.test;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private Button signin;
    private EditText usr;
    private EditText pass;
    String usrr;
    String passs;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        signin=findViewById(R.id.button);
        usr=findViewById(R.id.textView7);
        pass=findViewById(R.id.editTextTextPassword);

        signin.setOnClickListener(this::onClick);
    };

    public void onClick(View v ) {
        usrr=usr.getText().toString();
        passs=pass.getText().toString();
        if(usrr.isEmpty() && passs.isEmpty())
        {
            Toast.makeText(this, "Fill all the fields", Toast.LENGTH_LONG).show();
        }
        else
        {
            if(usrr.equals("abc@gmail.com")){
                if(passs.equals("123456")){
                    setContentView(R.layout.welcom);
                    Toast.makeText(this, "welcome", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(this, "Wrong password", Toast.LENGTH_LONG).show();
                }
        }
            else{
                Toast.makeText(this, "Wrong username", Toast.LENGTH_LONG).show();
            }
        }

    }
}
