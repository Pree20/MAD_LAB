package com.example.simplecalculatorjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.editTextNumber);
        num2=(EditText) findViewById(R.id.editTextNumber2);
        result=(TextView) findViewById(R.id.result);
    }
    public boolean nullChecker(){
        if(num1.getText().toString().equals("") ||  num2.getText().toString().equals(""))
            return false;
        return true;
    }
    public void calculate(View view) {
        Button btn=(Button)view;
        String value=btn.getText().toString();
        if(!nullChecker())
        {
            result.setText("Enter No's");
            return;
        }

        if(value.equals("+"))
        {

            float temp=Float.parseFloat(num1.getText().toString())+Float.parseFloat(num2.getText().toString());
            result.setText(Float.toString(temp));
        }

        else if(value.equals("-"))
        {
            float temp=Float.parseFloat(num1.getText().toString())-Float.parseFloat(num2.getText().toString());
            result.setText(Float.toString(temp));
        }
        else if(value.equals("*"))
        {
            float temp=Float.parseFloat(num1.getText().toString())*Float.parseFloat(num2.getText().toString());
            result.setText(Float.toString(temp));
        }
        else if(value.equals("/"))
        {
            float temp=Float.parseFloat(num1.getText().toString())/Float.parseFloat(num2.getText().toString());
            result.setText(Float.toString(temp));
        }
    }
}