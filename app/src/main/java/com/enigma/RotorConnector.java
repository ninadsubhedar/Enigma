package com.enigma;

public class RotorConnector extends Connector {

    String rotorValues;// = "OUSQOBDFHJLPRTXVZNYEIWGAK";
    char mark;

    public RotorConnector(Connector next, Connector prev, String rotorValues, char mark) {
        super(next, prev);
        this.rotorValues = rotorValues;
        this.mark = mark;
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
            rotorValues = rotorValues.substring(1, rotorValues.length()) + rotorValues.charAt(0);
            baseRotor = baseRotor.substring(1, baseRotor.length()) + baseRotor.charAt(0);
        }
        if(mark == rotorValues.charAt(0)){
            next.rotate(true);
        }

    }

}
