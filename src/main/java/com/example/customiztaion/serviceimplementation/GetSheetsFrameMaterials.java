package com.example.customiztaion.serviceimplementation;

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

        return materialArrayList;
    }
}
