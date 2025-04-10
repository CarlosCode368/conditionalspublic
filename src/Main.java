//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void go(int age) {
        if (age >= 18) {
            System.out.println("Go vote!");
        } else{
            System.out.println("Go Play");
            }
        }
            public static void respond(char answer) {
                if (answer == 'Y' || answer == 'y') {
                    System.out.println("YUP YUP YUP");
                } else {
                    System.out.println("NOPE NOPE NOPE");
                }
            }

            public static void drink(int age){
                if (age < 21){
                    System.out.println("juice");
                }else if (age <50){
                    System.out.println("adult beverage");
                }else {
                    System.out.println("tea");
                }

                }
                public static void main(String[]args){
                drink(11); //juice
                drink(age=25); //adult beverage
                drink(age=99); //tea


                for (String a : args) {
                    System.out.println(a);
                }
                go(age = 13);
                go(age = 21);

                respond(answer = 'Y');
                respond(answer = 'N');
            }
        }

    }
}


