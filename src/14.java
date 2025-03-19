// Java program to demonstrate the use of break statement

class Demo {
public static void main(String[] args) {
int[] marks = {10, 20, 30, 40, 50};
for (int i : marks) {
if (i < 30) {
break;
}
System.out.println(i);
}
}
}
