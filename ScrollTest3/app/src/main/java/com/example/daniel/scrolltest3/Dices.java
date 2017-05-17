package com.example.daniel.scrolltest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class Dices extends AppCompatActivity {

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(Dices.this, MainMenu.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dices);
    }


}
