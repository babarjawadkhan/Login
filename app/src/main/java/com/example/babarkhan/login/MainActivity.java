package com.example.babarkhan.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.babarkhan.login.R.id.User;
import static com.example.babarkhan.login.R.id.btn1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       EditText  user = (EditText) findViewById(R.id.user) ;
        EditText passward = (EditText) findViewById(R.id.passward);
     Button   btn1 = (Button) findViewById(R.id.btn1);

        String user1 = user.getText().toString();
        String strpass = passward.getText().toString();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user1.equal(""))
            }
        });




    }



}
