package com.example.customiztaion.serviceimplementation;

public class Material {
    String code;
    double quantity;
    double size;

    public Material(String code, double quantity ) {
        this.code = code;
        this.quantity = quantity;

    }

    public Material (String code, double quantity , double size){
        this.code = code;
        this.quantity = quantity;
        this.size = size;
    }


    Material(String code, int quantity) {
        this.code = code;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Quantity: " + quantity;
    }
}