package com.example.mak9456.karavan;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Quotation extends AppCompatActivity {
    private Button search;
    private EditText startDate;
    private EditText  endDate;
    private EditText  source;
    private EditText  destination;
    private EditText  maxpeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotation);
        startDate=(EditText) findViewById(R.id.from_date);
        endDate=(EditText) findViewById(R.id.to_date);
        source=(EditText) findViewById(R.id.from_city);
        destination=(EditText) findViewById(R.id.to_city);
        maxpeople=(EditText)  findViewById(R.id.max_people);
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
        Bundle b= new Bundle();
        b.putString("from_city",source.getText().toString());
        b.putString("to_city",destination.getText().toString());
        b.putString("start_date",startDate.getText().toString());
        b.putString("end_date",endDate.getText().toString());
        b.putString("max_people",maxpeople.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }

}
