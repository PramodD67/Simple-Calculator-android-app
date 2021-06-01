package com.pramod.simplecalculator;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button addbtn, subbtn, mulbtn, divbtn, n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, clearbtn,btn_pointer,infotxt;
    TextView result ,input_text;
    ImageView equalsbtn;

    private final String ADDITION = "+";

    private final String MULTIPLICATION = "*";
    private final String SUBTRACTION = "-";
    private final String DIVISION = "/";
    private  String NullValue;
    public String ACTION;
    public String data;
    public int val1;
    public String val2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addbtn = findViewById(R.id.addbtn);
        addbtn.setOnClickListener(this);

        subbtn = findViewById(R.id.subbtn);
        subbtn.setOnClickListener(this);

        mulbtn = findViewById(R.id.mulbtn);
        mulbtn.setOnClickListener(this);

        divbtn = findViewById(R.id.divbtn);
        divbtn.setOnClickListener(this);

        n0 = findViewById(R.id.n0);
        n0.setOnClickListener(this);


        n1 = findViewById(R.id.n1);
        n1.setOnClickListener(this);

        n2 = findViewById(R.id.n2);
        n2.setOnClickListener(this);

        n3 = findViewById(R.id.n3);
        n3.setOnClickListener(this);


        n4 = findViewById(R.id.n4);
        n4.setOnClickListener(this);

        n5 = findViewById(R.id.n5);
        n5.setOnClickListener(this);

        n6 = findViewById(R.id.n6);
        n6.setOnClickListener(this);

        n7 = findViewById(R.id.n7);
        n7.setOnClickListener(this);

        n8 = findViewById(R.id.n8);
        n8.setOnClickListener(this);

        n9 = findViewById(R.id.n9);
        n9.setOnClickListener(this);

        result = findViewById(R.id.result);
        result.setOnClickListener(this);

        clearbtn = findViewById(R.id.clearbtn);
        clearbtn.setOnClickListener(this);
        input_text = findViewById(R.id.input_text);

        equalsbtn = findViewById(R.id.equalsbtn);
        equalsbtn.setOnClickListener(this);

        btn_pointer = findViewById(R.id.btn_pointer);
        btn_pointer.setOnClickListener(this);



   input_text.setText("0");
   data = "0";




        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             data=data.concat("0");
               input_text.append("0");

            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input_text.append("1");
                data=data.concat("1");


            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                input_text.append("2");
                data=data.concat("2");


            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                input_text.append("3");
                data=data.concat("3");


            }
        });


        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input_text.append("4");
                data=data.concat("4");

            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input_text.append("5");
                data=data.concat("5");

            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input_text.append("6");
                data=data.concat("6");


            }
        });


        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input_text.append("7");
                data=data.concat("7");

            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input_text.append("8");
                data=data.concat("8");


            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input_text.append("9");
                data=data.concat("9");

            }
        });

        btn_pointer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input_text.append(".");
                data=data.concat(".");

            }
        });

        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_text.setText("");
                result.setText("");
            }
        });

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(result.length()>0)
                {
                    val2 = result.getText().toString();
                    input_text.append("+");
                    ACTION=ADDITION;
                    data="0";
                    val1=0;
                    result.setText("");
                }
                else {
                    val1 = Integer.parseInt(input_text.getText().toString());
                    input_text.append("+");
                    data="0";
                    ACTION=ADDITION;
                    val2 ="";
            }

            }



        });

        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(result.length()>0)
                {
                    val2 = result.getText().toString();
                    input_text.append("-");
                    ACTION=SUBTRACTION;
                    data="0";
                    val1=0;
                    result.setText("");
                }
                else {
                    val1 = Integer.parseInt(input_text.getText().toString());
                    input_text.append("-");
                    data="0";
                    ACTION=SUBTRACTION;
                    val2 ="";
                }

            }



        });

        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.length()>0)
                {
                    val2 = result.getText().toString();
                    input_text.append("/");
                    ACTION=DIVISION;
                    data="0";
                    val1=0;
                    result.setText("");
                }
                else {
                    val1 = Integer.parseInt(input_text.getText().toString());
                    input_text.append("/");
                    data="0";
                    ACTION=DIVISION;
                    val2 ="";
                }
            }



        });

        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.length()>0)
                {
                    val2 = result.getText().toString();
                    input_text.append("*");
                    ACTION=MULTIPLICATION;
                    data="0";
                    val1=0;
                    result.setText("");
                }
                else {
                    val1 = Integer.parseInt(input_text.getText().toString());
                    input_text.append("*");
                    data="0";
                    ACTION=MULTIPLICATION;
                    val2 ="";
                }
            }



        });



        equalsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ACTION == ADDITION){
                    if(val2.length()>0)
                    {
                        result.setText(String.valueOf (Float.parseFloat(val2) + Float.parseFloat(String.valueOf(data))));

                    }
                    else {
                        result.setText(String.valueOf(val1+ Float.parseFloat(String.valueOf(data))));

                    }



                }
                else if(ACTION==SUBTRACTION){
                    if(val2.length()>0)
                    {
                        result.setText(String.valueOf (Float.parseFloat(val2) - Float.parseFloat(String.valueOf(data))));

                    }
                    else {
                        result.setText(String.valueOf(val1- Float.parseFloat(String.valueOf(data))));

                    }
                }
                else if (ACTION.equals(MULTIPLICATION)){
                    if(val2.length()>0)
                    {
                        result.setText(String.valueOf (Float.parseFloat(val2) * Float.parseFloat(String.valueOf(data))));

                    }
                    else {
                        result.setText(String.valueOf(val1* Float.parseFloat(String.valueOf(data))));

                    }
                }
                else if(ACTION.equals(DIVISION)){
                     if(data.equals("0") ){
                         Toast toast=Toast.makeText(getApplicationContext(),"Invalid Operation", Toast.LENGTH_SHORT);
                         toast.show();
                    }
                    else{
                         if(val2.length()>0)
                         {
                             result.setText(String.valueOf (Float.parseFloat(val2) / Float.parseFloat(String.valueOf(data))));

                         }
                         else {
                             result.setText(String.valueOf(val1/Float.parseFloat(String.valueOf(data))));

                         }                    }
                }

                else{
                    Toast t = Toast.makeText(getApplicationContext(),"Invalid Operation", Toast.LENGTH_SHORT);
                    t.show();
                }

            }
        });


        }


    @Override
    public void onClick(View view) {

    }
}



