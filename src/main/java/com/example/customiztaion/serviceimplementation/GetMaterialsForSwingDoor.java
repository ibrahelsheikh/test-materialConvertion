package com.example.customiztaion.serviceimplementation;

import com.example.customiztaion.enums.DoorName;

import java.util.ArrayList;
import java.util.List;

public class GetMaterialsForSwingDoor {
    public static List<Material> getMaterialsForSwingDoor(Parameters parameters) {

        parameters.DOOR_NAME = DoorName.SWING_DOOR;

        List<Material> materialArrayList = new ArrayList<>();





        // get material which depend on internal sheet info and external sheet info and frame info
        materialArrayList.addAll(GetSheetsFrameMaterials.getSheetsFrameMaterials(parameters));

        return materialArrayList;
    }

}
