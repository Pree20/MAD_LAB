package com.example.guess_the_no;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Number;
    TextView Message;
    int computer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number=(EditText) findViewById(R.id.Number);
        Message=(TextView) findViewById(R.id.message);
        int min = 0;
        int max = 20;
        computer=(int)(Math.random()*(max-min)+min);
        Log.d("generated no", String.valueOf(computer));
    }
    public void guess(View view) {
        Button btn =(Button)view;
        int num=Integer.parseInt(Number.getText().toString());
        if(num<computer)
        {
            Message.setText("Low");
        }
        else if(num>computer)
        {
            Message.setText("High");
        }
        else
        {
            Message.setText("Correct");
            btn.setEnabled(false);
        }
    }
}