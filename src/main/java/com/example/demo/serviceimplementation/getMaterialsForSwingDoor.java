package com.example.demo.serviceimplementation;

import java.util.ArrayList;
import java.util.List;

public class getMaterialsForSwingDoor {
    public static List<Material> getMaterialsForSwingDoor(String DOOR_TYPE,
                                                          float DOOR_THICKNESS,
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
                                                          float EXTERNAL_SHEET_THICKNESS,
                                                          doorPorthole doorPorthole,
                                                          int DOOR_HUGE,
                                                          String DOOR_CLOSER) {

        final String DOOR_NAME = "Swing Door";


        List<Material> materialArrayList = new ArrayList<>();




        // get material which depend on internal sheet info
        materialArrayList.addAll(getInternalSheetMaterials.getInternalSheetMaterials(DOOR_LENGTH, DOOR_WIDTH, INTERNAL_SHEET_THICKNESS, INTERNAL_SHEET_TYPE, INTERNAL_SHEET_COLOR_CODE));

        // get material which depend on EXTERNAL sheet info
        materialArrayList.addAll(getExternalSheetMaterials.getExternalSheetMaterials(DOOR_LENGTH, DOOR_WIDTH, INTERNAL_SHEET_THICKNESS, INTERNAL_SHEET_TYPE, INTERNAL_SHEET_COLOR_CODE));

        //  get frame data
        materialArrayList.addAll(getFrameMaterials.getFrameMaterials(DOOR_LENGTH, DOOR_WIDTH, FRAME_TYPE, FRAME_MOUNTING_TYPE, FRAME_THICKNESS));

        return materialArrayList;
    }

}
