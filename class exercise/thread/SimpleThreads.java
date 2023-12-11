public class SimpleThreads{
    static void threadMessagge(String message){
        String threadName = 
        Thread.currentThread().getName();
        System.out.format("%s: %s%n",threadName,message);
    }
    private static class MessageLoop implements Runnable{
        public void run(){
            String importantInfo[] = {
                "mars eats oats",
                "Does eat oats",
                "Little lamp "
            };
            try{
                for(int i =0 ; i < importantInfo.length; i++){
                    Thread.sleep(4000);
                    threadMessagge(importantInfo[i]);
                }
            }catch(InterruptedException e){
                threadMessagge("I wasn't done!");
            }
        }
    }
    public static void main(String[] args) 
        throws InterruptedException{
            long patience = 1000*60*60;
            if(args.length > 0){
                try {
                    patience = Long.parseLong(args[0])*1000;
                } catch (Exception e) {
                    System.err.println("Argument must be an integer");
                    System.exit(1);
                }
            }
            threadMessagge("Starting MessageLoop thread");
            long startTime = System.currentTimeMillis();
            Thread t = new Thread(new MessageLoop());
            t.start();
            threadMessagge("Waiting for MessageLoop thread to finish");
            while (t.isAlive()) {
                threadMessagge("Still waiting...");
                t.join(1000);
                if(((System.currentTimeMillis() - startTime) > patience) && t.isAlive()){
                    threadMessagge("tired of waiting");
                    t.interrupt();
                    t.join();
                }
            }
            threadMessagge("Finally");
        }
}