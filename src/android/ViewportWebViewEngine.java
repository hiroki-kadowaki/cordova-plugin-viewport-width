package jp.kadowaki.cordova.engine;

import android.webkit.WebSettings;
import android.content.Context;
import org.apache.cordova.*;
import org.apache.cordova.engine.SystemWebViewEngine;
import org.apache.cordova.engine.SystemWebView;

public class ViewportWebViewEngine extends SystemWebViewEngine {
    public static final String TAG = "ViewportWebViewEngine";
    
    public ViewportWebViewEngine(Context context, CordovaPreferences preferences) {
        super(context, preferences);
    }

    public ViewportWebViewEngine(SystemWebView webView) {
        super(webView, null);
    }

    public ViewportWebViewEngine(SystemWebView webView, CordovaPreferences preferences) {
        super(webView, preferences);
    }
    
    @Override
    public void init(CordovaWebView parentWebView, CordovaInterface cordova, CordovaWebViewEngine.Client client,
              CordovaResourceApi resourceApi, PluginManager pluginManager,
              NativeToJsMessageQueue nativeToJsMessageQueue) {
        super.init(parentWebView, cordova, client, resourceApi, pluginManager, nativeToJsMessageQueue);
        
        final WebSettings settings = webView.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
    }
}