public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!\n");
        game();
    }

    public static String game(){

        int inc = 1;
        Thread game_thread = new Thread(new RunnableThread(),"game_thread");
        game_thread.start();

        for (int y=3;inc<=y;inc++){
            System.out.println("level - " + inc);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
