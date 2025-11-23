package com.example.customiztaion.serviceimplementation;

import com.example.customiztaion.enums.*;
import org.springframework.stereotype.Component;

@Component
public class Parameters {
    public DoorName DOOR_NAME;                                     // hinged door, sliding door, SWING DOOR and service door
    public DoorType DOOR_TYPE;                                     // single or double
    public double DOOR_THICKNESS;
    public double DOOR_LENGTH;
    public double DOOR_WIDTH;

    public int DOOR_QUANTITY;                                      // number of doors
    public double PRICE;

    public DoorDirection DOOR_DIRECTION;                           // right or left

    public TemperatureRange TEMPERATURE_RANGE;                     // COOLING, FREEZING

    public FrameType FRAME_TYPE;                                   // stainless steel 304, stainless steel 316, aluminum, galvanized steel
    public FrameMountingType FRAME_MOUNTING_TYPE;                  // Full ,
    public double FRAME_THICKNESS;
    public AccessoryType IS_FRAME_MTH_OR_IDIF;
    public int FRAME_NUMBER_OF_EDGES;

    public SheetType INTERNAL_SHEET_TYPE;
    public String INTERNAL_SHEET_COLOR_CODE;
    public double INTERNAL_SHEET_THICKNESS;

    public SheetType EXTERNAL_SHEET_TYPE;
    public String EXTERNAL_SHEET_COLOR_CODE;
    public double EXTERNAL_SHEET_THICKNESS;

    public boolean PORTHOLE_IS_EXIST;
    public PortholeShape PORTHOLE_SHAPE;

    public double DOOR_HUGE;
    public HingeType HINGE_TYPE;

    public boolean DOOR_CLOSER_EXIST;

    public AccessoryType ACCESSORY_TYPE;                             // IDIF , MTH

    public boolean BUMPER_IS_EXIST;
    public int BUMPER_NUMBER;
    public double BUMPER_SIZE;

    public SlidingWheelType SLIDING_WHEEL_TYPE;

    public StopperType STOPPER_TYPE;

    public int LATCH_NUMBER;

    public BottomGuide BOTTOM_GUIDE;


}
