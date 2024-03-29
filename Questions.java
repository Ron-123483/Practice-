//import java.util.Arrays;
//
//public class Questions {
//    public static void main(String[]args){
//
//        int [] numbers = {3,1,2,4,5,8,7,6,9};
//
//        String [] names = {"Ron", "Jon", "Brawn"};
//
//        Arrays.sort(numbers);
//        Arrays.sort(names);
//
//        for(int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//
//        for(int j = 0; j < names.length; j++){
//            System.out.print(names[j] + " ");
//
//
//        }
//
//
//        }
//
//
//    }
//
//
//public class Questions {
//    public static void main(String[]args){
//
//        int [] numbers = {1,1,1,1,1,1,1,1,1};
//
//        int sum = 0;
//
//        for(int i = 0; i < numbers.length; i++){
//            sum += numbers[i];
//        }
//        System.out.println(sum);


//
//public class Questions {
//    public static void main(String[] args) {
//
//        char symbol = '-';
//
//
//        char[][] dash = new char[10][10];
//
//        for (int i = 0; i < dash.length; i++) {
//            for (int j = 0; j < dash[i].length; j++) {
//                dash[i][j] = symbol;
//            }
//        }
//
//        for (int i = 0; i < dash.length; i++) {
//            for (int j = 0; j < dash[i].length; j++) {
//                System.out.print(dash[i][j] + " ");
//            }
//        }
//        System.out.println();
//
//
//        }
//    }
//
//
//
//public class Questions {
//    public static void main(String[] args) {
//
//        char symbol = '-';
//
//        char[][] dash = new char[10][10];
//
//
//        // Fill the 2D array with dashes
//        for (int i = 0; i < dash.length; i++) {
//            for (int j = 0; j < dash[i].length; j++) {
//                dash[i][j] = symbol;
//            }
//        }
//
//        // Now you can use the 2D array 'dash' for further processing or printing.
//        // For example, printing the 2D array:
//        for (int i = 0; i < dash.length; i++) {
//            for (int j = 0; j < dash[i].length; j++) {
//                System.out.print(dash[i][j] + " ");
//            }
//            System.out.println();  // Move to the next line after printing each row
//        }
//    }
//}

//
//

//
//public class Questions {
//    public static void main(String[] args) {
//
//        char symbol = '-';
//
//        char[][] dash = new char[10][10];
//
//        for (int i = 0; i < dash.length; i++) {
//            for (int j = 0; j < dash[i].length; j++) {
//                dash[i][j] = symbol;
//            }
//        }
//
//        for (int i = 0; i < dash.length; i++) {
//            for (int j = 0; j < dash[i].length; j++) {
//                System.out.print(dash[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//


//public class Questions {
//    public static void main(String[] args) {
//
//
//        int sum = 0;
//
//        int arr [] = {1, 2, 3 ,4 ,5};
//
//        for(int i = 0; i < arr.length; i++){
//            sum += arr[i];
//        }
//
//        System.out.println(sum / arr.length);
//
//
//
//
//    }
//}



//
//    public class Questions {
//        public static void main(String[]args){
//
//            int arr [] = {1, 2, 3, 4, 5, 6, 7, 8};
//
//            int find = 5;
//
//            boolean check = false;
//
//
//            for(int i = 0; i < arr.length; i++) {
//                if (arr[i] == find) {
//                    check = true;
//                    break;
//                }
//            }
//
//                if(check){
//                    System.out.println(find + " is found");
//                }
//                else{
//                    System.out.println(find + "not found ");
//                }
//
//
//            }
//
//
//
//
//        }


//public class Questions {
//    public static void main(String[]args){
//
//        int index = 0;
//
//        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for(int i = 0; i < arr.length; i++) {
//
//            if(arr[i] == 3){
//                index = i;
//
//
//            }
//        }
//        System.out.println(index);





//
//        }
//
//
//
//
//    }

//


//
//public class Questions{
//    public static void main(String[]args){
//
//        int remove = 4;
//
//
//        int arr [] = {1, 2, 3 , 4, 5};
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] != remove){
//                System.out.println(arr[i]);
//
//            }
//
//        }
//
//
//    }
//
//
//}


//
//public class Questions{
//    public static void main(String[]args){
//
//        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8};
//
//        int [] y = new int [8];
//
//        for(int i = 0; i < arr.length; i++){
//            y[i] = arr[i];
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//        for(int j = 0; j < y.length;j++){
//            System.out.print(y[j]);
//        }
//
//
//
//    }
//
//        }
//

//
//public class Questions{
//    public static void main(String[]args){
//
//        int replace = 0;
//
//        int erase = 2;
//
//
//        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for(int i = 0; i < arr.length; i++) {
//            arr[1] = replace;
//            if(arr[i] != erase){
//                System.out.println(arr[i]);
//
//            }
//
//
//            }
//        }
//
//
//
//
//    }
//
//
//
//
//
//public class Questions {
//    public static void main(String[] args) {
//
//        int replace = 0;
//        int erase = 2;
//
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        // Find the index of the value to be replaced
//        int indexToReplace = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 2) {  // Assuming you want to replace the value 2
//                indexToReplace = i;
//                break;  // Stop searching once found
//            }
//        }
//
//        // Replace the value at the found index with the value of 'replace'
//        if (indexToReplace != -1) {
//            arr[indexToReplace] = replace;
//        }
//
//        // Print elements that are not equal to 'erase'
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != erase) {
//                System.out.println(arr[i]);
//            }
//        }
//    }
//}

//
//import java.util.Scanner;
//
//
//public class Questions{
//    public static void main(String[]args){
//
//        Scanner in = new Scanner(System.in);
//
//        int firstNum, secondNum, thirdNum;
//
//
//        System.out.print("Input the first number: ");
//        firstNum = in.nextInt();
//        System.out.print("Input the second number: ");
//        secondNum = in.nextInt();
//        System.out.print("Input the third number: ");
//        thirdNum = in.nextInt();
//
//        smallNum(firstNum, secondNum, thirdNum);
//
//        }
//        static void smallNum(int firstNum, int secondNum, int thirdNum){
//
//        if (firstNum <= secondNum && firstNum <= thirdNum) {
//        System.out.println("The smallest number is " + firstNum);
//        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
//        System.out.println("The smallest number is " + secondNum);
//        } else {
//        System.out.println("The smallest number is " + thirdNum);
//    }
//}
//
//    }
//

//
//
//import java.util.Scanner;
//
//
//public class Questions{
//    public static void main(String[]args){
//
//        Scanner in = new Scanner(System.in);
//
//        int firstNum, secondNum, thirdNum;
//
//
//
//        System.out.print("Input the first number: ");
//        firstNum = in.nextInt();
//        System.out.print("Input the second number: ");
//        secondNum = in.nextInt();
//        System.out.print("Input the third number: ");
//        thirdNum = in.nextInt();
//
//        smallNum(firstNum, secondNum, thirdNum);
//
//        }
//        static void smallNum(int firstNum, int secondNum, int thirdNum){
//
//        int average = firstNum + secondNum + thirdNum;
//
//            System.out.println("The average is: " + average/3);
//
//
//
//}
//
//    }

//
//import java.util.Scanner;
//
//public class Questions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter the number of values: ");
//        int numValues = in.nextInt();
//
//        int[] values = new int[numValues];
//
//        for (int i = 0; i < values.length; i++) {
//            System.out.print("Input value  ");
//            values[i] = in.nextInt();
//        }
//
//
//
//        calculateAverage(values);
//    }
//
//    static void calculateAverage(int[] values) {
//        int sum = 0;
//
//        for (int value : values) {
//            sum += value;
//        }
//
//        double average = (double) sum / values.length;
//
//        System.out.println("The average is: " + average);
//    }
//}
//
//
//import java.util.Scanner;
//public class Questions {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        String string;
//
//        System.out.println("Enter your String: ");
//        string = in.next();
//
//        int vowelCount = countVowels(string);
//        System.out.println("Number of Vowels in the string: " + vowelCount);
//
//    }
//
//    static int countVowels(String string) {
//
//        int count = 0;
//
//
//        for(int i = 0; i < string.length(); i++){
//            char c = string.charAt(i);
//            if(c == 'a' || c == 'e'|| c == 'i' || c == 'o' || c == 'u'
//            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
//                count++;
//            }
//        }
//
//        return count;
//    }
//}
//
//import java.util.Scanner;
//public class Questions {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        String str;
//
//        System.out.println("Input the string: ");
//        str = in.next();
//
//        int vowelFind = findVowels(str);
//
//        System.out.println("The number of vowels in the string is: " + vowelFind);
//
//
//    }
//
//    static int findVowels(String str) {
//
//        int count = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
//               || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
//
//                count++;
//            }
//        }
//
//        return count;
//    }
//}
//


//
//import java.util.Scanner;
// public class Questions {
//     public static void main(String[] args) {
//
//         int numbers;
//
//         Scanner in = new Scanner(System.in);
//
//         System.out.println("Input an integer: ");
//         numbers = in.nextInt();
//
//         sumOfDigits(numbers);
//
//     }
//
//     static int sumOfDigits(int numbers) {
//
//         int sum = 0;
//
//             int temp = numbers % 10;
//             int bemp = numbers / 10;
//
//             sum = temp + bemp;
//
//             System.out.println("The sum is " + sum);
//
//             return bemp;
//        }
//     }
//


//
//
//import java.util.Scanner;
// public class Questions {
//     public static void main(String[] args) {
//
//         String words;
//
//         Scanner in = new Scanner(System.in);
//
//         System.out.println("Input the string: ");
//         words = in.nextLine();
//
//         countWords(words);
//
//     }
//
//
//     public static void countWords(String words){
//
//        int stringCount = 1;
//
//        for(int i = 0; i < words.length()-1; i++){
//            if((words.charAt(i) == ' ') && (words.charAt(i+1) != ' ')) {
//                stringCount++;
//            }
//        }
//         System.out.println("The number of string is " + stringCount);
//
//     }
//
// }
//
//



//public class Questions {
//     public static void main(String[] args) {
//
//         StringBuilder str = new StringBuilder("kanoR tensaB");
//
//        for(int i = 0; i < str.length()/2; i++){
//            int front = i;
//            int back = str.length()- 1 - i;
//
//            char frontChar = str.charAt(front);
//            char backChar = str.charAt(back);
//
//            str.setCharAt(front, backChar);
//            str.setCharAt(back, frontChar);
//        }
//         System.out.println(str);
//
//
//
//
//    }
//}
//
//
//import java.util.Scanner;
//public class Questions {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        String input = sc.next();
//
//        String result = "";
//
//        for (int i = 0; i < input.length(); i++) {
//            if(input.charAt(i) == 'e') {
//                result += 'i';
//            }else{
//                result += input.charAt(i);
//            }
//        }
//        System.out.println(result);
//





//        StringBuilder result = new StringBuilder(input);
//
//        //Insert char
//        result.insert(0, 'i');
//        System.out.println(result);


//        }
//
//
//    }



//
//import java.util.Scanner;
//
//public class Questions{
//    public static void main(String[]args) {
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 0 || j == 0 || i == 3 || j == 4) {
//                    System.out.print(" *");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//
//
//        }
//
//        }
//    }



import java.util.Scanner;

//public class Questions{
//    public static void main(String[]args) {
//
//        int n = 4;
//
//        for(int i = 0; i < n; i++){
//
//            for(int j = 0; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 0; j <= i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//
//
//
//
//    }
//}}

//
//public class Questions {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//
//        int number = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//                number++;
//                int sum = i+j;
//                if (sum % 2 != 0) {
//                    System.out.print("0");
//                }else{
//                    System.out.print("1");
//                }
//            }
//                System.out.println();
//            }
//
//        }
//    }

//
//public class Questions {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        //upper half
//        for(int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            int spaces = 2 * (n-i);
//            for (int j = 1; j <= spaces; j++){
//                System.out.print(" ");
//                }
//            for(int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        //lower half
//        for(int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            int spaces = 2 * (n-i);
//            for (int j = 1; j <= spaces; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        }
//
//    }
//


//My version
//public class Questions {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                if (i == 1){
//                    System.out.print("    *****");
//                    break;
//                }
//                else if (i == 2){
//                    System.out.print("   *****");
//                    break;
//                }
//                else if (i == 3){
//                    System.out.print("  *****");
//                    break;
//                }
//                else if (i == 4){
//                    System.out.print(" *****");
//                    break;
//                }
//                else if (i == 5){
//                    System.out.print("*****");
//                    break;
//                }
//
//            }
//
//
//            System.out.println();
//        }
//
//
//
//    }
//}


//public class Questions {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for(int i = 1; i <= n; i++){
//            //printing spaces first
//            for(int j = 1; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= n; j++){
//                System.out.print("*");
//            }
//            System.out.println( );
//        }
//
//            }
//        }


//
//public class Questions {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for(int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//
//
//    }
//}


//public class Questions {
//        public static void main(String[] args) {
//
//            int n = 5;
//
//            for(int i = 1; i <= n; i++){
//                for(int j = 1; j <= n - i; j++){
//                    System.out.print(" ");
//                }
//                for (int j = i; j >= 1; j--) {
//                    System.out.print(j);
//            }
//                for (int j = 2; j <= i; j++){
//                    System.out.print(j);
//                }
//                System.out.println();
//
//            }
//
//
//        }
//
//
//}


// Diamond
//public class Questions {
//        public static void main(String[] args) {
//
//            int n = 4;
//
//            for (int i = 1; i <= n; i++) {
//
//                for (int j = 1; j <= n - i; j++) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*" + " ");
//                }
//                System.out.println();
//            }
//            for (int i = n; i >= 1; i--) {
//
//                for (int j = 1; j <= n - i; j++) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("*" + " ");
//                }
//                System.out.println();
//            }
//        }
//}
//
//

//
//public class Questions {
//        public static void main(String[] args) {
//
//            int n = 4;
//
//            for(int i = 1; i <= n; i++){
//                for(int j = 1; j <= n - i; j++){
//                    System.out.print(" ");
//                }
//                for(int j = 1; j <= i; j++){
//                    System.out.print("*" + " ");
//
//                }
//                System.out.println();
//            }
//            for(int i = n; i >= 1 ; i--){
//                for(int j = 1; j <= n - i; j++){
//                    System.out.print(" ");
//                }
//                for(int j = 1; j <= i; j++){
//                    System.out.print("*" + " ");
//
//                }
//                System.out.println();
//            }
//
//
//        }
//}


//
//public class Questions{
//
//    public static void main(String[]args) {
//
//        System.out.println(factorial(5));
//
//
//    }
//
//    static int factorial(int num){
//
//        if (num == 0 || num == 1){
//            return 1;
//        }else{
//            return num * factorial(num - 1);
//        }
//    }
//}
//



//
//import java.util.Scanner;
//public class Questions{
//    public static void main(String[]args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int n;
//
//        System.out.format("Give me a number and I will give its multiplication table: ");
//        n = sc.nextInt();
//
//        System.out.println("Here are your tables: " );
//
//        multiTable(n);
//
//    }
//
//    static void multiTable(int n){
//
//        for(int i = 1; i <= 10; i++){
//            System.out.println(i * n);
//        }
//
//
//
//
//
//    }
//}
//



//public class Questions{
//    public static void main(String[]args){
//
//        for(int i = 1; i <= 10; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i = 1; i <= 10; i++){
//            for(int j = 1; j <= 10-i; j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i = 10; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//    }
//}







//
//
//import java.util.Scanner;
//
//        public class Questions {
//            public static void main(String[] args) {
//                Scanner in = new Scanner(System.in);
//
//                String string;
//
//                // Define an array of vowels
//                String[] vowels = {"a", "e", "i", "o", "u"};
//
//                System.out.println("Enter your String: ");
//                string = in.next();
//
//                int vowelCount = countVowels(string, vowels);
//
//                System.out.println("Number of Vowels in the string: " + vowelCount);
//            }
//
//            static int countVowels(String input, String[] vowels) {
//                int count = 0;
//
//                // Convert the input string to lowercase for case-insensitive matching
//                input = input.toLowerCase();
//
//                // Loop through each character in the string
//                for (int i = 0; i < input.length(); i++) {
//                    String currentChar = String.valueOf(input.charAt(i));
//
//                    // Check if the current character is a vowel
//                    for (String vowel : vowels) {
//                        if (currentChar.equals(vowel)) {
//                            count++;
//                            break; // Exit the inner loop once a vowel is found
//                        }
//                    }
//                }
//
//                return count;
//            }
//        }
//
//



















