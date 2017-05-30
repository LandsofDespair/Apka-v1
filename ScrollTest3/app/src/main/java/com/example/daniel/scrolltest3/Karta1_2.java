package com.example.daniel.scrolltest3;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import android.view.ViewGroup.LayoutParams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import static android.support.v7.app.AlertDialog.*;

public class Karta1_2 extends AppCompatActivity {

    private static final int READ_BLOCK_SIZE = 100;
    Button savebutton;
    FloatingActionButton RuchHelp;
    private EditText MalaSakwa1;
    private EditText MalaSakwa2;
    private EditText MalaSakwa3;
    private EditText MalaSakwa4;
    private EditText MalaSakwa5;
    private EditText MalaSakwa6;
    private EditText MalaSakwaIlosc1;
    private EditText MalaSakwaIlosc2;
    private EditText MalaSakwaIlosc3;
    private EditText MalaSakwaIlosc4;
    private EditText MalaSakwaIlosc5;
    private EditText MalaSakwaIlosc6;
    private EditText MalaSakwaWaga1;
    private EditText MalaSakwaWaga2;
    private EditText MalaSakwaWaga3;
    private EditText MalaSakwaWaga4;
    private EditText MalaSakwaWaga5;
    private EditText MalaSakwaWaga6;
    private EditText DuzaSakwa1;
    private EditText DuzaSakwa2;
    private EditText DuzaSakwa3;
    private EditText DuzaSakwa4;
    private EditText DuzaSakwa5;
    private EditText DuzaSakwa6;
    private EditText DuzaSakwa7;
    private EditText DuzaSakwa8;
    private EditText DuzaSakwa9;
    private EditText DuzaSakwa10;
    private EditText DuzaSakwa11;
    private EditText DuzaSakwa12;
    private EditText DuzaSakwaIlosc1;
    private EditText DuzaSakwaIlosc2;
    private EditText DuzaSakwaIlosc3;
    private EditText DuzaSakwaIlosc4;
    private EditText DuzaSakwaIlosc5;
    private EditText DuzaSakwaIlosc6;
    private EditText DuzaSakwaIlosc7;
    private EditText DuzaSakwaIlosc8;
    private EditText DuzaSakwaIlosc9;
    private EditText DuzaSakwaIlosc10;
    private EditText DuzaSakwaIlosc11;
    private EditText DuzaSakwaIlosc12;
    private EditText DuzaSakwaWaga1;
    private EditText DuzaSakwaWaga2;
    private EditText DuzaSakwaWaga3;
    private EditText DuzaSakwaWaga4;
    private EditText DuzaSakwaWaga5;
    private EditText DuzaSakwaWaga6;
    private EditText DuzaSakwaWaga7;
    private EditText DuzaSakwaWaga8;
    private EditText DuzaSakwaWaga9;
    private EditText DuzaSakwaWaga10;
    private EditText DuzaSakwaWaga11;
    private EditText DuzaSakwaWaga12;
    private EditText Plecak1;
    private EditText Plecak2;
    private EditText Plecak3;
    private EditText Plecak4;
    private EditText Plecak5;
    private EditText Plecak6;
    private EditText Plecak7;
    private EditText Plecak8;
    private EditText Plecak9;
    private EditText Plecak10;
    private EditText Plecak11;
    private EditText Plecak12;
    private EditText Plecak13;
    private EditText Plecak14;
    private EditText Plecak15;
    private EditText Plecak16;
    private EditText Plecak17;
    private EditText Plecak18;
    private EditText Plecak1Ilosc;
    private EditText Plecak2Ilosc;
    private EditText Plecak3Ilosc;
    private EditText Plecak4Ilosc;
    private EditText Plecak5Ilosc;
    private EditText Plecak6Ilosc;
    private EditText Plecak7Ilosc;
    private EditText Plecak8Ilosc;
    private EditText Plecak9Ilosc;
    private EditText Plecak10Ilosc;
    private EditText Plecak11Ilosc;
    private EditText Plecak12Ilosc;
    private EditText Plecak13Ilosc;
    private EditText Plecak14Ilosc;
    private EditText Plecak15Ilosc;
    private EditText Plecak16Ilosc;
    private EditText Plecak17Ilosc;
    private EditText Plecak18Ilosc;
    private EditText Plecak1Waga;
    private EditText Plecak2Waga;
    private EditText Plecak3Waga;
    private EditText Plecak4Waga;
    private EditText Plecak5Waga;
    private EditText Plecak6Waga;
    private EditText Plecak7Waga;
    private EditText Plecak8Waga;
    private EditText Plecak9Waga;
    private EditText Plecak10Waga;
    private EditText Plecak11Waga;
    private EditText Plecak12Waga;
    private EditText Plecak13Waga;
    private EditText Plecak14Waga;
    private EditText Plecak15Waga;
    private EditText Plecak16Waga;
    private EditText Plecak17Waga;
    private EditText Plecak18Waga;
    private EditText Pozywytna1;
    private EditText Pozywytna2;
    private EditText Pozywytna3;
    private EditText Pozywytna4;
    private EditText Pozywytna5;
    private EditText Pozywytna6;
    private EditText Pozywytna7;
    private EditText Pozywytna8;
    private EditText Pozywytna9;
    private EditText Pozywytna10;
    private EditText Negatywna1;
    private EditText Negatywna2;
    private EditText Negatywna3;
    private EditText Negatywna4;
    private EditText Negatywna5;
    private EditText Negatywna6;
    private EditText Negatywna7;
    private EditText Negatywna8;
    private EditText Negatywna9;
    private EditText Negatywna10;
    private EditText Notatki;

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
        savebutton = (Button) findViewById(R.id.savebutton);
        MalaSakwa1 = (EditText) findViewById(R.id.MalaSakwa1);
        MalaSakwa2 = (EditText) findViewById(R.id.MalaSakwa2);
        MalaSakwa3 = (EditText) findViewById(R.id.MalaSakwa3);
        MalaSakwa4 = (EditText) findViewById(R.id.MalaSakwa4);
        MalaSakwa5 = (EditText) findViewById(R.id.MalaSakwa5);
        MalaSakwa6 = (EditText) findViewById(R.id.MalaSakwa6);
        MalaSakwaIlosc1 = (EditText) findViewById(R.id.MalaSakwaIlosc1);
        MalaSakwaIlosc2 = (EditText) findViewById(R.id.MalaSakwaIlosc2);
        MalaSakwaIlosc3 = (EditText) findViewById(R.id.MalaSakwaIlosc3);
        MalaSakwaIlosc4 = (EditText) findViewById(R.id.MalaSakwaIlosc4);
        MalaSakwaIlosc5 = (EditText) findViewById(R.id.MalaSakwaIlosc5);
        MalaSakwaIlosc6 = (EditText) findViewById(R.id.MalaSakwaIlosc6);
        MalaSakwaWaga1 = (EditText) findViewById(R.id.MalaSakwaWaga1);
        MalaSakwaWaga2 = (EditText) findViewById(R.id.MalaSakwaWaga2);
        MalaSakwaWaga3 = (EditText) findViewById(R.id.MalaSakwaWaga3);
        MalaSakwaWaga4 = (EditText) findViewById(R.id.MalaSakwaWaga4);
        MalaSakwaWaga5 = (EditText) findViewById(R.id.MalaSakwaWaga5);
        MalaSakwaWaga6 = (EditText) findViewById(R.id.MalaSakwaWaga6);
        DuzaSakwa1 = (EditText) findViewById(R.id.DuzaSakwa1);
        DuzaSakwa2 = (EditText) findViewById(R.id.DuzaSakwa2);
        DuzaSakwa3 = (EditText) findViewById(R.id.DuzaSakwa3);
        DuzaSakwa4 = (EditText) findViewById(R.id.DuzaSakwa4);
        DuzaSakwa5 = (EditText) findViewById(R.id.DuzaSakwa5);
        DuzaSakwa6 = (EditText) findViewById(R.id.DuzaSakwa6);
        DuzaSakwa7 = (EditText) findViewById(R.id.DuzaSakwa7);
        DuzaSakwa8 = (EditText) findViewById(R.id.DuzaSakwa8);
        DuzaSakwa9 = (EditText) findViewById(R.id.DuzaSakwa9);
        DuzaSakwa10 = (EditText) findViewById(R.id.DuzaSakwa10);
        DuzaSakwa11 = (EditText) findViewById(R.id.DuzaSakwa11);
        DuzaSakwa12 = (EditText) findViewById(R.id.DuzaSakwa12);
        DuzaSakwaIlosc1 = (EditText) findViewById(R.id.DuzaSakwaIlosc1);
        DuzaSakwaIlosc2 = (EditText) findViewById(R.id.DuzaSakwaIlosc2);
        DuzaSakwaIlosc3 = (EditText) findViewById(R.id.DuzaSakwaIlosc3);
        DuzaSakwaIlosc4 = (EditText) findViewById(R.id.DuzaSakwaIlosc4);
        DuzaSakwaIlosc5 = (EditText) findViewById(R.id.DuzaSakwaIlosc5);
        DuzaSakwaIlosc6 = (EditText) findViewById(R.id.DuzaSakwaIlosc6);
        DuzaSakwaIlosc7 = (EditText) findViewById(R.id.DuzaSakwaIlosc7);
        DuzaSakwaIlosc8 = (EditText) findViewById(R.id.DuzaSakwaIlosc8);
        DuzaSakwaIlosc9 = (EditText) findViewById(R.id.DuzaSakwaIlosc9);
        DuzaSakwaIlosc10 = (EditText) findViewById(R.id.DuzaSakwaIlosc10);
        DuzaSakwaIlosc11 = (EditText) findViewById(R.id.DuzaSakwaIlosc11);
        DuzaSakwaIlosc12 = (EditText) findViewById(R.id.DuzaSakwaIlosc12);
        DuzaSakwaWaga1 = (EditText) findViewById(R.id.DuzaSakwaWaga1);
        DuzaSakwaWaga2 = (EditText) findViewById(R.id.DuzaSakwaWaga2);
        DuzaSakwaWaga3 = (EditText) findViewById(R.id.DuzaSakwaWaga3);
        DuzaSakwaWaga4 = (EditText) findViewById(R.id.DuzaSakwaWaga4);
        DuzaSakwaWaga5 = (EditText) findViewById(R.id.DuzaSakwaWaga5);
        DuzaSakwaWaga6 = (EditText) findViewById(R.id.DuzaSakwaWaga6);
        DuzaSakwaWaga7 = (EditText) findViewById(R.id.DuzaSakwaWaga7);
        DuzaSakwaWaga8 = (EditText) findViewById(R.id.DuzaSakwaWaga8);
        DuzaSakwaWaga9 = (EditText) findViewById(R.id.DuzaSakwaWaga9);
        DuzaSakwaWaga10 = (EditText) findViewById(R.id.DuzaSakwaWaga10);
        DuzaSakwaWaga11 = (EditText) findViewById(R.id.DuzaSakwaWaga11);
        DuzaSakwaWaga12 = (EditText) findViewById(R.id.DuzaSakwaWaga12);
        Pozywytna1 = (EditText) findViewById(R.id.Pozywytna1);
        Pozywytna2 = (EditText) findViewById(R.id.Pozywytna2);
        Pozywytna3 = (EditText) findViewById(R.id.Pozywytna3);
        Pozywytna4 = (EditText) findViewById(R.id.Pozywytna4);
        Pozywytna5 = (EditText) findViewById(R.id.Pozywytna5);
        Pozywytna6 = (EditText) findViewById(R.id.Pozywytna6);
        Pozywytna7 = (EditText) findViewById(R.id.Pozywytna7);
        Pozywytna8 = (EditText) findViewById(R.id.Pozywytna8);
        Pozywytna9 = (EditText) findViewById(R.id.Pozywytna9);
        Pozywytna10 = (EditText) findViewById(R.id.Pozywytna10);
        Negatywna1 = (EditText) findViewById(R.id.Negatywna1);
        Negatywna2 = (EditText) findViewById(R.id.Negatywna2);
        Negatywna3 = (EditText) findViewById(R.id.Negatywna3);
        Negatywna4 = (EditText) findViewById(R.id.Negatywna4);
        Negatywna5 = (EditText) findViewById(R.id.Negatywna5);
        Negatywna6 = (EditText) findViewById(R.id.Negatywna6);
        Negatywna7 = (EditText) findViewById(R.id.Negatywna7);
        Negatywna8 = (EditText) findViewById(R.id.Negatywna8);
        Negatywna9 = (EditText) findViewById(R.id.Negatywna9);
        Negatywna10 = (EditText) findViewById(R.id.Negatywna10);
        Plecak1 = (EditText) findViewById(R.id.Plecak1);
        Plecak2 = (EditText) findViewById(R.id.Plecak2);
        Plecak3 = (EditText) findViewById(R.id.Plecak3);
        Plecak4 = (EditText) findViewById(R.id.Plecak4);
        Plecak5 = (EditText) findViewById(R.id.Plecak5);
        Plecak6 = (EditText) findViewById(R.id.Plecak6);
        Plecak7 = (EditText) findViewById(R.id.Plecak7);
        Plecak8 = (EditText) findViewById(R.id.Plecak8);
        Plecak9 = (EditText) findViewById(R.id.Plecak9);
        Plecak10 = (EditText) findViewById(R.id.Plecak10);
        Plecak11 = (EditText) findViewById(R.id.Plecak11);
        Plecak12 = (EditText) findViewById(R.id.Plecak12);
        Plecak13 = (EditText) findViewById(R.id.Plecak13);
        Plecak14 = (EditText) findViewById(R.id.Plecak14);
        Plecak15 = (EditText) findViewById(R.id.Plecak15);
        Plecak16 = (EditText) findViewById(R.id.Plecak16);
        Plecak17 = (EditText) findViewById(R.id.Plecak17);
        Plecak18 = (EditText) findViewById(R.id.Plecak18);
        Plecak1Ilosc = (EditText) findViewById(R.id.Plecak1Ilosc);
        Plecak2Ilosc = (EditText) findViewById(R.id.Plecak2Ilosc);
        Plecak3Ilosc = (EditText) findViewById(R.id.Plecak3Ilosc);
        Plecak4Ilosc = (EditText) findViewById(R.id.Plecak4Ilosc);
        Plecak5Ilosc = (EditText) findViewById(R.id.Plecak5Ilosc);
        Plecak6Ilosc = (EditText) findViewById(R.id.Plecak6Ilosc);
        Plecak7Ilosc = (EditText) findViewById(R.id.Plecak7Ilosc);
        Plecak8Ilosc = (EditText) findViewById(R.id.Plecak8Ilosc);
        Plecak9Ilosc = (EditText) findViewById(R.id.Plecak9Ilosc);
        Plecak10Ilosc = (EditText) findViewById(R.id.Plecak10Ilosc);
        Plecak11Ilosc = (EditText) findViewById(R.id.Plecak11Ilosc);
        Plecak12Ilosc = (EditText) findViewById(R.id.Plecak12Ilosc);
        Plecak13Ilosc = (EditText) findViewById(R.id.Plecak13Ilosc);
        Plecak14Ilosc = (EditText) findViewById(R.id.Plecak14Ilosc);
        Plecak15Ilosc = (EditText) findViewById(R.id.Plecak15Ilosc);
        Plecak16Ilosc = (EditText) findViewById(R.id.Plecak16Ilosc);
        Plecak17Ilosc = (EditText) findViewById(R.id.Plecak17Ilosc);
        Plecak18Ilosc = (EditText) findViewById(R.id.Plecak18Ilosc);
        Plecak1Waga = (EditText) findViewById(R.id.Plecak1Waga);
        Plecak2Waga = (EditText) findViewById(R.id.Plecak2Waga);
        Plecak3Waga = (EditText) findViewById(R.id.Plecak3Waga);
        Plecak4Waga = (EditText) findViewById(R.id.Plecak4Waga);
        Plecak5Waga = (EditText) findViewById(R.id.Plecak5Waga);
        Plecak6Waga = (EditText) findViewById(R.id.Plecak6Waga);
        Plecak7Waga = (EditText) findViewById(R.id.Plecak7Waga);
        Plecak8Waga = (EditText) findViewById(R.id.Plecak8Waga);
        Plecak9Waga = (EditText) findViewById(R.id.Plecak9Waga);
        Plecak10Waga = (EditText) findViewById(R.id.Plecak10Waga);
        Plecak11Waga = (EditText) findViewById(R.id.Plecak11Waga);
        Plecak12Waga = (EditText) findViewById(R.id.Plecak12Waga);
        Plecak13Waga = (EditText) findViewById(R.id.Plecak13Waga);
        Plecak14Waga = (EditText) findViewById(R.id.Plecak14Waga);
        Plecak15Waga = (EditText) findViewById(R.id.Plecak15Waga);
        Plecak16Waga = (EditText) findViewById(R.id.Plecak16Waga);
        Plecak17Waga = (EditText) findViewById(R.id.Plecak17Waga);
        Plecak18Waga = (EditText) findViewById(R.id.Plecak18Waga);
        Notatki = (EditText) findViewById(R.id.Notatki);
        load();

        final TextView btnOpenPopup = (TextView) findViewById(R.id.RuchHelp);
        btnOpenPopup.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popupruchhelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopup, 50, -30);

            }
        });


        final TextView btnOpenPopupAtakHelp = (TextView) findViewById(R.id.AtakHelp);
        btnOpenPopupAtakHelp.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popupatakhelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopupAtakHelp, 50, -30);

            }
        });

        final TextView btnOpenPopupStrzalHelp = (TextView) findViewById(R.id.StrzalHelp);
        btnOpenPopupStrzalHelp.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popustrzalkhelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopupAtakHelp, 50, -30);

            }
        });

        final TextView btnOpenPopupParowanieHelp = (TextView) findViewById(R.id.ParowanieHelp);
        btnOpenPopupParowanieHelp.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popuparowaniehelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopupAtakHelp, 50, -30);

            }
        });

        final TextView btnOpenPopupOdepchniecieHelp = (TextView) findViewById(R.id.OdepchniecieHelp);
        btnOpenPopupOdepchniecieHelp.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popupodepchnieciehelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopupAtakHelp, 50, -30);

            }
        });

        final TextView btnOpenPopupPostawaHelp = (TextView) findViewById(R.id.PostawaHelp);
        btnOpenPopupPostawaHelp.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popuppostawahelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopupAtakHelp, 50, -30);

            }
        });

        final TextView btnOpenPopupPrzeladowanieHelp = (TextView) findViewById(R.id.PrzeladowanieHelp);
        btnOpenPopupPrzeladowanieHelp.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popuprzeladowaniehelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopupAtakHelp, 50, -30);

            }
        });

        final TextView btnOpenPopupSkokHelp = (TextView) findViewById(R.id.SkokHelp);
        btnOpenPopupSkokHelp.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popupskokhelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopupAtakHelp, 50, -30);

            }
        });

        final TextView btnOpenPopupUmiejetnoscHelp = (TextView) findViewById(R.id.UmiejetnoscHelp);
        btnOpenPopupUmiejetnoscHelp.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popupumiejetnoschelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopupAtakHelp, 50, -30);

            }
        });

        final TextView btnOpenPopupWycelowanieHelp = (TextView) findViewById(R.id.WycelowanieHelp);
        btnOpenPopupWycelowanieHelp.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popupwycelowaniehelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopupAtakHelp, 50, -30);

            }
        });

        final TextView btnOpenPopupZakleciaHelp = (TextView) findViewById(R.id.ZakleciaHelp);
        btnOpenPopupZakleciaHelp.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popupzakleciahelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopupAtakHelp, 50, -30);

            }
        });

        final TextView btnOpenPopupZmianaBroniHelp = (TextView) findViewById(R.id.ZmianaBroniHelp);
        btnOpenPopupZmianaBroniHelp.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater) getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popupzmianabronihelp, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT);

                Button btnDismiss = (Button) popupView.findViewById(R.id.dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }
                });

                popupWindow.showAsDropDown(btnOpenPopupAtakHelp, 50, -30);

            }
        });
    }

    private void load() {
        try {

            FileInputStream fileIninputMalaSakwa1 = openFileInput("MalaSakwa1.txt");
            InputStreamReader InputMalaSakwa1 = new InputStreamReader(fileIninputMalaSakwa1);

            char[] inputBuffer = new char[READ_BLOCK_SIZE];
            String MalaSakwa1S = "";
            int charRead;
            while ((charRead = InputMalaSakwa1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwa1S += readstring;
            }

            InputMalaSakwa1.close();
            MalaSakwa1.setText(MalaSakwa1S);

            FileInputStream fileIninputMalaSakwa2 = openFileInput("MalaSakwa2.txt");
            InputStreamReader InputMalaSakwa2 = new InputStreamReader(fileIninputMalaSakwa2);

            String MalaSakwa2S = "";
            while ((charRead = InputMalaSakwa2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwa2S += readstring;
            }

            InputMalaSakwa2.close();
            MalaSakwa2.setText(MalaSakwa2S);

            FileInputStream fileIninputMalaSakwa3 = openFileInput("MalaSakwa3.txt");
            InputStreamReader InputMalaSakwa3 = new InputStreamReader(fileIninputMalaSakwa3);

            String MalaSakwa3S = "";
            while ((charRead = InputMalaSakwa3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwa3S += readstring;
            }

            InputMalaSakwa3.close();
            MalaSakwa3.setText(MalaSakwa3S);

            FileInputStream fileIninputMalaSakwa4 = openFileInput("MalaSakwa4.txt");
            InputStreamReader InputMalaSakwa4 = new InputStreamReader(fileIninputMalaSakwa4);

            String MalaSakwa4S = "";
            while ((charRead = InputMalaSakwa4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwa4S += readstring;
            }

            InputMalaSakwa4.close();
            MalaSakwa4.setText(MalaSakwa4S);

            FileInputStream fileIninputMalaSakwa5 = openFileInput("MalaSakwa5.txt");
            InputStreamReader InputMalaSakwa5 = new InputStreamReader(fileIninputMalaSakwa5);

            String MalaSakwa5S = "";
            while ((charRead = InputMalaSakwa5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwa5S += readstring;
            }

            InputMalaSakwa5.close();
            MalaSakwa5.setText(MalaSakwa5S);

            FileInputStream fileIninputMalaSakwa6 = openFileInput("MalaSakwa6.txt");
            InputStreamReader InputMalaSakwa6 = new InputStreamReader(fileIninputMalaSakwa6);

            String MalaSakwa6S = "";
            while ((charRead = InputMalaSakwa6.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwa6S += readstring;
            }

            InputMalaSakwa6.close();
            MalaSakwa6.setText(MalaSakwa6S);

            FileInputStream fileIninputMalaSakwaIlosc1 = openFileInput("MalaSakwaIlosc1.txt");
            InputStreamReader InputMalaSakwaIlosc1 = new InputStreamReader(fileIninputMalaSakwaIlosc1);

            String MalaSakwaIlosc1S = "";
            while ((charRead = InputMalaSakwaIlosc1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaIlosc1S += readstring;
            }

            InputMalaSakwaIlosc1.close();
            MalaSakwaIlosc1.setText(MalaSakwaIlosc1S);

            FileInputStream fileIninputMalaSakwaIlosc2 = openFileInput("MalaSakwaIlosc2.txt");
            InputStreamReader InputMalaSakwaIlosc2 = new InputStreamReader(fileIninputMalaSakwaIlosc2);

            String MalaSakwaIlosc2S = "";
            while ((charRead = InputMalaSakwaIlosc2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaIlosc2S += readstring;
            }

            InputMalaSakwaIlosc2.close();
            MalaSakwaIlosc2.setText(MalaSakwaIlosc2S);

            FileInputStream fileIninputMalaSakwaIlosc3 = openFileInput("MalaSakwaIlosc3.txt");
            InputStreamReader InputMalaSakwaIlosc3 = new InputStreamReader(fileIninputMalaSakwaIlosc3);

            String MalaSakwaIlosc3S = "";
            while ((charRead = InputMalaSakwaIlosc3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaIlosc3S += readstring;
            }

            InputMalaSakwaIlosc3.close();
            MalaSakwaIlosc3.setText(MalaSakwaIlosc3S);

            FileInputStream fileIninputMalaSakwaIlosc4 = openFileInput("MalaSakwaIlosc4.txt");
            InputStreamReader InputMalaSakwaIlosc4 = new InputStreamReader(fileIninputMalaSakwaIlosc4);

            String MalaSakwaIlosc4S = "";
            while ((charRead = InputMalaSakwaIlosc4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaIlosc4S += readstring;
            }

            InputMalaSakwaIlosc4.close();
            MalaSakwaIlosc4.setText(MalaSakwaIlosc4S);

            FileInputStream fileIninputMalaSakwaIlosc5 = openFileInput("MalaSakwaIlosc5.txt");
            InputStreamReader InputMalaSakwaIlosc5 = new InputStreamReader(fileIninputMalaSakwaIlosc5);

            String MalaSakwaIlosc5S = "";
            while ((charRead = InputMalaSakwaIlosc5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaIlosc5S += readstring;
            }

            InputMalaSakwaIlosc5.close();
            MalaSakwaIlosc5.setText(MalaSakwaIlosc5S);

            FileInputStream fileIninputMalaSakwaIlosc6 = openFileInput("MalaSakwaIlosc6.txt");
            InputStreamReader InputMalaSakwaIlosc6 = new InputStreamReader(fileIninputMalaSakwaIlosc6);

            String MalaSakwaIlosc6S = "";
            while ((charRead = InputMalaSakwaIlosc6.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaIlosc6S += readstring;
            }

            InputMalaSakwaIlosc6.close();
            MalaSakwaIlosc6.setText(MalaSakwaIlosc6S);

            FileInputStream fileIninputMalaSakwaWaga1 = openFileInput("MalaSakwaWaga1.txt");
            InputStreamReader InputMalaSakwaWaga1 = new InputStreamReader(fileIninputMalaSakwaWaga1);

            String MalaSakwaWaga1S = "";
            while ((charRead = InputMalaSakwaWaga1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaWaga1S += readstring;
            }

            InputMalaSakwaWaga1.close();
            MalaSakwaWaga1.setText(MalaSakwaWaga1S);

            FileInputStream fileIninputMalaSakwaWaga2 = openFileInput("MalaSakwaWaga2.txt");
            InputStreamReader InputMalaSakwaWaga2 = new InputStreamReader(fileIninputMalaSakwaWaga2);

            String MalaSakwaWaga2S = "";
            while ((charRead = InputMalaSakwaWaga2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaWaga2S += readstring;
            }

            InputMalaSakwaWaga2.close();
            MalaSakwaWaga2.setText(MalaSakwaWaga2S);

            FileInputStream fileIninputMalaSakwaWaga3 = openFileInput("MalaSakwaWaga3.txt");
            InputStreamReader InputMalaSakwaWaga3 = new InputStreamReader(fileIninputMalaSakwaWaga3);

            String MalaSakwaWaga3S = "";
            while ((charRead = InputMalaSakwaWaga3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaWaga3S += readstring;
            }

            InputMalaSakwaWaga3.close();
            MalaSakwaWaga3.setText(MalaSakwaWaga3S);

            FileInputStream fileIninputMalaSakwaWaga4 = openFileInput("MalaSakwaWaga4.txt");
            InputStreamReader InputMalaSakwaWaga4 = new InputStreamReader(fileIninputMalaSakwaWaga4);

            String MalaSakwaWaga4S = "";
            while ((charRead = InputMalaSakwaWaga4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaWaga4S += readstring;
            }

            InputMalaSakwaWaga4.close();
            MalaSakwaWaga4.setText(MalaSakwaWaga4S);

            FileInputStream fileIninputMalaSakwaWaga5 = openFileInput("MalaSakwaWaga5.txt");
            InputStreamReader InputMalaSakwaWaga5 = new InputStreamReader(fileIninputMalaSakwaWaga5);

            String MalaSakwaWaga5S = "";
            while ((charRead = InputMalaSakwaWaga5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaWaga5S += readstring;
            }

            InputMalaSakwaWaga5.close();
            MalaSakwaWaga5.setText(MalaSakwaWaga5S);

            FileInputStream fileIninputMalaSakwaWaga6 = openFileInput("MalaSakwaWaga6.txt");
            InputStreamReader InputMalaSakwaWaga6 = new InputStreamReader(fileIninputMalaSakwaWaga6);

            String MalaSakwaWaga6S = "";
            while ((charRead = InputMalaSakwaWaga6.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                MalaSakwaWaga6S += readstring;
            }

            InputMalaSakwaWaga6.close();
            MalaSakwaWaga6.setText(MalaSakwaWaga6S);

            FileInputStream fileIninputDuzaSakwa1 = openFileInput("DuzaSakwa1.txt");
            InputStreamReader InputDuzaSakwa1 = new InputStreamReader(fileIninputDuzaSakwa1);

            String DuzaSakwa1S = "";
            while ((charRead = InputDuzaSakwa1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa1S += readstring;
            }

            InputDuzaSakwa1.close();
            DuzaSakwa1.setText(DuzaSakwa1S);

            FileInputStream fileIninputDuzaSakwa2 = openFileInput("DuzaSakwa2.txt");
            InputStreamReader InputDuzaSakwa2 = new InputStreamReader(fileIninputDuzaSakwa2);

            String DuzaSakwa2S = "";
            while ((charRead = InputDuzaSakwa2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa2S += readstring;
            }

            InputDuzaSakwa2.close();
            DuzaSakwa2.setText(DuzaSakwa2S);

            FileInputStream fileIninputDuzaSakwa3 = openFileInput("DuzaSakwa3.txt");
            InputStreamReader InputDuzaSakwa3 = new InputStreamReader(fileIninputDuzaSakwa3);

            String DuzaSakwa3S = "";
            while ((charRead = InputDuzaSakwa3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa3S += readstring;
            }

            InputDuzaSakwa3.close();
            DuzaSakwa3.setText(DuzaSakwa3S);

            FileInputStream fileIninputDuzaSakwa4 = openFileInput("DuzaSakwa4.txt");
            InputStreamReader InputDuzaSakwa4 = new InputStreamReader(fileIninputDuzaSakwa4);

            String DuzaSakwa4S = "";
            while ((charRead = InputDuzaSakwa4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa4S += readstring;
            }

            InputDuzaSakwa4.close();
            DuzaSakwa4.setText(DuzaSakwa4S);

            FileInputStream fileIninputDuzaSakwa5 = openFileInput("DuzaSakwa5.txt");
            InputStreamReader InputDuzaSakwa5 = new InputStreamReader(fileIninputDuzaSakwa5);

            String DuzaSakwa5S = "";
            while ((charRead = InputDuzaSakwa5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa5S += readstring;
            }

            InputDuzaSakwa5.close();
            DuzaSakwa5.setText(DuzaSakwa5S);

            FileInputStream fileIninputDuzaSakwa6 = openFileInput("DuzaSakwa6.txt");
            InputStreamReader InputDuzaSakwa6 = new InputStreamReader(fileIninputDuzaSakwa6);

            String DuzaSakwa6S = "";
            while ((charRead = InputDuzaSakwa6.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa6S += readstring;
            }

            InputDuzaSakwa6.close();
            DuzaSakwa6.setText(DuzaSakwa6S);

            FileInputStream fileIninputDuzaSakwa7 = openFileInput("DuzaSakwa7.txt");
            InputStreamReader InputDuzaSakwa7 = new InputStreamReader(fileIninputDuzaSakwa7);

            String DuzaSakwa7S = "";
            while ((charRead = InputDuzaSakwa7.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa7S += readstring;
            }

            InputDuzaSakwa7.close();
            DuzaSakwa7.setText(DuzaSakwa7S);

            FileInputStream fileIninputDuzaSakwa8 = openFileInput("DuzaSakwa8.txt");
            InputStreamReader InputDuzaSakwa8 = new InputStreamReader(fileIninputDuzaSakwa8);

            String DuzaSakwa8S = "";
            while ((charRead = InputDuzaSakwa8.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa8S += readstring;
            }

            InputDuzaSakwa8.close();
            DuzaSakwa8.setText(DuzaSakwa8S);

            FileInputStream fileIninputDuzaSakwa9 = openFileInput("DuzaSakwa9.txt");
            InputStreamReader InputDuzaSakwa9 = new InputStreamReader(fileIninputDuzaSakwa9);

            String DuzaSakwa9S = "";
            while ((charRead = InputDuzaSakwa9.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa9S += readstring;
            }

            InputDuzaSakwa9.close();
            DuzaSakwa9.setText(DuzaSakwa9S);

            FileInputStream fileIninputDuzaSakwa10 = openFileInput("DuzaSakwa10.txt");
            InputStreamReader InputDuzaSakwa10 = new InputStreamReader(fileIninputDuzaSakwa10);

            String DuzaSakwa10S = "";
            while ((charRead = InputDuzaSakwa10.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa10S += readstring;
            }

            InputDuzaSakwa10.close();
            DuzaSakwa10.setText(DuzaSakwa10S);

            FileInputStream fileIninputDuzaSakwa11 = openFileInput("DuzaSakwa11.txt");
            InputStreamReader InputDuzaSakwa11 = new InputStreamReader(fileIninputDuzaSakwa11);

            String DuzaSakwa11S = "";
            while ((charRead = InputDuzaSakwa11.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa11S += readstring;
            }

            InputDuzaSakwa11.close();
            DuzaSakwa11.setText(DuzaSakwa11S);

            FileInputStream fileIninputDuzaSakwa12 = openFileInput("DuzaSakwa12.txt");
            InputStreamReader InputDuzaSakwa12 = new InputStreamReader(fileIninputDuzaSakwa12);

            String DuzaSakwa12S = "";
            while ((charRead = InputDuzaSakwa12.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwa12S += readstring;
            }

            InputDuzaSakwa12.close();
            DuzaSakwa12.setText(DuzaSakwa12S);

            FileInputStream fileIninputDuzaSakwaIlosc1 = openFileInput("DuzaSakwaIlosc1.txt");
            InputStreamReader InputDuzaSakwaIlosc1 = new InputStreamReader(fileIninputDuzaSakwaIlosc1);

            String DuzaSakwaIlosc1S = "";
            while ((charRead = InputDuzaSakwaIlosc1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc1S += readstring;
            }

            InputDuzaSakwaIlosc1.close();
            DuzaSakwaIlosc1.setText(DuzaSakwaIlosc1S);

            FileInputStream fileIninputDuzaSakwaIlosc2 = openFileInput("DuzaSakwaIlosc2.txt");
            InputStreamReader InputDuzaSakwaIlosc2 = new InputStreamReader(fileIninputDuzaSakwaIlosc2);

            String DuzaSakwaIlosc2S = "";
            while ((charRead = InputDuzaSakwaIlosc2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc2S += readstring;
            }

            InputDuzaSakwaIlosc2.close();
            DuzaSakwaIlosc2.setText(DuzaSakwaIlosc2S);

            FileInputStream fileIninputDuzaSakwaIlosc3 = openFileInput("DuzaSakwaIlosc3.txt");
            InputStreamReader InputDuzaSakwaIlosc3 = new InputStreamReader(fileIninputDuzaSakwaIlosc3);

            String DuzaSakwaIlosc3S = "";
            while ((charRead = InputDuzaSakwaIlosc3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc3S += readstring;
            }

            InputDuzaSakwaIlosc3.close();
            DuzaSakwaIlosc3.setText(DuzaSakwaIlosc3S);

            FileInputStream fileIninputDuzaSakwaIlosc4 = openFileInput("DuzaSakwaIlosc4.txt");
            InputStreamReader InputDuzaSakwaIlosc4 = new InputStreamReader(fileIninputDuzaSakwaIlosc4);

            String DuzaSakwaIlosc4S = "";
            while ((charRead = InputDuzaSakwaIlosc4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc4S += readstring;
            }

            InputDuzaSakwaIlosc4.close();
            DuzaSakwaIlosc4.setText(DuzaSakwaIlosc4S);

            FileInputStream fileIninputDuzaSakwaIlosc5 = openFileInput("DuzaSakwaIlosc5.txt");
            InputStreamReader InputDuzaSakwaIlosc5 = new InputStreamReader(fileIninputDuzaSakwaIlosc5);

            String DuzaSakwaIlosc5S = "";
            while ((charRead = InputDuzaSakwaIlosc5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc5S += readstring;
            }

            InputDuzaSakwaIlosc5.close();
            DuzaSakwaIlosc5.setText(DuzaSakwaIlosc5S);

            FileInputStream fileIninputDuzaSakwaIlosc6 = openFileInput("DuzaSakwaIlosc6.txt");
            InputStreamReader InputDuzaSakwaIlosc6 = new InputStreamReader(fileIninputDuzaSakwaIlosc6);

            String DuzaSakwaIlosc6S = "";
            while ((charRead = InputDuzaSakwaIlosc6.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc6S += readstring;
            }

            InputDuzaSakwaIlosc6.close();
            DuzaSakwaIlosc6.setText(DuzaSakwaIlosc6S);

            FileInputStream fileIninputDuzaSakwaIlosc7 = openFileInput("DuzaSakwaIlosc7.txt");
            InputStreamReader InputDuzaSakwaIlosc7 = new InputStreamReader(fileIninputDuzaSakwaIlosc7);

            String DuzaSakwaIlosc7S = "";
            while ((charRead = InputDuzaSakwaIlosc7.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc7S += readstring;
            }

            InputDuzaSakwaIlosc7.close();
            DuzaSakwaIlosc7.setText(DuzaSakwaIlosc7S);

            FileInputStream fileIninputDuzaSakwaIlosc8 = openFileInput("DuzaSakwaIlosc8.txt");
            InputStreamReader InputDuzaSakwaIlosc8 = new InputStreamReader(fileIninputDuzaSakwaIlosc8);

            String DuzaSakwaIlosc8S = "";
            while ((charRead = InputDuzaSakwaIlosc8.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc8S += readstring;
            }

            InputDuzaSakwaIlosc8.close();
            DuzaSakwaIlosc8.setText(DuzaSakwaIlosc8S);

            FileInputStream fileIninputDuzaSakwaIlosc9 = openFileInput("DuzaSakwaIlosc9.txt");
            InputStreamReader InputDuzaSakwaIlosc9 = new InputStreamReader(fileIninputDuzaSakwaIlosc9);

            String DuzaSakwaIlosc9S = "";
            while ((charRead = InputDuzaSakwaIlosc9.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc9S += readstring;
            }

            InputDuzaSakwaIlosc9.close();
            DuzaSakwaIlosc9.setText(DuzaSakwaIlosc9S);

            FileInputStream fileIninputDuzaSakwaIlosc10 = openFileInput("DuzaSakwaIlosc10.txt");
            InputStreamReader InputDuzaSakwaIlosc10 = new InputStreamReader(fileIninputDuzaSakwaIlosc10);

            String DuzaSakwaIlosc10S = "";
            while ((charRead = InputDuzaSakwaIlosc10.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc10S += readstring;
            }

            InputDuzaSakwaIlosc10.close();
            DuzaSakwaIlosc10.setText(DuzaSakwaIlosc10S);

            FileInputStream fileIninputDuzaSakwaIlosc11 = openFileInput("DuzaSakwaIlosc11.txt");
            InputStreamReader InputDuzaSakwaIlosc11 = new InputStreamReader(fileIninputDuzaSakwaIlosc11);

            String DuzaSakwaIlosc11S = "";
            while ((charRead = InputDuzaSakwaIlosc11.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc11S += readstring;
            }

            InputDuzaSakwaIlosc11.close();
            DuzaSakwaIlosc11.setText(DuzaSakwaIlosc11S);

            FileInputStream fileIninputDuzaSakwaIlosc12 = openFileInput("DuzaSakwaIlosc12.txt");
            InputStreamReader InputDuzaSakwaIlosc12 = new InputStreamReader(fileIninputDuzaSakwaIlosc12);

            String DuzaSakwaIlosc12S = "";
            while ((charRead = InputDuzaSakwaIlosc12.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaIlosc12S += readstring;
            }

            InputDuzaSakwaIlosc12.close();
            DuzaSakwaIlosc12.setText(DuzaSakwaIlosc12S);

            FileInputStream fileIninputDuzaSakwaWaga1 = openFileInput("DuzaSakwaWaga1.txt");
            InputStreamReader InputDuzaSakwaWaga1 = new InputStreamReader(fileIninputDuzaSakwaWaga1);

            String DuzaSakwaWaga1S = "";
            while ((charRead = InputDuzaSakwaWaga1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga1S += readstring;
            }

            InputDuzaSakwaWaga1.close();
            DuzaSakwaWaga1.setText(DuzaSakwaWaga1S);

            FileInputStream fileIninputDuzaSakwaWaga2 = openFileInput("DuzaSakwaWaga2.txt");
            InputStreamReader InputDuzaSakwaWaga2 = new InputStreamReader(fileIninputDuzaSakwaWaga2);

            String DuzaSakwaWaga2S = "";
            while ((charRead = InputDuzaSakwaWaga2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga2S += readstring;
            }

            InputDuzaSakwaWaga2.close();
            DuzaSakwaWaga2.setText(DuzaSakwaWaga2S);

            FileInputStream fileIninputDuzaSakwaWaga3 = openFileInput("DuzaSakwaWaga3.txt");
            InputStreamReader InputDuzaSakwaWaga3 = new InputStreamReader(fileIninputDuzaSakwaWaga3);

            String DuzaSakwaWaga3S = "";
            while ((charRead = InputDuzaSakwaWaga3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga3S += readstring;
            }

            InputDuzaSakwaWaga3.close();
            DuzaSakwaWaga3.setText(DuzaSakwaWaga3S);

            FileInputStream fileIninputDuzaSakwaWaga4 = openFileInput("DuzaSakwaWaga4.txt");
            InputStreamReader InputDuzaSakwaWaga4 = new InputStreamReader(fileIninputDuzaSakwaWaga4);

            String DuzaSakwaWaga4S = "";
            while ((charRead = InputDuzaSakwaWaga4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga4S += readstring;
            }

            InputDuzaSakwaWaga4.close();
            DuzaSakwaWaga4.setText(DuzaSakwaWaga4S);

            FileInputStream fileIninputDuzaSakwaWaga5 = openFileInput("DuzaSakwaWaga5.txt");
            InputStreamReader InputDuzaSakwaWaga5 = new InputStreamReader(fileIninputDuzaSakwaWaga5);

            String DuzaSakwaWaga5S = "";
            while ((charRead = InputDuzaSakwaWaga5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga5S += readstring;
            }

            InputDuzaSakwaWaga5.close();
            DuzaSakwaWaga5.setText(DuzaSakwaWaga5S);

            FileInputStream fileIninputDuzaSakwaWaga6 = openFileInput("DuzaSakwaWaga6.txt");
            InputStreamReader InputDuzaSakwaWaga6 = new InputStreamReader(fileIninputDuzaSakwaWaga6);

            String DuzaSakwaWaga6S = "";
            while ((charRead = InputDuzaSakwaWaga6.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga6S += readstring;
            }

            InputDuzaSakwaWaga6.close();
            DuzaSakwaWaga6.setText(DuzaSakwaWaga6S);

            FileInputStream fileIninputDuzaSakwaWaga7 = openFileInput("DuzaSakwaWaga7.txt");
            InputStreamReader InputDuzaSakwaWaga7 = new InputStreamReader(fileIninputDuzaSakwaWaga7);

            String DuzaSakwaWaga7S = "";
            while ((charRead = InputDuzaSakwaWaga7.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga7S += readstring;
            }

            InputDuzaSakwaWaga7.close();
            DuzaSakwaWaga7.setText(DuzaSakwaWaga7S);

            FileInputStream fileIninputDuzaSakwaWaga8 = openFileInput("DuzaSakwaWaga8.txt");
            InputStreamReader InputDuzaSakwaWaga8 = new InputStreamReader(fileIninputDuzaSakwaWaga8);

            String DuzaSakwaWaga8S = "";
            while ((charRead = InputDuzaSakwaWaga8.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga8S += readstring;
            }

            InputDuzaSakwaWaga8.close();
            DuzaSakwaWaga8.setText(DuzaSakwaWaga8S);

            FileInputStream fileIninputDuzaSakwaWaga9 = openFileInput("DuzaSakwaWaga9.txt");
            InputStreamReader InputDuzaSakwaWaga9 = new InputStreamReader(fileIninputDuzaSakwaWaga9);

            String DuzaSakwaWaga9S = "";
            while ((charRead = InputDuzaSakwaWaga9.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga9S += readstring;
            }

            InputDuzaSakwaWaga9.close();
            DuzaSakwaWaga9.setText(DuzaSakwaWaga9S);

            FileInputStream fileIninputDuzaSakwaWaga10 = openFileInput("DuzaSakwaWaga10.txt");
            InputStreamReader InputDuzaSakwaWaga10 = new InputStreamReader(fileIninputDuzaSakwaWaga10);

            String DuzaSakwaWaga10S = "";
            while ((charRead = InputDuzaSakwaWaga10.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga10S += readstring;
            }

            InputDuzaSakwaWaga10.close();
            DuzaSakwaWaga10.setText(DuzaSakwaWaga10S);

            FileInputStream fileIninputDuzaSakwaWaga11 = openFileInput("DuzaSakwaWaga11.txt");
            InputStreamReader InputDuzaSakwaWaga11 = new InputStreamReader(fileIninputDuzaSakwaWaga11);

            String DuzaSakwaWaga11S = "";
            while ((charRead = InputDuzaSakwaWaga11.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga11S += readstring;
            }

            InputDuzaSakwaWaga11.close();
            DuzaSakwaWaga11.setText(DuzaSakwaWaga11S);

            FileInputStream fileIninputDuzaSakwaWaga12 = openFileInput("DuzaSakwaWaga12.txt");
            InputStreamReader InputDuzaSakwaWaga12 = new InputStreamReader(fileIninputDuzaSakwaWaga12);

            String DuzaSakwaWaga12S = "";
            while ((charRead = InputDuzaSakwaWaga12.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                DuzaSakwaWaga12S += readstring;
            }

            InputDuzaSakwaWaga12.close();
            DuzaSakwaWaga12.setText(DuzaSakwaWaga12S);

            FileInputStream fileIninputPlecak1 = openFileInput("Plecak1.txt");
            InputStreamReader InputPlecak1 = new InputStreamReader(fileIninputPlecak1);

            String Plecak1S = "";
            while ((charRead = InputPlecak1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak1S += readstring;
            }

            InputPlecak1.close();
            Plecak1.setText(Plecak1S);

            FileInputStream fileIninputPlecak2 = openFileInput("Plecak2.txt");
            InputStreamReader InputPlecak2 = new InputStreamReader(fileIninputPlecak2);

            String Plecak2S = "";
            while ((charRead = InputPlecak2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak2S += readstring;
            }

            InputPlecak2.close();
            Plecak2.setText(Plecak2S);

            FileInputStream fileIninputPlecak3 = openFileInput("Plecak3.txt");
            InputStreamReader InputPlecak3 = new InputStreamReader(fileIninputPlecak3);

            String Plecak3S = "";
            while ((charRead = InputPlecak3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak3S += readstring;
            }

            InputPlecak3.close();
            Plecak3.setText(Plecak3S);

            FileInputStream fileIninputPlecak4 = openFileInput("Plecak4.txt");
            InputStreamReader InputPlecak4 = new InputStreamReader(fileIninputPlecak4);

            String Plecak4S = "";
            while ((charRead = InputPlecak4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak4S += readstring;
            }

            InputPlecak4.close();
            Plecak4.setText(Plecak4S);

            FileInputStream fileIninputPlecak5 = openFileInput("Plecak5.txt");
            InputStreamReader InputPlecak5 = new InputStreamReader(fileIninputPlecak5);

            String Plecak5S = "";
            while ((charRead = InputPlecak5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak5S += readstring;
            }

            InputPlecak5.close();
            Plecak5.setText(Plecak5S);

            FileInputStream fileIninputPlecak6 = openFileInput("Plecak6.txt");
            InputStreamReader InputPlecak6 = new InputStreamReader(fileIninputPlecak6);

            String Plecak6S = "";
            while ((charRead = InputPlecak6.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak6S += readstring;
            }

            InputPlecak6.close();
            Plecak6.setText(Plecak6S);

            FileInputStream fileIninputPlecak7 = openFileInput("Plecak7.txt");
            InputStreamReader InputPlecak7 = new InputStreamReader(fileIninputPlecak7);

            String Plecak7S = "";
            while ((charRead = InputPlecak7.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak7S += readstring;
            }

            InputPlecak7.close();
            Plecak7.setText(Plecak7S);

            FileInputStream fileIninputPlecak8 = openFileInput("Plecak8.txt");
            InputStreamReader InputPlecak8 = new InputStreamReader(fileIninputPlecak8);

            String Plecak8S = "";
            while ((charRead = InputPlecak8.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak8S += readstring;
            }

            InputPlecak8.close();
            Plecak8.setText(Plecak8S);

            FileInputStream fileIninputPlecak9 = openFileInput("Plecak9.txt");
            InputStreamReader InputPlecak9 = new InputStreamReader(fileIninputPlecak9);

            String Plecak9S = "";
            while ((charRead = InputPlecak9.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak9S += readstring;
            }

            InputPlecak9.close();
            Plecak9.setText(Plecak9S);

            FileInputStream fileIninputPlecak10 = openFileInput("Plecak10.txt");
            InputStreamReader InputPlecak10 = new InputStreamReader(fileIninputPlecak10);

            String Plecak10S = "";
            while ((charRead = InputPlecak10.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak10S += readstring;
            }

            InputPlecak10.close();
            Plecak10.setText(Plecak10S);

            FileInputStream fileIninputPlecak11 = openFileInput("Plecak11.txt");
            InputStreamReader InputPlecak11 = new InputStreamReader(fileIninputPlecak11);

            String Plecak11S = "";
            while ((charRead = InputPlecak11.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak11S += readstring;
            }

            InputPlecak11.close();
            Plecak11.setText(Plecak11S);

            FileInputStream fileIninputPlecak12 = openFileInput("Plecak12.txt");
            InputStreamReader InputPlecak12 = new InputStreamReader(fileIninputPlecak12);

            String Plecak12S = "";
            while ((charRead = InputPlecak12.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak12S += readstring;
            }

            InputPlecak12.close();
            Plecak12.setText(Plecak12S);

            FileInputStream fileIninputPlecak13 = openFileInput("Plecak13.txt");
            InputStreamReader InputPlecak13 = new InputStreamReader(fileIninputPlecak13);

            String Plecak13S = "";
            while ((charRead = InputPlecak13.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak13S += readstring;
            }

            InputPlecak13.close();
            Plecak13.setText(Plecak13S);

            FileInputStream fileIninputPlecak14 = openFileInput("Plecak14.txt");
            InputStreamReader InputPlecak14 = new InputStreamReader(fileIninputPlecak14);

            String Plecak14S = "";
            while ((charRead = InputPlecak14.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak14S += readstring;
            }

            InputPlecak14.close();
            Plecak14.setText(Plecak14S);

            FileInputStream fileIninputPlecak15 = openFileInput("Plecak15.txt");
            InputStreamReader InputPlecak15 = new InputStreamReader(fileIninputPlecak15);

            String Plecak15S = "";
            while ((charRead = InputPlecak15.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak15S += readstring;
            }

            InputPlecak15.close();
            Plecak15.setText(Plecak15S);

            FileInputStream fileIninputPlecak16 = openFileInput("Plecak16.txt");
            InputStreamReader InputPlecak16 = new InputStreamReader(fileIninputPlecak16);

            String Plecak16S = "";
            while ((charRead = InputPlecak16.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak16S += readstring;
            }

            InputPlecak16.close();
            Plecak16.setText(Plecak16S);

            FileInputStream fileIninputPlecak17 = openFileInput("Plecak17.txt");
            InputStreamReader InputPlecak17 = new InputStreamReader(fileIninputPlecak17);

            String Plecak17S = "";
            while ((charRead = InputPlecak17.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak17S += readstring;
            }

            InputPlecak17.close();
            Plecak17.setText(Plecak17S);

            FileInputStream fileIninputPlecak18 = openFileInput("Plecak18.txt");
            InputStreamReader InputPlecak18 = new InputStreamReader(fileIninputPlecak18);

            String Plecak18S = "";
            while ((charRead = InputPlecak18.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak18S += readstring;
            }

            InputPlecak18.close();
            Plecak18.setText(Plecak18S);

            FileInputStream fileIninputPlecak1Ilosc = openFileInput("Plecak1Ilosc.txt");
            InputStreamReader InputPlecak1Ilosc = new InputStreamReader(fileIninputPlecak1Ilosc);

            String Plecak1IloscS = "";
            while ((charRead = InputPlecak1Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak1IloscS += readstring;
            }

            InputPlecak1Ilosc.close();
            Plecak1Ilosc.setText(Plecak1IloscS);

            FileInputStream fileIninputPlecak2Ilosc = openFileInput("Plecak2Ilosc.txt");
            InputStreamReader InputPlecak2Ilosc = new InputStreamReader(fileIninputPlecak2Ilosc);

            String Plecak2IloscS = "";
            while ((charRead = InputPlecak2Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak2IloscS += readstring;
            }

            InputPlecak2Ilosc.close();
            Plecak2Ilosc.setText(Plecak2IloscS);

            FileInputStream fileIninputPlecak3Ilosc = openFileInput("Plecak3Ilosc.txt");
            InputStreamReader InputPlecak3Ilosc = new InputStreamReader(fileIninputPlecak3Ilosc);

            String Plecak3IloscS = "";
            while ((charRead = InputPlecak3Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak3IloscS += readstring;
            }

            InputPlecak3Ilosc.close();
            Plecak3Ilosc.setText(Plecak3IloscS);

            FileInputStream fileIninputPlecak4Ilosc = openFileInput("Plecak4Ilosc.txt");
            InputStreamReader InputPlecak4Ilosc = new InputStreamReader(fileIninputPlecak4Ilosc);

            String Plecak4IloscS = "";
            while ((charRead = InputPlecak4Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak4IloscS += readstring;
            }

            InputPlecak4Ilosc.close();
            Plecak4Ilosc.setText(Plecak4IloscS);

            FileInputStream fileIninputPlecak5Ilosc = openFileInput("Plecak5Ilosc.txt");
            InputStreamReader InputPlecak5Ilosc = new InputStreamReader(fileIninputPlecak5Ilosc);

            String Plecak5IloscS = "";
            while ((charRead = InputPlecak5Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak5IloscS += readstring;
            }

            InputPlecak5Ilosc.close();
            Plecak5Ilosc.setText(Plecak5IloscS);

            FileInputStream fileIninputPlecak6Ilosc = openFileInput("Plecak6Ilosc.txt");
            InputStreamReader InputPlecak6Ilosc = new InputStreamReader(fileIninputPlecak6Ilosc);

            String Plecak6IloscS = "";
            while ((charRead = InputPlecak6Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak6IloscS += readstring;
            }

            InputPlecak6Ilosc.close();
            Plecak6Ilosc.setText(Plecak6IloscS);

            FileInputStream fileIninputPlecak7Ilosc = openFileInput("Plecak7Ilosc.txt");
            InputStreamReader InputPlecak7Ilosc = new InputStreamReader(fileIninputPlecak7Ilosc);

            String Plecak7IloscS = "";
            while ((charRead = InputPlecak7Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak7IloscS += readstring;
            }

            InputPlecak7Ilosc.close();
            Plecak7Ilosc.setText(Plecak7S);

            FileInputStream fileIninputPlecak8Ilosc = openFileInput("Plecak8Ilosc.txt");
            InputStreamReader InputPlecak8Ilosc = new InputStreamReader(fileIninputPlecak8Ilosc);

            String Plecak8IloscS = "";
            while ((charRead = InputPlecak8Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak8IloscS += readstring;
            }

            InputPlecak8Ilosc.close();
            Plecak8Ilosc.setText(Plecak8S);

            FileInputStream fileIninputPlecak9Ilosc = openFileInput("Plecak9Ilosc.txt");
            InputStreamReader InputPlecak9Ilosc = new InputStreamReader(fileIninputPlecak9Ilosc);

            String Plecak9IloscS = "";
            while ((charRead = InputPlecak9Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak9IloscS += readstring;
            }

            InputPlecak9Ilosc.close();
            Plecak9Ilosc.setText(Plecak9IloscS);

            FileInputStream fileIninputPlecak10Ilosc = openFileInput("Plecak10Ilosc.txt");
            InputStreamReader InputPlecak10Ilosc = new InputStreamReader(fileIninputPlecak10Ilosc);

            String Plecak10IloscS = "";
            while ((charRead = InputPlecak10Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak10IloscS += readstring;
            }

            InputPlecak10Ilosc.close();
            Plecak10Ilosc.setText(Plecak10IloscS);

            FileInputStream fileIninputPlecak11Ilosc = openFileInput("Plecak11Ilosc.txt");
            InputStreamReader InputPlecak11Ilosc = new InputStreamReader(fileIninputPlecak11Ilosc);

            String Plecak11IloscS = "";
            while ((charRead = InputPlecak11Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak11IloscS += readstring;
            }

            InputPlecak11Ilosc.close();
            Plecak11Ilosc.setText(Plecak11IloscS);

            FileInputStream fileIninputPlecak12Ilosc = openFileInput("Plecak12Ilosc.txt");
            InputStreamReader InputPlecak12Ilosc = new InputStreamReader(fileIninputPlecak12Ilosc);

            String Plecak12IloscS = "";
            while ((charRead = InputPlecak12Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak12IloscS += readstring;
            }

            InputPlecak12Ilosc.close();
            Plecak12Ilosc.setText(Plecak12IloscS);

            FileInputStream fileIninputPlecak13Ilosc = openFileInput("Plecak13Ilosc.txt");
            InputStreamReader InputPlecak13Ilosc = new InputStreamReader(fileIninputPlecak13Ilosc);

            String Plecak13IloscS = "";
            while ((charRead = InputPlecak13Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak13IloscS += readstring;
            }

            InputPlecak13Ilosc.close();
            Plecak13Ilosc.setText(Plecak13IloscS);

            FileInputStream fileIninputPlecak14Ilosc = openFileInput("Plecak14Ilosc.txt");
            InputStreamReader InputPlecak14Ilosc = new InputStreamReader(fileIninputPlecak14Ilosc);

            String Plecak14IloscS = "";
            while ((charRead = InputPlecak14Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak14IloscS += readstring;
            }

            InputPlecak14Ilosc.close();
            Plecak14Ilosc.setText(Plecak14IloscS);

            FileInputStream fileIninputPlecak15Ilosc = openFileInput("Plecak15Ilosc.txt");
            InputStreamReader InputPlecak15Ilosc = new InputStreamReader(fileIninputPlecak15Ilosc);

            String Plecak15IloscS = "";
            while ((charRead = InputPlecak15Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak15IloscS += readstring;
            }

            InputPlecak15Ilosc.close();
            Plecak15Ilosc.setText(Plecak15IloscS);

            FileInputStream fileIninputPlecak16Ilosc = openFileInput("Plecak16Ilosc.txt");
            InputStreamReader InputPlecak16Ilosc = new InputStreamReader(fileIninputPlecak16Ilosc);

            String Plecak16IloscS = "";
            while ((charRead = InputPlecak16Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak16IloscS += readstring;
            }

            InputPlecak16Ilosc.close();
            Plecak16Ilosc.setText(Plecak16IloscS);

            FileInputStream fileIninputPlecak17Ilosc = openFileInput("Plecak17Ilosc.txt");
            InputStreamReader InputPlecak17Ilosc = new InputStreamReader(fileIninputPlecak17Ilosc);

            String Plecak17IloscS = "";
            while ((charRead = InputPlecak17Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak17IloscS += readstring;
            }

            InputPlecak17Ilosc.close();
            Plecak17Ilosc.setText(Plecak17IloscS);

            FileInputStream fileIninputPlecak18Ilosc = openFileInput("Plecak18Ilosc.txt");
            InputStreamReader InputPlecak18Ilosc = new InputStreamReader(fileIninputPlecak18Ilosc);

            String Plecak18IloscS = "";
            while ((charRead = InputPlecak18Ilosc.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak18IloscS += readstring;
            }

            InputPlecak18Ilosc.close();
            Plecak18Ilosc.setText(Plecak18IloscS);

            FileInputStream fileIninputPlecak1Waga = openFileInput("Plecak1Waga.txt");
            InputStreamReader InputPlecak1Waga = new InputStreamReader(fileIninputPlecak1Waga);

            String Plecak1WagaS = "";
            while ((charRead = InputPlecak1Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak1WagaS += readstring;
            }

            InputPlecak1Waga.close();
            Plecak1Waga.setText(Plecak1WagaS);

            FileInputStream fileIninputPlecak2Waga = openFileInput("Plecak2Waga.txt");
            InputStreamReader InputPlecak2Waga = new InputStreamReader(fileIninputPlecak2Waga);

            String Plecak2WagaS = "";
            while ((charRead = InputPlecak2Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak2WagaS += readstring;
            }

            InputPlecak2Waga.close();
            Plecak2Waga.setText(Plecak2WagaS);

            FileInputStream fileIninputPlecak3Waga = openFileInput("Plecak3Waga.txt");
            InputStreamReader InputPlecak3Waga = new InputStreamReader(fileIninputPlecak3Waga);

            String Plecak3WagaS = "";
            while ((charRead = InputPlecak3Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak3WagaS += readstring;
            }

            InputPlecak3Waga.close();
            Plecak3Waga.setText(Plecak3WagaS);

            FileInputStream fileIninputPlecak4Waga = openFileInput("Plecak4Waga.txt");
            InputStreamReader InputPlecak4Waga = new InputStreamReader(fileIninputPlecak4Waga);

            String Plecak4WagaS = "";
            while ((charRead = InputPlecak4Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak4WagaS += readstring;
            }

            InputPlecak4Waga.close();
            Plecak4Waga.setText(Plecak4WagaS);

            FileInputStream fileIninputPlecak5Waga = openFileInput("Plecak5Waga.txt");
            InputStreamReader InputPlecak5Waga = new InputStreamReader(fileIninputPlecak5Waga);

            String Plecak5WagaS = "";
            while ((charRead = InputPlecak5Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak5WagaS += readstring;
            }

            InputPlecak5Waga.close();
            Plecak5Waga.setText(Plecak5WagaS);

            FileInputStream fileIninputPlecak6Waga = openFileInput("Plecak6Waga.txt");
            InputStreamReader InputPlecak6Waga = new InputStreamReader(fileIninputPlecak6Waga);

            String Plecak6WagaS = "";
            while ((charRead = InputPlecak6Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak6WagaS += readstring;
            }

            InputPlecak6Waga.close();
            Plecak6Waga.setText(Plecak6WagaS);

            FileInputStream fileIninputPlecak7Waga = openFileInput("Plecak7Waga.txt");
            InputStreamReader InputPlecak7Waga = new InputStreamReader(fileIninputPlecak7Waga);

            String Plecak7WagaS = "";
            while ((charRead = InputPlecak7Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak7WagaS += readstring;
            }

            InputPlecak7Waga.close();
            Plecak7Waga.setText(Plecak7S);

            FileInputStream fileIninputPlecak8Waga = openFileInput("Plecak8Waga.txt");
            InputStreamReader InputPlecak8Waga = new InputStreamReader(fileIninputPlecak8Waga);

            String Plecak8WagaS = "";
            while ((charRead = InputPlecak8Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak8WagaS += readstring;
            }

            InputPlecak8Waga.close();
            Plecak8Waga.setText(Plecak8S);

            FileInputStream fileIninputPlecak9Waga = openFileInput("Plecak9Waga.txt");
            InputStreamReader InputPlecak9Waga = new InputStreamReader(fileIninputPlecak9Waga);

            String Plecak9WagaS = "";
            while ((charRead = InputPlecak9Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak9WagaS += readstring;
            }

            InputPlecak9Waga.close();
            Plecak9Waga.setText(Plecak9WagaS);

            FileInputStream fileIninputPlecak10Waga = openFileInput("Plecak10Waga.txt");
            InputStreamReader InputPlecak10Waga = new InputStreamReader(fileIninputPlecak10Waga);

            String Plecak10WagaS = "";
            while ((charRead = InputPlecak10Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak10WagaS += readstring;
            }

            InputPlecak10Waga.close();
            Plecak10Waga.setText(Plecak10WagaS);

            FileInputStream fileIninputPlecak11Waga = openFileInput("Plecak11Waga.txt");
            InputStreamReader InputPlecak11Waga = new InputStreamReader(fileIninputPlecak11Waga);

            String Plecak11WagaS = "";
            while ((charRead = InputPlecak11Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak11WagaS += readstring;
            }

            InputPlecak11Waga.close();
            Plecak11Waga.setText(Plecak11WagaS);

            FileInputStream fileIninputPlecak12Waga = openFileInput("Plecak12Waga.txt");
            InputStreamReader InputPlecak12Waga = new InputStreamReader(fileIninputPlecak12Waga);

            String Plecak12WagaS = "";
            while ((charRead = InputPlecak12Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak12WagaS += readstring;
            }

            InputPlecak12Waga.close();
            Plecak12Waga.setText(Plecak12WagaS);

            FileInputStream fileIninputPlecak13Waga = openFileInput("Plecak13Waga.txt");
            InputStreamReader InputPlecak13Waga = new InputStreamReader(fileIninputPlecak13Waga);

            String Plecak13WagaS = "";
            while ((charRead = InputPlecak13Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak13WagaS += readstring;
            }

            InputPlecak13Waga.close();
            Plecak13Waga.setText(Plecak13WagaS);

            FileInputStream fileIninputPlecak14Waga = openFileInput("Plecak14Waga.txt");
            InputStreamReader InputPlecak14Waga = new InputStreamReader(fileIninputPlecak14Waga);

            String Plecak14WagaS = "";
            while ((charRead = InputPlecak14Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak14WagaS += readstring;
            }

            InputPlecak14Waga.close();
            Plecak14Waga.setText(Plecak14WagaS);

            FileInputStream fileIninputPlecak15Waga = openFileInput("Plecak15Waga.txt");
            InputStreamReader InputPlecak15Waga = new InputStreamReader(fileIninputPlecak15Waga);

            String Plecak15WagaS = "";
            while ((charRead = InputPlecak15Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak15WagaS += readstring;
            }

            InputPlecak15Waga.close();
            Plecak15Waga.setText(Plecak15WagaS);

            FileInputStream fileIninputPlecak16Waga = openFileInput("Plecak16Waga.txt");
            InputStreamReader InputPlecak16Waga = new InputStreamReader(fileIninputPlecak16Waga);

            String Plecak16WagaS = "";
            while ((charRead = InputPlecak16Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak16WagaS += readstring;
            }

            InputPlecak16Waga.close();
            Plecak16Waga.setText(Plecak16WagaS);

            FileInputStream fileIninputPlecak17Waga = openFileInput("Plecak17Waga.txt");
            InputStreamReader InputPlecak17Waga = new InputStreamReader(fileIninputPlecak17Waga);

            String Plecak17WagaS = "";
            while ((charRead = InputPlecak17Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak17WagaS += readstring;
            }

            InputPlecak17Waga.close();
            Plecak17Waga.setText(Plecak17WagaS);

            FileInputStream fileIninputPlecak18Waga = openFileInput("Plecak18Waga.txt");
            InputStreamReader InputPlecak18Waga = new InputStreamReader(fileIninputPlecak18Waga);

            String Plecak18WagaS = "";
            while ((charRead = InputPlecak18Waga.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Plecak18WagaS += readstring;
            }

            InputPlecak18Waga.close();
            Plecak18Waga.setText(Plecak18WagaS);

            FileInputStream fileIninputPozywytna1 = openFileInput("Pozywytna1.txt");
            InputStreamReader InputPozywytna1 = new InputStreamReader(fileIninputPozywytna1);

            String Pozywytna1S = "";
            while ((charRead = InputPozywytna1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Pozywytna1S += readstring;
            }

            InputPozywytna1.close();
            Pozywytna1.setText(Pozywytna1S);

            FileInputStream fileIninputPozywytna2 = openFileInput("Pozywytna2.txt");
            InputStreamReader InputPozywytna2 = new InputStreamReader(fileIninputPozywytna2);

            String Pozywytna2S = "";
            while ((charRead = InputPozywytna2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Pozywytna2S += readstring;
            }

            InputPozywytna2.close();
            Pozywytna2.setText(Pozywytna2S);

            FileInputStream fileIninputPozywytna3 = openFileInput("Pozywytna3.txt");
            InputStreamReader InputPozywytna3 = new InputStreamReader(fileIninputPozywytna3);

            String Pozywytna3S = "";
            while ((charRead = InputPozywytna3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Pozywytna3S += readstring;
            }

            InputPozywytna3.close();
            Pozywytna3.setText(Pozywytna3S);

            FileInputStream fileIninputPozywytna4 = openFileInput("Pozywytna4.txt");
            InputStreamReader InputPozywytna4 = new InputStreamReader(fileIninputPozywytna4);

            String Pozywytna4S = "";
            while ((charRead = InputPozywytna4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Pozywytna4S += readstring;
            }

            InputPozywytna4.close();
            Pozywytna4.setText(Pozywytna4S);

            FileInputStream fileIninputPozywytna5 = openFileInput("Pozywytna5.txt");
            InputStreamReader InputPozywytna5 = new InputStreamReader(fileIninputPozywytna5);

            String Pozywytna5S = "";
            while ((charRead = InputPozywytna5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Pozywytna5S += readstring;
            }

            InputPozywytna5.close();
            Pozywytna5.setText(Pozywytna5S);

            FileInputStream fileIninputPozywytna6 = openFileInput("Pozywytna6.txt");
            InputStreamReader InputPozywytna6 = new InputStreamReader(fileIninputPozywytna6);

            String Pozywytna6S = "";
            while ((charRead = InputPozywytna6.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Pozywytna6S += readstring;
            }

            InputPozywytna6.close();
            Pozywytna6.setText(Pozywytna6S);

            FileInputStream fileIninputPozywytna7 = openFileInput("Pozywytna7.txt");
            InputStreamReader InputPozywytna7 = new InputStreamReader(fileIninputPozywytna7);

            String Pozywytna7S = "";
            while ((charRead = InputPozywytna7.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Pozywytna7S += readstring;
            }

            InputPozywytna7.close();
            Pozywytna7.setText(Pozywytna7S);

            FileInputStream fileIninputPozywytna8 = openFileInput("Pozywytna8.txt");
            InputStreamReader InputPozywytna8 = new InputStreamReader(fileIninputPozywytna8);

            String Pozywytna8S = "";
            while ((charRead = InputPozywytna8.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Pozywytna8S += readstring;
            }

            InputPozywytna8.close();
            Pozywytna8.setText(Pozywytna8S);

            FileInputStream fileIninputPozywytna9 = openFileInput("Pozywytna9.txt");
            InputStreamReader InputPozywytna9 = new InputStreamReader(fileIninputPozywytna9);

            String Pozywytna9S = "";
            while ((charRead = InputPozywytna9.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Pozywytna9S += readstring;
            }

            InputPozywytna9.close();
            Pozywytna9.setText(Pozywytna9S);

            FileInputStream fileIninputPozywytna10 = openFileInput("Pozywytna10.txt");
            InputStreamReader InputPozywytna10 = new InputStreamReader(fileIninputPozywytna10);

            String Pozywytna10S = "";
            while ((charRead = InputPozywytna10.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Pozywytna10S += readstring;
            }

            InputPozywytna10.close();
            Pozywytna10.setText(Pozywytna10S);

            FileInputStream fileIninputNegatywna1 = openFileInput("Negatywna1.txt");
            InputStreamReader InputNegatywna1 = new InputStreamReader(fileIninputNegatywna1);

            String Negatywna1S = "";
            while ((charRead = InputNegatywna1.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Negatywna1S += readstring;
            }

            InputNegatywna1.close();
            Negatywna1.setText(Negatywna1S);

            FileInputStream fileIninputNegatywna2 = openFileInput("Negatywna2.txt");
            InputStreamReader InputNegatywna2 = new InputStreamReader(fileIninputNegatywna2);

            String Negatywna2S = "";
            while ((charRead = InputNegatywna2.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Negatywna2S += readstring;
            }

            InputNegatywna2.close();
            Negatywna2.setText(Negatywna2S);

            FileInputStream fileIninputNegatywna3 = openFileInput("Negatywna3.txt");
            InputStreamReader InputNegatywna3 = new InputStreamReader(fileIninputNegatywna3);

            String Negatywna3S = "";
            while ((charRead = InputNegatywna3.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Negatywna3S += readstring;
            }

            InputNegatywna3.close();
            Negatywna3.setText(Negatywna3S);

            FileInputStream fileIninputNegatywna4 = openFileInput("Negatywna4.txt");
            InputStreamReader InputNegatywna4 = new InputStreamReader(fileIninputNegatywna4);

            String Negatywna4S = "";
            while ((charRead = InputNegatywna4.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Negatywna4S += readstring;
            }

            InputNegatywna4.close();
            Negatywna4.setText(Negatywna4S);

            FileInputStream fileIninputNegatywna5 = openFileInput("Negatywna5.txt");
            InputStreamReader InputNegatywna5 = new InputStreamReader(fileIninputNegatywna5);

            String Negatywna5S = "";
            while ((charRead = InputNegatywna5.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Negatywna5S += readstring;
            }

            InputNegatywna5.close();
            Negatywna5.setText(Negatywna5S);

            FileInputStream fileIninputNegatywna6 = openFileInput("Negatywna6.txt");
            InputStreamReader InputNegatywna6 = new InputStreamReader(fileIninputNegatywna6);

            String Negatywna6S = "";
            while ((charRead = InputNegatywna6.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Negatywna6S += readstring;
            }

            InputNegatywna6.close();
            Negatywna6.setText(Negatywna6S);

            FileInputStream fileIninputNegatywna7 = openFileInput("Negatywna7.txt");
            InputStreamReader InputNegatywna7 = new InputStreamReader(fileIninputNegatywna7);

            String Negatywna7S = "";
            while ((charRead = InputNegatywna7.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Negatywna7S += readstring;
            }

            InputNegatywna7.close();
            Negatywna7.setText(Negatywna7S);

            FileInputStream fileIninputNegatywna8 = openFileInput("Negatywna8.txt");
            InputStreamReader InputNegatywna8 = new InputStreamReader(fileIninputNegatywna8);

            String Negatywna8S = "";
            while ((charRead = InputNegatywna8.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Negatywna8S += readstring;
            }

            InputNegatywna8.close();
            Negatywna8.setText(Negatywna8S);

            FileInputStream fileIninputNegatywna9 = openFileInput("Negatywna9.txt");
            InputStreamReader InputNegatywna9 = new InputStreamReader(fileIninputNegatywna9);

            String Negatywna9S = "";
            while ((charRead = InputNegatywna9.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Negatywna9S += readstring;
            }

            InputNegatywna9.close();
            Negatywna9.setText(Negatywna9S);

            FileInputStream fileIninputNegatywna10 = openFileInput("Negatywna10.txt");
            InputStreamReader InputNegatywna10 = new InputStreamReader(fileIninputNegatywna10);

            String Negatywna10S = "";
            while ((charRead = InputNegatywna10.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                Negatywna10S += readstring;
            }

            InputNegatywna10.close();
            Negatywna10.setText(Negatywna10S);

            FileInputStream fileIninputNotatki = openFileInput("Notatki.txt");
            InputStreamReader InputNotatki = new InputStreamReader(fileIninputNotatki);

            String NotatkiS = "";
            while ((charRead = InputNotatki.read(inputBuffer)) > 0) {
                // char to string conversion
                String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                NotatkiS += readstring;
            }

            InputNotatki.close();
            Notatki.setText(NotatkiS);

    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void save(View view) throws IOException {

        FileOutputStream fileoutinputMalaSakwa1 = openFileOutput("MalaSakwa1.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwa1 = new OutputStreamWriter(fileoutinputMalaSakwa1);
        outputWriterinputMalaSakwa1.write(MalaSakwa1.getText().toString());
        outputWriterinputMalaSakwa1.close();

        FileOutputStream fileoutinputMalaSakwa2 = openFileOutput("MalaSakwa2.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwa2 = new OutputStreamWriter(fileoutinputMalaSakwa2);
        outputWriterinputMalaSakwa2.write(MalaSakwa2.getText().toString());
        outputWriterinputMalaSakwa2.close();

        FileOutputStream fileoutinputMalaSakwa3 = openFileOutput("MalaSakwa3.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwa3 = new OutputStreamWriter(fileoutinputMalaSakwa3);
        outputWriterinputMalaSakwa3.write(MalaSakwa3.getText().toString());
        outputWriterinputMalaSakwa3.close();

        FileOutputStream fileoutinputMalaSakwa4 = openFileOutput("MalaSakwa4.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwa4 = new OutputStreamWriter(fileoutinputMalaSakwa4);
        outputWriterinputMalaSakwa4.write(MalaSakwa4.getText().toString());
        outputWriterinputMalaSakwa4.close();

        FileOutputStream fileoutinputMalaSakwa5 = openFileOutput("MalaSakwa5.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwa5 = new OutputStreamWriter(fileoutinputMalaSakwa5);
        outputWriterinputMalaSakwa5.write(MalaSakwa5.getText().toString());
        outputWriterinputMalaSakwa5.close();

        FileOutputStream fileoutinputMalaSakwa6 = openFileOutput("MalaSakwa6.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwa6 = new OutputStreamWriter(fileoutinputMalaSakwa6);
        outputWriterinputMalaSakwa6.write(MalaSakwa6.getText().toString());
        outputWriterinputMalaSakwa6.close();

        FileOutputStream fileoutinputMalaSakwaIlosc1 = openFileOutput("MalaSakwaIlosc1.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaIlosc1 = new OutputStreamWriter(fileoutinputMalaSakwaIlosc1);
        outputWriterinputMalaSakwaIlosc1.write(MalaSakwaIlosc1.getText().toString());
        outputWriterinputMalaSakwaIlosc1.close();

        FileOutputStream fileoutinputMalaSakwaIlosc2 = openFileOutput("MalaSakwaIlosc2.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaIlosc2 = new OutputStreamWriter(fileoutinputMalaSakwaIlosc2);
        outputWriterinputMalaSakwaIlosc2.write(MalaSakwaIlosc2.getText().toString());
        outputWriterinputMalaSakwaIlosc2.close();

        FileOutputStream fileoutinputMalaSakwaIlosc3 = openFileOutput("MalaSakwaIlosc3.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaIlosc3 = new OutputStreamWriter(fileoutinputMalaSakwaIlosc3);
        outputWriterinputMalaSakwaIlosc3.write(MalaSakwaIlosc3.getText().toString());
        outputWriterinputMalaSakwaIlosc3.close();

        FileOutputStream fileoutinputMalaSakwaIlosc4 = openFileOutput("MalaSakwaIlosc4.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaIlosc4 = new OutputStreamWriter(fileoutinputMalaSakwaIlosc4);
        outputWriterinputMalaSakwaIlosc4.write(MalaSakwaIlosc4.getText().toString());
        outputWriterinputMalaSakwaIlosc4.close();

        FileOutputStream fileoutinputMalaSakwaIlosc5 = openFileOutput("MalaSakwaIlosc5.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaIlosc5 = new OutputStreamWriter(fileoutinputMalaSakwaIlosc5);
        outputWriterinputMalaSakwaIlosc5.write(MalaSakwaIlosc5.getText().toString());
        outputWriterinputMalaSakwaIlosc5.close();

        FileOutputStream fileoutinputMalaSakwaIlosc6 = openFileOutput("MalaSakwaIlosc6.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaIlosc6 = new OutputStreamWriter(fileoutinputMalaSakwaIlosc6);
        outputWriterinputMalaSakwaIlosc6.write(MalaSakwaIlosc6.getText().toString());
        outputWriterinputMalaSakwaIlosc6.close();

        FileOutputStream fileoutinputMalaSakwaWaga1 = openFileOutput("MalaSakwaWaga1.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaWaga1 = new OutputStreamWriter(fileoutinputMalaSakwaWaga1);
        outputWriterinputMalaSakwaWaga1.write(MalaSakwaWaga1.getText().toString());
        outputWriterinputMalaSakwaWaga1.close();

        FileOutputStream fileoutinputMalaSakwaWaga2 = openFileOutput("MalaSakwaWaga2.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaWaga2 = new OutputStreamWriter(fileoutinputMalaSakwaWaga2);
        outputWriterinputMalaSakwaWaga2.write(MalaSakwaWaga2.getText().toString());
        outputWriterinputMalaSakwaWaga2.close();

        FileOutputStream fileoutinputMalaSakwaWaga3 = openFileOutput("MalaSakwaWaga3.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaWaga3 = new OutputStreamWriter(fileoutinputMalaSakwaWaga3);
        outputWriterinputMalaSakwaWaga3.write(MalaSakwaWaga3.getText().toString());
        outputWriterinputMalaSakwaWaga3.close();

        FileOutputStream fileoutinputMalaSakwaWaga4 = openFileOutput("MalaSakwaWaga4.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaWaga4 = new OutputStreamWriter(fileoutinputMalaSakwaWaga4);
        outputWriterinputMalaSakwaWaga4.write(MalaSakwaWaga4.getText().toString());
        outputWriterinputMalaSakwaWaga4.close();

        FileOutputStream fileoutinputMalaSakwaWaga5 = openFileOutput("MalaSakwaWaga5.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaWaga5 = new OutputStreamWriter(fileoutinputMalaSakwaWaga5);
        outputWriterinputMalaSakwaWaga5.write(MalaSakwaWaga5.getText().toString());
        outputWriterinputMalaSakwaWaga5.close();

        FileOutputStream fileoutinputMalaSakwaWaga6 = openFileOutput("MalaSakwaWaga6.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputMalaSakwaWaga6 = new OutputStreamWriter(fileoutinputMalaSakwaWaga6);
        outputWriterinputMalaSakwaWaga6.write(MalaSakwaWaga6.getText().toString());
        outputWriterinputMalaSakwaWaga6.close();

        FileOutputStream fileoutinputDuzaSakwa1 = openFileOutput("DuzaSakwa1.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa1 = new OutputStreamWriter(fileoutinputDuzaSakwa1);
        outputWriterinputDuzaSakwa1.write(DuzaSakwa1.getText().toString());
        outputWriterinputDuzaSakwa1.close();

        FileOutputStream fileoutinputDuzaSakwa2 = openFileOutput("DuzaSakwa2.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa2 = new OutputStreamWriter(fileoutinputDuzaSakwa2);
        outputWriterinputDuzaSakwa2.write(DuzaSakwa2.getText().toString());
        outputWriterinputDuzaSakwa2.close();

        FileOutputStream fileoutinputDuzaSakwa3 = openFileOutput("DuzaSakwa3.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa3 = new OutputStreamWriter(fileoutinputDuzaSakwa3);
        outputWriterinputDuzaSakwa3.write(DuzaSakwa3.getText().toString());
        outputWriterinputDuzaSakwa3.close();

        FileOutputStream fileoutinputDuzaSakwa4 = openFileOutput("DuzaSakwa4.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa4 = new OutputStreamWriter(fileoutinputDuzaSakwa4);
        outputWriterinputDuzaSakwa4.write(DuzaSakwa4.getText().toString());
        outputWriterinputDuzaSakwa4.close();

        FileOutputStream fileoutinputDuzaSakwa5 = openFileOutput("DuzaSakwa5.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa5 = new OutputStreamWriter(fileoutinputDuzaSakwa5);
        outputWriterinputDuzaSakwa5.write(DuzaSakwa5.getText().toString());
        outputWriterinputDuzaSakwa5.close();

        FileOutputStream fileoutinputDuzaSakwa6 = openFileOutput("DuzaSakwa6.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa6 = new OutputStreamWriter(fileoutinputDuzaSakwa6);
        outputWriterinputDuzaSakwa6.write(DuzaSakwa6.getText().toString());
        outputWriterinputDuzaSakwa6.close();

        FileOutputStream fileoutinputDuzaSakwa7 = openFileOutput("DuzaSakwa7.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa7 = new OutputStreamWriter(fileoutinputDuzaSakwa7);
        outputWriterinputDuzaSakwa7.write(DuzaSakwa7.getText().toString());
        outputWriterinputDuzaSakwa7.close();

        FileOutputStream fileoutinputDuzaSakwa8 = openFileOutput("DuzaSakwa8.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa8 = new OutputStreamWriter(fileoutinputDuzaSakwa8);
        outputWriterinputDuzaSakwa8.write(DuzaSakwa8.getText().toString());
        outputWriterinputDuzaSakwa8.close();

        FileOutputStream fileoutinputDuzaSakwa9 = openFileOutput("DuzaSakwa9.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa9 = new OutputStreamWriter(fileoutinputDuzaSakwa9);
        outputWriterinputDuzaSakwa9.write(DuzaSakwa9.getText().toString());
        outputWriterinputDuzaSakwa9.close();

        FileOutputStream fileoutinputDuzaSakwa10 = openFileOutput("DuzaSakwa10.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa10 = new OutputStreamWriter(fileoutinputDuzaSakwa10);
        outputWriterinputDuzaSakwa10.write(DuzaSakwa10.getText().toString());
        outputWriterinputDuzaSakwa10.close();

        FileOutputStream fileoutinputDuzaSakwa11 = openFileOutput("DuzaSakwa11.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa11 = new OutputStreamWriter(fileoutinputDuzaSakwa11);
        outputWriterinputDuzaSakwa11.write(DuzaSakwa11.getText().toString());
        outputWriterinputDuzaSakwa11.close();

        FileOutputStream fileoutinputDuzaSakwa12 = openFileOutput("DuzaSakwa12.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwa12 = new OutputStreamWriter(fileoutinputDuzaSakwa12);
        outputWriterinputDuzaSakwa12.write(DuzaSakwa12.getText().toString());
        outputWriterinputDuzaSakwa12.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc1 = openFileOutput("DuzaSakwaIlosc1.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc1 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc1);
        outputWriterinputDuzaSakwaIlosc1.write(DuzaSakwaIlosc1.getText().toString());
        outputWriterinputDuzaSakwaIlosc1.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc2 = openFileOutput("DuzaSakwaIlosc2.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc2 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc2);
        outputWriterinputDuzaSakwaIlosc2.write(DuzaSakwaIlosc2.getText().toString());
        outputWriterinputDuzaSakwaIlosc2.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc3 = openFileOutput("DuzaSakwaIlosc3.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc3 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc3);
        outputWriterinputDuzaSakwaIlosc3.write(DuzaSakwaIlosc3.getText().toString());
        outputWriterinputDuzaSakwaIlosc3.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc4 = openFileOutput("DuzaSakwaIlosc4.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc4 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc4);
        outputWriterinputDuzaSakwaIlosc4.write(DuzaSakwaIlosc4.getText().toString());
        outputWriterinputDuzaSakwaIlosc4.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc5 = openFileOutput("DuzaSakwaIlosc5.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc5 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc5);
        outputWriterinputDuzaSakwaIlosc5.write(DuzaSakwaIlosc5.getText().toString());
        outputWriterinputDuzaSakwaIlosc5.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc6 = openFileOutput("DuzaSakwaIlosc6.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc6 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc6);
        outputWriterinputDuzaSakwaIlosc6.write(DuzaSakwaIlosc6.getText().toString());
        outputWriterinputDuzaSakwaIlosc6.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc7 = openFileOutput("DuzaSakwaIlosc7.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc7 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc7);
        outputWriterinputDuzaSakwaIlosc7.write(DuzaSakwaIlosc7.getText().toString());
        outputWriterinputDuzaSakwaIlosc7.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc8 = openFileOutput("DuzaSakwaIlosc8.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc8 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc8);
        outputWriterinputDuzaSakwaIlosc8.write(DuzaSakwaIlosc8.getText().toString());
        outputWriterinputDuzaSakwaIlosc8.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc9 = openFileOutput("DuzaSakwaIlosc9.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc9 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc9);
        outputWriterinputDuzaSakwaIlosc9.write(DuzaSakwaIlosc9.getText().toString());
        outputWriterinputDuzaSakwaIlosc9.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc10 = openFileOutput("DuzaSakwaIlosc10.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc10 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc10);
        outputWriterinputDuzaSakwaIlosc10.write(DuzaSakwaIlosc10.getText().toString());
        outputWriterinputDuzaSakwaIlosc10.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc11 = openFileOutput("DuzaSakwaIlosc11.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc11 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc11);
        outputWriterinputDuzaSakwaIlosc11.write(DuzaSakwaIlosc11.getText().toString());
        outputWriterinputDuzaSakwaIlosc11.close();

        FileOutputStream fileoutinputDuzaSakwaIlosc12 = openFileOutput("DuzaSakwaIlosc12.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaIlosc12 = new OutputStreamWriter(fileoutinputDuzaSakwaIlosc12);
        outputWriterinputDuzaSakwaIlosc12.write(DuzaSakwaIlosc12.getText().toString());
        outputWriterinputDuzaSakwaIlosc12.close();

        FileOutputStream fileoutinputDuzaSakwaWaga1 = openFileOutput("DuzaSakwaWaga1.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga1 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga1);
        outputWriterinputDuzaSakwaWaga1.write(DuzaSakwaWaga1.getText().toString());
        outputWriterinputDuzaSakwaWaga1.close();

        FileOutputStream fileoutinputDuzaSakwaWaga2 = openFileOutput("DuzaSakwaWaga2.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga2 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga2);
        outputWriterinputDuzaSakwaWaga2.write(DuzaSakwaWaga2.getText().toString());
        outputWriterinputDuzaSakwaWaga2.close();

        FileOutputStream fileoutinputDuzaSakwaWaga3 = openFileOutput("DuzaSakwaWaga3.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga3 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga3);
        outputWriterinputDuzaSakwaWaga3.write(DuzaSakwaWaga3.getText().toString());
        outputWriterinputDuzaSakwaWaga3.close();

        FileOutputStream fileoutinputDuzaSakwaWaga4 = openFileOutput("DuzaSakwaWaga4.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga4 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga4);
        outputWriterinputDuzaSakwaWaga4.write(DuzaSakwaWaga4.getText().toString());
        outputWriterinputDuzaSakwaWaga4.close();

        FileOutputStream fileoutinputDuzaSakwaWaga5 = openFileOutput("DuzaSakwaWaga5.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga5 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga5);
        outputWriterinputDuzaSakwaWaga5.write(DuzaSakwaWaga5.getText().toString());
        outputWriterinputDuzaSakwaWaga5.close();

        FileOutputStream fileoutinputDuzaSakwaWaga6 = openFileOutput("DuzaSakwaWaga6.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga6 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga6);
        outputWriterinputDuzaSakwaWaga6.write(DuzaSakwaWaga6.getText().toString());
        outputWriterinputDuzaSakwaWaga6.close();

        FileOutputStream fileoutinputDuzaSakwaWaga7 = openFileOutput("DuzaSakwaWaga7.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga7 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga7);
        outputWriterinputDuzaSakwaWaga7.write(DuzaSakwaWaga7.getText().toString());
        outputWriterinputDuzaSakwaWaga7.close();

        FileOutputStream fileoutinputDuzaSakwaWaga8 = openFileOutput("DuzaSakwaWaga8.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga8 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga8);
        outputWriterinputDuzaSakwaWaga8.write(DuzaSakwaWaga8.getText().toString());
        outputWriterinputDuzaSakwaWaga8.close();

        FileOutputStream fileoutinputDuzaSakwaWaga9 = openFileOutput("DuzaSakwaWaga9.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga9 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga9);
        outputWriterinputDuzaSakwaWaga9.write(DuzaSakwaWaga9.getText().toString());
        outputWriterinputDuzaSakwaWaga9.close();

        FileOutputStream fileoutinputDuzaSakwaWaga10 = openFileOutput("DuzaSakwaWaga10.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga10 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga10);
        outputWriterinputDuzaSakwaWaga10.write(DuzaSakwaWaga10.getText().toString());
        outputWriterinputDuzaSakwaWaga10.close();

        FileOutputStream fileoutinputDuzaSakwaWaga11 = openFileOutput("DuzaSakwaWaga11.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga11 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga11);
        outputWriterinputDuzaSakwaWaga11.write(DuzaSakwaWaga11.getText().toString());
        outputWriterinputDuzaSakwaWaga11.close();

        FileOutputStream fileoutinputDuzaSakwaWaga12 = openFileOutput("DuzaSakwaWaga12.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputDuzaSakwaWaga12 = new OutputStreamWriter(fileoutinputDuzaSakwaWaga12);
        outputWriterinputDuzaSakwaWaga12.write(DuzaSakwaWaga12.getText().toString());
        outputWriterinputDuzaSakwaWaga12.close();

        FileOutputStream fileoutinputPlecak1 = openFileOutput("Plecak1.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak1 = new OutputStreamWriter(fileoutinputPlecak1);
        outputWriterinputPlecak1.write(Plecak1.getText().toString());
        outputWriterinputPlecak1.close();

        FileOutputStream fileoutinputPlecak2 = openFileOutput("Plecak2.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak2 = new OutputStreamWriter(fileoutinputPlecak2);
        outputWriterinputPlecak2.write(Plecak2.getText().toString());
        outputWriterinputPlecak2.close();

        FileOutputStream fileoutinputPlecak3 = openFileOutput("Plecak3.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak3 = new OutputStreamWriter(fileoutinputPlecak3);
        outputWriterinputPlecak3.write(Plecak3.getText().toString());
        outputWriterinputPlecak3.close();

        FileOutputStream fileoutinputPlecak4 = openFileOutput("Plecak4.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak4 = new OutputStreamWriter(fileoutinputPlecak4);
        outputWriterinputPlecak4.write(Plecak4.getText().toString());
        outputWriterinputPlecak4.close();

        FileOutputStream fileoutinputPlecak5 = openFileOutput("Plecak5.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak5 = new OutputStreamWriter(fileoutinputPlecak5);
        outputWriterinputPlecak5.write(Plecak5.getText().toString());
        outputWriterinputPlecak5.close();

        FileOutputStream fileoutinputPlecak6 = openFileOutput("Plecak6.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak6 = new OutputStreamWriter(fileoutinputPlecak6);
        outputWriterinputPlecak6.write(Plecak6.getText().toString());
        outputWriterinputPlecak6.close();

        FileOutputStream fileoutinputPlecak7 = openFileOutput("Plecak7.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak7 = new OutputStreamWriter(fileoutinputPlecak7);
        outputWriterinputPlecak7.write(Plecak7.getText().toString());
        outputWriterinputPlecak7.close();

        FileOutputStream fileoutinputPlecak8 = openFileOutput("Plecak8.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak8 = new OutputStreamWriter(fileoutinputPlecak8);
        outputWriterinputPlecak8.write(Plecak8.getText().toString());
        outputWriterinputPlecak8.close();

        FileOutputStream fileoutinputPlecak9 = openFileOutput("Plecak9.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak9 = new OutputStreamWriter(fileoutinputPlecak9);
        outputWriterinputPlecak9.write(Plecak9.getText().toString());
        outputWriterinputPlecak9.close();

        FileOutputStream fileoutinputPlecak10 = openFileOutput("Plecak10.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak10 = new OutputStreamWriter(fileoutinputPlecak10);
        outputWriterinputPlecak10.write(Plecak10.getText().toString());
        outputWriterinputPlecak10.close();

        FileOutputStream fileoutinputPlecak11 = openFileOutput("Plecak11.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak11 = new OutputStreamWriter(fileoutinputPlecak11);
        outputWriterinputPlecak11.write(Plecak11.getText().toString());
        outputWriterinputPlecak11.close();

        FileOutputStream fileoutinputPlecak12 = openFileOutput("Plecak12.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak12 = new OutputStreamWriter(fileoutinputPlecak12);
        outputWriterinputPlecak12.write(Plecak12.getText().toString());
        outputWriterinputPlecak12.close();

        FileOutputStream fileoutinputPlecak13 = openFileOutput("Plecak13.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak13 = new OutputStreamWriter(fileoutinputPlecak13);
        outputWriterinputPlecak13.write(Plecak13.getText().toString());
        outputWriterinputPlecak13.close();

        FileOutputStream fileoutinputPlecak14 = openFileOutput("Plecak14.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak14 = new OutputStreamWriter(fileoutinputPlecak14);
        outputWriterinputPlecak14.write(Plecak14.getText().toString());
        outputWriterinputPlecak14.close();

        FileOutputStream fileoutinputPlecak15 = openFileOutput("Plecak15.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak15 = new OutputStreamWriter(fileoutinputPlecak15);
        outputWriterinputPlecak15.write(Plecak15.getText().toString());
        outputWriterinputPlecak15.close();

        FileOutputStream fileoutinputPlecak16 = openFileOutput("Plecak16.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak16 = new OutputStreamWriter(fileoutinputPlecak16);
        outputWriterinputPlecak16.write(Plecak16.getText().toString());
        outputWriterinputPlecak16.close();

        FileOutputStream fileoutinputPlecak17 = openFileOutput("Plecak17.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak17 = new OutputStreamWriter(fileoutinputPlecak17);
        outputWriterinputPlecak17.write(Plecak17.getText().toString());
        outputWriterinputPlecak17.close();

        FileOutputStream fileoutinputPlecak18 = openFileOutput("Plecak18.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak18 = new OutputStreamWriter(fileoutinputPlecak18);
        outputWriterinputPlecak18.write(Plecak18.getText().toString());
        outputWriterinputPlecak18.close();

        FileOutputStream fileoutinputPlecak1Ilosc = openFileOutput("Plecak1Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak1Ilosc = new OutputStreamWriter(fileoutinputPlecak1Ilosc);
        outputWriterinputPlecak1Ilosc.write(Plecak1Ilosc.getText().toString());
        outputWriterinputPlecak1Ilosc.close();

        FileOutputStream fileoutinputPlecak2Ilosc = openFileOutput("Plecak2Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak2Ilosc = new OutputStreamWriter(fileoutinputPlecak2Ilosc);
        outputWriterinputPlecak2Ilosc.write(Plecak2Ilosc.getText().toString());
        outputWriterinputPlecak2Ilosc.close();

        FileOutputStream fileoutinputPlecak3Ilosc = openFileOutput("Plecak3Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak3Ilosc = new OutputStreamWriter(fileoutinputPlecak3Ilosc);
        outputWriterinputPlecak3Ilosc.write(Plecak3Ilosc.getText().toString());
        outputWriterinputPlecak3Ilosc.close();

        FileOutputStream fileoutinputPlecak4Ilosc = openFileOutput("Plecak4Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak4Ilosc = new OutputStreamWriter(fileoutinputPlecak4Ilosc);
        outputWriterinputPlecak4Ilosc.write(Plecak4Ilosc.getText().toString());
        outputWriterinputPlecak4Ilosc.close();

        FileOutputStream fileoutinputPlecak5Ilosc = openFileOutput("Plecak5Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak5Ilosc = new OutputStreamWriter(fileoutinputPlecak5Ilosc);
        outputWriterinputPlecak5Ilosc.write(Plecak5Ilosc.getText().toString());
        outputWriterinputPlecak5Ilosc.close();

        FileOutputStream fileoutinputPlecak6Ilosc = openFileOutput("Plecak6Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak6Ilosc = new OutputStreamWriter(fileoutinputPlecak6Ilosc);
        outputWriterinputPlecak6Ilosc.write(Plecak6Ilosc.getText().toString());
        outputWriterinputPlecak6Ilosc.close();

        FileOutputStream fileoutinputPlecak7Ilosc = openFileOutput("Plecak7Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak7Ilosc = new OutputStreamWriter(fileoutinputPlecak7Ilosc);
        outputWriterinputPlecak7Ilosc.write(Plecak7Ilosc.getText().toString());
        outputWriterinputPlecak7Ilosc.close();

        FileOutputStream fileoutinputPlecak8Ilosc = openFileOutput("Plecak8Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak8Ilosc = new OutputStreamWriter(fileoutinputPlecak8Ilosc);
        outputWriterinputPlecak8Ilosc.write(Plecak8Ilosc.getText().toString());
        outputWriterinputPlecak8Ilosc.close();

        FileOutputStream fileoutinputPlecak9Ilosc = openFileOutput("Plecak9Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak9Ilosc = new OutputStreamWriter(fileoutinputPlecak9Ilosc);
        outputWriterinputPlecak9Ilosc.write(Plecak9Ilosc.getText().toString());
        outputWriterinputPlecak9Ilosc.close();

        FileOutputStream fileoutinputPlecak10Ilosc = openFileOutput("Plecak10Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak10Ilosc = new OutputStreamWriter(fileoutinputPlecak10Ilosc);
        outputWriterinputPlecak10Ilosc.write(Plecak10Ilosc.getText().toString());
        outputWriterinputPlecak10Ilosc.close();

        FileOutputStream fileoutinputPlecak11Ilosc = openFileOutput("Plecak11Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak11Ilosc = new OutputStreamWriter(fileoutinputPlecak11Ilosc);
        outputWriterinputPlecak11Ilosc.write(Plecak11Ilosc.getText().toString());
        outputWriterinputPlecak11Ilosc.close();

        FileOutputStream fileoutinputPlecak12Ilosc = openFileOutput("Plecak12Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak12Ilosc = new OutputStreamWriter(fileoutinputPlecak12Ilosc);
        outputWriterinputPlecak12Ilosc.write(Plecak12Ilosc.getText().toString());
        outputWriterinputPlecak12Ilosc.close();

        FileOutputStream fileoutinputPlecak13Ilosc = openFileOutput("Plecak13Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak13Ilosc = new OutputStreamWriter(fileoutinputPlecak13Ilosc);
        outputWriterinputPlecak13Ilosc.write(Plecak13Ilosc.getText().toString());
        outputWriterinputPlecak13Ilosc.close();

        FileOutputStream fileoutinputPlecak14Ilosc = openFileOutput("Plecak14Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak14Ilosc = new OutputStreamWriter(fileoutinputPlecak14Ilosc);
        outputWriterinputPlecak14Ilosc.write(Plecak14Ilosc.getText().toString());
        outputWriterinputPlecak14Ilosc.close();

        FileOutputStream fileoutinputPlecak15Ilosc = openFileOutput("Plecak15Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak15Ilosc = new OutputStreamWriter(fileoutinputPlecak15Ilosc);
        outputWriterinputPlecak15Ilosc.write(Plecak15Ilosc.getText().toString());
        outputWriterinputPlecak15Ilosc.close();

        FileOutputStream fileoutinputPlecak16Ilosc = openFileOutput("Plecak16Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak16Ilosc = new OutputStreamWriter(fileoutinputPlecak16Ilosc);
        outputWriterinputPlecak16Ilosc.write(Plecak16Ilosc.getText().toString());
        outputWriterinputPlecak16Ilosc.close();

        FileOutputStream fileoutinputPlecak17Ilosc = openFileOutput("Plecak17Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak17Ilosc = new OutputStreamWriter(fileoutinputPlecak17Ilosc);
        outputWriterinputPlecak17Ilosc.write(Plecak17Ilosc.getText().toString());
        outputWriterinputPlecak17Ilosc.close();

        FileOutputStream fileoutinputPlecak18Ilosc = openFileOutput("Plecak18Ilosc.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak18Ilosc = new OutputStreamWriter(fileoutinputPlecak18Ilosc);
        outputWriterinputPlecak18Ilosc.write(Plecak18Ilosc.getText().toString());
        outputWriterinputPlecak18Ilosc.close();

        FileOutputStream fileoutinputPlecak1Waga = openFileOutput("Plecak1Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak1Waga = new OutputStreamWriter(fileoutinputPlecak1Waga);
        outputWriterinputPlecak1Waga.write(Plecak1Waga.getText().toString());
        outputWriterinputPlecak1Waga.close();

        FileOutputStream fileoutinputPlecak2Waga = openFileOutput("Plecak2Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak2Waga = new OutputStreamWriter(fileoutinputPlecak2Waga);
        outputWriterinputPlecak2Waga.write(Plecak2Waga.getText().toString());
        outputWriterinputPlecak2Waga.close();

        FileOutputStream fileoutinputPlecak3Waga = openFileOutput("Plecak3Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak3Waga = new OutputStreamWriter(fileoutinputPlecak3Waga);
        outputWriterinputPlecak3Waga.write(Plecak3Waga.getText().toString());
        outputWriterinputPlecak3Waga.close();

        FileOutputStream fileoutinputPlecak4Waga = openFileOutput("Plecak4Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak4Waga = new OutputStreamWriter(fileoutinputPlecak4Waga);
        outputWriterinputPlecak4Waga.write(Plecak4Waga.getText().toString());
        outputWriterinputPlecak4Waga.close();

        FileOutputStream fileoutinputPlecak5Waga = openFileOutput("Plecak5Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak5Waga = new OutputStreamWriter(fileoutinputPlecak5Waga);
        outputWriterinputPlecak5Waga.write(Plecak5Waga.getText().toString());
        outputWriterinputPlecak5Waga.close();

        FileOutputStream fileoutinputPlecak6Waga = openFileOutput("Plecak6Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak6Waga = new OutputStreamWriter(fileoutinputPlecak6Waga);
        outputWriterinputPlecak6Waga.write(Plecak6Waga.getText().toString());
        outputWriterinputPlecak6Waga.close();

        FileOutputStream fileoutinputPlecak7Waga = openFileOutput("Plecak7Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak7Waga = new OutputStreamWriter(fileoutinputPlecak7Waga);
        outputWriterinputPlecak7Waga.write(Plecak7Waga.getText().toString());
        outputWriterinputPlecak7Waga.close();

        FileOutputStream fileoutinputPlecak8Waga = openFileOutput("Plecak8Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak8Waga = new OutputStreamWriter(fileoutinputPlecak8Waga);
        outputWriterinputPlecak8Waga.write(Plecak8Waga.getText().toString());
        outputWriterinputPlecak8Waga.close();

        FileOutputStream fileoutinputPlecak9Waga = openFileOutput("Plecak9Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak9Waga = new OutputStreamWriter(fileoutinputPlecak9Waga);
        outputWriterinputPlecak9Waga.write(Plecak9Waga.getText().toString());
        outputWriterinputPlecak9Waga.close();

        FileOutputStream fileoutinputPlecak10Waga = openFileOutput("Plecak10Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak10Waga = new OutputStreamWriter(fileoutinputPlecak10Waga);
        outputWriterinputPlecak10Waga.write(Plecak10Waga.getText().toString());
        outputWriterinputPlecak10Waga.close();

        FileOutputStream fileoutinputPlecak11Waga = openFileOutput("Plecak11Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak11Waga = new OutputStreamWriter(fileoutinputPlecak11Waga);
        outputWriterinputPlecak11Waga.write(Plecak11Waga.getText().toString());
        outputWriterinputPlecak11Waga.close();

        FileOutputStream fileoutinputPlecak12Waga = openFileOutput("Plecak12Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak12Waga = new OutputStreamWriter(fileoutinputPlecak12Waga);
        outputWriterinputPlecak12Waga.write(Plecak12Waga.getText().toString());
        outputWriterinputPlecak12Waga.close();

        FileOutputStream fileoutinputPlecak13Waga = openFileOutput("Plecak13Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak13Waga = new OutputStreamWriter(fileoutinputPlecak13Waga);
        outputWriterinputPlecak13Waga.write(Plecak13Waga.getText().toString());
        outputWriterinputPlecak13Waga.close();

        FileOutputStream fileoutinputPlecak14Waga = openFileOutput("Plecak14Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak14Waga = new OutputStreamWriter(fileoutinputPlecak14Waga);
        outputWriterinputPlecak14Waga.write(Plecak14Waga.getText().toString());
        outputWriterinputPlecak14Waga.close();

        FileOutputStream fileoutinputPlecak15Waga = openFileOutput("Plecak15Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak15Waga = new OutputStreamWriter(fileoutinputPlecak15Waga);
        outputWriterinputPlecak15Waga.write(Plecak15Waga.getText().toString());
        outputWriterinputPlecak15Waga.close();

        FileOutputStream fileoutinputPlecak16Waga = openFileOutput("Plecak16Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak16Waga = new OutputStreamWriter(fileoutinputPlecak16Waga);
        outputWriterinputPlecak16Waga.write(Plecak16Waga.getText().toString());
        outputWriterinputPlecak16Waga.close();

        FileOutputStream fileoutinputPlecak17Waga = openFileOutput("Plecak17Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak17Waga = new OutputStreamWriter(fileoutinputPlecak17Waga);
        outputWriterinputPlecak17Waga.write(Plecak17Waga.getText().toString());
        outputWriterinputPlecak17Waga.close();

        FileOutputStream fileoutinputPlecak18Waga = openFileOutput("Plecak18Waga.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPlecak18Waga = new OutputStreamWriter(fileoutinputPlecak18Waga);
        outputWriterinputPlecak18Waga.write(Plecak18Waga.getText().toString());
        outputWriterinputPlecak18Waga.close();

        FileOutputStream fileoutinputPozywytna1 = openFileOutput("Pozywytna1.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPozywytna1 = new OutputStreamWriter(fileoutinputPozywytna1);
        outputWriterinputPozywytna1.write(Pozywytna1.getText().toString());
        outputWriterinputPozywytna1.close();

        FileOutputStream fileoutinputPozywytna2 = openFileOutput("Pozywytna2.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPozywytna2 = new OutputStreamWriter(fileoutinputPozywytna2);
        outputWriterinputPozywytna2.write(Pozywytna2.getText().toString());
        outputWriterinputPozywytna2.close();

        FileOutputStream fileoutinputPozywytna3 = openFileOutput("Pozywytna3.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPozywytna3 = new OutputStreamWriter(fileoutinputPozywytna3);
        outputWriterinputPozywytna3.write(Pozywytna3.getText().toString());
        outputWriterinputPozywytna3.close();

        FileOutputStream fileoutinputPozywytna4 = openFileOutput("Pozywytna4.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPozywytna4 = new OutputStreamWriter(fileoutinputPozywytna4);
        outputWriterinputPozywytna4.write(Pozywytna4.getText().toString());
        outputWriterinputPozywytna4.close();

        FileOutputStream fileoutinputPozywytna5 = openFileOutput("Pozywytna5.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPozywytna5 = new OutputStreamWriter(fileoutinputPozywytna5);
        outputWriterinputPozywytna5.write(Pozywytna5.getText().toString());
        outputWriterinputPozywytna5.close();

        FileOutputStream fileoutinputPozywytna6 = openFileOutput("Pozywytna6.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPozywytna6 = new OutputStreamWriter(fileoutinputPozywytna6);
        outputWriterinputPozywytna6.write(Pozywytna6.getText().toString());
        outputWriterinputPozywytna6.close();

        FileOutputStream fileoutinputPozywytna7 = openFileOutput("Pozywytna7.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPozywytna7 = new OutputStreamWriter(fileoutinputPozywytna7);
        outputWriterinputPozywytna7.write(Pozywytna7.getText().toString());
        outputWriterinputPozywytna7.close();

        FileOutputStream fileoutinputPozywytna8 = openFileOutput("Pozywytna8.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPozywytna8 = new OutputStreamWriter(fileoutinputPozywytna8);
        outputWriterinputPozywytna8.write(Pozywytna8.getText().toString());
        outputWriterinputPozywytna8.close();

        FileOutputStream fileoutinputPozywytna9 = openFileOutput("Pozywytna9.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPozywytna9 = new OutputStreamWriter(fileoutinputPozywytna9);
        outputWriterinputPozywytna9.write(Pozywytna9.getText().toString());
        outputWriterinputPozywytna9.close();

        FileOutputStream fileoutinputPozywytna10 = openFileOutput("Pozywytna10.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputPozywytna10 = new OutputStreamWriter(fileoutinputPozywytna10);
        outputWriterinputPozywytna10.write(Pozywytna10.getText().toString());
        outputWriterinputPozywytna10.close();

        FileOutputStream fileoutinputNegatywna1 = openFileOutput("Negatywna1.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputNegatywna1 = new OutputStreamWriter(fileoutinputNegatywna1);
        outputWriterinputNegatywna1.write(Negatywna1.getText().toString());
        outputWriterinputNegatywna1.close();

        FileOutputStream fileoutinputNegatywna2 = openFileOutput("Negatywna2.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputNegatywna2 = new OutputStreamWriter(fileoutinputNegatywna2);
        outputWriterinputNegatywna2.write(Negatywna2.getText().toString());
        outputWriterinputNegatywna2.close();

        FileOutputStream fileoutinputNegatywna3 = openFileOutput("Negatywna3.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputNegatywna3 = new OutputStreamWriter(fileoutinputNegatywna3);
        outputWriterinputNegatywna3.write(Negatywna3.getText().toString());
        outputWriterinputNegatywna3.close();

        FileOutputStream fileoutinputNegatywna4 = openFileOutput("Negatywna4.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputNegatywna4 = new OutputStreamWriter(fileoutinputNegatywna4);
        outputWriterinputNegatywna4.write(Negatywna4.getText().toString());
        outputWriterinputNegatywna4.close();

        FileOutputStream fileoutinputNegatywna5 = openFileOutput("Negatywna5.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputNegatywna5 = new OutputStreamWriter(fileoutinputNegatywna5);
        outputWriterinputNegatywna5.write(Negatywna5.getText().toString());
        outputWriterinputNegatywna5.close();

        FileOutputStream fileoutinputNegatywna6 = openFileOutput("Negatywna6.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputNegatywna6 = new OutputStreamWriter(fileoutinputNegatywna6);
        outputWriterinputNegatywna6.write(Negatywna6.getText().toString());
        outputWriterinputNegatywna6.close();

        FileOutputStream fileoutinputNegatywna7 = openFileOutput("Negatywna7.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputNegatywna7 = new OutputStreamWriter(fileoutinputNegatywna7);
        outputWriterinputNegatywna7.write(Negatywna7.getText().toString());
        outputWriterinputNegatywna7.close();

        FileOutputStream fileoutinputNegatywna8 = openFileOutput("Negatywna8.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputNegatywna8 = new OutputStreamWriter(fileoutinputNegatywna8);
        outputWriterinputNegatywna8.write(Negatywna8.getText().toString());
        outputWriterinputNegatywna8.close();

        FileOutputStream fileoutinputNegatywna9 = openFileOutput("Negatywna9.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputNegatywna9 = new OutputStreamWriter(fileoutinputNegatywna9);
        outputWriterinputNegatywna9.write(Negatywna9.getText().toString());
        outputWriterinputNegatywna9.close();

        FileOutputStream fileoutinputNegatywna10 = openFileOutput("Negatywna10.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputNegatywna10 = new OutputStreamWriter(fileoutinputNegatywna10);
        outputWriterinputNegatywna10.write(Negatywna10.getText().toString());
        outputWriterinputNegatywna10.close();

        FileOutputStream fileoutinputNotatki = openFileOutput("Notatki.txt", MODE_PRIVATE);
        OutputStreamWriter outputWriterinputNotatki = new OutputStreamWriter(fileoutinputNotatki);
        outputWriterinputNotatki.write(Notatki.getText().toString());
        outputWriterinputNotatki.close();

            Toast.makeText(getBaseContext(), "Karta została zapisana!",
                    Toast.LENGTH_SHORT).show();



    }



    public void reverse(View view) {
        this.finish();
    }

    public void RuchHelp(View v){
        Builder builder = new Builder(Karta1_2.this);
        builder.setTitle(R.string.ruch).setPositiveButton("OK", null);
        builder.show();
    }

}
