package com.test_tagsoft_rick_morty;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class MyJsonParthCharcacter {
    protected final String TAG = "myLog";
    String name = null, status=null,species=null,
            type = null, gender = null, origin=null, all = null;



    protected String jsonPars (String responce){

        try {
            JSONObject jsonObject = new JSONObject(responce);
            name = jsonObject.getString("name");
            status = jsonObject.getString("status");
            species = jsonObject.getString("species");
            type = jsonObject.getString("type");
            gender = jsonObject.getString("gender");
            origin = jsonObject.getString("origin");
            all = "Name: " + name  + "\n" +
                    "Status: " + status + "\n" +
                    "Species: " + species + "\n" +
                    "Type: " + type + "\n" +
                    "Gender: " + gender + "\n" ;
                   // "Origin: " + origin + "\n" ;

        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.d(TAG,"String all " + all);

        return all;

    }


}
