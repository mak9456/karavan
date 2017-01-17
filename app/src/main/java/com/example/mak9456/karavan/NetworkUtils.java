

package com.example.mak9456.karavan;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

/**
 * Created by mak9456 on 15/1/17.
 */

public final class NetworkUtils {


    public static  String getResponsefromHttp () throws IOException,JSONException{
        URL url= new URL("http://192.168.2.11:3000/api/vehicle_search");

        DataOutputStream printout;
        HttpURLConnection conn= (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setUseCaches(false);
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(10000);
        conn.setRequestProperty("Accept","application/json");
        conn.setRequestProperty("Content-Type","application/json");
        conn.connect();

        //form json obejct to send
        JSONObject quote=new JSONObject();
        JSONObject jsonParam = new JSONObject();
        jsonParam.put("from_city", "PUNE");
        jsonParam.put("to_city", "MUMBAI");
        jsonParam.put("start_date", "15/01/2017");
        jsonParam.put("end_date", "20/01/2017");
        jsonParam.put("max_people", "7");
        quote.put("quotation",jsonParam);

        //send post output
       // printout = new DataOutputStream(conn.getOutputStream ());
        //printout.writeBytes(URLEncoder.encode(quote.toString(),"UTF-8"));

        //printout.flush ();
        //printout.close ();
        OutputStream outputStream = conn.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        writer.write(quote.toString());
        writer.close();
        outputStream.close();



        try {
            InputStream in = conn.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();

            if (hasInput) {
                return scanner.next();
            }
            else {
                return null;
                 }

        }
        finally {
            conn.disconnect();
        }
    }

}
