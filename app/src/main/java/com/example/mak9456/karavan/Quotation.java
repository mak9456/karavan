package com.example.mak9456.karavan;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Quotation extends AppCompatActivity {
    private Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotation);
        search=(Button) findViewById(R.id.Search_quote);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuoteRescall();

            }
        });



    }

    private void QuoteRescall() {

        Intent intent = new Intent(this, QuoteRes.class);
        startActivity(intent);
    }

}
