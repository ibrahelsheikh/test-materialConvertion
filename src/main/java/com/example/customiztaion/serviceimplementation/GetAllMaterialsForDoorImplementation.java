package com.example.customiztaion.serviceimplementation;

import com.example.customiztaion.service.GetAllMaterialsForDoor;

import java.util.List;

// Implementation
public class GetAllMaterialsForDoorImplementation implements GetAllMaterialsForDoor {

    @Override
    public List<Material> getAllMaterialsForDoor(Parameters parameters) {

        return switch (parameters.DOOR_NAME) {
            case SERVICE_DOOR -> GetMaterialsForServiceDoor.getMaterialsForServiceDoor(parameters);
            case HINGED_DOOR -> GetMaterialsForHingedDoor.getMaterialsForHingedDoor(parameters);
            case SLIDING_DOOR -> GetMaterialsForSlidingDoor.getMaterialsForSlidingDoor(parameters);
            case SWING_DOOR -> GetMaterialsForSwingDoor.getMaterialsForSwingDoor(parameters);
        };

    }

}
