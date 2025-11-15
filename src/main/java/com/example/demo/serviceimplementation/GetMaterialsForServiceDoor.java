package com.example.demo.serviceimplementation;

import com.example.demo.enums.DoorDirection;
import com.example.demo.enums.DoorName;
import com.example.demo.enums.DoorType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GetMaterialsForServiceDoor {

    public static List<Material> getMaterialsForServiceDoor(Parameters parameters) {

        parameters.DOOR_NAME = DoorName.SERVICE_DOOR;

        List<Material> materialArrayList = new ArrayList<>();

        // get material which depend on DOOR_TYPE & DOOR_TYPE can be single or double
        if (parameters.DOOR_TYPE== DoorType.SINGLE){
            materialArrayList.add(new Material("00000000 00000", 10));   // single
        } else {
            materialArrayList.add(new Material("00000000 00000", 12));    // double
        }

        // get material which depend on DOOR_DIRECTION and DOOR_DIRECTION is right or left
        materialArrayList.add(new Material("00000000 00000", 0));   // right

        // get material which depend on porthole info


        // get




        // get material which depend on DOOR_HUGE and DOOR_HUGE is number
        materialArrayList.add(new Material("14INO002 P0002", parameters.DOOR_HUGE));

        // get material which fixed for any options

        // added fixed material to materialList
        materialArrayList.addAll(MaterialConversionIdifServiceDoorFixedMaterialList.materialConversionIdifServiceDoorFixedMaterialList(parameters));

        // get material which depend on internal sheet info and external sheet info and frame info
        materialArrayList.addAll(GetSheetsFrameMaterials.getSheetsFrameMaterials(parameters));

        return materialArrayList;
    }


    public static List<Material> getFrameMaterialsForServiceDoor() {

        return new ArrayList<>();
    }

}
