
public class Checker {

    public boolean isDayOfWeek(String string) {
        if (string.matches("mon") || string.matches("tue") || string.matches("wed")
                || string.matches("thu") || string.matches("fri")
                || string.matches("sat") || string.matches("sun")) {
            return true;
        }
        return false;
    }

    public boolean allVowels(String string) {
        if (string.matches("[aeiou]*")) {
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String string){
        if (string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]")) {
            return true;
        }
        return false;
    }

}
