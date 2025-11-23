package com.example.customiztaion.serviceimplementation;

import com.example.customiztaion.enums.DoorName;
import com.example.customiztaion.enums.DoorType;
import com.example.customiztaion.enums.PortholeShape;

import java.util.ArrayList;
import java.util.List;

public class GetMaterialsForHingedDoor {
    public static List<Material> getMaterialsForHingedDoor(Parameters parameters) {

        // set door name
        parameters.DOOR_NAME = DoorName.HINGED_DOOR;

        List<Material> materialArrayList = new ArrayList<>();

        // Check if huge door number is valid





        if (parameters.DOOR_TYPE == DoorType.SINGLE) { // single door
            if (parameters.DOOR_HUGE < 2) {
                System.out.println("Door number is invalid for single door; it should be more than 2.");
            }
        } else if (parameters.DOOR_TYPE == DoorType.DOUBLE) { // double door
            if (parameters.DOOR_HUGE < 4) {
                System.out.println("Door number is invalid for double door; it should be more than 4.");
            }
        }

        // get material which depend on DOOR_TYPE & DOOR_TYPE can be single or double


        // get material which depend on DOOR_DIRECTION and DOOR_DIRECTION is right or left


        // get material which depend on porthole info



        if (parameters.PORTHOLE_IS_EXIST) {
            int portHoleGasketLength;
            if ( parameters.PORTHOLE_SHAPE == PortholeShape.CIRCULAR) {
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
        if (parameters.DOOR_CLOSER_EXIST) {
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


    //TODO: need equations for Aluminium profile materials

    public static List<Material> getAluminumProfileMaterials(Parameters parameters) {

        List<Material> materialArrayList = new ArrayList<>();

        switch ((int) parameters.DOOR_THICKNESS) {
            case 68:
                double aluminumLength = 0;
                aluminumLength = ((parameters.DOOR_LENGTH + 68*2) * 2) + ((parameters.DOOR_WIDTH + 68*2) * 2);
                materialArrayList.add(new Material("55952", 1));
                break;

            case 92:
                double aluminumLength92 = 0;
                aluminumLength92 = ((parameters.DOOR_LENGTH + 92*2) * 2) + ((parameters.DOOR_WIDTH + 92*2) * 2);
                materialArrayList.add(new Material("55962", 1));
                break;

            case 121:
                double aluminumLength121 = 0;
                aluminumLength121 = ((parameters.DOOR_LENGTH + 121*2) * 2) + ((parameters.DOOR_WIDTH + 121*2) * 2);
                materialArrayList.add(new Material("55963", 1));
                break;

            case 151:
                double aluminumLength151 = 0;
                aluminumLength151 = ((parameters.DOOR_LENGTH + 151*2) * 2) + ((parameters.DOOR_WIDTH + 151*2) * 2);
                materialArrayList.add(new Material("55972", 1));
                break;
        }

        return materialArrayList;
    }

}
