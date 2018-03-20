package com.example.android.footballquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.R.attr.checked;
import static com.example.android.footballquiz.R.id.rg1;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    RadioGroup radiogroup1;
    RadioGroup radiogroup2;
    RadioGroup radiogroup3;
    RadioGroup radiogroup4;
    RadioGroup radiogroup5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       radiogroup1 = (RadioGroup) findViewById(R.id.rg1);
       radiogroup2 = (RadioGroup) findViewById(R.id.rg2);
       radiogroup3 = (RadioGroup) findViewById(R.id.rg3);
       radiogroup4 = (RadioGroup) findViewById(R.id.rg4);
       radiogroup5 = (RadioGroup) findViewById(R.id.rg5);

    }

    public void selectOption1(View view) {
        int a1 = radiogroup1.getCheckedRadioButtonId();
        RadioButton r1 = (RadioButton) findViewById(R.id.answer1);

        if (a1 == r1.getId()) {
            Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show();
            score++;
        } else {
            Toast.makeText(this, "INCORRECT", Toast.LENGTH_SHORT).show();
        }
    }
    public void selectOption2(View view) {
        int a2 = radiogroup2.getCheckedRadioButtonId();
        RadioButton r2 = (RadioButton) findViewById(R.id.answer2);

        if (a2 == r2.getId()) {
            Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show();
            score++;
        } else {
            Toast.makeText(this, "INCORRECT", Toast.LENGTH_SHORT).show();
        }
    }

    public void selectOption3(View view) {

        int a3 = radiogroup3.getCheckedRadioButtonId();
        RadioButton r3 = (RadioButton) findViewById(R.id.answer3);

        if (a3 == r3.getId()) {
            Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show();
            score++;
        } else {
            Toast.makeText(this, "INCORRECT", Toast.LENGTH_SHORT).show();
        }
    }

    public void selectOption4(View view) {
        int a4 = radiogroup4.getCheckedRadioButtonId();
        RadioButton r4 = (RadioButton) findViewById(R.id.answer4);

        if (a4 == r4.getId()) {
            Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show();
            score++;
        } else {
            Toast.makeText(this, "INCORRECT", Toast.LENGTH_SHORT).show();
        }
    }
    public void selectOption5(View view) {
        int a5 = radiogroup5.getCheckedRadioButtonId();
        RadioButton r5 = (RadioButton) findViewById(R.id.answer5);

        if (a5 == r5.getId()) {
            Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show();
            score++;
        } else {
            Toast.makeText(this, "INCORRECT", Toast.LENGTH_SHORT).show();
        }
    }

    public void selectOption6(View view) {
        CheckBox c1 = (CheckBox)findViewById(R.id.checkbox1);
        CheckBox c2 = (CheckBox)findViewById(R.id.checkbox2);
        CheckBox c3 = (CheckBox)findViewById(R.id.checkbox3);
        CheckBox c4 = (CheckBox)findViewById(R.id.checkbox4);

       if( c1.isChecked() && c4.isChecked() && !c3.isChecked() && !c2.isChecked()){
           Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show();
           score++;
       } else {
           Toast.makeText(this, "INCORRECT", Toast.LENGTH_SHORT).show();
       }

    }

    public void check(View view){
        EditText eT= (EditText)findViewById(R.id.answer7);
     if(eT.getText().toString().equals("11")){
         Toast.makeText(this, "CORRECT", Toast.LENGTH_SHORT).show();
         score++;
     } else {
         Toast.makeText(this, "INCORRECT", Toast.LENGTH_SHORT).show();
     }

    }

    public void displayScore(View view){
        Toast.makeText(this, "You answered "+score+" questions out of 7 correctly!!", Toast.LENGTH_LONG).show();
    }
}