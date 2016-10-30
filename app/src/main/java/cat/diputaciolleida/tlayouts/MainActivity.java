package cat.diputaciolleida.tlayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Listeners
        Button btLinear = (Button) findViewById(R.id.btLinear);
        btLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),LinearActivity.class );
                startActivity(intent);
            }
        });

        Button btRelative = (Button) findViewById(R.id.btRelative);
        btRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),  RelativeActivity.class );
                startActivity(intent);
            }
        });

        Button btWebView = (Button) findViewById(R.id.btWebview);
        btWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), WebViewActivity.class );
                startActivity(intent);
            }
        });
    }

    public void listViewClick(View v)
    {
        Intent intent = new Intent(v.getContext(), ListViewActivity.class);
        startActivity(intent);
    }

    public void gridViewClick(View v)
    {
        Intent intent = new Intent(v.getContext(), GridViewActivity.class);
        startActivity(intent);
    }

}
