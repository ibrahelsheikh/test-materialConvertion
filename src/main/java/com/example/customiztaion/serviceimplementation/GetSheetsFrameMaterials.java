package com.example.customiztaion.serviceimplementation;

import com.example.customiztaion.enums.DoorName;
import com.example.customiztaion.enums.FrameMountingType;
import com.example.customiztaion.enums.FrameType;

import java.util.ArrayList;
import java.util.List;

public class GetSheetsFrameMaterials {

    public static List<Material> getSheetsFrameMaterials(Parameters parameters) {

        List<Material> materialArrayList = new ArrayList<>();

        materialArrayList.addAll(getInternalSheetMaterials(parameters));
        materialArrayList.addAll(getExternalSheetMaterials(parameters));
        materialArrayList.addAll(getFrameMaterials(parameters));

        return materialArrayList;

    }


    private static List<Material> getInternalSheetMaterials(Parameters parameters) {
        List<Material> materialArrayList = new ArrayList<>();

        return materialArrayList;
    }

    private static List<Material> getExternalSheetMaterials(Parameters parameters) {
        List<Material> materialArrayList = new ArrayList<>();

        return materialArrayList;
    }


    private static List<Material> getFrameMaterials(Parameters parameters) {
        List<Material> materialArrayList = new ArrayList<>();

        // Hinged Door - PVC - Surface Mounted
        if (parameters.DOOR_NAME == DoorName.HINGED_DOOR &&
                parameters.FRAME_TYPE == FrameType.PVC &&
                parameters.FRAME_MOUNTING_TYPE == FrameMountingType.SURFACE_MOUNTED) {

            if (parameters.FRAME_NUMBER_OF_EDGES == 3) {

                double quantity = GetThreeEdgesFrameQuantity(parameters, 14);

                materialArrayList.add(new Material("SP027", quantity));

            } else if (parameters.FRAME_NUMBER_OF_EDGES == 4) {

                double quantity = GetFourEdgesFrameQuantity(parameters, 14);

                materialArrayList.add(new Material("SP027", quantity));
            }
        }

        // Sliding Door - PVC - Surface Mounted
        if (parameters.DOOR_NAME == DoorName.SLIDING_DOOR &&
                parameters.FRAME_TYPE == FrameType.PVC &&
                parameters.FRAME_MOUNTING_TYPE == FrameMountingType.SURFACE_MOUNTED) {

            if (parameters.FRAME_NUMBER_OF_EDGES == 3) {

                double quantity = GetThreeEdgesFrameQuantity(parameters, 14);

                materialArrayList.add(new Material("SP027", quantity));

            } else if (parameters.FRAME_NUMBER_OF_EDGES == 4) {

                double quantity = GetFourEdgesFrameQuantity(parameters, 14);

                materialArrayList.add(new Material("SP027", quantity));

            }
        }

        // Sliding Door - PVC - Full
        if (parameters.DOOR_NAME == DoorName.SLIDING_DOOR &&
                parameters.FRAME_TYPE == FrameType.PVC &&
                parameters.FRAME_MOUNTING_TYPE == FrameMountingType.FULL &&
                parameters.FRAME_THICKNESS == 10) {

            if (parameters.FRAME_NUMBER_OF_EDGES == 3) {

                double front = GetThreeEdgesFrameQuantity(parameters, 14);
                double back = GetThreeEdgesFrameQuantity(parameters, 14);
                double middle = GetThreeEdgesFrameQuantity(parameters, 14);

                materialArrayList.add(new Material("", front));
                materialArrayList.add(new Material("", back));
                materialArrayList.add(new Material("", middle));

            } else if (parameters.FRAME_NUMBER_OF_EDGES == 4) {

                double quantity = GetFourEdgesFrameQuantity(parameters, 14);
                materialArrayList.add(new Material("SP026", quantity));
            }
        }

        return materialArrayList;
    }


    public static double GetThreeEdgesFrameQuantity(Parameters parameters, double offset) {

        return ((parameters.DOOR_LENGTH + offset) * 2)
                + (parameters.DOOR_WIDTH + offset * 2);
    }

    public static double GetFourEdgesFrameQuantity(Parameters parameters, double offset) {

        return ((parameters.DOOR_LENGTH + offset * 2) * 2)
                + ((parameters.DOOR_WIDTH + offset * 2) * 2);
    }


}
