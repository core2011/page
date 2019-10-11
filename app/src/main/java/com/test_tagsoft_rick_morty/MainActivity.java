package com.test_tagsoft_rick_morty;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.net.URL;

import static com.test_tagsoft_rick_morty.Network.getResponsFromUrl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG="myLog";
    Button button;
    MyJsonParsy myJsonParsy=new MyJsonParsy();
    String responce = null;
    OneActivity oneActivity = new OneActivity();


    class MyAsyncTask extends AsyncTask<URL, Void,String>{

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
            //Log.d(TAG,"responce = " + responce);
            myJsonParsy.parthResponce(responce);
            if (myJsonParsy.strName[493]!=null){
                button.setVisibility(View.VISIBLE);
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button); button.setOnClickListener(this);
        button.setVisibility(View.INVISIBLE);
        URL generationURL = Network.generationURL();
        URL generationURL1 = Network.generationURL1();
        URL generationURL2 = Network.generationURL2();
        URL generationURL3 = Network.generationURL3();
        URL generationURL4 = Network.generationURL4();
        URL generationURL5 = Network.generationURL5();
        URL generationURL6 = Network.generationURL6();
        URL generationURL7 = Network.generationURL7();
        URL generationURL8 = Network.generationURL8();
        URL generationURL9 = Network.generationURL9();
        URL generationURL10 = Network.generationURL10();
        URL generationURL11 = Network.generationURL11();
        URL generationURL12 = Network.generationURL12();
        URL generationURL13 = Network.generationURL13();
        URL generationURL14 = Network.generationURL14();
        URL generationURL15 = Network.generationURL15();
        URL generationURL16 = Network.generationURL16();
        URL generationURL17 = Network.generationURL17();
        URL generationURL18 = Network.generationURL18();
        URL generationURL19 = Network.generationURL19();
        URL generationURL20 = Network.generationURL20();
        URL generationURL21 = Network.generationURL21();
        URL generationURL22 = Network.generationURL22();
        URL generationURL23 = Network.generationURL23();
        URL generationURL24 = Network.generationURL24();
        new MyAsyncTask().execute(generationURL);
        new MyAsyncTask().execute(generationURL1);
        new MyAsyncTask().execute(generationURL2);
        new MyAsyncTask().execute(generationURL3);
        new MyAsyncTask().execute(generationURL4);
        new MyAsyncTask().execute(generationURL5);
        new MyAsyncTask().execute(generationURL6);
        new MyAsyncTask().execute(generationURL7);
        new MyAsyncTask().execute(generationURL8);
        new MyAsyncTask().execute(generationURL9);
        new MyAsyncTask().execute(generationURL10);
        new MyAsyncTask().execute(generationURL11);
        new MyAsyncTask().execute(generationURL12);
        new MyAsyncTask().execute(generationURL13);
        new MyAsyncTask().execute(generationURL14);
        new MyAsyncTask().execute(generationURL15);
        new MyAsyncTask().execute(generationURL16);
        new MyAsyncTask().execute(generationURL17);
        new MyAsyncTask().execute(generationURL18);
        new MyAsyncTask().execute(generationURL19);
        new MyAsyncTask().execute(generationURL20);
        new MyAsyncTask().execute(generationURL21);
        new MyAsyncTask().execute(generationURL22);
        new MyAsyncTask().execute(generationURL23);
        new MyAsyncTask().execute(generationURL24);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, OneActivity.class);
        intent.putExtra("responce",myJsonParsy.strName);
        Log.d(TAG," click strName = " + myJsonParsy.strName[493]);
        startActivity(intent);

    }
}
