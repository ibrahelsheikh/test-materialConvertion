// File: src/main/java/com/example/customiztaion/serviceimplementation/main.java
package com.example.customiztaion.serviceimplementation;

public class main {
    public static void main(String[] args) {
        Parameters params = new Parameters();

        // numeric and string fields
        params.DOOR_THICKNESS = 45.0;
        params.DOOR_LENGTH = 2100.0;
        params.DOOR_WIDTH = 900.0;
        params.DOOR_QUANTITY = 2;
        params.PRICE = 1250.50;

        params.INTERNAL_SHEET_TYPE = null; // set enum values when known, e.g. SheetType.STEEL
        params.INTERNAL_SHEET_COLOR_CODE = "RAL9003";
        params.INTERNAL_SHEET_THICKNESS = 0.8;

        params.EXTERNAL_SHEET_TYPE = null;
        params.EXTERNAL_SHEET_COLOR_CODE = "RAL7016";
        params.EXTERNAL_SHEET_THICKNESS = 1.0;

        params.PORTHOLE_IS_EXIST = true;
        params.DOOR_CLOSER_EXIST = false;

        params.BUMPER_IS_EXIST = true;
        params.BUMPER_NUMBER = 2;
        params.BUMPER_SIZE = 60.0;

        params.LATCH_NUMBER = 3;

        System.out.println(GetMaterialsForHingedDoor.getMaterialsForHingedDoor(params));

    }
}
