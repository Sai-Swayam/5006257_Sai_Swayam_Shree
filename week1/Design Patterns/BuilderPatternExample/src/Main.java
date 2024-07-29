public class Main {
    public static void main(String[] args) {
        Computer ASUS_TUF = new Computer.Builder().setCPU("AMD Ryzen 5 4600H").setRAM(8).setStorage(512).computerBuilder();
        System.out.println(ASUS_TUF);
    }
}