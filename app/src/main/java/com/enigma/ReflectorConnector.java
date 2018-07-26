package com.enigma;

public class ReflectorConnector extends RotorConnector {

    public ReflectorConnector(Connector next, String rotorValues) {
        super(next, next, rotorValues, 'A');
    }

    @Override
    public void connect(Boolean direction, Object obj) {

        int index = next.baseRotor.indexOf((String)obj);
        String c = this.baseRotor.charAt(index)+"";
        int index1 = rotorValues.indexOf(c);
        obj = next.baseRotor.charAt(index1)+"";

        /*int charVal = ((String) obj).charAt(0);
        int i = charVal - 65;
        obj = rotorValues.charAt(i);*/
        next.connect(!direction,obj);
    }

    @Override
    public void rotate(Boolean rotate) {
        //do nothing
    }
}