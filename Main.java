//public class Main {
//
//    public static void main(String[] args) {
//        //sout deb yozsa avtomatik System.out.println chiqarib berar ekan
//        System.out.println("Assalomu alaykum Asror aka!");
//        String mavzu = """
//                Bugungi mavzu
//                boolean  ikkita qiymatni saqlash mumkin.  true (to'g'ri) va false (yolg'on)
//                byte  hajmi 8 bit. Butun sonlarni saqlash uchun ishlatiladi. Qiymati oralig'i  -128 dan  127 gacha. [-128 ..... 127]
//                char  ishoralarni ushlab turish uchun ishlatiladi. namuna:  (a,b,c,.....!,#,$,....)
//                short hajmi 16 bit.  Butun sonlarni saqlash uchun ishlatiladi. Oraliq  -32,768 ..... 32,767
//                int hajmi 32 bit, Butun sonlarni saqlash uchun ishlatiladi. Oraliq  -2,147,483,648 ....  2,147,483,647
//                long  hajmi 64 bit. Butun sonlarni saqlash uchun ishlatiladi. Oraliq  -9,223,372,036,854,775,808 ....... 9,223,372,036,854,775,807
//                float hajmi 32 bit. Kasr sonlarni saqlash uchun ishlatiladi.  Oraliq  3.40282347 x 1038, 1.40239846 x 10-45
//                double hajmi  64 bit. Kasr sonlarni saqlash uchun ishlatiladi. Oraliq 1.7976931348623157 x 10308, 4.9406564584124654 x 10-324  (juda katta son)
//                """;
//        System.out.println(mavzu);
//        String a = """
//                long a = 1001290991;
//                long bu uzun 10 xonaligacha butun sonlarni saqlovchi o'zgaruvchi turi;
//                int a = 5; int bu integer faqat butun sonlarni qabul qiladi
//                """;
//        System.out.print(a);
//
//        //char
//
//        char ishora = 'a';
//        System.out.println(ishora);
//
//        String savol = "Nega ishorani saqlash kerak va ishora o'zi nima?";
//
//        System.out.println(savol);
//
//        double d = 1.55;
//        float f = 1.5f;
//        System.out.println(d);
//        System.out.println(f);
//
//        String savol2 = "Nega float ni raqamdan keyin f yani ozgrauvchi nomini qoyish kerak?";
//        System.out.println(savol2);
//        int n = 5, m = 6;
//        System.out.println("n va m ni print qilish uchun 2 qator kod yoziladimi yoki println bilanam bittada chiqarsa boladimi?");
//        boolean haqiqat = true;
//        System.out.println("haqiqat doim" + haqiqat);
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Salom");
//    }
//}
//
//public class Main {
//    static int a = 6;
//    public static void main(String[] args) {
//        System.out.println(a);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String attent = """
//                %s ---- String qiymatlar uchun
//                %S ---- Stringni katta qiymatlarda chiqarish uchun
//                %f ---- Float yoki Double qiymatlar uchun
//                %e ---- Float yoki Double ning eksponensial qiymati uchun
//                %b ---- Boolean (true, false) qiymatlar uchun
//                %c ---- Char qiymatlar uchun
//                %d ---- Integer shuningdek int, long ,short yoki byte tipli qiymatlar uchun
//                %o ---- Sakkizlik sanoq sistemasida chop etish uchun
//                %x ---- O'n oltilik sanoq sistemasida chop etish uchun
//                %% ---- Foiz belgini chiqarish uchun
//                %n ---- Yangi qator tashlash uchun
//                %t ---- Sana va vaqt uchun
//                """;
//        System.out.println(attent + "bu printf uchun");
//
//        second();
//
//    }
//    public static void second() {
//        String test = "Javani";
//        String source = "dasturlash uz";
//        System.out.printf("%S ni %s orqali o'rganyabman", test, source);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Salom pythonchilar");
//    }
//}
//


//public class Main {
//    static int i;
//    static boolean b;
//    public static void main(String[] args) {
//        System.out.printf("Integer default qiymatda 0 ga teng ekaan i = %d!\n", i);
//        System.out.printf("Boolean defaultda pythondayam False edi javadaym bir xil ekan b = %b!", b);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        int n = 5;
//
//        System.out.println(n);
//        n = 2;
//
//        System.out.println(n);
//    }
//}

//public class Main {
//    static int son3 = 80;
//    public static void main(String[] args) {
//        int son1 = 100;
//        int son2 = 20;
//        int a = 20+40;
//
//        System.out.println(a);
//        System.out.println(son1+son2+son3);
//
//        int m = a + 10;
//        System.out.println(m);
//
//        //bo'luv chap tomondan ongga boladi
//        System.out.println(son1/son2);
//        String text = "agar 10 / 4 ga boslsak 2.5 lekin amalni bajaruvchi ozgaruvchi type int bolsa 2 ni olib keladi 2.5 kasr son!!";
//        System.out.println(text);
//        double c = 10.0;
//        double d = 4.0;
//        System.out.println(c/d);
//        System.out.println("Doubleda 2.5 chiqadiagar biri int bolganda 2 keladi response ham 2.5 doubleda qaytadi");
//        //ayirish
//        System.out.println(son1-son2);
//
//        //kopaytiruv
//        System.out.println(son1*son2);
//
//
//
//    }
//}



//public class Main {
//    public  static  void main(String[] args) {
//        int a = 5;
//        int b = 8;
//
//        System.out.println(!(a < 10 && b > 4)); //jarayon 5 10dan kichik bolgani uchun true va 8 4dan katta bolgani uchun true true ning inkori false
//        System.out.println(!!(a < 10 && b > 10 )); //jarayon 1 amal togri ammo ikkinchisi false ikkisdan bir false bolsa return false qaytadi va falseni inkori true
//    }
//}
//


//public class Main {
//    public static void main(String[] args) {
//        int donat = 100000;
//
//        if (donat >= 100000){
//            System.out.println("Borakallo bo'tam bor bo'ling");
//        }else {
//            System.out.println("Toma - toma bo'lib daryo bo'lur!");
//        }
//
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//
//        for ( int x = 0 ; x<101 ; x =+ 2 ) {
//            System.out.println("Hello world" + x);
//        }
//    }
//}




//public class Main {
//    public static void main(String[] args) {
//        int i = 0;
//        while ( i < 101) {
//            System.out.println("Sorry babe");
//            i++;
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ismingizni kiriting:");
//
//        String ism = scanner.next();
//
//        System.out.println("Salom " + ism);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        for(int i = 1; i < 10; i++) {
//            System.out.println("-------------------------------------");
//
//            for(int j = 1; j < 10; j++){
//                System.out.println(i + " * " + j + " = " + (i*j));
//                if (j == 9){
//                    System.out.println(j + "karralilar tugadi");
//                }
//                if (i == 9){
//                    if (j == 9){
//                        System.out.println("Kichik sonlilar karra jadvali tugadi");
//                    }
//                }
//            }
//
//        }
//        System.out.println("Katta sonlilar karra jadvali");
//        for (int a = 9; a < 20; a++) {
//            System.out.println("-------------------------------------");
//
//            for (int b = 1; b < 10; b++) {
//                System.out.println(a + " * " + b + " = " + (a*b));
//                if (a == 19) {
//                    if (b == 9) {
//                        System.out.println("Katta sonlilar karra jadvali tugadi");
//                        System.out.println("3 xonali sonlar karra jadvali");
//                    }
//                }
//            }
//        }
//
//        for (int c = 100; c < 1000; c++){
//            System.out.println("-------------------------------");
//            for (int d = 1; d < 10; d++){
//                System.out.println(c + " * " + d + " = " + (c*d));
//                if (c == 999){
//                    if (d == 9) {
//                        System.out.println("This is the end!\nHold your breath and count to ten!");
//                    }
//                }
//            }
//
//        }
//    }
//

//public class Main {
//    public static void main(String[] args){
//        int n = 10;
//        long sum = 0;
//        for (int i = 0; i <= n; i++){
//            long num = 0;
//            for (int j = 0; j < i; j++ ){
//                num = num * 10 + i;
//            }
//            System.out.print(num);
//            sum += num;
//            if (i != n){
//                System.out.print(" + ");
//            }
//            else {
//                System.out.print(" = " + sum);
//
//
//            }
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        int n = 7;
//        int x = 2;
//        int sum = 1;
//        for (int i = 1; i <= n; i++ ){
//            int pow = 1;
//           for (int j = 1; j <= i; j++){
//                pow *= x;
//
//           }
//            sum = sum + pow;
//            System.out.println(pow);
//       System.out.println(sum);
//        }
//    }
//}

//
//public class Main{
//    public static void main(String[] args){
//        String color = "Qizil";
//        String red = "Qizil";
//        String yellow = "Sariq";
//        String green = "Yashil";
//
//        if (color == red) {
//            System.out.println("To'xtang!");
//        }
//        if (color == yellow){
//            System.out.println("Tayyorlaning");
//        }
//        if (color == green){
//            System.out.println("Xavfsiz, harakatlaning!");
//        }
//        else {
//            System.out.println("Bunday svetofor rangi yo'q!");
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        int guys = 10;
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i + " chi odam binoga kirdi");
//            if (i == guys){
//                System.out.println("Bino to'ldi");
//                break;
//            }
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        for (int i = 1; i <= 5; i++){
//
//            for (int x = 1; x <= i; x++){
//                System.out.print(x + " ");
//            }
//
//            System.out.println();
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        int toq = 0;
//        for (int i = 1; i <= 20; i++){
//            if (i % 2 != 0){
//                toq += i;
//            }
//        }
//        System.out.println("1 dan 20 gacha bo'lgan toq sonlar yig'indisi: " + toq);
//    }
//
//}

//public class Main{
//    public static void main(String[] args){
//        int balans = 50000;
//        int kofe = 15000;
//        do{
//            System.out.println("kofe 15 000 so'm" );
//            balans -= kofe;
//            System.out.println("Pul yechildi balansingiz: " + balans);
//
//        }while (balans >= kofe);
//    }
//}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        int balans = 100000;
//        System.out.println("Qancha pul yechmoqchisiz?:");
//        Scanner input = new Scanner(System.in);
//        int summa = input.nextInt();
//
//        if (summa <= balans){
//            balans -= summa;
//            System.out.println("Pul muvaffaqiyatli yechildi balansingiz: " + balans);
//        }else{
//            System.out.println("Summa is Too large");
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args){
//
//        int a = 10;
//        int b = 100000;
//        int Counter = 0;
//        for (int i = a; i <= b; i++){
//            int n = i;
//            int reverseNum = 0;
//
//            while (n != 0) {
//                reverseNum = reverseNum * 10 + n % 10;
//                n = n / 10;
//
//            }
//
//            if (i == reverseNum) {
//
//                Counter += 1;
//
//                System.out.println(i);
//            }
//
//        }
//        System.out.println("-----------------");
//        System.out.println("Polindrom sonlar:" + Counter);
//
//
//
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        Scanner scannerA = new Scanner(System.in);
//        System.out.print("A sonni kiriting: ");
//        int a = scannerA.nextInt();
//
//        Scanner scannerB = new Scanner(System.in);
//        System.out.print("B sonni kiriting: ");
//        int b = scannerB.nextInt();
//
//        if (a > b){
//            for (int i = a; i >= b; i--){
//                if (i % 2 == 0){
//                    System.out.println(i);
//                }
//            }
//        }else{
//            System.out.println("A B dan katta bo'lishi shart!");
//        }
//
//    }
//}

//bankomat
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        int cardPassword = 2011;
//        Scanner guardian = new Scanner(System.in);
//        System.out.print("Bank karta parolini kiriting: ");
//        int password = guardian.nextInt();
//
//        if (password == cardPassword) {
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Salom ! Bankomatga xush kelibsiz\nXizmatlardan birini tanlang:\n1.Balansdan pul yechish\n2.Pul kiritish\n3.Balansni tekshirish\n4 Chiqish");
//            int xizmat = scanner.nextInt();
//            int MyBalance = 0;
//
//            while (true) {
//                if (xizmat == 1) {
//                    System.out.println("Hurmatli mijoz balansingiz: " + MyBalance);
//                    Scanner balance = new Scanner(System.in);
//                    int usrBalance = balance.nextInt();
//
//                    if (usrBalance <= MyBalance) {
//                        MyBalance -= usrBalance;
//                        System.out.println("Tranzaksiya amalga oshirildi !");
//                    }else{
//                        System.out.println("Balansingiz salbiy!");
//                        break;
//                    }
//                } else if (xizmat == 2) {
//                    System.out.print("Hurmatli mijoz balansingiz: " + MyBalance);
//                    Scanner newBalance = new Scanner(System.in);
//                    int Income = newBalance.nextInt();
//
//                    MyBalance += Income;
//                    System.out.println("Tranzaksiya amalga oshirildi!");
//
//                } else if (xizmat == 3) {
//
//                    System.out.println("Balansingiz: " + MyBalance);
//
//                } else if(xizmat == 4) {
//                    System.out.println("Biz bilan bo'lganingiz uchun rahmat!");
//                    System.out.println("Tizimdan chiqilmoqda...");
//                    break;
//                } else {
//                    System.out.println("Noto'g'ri tanlov!");
//                }
//            }
//
//        }else {
//            System.out.println("Parol xato!");
//        }
//
//
//    }
//}

//
//public class Main {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                if (j < n - i - 1){
//                    System.out.print(" ");
//                } else {
//                    System.out.print("* ");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Main{
//    public static void echoBot(String[] args){
//
//        String[] info = {""};
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("nimadur yozing : ");
//        String word = scanner.next();
//
//
//        info[0] = word;
//
//        System.out.println(info[0]);
//    }
//}






import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        User userDetail = getUser();
        String name = userDetail.name;
        String surname = userDetail.surname;
        int age = userDetail.age;

        System.out.println(name + " " +surname + " " + age);


    }

    public static User getUser(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your surname: ");
        String surname = scanner.next();

        User u = new User();
        u.age = age;
        u.name = name;
        u.surname = surname;

        return  u;

    }

}
