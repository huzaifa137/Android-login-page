package ml.bukes.userinter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textview001, textview1, textview2, textview3, textview4, textview5, textview6, textview7, textview8;
    public EditText text1, text2, text3, text4, text5, text6, text7, text8;
    private RadioButton check1, check2, check3;
    private RadioGroup radiogrp;
    private CheckBox check4, check5, check6;
    private Button button2;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.cyan);


        button2 = (Button) findViewById(R.id.button2);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Opensubmission();
            }
        });

    }

    public void Opensubmission() {

        Intent intent = new Intent(this, Submission.class);
        startActivity(intent);

    }


    public void clickme(View view) {

        text1 = (EditText) findViewById(R.id.text1);
        text1.setVisibility(view.getVisibility());

        text2 = (EditText) findViewById(R.id.text2);
        text2.setVisibility(view.getVisibility());

        textview1 = (TextView) findViewById(R.id.textview1);
        textview1.setVisibility(view.getVisibility());

        radiogrp = (RadioGroup) findViewById(R.id.radiogrp);
        check1 = (RadioButton) findViewById(R.id.check1);
        check1.setVisibility(view.getVisibility());

        check2 = (RadioButton) findViewById(R.id.check2);
        check2.setVisibility(view.getVisibility());

        check3 = (RadioButton) findViewById(R.id.check3);
        check3.setVisibility(view.getVisibility());

        textview2 = (TextView) findViewById(R.id.textview2);
        textview2.setVisibility(view.getVisibility());

        check4 = (CheckBox) findViewById(R.id.check4);
        check4.setVisibility(view.getVisibility());

        check5 = (CheckBox) findViewById(R.id.check5);
        check5.setVisibility(view.getVisibility());

        check6 = (CheckBox) findViewById(R.id.check6);
        check6.setVisibility(view.getVisibility());

        text3 = (EditText) findViewById(R.id.text3);
        text3.setVisibility(view.getVisibility());

        textview3 = (TextView) findViewById(R.id.textview3);
        textview3.setVisibility(view.getVisibility());

        text4 = (EditText) findViewById(R.id.text4);
        text4.setVisibility(view.getVisibility());

        textview001 = (TextView) findViewById(R.id.textview001);

        textview4 = (TextView) findViewById(R.id.textview4);
        textview4.setVisibility(view.getVisibility());

        text5 = (EditText) findViewById(R.id.text5);
        text5.setVisibility(view.getVisibility());

        textview5 = (TextView) findViewById(R.id.textview5);
        textview5.setVisibility(view.getVisibility());

        textview6 = (TextView) findViewById(R.id.textview6);
        textview6.setVisibility(view.getVisibility());

        text6 = (EditText) findViewById(R.id.text6);
        text6.setVisibility(view.getVisibility());

        textview7 = (TextView) findViewById(R.id.textview7);
        textview7.setVisibility(view.getVisibility());

        text7 = (EditText) findViewById(R.id.text7);
        text7.setVisibility(view.getVisibility());

        text8 = (EditText) findViewById(R.id.text8);
        text8.setVisibility(view.getVisibility());

        textview8 = (TextView) findViewById(R.id.textview8);
        textview8.setVisibility(view.getVisibility());

        button2 = (Button) findViewById(R.id.button2);
        button2.setVisibility(view.getVisibility());

    }

}