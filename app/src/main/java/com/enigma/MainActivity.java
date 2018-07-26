package com.enigma;

import android.graphics.Color;
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

    OutputConnector outputConnector;
    ReflectorConnector reflector;
    RotorConnector rotor1, rotor2,rotor3;
    InputConnector inputConnector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputConnector = new OutputConnector();
        reflector = new ReflectorConnector(null,"YRUHQSLDPXNGOKMIEBFZCWVJAT");
        rotor1 = new RotorConnector(null,outputConnector,"BDFHJLCPRTXVZNYEIWGAKMUSQO",'V');
        rotor2 = new RotorConnector(null,rotor1,"AJDKSIRUXBLHWTMCQGZNPYFVOE",'E');
        rotor3 = new RotorConnector(reflector,rotor2,"EKMFLGDQVZNTOWYHXUSPAIBRCJ",'Q');
        reflector.setNext(rotor3);
        rotor2.setNext(rotor3);
        rotor1.setNext(rotor2);

        initOutputPad();
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
            inputConnector = new InputConnector(rotor1);
            button.setOnClickListener(inputConnector);
            row.addView(button);
        }

        row = findViewById(R.id.inputButtons1);
        for(int i=10;i<19;i++) {
            Button button = new Button(this);
            button.setText(list.get(i));
            button.setLayoutParams(new TableRow.LayoutParams(130,ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setGravity(Gravity.CENTER);
            inputConnector = new InputConnector(rotor1);
            button.setOnClickListener(inputConnector);
            row.addView(button);
        }

        row = findViewById(R.id.inputButtons2);
        for(int i=19;i<26;i++) {
            Button button = new Button(this);
            button.setText(list.get(i));
            button.setLayoutParams(new TableRow.LayoutParams(130,ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setGravity(Gravity.CENTER);
            inputConnector = new InputConnector(rotor1);
            button.setOnClickListener(inputConnector);
            row.addView(button);
        }
    }

    private void initOutputPad() {

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
            button.setBackgroundColor(Color.rgb(200,200 ,200));
            row.addView(button);
            outputConnector.setView(button);
        }

        row = findViewById(R.id.outputButtons1);
        for(int i=10;i<19;i++) {
            Button button = new Button(this);
            button.setText(list.get(i));
            button.setLayoutParams(new TableRow.LayoutParams(130,ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setGravity(Gravity.CENTER);
            button.setBackgroundColor(Color.rgb(200,200 ,200));
            row.addView(button);
            outputConnector.setView(button);
        }

        row = findViewById(R.id.outputButtons2);
        for(int i=19;i<26;i++) {
            Button button = new Button(this);
            button.setText(list.get(i));
            button.setLayoutParams(new TableRow.LayoutParams(130,ViewGroup.LayoutParams.WRAP_CONTENT));
            button.setGravity(Gravity.CENTER);
            button.setBackgroundColor(Color.rgb(200,200 ,200));
            row.addView(button);
            outputConnector.setView(button);
        }
    }
}
