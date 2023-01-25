package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edt1,edt2,edt3;
        TextView txt;
        Button btn;
        LinearLayout ll=findViewById(R.id.llmain);
        edt1=findViewById(R.id.ed_wt);
        edt2=findViewById(R.id.ed_htf);
        edt3=findViewById(R.id.ed_hti);
        txt=findViewById(R.id.txt);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int wt= Integer.parseInt(edt1.getText().toString());
               int htf=Integer.parseInt(edt2.getText().toString());
               int hti=Integer.parseInt(edt3.getText().toString());
               int in=htf*12+hti;
               double htcm =in*2.54;
               double htm=htcm/100;
               double bmi=wt/htm;
               if(bmi>25){
                   txt.setText("You are OverWeight");
                   ll.setBackgroundColor(getResources().getColor(R.color.red));
               }
                else if(bmi<18.5){
                    txt.setText("You are UnderWeight");
                    ll.setBackgroundColor(getResources().getColor(R.color.yellow));
                }
                else{
                    txt.setText("You are Healthy !");
                    ll.setBackgroundColor(getResources().getColor(R.color.green));
               }
            }
        });
    }
}