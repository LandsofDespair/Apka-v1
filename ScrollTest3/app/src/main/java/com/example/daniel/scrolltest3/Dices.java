package com.example.daniel.scrolltest3;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class Dices extends Activity implements View.OnClickListener {

    int minD2 = 1;
    int maxD2 = 2;
    int minD4 = 1;
    int maxD4 = 4;
    int minD6 = 1;
    int maxD6 = 6;
    int minD8 = 1;
    int maxD8 = 8;
    int minD10 = 1;
    int maxD10 = 10;
    int minD12 = 1;
    int maxD12 = 12;
    int minD20 = 1;
    int maxD20 = 20;
    int minD100 = 1;
    int maxD100 = 100;

    Button smoczakostka1button;
    Button smoczakostka2button;
    Button smoczakostka3button;
    Button smoczakostka4button;
    Button smoczakostka5button;
    Button smoczakostka6button;
    Button btnD2;
    Button btnD4;
    Button btnD6;
    Button btnD8;
    Button btnD10;
    Button btnD12;
    Button btnD20;
    Button btnD100;
    Button btnTrafienia;

    ImageView smoczakostka1;
    ImageView smoczakostka1x1;
    ImageView smoczakostka2;
    ImageView smoczakostka2x2;
    ImageView smoczakostka3x1;
    ImageView smoczakostka3x2;
    ImageView smoczakostka3x3;
    ImageView smoczakostka4x1;
    ImageView smoczakostka4x2;
    ImageView smoczakostka4x3;
    ImageView smoczakostka4x4;
    ImageView smoczakostka5x1;
    ImageView smoczakostka5x2;
    ImageView smoczakostka5x3;
    ImageView smoczakostka5x4;
    ImageView smoczakostka5x5;
    ImageView smoczakostka6;
    TextView ResultD2;
    TextView ResultD4;
    TextView ResultD6;
    TextView ResultD8;
    TextView ResultD10;
    TextView ResultD12;
    TextView ResultD20;
    TextView ResultD100;
    TextView ResultTrafienia;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dices);

        smoczakostka1 = (ImageView) findViewById(R.id.smoczakostka1);
        smoczakostka1x1 = (ImageView) findViewById(R.id.smoczakostka1x1);
        smoczakostka2 = (ImageView) findViewById(R.id.smoczakostka2);
        smoczakostka2x2 = (ImageView) findViewById(R.id.smoczakostka2x2);
        smoczakostka3x1 = (ImageView) findViewById(R.id.smoczakostka3x1);
        smoczakostka3x2 = (ImageView) findViewById(R.id.smoczakostka3x2);
        smoczakostka3x3 = (ImageView) findViewById(R.id.smoczakostka3x3);
        smoczakostka4x1 = (ImageView) findViewById(R.id.smoczakostka4x1);
        smoczakostka4x2 = (ImageView) findViewById(R.id.smoczakostka4x2);
        smoczakostka4x3 = (ImageView) findViewById(R.id.smoczakostka4x3);
        smoczakostka4x4 = (ImageView) findViewById(R.id.smoczakostka4x4);
        smoczakostka5x1 = (ImageView) findViewById(R.id.smoczakostka5x1);
        smoczakostka5x2 = (ImageView) findViewById(R.id.smoczakostka5x2);
        smoczakostka5x3 = (ImageView) findViewById(R.id.smoczakostka5x3);
        smoczakostka5x4 = (ImageView) findViewById(R.id.smoczakostka5x4);
        smoczakostka5x5 = (ImageView) findViewById(R.id.smoczakostka5x5);
        smoczakostka6 = (ImageView) findViewById(R.id.smoczakostka6);

        smoczakostka1button = (Button) findViewById(R.id.smoczakostka1button);
        smoczakostka2button = (Button) findViewById(R.id.smoczakostka2button);
        smoczakostka3button = (Button) findViewById(R.id.smoczakostka3button);
        smoczakostka4button = (Button) findViewById(R.id.smoczakostka4button);
        smoczakostka5button = (Button) findViewById(R.id.smoczakostka5button);
        smoczakostka6button = (Button) findViewById(R.id.smoczakostka6button);
        btnD2 = (Button) findViewById(R.id.btnD2);
        btnD4 = (Button) findViewById(R.id.btnD4);
        btnD6 = (Button) findViewById(R.id.btnD6);
        btnD8 = (Button) findViewById(R.id.btnD8);
        btnD10 = (Button) findViewById(R.id.btnD10);
        btnD12 = (Button) findViewById(R.id.btnD12);
        btnD20 = (Button) findViewById(R.id.btnD20);
        btnD100 = (Button) findViewById(R.id.btnD100);
        btnTrafienia = (Button) findViewById(R.id.btnTrafienia);

        ResultD2 = (TextView) findViewById(R.id.ResultD2);
        ResultD4 = (TextView) findViewById(R.id.ResultD4);
        ResultD6 = (TextView) findViewById(R.id.ResultD6);
        ResultD8 = (TextView) findViewById(R.id.ResultD8);
        ResultD10 = (TextView) findViewById(R.id.ResultD10);
        ResultD12 = (TextView) findViewById(R.id.ResultD12);
        ResultD20 = (TextView) findViewById(R.id.ResultD20);
        ResultD100 = (TextView) findViewById(R.id.ResultD100);
        ResultTrafienia = (TextView) findViewById(R.id.ResultTrafienia);

        // set a listener
        btnD2.setOnClickListener(this);
        btnD4.setOnClickListener(this);
        btnD6.setOnClickListener(this);
        btnD8.setOnClickListener(this);
        btnD10.setOnClickListener(this);
        btnD12.setOnClickListener(this);
        btnD20.setOnClickListener(this);
        btnD100.setOnClickListener(this);
        smoczakostka5button.setOnClickListener(this);
        btnTrafienia.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int result = 0;
        Random rD2 = new Random();
        int i1D2 = rD2.nextInt(maxD2 - minD2 + 1) + minD2;
        Random rD4 = new Random();
        int i1D4 = rD4.nextInt(maxD4 - minD4 + 1) + minD4;
        Random rD6 = new Random();
        int i1D6 = rD6.nextInt(maxD6 - minD6 + 1) + minD6;
        Random rD8 = new Random();
        int i1D8 = rD8.nextInt(maxD8 - minD8 + 1) + minD8;
        Random rD10 = new Random();
        int i1D10 = rD10.nextInt(maxD10 - minD10 + 1) + minD10;
        Random rD12 = new Random();
        int i1D12 = rD12.nextInt(maxD12 - minD12 + 1) + minD12;
        Random rD20 = new Random();
        int i1D20 = rD20.nextInt(maxD20 - minD20 + 1) + minD20;
        Random rD100 = new Random();
        int i1D100 = rD100.nextInt(maxD100 - minD100 + 1) + minD100;
        Random random = new Random();
        int random1 = random.nextInt(maxD100 - minD100 + 1) + minD100;

        switch (v.getId()) {
            case R.id.btnD2:
                result = i1D2;
                ResultD2.setVisibility(View.VISIBLE);
                ResultD2.setText("" + result);
                break;
            case R.id.btnD4:
                result = i1D4;
                ResultD4.setVisibility(View.VISIBLE);
                ResultD4.setText("" + result);
                break;
            case R.id.btnD6:
                result = i1D6;
                ResultD6.setVisibility(View.VISIBLE);
                ResultD6.setText("" + result);
                break;
            case R.id.btnD8:
                result = i1D8;
                ResultD8.setVisibility(View.VISIBLE);
                ResultD8.setText("" + result);
                break;
            case R.id.btnD10:
                result = i1D10;
                ResultD10.setVisibility(View.VISIBLE);
                ResultD10.setText("" + result);
                break;
            case R.id.btnD12:
                result = i1D12;
                ResultD12.setVisibility(View.VISIBLE);
                ResultD12.setText("" + result);
                break;
            case R.id.btnD20:
                result = i1D20;
                ResultD20.setVisibility(View.VISIBLE);
                ResultD20.setText("" + result);
                break;
            case R.id.btnD100:
                result = i1D100;
                ResultD100.setVisibility(View.VISIBLE);
                ResultD100.setText("" + result);
                break;
            case R.id.btnTrafienia:
                ResultTrafienia.setVisibility(View.VISIBLE);
                if (random1 <= 14) {
                    ResultTrafienia.setText("Głowa");
                } else if (random1 > 14 && random1 <= 33) {
                    ResultTrafienia.setText("Lewe Ramię");
                } else if (random1 > 33 && random1 <= 52) {
                    ResultTrafienia.setText("Prawe Ramię");
                } else if (random1 > 52 && random1 <= 80) {
                    ResultTrafienia.setText("Korpus");
                } else if (random1 > 80 && random1 <= 90) {
                    ResultTrafienia.setText("Lewa Noga");
                } else if (random1 > 90 && random1 <= 100) {
                    ResultTrafienia.setText("Prawa Noga");
                }
                break;
            case R.id.smoczakostka5button:
                smoczakostka5x1.setImageResource(R.drawable.successdice);
                smoczakostka5x2.setImageResource(R.drawable.successdice);
                smoczakostka5x3.setImageResource(R.drawable.successdice);
                smoczakostka5x4.setImageResource(R.drawable.successdice);
                smoczakostka5x5.setImageResource(R.drawable.successdice);
                Random random2 = new Random();
                int random3 = random2.nextInt(30 - 1 + 1) + 1;
                if (random3 == 1) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 2) {
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 3) {
                    smoczakostka4x1.setImageResource(R.drawable.successdicex);
                    smoczakostka4x3.setImageResource(R.drawable.successdicex);
                    smoczakostka4x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 4) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 5) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 6) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 7) {
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 8) {
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 9) {
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 10) {
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 11) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 12) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 13) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 14) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 15) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 16) {
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 17) {
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 18) {
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 19) {
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 20) {
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 21) {
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 22) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 23) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 24) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 25) {
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 26) {
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 27) {
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 28) {
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 29) {
                    smoczakostka5x1.setImageResource(R.drawable.successdicex);
                    smoczakostka5x2.setImageResource(R.drawable.successdicex);
                    smoczakostka5x3.setImageResource(R.drawable.successdicex);
                    smoczakostka5x4.setImageResource(R.drawable.successdicex);
                    smoczakostka5x5.setImageResource(R.drawable.successdicex);
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                } else if (random3 == 30) {
                    smoczakostka5x1.setVisibility(View.VISIBLE);
                    smoczakostka5x2.setVisibility(View.VISIBLE);
                    smoczakostka5x3.setVisibility(View.VISIBLE);
                    smoczakostka5x4.setVisibility(View.VISIBLE);
                    smoczakostka5x5.setVisibility(View.VISIBLE);
                }
                break;
        }
    }

    public void smoczakostka1buttonClicked(View view) {
        smoczakostka1.setVisibility(View.GONE);
        smoczakostka1x1.setVisibility(View.GONE);
        Random random = new Random();
        int random1 = random.nextInt(2 - 1 + 1) + 1;
        if (random1 == 1) {
            smoczakostka1.setVisibility(View.VISIBLE);
        } else if (random1 == 2) {
            smoczakostka1x1.setVisibility(View.VISIBLE);
        }
    }

    public void smoczakostka2buttonClicked(View view) {
        smoczakostka2.setImageResource(R.drawable.successdice);
        smoczakostka2x2.setImageResource(R.drawable.successdice);
        smoczakostka2.setVisibility(View.VISIBLE);
        smoczakostka2x2.setVisibility(View.VISIBLE);
        Random random = new Random();
        int random1 = random.nextInt(4 - 1 + 1) + 1;
        if (random1 == 1) {
            smoczakostka2.setImageResource(R.drawable.successdicex);
            smoczakostka2x2.setImageResource(R.drawable.successdicex);
        } else if (random1 == 2) {
            smoczakostka2.setImageResource(R.drawable.successdicex);
        } else {
            if (random1 == 3) {
                smoczakostka2x2.setImageResource(R.drawable.successdicex);
            } else if(random1 == 4){

            }
        }
    }

    public void smoczakostka3buttonClicked(View view) {
        smoczakostka3x1.setImageResource(R.drawable.successdice);
        smoczakostka3x2.setImageResource(R.drawable.successdice);
        smoczakostka3x3.setImageResource(R.drawable.successdice);
        smoczakostka3x1.setVisibility(View.GONE);
        smoczakostka3x2.setVisibility(View.GONE);
        smoczakostka3x3.setVisibility(View.GONE);
        Random random = new Random();
        int random1 = random.nextInt(8 - 1 + 1) + 1;
        if (random1 == 1) {
            smoczakostka3x1.setImageResource(R.drawable.successdicex);
            smoczakostka3x2.setImageResource(R.drawable.successdicex);
            smoczakostka3x3.setImageResource(R.drawable.successdicex);
            smoczakostka3x1.setVisibility(View.VISIBLE);
            smoczakostka3x2.setVisibility(View.VISIBLE);
            smoczakostka3x3.setVisibility(View.VISIBLE);
        } else if (random1 == 2) {
            smoczakostka3x2.setImageResource(R.drawable.successdicex);
            smoczakostka3x3.setImageResource(R.drawable.successdicex);
            smoczakostka3x1.setVisibility(View.VISIBLE);
            smoczakostka3x2.setVisibility(View.VISIBLE);
            smoczakostka3x3.setVisibility(View.VISIBLE);
        } else if (random1 == 3) {
            smoczakostka3x1.setImageResource(R.drawable.successdicex);
            smoczakostka3x3.setImageResource(R.drawable.successdicex);
            smoczakostka3x1.setVisibility(View.VISIBLE);
            smoczakostka3x2.setVisibility(View.VISIBLE);
            smoczakostka3x3.setVisibility(View.VISIBLE);
        } else if (random1 == 4) {
            smoczakostka3x1.setImageResource(R.drawable.successdicex);
            smoczakostka3x2.setImageResource(R.drawable.successdicex);
            smoczakostka3x1.setVisibility(View.VISIBLE);
            smoczakostka3x2.setVisibility(View.VISIBLE);
            smoczakostka3x3.setVisibility(View.VISIBLE);
        } else if (random1 == 5) {
            smoczakostka3x3.setImageResource(R.drawable.successdicex);
            smoczakostka3x1.setVisibility(View.VISIBLE);
            smoczakostka3x2.setVisibility(View.VISIBLE);
            smoczakostka3x3.setVisibility(View.VISIBLE);
        } else if (random1 == 6) {
            smoczakostka3x1.setImageResource(R.drawable.successdicex);
            smoczakostka3x1.setVisibility(View.VISIBLE);
            smoczakostka3x2.setVisibility(View.VISIBLE);
            smoczakostka3x3.setVisibility(View.VISIBLE);
        } else if (random1 == 7) {
            smoczakostka3x2.setImageResource(R.drawable.successdicex);
            smoczakostka3x1.setVisibility(View.VISIBLE);
            smoczakostka3x2.setVisibility(View.VISIBLE);
            smoczakostka3x3.setVisibility(View.VISIBLE);
        }
        else if(random1 == 8){
            smoczakostka3x1.setVisibility(View.VISIBLE);
            smoczakostka3x2.setVisibility(View.VISIBLE);
            smoczakostka3x3.setVisibility(View.VISIBLE);
        }
    }

    public void smoczakostka4buttonClicked(View view) {
        smoczakostka4x1.setImageResource(R.drawable.successdice);
        smoczakostka4x2.setImageResource(R.drawable.successdice);
        smoczakostka4x3.setImageResource(R.drawable.successdice);
        smoczakostka4x4.setImageResource(R.drawable.successdice);
        Random random = new Random();
        int random1 = random.nextInt(18 - 1 + 1) + 1;
        if (random1 == 1) {
            smoczakostka4x1.setImageResource(R.drawable.successdicex);
            smoczakostka4x2.setImageResource(R.drawable.successdicex);
            smoczakostka4x3.setImageResource(R.drawable.successdicex);
            smoczakostka4x4.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 2) {
            smoczakostka4x2.setImageResource(R.drawable.successdicex);
            smoczakostka4x3.setImageResource(R.drawable.successdicex);
            smoczakostka4x4.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 3) {
            smoczakostka4x1.setImageResource(R.drawable.successdicex);
            smoczakostka4x3.setImageResource(R.drawable.successdicex);
            smoczakostka4x4.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 4) {
            smoczakostka4x1.setImageResource(R.drawable.successdicex);
            smoczakostka4x2.setImageResource(R.drawable.successdicex);
            smoczakostka4x4.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 5) {
            smoczakostka4x1.setImageResource(R.drawable.successdicex);
            smoczakostka4x2.setImageResource(R.drawable.successdicex);
            smoczakostka4x3.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 6) {
            smoczakostka4x3.setImageResource(R.drawable.successdicex);
            smoczakostka4x4.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 7) {
            smoczakostka4x1.setImageResource(R.drawable.successdicex);
            smoczakostka4x4.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 8) {
            smoczakostka4x1.setImageResource(R.drawable.successdicex);
            smoczakostka4x2.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 9) {
            smoczakostka4x2.setImageResource(R.drawable.successdicex);
            smoczakostka4x3.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 10) {
            smoczakostka4x1.setImageResource(R.drawable.successdicex);
            smoczakostka4x4.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 11) {
            smoczakostka4x4.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 12) {
            smoczakostka4x2.setImageResource(R.drawable.successdicex);
            smoczakostka4x3.setImageResource(R.drawable.successdicex);
            smoczakostka4x4.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 13) {
            smoczakostka4x1.setImageResource(R.drawable.successdicex);
            smoczakostka4x3.setImageResource(R.drawable.successdicex);
            smoczakostka4x4.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 14) {
            smoczakostka4x1.setImageResource(R.drawable.successdicex);
            smoczakostka4x2.setImageResource(R.drawable.successdicex);
            smoczakostka4x4.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        } else if (random1 == 15) {
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        }
        else if (random1 == 16) {
            smoczakostka4x1.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        }
        else if (random1 == 17) {
            smoczakostka4x2.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        }
        else if (random1 == 18){
            smoczakostka4x3.setImageResource(R.drawable.successdicex);
            smoczakostka4x1.setVisibility(View.VISIBLE);
            smoczakostka4x2.setVisibility(View.VISIBLE);
            smoczakostka4x3.setVisibility(View.VISIBLE);
            smoczakostka4x4.setVisibility(View.VISIBLE);
        }
    }

}