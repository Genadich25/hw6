package ru.lookBag;

public class Main {

    public static void main(String[] args) {
    //1 задача

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String secondName = "Ivanov";
        String fullName = secondName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        System.out.println();

    //2 задача

        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperCaseFullName);

        System.out.println();

    //3 задача

        String fullName2 = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName2);

        System.out.println();

    //4 задача

        fullName = "Иванов Семён Семёнович";
        String fullNameNoE = fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника — " + fullNameNoE);

    }
}
