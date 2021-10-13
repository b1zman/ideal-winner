package com.phone;

public class Phone {

    private String number;
    private String model;
    private String weight;


    public Phone(String number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    String receiveCall(String name) {

        return "Call " + name;
    }

    String receiveCall(String name, String number) {

        return "Call " + name + number;
    }

    public String sendMessage(String number, String... arg) {
        String numberMessage = "Message out for: " + number;
        for (String x : arg) {
            numberMessage += ", " + x;
        }
        return numberMessage + ";";
    }

    public String toString() {
        return "number= " + number
                + ", model= " + model
                + ", weigh= " + weight;
    }
}
