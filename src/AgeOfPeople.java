public class AgeOfPeople {
    public static void main(String[] args) {
       byte age1=50;
       byte age2=13;
        getAgeDiff(age1,age2);
    }
    public static void getAgeDiff(byte age1, byte age2) {

        System.out.println((byte) Math.abs(age1 - age2));
    }
}