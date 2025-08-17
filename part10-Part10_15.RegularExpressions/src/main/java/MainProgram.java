

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker check = new Checker();
        
        String str = "fri";
        System.out.println(check.isDayOfWeek(str));
        String str2 = "aeaeeaeiiwew";
        System.out.println(check.allVowels(str2));
         String str3 = "10:10:10";
        System.out.println(check.isDayOfWeek(str3));
    }
}
