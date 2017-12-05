package com.gss.testwv;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        SharedPreferences sharedPreferences = this.getSharedPreferences("gameSetting", Context.MODE_PRIVATE);
        if("".equals(sharedPreferences.getString("test", ""))) {
            SharedPreferences.Editor editor = sharedPreferences.edit();

            editor.putString("test","Hello World");

            editor.apply();
        } else {
            String test = sharedPreferences.getString("test", "");
            textView.setText(test);
        }
    }
}
