class Main{
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setPic(0,0,"orangecat.png", "pics/orangecat.png");
        canvas.setPic(10,0, "gang.png", "pics/gang.png");
        canvas.setPic(20,0, "toiletcat.png", "pics/toiletcat.png");
        canvas.draw();
    }
}