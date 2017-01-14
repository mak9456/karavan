package com.example.mak9456.karavan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.button;

public class Validate extends AppCompatActivity {
    private EditText var_username,var_passwd;
    private Button var_btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate);


       // var_username= (EditText) findViewById(R.id.fldUsername);
        //var_passwd=(EditText) findViewById(R.id.fldPassword);
        //var_btn_login =(Button) findViewById(R.id.Login);

    }
}
