package com.enigma;

public abstract class Connector {

    protected Connector next;
    protected Connector prev;

    protected String baseRotor = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Connector(Connector next, Connector prev) {
        this.next = next;
        this.prev = prev;
    }

    public void connect(Boolean direction, Object obj){
        if(direction){
            next.connect(direction,obj);
        }
        else{
            prev.connect(direction,obj);
        }

    };

    public void rotate(Boolean rotate){
        //Do Nothing by default
    }

    public void setNext(Connector next) {
        this.next = next;
    }

    public void setPrev(Connector prev) {
        this.prev = prev;
    }

}
