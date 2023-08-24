package org.example;

// erişim belirteci - class - class ismi
// Kalıp
// Kimya dersi? Matematik dersi? => Instance üretme
public class Lesson
{

    // constructor => yapıcı metot
    // Kalıptan bir örnek üretilme aşamasında çalışan metot
    // kalıptan newlenen her instance constructor'ı tetikler..
    // Class'ın içerisinde hiç bir constructor tanımı yoksa, boş constructor (parametresiz) otomatik tanımlı gibi davranır
    public Lesson()
    {
        System.out.println("Constructor çalıştı..");
    }

    public Lesson(String name, String teacherName, int studentCount){
        // this => classin kendisine işaret eder.
        this.name = name;
        this.teacherName = teacherName;
        this.studentCount = studentCount;
    }

    // Attribute => Özellik
    // Set edilmek => bir değer atanmak
    private String name;
    private String teacherName;
    private int studentCount;

    // Encapsulation

    // Getter => İlgili attributeın değerini okumak için
    // Setter => İlgili attributeın değerini değiştirmek için kullanılacak fonksiyonlar.
    // getAttribute setAttribute
    // get => return attribute;
    // set => this.attribute = attribute;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    // void => return demek fonksiyonu orada kesmek demek.
    public void setStudentCount(int studentCount) {
        // student counti değiştirmek isteyen bir kod bloğu buraya uğramak zorunda..
        if(studentCount<0){
            System.out.println("Öğrenci sayısı 0'dan küçük bir değere set edilemez.");
            return;
        }
        this.studentCount = studentCount;
    }

    // Method-Function
    public void startLesson(){
        // kimya,matematik?
        // name = Chemistry dersi başladı.
        if(studentCount < 10){
            System.out.println("10 kişiden az mevcudu olan dersler başlatılamaz.");
        }else{
            System.out.println(name + " dersi başladı..");
        }
    }

    public void endLesson(){
        System.out.println(name + " dersi bitti..");
    }
    // Kalıbın içerisinde ayırdığımız alanları birleştirip kullanabiliyoruz..
}
