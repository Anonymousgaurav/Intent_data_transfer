package com.example.intent_data_transfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    String s,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 =findViewById(R.id.tv1);
        tv2 =findViewById(R.id.tv2);

        Intent i = getIntent();
        Bundle b = i.getExtras();


           s = b.getString("Token");
           p =  b.getString("Token1");
        tv1.setText(s);
        tv2.setText(p);



    }
}
