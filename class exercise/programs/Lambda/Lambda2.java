interface MyGreetings{
    String processName(String str);
}
class Lambda2
{
    public static void main(String[] args) {
        MyGreetings morningGreeting = (str) -> "Good Morning " + str + "!";
        MyGreetings morningGreeting = (str) -> "Good Morning " + str + "!";
        
        //output : Good Morning Luis!
        System.out.println(morningGreeting.processName("Luis"));
        // output: Good Afternoon John!
        System.out.println(((MyGreetings) ((String s) -> "Good Afternoon John!")));

    }
}