package com.example.demo.serviceimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class getMaterialsForHingedDoor {
    public static List<Material> getMaterialsForHingedDoor(String DOOR_TYPE,
                                                           int DOOR_THICKNESS,
                                                           float DOOR_LENGTH,
                                                           float DOOR_WIDTH,
                                                           boolean DOOR_DIRECTION,
                                                           String FRAME_TYPE,
                                                           String FRAME_MOUNTING_TYPE,
                                                           int FRAME_THICKNESS,
                                                           String INTERNAL_SHEET_TYPE,
                                                           String INTERNAL_SHEET_COLOR_CODE,
                                                           int INTERNAL_SHEET_THICKNESS,
                                                           String EXTERNAL_SHEET_TYPE,
                                                           String EXTERNAL_SHEET_COLOR_CODE,
                                                           int EXTERNAL_SHEET_THICKNESS,
                                                           doorPorthole doorPorthole,
                                                           int DOOR_HUGE,
                                                           String DOOR_CLOSER) {

        final String DOOR_NAME = "Hinged Door";

        List<Material> materialArrayList = new ArrayList<>();

        // Check if huge door number is valid
        if (Objects.equals(DOOR_TYPE , "single")) { // single door
            if (DOOR_HUGE >= 2) {
                System.out.println("Door number is invalid for single door; it should be more than 2.");
            }
        } else { // double door
            if (DOOR_HUGE >= 4) {
                System.out.println("Door number is invalid for double door; it should be more than 4.");
            }
        }

        // get material which depend on DOOR_TYPE & DOOR_TYPE can be single or double


        // get material which depend on DOOR_DIRECTION and DOOR_DIRECTION is right or left


        // get material which depend on porthole info
        if (doorPorthole.existPorthole) {
            int portHoleGasketLenghth;
            if (doorPorthole.portholeCheap.equals("Circular")) {
                // single door && porthole exist
                portHoleGasketLenghth = 1;

            } else {
                portHoleGasketLenghth = 2;
            }

            switch (DOOR_THICKNESS) {
                case 68:
                    materialArrayList.add(new Material("11OBM200  11039", portHoleGasketLenghth));
                    materialArrayList.add(new Material("11OBM068  11033", portHoleGasketLenghth));
                    break;

                case 92:
                    materialArrayList.add(new Material("11OBM092  11035", portHoleGasketLenghth));
                    break;

                case 121:
                    break;

                case 151:
                    break;
            }

        }


        // get material which depend on DOOR_CLOSER and DOOR_CLOSER is exist or not
        if (DOOR_CLOSER.equals("Exist")) {
            materialArrayList.add(new Material("00000000 00000", 1));  // Door closer for hinged door
        }


        // get material which depend on DOOR_HUGE and DOOR_HUGE is number
        materialArrayList.add(new Material("14INO002 P0002", DOOR_HUGE));


        // added fixed material to materialList
        materialArrayList.addAll(materialConversionIdifServiceDoorFixedMaterialList.materialConversionIdifServiceDoorFixedMaterialList(DOOR_NAME, DOOR_LENGTH, DOOR_WIDTH));

        // get material which depend on internal sheet info
        materialArrayList.addAll(getInternalSheetMaterials.getInternalSheetMaterials(DOOR_LENGTH, DOOR_WIDTH, INTERNAL_SHEET_THICKNESS, INTERNAL_SHEET_TYPE, INTERNAL_SHEET_COLOR_CODE));

        // get material which depend on EXTERNAL sheet info
        materialArrayList.addAll(getExternalSheetMaterials.getExternalSheetMaterials(DOOR_LENGTH, DOOR_WIDTH, EXTERNAL_SHEET_THICKNESS, EXTERNAL_SHEET_TYPE, EXTERNAL_SHEET_COLOR_CODE));

        //  get frame data
        materialArrayList.addAll(getFrameMaterials.getFrameMaterials(DOOR_LENGTH, DOOR_WIDTH, FRAME_TYPE, FRAME_MOUNTING_TYPE, FRAME_THICKNESS));


        return materialArrayList;
    }

}
