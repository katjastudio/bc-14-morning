package day18;

import java.util.Scanner;

public class MyLovelyScanner {
    public static void main(String[] args) {
/*
        31.Напишите программу, которой надо представиться.
        Данные, которые спрашивает машина: имя, фамилия, пол, возраст, e-mail.
                Для считывания данных типа String используйте метод next(): input.next()*/

        Scanner input = new Scanner(System.in);
        String name, surname, gender, email;
        int age;
        System.out.println("What is your name?");
        name = input.next();
        //System.out.println("Your name is: " + name)

        System.out.println("What is your surname?");
        surname = input.next();

        System.out.println("What is your gender?");
        gender = input.next();

        System.out.println("What is your age?");
        age = input.nextInt();

        System.out.println("What is your e-mail?");
        email = input.next();
        System.out.println("Your name is " + name + "\n"
                + "Your surname is " + surname + "\n"
                + "Your gender is " + gender + "\n"
                + "Your age is " + age + "\n"
                + "Your e-mail is " + email);
        input.close();
    }
}