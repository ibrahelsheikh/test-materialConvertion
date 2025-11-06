package com.example.demo.serviceimplementation;

class Material {
    String code;
    float quantity;

    Material(String code, float quantity) {
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