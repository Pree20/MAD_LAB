package com.example.formvalidationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
        Button submit;
        EditText email,pwd;
    public TextWatcher textWatcher = new TextWatcher() {
        public boolean isValidEmail(String email){
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String pass = pwd.getText().toString();
            String submittedEmail = email.getText().toString();
            boolean f1=false,f2=false;
            if(pass != null && pass.length()<6){
                pwd.setError("Password must be at least 6 characters");
                f1=true;
            }
            if(submittedEmail != null && this.isValidEmail(submittedEmail)==false){
                email.setError("Enter a valid email");
                f2=true;
            }
            if(f1==false && f2==false){
                submit.setEnabled(true);
            }
            else
            {
                submit.setEnabled(false);
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.button1);
        email = (EditText) findViewById(R.id.email);
        pwd = (EditText) findViewById(R.id.pwd);
        submit.setEnabled(false);
        email.addTextChangedListener(textWatcher);
        pwd.addTextChangedListener(textWatcher);

    }

    public void onClick(View view) {

            Intent intent  = new Intent(this.getApplicationContext(),SecondActivity.class);
            startActivity(intent);
    }
}