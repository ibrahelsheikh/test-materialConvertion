package com.example.demo.serviceimplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class getMaterialsForServiceDoor {

    public static List<Material> getMaterialsForServiceDoor(String DOOR_TYPE,
                                                            float DOOR_THICKNESS,
                                                            float DOOR_LENGTH,
                                                            float DOOR_WIDTH,
                                                            String DOOR_DIRECTION,
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

        final String DOOR_NAME = "Service Door";

        List<Material> materialArrayList = new ArrayList<>();

        // get material which depend on DOOR_TYPE & DOOR_TYPE can be single or double
        if (Objects.equals(DOOR_TYPE, "single")) {
            materialArrayList.add(new Material("00000000 00000", 10));   // single
        } else {
            materialArrayList.add(new Material("00000000 00000", 12));    // double
        }

        // get material which depend on DOOR_DIRECTION and DOOR_DIRECTION is right or left
        if (Objects.equals(DOOR_DIRECTION, "right")) {
            materialArrayList.add(new Material("00000000 00000", 0));   // right
        } else {
            materialArrayList.add(new Material("00000000 00000", 0));
        }

        // get material which depend on frame info
        materialArrayList.addAll(getFrameMaterialsForServiceDoor());

        // get material which depend on porthole info


        // get




        // get material which depend on DOOR_HUGE and DOOR_HUGE is number
        materialArrayList.add(new Material("14INO002 P0002", DOOR_HUGE));

        // get material which fixed for any options

        // added fixed material to materialList
        materialArrayList.addAll(materialConversionIdifServiceDoorFixedMaterialList.materialConversionIdifServiceDoorFixedMaterialList(DOOR_NAME, DOOR_LENGTH, DOOR_WIDTH));

        // get material which depend on internal sheet info
        materialArrayList.addAll(getInternalSheetMaterials.getInternalSheetMaterials(DOOR_LENGTH, DOOR_WIDTH, INTERNAL_SHEET_THICKNESS, INTERNAL_SHEET_TYPE, INTERNAL_SHEET_COLOR_CODE));

        // get material which depend on EXTERNAL sheet info
        materialArrayList.addAll(getExternalSheetMaterials.getExternalSheetMaterials(DOOR_LENGTH, DOOR_WIDTH, INTERNAL_SHEET_THICKNESS, INTERNAL_SHEET_TYPE, INTERNAL_SHEET_COLOR_CODE));

        //  get frame data
        materialArrayList.addAll(getFrameMaterials.getFrameMaterials(DOOR_LENGTH, DOOR_WIDTH, FRAME_TYPE, FRAME_MOUNTING_TYPE, FRAME_THICKNESS));


        return materialArrayList;
    }


    public static List<Material> getFrameMaterialsForServiceDoor() {

        return new ArrayList<>();
    }

}
