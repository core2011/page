package com.test_tagsoft_rick_morty;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.net.URL;

import static com.test_tagsoft_rick_morty.Network.getResponsFromUrl;

public class TwoActivity extends Activity implements View.OnClickListener {
    final static String TAG="myLog";
    public static String id;
    TextView textView;
    Button button2;
    String responce=null;
    Network network = new Network();
    MyJsonParthCharcacter myJsonParthCharcacter = new MyJsonParthCharcacter();

    class MyAsyncTask extends AsyncTask<URL, Void,String> {

        @Override
        protected String doInBackground(URL... urls) {

            try {
                responce = getResponsFromUrl(urls[0]);

            } catch (IOException e) {
                e.printStackTrace();
            }

            return responce;
        }
        @Override
        protected void onPostExecute(String responce){
            Log.d(TAG,"responce = " + responce);
            myJsonParthCharcacter.jsonPars(responce);
            Log.d(TAG,"onPostExecute all = " +myJsonParthCharcacter.all);
            getText(myJsonParthCharcacter.all);
        }
    }



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.two_activity);
            textView = (TextView) findViewById(R.id.textView);
            button2 = (Button)findViewById(R.id.button2);
            button2.setOnClickListener(this);
            Log.d(TAG,"TwoActiviti onCreate");

            id = getIntent().getStringExtra("id");
            URL generationURL0 = Network.generationURL0();
            new MyAsyncTask().execute(generationURL0);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,OneActivity.class);
        startActivity(intent);
    }

    public void getText (String all){
        Log.d(TAG,"getText = " + all);
        textView.setText(String.valueOf(all));
    }

}
