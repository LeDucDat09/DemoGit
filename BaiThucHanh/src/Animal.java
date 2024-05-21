abstract class Animal{
    abstract void run();
}
class Cheetah extends Animal{
    void run() {
        System.out.println("hle ");
    }
    public static void main(String args[]) {
        Animal obj = new Cheetah();
        obj.run();
    }
}