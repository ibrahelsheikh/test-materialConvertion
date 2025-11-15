package com.example.demo.serviceimplementation;

import com.example.demo.enums.DoorDirection;
import com.example.demo.enums.DoorName;
import com.example.demo.enums.DoorType;
import com.example.demo.enums.PortholeShape;

import java.util.ArrayList;
import java.util.List;

public class GetMaterialsForHingedDoor {
    public static List<Material> getMaterialsForHingedDoor(Parameters parameters) {

        parameters.DOOR_NAME = DoorName.HINGED_DOOR;

        List<Material> materialArrayList = new ArrayList<>();

        // Check if huge door number is valid
        if (parameters.DOOR_TYPE == DoorType.SINGLE) { // single door
            if (parameters.DOOR_HUGE >= 2) {
                System.out.println("Door number is invalid for single door; it should be more than 2.");
            }
        } else { // double door
            if (parameters.DOOR_HUGE >= 4) {
                System.out.println("Door number is invalid for double door; it should be more than 4.");
            }
        }

        // get material which depend on DOOR_TYPE & DOOR_TYPE can be single or double


        // get material which depend on DOOR_DIRECTION and DOOR_DIRECTION is right or left


        // get material which depend on porthole info
        if (parameters.doorPorthole.existPorthole) {
            int portHoleGasketLength;
            if ( parameters.doorPorthole.portholeShape == PortholeShape.CIRCULAR) {
                // single door && porthole exist
                portHoleGasketLength = 1;

            } else {
                portHoleGasketLength = 2;
            }

            switch ((int) parameters.DOOR_THICKNESS) {
                case 68:
                    materialArrayList.add(new Material("11OBM200  11039", portHoleGasketLength));
                    materialArrayList.add(new Material("11OBM068  11033", portHoleGasketLength));
                    break;

                case 92:
                    materialArrayList.add(new Material("11OBM092  11035", portHoleGasketLength));
                    break;

                case 121:
                    break;

                case 151:
                    break;
            }

        }


        // get material which depend on DOOR_CLOSER and DOOR_CLOSER is existed or not
        if (parameters.DOOR_CLOSER.equals("Exist")) {
            materialArrayList.add(new Material("00000000 00000", 1));  // Door closer for hinged door
        }


        // get material which depend on DOOR_HUGE and DOOR_HUGE is number
        materialArrayList.add(new Material("14INO002 P0002", (int) parameters.DOOR_HUGE));


        // added fixed material to materialList
        materialArrayList.addAll(MaterialConversionIdifServiceDoorFixedMaterialList.materialConversionIdifServiceDoorFixedMaterialList(parameters));

        // get material which depend on internal sheet info and external sheet info and frame info
        materialArrayList.addAll(GetSheetsFrameMaterials.getSheetsFrameMaterials(parameters));

        return materialArrayList;
    }

}
