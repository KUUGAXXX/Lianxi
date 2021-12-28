package test1;


 class One {
    protected void printA() {
        System.out.println("父类printA");
    }

    private void printB() {
        System.out.println("父类printB");
    }

    private void printC() {
        System.out.println("父类printC");
    }

    protected void printABC() {
        printA();
        printB();
        printC();
    }
}


class Two extends One {
    protected void printA() {
        System.out.println("子类printA");
    }

    private void printB() {
        System.out.println("子类printB");
    }

    public void printC() {
        System.out.println("父类printC");
    }

    public static void main(String[] args) {
        Two t = new Two();
//  　  One t = new Two();
        t.printABC();
    }
}
