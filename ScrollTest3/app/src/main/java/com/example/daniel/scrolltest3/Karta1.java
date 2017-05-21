package com.example.daniel.scrolltest3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.StreamCorruptedException;

public class Karta1 extends AppCompatActivity implements View.OnClickListener {

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
    private EditText Gracz;
    private EditText Kampania;
    private EditText Mistrz_Gry;
    private EditText Imie;
    private EditText Rasa;
    private EditText Profesja;
    private EditText Sylwetka;
    private EditText Znaki;
    private EditText Wiek;
    private EditText Wzrost;
    private EditText Waga;
    private EditText Pochodzenie;
    private EditText Rodzina;
    private EditText Kolor_Skory;
    private EditText Kolor_Oczu;
    private EditText Kolor_Wlosow;
    private EditText valueExperience1;
    private EditText valueExperience1All;
    private EditText Weapon1;
    private EditText Weapon1Damage;
    private EditText Weapon1Weight;
    private EditText Weapon1Ammunition;
    private EditText Weapon1Range;
    private CheckBox Weapon1Durability1;
    private CheckBox Weapon1Durability2;
    private CheckBox Weapon1Durability3;
    private CheckBox Weapon1Durability4;
    private CheckBox Weapon1Durability5;
    private EditText Weapon2;
    private EditText Weapon2Damage;
    private EditText Weapon2Weight;
    private EditText Weapon2Ammunition;
    private EditText Weapon2Range;
    private CheckBox Weapon2Durability1;
    private CheckBox Weapon2Durability2;
    private CheckBox Weapon2Durability3;
    private CheckBox Weapon2Durability4;
    private CheckBox Weapon2Durability5;
    private EditText Weapon3;
    private EditText Weapon3Damage;
    private EditText Weapon3Weight;
    private EditText Weapon3Ammunition;
    private EditText Weapon3Range;
    private CheckBox Weapon3Durability1;
    private CheckBox Weapon3Durability2;
    private CheckBox Weapon3Durability3;
    private CheckBox Weapon3Durability4;
    private CheckBox Weapon3Durability5;
    static final int READ_BLOCK_SIZE = 100;
    private TextView Weapon1DurabilityCheck;

//Deklaracja value Experience

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
        setContentView(R.layout.activity_karta1);
        Gracz = (EditText) findViewById(R.id.Gracz);
        Kampania = (EditText) findViewById(R.id.Kampania);
        Mistrz_Gry = (EditText) findViewById(R.id.MistrzGry);
        Imie = (EditText) findViewById(R.id.Imie);
        Rasa = (EditText) findViewById(R.id.Rasa);
        Profesja = (EditText) findViewById(R.id.Profesja);
        Sylwetka = (EditText) findViewById(R.id.Sylwetka);
        Znaki = (EditText) findViewById(R.id.Znaki);
        Wiek = (EditText) findViewById(R.id.Wiek);
        Wzrost = (EditText) findViewById(R.id.Wzrost);
        Waga = (EditText) findViewById(R.id.Waga);
        Pochodzenie = (EditText) findViewById(R.id.Pochodzenie);
        Rodzina = (EditText) findViewById(R.id.Rodzina);
        Kolor_Skory = (EditText) findViewById(R.id.KolorSkory);
        Kolor_Oczu = (EditText) findViewById(R.id.KolorOczu);
        Kolor_Wlosow = (EditText) findViewById(R.id.KolorWlosow);
        valueExperience1 = (EditText) findViewById(R.id.valueExperience);
        valueExperience1All = (EditText) findViewById(R.id.valueExperienceAll);
        Weapon1 = (EditText) findViewById(R.id.Weapon1);
        Weapon1Damage = (EditText) findViewById(R.id.Weapon1Damage);
        Weapon1Weight = (EditText) findViewById(R.id.Weapon1Weight);
        Weapon1Ammunition = (EditText) findViewById(R.id.Weapon1Ammunition);
        Weapon1Range = (EditText) findViewById(R.id.Weapon1Range);
        Weapon1Durability1 = (CheckBox) findViewById(R.id.Weapon1Durability1);
        Weapon1Durability2 = (CheckBox) findViewById(R.id.Weapon1Durability2);
        Weapon1Durability3 = (CheckBox) findViewById(R.id.Weapon1Durability3);
        Weapon1Durability4 = (CheckBox) findViewById(R.id.Weapon1Durability4);
        Weapon1Durability5 = (CheckBox) findViewById(R.id.Weapon1Durability5);
        Weapon2 = (EditText) findViewById(R.id.Weapon2);
        Weapon2Damage = (EditText) findViewById(R.id.Weapon2Damage);
        Weapon2Weight = (EditText) findViewById(R.id.Weapon2Weight);
        Weapon2Ammunition = (EditText) findViewById(R.id.Weapon2Ammunition);
        Weapon2Range = (EditText) findViewById(R.id.Weapon2Range);
        Weapon2Durability1 = (CheckBox) findViewById(R.id.Weapon2Durability1);
        Weapon2Durability2 = (CheckBox) findViewById(R.id.Weapon2Durability2);
        Weapon2Durability3 = (CheckBox) findViewById(R.id.Weapon2Durability3);
        Weapon2Durability4 = (CheckBox) findViewById(R.id.Weapon2Durability4);
        Weapon2Durability5 = (CheckBox) findViewById(R.id.Weapon2Durability5);
        Weapon3 = (EditText) findViewById(R.id.Weapon3);
        Weapon3Damage = (EditText) findViewById(R.id.Weapon3Damage);
        Weapon3Weight = (EditText) findViewById(R.id.Weapon3Weight);
        Weapon3Ammunition = (EditText) findViewById(R.id.Weapon3Ammunition);
        Weapon3Range = (EditText) findViewById(R.id.Weapon3Range);
        Weapon3Durability1 = (CheckBox) findViewById(R.id.Weapon3Durability1);
        Weapon3Durability2 = (CheckBox) findViewById(R.id.Weapon3Durability2);
        Weapon3Durability3 = (CheckBox) findViewById(R.id.Weapon3Durability3);
        Weapon3Durability4 = (CheckBox) findViewById(R.id.Weapon3Durability4);
        Weapon3Durability5 = (CheckBox) findViewById(R.id.Weapon3Durability5);
        try {
            load();
        } catch (IOException e) {
            e.printStackTrace();
        }

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

    public void save(View view) {
        try {
            FileOutputStream fileoutinputgracz = openFileOutput("inputgracz.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputgracz = new OutputStreamWriter(fileoutinputgracz);
            outputWriterinputgracz.write(Gracz.getText().toString());
            outputWriterinputgracz.close();

            FileOutputStream fileoutinputkampania = openFileOutput("inputkampania.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputkampania = new OutputStreamWriter(fileoutinputkampania);
            outputWriterinputkampania.write(Kampania.getText().toString());
            outputWriterinputkampania.close();

            FileOutputStream fileoutinputmistrzgry = openFileOutput("inputmistrzgry.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputmistrzgry = new OutputStreamWriter(fileoutinputmistrzgry);
            outputWriterinputmistrzgry.write(Mistrz_Gry.getText().toString());
            outputWriterinputmistrzgry.close();

            FileOutputStream fileoutinputimie = openFileOutput("inputimie.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputimie = new OutputStreamWriter(fileoutinputimie);
            outputWriterinputimie.write(Imie.getText().toString());
            outputWriterinputimie.close();

            FileOutputStream fileoutinputrasa = openFileOutput("inputrasa.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputrasa = new OutputStreamWriter(fileoutinputrasa);
            outputWriterinputrasa.write(Rasa.getText().toString());
            outputWriterinputrasa.close();

            FileOutputStream fileoutinputprofesja = openFileOutput("inputprofesja.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputprofesja = new OutputStreamWriter(fileoutinputprofesja);
            outputWriterinputprofesja.write(Profesja.getText().toString());
            outputWriterinputprofesja.close();

            FileOutputStream fileoutinputsylwetka = openFileOutput("inputsylwetka.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputsylwetka = new OutputStreamWriter(fileoutinputsylwetka);
            outputWriterinputsylwetka.write(Sylwetka.getText().toString());
            outputWriterinputsylwetka.close();

            FileOutputStream fileoutinputznaki = openFileOutput("inputznaki.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputznaki = new OutputStreamWriter(fileoutinputznaki);
            outputWriterinputznaki.write(Znaki.getText().toString());
            outputWriterinputznaki.close();

            FileOutputStream fileoutinputwiek = openFileOutput("inputwiek.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputwiek = new OutputStreamWriter(fileoutinputwiek);
            outputWriterinputwiek.write(Wiek.getText().toString());
            outputWriterinputwiek.close();

            FileOutputStream fileoutinputwzrost = openFileOutput("inputwzrost.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputwzrost = new OutputStreamWriter(fileoutinputwzrost);
            outputWriterinputwzrost.write(Wzrost.getText().toString());
            outputWriterinputwzrost.close();

            FileOutputStream fileoutinputwaga = openFileOutput("inputwaga.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputwaga = new OutputStreamWriter(fileoutinputwaga);
            outputWriterinputwaga.write(Waga.getText().toString());
            outputWriterinputwaga.close();

            FileOutputStream fileoutinputpochodzenie = openFileOutput("inputpochodzenie.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputpochodzenie = new OutputStreamWriter(fileoutinputpochodzenie);
            outputWriterinputpochodzenie.write(Pochodzenie.getText().toString());
            outputWriterinputpochodzenie.close();

            FileOutputStream fileoutinputrodzina = openFileOutput("inputrodzina.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputrodzina = new OutputStreamWriter(fileoutinputrodzina);
            outputWriterinputrodzina.write(Rodzina.getText().toString());
            outputWriterinputrodzina.close();

            FileOutputStream fileoutinputkolorskory = openFileOutput("inputkolorskory.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputkolorskory = new OutputStreamWriter(fileoutinputkolorskory);
            outputWriterinputkolorskory.write(Kolor_Skory.getText().toString());
            outputWriterinputkolorskory.close();

            FileOutputStream fileoutinputkoloroczu = openFileOutput("inputkoloroczu.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputkoloroczu = new OutputStreamWriter(fileoutinputkoloroczu);
            outputWriterinputkoloroczu.write(Kolor_Oczu.getText().toString());
            outputWriterinputkoloroczu.close();

            FileOutputStream fileoutinputkolorwlosow = openFileOutput("inputkolorwlosow.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputkolorwlosow = new OutputStreamWriter(fileoutinputkolorwlosow);
            outputWriterinputkolorwlosow.write(Kolor_Wlosow.getText().toString());
            outputWriterinputkolorwlosow.close();

            FileOutputStream fileoutinputcounterTextViewStr = openFileOutput("inputcounterTextViewStr.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputcounterTextViewStr = new OutputStreamWriter(fileoutinputcounterTextViewStr);
            outputWriterinputcounterTextViewStr.write(counterTextViewStr.getText().toString());
            outputWriterinputcounterTextViewStr.close();

            FileOutputStream fileoutinputcounterTextViewEnd = openFileOutput("inputcounterTextViewEnd.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputcounterTextViewEnd = new OutputStreamWriter(fileoutinputcounterTextViewEnd);
            outputWriterinputcounterTextViewEnd.write(counterTextViewEnd.getText().toString());
            outputWriterinputcounterTextViewEnd.close();

            FileOutputStream fileoutinputcounterTextViewKon = openFileOutput("inputcounterTextViewKon.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputcounterTextViewKon = new OutputStreamWriter(fileoutinputcounterTextViewKon);
            outputWriterinputcounterTextViewKon.write(counterTextViewKon.getText().toString());
            outputWriterinputcounterTextViewKon.close();

            FileOutputStream fileoutinputcounterTextViewAgi = openFileOutput("inputcounterTextViewAgi.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputcounterTextViewAgi = new OutputStreamWriter(fileoutinputcounterTextViewAgi);
            outputWriterinputcounterTextViewAgi.write(counterTextViewAgi.getText().toString());
            outputWriterinputcounterTextViewAgi.close();

            FileOutputStream fileoutinputcounterTextViewInt = openFileOutput("inputcounterTextViewInt.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputcounterTextViewInt = new OutputStreamWriter(fileoutinputcounterTextViewInt);
            outputWriterinputcounterTextViewInt.write(counterTextViewInt.getText().toString());
            outputWriterinputcounterTextViewInt.close();

            FileOutputStream fileoutinputcounterTextViewWil = openFileOutput("inputcounterTextViewWil.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputcounterTextViewWil = new OutputStreamWriter(fileoutinputcounterTextViewWil);
            outputWriterinputcounterTextViewWil.write(counterTextViewWil.getText().toString());
            outputWriterinputcounterTextViewWil.close();

            FileOutputStream fileoutinputcounterTextViewCha = openFileOutput("inputcounterTextViewCha.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputcounterTextViewCha = new OutputStreamWriter(fileoutinputcounterTextViewCha);
            outputWriterinputcounterTextViewCha.write(counterTextViewCha.getText().toString());
            outputWriterinputcounterTextViewCha.close();

            FileOutputStream fileoutinputvalueExperience = openFileOutput("inputvalueExperience.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputvalueExperience = new OutputStreamWriter(fileoutinputvalueExperience);
            outputWriterinputvalueExperience.write(valueExperience1.getText().toString());
            outputWriterinputvalueExperience.close();

            FileOutputStream fileoutinputvalueExperienceAll = openFileOutput("inputvalueExperienceAll.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputvalueExperienceAll = new OutputStreamWriter(fileoutinputvalueExperienceAll);
            outputWriterinputvalueExperienceAll.write(valueExperience1All.getText().toString());
            outputWriterinputvalueExperienceAll.close();

            FileOutputStream fileoutinputWeapon1 = openFileOutput("inputWeapon1.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon1 = new OutputStreamWriter(fileoutinputWeapon1);
            outputWriterinputWeapon1.write(Weapon1.getText().toString());
            outputWriterinputWeapon1.close();

            FileOutputStream fileoutinputWeapon1Damage = openFileOutput("inputWeapon1Damage.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon1Damage = new OutputStreamWriter(fileoutinputWeapon1Damage);
            outputWriterinputWeapon1Damage.write(Weapon1Damage.getText().toString());
            outputWriterinputWeapon1Damage.close();

            FileOutputStream fileoutinputWeapon1Weight = openFileOutput("inputWeapon1Weight.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon1Weight = new OutputStreamWriter(fileoutinputWeapon1Weight);
            outputWriterinputWeapon1Weight.write(Weapon1Weight.getText().toString());
            outputWriterinputWeapon1Weight.close();

            FileOutputStream fileoutinputWeapon1Ammunition = openFileOutput("inputWeapon1Ammunition.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon1Ammunition = new OutputStreamWriter(fileoutinputWeapon1Ammunition);
            outputWriterinputWeapon1Ammunition.write(Weapon1Ammunition.getText().toString());
            outputWriterinputWeapon1Ammunition.close();

            FileOutputStream fileoutinputWeapon1Range = openFileOutput("inputWeapon1Range.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon1Range = new OutputStreamWriter(fileoutinputWeapon1Range);
            outputWriterinputWeapon1Range.write(Weapon1Range.getText().toString());
            outputWriterinputWeapon1Range.close();

            Toast.makeText(getBaseContext(), "Karta została zapisana!",
                    Toast.LENGTH_SHORT).show();

            saveChecked("Weapon1Durability1", Weapon1Durability1.isChecked());
            saveChecked("Weapon1Durability2", Weapon1Durability2.isChecked());
            saveChecked("Weapon1Durability3", Weapon1Durability3.isChecked());
            saveChecked("Weapon1Durability4", Weapon1Durability4.isChecked());
            saveChecked("Weapon1Durability5", Weapon1Durability5.isChecked());
            saveChecked("Weapon2Durability1", Weapon2Durability1.isChecked());
            saveChecked("Weapon2Durability2", Weapon2Durability2.isChecked());
            saveChecked("Weapon2Durability3", Weapon2Durability3.isChecked());
            saveChecked("Weapon2Durability4", Weapon2Durability4.isChecked());
            saveChecked("Weapon2Durability5", Weapon2Durability5.isChecked());
            saveChecked("Weapon3Durability1", Weapon3Durability1.isChecked());
            saveChecked("Weapon3Durability2", Weapon3Durability2.isChecked());
            saveChecked("Weapon3Durability3", Weapon3Durability3.isChecked());
            saveChecked("Weapon3Durability4", Weapon3Durability4.isChecked());
            saveChecked("Weapon3Durability5", Weapon3Durability5.isChecked());
        } catch (Exception e) {
            e.printStackTrace();
        };
    }

    private void saveChecked(String CheckboxName, boolean isChecked) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(CheckboxName, isChecked);
        editor.commit();
    }

    private boolean loadChecked(String CheckboxName) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(CheckboxName, false);
    }

    private void load() throws IOException {
        Weapon1Durability1.setChecked(loadChecked("Weapon1Durability1"));
        Weapon1Durability2.setChecked(loadChecked("Weapon1Durability2"));
        Weapon1Durability3.setChecked(loadChecked("Weapon1Durability3"));
        Weapon1Durability4.setChecked(loadChecked("Weapon1Durability4"));
        Weapon1Durability5.setChecked(loadChecked("Weapon1Durability5"));
        Weapon2Durability1.setChecked(loadChecked("Weapon2Durability1"));
        Weapon2Durability2.setChecked(loadChecked("Weapon2Durability2"));
        Weapon2Durability3.setChecked(loadChecked("Weapon2Durability3"));
        Weapon2Durability4.setChecked(loadChecked("Weapon2Durability4"));
        Weapon2Durability5.setChecked(loadChecked("Weapon2Durability5"));
        Weapon3Durability1.setChecked(loadChecked("Weapon3Durability1"));
        Weapon3Durability2.setChecked(loadChecked("Weapon3Durability2"));
        Weapon3Durability3.setChecked(loadChecked("Weapon3Durability3"));
        Weapon3Durability4.setChecked(loadChecked("Weapon3Durability4"));
        Weapon3Durability5.setChecked(loadChecked("Weapon3Durability5"));
        try {
            FileInputStream fileIninputgracz = openFileInput("inputgracz.txt");
            InputStreamReader InputReadgracz = new InputStreamReader(fileIninputgracz);

            char[] inputBuffer = new char[READ_BLOCK_SIZE];
            String gracz = "";
            int charRead;
            while ((charRead = InputReadgracz.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                gracz += readstring;
            }

            InputReadgracz.close();
            Gracz.setText(gracz);

            FileInputStream fileIninputkampania = openFileInput("inputkampania.txt");
            InputStreamReader InputReadkampania = new InputStreamReader(fileIninputkampania);

            String kampania = "";

            while ((charRead = InputReadkampania.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                kampania += readstring;
            }
            InputReadkampania.close();
            Kampania.setText(kampania);

            FileInputStream fileIninputmistrzgry = openFileInput("inputmistrzgry.txt");
            InputStreamReader InputReadmistrzgry = new InputStreamReader(fileIninputmistrzgry);

            String mistrzgry = "";

            while ((charRead = InputReadmistrzgry.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                mistrzgry += readstring;
            }
            InputReadmistrzgry.close();
            Mistrz_Gry.setText(mistrzgry);

            FileInputStream fileIninputimie = openFileInput("inputimie.txt");
            InputStreamReader InputReadimie = new InputStreamReader(fileIninputimie);

            String imie = "";

            while ((charRead = InputReadimie.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                imie += readstring;
            }
            InputReadimie.close();
            Imie.setText(imie);


            FileInputStream fileIninputrasa = openFileInput("inputrasa.txt");
            InputStreamReader InputReadrasa = new InputStreamReader(fileIninputrasa);

            String rasa = "";

            while ((charRead = InputReadrasa.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                rasa += readstring;
            }
            InputReadrasa.close();
            Rasa.setText(rasa);

            FileInputStream fileIninputprofesja = openFileInput("inputprofesja.txt");
            InputStreamReader InputReadprofesja = new InputStreamReader(fileIninputprofesja);

            String profesja = "";

            while ((charRead = InputReadprofesja.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                profesja += readstring;
            }
            InputReadprofesja.close();
            Profesja.setText(profesja);

            FileInputStream fileIninputsylwetka = openFileInput("inputsylwetka.txt");
            InputStreamReader InputReadsylwetka = new InputStreamReader(fileIninputsylwetka);

            String sylwetka = "";

            while ((charRead = InputReadsylwetka.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                sylwetka += readstring;
            }
            InputReadsylwetka.close();
            Sylwetka.setText(sylwetka);

            FileInputStream fileIninputznaki = openFileInput("inputznaki.txt");
            InputStreamReader InputReadznaki = new InputStreamReader(fileIninputznaki);

            String znaki = "";

            while ((charRead = InputReadznaki.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                znaki += readstring;
            }
            InputReadznaki.close();
            Znaki.setText(znaki);

            FileInputStream fileIninputwiek = openFileInput("inputwiek.txt");
            InputStreamReader InputReadwiek = new InputStreamReader(fileIninputwiek);

            String wiek = "";

            while ((charRead = InputReadwiek.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                wiek += readstring;
            }
            InputReadwiek.close();
            Wiek.setText(wiek);

            FileInputStream fileIninputwzrost = openFileInput("inputwzrost.txt");
            InputStreamReader InputReadwzrost = new InputStreamReader(fileIninputwzrost);

            String wzrost = "";

            while ((charRead = InputReadwzrost.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                wzrost += readstring;
            }
            InputReadwzrost.close();
            Wzrost.setText(wzrost);

            FileInputStream fileIninputwaga = openFileInput("inputwaga.txt");
            InputStreamReader InputReadwaga = new InputStreamReader(fileIninputwaga);

            String waga = "";

            while ((charRead = InputReadwaga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                waga += readstring;
            }
            InputReadwaga.close();
            Waga.setText(waga);

            FileInputStream fileIninputpochodzenie = openFileInput("inputpochodzenie.txt");
            InputStreamReader InputReadpochodzenie = new InputStreamReader(fileIninputpochodzenie);

            String pochodzenie = "";

            while ((charRead = InputReadpochodzenie.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                pochodzenie += readstring;
            }
            InputReadpochodzenie.close();
            Pochodzenie.setText(pochodzenie);

            FileInputStream fileIninputrodzina = openFileInput("inputrodzina.txt");
            InputStreamReader InputReadrodzina = new InputStreamReader(fileIninputrodzina);

            String rodzina = "";

            while ((charRead = InputReadrodzina.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                rodzina += readstring;
            }
            InputReadrodzina.close();
            Rodzina.setText(rodzina);

            FileInputStream fileIninputkolorskory = openFileInput("inputkolorskory.txt");
            InputStreamReader InputReadkolorskory = new InputStreamReader(fileIninputkolorskory);

            String kolorskory = "";

            while ((charRead = InputReadkolorskory.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                kolorskory += readstring;
            }
            InputReadkolorskory.close();
            Kolor_Skory.setText(kolorskory);

            FileInputStream fileIninputkolorwlosow = openFileInput("inputkolorwlosow.txt");
            InputStreamReader InputReadkolorwlosow = new InputStreamReader(fileIninputkolorwlosow);

            String kolorwlosow = "";

            while ((charRead = InputReadkolorwlosow.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                kolorwlosow += readstring;
            }
            InputReadkolorwlosow.close();
            Kolor_Wlosow.setText(kolorwlosow);

            FileInputStream fileIninputkoloroczu = openFileInput("inputkoloroczu.txt");
            InputStreamReader InputReadkoloroczu = new InputStreamReader(fileIninputkoloroczu);

            String koloroczu = "";

            while ((charRead = InputReadkoloroczu.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                koloroczu += readstring;
            }
            InputReadkoloroczu.close();
            Kolor_Oczu.setText(koloroczu);

            FileInputStream fileIninputvalueExperience = openFileInput("inputvalueExperience.txt");
            InputStreamReader InputReadvalueExperience = new InputStreamReader(fileIninputvalueExperience);

            String valueExperience = "";

            while ((charRead = InputReadvalueExperience.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                valueExperience += readstring;
            }
            InputReadvalueExperience.close();
            valueExperience1.setText(valueExperience);

            FileInputStream fileIninputvalueExperienceAll = openFileInput("inputvalueExperienceAll.txt");
            InputStreamReader InputReadvalueExperienceAll = new InputStreamReader(fileIninputvalueExperienceAll);

            String valueExperienceAll = "";

            while ((charRead = InputReadvalueExperienceAll.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                valueExperienceAll += readstring;
            }
            InputReadvalueExperienceAll.close();
            valueExperience1All.setText(valueExperienceAll);

            FileInputStream fileIninputWeapon1 = openFileInput("inputWeapon1.txt");
            InputStreamReader InputReadWeapon1 = new InputStreamReader(fileIninputWeapon1);

            String Weapon11 = "";

            while ((charRead = InputReadWeapon1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon11 += readstring;
            }
            InputReadWeapon1.close();
            Weapon1.setText(Weapon11);

            FileInputStream fileIninputWeapon1Damage = openFileInput("inputWeapon1Damage.txt");
            InputStreamReader InputReadWeapon1Damage = new InputStreamReader(fileIninputWeapon1Damage);

            String Weapon1Damage1 = "";

            while ((charRead = InputReadWeapon1Damage.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon1Damage1 += readstring;
            }
            InputReadWeapon1Damage.close();
            Weapon1Damage.setText(Weapon1Damage1);

            FileInputStream fileIninputWeapon1Weight = openFileInput("inputWeapon1Weight.txt");
            InputStreamReader InputReadWeapon1Weight = new InputStreamReader(fileIninputWeapon1Weight);

            String Weapon1Weight1 = "";

            while ((charRead = InputReadWeapon1Weight.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon1Weight1 += readstring;
            }
            InputReadWeapon1Weight.close();
            Weapon1Weight.setText(Weapon1Weight1);

            FileInputStream fileIninputWeapon1Ammunition = openFileInput("inputWeapon1Ammunition.txt");
            InputStreamReader InputReadWeapon1Ammunition = new InputStreamReader(fileIninputWeapon1Ammunition);

            String Weapon1Ammunition1 = "";

            while ((charRead = InputReadWeapon1Ammunition.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon1Ammunition1 += readstring;
            }
            InputReadWeapon1Ammunition.close();
            Weapon1Ammunition.setText(Weapon1Ammunition1);

            FileInputStream fileIninputWeapon1Range = openFileInput("inputWeapon1Range.txt");
            InputStreamReader InputReadWeapon1Range = new InputStreamReader(fileIninputWeapon1Range);

            String Weapon1Range1 = "";

            while ((charRead = InputReadWeapon1Range.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon1Range1 += readstring;
            }
            InputReadWeapon1Range.close();
            Weapon1Range.setText(Weapon1Range1);


            FileInputStream fileIninputWeapon1Durability2 = openFileInput("inputWeapon1Durability2.txt");
            InputStreamReader InputReadWeapon1Durability2 = new InputStreamReader(fileIninputWeapon1Durability2);

            String Weapon1Durability21 = "";

            while ((charRead = InputReadWeapon1Durability2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon1Durability21 += readstring;
            }
            InputReadWeapon1Durability2.close();
            Weapon1Durability2.setText(Weapon1Durability21);

            FileInputStream fileIninputWeapon1Durability3 = openFileInput("inputWeapon1Durability3.txt");
            InputStreamReader InputReadWeapon1Durability3 = new InputStreamReader(fileIninputWeapon1Durability3);

            String Weapon1Durability31 = "";

            while ((charRead = InputReadWeapon1Durability3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon1Durability31 += readstring;
            }
            InputReadWeapon1Durability3.close();
            Weapon1Durability3.setText(Weapon1Durability31);

            FileInputStream fileIninputWeapon1Durability4 = openFileInput("inputWeapon1Durability4.txt");
            InputStreamReader InputReadWeapon1Durability4 = new InputStreamReader(fileIninputWeapon1Durability4);

            String Weapon1Durability41 = "";

            while ((charRead = InputReadWeapon1Durability4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon1Durability41 += readstring;
            }
            InputReadWeapon1Durability4.close();
            Weapon1Durability4.setText(Weapon1Durability41);

            FileInputStream fileIninputWeapon1Durability5 = openFileInput("inputWeapon1Durability5.txt");
            InputStreamReader InputReadWeapon1Durability5 = new InputStreamReader(fileIninputWeapon1Durability5);

            String Weapon1Durability51 = "";

            while ((charRead = InputReadWeapon1Durability5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon1Durability51 += readstring;
            }
            InputReadWeapon1Durability5.close();
            Weapon1Durability5.setText(Weapon1Durability51);

            FileInputStream fileIninputWeapon2 = openFileInput("inputWeapon2.txt");
            InputStreamReader InputReadWeapon2 = new InputStreamReader(fileIninputWeapon2);

            String Weapon21 = "";

            while ((charRead = InputReadWeapon2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon21 += readstring;
            }
            InputReadWeapon2.close();
            Weapon2.setText(Weapon21);

            FileInputStream fileIninputWeapon2Damage = openFileInput("inputWeapon2Damage.txt");
            InputStreamReader InputReadWeapon2Damage = new InputStreamReader(fileIninputWeapon2Damage);

            String Weapon2Damage1 = "";

            while ((charRead = InputReadWeapon2Damage.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon2Damage1 += readstring;
            }
            InputReadWeapon2Damage.close();
            Weapon2Damage.setText(Weapon2Damage1);

            FileInputStream fileIninputWeapon2Weight = openFileInput("inputWeapon2Weight.txt");
            InputStreamReader InputReadWeapon2Weight = new InputStreamReader(fileIninputWeapon2Weight);

            String Weapon2Weight1 = "";

            while ((charRead = InputReadWeapon2Weight.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon2Weight1 += readstring;
            }
            InputReadWeapon2Weight.close();
            Weapon2Weight.setText(Weapon2Weight1);

            FileInputStream fileIninputWeapon2Ammunition = openFileInput("inputWeapon2Ammunition.txt");
            InputStreamReader InputReadWeapon2Ammunition = new InputStreamReader(fileIninputWeapon2Ammunition);

            String Weapon2Ammunition1 = "";

            while ((charRead = InputReadWeapon2Ammunition.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon2Ammunition1 += readstring;
            }
            InputReadWeapon2Ammunition.close();
            Weapon2Ammunition.setText(Weapon2Ammunition1);

            FileInputStream fileIninputWeapon2Range = openFileInput("inputWeapon2Range.txt");
            InputStreamReader InputReadWeapon2Range = new InputStreamReader(fileIninputWeapon2Range);

            String Weapon2Range1 = "";

            while ((charRead = InputReadWeapon2Range.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon2Range1 += readstring;
            }
            InputReadWeapon2Range.close();
            Weapon2Range.setText(Weapon2Range1);

            FileInputStream fileIninputWeapon2Durability1 = openFileInput("inputWeapon2Durability1.txt");
            InputStreamReader InputReadWeapon2Durability1 = new InputStreamReader(fileIninputWeapon2Durability1);

            String Weapon2Durability11 = "";

            while ((charRead = InputReadWeapon2Durability1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon2Durability11 += readstring;
            }
            InputReadWeapon2Durability1.close();
            Weapon2Durability1.setText(Weapon2Durability11);

            FileInputStream fileIninputWeapon2Durability2 = openFileInput("inputWeapon2Durability2.txt");
            InputStreamReader InputReadWeapon2Durability2 = new InputStreamReader(fileIninputWeapon2Durability2);

            String Weapon2Durability21 = "";

            while ((charRead = InputReadWeapon2Durability2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon2Durability21 += readstring;
            }
            InputReadWeapon2Durability2.close();
            Weapon2Durability2.setText(Weapon2Durability21);

            FileInputStream fileIninputWeapon2Durability3 = openFileInput("inputWeapon2Durability3.txt");
            InputStreamReader InputReadWeapon2Durability3 = new InputStreamReader(fileIninputWeapon2Durability3);

            String Weapon2Durability31 = "";

            while ((charRead = InputReadWeapon2Durability3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon2Durability31 += readstring;
            }
            InputReadWeapon2Durability3.close();
            Weapon2Durability3.setText(Weapon2Durability31);

            FileInputStream fileIninputWeapon2Durability4 = openFileInput("inputWeapon2Durability4.txt");
            InputStreamReader InputReadWeapon2Durability4 = new InputStreamReader(fileIninputWeapon2Durability4);

            String Weapon2Durability41 = "";

            while ((charRead = InputReadWeapon2Durability4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon2Durability41 += readstring;
            }
            InputReadWeapon2Durability4.close();
            Weapon2Durability4.setText(Weapon2Durability41);

            FileInputStream fileIninputWeapon2Durability5 = openFileInput("inputWeapon2Durability5.txt");
            InputStreamReader InputReadWeapon2Durability5 = new InputStreamReader(fileIninputWeapon2Durability5);

            String Weapon2Durability51 = "";

            while ((charRead = InputReadWeapon2Durability5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon2Durability51 += readstring;
            }
            InputReadWeapon2Durability5.close();
            Weapon2Durability5.setText(Weapon2Durability51);

            FileInputStream fileIninputWeapon3 = openFileInput("inputWeapon3.txt");
            InputStreamReader InputReadWeapon3 = new InputStreamReader(fileIninputWeapon3);

            String Weapon31 = "";

            while ((charRead = InputReadWeapon3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon31 += readstring;
            }
            InputReadWeapon3.close();
            Weapon3.setText(Weapon31);

            FileInputStream fileIninputWeapon3Damage = openFileInput("inputWeapon3Damage.txt");
            InputStreamReader InputReadWeapon3Damage = new InputStreamReader(fileIninputWeapon3Damage);

            String Weapon3Damage1 = "";

            while ((charRead = InputReadWeapon3Damage.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon3Damage1 += readstring;
            }
            InputReadWeapon3Damage.close();
            Weapon3Damage.setText(Weapon3Damage1);

            FileInputStream fileIninputWeapon3Weight = openFileInput("inputWeapon3Weight.txt");
            InputStreamReader InputReadWeapon3Weight = new InputStreamReader(fileIninputWeapon3Weight);

            String Weapon3Weight1 = "";

            while ((charRead = InputReadWeapon3Weight.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon3Weight1 += readstring;
            }
            InputReadWeapon3Weight.close();
            Weapon3Weight.setText(Weapon3Weight1);

            FileInputStream fileIninputWeapon3Ammunition = openFileInput("inputWeapon3Ammunition.txt");
            InputStreamReader InputReadWeapon3Ammunition = new InputStreamReader(fileIninputWeapon3Ammunition);

            String Weapon3Ammunition1 = "";

            while ((charRead = InputReadWeapon3Ammunition.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon3Ammunition1 += readstring;
            }
            InputReadWeapon3Ammunition.close();
            Weapon3Ammunition.setText(Weapon3Ammunition1);

            FileInputStream fileIninputWeapon3Range = openFileInput("inputWeapon3Range.txt");
            InputStreamReader InputReadWeapon3Range = new InputStreamReader(fileIninputWeapon3Range);

            String Weapon3Range1 = "";

            while ((charRead = InputReadWeapon3Range.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon3Range1 += readstring;
            }
            InputReadWeapon3Range.close();
            Weapon3Range.setText(Weapon3Range1);

            FileInputStream fileIninputWeapon3Durability1 = openFileInput("inputWeapon3Durability1.txt");
            InputStreamReader InputReadWeapon3Durability1 = new InputStreamReader(fileIninputWeapon3Durability1);

            String Weapon3Durability11 = "";

            while ((charRead = InputReadWeapon3Durability1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon3Durability11 += readstring;
            }
            InputReadWeapon3Durability1.close();
            Weapon3Durability1.setText(Weapon3Durability11);

            FileInputStream fileIninputWeapon3Durability2 = openFileInput("inputWeapon3Durability2.txt");
            InputStreamReader InputReadWeapon3Durability2 = new InputStreamReader(fileIninputWeapon3Durability2);

            String Weapon3Durability21 = "";

            while ((charRead = InputReadWeapon3Durability2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon3Durability21 += readstring;
            }
            InputReadWeapon3Durability2.close();
            Weapon3Durability2.setText(Weapon3Durability21);

            FileInputStream fileIninputWeapon3Durability3 = openFileInput("inputWeapon3Durability3.txt");
            InputStreamReader InputReadWeapon3Durability3 = new InputStreamReader(fileIninputWeapon3Durability3);

            String Weapon3Durability31 = "";

            while ((charRead = InputReadWeapon3Durability3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon3Durability31 += readstring;
            }
            InputReadWeapon3Durability3.close();
            Weapon3Durability3.setText(Weapon3Durability31);

            FileInputStream fileIninputWeapon3Durability4 = openFileInput("inputWeapon3Durability4.txt");
            InputStreamReader InputReadWeapon3Durability4 = new InputStreamReader(fileIninputWeapon3Durability4);

            String Weapon3Durability41 = "";

            while ((charRead = InputReadWeapon3Durability4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon3Durability41 += readstring;
            }
            InputReadWeapon3Durability4.close();
            Weapon3Durability4.setText(Weapon3Durability41);

            FileInputStream fileIninputWeapon3Durability5 = openFileInput("inputWeapon3Durability5.txt");
            InputStreamReader InputReadWeapon3Durability5 = new InputStreamReader(fileIninputWeapon3Durability5);

            String Weapon3Durability51 = "";

            while ((charRead = InputReadWeapon3Durability5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Weapon3Durability51 += readstring;
            }
            InputReadWeapon3Durability5.close();
            Weapon3Durability5.setText(Weapon3Durability51);

        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }

//Nabijanie countera Atrybutu - Strengh
    public void PlusButtonStrClicked(View view) {
        if(counterValueStr==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
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


    @Override
    public void onClick(View v) {

    }
}