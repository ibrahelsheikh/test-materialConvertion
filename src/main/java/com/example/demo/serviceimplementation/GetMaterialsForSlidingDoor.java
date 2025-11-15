package com.example.demo.serviceimplementation;

import com.example.demo.enums.DoorName;

import java.util.ArrayList;
import java.util.List;

public class GetMaterialsForSlidingDoor {
    public static List<Material> getMaterialsForSlidingDoor(Parameters parameters) {

        parameters.DOOR_NAME = DoorName.SLIDING_DOOR;

        List<Material> materialArrayList = new ArrayList<>();




        // get material which depend on internal sheet info and external sheet info and frame info
        materialArrayList.addAll(GetSheetsFrameMaterials.getSheetsFrameMaterials(parameters));


        return materialArrayList;

    }


    }
