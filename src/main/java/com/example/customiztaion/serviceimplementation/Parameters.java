package com.example.customiztaion.serviceimplementation;

import com.example.customiztaion.enums.*;
import org.springframework.stereotype.Component;

@Component
public class Parameters {
    DoorName DOOR_NAME;                                     // hinged door, sliding door, SWING DOOR and service door
    DoorType DOOR_TYPE;                                     // single or double
    double DOOR_THICKNESS;
    double DOOR_LENGTH;
    double DOOR_WIDTH;

    int DOOR_QUANTITY;                                      // number of doors
    double PRICE;

    DoorDirection DOOR_DIRECTION;                           // right or left

    TemperatureRange TEMPERATURE_RANGE;                     // COOLING, FREEZING

    FrameType FRAME_TYPE;                                   // stainless steel 304, stainless steel 316, aluminum, galvanized steel
    FrameMountingType FRAME_MOUNTING_TYPE;                  // Full ,
    double FRAME_THICKNESS;
    AccessoryType IS_FRAME_MTH_OR_IDIF;
    int FRAME_NUMBER_OF_EDGES;

    SheetType INTERNAL_SHEET_TYPE;
    String INTERNAL_SHEET_COLOR_CODE;
    double INTERNAL_SHEET_THICKNESS;

    SheetType EXTERNAL_SHEET_TYPE;
    String EXTERNAL_SHEET_COLOR_CODE;
    double EXTERNAL_SHEET_THICKNESS;

    boolean PORTHOLE_IS_EXIST;
    PortholeShape PORTHOLE_SHAPE;

    double DOOR_HUGE;
    HingeType HINGE_TYPE;

    boolean DOOR_CLOSER_EXIST;

    AccessoryType ACCESSORY_TYPE;                             // IDIF , MTH

    boolean BUMPER_IS_EXIST;
    int BUMPER_NUMBER;
    double BUMPER_SIZE;

    SlidingWheelType SLIDING_WHEEL_TYPE;

    StopperType STOPPER_TYPE;

    int LATCH_NUMBER;

    BottomGuide BOTTOM_GUIDE;


}
