public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();

    }

    public static void task1_2() {
        System.out.println("task1_2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("ФИО сотрудника для отчета - " + fullName.toUpperCase());

    }

    public static void task3() {
        System.out.println("task3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("ФИО сотрудника - " + fullName.replace('ё', 'е'));
    }
}
