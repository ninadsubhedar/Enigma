package com.enigma;

import android.view.View;
import android.widget.Button;

public class InputConnector extends Connector implements View.OnClickListener {

    InputConnector(Connector next) {
        super(next, null);
    }

    @Override
    public void onClick(View view) {

        Button b = (Button)view;
        rotate(true);
        connect(true,b.getText().toString());
    }

    @Override
    public void rotate(Boolean rotate) {
        next.rotate(rotate);
    }
}
