package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // string => veri türü => metinsel veri
        // ln => line
        System.out.println("Hello world!");

        // değişkenler
        // degisken_türü degisken_ismi = degisken_degeri
        String metin = "Turkcell Akademi";

        int sayi = 10; // tam sayı
        String sayi1 = "10"; // metinsel

        System.out.println(sayi + 20);
        System.out.println(sayi1 + 20);

        // ÖDEV 1 => Değişken Türlerini araştıralım ve tüm değişkenleri kullandığımız bir console uygulaması yazalım.

        // Döngüler
        // Programın bir kod bloğunu belirli bir condition (şart) içerisinde bu şart sağlandığı sürece
        // çalıştırılmasını sağlar.

        // for
        // syntax => yazım kuralı
        // i => index
        // iteration, iterasyon =>
        // 1. alan => değişken tanımlama , 2. alan => şart tanımlama , 3. alan => her iterasyon sonrası yapılacak işlem
        System.out.println("For Döngüsüne Girildi.");
        for(int i=0; i<100; i++)
        {
            System.out.println(i);
        }
        System.out.println("For Döngüsünden Çıkıldı.");
        // iterate etmek
        List<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        /*
        for(int i=0; i<sayilar.size(); i++){
            System.out.println(sayilar.get(i) + 5);
        }
        */
        // alias
        // foreach
        for(Integer s: sayilar){
            System.out.println(s);
        }

        // içerisine condition'ı direkt alır.

        // Infinite Loop
        /*
        while(true){
            System.out.println("X");
        }
        */
        // do - while

        int i = 10;


        // i=100;
        System.out.println("***********");

        int j = 10;

        while(j<10)
        {
            System.out.println("While");
            i++;
        }

        // do-while döngüsünde ilk ziyaret her zaman execute edilir.
        do{
            System.out.println("DO-WHILE");
            j++;
        }
        while(j<10);


        // Karar Blokları => Condition Statements => If,Else

        int sayi2 =6;
        // ilk önce if kontrol edilir => şart sağlanmıyorsa => tüm else ifler kontrol edilir. => şart sağlanmıyorsa =>
        // varsa else bloğu çalıştırılır.
        if(sayi2 > 10)
        {
            System.out.println("Sayi 10'dan büyüktür.");
        }
        else if(sayi2 > 2){
            System.out.println("Sayi 2'den büyüktür.");
        }
        else if(sayi2 > 5) {
            System.out.println("Sayi 5'den büyüktür.");
        }
        else
        {
            System.out.println("Sayı tüm kontrollerden false değeri almıştır.");
        }

        int notOrtalamasi = 80;
        int disiplinNotu = 40;
        // koşullar içindeki "ve" "veya" terimleri

        // ve koşulu (&&)=>  bağladığı iki kondiyosunun da true olması durumunda true diğer durumlarda false değer çevirir.
           //  false  && true  => false
        // veya koşulu (||) => bağladığı iki kondisyondan birinin true olması yeterli

        // false || true => true
        // false || true => true
        if( ( notOrtalamasi >= 80 && notOrtalamasi <= 100 ) && disiplinNotu > 50) {
            System.out.println("AA");
        }
        else if(notOrtalamasi < 80 && notOrtalamasi >= 60){
            System.out.println("BB");
        }

        // Infinite Chain

        // ÖDEV 2 =>

        String tur = "B";


        // switch-case
        switch (tur){
            case "A":
                System.out.println("Tür A");
                break;
            case "B":
                System.out.println("Tür B");
                break;
            case "C":
                System.out.println("Tür C");
                break;
        }

        // static bir fonksiyondan çağırıldığı için fonkisyonun kendisini de static yaptık.
        int sayi3 = hesapla(50,10);
        int sayi4 = hesapla(0,30);
        int sayi5 = hesapla(10,20);
        int sayi6 = hesapla(20,0);
        int sayi7 = hesapla(30,5);
        double sayi8 = hesapla(20,20,30);


        System.out.println(sayi3);


        // Herhangi bir classtan (kalıptan) bir instance (örnek, kalıptan üretilmiş tekil objeler) üretmek için
        // chemistry => Lesson kalıbından türetilmiş bir örneğe işaret eder.
        System.out.println("******** OOP Başlangıç **********");
        Lesson chemistry = new Lesson("Chemistry","Halit",10);
        chemistry.setName("Chemistry 2");
        chemistry.setStudentCount(-10);

        /*chemistry.name = "X";
        chemistry.studentCount=-10;
        chemistry.teacherName="Halit";*/

        Lesson math = new Lesson("Math","Engin",20);
        /*math.name="Math";
        math.studentCount=20;
        math.teacherName="Engin";*/
        // null => herhangi bir değere sahip olmayan

        chemistry.startLesson();
        math.startLesson();

        System.out.println("*********** OOP 2. Gün *************");

        // Kalıtım => Inheritance
        // Superclass => kalıtım yapılan class'a denir. => Animal
        // Subclass => superclass'dan kalıtım yaparak üretilmiş classdır. => Dog,Cat,Bird
        // OOP içerisinde birden fazla classin ortak özelliklerinin tek tek tanımlanması yerine bir superclassda tanımlanmasını
        // sağlar.
        Dog dog = new Dog(); // Animal
        Cat cat = new Cat(); // Animal
        Bird bird = new Bird(); // Animal
        dog.name = "x";
        cat.name = "y";
        bird.name = "z";

        dog.breathe();
        cat.breathe();
        bird.breathe();


        // Polymorphism => Çok çeşitlilik

        Animal animal1 = new Animal();
        Animal animal2 = new Bird();
        // superclass - subclass  => Problem YOK
        Animal animal3 = new Cat();
        // subclass - superclass => YAPAMIYORUZ..
        //Bird bird1 = new Animal();

        // Animal => name,breathe
        // Bird => name,breathe,fly

        Fish fish = new Fish();


        // Interface => Arayüz

    }

    // Databaseden müşteri bilgilerini çeken kod
    // Method => Dışardan Çağırılabilir => Tekrar Kullanıma Uygun => Değişikliğe Açık
    // erişilebilirlik_belirteci dönüş_değeri metod_ismi()
    // void => dönüş tipi olmayan fonksiyon
    // geri dönüş tipi void olmayan tüm fonksiyonlar bodysi içerisinde return ile bir değer döndürmek zorundandır.
    // sayi1 , sayi2
    // SOLID => SINGLE RESPONSIBILITY
    // optional parameter ?
    // C# => sayi2=10 mümkün fakat Javada kullanmıyoruz!!
    public static int hesapla(int sayi1, int sayi2)
    {
        return sayi1+sayi2;
    }

    // Method Overloading => Aynı metodun farklı parametre kombinasyonları ile tanımlanabilmesine
    // olanak sağlar.
    public static double hesapla(int x,int y, int z)
    {
        return x+y+z;
    }

    // OOP => Object Oriented Programming => Nesne Yönelimli Programlama
    // Blueprint => Kalıp => Class
    // Instance => Örnek
}