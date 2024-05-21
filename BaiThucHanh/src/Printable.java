interface printable {
void print();
}

class A6 implements printable {
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A6 bc = new A6();
        bc.print();    
    }
}