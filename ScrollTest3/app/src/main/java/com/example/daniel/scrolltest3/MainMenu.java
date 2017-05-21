package com.example.daniel.scrolltest3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import junit.framework.Test;

import java.util.ArrayList;

public class MainMenu extends AppCompatActivity {


    ArrayAdapter<String> adapter;
    EditText editText;
    ArrayList<String> itemList;

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        this.finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    }

    public void kartyPostaciClicked(View view) {
        startActivity(new Intent(this,ListaKart.class));
    }

    public void dicesClicked(View view) {
        startActivity(new Intent(this,Dices.class));
    }

    public void landsclicked(View view) {
        startActivity(new Intent(this,WebPage.class));
    }

    public void webpagelandsClicked(View view) {
        startActivity(new Intent(this,Test2.class));
    }



}
