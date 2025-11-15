package com.example.demo.serviceimplementation;

public class Material {
    String code;
    double quantity;

    Material(String code, double quantity) {
        this.code = code;
        this.quantity = quantity;
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