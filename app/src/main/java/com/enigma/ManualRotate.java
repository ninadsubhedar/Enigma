package com.enigma;

import android.view.View;
import android.widget.TextView;

public class ManualRotate implements View.OnClickListener {

    Boolean dir; // down = true and up = false
    RotorConnector rotor;

    public ManualRotate(Boolean dir,RotorConnector rotor) {
        this.dir = dir;
        this.rotor = rotor;
    }

    @Override
    public void onClick(View view) {

        if(dir){
            rotor.rotateDown();
        }
        else{
            rotor.rotateUp();
        }


    }
}
