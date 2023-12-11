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
}

public static void main(String args[])
    throws InterruptedException{
        long patience = 1000*60*60;
    if (args.length>0){
        try{
            patience = Long.parseLong(args[0])*1000;
        } catch
    }
    }