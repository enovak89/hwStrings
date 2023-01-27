public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        taskAdd1();
        taskAdd2();
        taskAdd7();
        taskAdd8();
        taskAdd9();



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


    public static void taskAdd1() {
        System.out.println("taskAdd1");
        String fullName = "Иванов";
//        doubleChar(fullName);
        fullName = doubleChar(fullName).toString();
        System.out.println(fullName);

/*        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fullName.length(); i++) {
            sb.append(fullName.charAt(i));
            sb.append(fullName.charAt(i));
        }

        System.out.println(sb);*/
    }

    public static StringBuilder doubleChar(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append(s.charAt(i));
        }
//        System.out.println(sb);
//        s = sb.toString();
        return sb;
    }


    public static void taskAdd2() {
        System.out.println("taskAdd2");
        String first = "12345";
        String second = "123";
        System.out.println(makeOutWord(first, second));
        System.out.println(lastChars(first, second));
        System.out.println(lastTwo(first));

    }

    public static String makeOutWord(String a, String b) {
        String result = a.substring(0, a.length() / 2) + b + a.substring(a.length() / 2, a.length());
        return (result);
    }

    public static String lastChars(String a, String b) {
        String result = "";
        if (a.length() == 0) {
            result = "@" + b.charAt(b.length() - 1);
        } else if (b.length() == 0) {
            result = a.charAt(0) + "@";
        } else {
            result = String.valueOf(a.charAt(0)) + String.valueOf(b.charAt(b.length() - 1));
        }
        return result;
    }

    public static String lastTwo(String s) {
        char[] letters = s.toCharArray();
        char tmp = letters[letters.length - 2];
        letters[letters.length - 2] = letters[letters.length - 1];
        letters[letters.length - 1] = tmp;
        String result = new String(letters);
        return result;
    }

    public static void taskAdd7() {
        String s = "Hello";
        int repeatCount = 5;

        String part = s.substring(s.length() - repeatCount);

        String result = part.repeat(repeatCount);
        System.out.println(result);
    }

    public static void taskAdd8() {
        System.out.println("taskAdd8");
        String s = "";

        int currentLength = 1;
        int maxLength = 1;
        if (s.length() == 0) {
            System.out.println("0");
        }   else {
            char currentChar = s.charAt(0);
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == currentChar) {
                    currentLength++;
                    continue;
                }
                currentChar = s.charAt(i);
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);

            System.out.println(maxLength);
        }
    }

    public static void  taskAdd9() {
        System.out.println("taskAdd9");
        String s = "Word";
        String raz = "X";
        String result = s + raz;
        int countOfRepeat = 5;
        System.out.println((result.repeat(countOfRepeat - 1) + s));
    }
}
