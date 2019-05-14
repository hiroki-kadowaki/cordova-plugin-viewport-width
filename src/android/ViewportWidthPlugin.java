package jp.kadowaki.cordova.plugin;

import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

public class ViewportWidthPlugin extends CordovaPlugin {
  private static final String TAG = "ViewportWidthPlugin";

  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    Log.i(TAG, "initialize");
    super.initialize(cordova, webView);

    final WebSettings settings = ((WebView)webView.getView()).getSettings();
    settings.setUseWideViewPort(true);
    settings.setLoadWithOverviewMode(true);
  }
}
