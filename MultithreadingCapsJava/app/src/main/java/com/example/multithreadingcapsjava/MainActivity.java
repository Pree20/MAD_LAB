package com.example.multithreadingcapsjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tv;
    String res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.inputbox);
        tv = (TextView) findViewById(R.id.textView);
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while(true){
                    String source = et.getText().toString();
                    String[] strArr = source.split(" ");
                    res = "";
                    for(String str: strArr){
                        if(str.length()<=0)     break;
                        String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
                        res = res.concat(cap);
                        res = res.concat(" ");
                    }
                    tv.setText(res);
                }
            }
        }).start();
    }

    public void onClick(View view) {
        et.setText(res);
        et.setSelection(et.getText().length());
    }
}