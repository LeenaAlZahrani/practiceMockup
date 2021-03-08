package com.example.practicemockup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    int age;
    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EditText name=(EditText)findViewById(R.id.editTextTextPersonName);
        EditText year=(EditText)findViewById(R.id.editTextNumber);
        RadioGroup group=(RadioGroup)findViewById(R.id.radiogroup);
        RadioButton male=(RadioButton)findViewById(R.id.radioButton);
        RadioButton female=(RadioButton)findViewById(R.id.radioButton2);
        Button bttnsubmit =(Button)findViewById(R.id.bttnSubmit);
        Button bttnGoX1 =(Button)findViewById(R.id.button2);
        Button bttnGoX3 =(Button)findViewById(R.id.button3);
        TextView textView=(TextView)findViewById(R.id.textView6);
        bttnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age=2021-Integer.parseInt(year.getText().toString());
                if(male.isChecked()){
                    textView.setText("Hi Mr."+name.getText()+" you are "+age+" years old");
                }

                else
                    textView.setText("Hi Mrs."+name.getText()+" you are "+age+" years old");
            }
        });

        bttnGoX1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,MainActivity.class));
            }
        });


        bttnGoX3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
            }
        });
    }

}