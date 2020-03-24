package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_absolute extends AppCompatActivity {

    Button a;
    Button w;
    Button p;
    Button ied;
    Button q;
    Button pr;
    Button s;
    Button t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absolute);

        a = (Button) findViewById(R.id.ab);
        p = (Button) findViewById(R.id.pi);
        w = (Button) findViewById(R.id.wh);
        ied = (Button) findViewById(R.id.i);
        q = (Button) findViewById(R.id.startButton);
        s = (Button) findViewById(R.id.sta);
        pr = (Button) findViewById(R.id.pr);
        t = (Button) findViewById(R.id.ti);


    }

    public void abo (View v) {
        Intent intent = new Intent(activity_absolute.this,AboutActivity.class);
        startActivity(intent);
    }

    public void pic (View v) {
        Intent loginIntent = new Intent(activity_absolute.this, activity_frame.class);
        startActivity(loginIntent);
    }

    public void tips (View v) {
        Intent loginIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/prepare/prevention.html"));
        startActivity(loginIntent);
    }

    public void wh (View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.who.int/"));
        startActivity(intent);
    }

    public void ie (View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.iedcr.gov.bd/index.php/component/content/article/73-ncov-2019"));
        startActivity(intent);
    }

    public void qu (View v) {
        Intent intent = new Intent(activity_absolute.this,QuizActivity.class);
        startActivity(intent);
    }

    public void stat (View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://app.developer.here.com/coronavirus/"));
        startActivity(intent);
    }

    public void pre (View v) {
        Intent intent = new Intent(activity_absolute.this,activity_table.class);
        startActivity(intent);
    }

}
