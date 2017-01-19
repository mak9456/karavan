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

        launchqueryres  launch= new launchqueryres(getData());
        launch.execute();
      }

    protected  QuotationInput getData(){
        QuotationInput quotationInput=new QuotationInput();
        Bundle extras = getIntent().getExtras();
       // Log.d("In getdata",quotationInput.setFrom_city(extras.getString("from_city")));
        Log.d("In getdata bundle",extras.getString("to_city"));
        if (extras != null) {
            quotationInput.setFrom_city(extras.getString("from_city")); ;
            quotationInput.setTo_city(extras.getString("to_city"));
            quotationInput.setStart_date(extras.getString("start_date"));
            quotationInput.setEnd_date(extras.getString("end_date"));
            quotationInput.setMax_people(extras.getString("max_people"));
        }
        return quotationInput;
    }

}


  class launchqueryres extends AsyncTask<Void ,Void,QuoteResponse[]> {
            private QuotationInput quotein;
            launchqueryres(QuotationInput set_quotein)
            {
                this.quotein=set_quotein;

            }
        protected  QuoteResponse[] doInBackground(Void ... params){

            try {
                String jsonQuotationResponse = NetworkUtils.getResponsefromHttp(quotein);

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

                    msearchdisplay.append(quoteResponseDisp[i].vendor.getVendor_name() +" "+quoteResponseDisp[i].vendor.getLogo()+"\n\n\n");}



               }



     }

