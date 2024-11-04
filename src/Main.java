/**
 * Main class
 * @author Artemiy Moroz
 */

class Main{
    /**
     * Main method, that creates canvas and runs its {@code draw()}
     * @param args
     */
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setPic("google.exe","orangecat.png", "pics/orangecat.png");
        canvas.setPic("telegram.exe", "gang.png", "pics/gang.png");
        canvas.setPic("discord.exe", "toiletcat.png", "pics/toiletcat.png");
        canvas.change();
    }
}