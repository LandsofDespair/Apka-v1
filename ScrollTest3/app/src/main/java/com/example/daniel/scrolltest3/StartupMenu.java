package com.example.daniel.scrolltest3;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class StartupMenu extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed()
    {
        if (doubleBackToExitPressedOnce) {
        super.onBackPressed();
        return;
    }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Wciśnij raz jeszcze, by wyjść z aplikacij", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup_menu);
    }

    public void logoClicked(View view) {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "Wciśnij napis!", Toast.LENGTH_LONG).show();
            }
        }, 000);
    }

    public void napisClicked(View view) {
        startActivity(new Intent(this,MainMenu.class));
    }



}
