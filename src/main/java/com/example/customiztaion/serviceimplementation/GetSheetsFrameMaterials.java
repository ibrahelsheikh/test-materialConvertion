package com.example.customiztaion.serviceimplementation;

import com.example.customiztaion.enums.AccessoryType;
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


        if (parameters.FRAME_TYPE == FrameType.PVC) {

            if (parameters.FRAME_MOUNTING_TYPE == FrameMountingType.SURFACE_MOUNTED) {

                if (parameters.DOOR_NAME == DoorName.HINGED_DOOR || parameters.DOOR_NAME == DoorName.SLIDING_DOOR) {

                    if (parameters.FRAME_NUMBER_OF_EDGES == 3) {

                        double Quantity = 0;

                        Quantity =
                                ((parameters.DOOR_LENGTH + 14) * 2)
                                        + (parameters.DOOR_WIDTH + 28);

                        materialArrayList.add(new Material("SP027", Quantity));

                    }

                    if (parameters.FRAME_NUMBER_OF_EDGES == 4) {
                        double Quantity = 0;

                        Quantity =
                                ((parameters.DOOR_LENGTH + 28) * 2)
                                        + ((parameters.DOOR_WIDTH + 28) * 2);

                        materialArrayList.add(new Material("SP027", Quantity));
                    }

                }

            }


            if (parameters.FRAME_MOUNTING_TYPE == FrameMountingType.FULL) {

                if (parameters.DOOR_NAME == DoorName.HINGED_DOOR) {

                    if (parameters.FRAME_THICKNESS == 10) {

                        if (parameters.IS_FRAME_MTH_OR_IDIF == AccessoryType.IDIF) {

                            if (parameters.FRAME_NUMBER_OF_EDGES == 3) {
                                double Quantity = 0;

                                Quantity =
                                        ((parameters.DOOR_LENGTH + 10) * 2)
                                                + (parameters.DOOR_WIDTH + 20);

                                materialArrayList.add(new Material("SP043", Quantity));

                                Quantity =
                                        ((parameters.DOOR_LENGTH + 7) * 2)
                                                + (parameters.DOOR_WIDTH + 14);

                                materialArrayList.add(new Material("SP024", Quantity));

                            }

                            if (parameters.FRAME_NUMBER_OF_EDGES == 4) {
                                double Quantity = 0;

                                // Front frame SP043
                                Quantity = 2 * (parameters.DOOR_LENGTH + 20) + 2 * (parameters.DOOR_WIDTH + 20);
                                materialArrayList.add(new Material("SP043", Quantity));

                                // Back frame SP024
                                Quantity = 2 * (parameters.DOOR_LENGTH + 14) + 2 * (parameters.DOOR_WIDTH + 14);
                                materialArrayList.add(new Material("SP024", Quantity));
                            }

                        }

                        if (parameters.IS_FRAME_MTH_OR_IDIF == AccessoryType.MTH) {

// For 3-sided frame
                            if (parameters.FRAME_NUMBER_OF_EDGES == 3) {

                                // Front section
                                double quantityFront = (parameters.DOOR_LENGTH + 10) * 2 + parameters.DOOR_WIDTH + 20;
                                materialArrayList.add(new Material("SP018", quantityFront));

                                // Back section
                                double quantityBack = (parameters.DOOR_LENGTH + 7) * 2 + parameters.DOOR_WIDTH + 14;
                                materialArrayList.add(new Material("SP024", quantityBack));

                                // Middle section
                                double quantityMiddle = (parameters.DOOR_LENGTH + 4) * 2 + parameters.DOOR_WIDTH + 8;
                                materialArrayList.add(new Material("SP019", quantityMiddle));
                            }

// For 4-sided frame
                            if (parameters.FRAME_NUMBER_OF_EDGES == 4) {

                                // Front section
                                double quantityFront = (parameters.DOOR_LENGTH + 20) * 2 + (parameters.DOOR_WIDTH + 20) * 2;
                                materialArrayList.add(new Material("SP018", quantityFront));

                                // Back section
                                double quantityBack = (parameters.DOOR_LENGTH + 14) * 2 + (parameters.DOOR_WIDTH + 14) * 2;
                                materialArrayList.add(new Material("SP024", quantityBack));

                                // Middle section
                                double quantityMiddle = (parameters.DOOR_LENGTH + 8) * 2 + (parameters.DOOR_WIDTH + 8) * 2;
                                materialArrayList.add(new Material("SP019", quantityMiddle));
                            }


                        }


                    }
                }

            }


        }


        return materialArrayList;
    }
}
