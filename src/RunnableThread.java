public class RunnableThread implements Runnable {

    Thread runner;

    public RunnableThread(){

    }


    public RunnableThread(String threadName){
        runner = new Thread(this,threadName);
        System.out.println(runner.getName());
        runner.start();
    }


    public void run() {
        /*System.out.println(Thread.currentThread());*/
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String award(int level){

        Thread awardThread = new Thread(new RunnableThread(),"awardThread");

        if (level == 1){
            System.out.println("200 points awarded!");
        }else if (level == 2){
            System.out.println("400 points awarded!");
        }else if (level == 3){
            System.out.println("750 points awarded!");
        }
        return null;
    }
}

