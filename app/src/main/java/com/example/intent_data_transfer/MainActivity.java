package com.example.intent_data_transfer;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 3;
    private TextView Info;
    Button Login;
    String e,p;
    EditText email,pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Info = (TextView) findViewById(R.id.tvinfo);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        Login = (Button) findViewById(R.id.loginbtn);

        e = email.getText().toString();
        p = pass.getText().toString();

        Info.setText("No. of attempt remaining : " + String.valueOf(counter));

        Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                validate(email.getText().toString(), pass.getText().toString());
            }
        });
    }
    private void validate(String e, String p) {
        if ((e.equals("Admin")) && (p.equals("1234")))
        {
            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            i.putExtra("Token",e);
            i.putExtra("Token1",p);
            startActivity(i);
        }
        else
            {
            counter--;
            Info.setText("No of attempts remaining : " + String.valueOf(counter));
            if (counter == 0) {
                Login.setEnabled(false);
            }
        }
    }


}



