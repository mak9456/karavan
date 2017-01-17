package com.example.mak9456.karavan;

/**
 * Created by mak9456 on 17/1/17.
 */

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by mak9456 on 17/1/17.
 */
class OpenQuoteJsonUtils{

    public static   QuoteResponse[]  getQuotesFromJson(String data) throws JSONException
    {




        JSONArray QuoteJson = new JSONArray(data);


        QuoteResponse[] quoteResponse=new QuoteResponse[10];
        for(int i=0;i<QuoteJson.length();i++)
        {
            //Json Object Declaration for  decoding JSon Data
            JSONObject quoteresobj= QuoteJson.getJSONObject(i);
          //  Log.d("JSonobject",quoteresobj);
            JSONObject  vendorobj=quoteresobj.getJSONObject("vendor");
            JSONObject vehicleobj=quoteresobj.getJSONObject("vehicle");



            //object declaration to get and set data in beans

            Vehicle vehicle=new Vehicle();
            Vendor  vendor=new Vendor();
            quoteResponse[i]=new QuoteResponse();

            //getter and setter of vehicle
            vehicle.setMake(vehicleobj.getString("make"));
            vehicle.setModel(vehicleobj.getString("model"));
            vehicle.setSubmodel(vehicleobj.getString("submodel"));
            vehicle.setOrigin_city(vehicleobj.getString("origin_city"));
            vehicle.setRegistration_number(vehicleobj.getString("registration_number"));
            vehicle.setSeating_capacity(vehicleobj.getInt("seating_capacity"));
            vehicle.setVehicle_type(vehicleobj.getString("vehicle_type"));
           // vehicle.setVehicle_id(vehicleobj.getString("id"));
           // vehicle.setVendor_id(vehicleobj.getString("vendor_id"));


            //getter and setter of vendor
            vendor.setAddress(vendorobj.getString("address"));
            vendor.setEmail(vendorobj.getString("email"));
            vendor.setShort_name(vendorobj.getString("short_name"));
            vendor.setVendor_name(vendorobj.getString("vendor_name"));
            vendor.setLogo(vendorobj.getString("logo"));
            vendor.setMobile(vendorobj.getString("mobile"));
            vendor.setWebsite(vendorobj.getString("website"));
            //vendor.setVendor_id(vendorobj.getString("id"));

            //getter and setter of QuoteResponse
            quoteResponse[i].setEstimated_distance(quoteresobj.getInt("estimated_distance"));
            quoteResponse[i].setFrom(quoteresobj.getString("from"));
            quoteResponse[i].setKm_cap_per_day(quoteresobj.getDouble("km_cap_per_day"));
            quoteResponse[i].setPenalty_per_km(quoteresobj.getDouble("penalty_per_km"));
            quoteResponse[i].setPenalty_per_day(quoteresobj.getInt("penalty_per_day"));
            quoteResponse[i].setPackage_type(quoteresobj.getString("package_type"));
            quoteResponse[i].setPrice_per_km(quoteresobj.getDouble("price_per_km"));
            quoteResponse[i].setPrice_per_day(quoteresobj.getInt("price_per_day"));
            quoteResponse[i].setTo(quoteresobj.getString("to"));
            quoteResponse[i].setVehicle(vehicle);
            quoteResponse[i].setVendor(vendor);

            Log.d("In get quotes from json",data);
            //Log.d("Object", String.valueOf(obj));

            // Log.d("Json Distance",Distance);


        }
        return quoteResponse;
    }
}
