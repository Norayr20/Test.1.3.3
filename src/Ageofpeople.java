public class Ageofpeople {
    public static void main(String[] args) {
        getAgeDiff((byte) 3, (byte) 10);
    }
        public static void getAgeDiff(byte age1, byte age2) {
            System.out.println((byte) Math.abs(age1 - age2));
        }

    }
