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



        // Hinged Door - PVC - Full - 10CM
        switch (parameters.ACCESSORY_TYPE) {
            case IDIF:

                if (parameters.DOOR_NAME == DoorName.HINGED_DOOR &&
                        parameters.FRAME_TYPE == FrameType.PVC &&
                        parameters.FRAME_MOUNTING_TYPE == FrameMountingType.FULL &&
                        parameters.FRAME_THICKNESS >= 10) {

                    if (parameters.FRAME_NUMBER_OF_EDGES == 3) {

                        double front = GetThreeEdgesFrameQuantity(parameters, 10);
                        double back = GetThreeEdgesFrameQuantity(parameters, 7);
                        double middle = GetThreeEdgesFrameQuantity(parameters, 4);

                        materialArrayList.add(new Material("SP043", front));
                        materialArrayList.add(new Material("SP024", back));

                        if (parameters.FRAME_THICKNESS> 10) {
                            int multiplier = 0;

                            if (parameters.FRAME_THICKNESS == 11 |  parameters.FRAME_THICKNESS == 12) {
                                multiplier = 1;

                                materialArrayList.add(new Material("SP012", middle));

                            } else if (parameters.FRAME_THICKNESS % 2 == 0 ) {

                                // even

                                multiplier = (int) (( parameters.FRAME_THICKNESS -10 ) /2);

                                materialArrayList.add(new Material("SP012", multiplier* middle));


                            } else if (parameters.FRAME_THICKNESS % 2 == 1 ) {

                                materialArrayList.add(new Material("SP110", middle));

                                // odd

                                multiplier = (int) (( parameters.FRAME_THICKNESS - 13 ) /2 );

                                materialArrayList.add(new Material("SP012", multiplier * middle));

                            }


                            double extraMiddle = GetThreeEdgesFrameQuantity(parameters, 2);
                            materialArrayList.add(new Material("SP012", extraMiddle));
                        }

                    }  else if (parameters.FRAME_NUMBER_OF_EDGES == 4) {


                        double front = GetFourEdgesFrameQuantity(parameters, 10);
                        double back = GetFourEdgesFrameQuantity(parameters, 7);
                        double middle = GetFourEdgesFrameQuantity(parameters, 4);

                        materialArrayList.add(new Material("SP063", front));
                        materialArrayList.add(new Material("SP014", back));
                        materialArrayList.add(new Material("SP012", middle));

                        if (parameters.FRAME_THICKNESS> 10) {
                            int multiplier = 0;

                            if (parameters.FRAME_THICKNESS == 11 |  parameters.FRAME_THICKNESS == 12) {
                                multiplier = 1;

                                materialArrayList.add(new Material("SP012", middle));

                            } else if (parameters.FRAME_THICKNESS % 2 == 0 ) {

                                // even

                                multiplier = (int) (( parameters.FRAME_THICKNESS -10 ) /2);

                                materialArrayList.add(new Material("SP012", multiplier* middle));


                            } else if (parameters.FRAME_THICKNESS % 2 == 1 ) {

                                materialArrayList.add(new Material("SP110", middle));

                                // odd

                                multiplier = (int) (( parameters.FRAME_THICKNESS - 13 ) /2 );

                                materialArrayList.add(new Material("SP012", multiplier * middle));

                            }


                            materialArrayList.add(new Material("SP012",middle ));
                        }
                    }
                }






                break;

            case MTH:

                // code block

                if (parameters.DOOR_NAME == DoorName.HINGED_DOOR &&
                        parameters.FRAME_TYPE == FrameType.PVC &&
                        parameters.FRAME_MOUNTING_TYPE == FrameMountingType.FULL &&
                        parameters.FRAME_THICKNESS >= 10) {

                    if (parameters.FRAME_NUMBER_OF_EDGES == 3) {

                        double front = GetThreeEdgesFrameQuantity(parameters, 10);
                        double back = GetThreeEdgesFrameQuantity(parameters, 7);
                        double middle = GetThreeEdgesFrameQuantity(parameters, 4);

                        materialArrayList.add(new Material("SP043", front));
                        materialArrayList.add(new Material("SP024", back));

                        if (parameters.FRAME_THICKNESS> 10) {
                            int multiplier = 0;

                            if (parameters.FRAME_THICKNESS == 11 ) {
                                multiplier = 1;

                                materialArrayList.add(new Material("SP012", middle));

                            } else if (parameters.FRAME_THICKNESS % 2 == 0 ) {

                                // even

                                multiplier = (int) (( parameters.FRAME_THICKNESS -10 ) /2);

                                materialArrayList.add(new Material("SP012", multiplier* middle));


                            } else if (parameters.FRAME_THICKNESS % 2 == 1 ) {

                                materialArrayList.add(new Material("SP110", middle));

                                // odd

                                multiplier = (int) (( parameters.FRAME_THICKNESS - 13 ) /2 );

                                materialArrayList.add(new Material("SP012", multiplier * middle));

                            }


                            double extraMiddle = GetThreeEdgesFrameQuantity(parameters, 2);
                            materialArrayList.add(new Material("SP012", extraMiddle));
                        }

                    }  else if (parameters.FRAME_NUMBER_OF_EDGES == 4) {


                        double front = GetFourEdgesFrameQuantity(parameters, 10);
                        double back = GetFourEdgesFrameQuantity(parameters, 7);
                        double middle = GetFourEdgesFrameQuantity(parameters, 4);

                        materialArrayList.add(new Material("SP063", front));
                        materialArrayList.add(new Material("SP014", back));
                        materialArrayList.add(new Material("SP012", middle));

                        if (parameters.FRAME_THICKNESS> 10) {
                            int multiplier = 0;

                            if (parameters.FRAME_THICKNESS == 11 ) {
                                multiplier = 1;

                                materialArrayList.add(new Material("SP012", middle));

                            } else if (parameters.FRAME_THICKNESS % 2 == 0 ) {

                                // even

                                multiplier = (int) (( parameters.FRAME_THICKNESS -10 ) /2);

                                materialArrayList.add(new Material("SP012", multiplier* middle));


                            } else if (parameters.FRAME_THICKNESS % 2 == 1 ) {

                                materialArrayList.add(new Material("SP110", middle));

                                // odd

                                multiplier = (int) (( parameters.FRAME_THICKNESS - 13 ) /2 );

                                materialArrayList.add(new Material("SP012", multiplier * middle));

                            }


                            materialArrayList.add(new Material("SP012",middle ));
                        }
                    }
                }





                break;
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

        // Sliding Door - PVC - Full - 10CM
        if (parameters.DOOR_NAME == DoorName.SLIDING_DOOR &&
                parameters.FRAME_TYPE == FrameType.PVC &&
                parameters.FRAME_MOUNTING_TYPE == FrameMountingType.FULL &&
                parameters.FRAME_THICKNESS >= 10) {

            if (parameters.FRAME_NUMBER_OF_EDGES == 3) {

                double front = GetThreeEdgesFrameQuantity(parameters, 14);
                double back = GetThreeEdgesFrameQuantity(parameters, 14);
                double middle = GetThreeEdgesFrameQuantity(parameters, 2);

                materialArrayList.add(new Material("SP063", front));
                materialArrayList.add(new Material("SP014", back));
                materialArrayList.add(new Material("SP012", middle));

                if (parameters.FRAME_THICKNESS> 10) {
                    int multiplier = 0;

                    if (parameters.FRAME_THICKNESS == 11 |  parameters.FRAME_THICKNESS == 12) {
                        multiplier = 1;

                        materialArrayList.add(new Material("SP012", middle));

                    } else if (parameters.FRAME_THICKNESS % 2 == 0 ) {

                        // even

                        multiplier = (int) (( parameters.FRAME_THICKNESS -10 ) /2);

                        materialArrayList.add(new Material("SP012", multiplier* middle));


                    } else if (parameters.FRAME_THICKNESS % 2 == 1 ) {

                        materialArrayList.add(new Material("SP110", middle));

                        // odd

                        multiplier = (int) (( parameters.FRAME_THICKNESS - 13 ) /2 );

                        materialArrayList.add(new Material("SP012", multiplier * middle));

                    }


                    double extraMiddle = GetThreeEdgesFrameQuantity(parameters, 2);
                    materialArrayList.add(new Material("SP012", extraMiddle));
                }

            }  else if (parameters.FRAME_NUMBER_OF_EDGES == 4) {


                double front = GetFourEdgesFrameQuantity(parameters, 14);
                double back = GetFourEdgesFrameQuantity(parameters, 14);
                double middle = GetFourEdgesFrameQuantity(parameters, 2);

                materialArrayList.add(new Material("SP063", front));
                materialArrayList.add(new Material("SP014", back));
                materialArrayList.add(new Material("SP012", middle));

                if (parameters.FRAME_THICKNESS> 10) {
                    int multiplier = 0;

                    if (parameters.FRAME_THICKNESS == 11 |  parameters.FRAME_THICKNESS == 12) {
                        multiplier = 1;

                        materialArrayList.add(new Material("SP012", middle));

                    } else if (parameters.FRAME_THICKNESS % 2 == 0 ) {

                        // even

                        multiplier = (int) (( parameters.FRAME_THICKNESS -10 ) /2);

                        materialArrayList.add(new Material("SP012", multiplier* middle));


                    } else if (parameters.FRAME_THICKNESS % 2 == 1 ) {

                        materialArrayList.add(new Material("SP110", middle));

                        // odd

                        multiplier = (int) (( parameters.FRAME_THICKNESS - 13 ) /2 );

                        materialArrayList.add(new Material("SP012", multiplier * middle));

                    }


                    double extraMiddle = GetFourEdgesFrameQuantity(parameters, 2);
                    materialArrayList.add(new Material("SP012", extraMiddle));
                }
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
