package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button b;
    Button p;
    Button a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (Button) findViewById(R.id.ab);
        b = (Button) findViewById(R.id.in);
        p = (Button) findViewById(R.id.pi);
    }

    public void abo (View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Coronavirus"));
        startActivity(intent);
    }

    public void info(View v) {
            Intent loginIntent = new Intent(MainActivity.this, activity_absolute.class);
            startActivity(loginIntent);
    }


}
