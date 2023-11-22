1. Write a Java program to display the time in human readable format like,
hours:minutes:seconds.

2. Write a Java program to split a sentence in to array with the space delimiter.
“Betty bought some butter”

3. Demonstrate Compile time Polymorphism and Run-time Polymorphism.

4. Tell Me Why
public class Client1 {
static void doCalc(byte... a) {
System.out.print(&quot;byte...&quot;);
}
static void doCalc(long a, long b) {
System.out.print(&quot;long, long&quot;);
}
static void doCalc(Byte s1, Byte s2) {
System.out.print(&quot;Byte, Byte&quot;);
}
public static void main (String[] args) {
byte b = 5;
doCalc(b, b);
}
}

5. What gets printed on the standard output when the class below is compiled and executed.
public class ShortCkt
{
public static void main(String args[])
{
int i = 0;
boolean t = true;
boolean f = false, b;
b = (t | ((i++) == 0));
b = (f | ((i+=2) &gt; 0));
System.out.println(i);
}
}

6. What gets displayed on the screen when the following program is compiled and run.
public class test
{
public static void main(String args[])
{
boolean x = true;
int a;

if(x) a = x ? 1: 2;
else a = x ? 3: 4;
System.out.println(a);
}
}

7. What is the result when this code is executed?
class One {
public One() { System.out.print(1); }
}
class Two extends One {
public Two() { System.out.print(2); }
}
class Three extends Two {
public Three() { System.out.print(3); }
}
public class Numbers{
public static void main( String[] argv ) { new Three(); }
}

8. What all gets printed when the following program is compiled and run.
public class test
{
public static void main(String args[])
{
int i=0, j=2;
do
{
i=++i;
j--;
}
while(j&gt;0);
System.out.println(i);
}
}

9. What all gets printed when the following gets compiled and run.
public class test {
public static void main(String args[]) {
String s1 = &quot;abc&quot;;
String s2 = new String(&quot;abc&quot;);
if(s1 == s2)
System.out.println(1);

else
System.out.println(2);
if(s1.equals(s2))
System.out.println(3);
else
System.out.println(4);
}
}

10. What is the result?
public static void test(String str)
{
int check = 4;
if (check = str.length())
{
System.out.print(str.charAt(check -= 1) +&quot;, &quot;);
}
else
{
System.out.print(str.charAt(0) + &quot;, &quot;);
}
}
and the invocation:
21. test(&quot;four&quot;);
22. test(&quot;tee&quot;);
test(&quot;to&quot;);

11. How many String objects will be created when this method is invoked?
public String makinStrings()
{
String s = “Fred”;
s = s + “47”;
s = s.substring(2, 5);
s = s.toUpperCase();
return s.toString();
}

12. Given the code fragment:





What is the result?
A. Sum is 600
B. Compilation fails at line n1.
C. Compilation fails at line n2.
D. A ClassCastException is thrown at line n1.
E. A ClassCastException is thrown at line n2.




13. Given the code fragment:



What is the result?
A. Match 1
B. Match 2
C. No Match
D. A NullPointerException is thrown at runtime.


14. What does this code segment print?
static void increment(int index) {
index++;
}
public static void main(String[] args) {
int i = 0;
increment(i);
i++;
System.out.println(i);
}
What is the result?
public static void main(String[] args)
{

12. Integer i = new Integer(1) + new Integer(2);
switch(i)
{
case 3: System.out.println(&quot;three&quot;); break;

15. default: System.out.println(&quot;other&quot;); break;
}
}