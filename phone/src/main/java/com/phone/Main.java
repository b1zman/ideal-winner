package com.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375(29)399-09-01", "Honor", "2.43");
        Phone phone2 = new Phone("+375(44)513-32-17", "Samsung", "1.89");
        Phone phone3 = new Phone("+375(29)649-05-94", "Iphone", "4.28");
        Phone phone = new Phone("+375(29)670-19-58", "Samsung");
        Phone phone4 = new Phone();
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone1.receiveCall("Artyom: ") + phone1.getNumber());
        System.out.println(phone1.receiveCall("Kseniya: ") + phone1.getNumber());
        System.out.println(phone1.receiveCall("Dmitry: ") + phone1.getNumber());
        System.out.println(phone);
        System.out.println(phone.receiveCall(phone.receiveCall("Father")));
        System.out.println(phone.receiveCall("Mother: ", "+375(29)702-94-42"));
        System.out.println(phone4.receiveCall("Brother"));
        System.out.println(phone.sendMessage("+375(29)702-94-42", "+375(29)399-09-01", "+375(29)649-05-94"));
    }

}
