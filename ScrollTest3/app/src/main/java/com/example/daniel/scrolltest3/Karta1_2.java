package com.example.daniel.scrolltest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Karta1_2 extends AppCompatActivity {

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        this.finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karta1_2);
    }

    public void reverse(View view) {
        this.finish();
    }
}
