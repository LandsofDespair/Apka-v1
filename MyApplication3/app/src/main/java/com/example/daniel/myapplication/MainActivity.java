package com.example.daniel.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counterValue = 0;
    private TextView counterTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterTextView = (TextView)findViewById(R.id.counterTextView);
    }

    public void openDialog() {
        final Dialog dialog = new Dialog(context); // Context, this, etc.
        dialog.setContentView(R.layout.dialog_demo);
        dialog.setTitle(R.string.dialog_title);
        dialog.show();
    }

    public void PlusButtonClicked(View view) {
        if(counterValue==5)
            openDialog()
        else
        counterValue++;
        counterTextView.setText(String.valueOf(counterValue));
    }

    public void MinusButtonClicked(View view) {
        counterValue--;
        counterTextView.setText(String.valueOf(counterValue));
    }
}
