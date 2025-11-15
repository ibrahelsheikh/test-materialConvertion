package com.example.demo.serviceimplementation;

import com.example.demo.enums.DoorName;
import com.example.demo.enums.DoorType;

import java.util.ArrayList;
import java.util.List;

public class MaterialConversionIdifServiceDoorFixedMaterialList {

    public static List<Material> materialConversionIdifServiceDoorFixedMaterialList(Parameters parameters) {


        List<Material> materialArrayList = new ArrayList<>();

        double materialConversionCalculateMaterialHisCode_11PLT003_00000 = MaterialConversionCalculateMaterialQuantityForServiceDoor.materialConversionCalculateMaterialHisCode_11PLT003_00000(parameters.DOOR_LENGTH, parameters.DOOR_WIDTH);

        switch (parameters.DOOR_NAME) {
            case SERVICE_DOOR:
                materialArrayList.add(new Material("13TUF001 00000", 1));
                materialArrayList.add(new Material("13TUC402 13012", 1));
                materialArrayList.add(new Material("13TUC116 00000", 1));
                materialArrayList.add(new Material("12VAR301 00000", 1));
                materialArrayList.add(new Material("12VAR300 15067", 1));
                materialArrayList.add(new Material("17OLR001 17013", 0));   // fix this
                materialArrayList.add(new Material("11PLT003 00000", materialConversionCalculateMaterialHisCode_11PLT003_00000));

                break;


            case SWING_DOOR:
//                materialArrayList.add(new Material("", ));

                break;


            case SLIDING_DOOR:
//                materialArrayList.add(new Material("", ));


                break;


            case HINGED_DOOR:
                materialArrayList.add(new Material("13CEC604 0000", 1));  // Ext. handle CSI with lock RAL7004/black with MTH logo
                materialArrayList.add(new Material("13CN603 00000", 1));  // Int. handle CSI RAL7004/green certified EN179:2008
                materialArrayList.add(new Material("25 AST 138 13067", 1));  // Int. handle CSI striker RAL7004
                materialArrayList.add(new Material("13 CSC 700 15070", 2));  // Tie rood RAL7004 for CSI handle
                materialArrayList.add(new Material("25AST247 13070", 1));  // Drive staff for CSI handle
                materialArrayList.add(new Material("25CAT250 13076", 2));  // Tube for CSI handle
                materialArrayList.add(new Material("15VAR100 00000", 1));  // Valve for foaming

                break;


        }


        return materialArrayList;

    }


}


