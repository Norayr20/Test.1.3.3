public class AgeOfPeople {
    public static void main(String[] args) {
        byte calculategetAgeDiff = getAgeDiff((byte) 10, (byte) 25);
        System.out.println(calculategetAgeDiff);
    }
    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) Math.abs(age1 - age2);
    }
}