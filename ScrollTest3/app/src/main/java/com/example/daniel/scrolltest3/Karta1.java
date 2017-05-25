package com.example.daniel.scrolltest3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.renderscript.Sampler;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
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

import static com.example.daniel.scrolltest3.R.attr.logo;

public class Karta1 extends AppCompatActivity implements View.OnClickListener {

    //Deklaracja counterów Atrybutów
    private int counterValueStr=0;
    private TextView counterTextViewStr;
    private int counterValueEnd=0;
    private TextView counterTextViewEnd;
    private int counterValueKon=0;
    private TextView counterTextViewKon;
    private int counterValueAgi=0;
    private TextView counterTextViewAgi;
    private int counterValueInt=0;
    private TextView counterTextViewInt;
    private int counterValueWil=0;
    private TextView counterTextViewWil;
    private int counterValueCha=0;
    private TextView counterTextViewCha;
    private int counterValueAll;
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
    private EditText Armor1;
    private EditText Armor1Type;
    private EditText Armor1PP;
    private CheckBox Armor1Durability1;
    private CheckBox Armor1Durability2;
    private CheckBox Armor1Durability3;
    private CheckBox Armor1Durability4;
    private CheckBox Armor1Durability5;
    private EditText Armor2;
    private EditText Armor2Type;
    private EditText Armor2PP;
    private CheckBox Armor2Durability1;
    private CheckBox Armor2Durability2;
    private CheckBox Armor2Durability3;
    private CheckBox Armor2Durability4;
    private CheckBox Armor2Durability5;
    private EditText Armor3;
    private EditText Armor3Type;
    private EditText Armor3PP;
    private CheckBox Armor3Durability1;
    private CheckBox Armor3Durability2;
    private CheckBox Armor3Durability3;
    private CheckBox Armor3Durability4;
    private CheckBox Armor3Durability5;
    private EditText Armor4;
    private EditText Armor4Type;
    private EditText Armor4PP;
    private CheckBox Armor4Durability1;
    private CheckBox Armor4Durability2;
    private CheckBox Armor4Durability3;
    private CheckBox Armor4Durability4;
    private CheckBox Armor4Durability5;
    private EditText Armor5;
    private EditText Armor5Type;
    private EditText Armor5PP;
    private CheckBox Armor5Durability1;
    private CheckBox Armor5Durability2;
    private CheckBox Armor5Durability3;
    private CheckBox Armor5Durability4;
    private CheckBox Armor5Durability5;
    private EditText Armor6;
    private EditText Armor6Type;
    private EditText Armor6PP;
    private CheckBox Armor6Durability1;
    private CheckBox Armor6Durability2;
    private CheckBox Armor6Durability3;
    private CheckBox Armor6Durability4;
    private CheckBox Armor6Durability5;
    private CheckBox LesserWoundChekbox1;
    private CheckBox LesserWoundChekbox2;
    private CheckBox LesserWoundChekbox3;
    private CheckBox LesserWoundChekbox4;
    private CheckBox LesserWoundChekbox5;
    private CheckBox WoundChekbox1;
    private CheckBox WoundChekbox2;
    private CheckBox WoundChekbox3;
    private CheckBox WoundChekbox4;
    private CheckBox WoundChekbox5;
    private CheckBox GreaterWoundChekbox1;
    private CheckBox GreaterWoundChekbox2;
    private CheckBox GreaterWoundChekbox3;
    private CheckBox GreaterWoundChekbox4;
    private CheckBox GreaterWoundChekbox5;
    private CheckBox BronKrotka1;
    private CheckBox BronKrotka2;
    private CheckBox BronKrotka3;
    private CheckBox BronLekka1;
    private CheckBox BronLekka2;
    private CheckBox BronLekka3;
    private CheckBox BronCiezka1;
    private CheckBox BronCiezka2;
    private CheckBox BronCiezka3;
    private CheckBox BronDrzewcowa1;
    private CheckBox BronDrzewcowa2;
    private CheckBox BronDrzewcowa3;
    private CheckBox Obrona1;
    private CheckBox Obrona2;
    private CheckBox Obrona3;
    private CheckBox Strzelectwo1;
    private CheckBox Strzelectwo2;
    private CheckBox Strzelectwo3;
    private CheckBox Perswazja1;
    private CheckBox Perswazja2;
    private CheckBox Perswazja3;
    private CheckBox Cwaniactwo1;
    private CheckBox Cwaniactwo2;
    private CheckBox Cwaniactwo3;
    private CheckBox Handel1;
    private CheckBox Handel2;
    private CheckBox Handel3;
    private CheckBox Etykieta1;
    private CheckBox Etykieta2;
    private CheckBox Etykieta3;
    private CheckBox Przetrwanie1;
    private CheckBox Przetrwanie2;
    private CheckBox Przetrwanie3;
    private CheckBox Atletyka1;
    private CheckBox Atletyka2;
    private CheckBox Atletyka3;
    private CheckBox Oburecznosc1;
    private CheckBox Oburecznosc2;
    private CheckBox Oburecznosc3;
    private CheckBox Percepcja1;
    private CheckBox Percepcja2;
    private CheckBox Percepcja3;
    private CheckBox Podstepy1;
    private CheckBox Podstepy2;
    private CheckBox Podstepy3;
    private CheckBox Leczenie1;
    private CheckBox Leczenie2;
    private CheckBox Leczenie3;
    private CheckBox Zbieractwo1;
    private CheckBox Zbieractwo2;
    private CheckBox Zbieractwo3;
    private CheckBox Magia1;
    private CheckBox Magia2;
    private CheckBox Magia3;
    private CheckBox Kowalstwo1;
    private CheckBox Kowalstwo2;
    private CheckBox Kowalstwo3;
    private CheckBox Ciesielstwo1;
    private CheckBox Ciesielstwo2;
    private CheckBox Ciesielstwo3;
    private CheckBox Alchemia1;
    private CheckBox Alchemia2;
    private CheckBox Alchemia3;
    private CheckBox Gotowanie1;
    private CheckBox Gotowanie2;
    private CheckBox Gotowanie3;
    private CheckBox Krawiectwo1;
    private CheckBox Krawiectwo2;
    private CheckBox Krawiectwo3;
    private ImageView ImageUploaded;
    Button savebutton;
    static final int READ_BLOCK_SIZE = 100;
    private TextView Weapon1DurabilityCheck;

//Deklaracja value Experience

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karta1);
        savebutton = (Button) findViewById(R.id.savebutton);
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
        Armor1 = (EditText) findViewById((R.id.Armor1));
        Armor1Type = (EditText) findViewById((R.id.Armor1Type));
        Armor1PP = (EditText) findViewById((R.id.Armor1PP));
        Armor2 = (EditText) findViewById((R.id.Armor2));
        Armor2Type = (EditText) findViewById((R.id.Armor2Type));
        Armor2PP = (EditText) findViewById((R.id.Armor2PP));
        Armor3 = (EditText) findViewById((R.id.Armor3));
        Armor3Type = (EditText) findViewById((R.id.Armor3Type));
        Armor3PP = (EditText) findViewById((R.id.Armor3PP));
        Armor4 = (EditText) findViewById((R.id.Armor4));
        Armor4Type = (EditText) findViewById((R.id.Armor4Type));
        Armor4PP = (EditText) findViewById((R.id.Armor4PP));
        Armor5 = (EditText) findViewById((R.id.Armor5));
        Armor5Type = (EditText) findViewById((R.id.Armor5Type));
        Armor5PP = (EditText) findViewById((R.id.Armor5PP));
        Armor6 = (EditText) findViewById((R.id.Armor6));
        Armor6Type = (EditText) findViewById((R.id.Armor6Type));
        Armor6PP = (EditText) findViewById((R.id.Armor6PP));
        Armor1Durability1 = (CheckBox) findViewById(R.id.Armor1Durability1);
        Armor1Durability2 = (CheckBox) findViewById(R.id.Armor1Durability2);
        Armor1Durability3 = (CheckBox) findViewById(R.id.Armor1Durability3);
        Armor1Durability4 = (CheckBox) findViewById(R.id.Armor1Durability4);
        Armor1Durability5 = (CheckBox) findViewById(R.id.Armor1Durability5);
        Armor2Durability1 = (CheckBox) findViewById(R.id.Armor2Durability1);
        Armor2Durability2 = (CheckBox) findViewById(R.id.Armor2Durability2);
        Armor2Durability3 = (CheckBox) findViewById(R.id.Armor2Durability3);
        Armor2Durability4 = (CheckBox) findViewById(R.id.Armor2Durability4);
        Armor2Durability5 = (CheckBox) findViewById(R.id.Armor2Durability5);
        Armor3Durability1 = (CheckBox) findViewById(R.id.Armor3Durability1);
        Armor3Durability2 = (CheckBox) findViewById(R.id.Armor3Durability2);
        Armor3Durability3 = (CheckBox) findViewById(R.id.Armor3Durability3);
        Armor3Durability4 = (CheckBox) findViewById(R.id.Armor3Durability4);
        Armor3Durability5 = (CheckBox) findViewById(R.id.Armor3Durability5);
        Armor4Durability1 = (CheckBox) findViewById(R.id.Armor4Durability1);
        Armor4Durability2 = (CheckBox) findViewById(R.id.Armor4Durability2);
        Armor4Durability3 = (CheckBox) findViewById(R.id.Armor4Durability3);
        Armor4Durability4 = (CheckBox) findViewById(R.id.Armor4Durability4);
        Armor4Durability5 = (CheckBox) findViewById(R.id.Armor4Durability5);
        Armor5Durability1 = (CheckBox) findViewById(R.id.Armor5Durability1);
        Armor5Durability2 = (CheckBox) findViewById(R.id.Armor5Durability2);
        Armor5Durability3 = (CheckBox) findViewById(R.id.Armor5Durability3);
        Armor5Durability4 = (CheckBox) findViewById(R.id.Armor5Durability4);
        Armor5Durability5 = (CheckBox) findViewById(R.id.Armor5Durability5);
        Armor6Durability1 = (CheckBox) findViewById(R.id.Armor6Durability1);
        Armor6Durability2 = (CheckBox) findViewById(R.id.Armor6Durability2);
        Armor6Durability3 = (CheckBox) findViewById(R.id.Armor6Durability3);
        Armor6Durability4 = (CheckBox) findViewById(R.id.Armor6Durability4);
        Armor6Durability5 = (CheckBox) findViewById(R.id.Armor6Durability5);
        LesserWoundChekbox1 = (CheckBox) findViewById(R.id.LesserWoundChekbox1);
        LesserWoundChekbox2 = (CheckBox) findViewById(R.id.LesserWoundChekbox2);
        LesserWoundChekbox3 = (CheckBox) findViewById(R.id.LesserWoundChekbox3);
        LesserWoundChekbox4 = (CheckBox) findViewById(R.id.LesserWoundChekbox4);
        LesserWoundChekbox5 = (CheckBox) findViewById(R.id.LesserWoundChekbox5);
        WoundChekbox1 = (CheckBox) findViewById(R.id.WoundChekbox1);
        WoundChekbox2 = (CheckBox) findViewById(R.id.WoundChekbox2);
        WoundChekbox3 = (CheckBox) findViewById(R.id.WoundChekbox3);
        WoundChekbox4 = (CheckBox) findViewById(R.id.WoundChekbox4);
        WoundChekbox5 = (CheckBox) findViewById(R.id.WoundChekbox5);
        GreaterWoundChekbox1 = (CheckBox) findViewById(R.id.GreaterWoundChekbox1);
        GreaterWoundChekbox2 = (CheckBox) findViewById(R.id.GreaterWoundChekbox2);
        GreaterWoundChekbox3 = (CheckBox) findViewById(R.id.GreaterWoundChekbox3);
        GreaterWoundChekbox4 = (CheckBox) findViewById(R.id.GreaterWoundChekbox4);
        GreaterWoundChekbox5 = (CheckBox) findViewById(R.id.GreaterWoundChekbox5);
        BronKrotka1 = (CheckBox) findViewById(R.id.BronKrotka1);
        BronKrotka2 = (CheckBox) findViewById(R.id.BronKrotka2);
        BronKrotka3 = (CheckBox) findViewById(R.id.BronKrotka3);
        BronLekka1 = (CheckBox) findViewById(R.id.BronLekka1);
        BronLekka2 = (CheckBox) findViewById(R.id.BronLekka2);
        BronLekka3 = (CheckBox) findViewById(R.id.BronLekka3);
        BronCiezka1 = (CheckBox) findViewById(R.id.BronCiezka1);
        BronCiezka2 = (CheckBox) findViewById(R.id.BronCiezka2);
        BronCiezka3 = (CheckBox) findViewById(R.id.BronCiezka3);
        BronDrzewcowa1 = (CheckBox) findViewById(R.id.BronDrzewcowa1);
        BronDrzewcowa2 = (CheckBox) findViewById(R.id.BronDrzewcowa2);
        BronDrzewcowa3 = (CheckBox) findViewById(R.id.BronDrzewcowa3);
        Obrona1 = (CheckBox) findViewById(R.id.Obrona1);
        Obrona2 = (CheckBox) findViewById(R.id.Obrona2);
        Obrona3 = (CheckBox) findViewById(R.id.Obrona3);
        Strzelectwo1 = (CheckBox) findViewById(R.id.Strzelectwo1);
        Strzelectwo2 = (CheckBox) findViewById(R.id.Strzelectwo2);
        Strzelectwo3 = (CheckBox) findViewById(R.id.Strzelectwo3);
        Perswazja1 = (CheckBox) findViewById(R.id.Perswazja1);
        Perswazja2 = (CheckBox) findViewById(R.id.Perswazja2);
        Perswazja3 = (CheckBox) findViewById(R.id.Perswazja3);
        Cwaniactwo1 = (CheckBox) findViewById(R.id.Cwaniactwo1);
        Cwaniactwo2 = (CheckBox) findViewById(R.id.Cwaniactwo2);
        Cwaniactwo3 = (CheckBox) findViewById(R.id.Cwaniactwo3);
        Handel1 = (CheckBox) findViewById(R.id.Handel1);
        Handel2 = (CheckBox) findViewById(R.id.Handel2);
        Handel3 = (CheckBox) findViewById(R.id.Handel3);
        Etykieta1 = (CheckBox) findViewById(R.id.Etykieta1);
        Etykieta2 = (CheckBox) findViewById(R.id.Etykieta2);
        Etykieta3 = (CheckBox) findViewById(R.id.Etykieta3);
        Przetrwanie1 = (CheckBox) findViewById(R.id.Przetrwanie1);
        Przetrwanie2 = (CheckBox) findViewById(R.id.Przetrwanie2);
        Przetrwanie3 = (CheckBox) findViewById(R.id.Przetrwanie3);
        Atletyka1 = (CheckBox) findViewById(R.id.Atletyka1);
        Atletyka2 = (CheckBox) findViewById(R.id.Atletyka2);
        Atletyka3 = (CheckBox) findViewById(R.id.Atletyka3);
        Oburecznosc1 = (CheckBox) findViewById(R.id.Oburecznosc1);
        Oburecznosc2 = (CheckBox) findViewById(R.id.Oburecznosc2);
        Oburecznosc3 = (CheckBox) findViewById(R.id.Oburecznosc3);
        Percepcja1 = (CheckBox) findViewById(R.id.Percepcja1);
        Percepcja2 = (CheckBox) findViewById(R.id.Percepcja2);
        Percepcja3 = (CheckBox) findViewById(R.id.Percepcja3);
        Podstepy1 = (CheckBox) findViewById(R.id.Podstepy1);
        Podstepy2 = (CheckBox) findViewById(R.id.Podstepy2);
        Podstepy3 = (CheckBox) findViewById(R.id.Podstepy3);
        Leczenie1 = (CheckBox) findViewById(R.id.Leczenie1);
        Leczenie2 = (CheckBox) findViewById(R.id.Leczenie2);
        Leczenie3 = (CheckBox) findViewById(R.id.Leczenie3);
        Zbieractwo1 = (CheckBox) findViewById(R.id.Zbieractwo1);
        Zbieractwo2 = (CheckBox) findViewById(R.id.Zbieractwo2);
        Zbieractwo3 = (CheckBox) findViewById(R.id.Zbieractwo3);
        Magia1 = (CheckBox) findViewById(R.id.Magia1);
        Magia2 = (CheckBox) findViewById(R.id.Magia2);
        Magia3 = (CheckBox) findViewById(R.id.Magia3);
        Kowalstwo1 = (CheckBox) findViewById(R.id.Kowalstwo1);
        Kowalstwo2 = (CheckBox) findViewById(R.id.Kowalstwo2);
        Kowalstwo3 = (CheckBox) findViewById(R.id.Kowalstwo3);
        Ciesielstwo1 = (CheckBox) findViewById(R.id.Ciesielstwo1);
        Ciesielstwo2 = (CheckBox) findViewById(R.id.Ciesielstwo2);
        Ciesielstwo3 = (CheckBox) findViewById(R.id.Ciesielstwo3);
        Alchemia1 = (CheckBox) findViewById(R.id.Alchemia1);
        Alchemia2 = (CheckBox) findViewById(R.id.Alchemia2);
        Alchemia3 = (CheckBox) findViewById(R.id.Alchemia3);
        Gotowanie1 = (CheckBox) findViewById(R.id.Gotowanie1);
        Gotowanie2 = (CheckBox) findViewById(R.id.Gotowanie2);
        Gotowanie3 = (CheckBox) findViewById(R.id.Gotowanie3);
        Krawiectwo1 = (CheckBox) findViewById(R.id.Krawiectwo1);
        Krawiectwo2 = (CheckBox) findViewById(R.id.Krawiectwo2);
        Krawiectwo3 = (CheckBox) findViewById(R.id.Krawiectwo3);
        ImageUploaded = (ImageView) findViewById(R.id.ImageUploaded);
        try {
            load();
            atrybutyrefresh();
        } catch (IOException e) {
            e.printStackTrace();
        }

//Przypisanie findViewById dla Atrybutów
        counterTextViewStr = (TextView) findViewById(R.id.counterTextViewStr);
        counterTextViewEnd = (TextView) findViewById(R.id.counterTextViewEnd);
        counterTextViewKon = (TextView) findViewById(R.id.counterTextViewKon);
        counterTextViewAgi = (TextView) findViewById(R.id.counterTextViewAgi);
        counterTextViewInt = (TextView) findViewById(R.id.counterTextViewInt);
        counterTextViewWil = (TextView) findViewById(R.id.counterTextViewWil);
        counterTextViewCha = (TextView) findViewById(R.id.counterTextViewCha);
        counterTextViewAll = (TextView) findViewById(R.id.counterTextViewAll);

//Przypisanie findViewById dla Experience

        atrybutyrefresh();

    }

    public static class ImageSaver {

        private String directoryName = "images";
        private String fileName = "image.png";
        private Context context;
        private boolean external;

        public ImageSaver(Context context) {
            this.context = context;
        }

        public ImageSaver setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public ImageSaver setExternal(boolean external) {
            this.external = external;
            return this;
        }

        public ImageSaver setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }

        public void saveBitmap(Bitmap bitmapImage) {
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(createFile());
                bitmapImage.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        @NonNull
        private File createFile() {
            File directory;
            if (external) {
                directory = getAlbumStorageDir(directoryName);
            } else {
                directory = context.getDir(directoryName, Context.MODE_PRIVATE);
            }

            return new File(directory, fileName);
        }

        private File getAlbumStorageDir(String albumName) {
            File file = new File(Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_PICTURES), albumName);
            if (!file.mkdirs()) {
                Log.e("ImageSaver", "Directory not created");
            }
            return file;
        }


        public static boolean isExternalStorageWritable() {
            String state = Environment.getExternalStorageState();
            return Environment.MEDIA_MOUNTED.equals(state);
        }

        public static boolean isExternalStorageReadable() {
            String state = Environment.getExternalStorageState();
            return Environment.MEDIA_MOUNTED.equals(state) ||
                    Environment.MEDIA_MOUNTED_READ_ONLY.equals(state);
        }


        public Bitmap loadBitmap() {
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(createFile());
                return BitmapFactory.decodeStream(inputStream);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
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

            FileOutputStream fileoutinputWeapon2 = openFileOutput("inputWeapon2.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon2 = new OutputStreamWriter(fileoutinputWeapon2);
            outputWriterinputWeapon2.write(Weapon2.getText().toString());
            outputWriterinputWeapon2.close();

            FileOutputStream fileoutinputWeapon2Damage = openFileOutput("inputWeapon2Damage.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon2Damage = new OutputStreamWriter(fileoutinputWeapon2Damage);
            outputWriterinputWeapon2Damage.write(Weapon2Damage.getText().toString());
            outputWriterinputWeapon2Damage.close();

            FileOutputStream fileoutinputWeapon2Weight = openFileOutput("inputWeapon2Weight.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon2Weight = new OutputStreamWriter(fileoutinputWeapon2Weight);
            outputWriterinputWeapon2Weight.write(Weapon2Weight.getText().toString());
            outputWriterinputWeapon2Weight.close();

            FileOutputStream fileoutinputWeapon2Ammunition = openFileOutput("inputWeapon2Ammunition.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon2Ammunition = new OutputStreamWriter(fileoutinputWeapon2Ammunition);
            outputWriterinputWeapon2Ammunition.write(Weapon2Ammunition.getText().toString());
            outputWriterinputWeapon2Ammunition.close();

            FileOutputStream fileoutinputWeapon2Range = openFileOutput("inputWeapon2Range.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon2Range = new OutputStreamWriter(fileoutinputWeapon2Range);
            outputWriterinputWeapon2Range.write(Weapon2Range.getText().toString());
            outputWriterinputWeapon2Range.close();

            FileOutputStream fileoutinputWeapon3 = openFileOutput("inputWeapon3.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon3 = new OutputStreamWriter(fileoutinputWeapon3);
            outputWriterinputWeapon3.write(Weapon3.getText().toString());
            outputWriterinputWeapon3.close();

            FileOutputStream fileoutinputWeapon3Damage = openFileOutput("inputWeapon3Damage.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon3Damage = new OutputStreamWriter(fileoutinputWeapon3Damage);
            outputWriterinputWeapon3Damage.write(Weapon3Damage.getText().toString());
            outputWriterinputWeapon3Damage.close();

            FileOutputStream fileoutinputWeapon3Weight = openFileOutput("inputWeapon3Weight.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon3Weight = new OutputStreamWriter(fileoutinputWeapon3Weight);
            outputWriterinputWeapon3Weight.write(Weapon3Weight.getText().toString());
            outputWriterinputWeapon3Weight.close();

            FileOutputStream fileoutinputWeapon3Ammunition = openFileOutput("inputWeapon3Ammunition.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon3Ammunition = new OutputStreamWriter(fileoutinputWeapon3Ammunition);
            outputWriterinputWeapon3Ammunition.write(Weapon3Ammunition.getText().toString());
            outputWriterinputWeapon3Ammunition.close();

            FileOutputStream fileoutinputWeapon3Range = openFileOutput("inputWeapon3Range.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputWeapon3Range = new OutputStreamWriter(fileoutinputWeapon3Range);
            outputWriterinputWeapon3Range.write(Weapon3Range.getText().toString());
            outputWriterinputWeapon3Range.close();

            FileOutputStream fileoutinputArmor1 = openFileOutput("inputArmor1.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor1 = new OutputStreamWriter(fileoutinputArmor1);
            outputWriterinputArmor1.write(Armor1.getText().toString());
            outputWriterinputArmor1.close();

            FileOutputStream fileoutinputArmor1Type = openFileOutput("inputArmor1Type.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor1Type = new OutputStreamWriter(fileoutinputArmor1Type);
            outputWriterinputArmor1Type.write(Armor1Type.getText().toString());
            outputWriterinputArmor1Type.close();

            FileOutputStream fileoutinputArmor1PP = openFileOutput("inputArmor1PP.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor1PP = new OutputStreamWriter(fileoutinputArmor1PP);
            outputWriterinputArmor1PP.write(Armor1PP.getText().toString());
            outputWriterinputArmor1PP.close();

            FileOutputStream fileoutinputArmor2 = openFileOutput("inputArmor2.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor2 = new OutputStreamWriter(fileoutinputArmor2);
            outputWriterinputArmor2.write(Armor2.getText().toString());
            outputWriterinputArmor2.close();

            FileOutputStream fileoutinputArmor2Type = openFileOutput("inputArmor2Type.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor2Type = new OutputStreamWriter(fileoutinputArmor2Type);
            outputWriterinputArmor2Type.write(Armor2Type.getText().toString());
            outputWriterinputArmor2Type.close();

            FileOutputStream fileoutinputArmor2PP = openFileOutput("inputArmor2PP.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor2PP = new OutputStreamWriter(fileoutinputArmor2PP);
            outputWriterinputArmor2PP.write(Armor2PP.getText().toString());
            outputWriterinputArmor2PP.close();

            FileOutputStream fileoutinputArmor3 = openFileOutput("inputArmor3.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor3 = new OutputStreamWriter(fileoutinputArmor3);
            outputWriterinputArmor3.write(Armor3.getText().toString());
            outputWriterinputArmor3.close();

            FileOutputStream fileoutinputArmor3Type = openFileOutput("inputArmor3Type.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor3Type = new OutputStreamWriter(fileoutinputArmor3Type);
            outputWriterinputArmor3Type.write(Armor3Type.getText().toString());
            outputWriterinputArmor3Type.close();

            FileOutputStream fileoutinputArmor3PP = openFileOutput("inputArmor3PP.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor3PP = new OutputStreamWriter(fileoutinputArmor3PP);
            outputWriterinputArmor3PP.write(Armor3PP.getText().toString());
            outputWriterinputArmor3PP.close();

            FileOutputStream fileoutinputArmor4 = openFileOutput("inputArmor4.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor4 = new OutputStreamWriter(fileoutinputArmor4);
            outputWriterinputArmor4.write(Armor4.getText().toString());
            outputWriterinputArmor4.close();

            FileOutputStream fileoutinputArmor4Type = openFileOutput("inputArmor4Type.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor4Type = new OutputStreamWriter(fileoutinputArmor4Type);
            outputWriterinputArmor4Type.write(Armor4Type.getText().toString());
            outputWriterinputArmor4Type.close();

            FileOutputStream fileoutinputArmor4PP = openFileOutput("inputArmor4PP.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor4PP = new OutputStreamWriter(fileoutinputArmor4PP);
            outputWriterinputArmor4PP.write(Armor4PP.getText().toString());
            outputWriterinputArmor4PP.close();

            FileOutputStream fileoutinputArmor5 = openFileOutput("inputArmor5.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor5 = new OutputStreamWriter(fileoutinputArmor5);
            outputWriterinputArmor5.write(Armor5.getText().toString());
            outputWriterinputArmor5.close();

            FileOutputStream fileoutinputArmor5Type = openFileOutput("inputArmor5Type.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor5Type = new OutputStreamWriter(fileoutinputArmor5Type);
            outputWriterinputArmor5Type.write(Armor5Type.getText().toString());
            outputWriterinputArmor5Type.close();

            FileOutputStream fileoutinputArmor5PP = openFileOutput("inputArmor5PP.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor5PP = new OutputStreamWriter(fileoutinputArmor5PP);
            outputWriterinputArmor5PP.write(Armor5PP.getText().toString());
            outputWriterinputArmor5PP.close();

            FileOutputStream fileoutinputArmor6 = openFileOutput("inputArmor6.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor6 = new OutputStreamWriter(fileoutinputArmor6);
            outputWriterinputArmor6.write(Armor6.getText().toString());
            outputWriterinputArmor6.close();

            FileOutputStream fileoutinputArmor6Type = openFileOutput("inputArmor6Type.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor6Type = new OutputStreamWriter(fileoutinputArmor6Type);
            outputWriterinputArmor6Type.write(Armor6Type.getText().toString());
            outputWriterinputArmor6Type.close();

            FileOutputStream fileoutinputArmor6PP = openFileOutput("inputArmor6PP.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriterinputArmor6PP = new OutputStreamWriter(fileoutinputArmor6PP);
            outputWriterinputArmor6PP.write(Armor6PP.getText().toString());
            outputWriterinputArmor6PP.close();

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putFloat("Siła",counterValueStr).
            putFloat("Budowa",counterValueEnd).
            putFloat("Kondycja",counterValueKon).
            putFloat("Zręczność",counterValueAgi).
            putFloat("Intelekt",counterValueInt).
            putFloat("Siła Woli",counterValueWil).
            putFloat("Charyzma",counterValueCha);
            editor.commit();

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
            saveChecked("Weapon3Durability1", Weapon3Durability1.isChecked());
            saveChecked("Armor1Durability1", Armor1Durability1.isChecked());
            saveChecked("Armor1Durability2", Armor1Durability2.isChecked());
            saveChecked("Armor1Durability3", Armor1Durability3.isChecked());
            saveChecked("Armor1Durability4", Armor1Durability4.isChecked());
            saveChecked("Armor1Durability5", Armor1Durability5.isChecked());
            saveChecked("Armor2Durability1", Armor2Durability1.isChecked());
            saveChecked("Armor2Durability2", Armor2Durability2.isChecked());
            saveChecked("Armor2Durability3", Armor2Durability3.isChecked());
            saveChecked("Armor2Durability4", Armor2Durability4.isChecked());
            saveChecked("Armor2Durability5", Armor2Durability5.isChecked());
            saveChecked("Armor3Durability1", Armor3Durability1.isChecked());
            saveChecked("Armor3Durability2", Armor3Durability2.isChecked());
            saveChecked("Armor3Durability3", Armor3Durability3.isChecked());
            saveChecked("Armor3Durability4", Armor3Durability4.isChecked());
            saveChecked("Armor3Durability5", Armor3Durability5.isChecked());
            saveChecked("Armor4Durability1", Armor4Durability1.isChecked());
            saveChecked("Armor4Durability2", Armor4Durability2.isChecked());
            saveChecked("Armor4Durability3", Armor4Durability3.isChecked());
            saveChecked("Armor4Durability4", Armor4Durability4.isChecked());
            saveChecked("Armor4Durability5", Armor4Durability5.isChecked());
            saveChecked("Armor5Durability1", Armor5Durability1.isChecked());
            saveChecked("Armor5Durability2", Armor5Durability2.isChecked());
            saveChecked("Armor5Durability3", Armor5Durability3.isChecked());
            saveChecked("Armor5Durability4", Armor5Durability4.isChecked());
            saveChecked("Armor5Durability5", Armor5Durability5.isChecked());
            saveChecked("Armor6Durability1", Armor6Durability1.isChecked());
            saveChecked("Armor6Durability2", Armor6Durability2.isChecked());
            saveChecked("Armor6Durability3", Armor6Durability3.isChecked());
            saveChecked("Armor6Durability4", Armor6Durability4.isChecked());
            saveChecked("Armor6Durability5", Armor6Durability5.isChecked());
            saveChecked("LesserWoundChekbox1", LesserWoundChekbox1.isChecked());
            saveChecked("LesserWoundChekbox2", LesserWoundChekbox2.isChecked());
            saveChecked("LesserWoundChekbox3", LesserWoundChekbox3.isChecked());
            saveChecked("LesserWoundChekbox4", LesserWoundChekbox4.isChecked());
            saveChecked("LesserWoundChekbox5", LesserWoundChekbox5.isChecked());
            saveChecked("WoundChekbox1", WoundChekbox1.isChecked());
            saveChecked("WoundChekbox2", WoundChekbox2.isChecked());
            saveChecked("WoundChekbox3", WoundChekbox3.isChecked());
            saveChecked("WoundChekbox4", WoundChekbox4.isChecked());
            saveChecked("WoundChekbox5", WoundChekbox5.isChecked());
            saveChecked("GreaterWoundChekbox1", GreaterWoundChekbox1.isChecked());
            saveChecked("GreaterWoundChekbox2", GreaterWoundChekbox2.isChecked());
            saveChecked("GreaterWoundChekbox3", GreaterWoundChekbox3.isChecked());
            saveChecked("GreaterWoundChekbox4", GreaterWoundChekbox4.isChecked());
            saveChecked("GreaterWoundChekbox5", GreaterWoundChekbox5.isChecked());
            saveChecked("BronKrotka1", BronKrotka1.isChecked());
            saveChecked("BronKrotka2", BronKrotka2.isChecked());
            saveChecked("BronKrotka3", BronKrotka3.isChecked());
            saveChecked("BronLekka1", BronLekka1.isChecked());
            saveChecked("BronLekka1", BronLekka2.isChecked());
            saveChecked("BronLekka1", BronLekka3.isChecked());
            saveChecked("BronCiezka1", BronCiezka1.isChecked());
            saveChecked("BronCiezka2", BronCiezka2.isChecked());
            saveChecked("BronCiezka3", BronCiezka3.isChecked());
            saveChecked("BronDrzewcowa1", BronDrzewcowa1.isChecked());
            saveChecked("BronDrzewcowa2", BronDrzewcowa2.isChecked());
            saveChecked("BronDrzewcowa3", BronDrzewcowa3.isChecked());
            saveChecked("Obrona1", Obrona1.isChecked());
            saveChecked("Obrona2", Obrona2.isChecked());
            saveChecked("Obrona3", Obrona3.isChecked());
            saveChecked("Strzelectwo1", Strzelectwo1.isChecked());
            saveChecked("Strzelectwo2", Strzelectwo2.isChecked());
            saveChecked("Strzelectwo3", Strzelectwo3.isChecked());
            saveChecked("Perswazja1", Perswazja1.isChecked());
            saveChecked("Perswazja2", Perswazja2.isChecked());
            saveChecked("Perswazja3", Perswazja3.isChecked());
            saveChecked("Cwaniactwo1", Cwaniactwo1.isChecked());
            saveChecked("Cwaniactwo2", Cwaniactwo2.isChecked());
            saveChecked("Cwaniactwo3", Cwaniactwo3.isChecked());
            saveChecked("Handel1", Handel1.isChecked());
            saveChecked("Handel2", Handel2.isChecked());
            saveChecked("Handel3", Handel3.isChecked());
            saveChecked("Etykieta1", Etykieta1.isChecked());
            saveChecked("Etykieta2", Etykieta2.isChecked());
            saveChecked("Etykieta3", Etykieta3.isChecked());
            saveChecked("Przetrwanie1", Przetrwanie1.isChecked());
            saveChecked("Przetrwanie2", Przetrwanie2.isChecked());
            saveChecked("Przetrwanie3", Przetrwanie3.isChecked());
            saveChecked("Atletyka1", Atletyka1.isChecked());
            saveChecked("Atletyka2", Atletyka2.isChecked());
            saveChecked("Atletyka3", Atletyka3.isChecked());
            saveChecked("Oburecznosc1", Oburecznosc1.isChecked());
            saveChecked("Oburecznosc2", Oburecznosc2.isChecked());
            saveChecked("Oburecznosc3", Oburecznosc3.isChecked());
            saveChecked("Percepcja1", Percepcja1.isChecked());
            saveChecked("Percepcja2", Percepcja2.isChecked());
            saveChecked("Percepcja3", Percepcja3.isChecked());
            saveChecked("Podstepy1", Podstepy1.isChecked());
            saveChecked("Podstepy2", Podstepy2.isChecked());
            saveChecked("Podstepy3", Podstepy3.isChecked());
            saveChecked("Leczenie1", Leczenie1.isChecked());
            saveChecked("Leczenie2", Leczenie2.isChecked());
            saveChecked("Leczenie3", Leczenie3.isChecked());
            saveChecked("Magia1", Magia1.isChecked());
            saveChecked("Magia2", Magia2.isChecked());
            saveChecked("Magia3", Magia3.isChecked());
            saveChecked("Kowalstwo1", Kowalstwo1.isChecked());
            saveChecked("Kowalstwo2", Kowalstwo2.isChecked());
            saveChecked("Kowalstwo3", Kowalstwo3.isChecked());
            saveChecked("Ciesielstwo1", Ciesielstwo1.isChecked());
            saveChecked("Ciesielstwo2", Ciesielstwo2.isChecked());
            saveChecked("Ciesielstwo3", Ciesielstwo3.isChecked());
            saveChecked("Alchemia1", Alchemia1.isChecked());
            saveChecked("Alchemia2", Alchemia2.isChecked());
            saveChecked("Alchemia3", Alchemia3.isChecked());
            saveChecked("Gotowanie1", Gotowanie1.isChecked());
            saveChecked("Gotowanie2", Gotowanie2.isChecked());
            saveChecked("Gotowanie3", Gotowanie3.isChecked());
            saveChecked("Krawiectwo1", Krawiectwo1.isChecked());
            saveChecked("Krawiectwo2", Krawiectwo2.isChecked());
            saveChecked("Krawiectwo3", Krawiectwo3.isChecked());
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
        Armor1Durability1.setChecked(loadChecked("Armor1Durability1"));
        Armor1Durability2.setChecked(loadChecked("Armor1Durability2"));
        Armor1Durability3.setChecked(loadChecked("Armor1Durability3"));
        Armor1Durability4.setChecked(loadChecked("Armor1Durability4"));
        Armor1Durability5.setChecked(loadChecked("Armor1Durability5"));
        Armor2Durability1.setChecked(loadChecked("Armor2Durability1"));
        Armor2Durability2.setChecked(loadChecked("Armor2Durability2"));
        Armor2Durability3.setChecked(loadChecked("Armor2Durability3"));
        Armor2Durability4.setChecked(loadChecked("Armor2Durability4"));
        Armor2Durability5.setChecked(loadChecked("Armor2Durability5"));
        Armor3Durability1.setChecked(loadChecked("Armor3Durability1"));
        Armor3Durability2.setChecked(loadChecked("Armor3Durability2"));
        Armor3Durability3.setChecked(loadChecked("Armor3Durability3"));
        Armor3Durability4.setChecked(loadChecked("Armor3Durability4"));
        Armor3Durability5.setChecked(loadChecked("Armor3Durability5"));
        Armor4Durability1.setChecked(loadChecked("Armor4Durability1"));
        Armor4Durability2.setChecked(loadChecked("Armor4Durability2"));
        Armor4Durability3.setChecked(loadChecked("Armor4Durability3"));
        Armor4Durability4.setChecked(loadChecked("Armor4Durability4"));
        Armor4Durability5.setChecked(loadChecked("Armor4Durability5"));
        Armor5Durability1.setChecked(loadChecked("Armor5Durability1"));
        Armor5Durability2.setChecked(loadChecked("Armor5Durability2"));
        Armor5Durability3.setChecked(loadChecked("Armor5Durability3"));
        Armor5Durability4.setChecked(loadChecked("Armor5Durability4"));
        Armor5Durability5.setChecked(loadChecked("Armor5Durability5"));
        Armor6Durability1.setChecked(loadChecked("Armor6Durability1"));
        Armor6Durability2.setChecked(loadChecked("Armor6Durability2"));
        Armor6Durability3.setChecked(loadChecked("Armor6Durability3"));
        Armor6Durability4.setChecked(loadChecked("Armor6Durability4"));
        Armor6Durability5.setChecked(loadChecked("Armor6Durability5"));
        LesserWoundChekbox1.setChecked(loadChecked("LesserWoundChekbox1"));
        LesserWoundChekbox2.setChecked(loadChecked("LesserWoundChekbox2"));
        LesserWoundChekbox3.setChecked(loadChecked("LesserWoundChekbox3"));
        LesserWoundChekbox4.setChecked(loadChecked("LesserWoundChekbox4"));
        LesserWoundChekbox5.setChecked(loadChecked("LesserWoundChekbox5"));
        WoundChekbox1.setChecked(loadChecked("WoundChekbox1"));
        WoundChekbox2.setChecked(loadChecked("WoundChekbox2"));
        WoundChekbox3.setChecked(loadChecked("WoundChekbox3"));
        WoundChekbox4.setChecked(loadChecked("WoundChekbox4"));
        WoundChekbox5.setChecked(loadChecked("WoundChekbox5"));
        GreaterWoundChekbox1.setChecked(loadChecked("GreaterWoundChekbox1"));
        GreaterWoundChekbox2.setChecked(loadChecked("GreaterWoundChekbox2"));
        GreaterWoundChekbox3.setChecked(loadChecked("GreaterWoundChekbox3"));
        GreaterWoundChekbox4.setChecked(loadChecked("GreaterWoundChekbox4"));
        GreaterWoundChekbox5.setChecked(loadChecked("GreaterWoundChekbox5"));
        BronKrotka1.setChecked(loadChecked("BronKrotka1"));
        BronKrotka2.setChecked(loadChecked("BronKrotka2"));
        BronKrotka3.setChecked(loadChecked("BronKrotka3"));
        BronLekka1.setChecked(loadChecked("BronLekka1"));
        BronLekka2.setChecked(loadChecked("BronLekka2"));
        BronLekka3.setChecked(loadChecked("BronLekka3"));
        BronCiezka1.setChecked(loadChecked("BronCiezka1"));
        BronCiezka2.setChecked(loadChecked("BronCiezka2"));
        BronCiezka3.setChecked(loadChecked("BronCiezka3"));
        BronDrzewcowa1.setChecked(loadChecked("BronDrzewcowa1"));
        BronDrzewcowa2.setChecked(loadChecked("BronDrzewcowa2"));
        BronDrzewcowa3.setChecked(loadChecked("BronDrzewcowa3"));
        Obrona1.setChecked(loadChecked("Obrona1"));
        Obrona2.setChecked(loadChecked("Obrona2"));
        Obrona3.setChecked(loadChecked("Obrona3"));
        Strzelectwo1.setChecked(loadChecked("Strzelectwo1"));
        Strzelectwo2.setChecked(loadChecked("Strzelectwo2"));
        Strzelectwo3.setChecked(loadChecked("Strzelectwo3"));
        Perswazja1.setChecked(loadChecked("Perswazja1"));
        Perswazja2.setChecked(loadChecked("Perswazja2"));
        Perswazja3.setChecked(loadChecked("Perswazja3"));
        Cwaniactwo1.setChecked(loadChecked("Cwaniactwo1"));
        Cwaniactwo2.setChecked(loadChecked("Cwaniactwo2"));
        Cwaniactwo3.setChecked(loadChecked("Cwaniactwo3"));
        Handel1.setChecked(loadChecked("Handel1"));
        Handel2.setChecked(loadChecked("Handel2"));
        Handel3.setChecked(loadChecked("Handel3"));
        Etykieta1.setChecked(loadChecked("Etykieta1"));
        Etykieta2.setChecked(loadChecked("Etykieta2"));
        Etykieta3.setChecked(loadChecked("Etykieta3"));
        Przetrwanie1.setChecked(loadChecked("Przetrwanie1"));
        Przetrwanie2.setChecked(loadChecked("Przetrwanie2"));
        Przetrwanie3.setChecked(loadChecked("Przetrwanie3"));
        Oburecznosc1.setChecked(loadChecked("Oburecznosc1"));
        Oburecznosc2.setChecked(loadChecked("Oburecznosc2"));
        Oburecznosc3.setChecked(loadChecked("Oburecznosc3"));
        Percepcja1.setChecked(loadChecked("Percepcja1"));
        Percepcja1.setChecked(loadChecked("Percepcja1"));
        Percepcja1.setChecked(loadChecked("Percepcja1"));
        Podstepy1.setChecked(loadChecked("Podstepy1"));
        Podstepy2.setChecked(loadChecked("Podstepy2"));
        Podstepy3.setChecked(loadChecked("Podstepy3"));
        Leczenie1.setChecked(loadChecked("Leczenie1"));
        Leczenie2.setChecked(loadChecked("Leczenie2"));
        Leczenie3.setChecked(loadChecked("Leczenie3"));
        Zbieractwo1.setChecked(loadChecked("Zbieractwo1"));
        Zbieractwo2.setChecked(loadChecked("Zbieractwo2"));
        Zbieractwo3.setChecked(loadChecked("Zbieractwo3"));
        Magia1.setChecked(loadChecked("Magia1"));
        Magia2.setChecked(loadChecked("Magia2"));
        Magia3.setChecked(loadChecked("Magia3"));
        Kowalstwo1.setChecked(loadChecked("Kowalstwo1"));
        Kowalstwo2.setChecked(loadChecked("Kowalstwo2"));
        Kowalstwo3.setChecked(loadChecked("Kowalstwo3"));
        Ciesielstwo1.setChecked(loadChecked("Ciesielstwo1"));
        Ciesielstwo2.setChecked(loadChecked("Ciesielstwo2"));
        Ciesielstwo3.setChecked(loadChecked("Ciesielstwo3"));
        Alchemia1.setChecked(loadChecked("Alchemia1"));
        Alchemia2.setChecked(loadChecked("Alchemia2"));
        Alchemia3.setChecked(loadChecked("Alchemia3"));
        Gotowanie1.setChecked(loadChecked("Gotowanie1"));
        Gotowanie2.setChecked(loadChecked("Gotowanie2"));
        Gotowanie3.setChecked(loadChecked("Gotowanie3"));
        Krawiectwo1.setChecked(loadChecked("Krawiectwo1"));
        Krawiectwo2.setChecked(loadChecked("Krawiectwo2"));
        Krawiectwo3.setChecked(loadChecked("Krawiectwo3"));
        Context context;
        context = this;
        Bitmap bitmap = new ImageSaver(context).
                setFileName("myImage.png").
                setDirectoryName("images").
                loadBitmap();
        ImageUploaded.setImageBitmap(bitmap);
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

            FileInputStream fileIninputArmor1 = openFileInput("inputArmor1.txt");
            InputStreamReader InputReadArmor1 = new InputStreamReader(fileIninputArmor1);

            String Armor11 = "";

            while ((charRead = InputReadArmor1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor11 += readstring;
            }
            InputReadArmor1.close();
            Armor1.setText(Armor11);

            FileInputStream fileIninputArmor1Type = openFileInput("inputArmor1Type.txt");
            InputStreamReader InputReadArmor1Type = new InputStreamReader(fileIninputArmor1Type);

            String Armor1Type1 = "";

            while ((charRead = InputReadArmor1Type.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor1Type1 += readstring;
            }
            InputReadArmor1Type.close();
            Armor1Type.setText(Armor1Type1);

            FileInputStream fileIninputArmor1PP = openFileInput("inputArmor1PP.txt");
            InputStreamReader InputReadArmor1PP = new InputStreamReader(fileIninputArmor1PP);

            String Armor1PP1 = "";

            while ((charRead = InputReadArmor1PP.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor1PP1 += readstring;
            }
            InputReadArmor1PP.close();
            Armor1PP.setText(Armor1PP1);

            FileInputStream fileIninputArmor2 = openFileInput("inputArmor2.txt");
            InputStreamReader InputReadArmor2 = new InputStreamReader(fileIninputArmor2);

            String Armor21 = "";

            while ((charRead = InputReadArmor2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor21 += readstring;
            }
            InputReadArmor2.close();
            Armor2.setText(Armor21);

            FileInputStream fileIninputArmor2Type = openFileInput("inputArmor2Type.txt");
            InputStreamReader InputReadArmor2Type = new InputStreamReader(fileIninputArmor2Type);

            String Armor2Type1 = "";

            while ((charRead = InputReadArmor2Type.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor2Type1 += readstring;
            }
            InputReadArmor2Type.close();
            Armor2Type.setText(Armor2Type1);

            FileInputStream fileIninputArmor2PP = openFileInput("inputArmor2PP.txt");
            InputStreamReader InputReadArmor2PP = new InputStreamReader(fileIninputArmor2PP);

            String Armor2PP1 = "";

            while ((charRead = InputReadArmor2PP.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor2PP1 += readstring;
            }
            InputReadArmor2PP.close();
            Armor2PP.setText(Armor2PP1);

            FileInputStream fileIninputArmor3 = openFileInput("inputArmor3.txt");
            InputStreamReader InputReadArmor3 = new InputStreamReader(fileIninputArmor3);

            String Armor31 = "";

            while ((charRead = InputReadArmor3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor31 += readstring;
            }
            InputReadArmor3.close();
            Armor3.setText(Armor31);

            FileInputStream fileIninputArmor3Type = openFileInput("inputArmor3Type.txt");
            InputStreamReader InputReadArmor3Type = new InputStreamReader(fileIninputArmor3Type);

            String Armor3Type1 = "";

            while ((charRead = InputReadArmor3Type.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor3Type1 += readstring;
            }
            InputReadArmor3Type.close();
            Armor3Type.setText(Armor3Type1);

            FileInputStream fileIninputArmor3PP = openFileInput("inputArmor3PP.txt");
            InputStreamReader InputReadArmor3PP = new InputStreamReader(fileIninputArmor3PP);

            String Armor3PP1 = "";

            while ((charRead = InputReadArmor3PP.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor3PP1 += readstring;
            }
            InputReadArmor3PP.close();
            Armor3PP.setText(Armor3PP1);

            FileInputStream fileIninputArmor4 = openFileInput("inputArmor4.txt");
            InputStreamReader InputReadArmor4 = new InputStreamReader(fileIninputArmor4);

            String Armor41 = "";

            while ((charRead = InputReadArmor4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor41 += readstring;
            }
            InputReadArmor4.close();
            Armor4.setText(Armor41);

            FileInputStream fileIninputArmor4Type = openFileInput("inputArmor4Type.txt");
            InputStreamReader InputReadArmor4Type = new InputStreamReader(fileIninputArmor4Type);

            String Armor4Type1 = "";

            while ((charRead = InputReadArmor4Type.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor4Type1 += readstring;
            }
            InputReadArmor4Type.close();
            Armor4Type.setText(Armor4Type1);

            FileInputStream fileIninputArmor4PP = openFileInput("inputArmor4PP.txt");
            InputStreamReader InputReadArmor4PP = new InputStreamReader(fileIninputArmor4PP);

            String Armor4PP1 = "";

            while ((charRead = InputReadArmor4PP.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor4PP1 += readstring;
            }
            InputReadArmor4PP.close();
            Armor4PP.setText(Armor4PP1);

            FileInputStream fileIninputArmor5 = openFileInput("inputArmor5.txt");
            InputStreamReader InputReadArmor5 = new InputStreamReader(fileIninputArmor5);

            String Armor51 = "";

            while ((charRead = InputReadArmor5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor51 += readstring;
            }
            InputReadArmor5.close();
            Armor5.setText(Armor51);

            FileInputStream fileIninputArmor5Type = openFileInput("inputArmor5Type.txt");
            InputStreamReader InputReadArmor5Type = new InputStreamReader(fileIninputArmor5Type);

            String Armor5Type1 = "";

            while ((charRead = InputReadArmor5Type.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor5Type1 += readstring;
            }
            InputReadArmor5Type.close();
            Armor5Type.setText(Armor5Type1);

            FileInputStream fileIninputArmor5PP = openFileInput("inputArmor5PP.txt");
            InputStreamReader InputReadArmor5PP = new InputStreamReader(fileIninputArmor5PP);

            String Armor5PP1 = "";

            while ((charRead = InputReadArmor5PP.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor5PP1 += readstring;
            }
            InputReadArmor5PP.close();
            Armor5PP.setText(Armor5PP1);

            FileInputStream fileIninputArmor6 = openFileInput("inputArmor6.txt");
            InputStreamReader InputReadArmor6 = new InputStreamReader(fileIninputArmor6);

            String Armor61 = "";

            while ((charRead = InputReadArmor6.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor61 += readstring;
            }
            InputReadArmor6.close();
            Armor6.setText(Armor61);

            FileInputStream fileIninputArmor6Type = openFileInput("inputArmor6Type.txt");
            InputStreamReader InputReadArmor6Type = new InputStreamReader(fileIninputArmor6Type);

            String Armor6Type1 = "";

            while ((charRead = InputReadArmor6Type.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor6Type1 += readstring;
            }
            InputReadArmor6Type.close();
            Armor6Type.setText(Armor6Type1);

            FileInputStream fileIninputArmor6PP = openFileInput("inputArmor6PP.txt");
            InputStreamReader InputReadArmor6PP = new InputStreamReader(fileIninputArmor6PP);

            String Armor6PP1 = "";

            while ((charRead = InputReadArmor6PP.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Armor6PP1 += readstring;
            }
            InputReadArmor6PP.close();
            Armor6PP.setText(Armor6PP1);

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
            float sila = preferences.getFloat("Siła", 0);
            float budowa = preferences.getFloat("Budowa", 0);
            float kondycja = preferences.getFloat("Kondycja", 0);
            float zrecznosc = preferences.getFloat("Zręcznośc", 0);
            float intelekt = preferences.getFloat("Intelekt", 0);
            float wola = preferences.getFloat("Siła Woli", 0);
            float charyzma = preferences.getFloat("Charyzma", 0);
            int iS = Math.round(sila);
            counterValueStr = iS;
            counterTextViewStr.setText(String.valueOf(iS));
            counterTextViewStr.invalidate();
            int iB = Math.round(budowa);
            counterValueEnd = iB;
            counterTextViewEnd.setText(String.valueOf(iB));
            counterTextViewEnd.invalidate();
            int iK = Math.round(kondycja);
            counterValueKon = iK;
            counterTextViewKon.setText(String.valueOf(iK));
            counterTextViewKon.invalidate();
            int iA = Math.round(zrecznosc);
            counterValueAgi = iA;
            counterTextViewAgi.setText(String.valueOf(iA));
            counterTextViewAgi.invalidate();
            int iI = Math.round(intelekt);
            counterValueInt = iI;
            counterTextViewInt.setText(String.valueOf(iI));
            counterTextViewInt.invalidate();
            int iW = Math.round(wola);
            counterValueWil = iW;
            counterTextViewWil.setText(String.valueOf(iW));
            counterTextViewWil.invalidate();
            int iC = Math.round(charyzma);
            counterValueCha = iC;
            counterTextViewCha.setText(String.valueOf(iC));
            counterTextViewCha.invalidate();
            atrybutyrefresh();
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void onResume() {
        super.onResume();
        atrybutyrefresh();
    }

    private static int RESULT_LOAD_IMAGE = 1;

    public void GalleryOpen (View arg0){
        Intent i = new Intent(
                Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

        startActivityForResult(i, RESULT_LOAD_IMAGE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = {MediaStore.Images.Media.DATA};

            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();

            ImageView ImageUploaded = (ImageView) findViewById(R.id.ImageUploaded);
            ImageUploaded.setImageBitmap(BitmapFactory.decodeFile(picturePath));
            Bitmap bitmap = BitmapFactory.decodeFile(picturePath);
            Context context = this;
            new ImageSaver(context).
                    setFileName("myImage.png").
                    setDirectoryName("images").
                    saveBitmap(bitmap);
        }
    }

        //Nabijanie countera Atrybutu - Strengh
    public void SilaClicked(View view) {
        if(counterValueStr==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueStr++;
            atrybutyrefresh();
        }
    }

    public void SilaCounterClicked(View view) {
        if(counterValueStr==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueStr--;
            atrybutyrefresh();
        }
    }

    //Nabijanie countera Atrybutu - Endurance
    public void BudowaClicked(View view) {
        if(counterValueEnd==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueEnd++;
            atrybutyrefresh();
        }
    }

    public void BudowaCounterClicked(View view) {
        if(counterValueEnd==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueEnd--;
            atrybutyrefresh();
        }
    }

//Nabijanie countera Atrybutu - Kondition
    public void KondycjaClicked(View view) {
        if(counterValueKon==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueKon++;
            atrybutyrefresh();
        }
    }

    public void KondycjaCounterClicked(View view) {
        if(counterValueKon==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueKon--;
            atrybutyrefresh();
        }
    }

//Nabijanie countera Atrybutu - Agility
    public void ZrecznoscClicked(View view) {
        if(counterValueAgi==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueAgi++;
            atrybutyrefresh();
        }
    }

    public void ZrecznoscCounterClicked(View view) {
        if(counterValueAgi==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueAgi--;
            atrybutyrefresh();
        }
    }

//Nabijanie countera Atrybutu - Intelligence
    public void IntelektClicked(View view) {
        if(counterValueInt==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueInt++;
            atrybutyrefresh();
        }
    }

    public void IntelektCounterClicked(View view) {
        if(counterValueInt==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueInt--;
            atrybutyrefresh();
        }
    }

//Nabijanie countera Atrybutu - Will
    public void WolaClicked(View view) {
        if(counterValueWil==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueWil++;
            atrybutyrefresh();
        }
    }

    public void WolaCounterClicked(View view) {
        if(counterValueWil==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueWil--;
            atrybutyrefresh();
        }
    }

//Nabijanie countera Atrybutu - Charysma
    public void CharyzmaClicked(View view) {
        if(counterValueCha==5) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueCha++;
            atrybutyrefresh();
        }
    }

    public void CharyzmaCounterClicked(View view) {
        if(counterValueCha==0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Karta1.this);
            builder.setTitle(R.string.przekroczonoZakres).setPositiveButton("OK", null);
            builder.show();
        }
        else {
            counterValueCha--;
            atrybutyrefresh();
        }
    }

    private void atrybutyrefresh() {
        counterTextViewStr = (TextView) findViewById(R.id.counterTextViewStr);
        counterTextViewEnd = (TextView) findViewById(R.id.counterTextViewEnd);
        counterTextViewKon = (TextView) findViewById(R.id.counterTextViewKon);
        counterTextViewAgi = (TextView) findViewById(R.id.counterTextViewAgi);
        counterTextViewInt = (TextView) findViewById(R.id.counterTextViewInt);
        counterTextViewWil = (TextView) findViewById(R.id.counterTextViewWil);
        counterTextViewCha = (TextView) findViewById(R.id.counterTextViewCha);
        counterTextViewAll = (TextView) findViewById(R.id.counterTextViewAll);
        counterTextViewStr.setText(String.valueOf(counterValueStr));
        counterTextViewEnd.setText(String.valueOf(counterValueEnd));
        counterTextViewKon.setText(String.valueOf(counterValueKon));
        counterTextViewAgi.setText(String.valueOf(counterValueAgi));
        counterTextViewInt.setText(String.valueOf(counterValueInt));
        counterTextViewWil.setText(String.valueOf(counterValueWil));
        counterTextViewCha.setText(String.valueOf(counterValueCha));
    }

//Nabijanie value Experience
    public void reverse(View view) {startActivity(new Intent(this,Karta1_2.class));}


    @Override
    public void onClick(View v) {

    }

    public void ImageDelete(View v){
        int id = getResources().getIdentifier("com.example.daniel.scrolltest3:drawable/" + logo, null, null);
        ImageUploaded.setImageResource(id);
    }
}