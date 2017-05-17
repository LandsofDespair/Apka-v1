package com.example.daniel.scrolltest3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//Deklaracja counterów Atrybutów
    private int counterValueStr = 0;
    private TextView counterTextViewStr;
    private int counterValueEnd = 0;
    private TextView counterTextViewEnd;
    private int counterValueKon = 0;
    private TextView counterTextViewKon;
    private int counterValueAgi = 0;
    private TextView counterTextViewAgi;
    private int counterValueInt = 0;
    private TextView counterTextViewInt;
    private int counterValueWil = 0;
    private TextView counterTextViewWil;
    private int counterValueCha = 0;
    private TextView counterTextViewCha;
    private int counterValueAll = 0;
    private TextView counterTextViewAll;

//Deklaracja value Experience

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(MainActivity.this, MainMenu.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Przypisanie findViewById dla Atrybutów
        counterTextViewStr = (TextView)findViewById(R.id.counterTextViewStr);
        counterTextViewEnd = (TextView)findViewById(R.id.counterTextViewEnd);
        counterTextViewKon = (TextView)findViewById(R.id.counterTextViewKon);
        counterTextViewAgi = (TextView)findViewById(R.id.counterTextViewAgi);
        counterTextViewInt = (TextView)findViewById(R.id.counterTextViewInt);
        counterTextViewWil = (TextView)findViewById(R.id.counterTextViewWil);
        counterTextViewCha = (TextView)findViewById(R.id.counterTextViewCha);
        counterTextViewAll = (TextView)findViewById(R.id.counterTextViewAll);

//Przypisanie findViewById dla Experience


    }

//Nabijanie countera Atrybutu - Strengh
    public void PlusButtonStrClicked(View view) {
        if(counterValueStr==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueStr++;
            counterTextViewStr.setText(String.valueOf(counterValueStr));
        }
    }

    public void MinusButtonStrClicked(View view) {
        if(counterValueStr==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueStr--;
            counterTextViewStr.setText(String.valueOf(counterValueStr));
        }
    }

    //Nabijanie countera Atrybutu - Endurance
    public void PlusButtonEndClicked(View view) {
        if(counterValueEnd==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueEnd++;
            counterTextViewEnd.setText(String.valueOf(counterValueEnd));
        }
    }

    public void MinusButtonEndClicked(View view) {
        if(counterValueEnd==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueEnd--;
            counterTextViewEnd.setText(String.valueOf(counterValueEnd));
        }
    }

//Nabijanie countera Atrybutu - Kondition
    public void PlusButtonKonClicked(View view) {
        if(counterValueKon==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueKon++;
            counterTextViewKon.setText(String.valueOf(counterValueKon));
        }
    }

    public void MinusButtonKonClicked(View view) {
        if(counterValueKon==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueKon--;
            counterTextViewKon.setText(String.valueOf(counterValueKon));
        }
    }

//Nabijanie countera Atrybutu - Agility
    public void PlusButtonAgiClicked(View view) {
        if(counterValueAgi==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueAgi++;
            counterTextViewAgi.setText(String.valueOf(counterValueAgi));
        }
    }

    public void MinusButtonAgiClicked(View view) {
        if(counterValueAgi==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueAgi--;
            counterTextViewAgi.setText(String.valueOf(counterValueAgi));
        }
    }

//Nabijanie countera Atrybutu - Intelligence
    public void PlusButtonIntClicked(View view) {
        if(counterValueInt==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueInt++;
            counterTextViewInt.setText(String.valueOf(counterValueInt));
        }
    }

    public void MinusButtonIntClicked(View view) {
        if(counterValueInt==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueInt--;
            counterTextViewInt.setText(String.valueOf(counterValueInt));
        }
    }

//Nabijanie countera Atrybutu - Will
    public void PlusButtonWilClicked(View view) {
        if(counterValueWil==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueWil++;
            counterTextViewWil.setText(String.valueOf(counterValueWil));
        }
    }

    public void MinusButtonWilClicked(View view) {
        if(counterValueWil==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueWil--;
            counterTextViewWil.setText(String.valueOf(counterValueWil));
        }
    }

//Nabijanie countera Atrybutu - Charysma
    public void PlusButtonChaClicked(View view) {
        if(counterValueCha==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueCha++;
            counterTextViewCha.setText(String.valueOf(counterValueCha));
        }
    }

    public void MinusButtonChaClicked(View view) {
        if(counterValueCha==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueCha--;
            counterTextViewCha.setText(String.valueOf(counterValueCha));
        }
    }

//Nabijanie value Experience
    public void buttonExperienceAddClicked(View view) {
        }
}