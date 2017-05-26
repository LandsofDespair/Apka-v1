package com.example.daniel.scrolltest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Karta1_Wytrzymalosc extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karta1__wytrzymalosc);
    }
}
