
class Scratch {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;

        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        System.out.println(sum);

        int sub = a - b;
        System.out.println(sub);

        try {
            int mult = a * b;
            System.out.println(mult);
        } catch(Exception e) {
            System.out.println("Не удалось перемножить" + a +" и " + b);
        }


        try {
            int div = a / b;
            System.out.println(div);
        } catch (Exception e) {
            System.out.println("Не удалось разделить " + a + " на" + b);
        }
    }
}

