package com.mhdsyarif.melayu.odoowebview;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by MhdSyarif on 14/02/2017.
 */

public class MyAppWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
