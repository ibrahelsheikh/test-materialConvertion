package com.example.customiztaion.serviceimplementation;

public class MaterialConversionCalculateMaterialQuantityForHingedDoor {

    // DOOR_LENGTH and DOOR_WIDTH are in cm

    public static double materialConversionCalculateMaterialHisCode_30BIA002_11041(double DOOR_LENGTH, double DOOR_WIDTH) {

        return DOOR_LENGTH * 2 + DOOR_WIDTH *2;

    }

    public static float materialConversionCalculateMaterialHisCode_18PCO005_00000(float DOOR_LENGTH, float DOOR_WIDTH) {

        return DOOR_LENGTH * 2 + DOOR_WIDTH *2 + 30;

    }

    public static float materialConversionCalculateMaterialHisCode_11PLG001_11014(float DOOR_LENGTH, float DOOR_WIDTH , int NUMBER_OF_SIDES) {
        float quantity ;
        if (NUMBER_OF_SIDES == 4) {
            quantity = DOOR_LENGTH * 2 + DOOR_WIDTH *2 +30;
        } else {
            quantity = DOOR_LENGTH * 2 + DOOR_WIDTH +30;
        }

        return quantity;
    }

    public static float materialConversionCalculateMaterialHisCode_11INF030_11021(float DOOR_LENGTH, float DOOR_WIDTH) {

        return DOOR_WIDTH +10;

    }

    public static float materialConversionCalculateMaterialHisCode_11INF020_11022(float DOOR_LENGTH, float DOOR_WIDTH) {

        return DOOR_WIDTH +10;

    }

}
