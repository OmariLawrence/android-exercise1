package com.example.olawr.excercise1;

import android.content.Intent;
import android.os.Bundle;

import android.app.Activity;

import android.content.Context;

import android.util.Log;

import android.view.Menu;

import android.view.View;

import android.widget.Button;

import android.widget.RadioButton;

import android.widget.RadioGroup;

import android.widget.CompoundButton;

import android.widget.CheckBox;

import android.widget.EditText;

import android.widget.TextView;

import android.widget.Toast;



public class MainActivity extends Activity {

    private Button myButton, intentButton;

    private RadioButton radio1, radio2;

    private CheckBox check;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        myButton = (Button) findViewById(R.id.button1);
        intentButton=(Button) findViewById(R.id.Sbutton);
        radio1 = (RadioButton) findViewById(R.id.radioButton);

        radio2 = (RadioButton) findViewById(R.id.radioButton2);

        check = (CheckBox) findViewById(R.id.checkBox);



        myButton.setOnClickListener(new Button_Clicker());

        radio1.setOnClickListener(new Button_Clicker());

        radio2.setOnClickListener(new Button_Clicker());



        check = (CheckBox)findViewById(R.id.checkBox);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                Log.d("MyApp","Check box selected");

            }

        });
        intentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, Newscreen.class);
                startActivity(intent);
            }
        });
//**

    }



    class Button_Clicker implements Button.OnClickListener

    {

        @Override

        public void onClick(View v) {



            if(v == myButton)

            {

                myButton.setText("Clicked!");

                doCalculations();

                Log.d("MyApp","I am here");

            }

            else if (v == radio1)

                Log.d("MyApp","radio1 clicked");

            else if (v == radio2)

                Log.d("MyApp","radio2 clicked");





        }

    }







    public void doCalculations(){

        //TextView tv = (TextView)findViewById(R.id.textView1);

        Context context = getApplicationContext();

        CharSequence text = "In doCalculations()";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();



        //String text1="";

        EditText mEdit;



        mEdit   = (EditText)findViewById(R.id.EditText01);

        int quantity = Integer.parseInt(mEdit.getText().toString());

        mEdit   = (EditText)findViewById(R.id.EditText02);

        double price = Double.parseDouble(mEdit.getText().toString());

        double cost = price * quantity;



        mEdit = (EditText)findViewById(R.id.EditText03);

        mEdit.setText(cost + "");

    }







    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.

        //getMenuInflater().inflate(R.menu.activity_main, menu);

        return true;

    }



}