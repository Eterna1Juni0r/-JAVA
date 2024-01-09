import java.util.Scanner;

public class Main {
    public static String name = "Вячеслав";
    public static void main(String[] args) {
        int[] x = {1, 3, 4, 5, 6, 8, 6, 21, 57};
        zadachaOne();
        zadachaTwo();
        zadachaThree(x);
        //задача номер 4
        /*
        Эта скобочная последовательность неправильная,
        потому что количество открывающих "[" не
        соответствует количеству закрывающих "]".
        Чтобы сделать эту последовательность правильной,
        необходимо удалить лишнюю открывающую скобку "[" в начале последовательности.
        Вот как будет выглядеть правильная скобочная последовательность: [((())()(()))]
        */
    }
    public static void zadachaOne(){
        Scanner cons = new Scanner(System.in);
        int x = cons.nextInt();
        if (x > 7){
            System.out.println("Привет");
        }
    }
    public static void zadachaTwo(){
        Scanner cons = new Scanner(System.in);
        String id = cons.nextLine();
        if (id.equals(name)){
            System.out.println("Привет, " + id);
        } else {
            System.out.println("Нет такого имени");
        }
    }
    public static void zadachaThree(int [] x){
        for (int id: x){
            if (id % 3 == 0){
                System.out.print(id + ", ");
            }
    }
}}