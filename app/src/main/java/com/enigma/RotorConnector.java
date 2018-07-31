package com.enigma;

import android.view.View;
import android.widget.TextView;

public class RotorConnector extends Connector {

    String rotorValues;
    String rotorCopy,baseRotorCopy;
    char mark;
    View view;

    public RotorConnector(Connector next, Connector prev, String rotorValues, char mark,View view) {
        super(next, prev);
        this.rotorValues = rotorValues;
        this.rotorCopy = rotorValues;
        this.baseRotorCopy=baseRotor;
        this.mark = mark;
        if(view!=null) {
            this.view = view;
            ((TextView) view).setText(baseRotor.charAt(0) + "");
        }
    }

    @Override
    public void connect(Boolean direction, Object obj) {

        if(direction) {
            //rotate();
            int index = prev.baseRotor.indexOf((String) obj);
            /*int charVal = ((String) obj).charAt(0);
            int i = charVal - 65;*/
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
        ((TextView)view).setText(baseRotor.charAt(0)+"");
    }

    public void rotateUp(){
        rotorValues = rotorValues.charAt(rotorValues.length()-1) + rotorValues.substring(0, rotorValues.length()-1);
        baseRotor = baseRotor.charAt(baseRotor.length()-1) + baseRotor.substring(0, baseRotor.length()-1);
        ((TextView)view).setText(baseRotor.charAt(0)+"");
    }

    public void reset(){
        rotorValues = rotorCopy;
        baseRotor=baseRotorCopy;
        ((TextView)view).setText(baseRotor.charAt(0)+"");
    }

}
