package cat.diputaciolleida.tlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        //Show it in the same window
        myWebView.setWebViewClient(new WebViewClient());
        //myWebView.loadUrl("http://www.udl.cat");
        myWebView.loadUrl(getResources().getString(R.string.myUrl));
    }
}
