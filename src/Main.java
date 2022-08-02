public class Main {
    public static void main(String[] args) {
//hw1
        bot2 objectA = new bot2(100,5,Enum.DOKTOR);
        bot3 objectB = new bot3(200,25,Enum.MAGIC);
        bot3 objectC = new bot3(120,23,Enum.BERSERK );
        System.out.println("objectA " + objectA.getInfo() + "\nobjectB " + objectB.getInfo() +
                "\nobjectC " + objectC.getInfo());
    }
}
