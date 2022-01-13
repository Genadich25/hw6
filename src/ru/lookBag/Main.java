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

        String[] wordsFullName = fullName.split(" ");
        System.out.print("Данные ФИО сотрудника для административного отдела — ");
        for (int i = 0; i < wordsFullName.length; i++) {
            if(i != wordsFullName.length - 1){
                System.out.print(wordsFullName[i] + "; ");
            } else {
                System.out.println(wordsFullName[i]);
            }
        }

        System.out.println();

    //4 задача

        fullName = "Иванов Семён Семёнович";
        char[] charFullName = fullName.toCharArray();
        System.out.print("Данные ФИО сотрудника — ");
        for (int i = 0; i < charFullName.length; i++) {
            if(charFullName[i] != 'ё'){
                System.out.print(charFullName[i]);
            } else {
                charFullName[i] = 'е';
                System.out.print(charFullName[i]);
            }
        }

        System.out.println();

    }
}
