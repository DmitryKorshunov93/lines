// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        { System.out.println("Задание №1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        System.out.println("Задание №2");

        System.out.println(fullName.toUpperCase());}

        System.out.println("Задание №3");{
           String fullName = "Иванов Семён Семёнович";
           String fullName1 = fullName.replace('ё', 'е');
            System.out.println("Данные Ф. И. О. сотрудника - " + fullName1 );


    }

}
}