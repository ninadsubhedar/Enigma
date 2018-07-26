package com.enigma;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;

public class OutputConnector extends Connector {

    private View[] view;
    private static int prevI;

    public OutputConnector() {
        super(null, null);
        view = new View[26];
    }

    @Override
    public void connect(Boolean direction, Object obj) {
        //super.connect(direction, obj);
        int charVal = ((String) obj).charAt(0);
        int i = charVal - 65;
        view[i].setBackgroundColor(Color.rgb(0,100,0));
        view[prevI].setBackgroundColor(Color.rgb(200,200 ,200));
        prevI=i;
    }

    public void setView(View v) {

        int i = ((Button) v).getText().toString().charAt(0) - 65;
        view[i] = v;


    }
}
