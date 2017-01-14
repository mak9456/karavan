package com.example.mak9456.karavan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.lang.*;
//gipackage com.example.mak9456.karavan;




public class MainActivity extends AppCompatActivity {
    private Button test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  ThreadDemo t1=new ThreadDemo();
        //t1.start();
        test =(Button) findViewById(R.id.test_btn);
       test.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               launchActivity();
           }
       });

    }


    private void launchActivity() {

        Intent intent = new Intent(this, Validate.class);
        startActivity(intent);
    }

 }



    class ThreadDemo extends Thread {
        private Thread t;
        private String threadName;

            public void run() {

        try{
                        Thread.sleep(10000);}
        catch(InterruptedException e){
            //Toast.makeText(this, "Exception occured", Toast.LENGTH_SHORT).show();
        }

            }


}