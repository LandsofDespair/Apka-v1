package com.example.daniel.myapplication;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {

    private int counterValue = 0;
    private TextView counterTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = (TextView)findViewById(R.id.counterTextView);
    }

    public void PlusButtonClicked(View view) {
        if(counterValue==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczono_zakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValue++;
            counterTextView.setText(String.valueOf(counterValue));
        }
    }

    public void MinusButtonClicked(View view) {
        if(counterValue==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczono_zakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValue--;
            counterTextView.setText(String.valueOf(counterValue));
        }
    }
}
