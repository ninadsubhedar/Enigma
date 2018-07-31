package com.enigma;

import android.view.View;
import android.widget.TextView;

public class RotorConnector extends Connector {

    String rotorValues;
    private String rotorCopy,baseRotorCopy;
    private char mark;
    View view;

    RotorConnector(Connector next, Connector prev, String rotorValues, char mark,View view) {
        super(next, prev);
        this.rotorValues = rotorValues;
        this.rotorCopy = rotorValues;
        this.baseRotorCopy=baseRotor;
        this.mark = mark;
        if(view!=null) {
            this.view = view;
            ((TextView) view).setText(String.format("%c",baseRotor.charAt(0)));
        }
    }

    @Override
    public void connect(Boolean direction, Object obj) {

        if(direction) {
            int index = prev.baseRotor.indexOf((String) obj);
            obj = rotorValues.charAt(index)+"";
        }
        else{
            int i = rotorValues.indexOf(((String) obj));
            obj = prev.baseRotor.charAt(i)+"";
        }
        super.connect(direction, obj);
    }

    @Override
    public void rotate(Boolean rotate){
        if(rotate) {
            rotateDown();
        }
        if(mark == baseRotor.charAt(baseRotor.length()-1)){
            next.rotate(true);
        }

    }

    public void rotateDown(){
        rotorValues = rotorValues.substring(1, rotorValues.length()) + rotorValues.charAt(0);
        baseRotor = baseRotor.substring(1, baseRotor.length()) + baseRotor.charAt(0);
        ((TextView)view).setText(String.format("%c",baseRotor.charAt(0)));
    }

    public void rotateUp(){
        rotorValues = rotorValues.charAt(rotorValues.length()-1) + rotorValues.substring(0, rotorValues.length()-1);
        baseRotor = baseRotor.charAt(baseRotor.length()-1) + baseRotor.substring(0, baseRotor.length()-1);
        ((TextView)view).setText(String.format("%c",baseRotor.charAt(0)));
    }

    public void reset(){
        rotorValues = rotorCopy;
        baseRotor=baseRotorCopy;
        ((TextView)view).setText(String.format("%c",baseRotor.charAt(0)));
    }

}
