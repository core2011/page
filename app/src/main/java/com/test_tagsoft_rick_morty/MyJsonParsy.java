package com.test_tagsoft_rick_morty;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MyJsonParsy<strName> {
    protected final String TAG = "myLog";
    String[] strName = new String[494];

    protected String[] parthResponce(String responce) {
        String name = null;
        String id = null;
        String all = "";


        try {
            JSONObject jsonObject = new JSONObject(responce);
            JSONArray jsonArray = jsonObject.getJSONArray("results");

            for (int i = 0; i < jsonArray.length(); i++) {
                //Log.d(TAG,"jsonArray.length() = " + jsonArray.length());
                JSONObject infoPerson = jsonArray.getJSONObject(i);
                name = infoPerson.getString("name");
                id = infoPerson.getString("id");
                strName[Integer.parseInt(id)] = name;
                }

        } catch (JSONException e) {
            Log.d(TAG, "JSONException ");
            e.printStackTrace();
        }
        return strName;
        }



}
