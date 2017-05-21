package com.example.daniel.scrolltest3;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListaKart extends ListActivity implements View.OnClickListener{
    EditText et;
    String listItem[] = {"Moja pierwsza karta postaci Lands of Despair"};
    Button save;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_kart);
        et = (EditText) findViewById(R.id.editText);
        save = (Button) findViewById(R.id.save);
        save.setOnClickListener(this);
        loadSavedPreferences();

        List values = new ArrayList();
        for (int i = 0; i < listItem.length; i++) {
            values.add(listItem[i]);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    private void loadSavedPreferences() {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);
        String name = sharedPreferences.getString("storedName", String.valueOf(et));
        et.setText(name);
    }
    private void savePreferences(String key, String value){

    }

    public void saveClicked(View v) {
        savePreferences("storedName", et.getText().toString());
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "Zapisano!", Toast.LENGTH_SHORT).show();
            }
        }, 000);
        finish();
    }

    public void onClick(View view) {
        savePreferences("storedName", et.getText().toString());
        ArrayAdapter<String> adapter = (ArrayAdapter<String>) getListAdapter();
        String device;
        switch (view.getId()) {
            case R.id.addItem:
                List myList = new ArrayList();
                device = et.getText().toString();
                myList.add(device);
                adapter.add(device);
                et.setText("");
                break;
            case R.id.exit:
                finish();
                break;
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_menu_drawer, menu);
        return true;
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);

        if (position == 0) {
            Intent intent = new Intent(this, Karta1.class);
            startActivity(intent);
        } else if (position == 1) {
            Intent intent = new Intent(this, MainMenu.class);
            startActivity(intent);
        } else if (position == 2) {
            Intent intent = new Intent(this, MainMenu.class);
            startActivity(intent);
        }
    }
}