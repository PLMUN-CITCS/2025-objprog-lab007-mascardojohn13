public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isHomeworkTiring = false;
        char a = 'a';
        char b = 'b';
        
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is homework tiring? " + isHomeworkTiring);
        System.out.println("Is 'a' greater than 'b'? " + (a > b));
        System.out.println("Are 'a' and 'b' equal? " + (a == b));
        System.out.println("Both conditions (isJavaFun && a<b): " + (isJavaFun && a < b));
        System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + (isJavaFun || isHomeworkTiring));
        System.out.println("Logical NOT of isHomeworkTiring: " + (!isHomeworkTiring));
        System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + (isJavaFun ^ isHomeworkTiring));
    }
}
