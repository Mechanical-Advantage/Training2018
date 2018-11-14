class Square implements BaseShape {

    @Override
    public void draw() {
        System.out.println("Square...");
    }

    public static void main(String[] args) {
        BaseShape d = new Square();
        d.draw();
    }

}