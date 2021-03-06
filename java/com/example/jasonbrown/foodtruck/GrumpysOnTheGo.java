package com.example.jasonbrown.foodtruck;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Jason_Brown on 4/28/2016.
 */
public class GrumpysOnTheGo extends Activity {
    private WebView wv;

    //This shows the website or facebook page of the
    //listed food truck as a webview on the current
    //activity.
    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.webpage);

        WebView wv = (WebView) findViewById(R.id.webpages);
        wv.setWebViewClient(new myWebViewClient());

        String url = "http://grumpys.net/";

        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(url);
    }

    private class myWebViewClient extends WebViewClient {
        public boolean OverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
