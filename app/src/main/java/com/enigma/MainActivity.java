package com.enigma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableRow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInputPad();
    }

    private void initInputPad() {


        List<String> list = new ArrayList<>();

        for(int i = 0;i<26;i++){
            list.add((char) (i+65) + "");
        }

        Collections.shuffle(list);

        TableRow row = findViewById(R.id.inputButtons);
        for(int i=0;i<10;i++) {
            Button button = new Button(this);
            button.setText(list.get(i));
            button.setLayoutParams(new TableRow.LayoutParams(130, ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setGravity(Gravity.CENTER);

            row.addView(button);
        }

        row = findViewById(R.id.inputButtons1);
        for(int i=10;i<19;i++) {
            Button button = new Button(this);
            button.setText(list.get(i));
            button.setLayoutParams(new TableRow.LayoutParams(130,ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setGravity(Gravity.CENTER);

            row.addView(button);
        }

        row = findViewById(R.id.inputButtons2);
        for(int i=19;i<26;i++) {
            Button button = new Button(this);
            button.setText(list.get(i));
            button.setLayoutParams(new TableRow.LayoutParams(130,ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setGravity(Gravity.CENTER);

            row.addView(button);
        }
    }

    private void initOutPad() {


        List<String> list = new ArrayList<>();

        for(int i = 0;i<26;i++){
            list.add((char) (i+65) + "");
        }

        Collections.shuffle(list);

        TableRow row = findViewById(R.id.outputButtons);
        for(int i=0;i<10;i++) {
            Button button = new Button(this);
            button.setText(list.get(i));
            button.setLayoutParams(new TableRow.LayoutParams(130, ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setGravity(Gravity.CENTER);

            row.addView(button);
        }

        row = findViewById(R.id.outputButtons1);
        for(int i=10;i<19;i++) {
            Button button = new Button(this);
            button.setText(list.get(i));
            button.setLayoutParams(new TableRow.LayoutParams(130,ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setGravity(Gravity.CENTER);

            row.addView(button);
        }

        row = findViewById(R.id.outputButtons2);
        for(int i=19;i<26;i++) {
            Button button = new Button(this);
            button.setText(list.get(i));
            button.setLayoutParams(new TableRow.LayoutParams(130,ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setGravity(Gravity.CENTER);

            row.addView(button);
        }
    }
}
