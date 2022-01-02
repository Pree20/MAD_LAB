package com.example.gui_fonts_colors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int toggle = 1;
    int font_size = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.color_button);
        Button b2 = (Button)findViewById(R.id.font_button);
        TextView t = (TextView)findViewById(R.id.text);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   switch(toggle){
                       case 1: t.setTextColor(Color.RED); toggle ++; break;
                       case 2: t.setTextColor(Color.BLUE); toggle ++;break;
                       case 3: t.setTextColor(Color.CYAN); toggle = 1;break;
                   }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(font_size);
                font_size += 5;
                if(font_size == 40)
                    font_size = 20;
            }
        });
    }
}