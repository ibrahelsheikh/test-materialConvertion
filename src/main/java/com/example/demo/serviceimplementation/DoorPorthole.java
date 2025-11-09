package com.example.demo.serviceimplementation;

public class DoorPorthole {
    boolean existPorthole;
    PortholeShape portholeShape;       // can be Oval or Circular

    public enum PortholeShape {
        CIRCULAR, OVAL
    }
}
