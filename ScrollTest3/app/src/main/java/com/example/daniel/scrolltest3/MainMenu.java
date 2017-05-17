package com.example.daniel.scrolltest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(MainMenu.this, StartupMenu.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void kartyPostaciClicked(View view) {
        startActivity(new Intent().setClass(MainMenu.this, MainActivity.class).setData(getIntent().getData()));
        finish();
    }

    public void dicesClicked(View view) {
        startActivity(new Intent().setClass(MainMenu.this, Dices.class).setData(getIntent().getData()));
        finish();
    }
}
