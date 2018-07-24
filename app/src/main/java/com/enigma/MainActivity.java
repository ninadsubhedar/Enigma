package com.enigma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout grid = findViewById(R.id.inputButtons);

        for(int i=0;i<10;i++) {
            Button button = new Button(this);
            button.setText("A");
            grid.addView(button);
        }
    }
}
