package com.test_tagsoft_rick_morty;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class OneActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    final String TAG="myLog";
    MyJsonParsy myJsonParsy = new MyJsonParsy();
    public String [] strName= new String [494];
    final String [] strInformation= new String [494];
    ListView listView;

    public void getStr (String [] myStrings){
//        strName = myStrings;
//
//        if (strName[493]!=null) {
//            //strInformation=strName;
//            for (int i =0; i<myStrings.length; i++){
//                strName[i]=myStrings[i];
//            }
//            for (int i=0;i<strName.length; i++){
//                Log.d(TAG,"OneActiviti myName = "+i + " " + strName[i]);
//            }
//        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_activity);

        strName=getIntent().getStringArrayExtra("responce");

        strName[0] ="Test";

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, strName);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(this);


        Log.d(TAG,"onCreate one_activity");

    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View view, int position, long id) {
        Log.d(TAG,"itimeClick: position = "+ position + ", id = " + id);
        Toast.makeText(getApplicationContext(),((TextView)view).getText(),Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, TwoActivity.class);
        intent.putExtra("name", ((TextView)view).getText().toString());
        intent.putExtra("id",Integer.toString(position));
        startActivity(intent);
    }
}
