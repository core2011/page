package com.test_tagsoft_rick_morty;

import android.net.Uri;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Network {
    static String TAG="myLog";
    static TwoActivity twoActivity = new TwoActivity();
//    static String id = twoActivity.id;
    private static String nameUrl="https://rickandmortyapi.com/api/character/";
    private static String page1="?page=1";
    private static String page2="?page=2";
    private static String page3="?page=3";
    private static String page4="?page=4";
    private static String page5="?page=5";
    private static String page6="?page=6";
    private static String page7="?page=7";
    private static String page8="?page=8";
    private static String page9="?page=9";
    private static String page10="?page=10";
    private static String page11="?page=11";
    private static String page12="?page=12";
    private static String page13="?page=13";
    private static String page14="?page=14";
    private static String page15="?page=15";
    private static String page16="?page=16";
    private static String page17="?page=17";
    private static String page18="?page=18";
    private static String page19="?page=19";
    private static String page20="?page=20";
    private static String page21="?page=21";
    private static String page22="?page=22";
    private static String page23="?page=23";
    private static String page24="?page=24";
    private static String page25="?page=25";

    public static URL generationURL0 (){
        Log.d(TAG,"id = " + twoActivity.id);
        Uri buildUri = Uri.parse(nameUrl+twoActivity.id)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public static URL generationURL (){
        Uri buildUri = Uri.parse(nameUrl+page1)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public static URL generationURL1 (){
        Uri buildUri = Uri.parse(nameUrl+page2)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public static URL generationURL2 (){
        Uri buildUri = Uri.parse(nameUrl+page3)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL3 (){
        Uri buildUri = Uri.parse(nameUrl+page4)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL4 (){
        Uri buildUri = Uri.parse(nameUrl+page5)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL5 (){
        Uri buildUri = Uri.parse(nameUrl+page6)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL6 (){
        Uri buildUri = Uri.parse(nameUrl+page7)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL7 (){
        Uri buildUri = Uri.parse(nameUrl+page8)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL8 (){
        Uri buildUri = Uri.parse(nameUrl+page9)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL9 (){
        Uri buildUri = Uri.parse(nameUrl+page10)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL10 () {
        Uri buildUri = Uri.parse(nameUrl + page11)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }
        public static URL generationURL11 (){
            Uri buildUri = Uri.parse(nameUrl+page12)
                    .buildUpon()
                    .build();

            URL url = null;
            try {
                url = new URL(buildUri.toString());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return url;
        }
     public static URL generationURL12 (){
        Uri buildUri = Uri.parse(nameUrl+page13)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL13 (){
        Uri buildUri = Uri.parse(nameUrl+page14)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL14 (){
        Uri buildUri = Uri.parse(nameUrl+page15)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL15 (){
        Uri buildUri = Uri.parse(nameUrl+page16)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL16 (){
        Uri buildUri = Uri.parse(nameUrl+page17)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL17 (){
        Uri buildUri = Uri.parse(nameUrl+page18)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL18 (){
        Uri buildUri = Uri.parse(nameUrl+page19)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL19 (){
        Uri buildUri = Uri.parse(nameUrl+page20)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL20 (){
        Uri buildUri = Uri.parse(nameUrl+page21)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL21 (){
        Uri buildUri = Uri.parse(nameUrl+page22)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL22 (){
        Uri buildUri = Uri.parse(nameUrl+page23)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL23 (){
        Uri buildUri = Uri.parse(nameUrl+page24)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    } public static URL generationURL24 (){
        Uri buildUri = Uri.parse(nameUrl+page25)
                .buildUpon()
                .build();

        URL url = null;
        try {
            url = new URL(buildUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    public static String getResponsFromUrl (URL url) throws IOException {
        HttpURLConnection urlConnection =(HttpURLConnection) url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                return scanner.next();
            } else {
                return null;
            }
        } finally {
            urlConnection.disconnect();
        }
    }
}
