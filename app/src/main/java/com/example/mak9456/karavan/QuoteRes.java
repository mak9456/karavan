package com.example.mak9456.karavan;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.style.QuoteSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static com.example.mak9456.karavan.QuoteRes.msearchdisplay;
import static java.sql.Types.NULL;

public class QuoteRes extends AppCompatActivity {
    public  static  TextView msearchdisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_res);
        msearchdisplay=(TextView) findViewById(R.id.disp_quote);
        launchqueryres  launch= new launchqueryres();
        launch.execute();
      }



}

     class launchqueryres extends AsyncTask<Void,Void,QuoteResponse[]> {

        protected  QuoteResponse[] doInBackground(Void ...params){

            try {
                String jsonQuotationResponse = NetworkUtils.getResponsefromHttp();

                QuoteResponse[] Jsondisp=OpenQuoteJsonUtils.getQuotesFromJson( jsonQuotationResponse);

                return Jsondisp;

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }

        }
        protected void onPostExecute(QuoteResponse[] Jsondisp){


            QuoteResponse[] quoteResponseDisp=Jsondisp;


                for(int i=0;i<4;i++){
                   // quoteResponseDisp[i]=new QuoteResponse();
                    msearchdisplay.append(quoteResponseDisp[i].vendor.getVendor_name() +" "+quoteResponseDisp[i].vehicle.getVehicle_type()+quoteResponseDisp[i].getPrice_per_day()+"\n\n\n");}



               }



     }

