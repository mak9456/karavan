package com.example.mak9456.karavan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.button;

public class Validate extends AppCompatActivity {
    private EditText var_username,var_passwd;
    private Button var_btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate);


          var_username= (EditText) findViewById(R.id.fldUsername);
          var_passwd=(EditText) findViewById(R.id.fldPassword);
          var_btn_login =(Button) findViewById(R.id.Login);

        var_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(var_username.getText().toString().equals("mak9456") && var_passwd.getText().toString().equals("12345"))
                    QuoteActivity();
                else
                    Toast.makeText(Validate.this, "Wrong username or password", Toast.LENGTH_SHORT).show();
            }
        });

    }


    private void QuoteActivity() {

        Intent intent = new Intent(this, Quotation.class);
        startActivity(intent);
    }
}
