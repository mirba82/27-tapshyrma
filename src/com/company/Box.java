package com.company;

public class Box <T>{
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public Box(){}

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void method(Box<Box>name){
        System.out.println(name);
}
    @Override
    public String toString() {
        return "Box " + value;
    }

}
