package OOP.exceptions;

public class StackTrace {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void metodo1() throws Exception {
        try {
            metodo2();
        } catch (Exception e) {
            System.out.println("Catch do metodo1");
            e.printStackTrace();
            throw e; // relança
        }
    }

    static void metodo2() throws Exception {
        try {

            metodo3();

            String teste = "teste";
            System.out.println(teste);
        } catch (Exception e) {
            System.out.println("Catch do metodo2");
            e.printStackTrace();
            throw e; // relança
        }
    }

    static void metodo3() throws Exception {
        try {
            throw new Exception("Erro original!");
        } catch (Exception e) {
            System.out.println("Catch do metodo3");
            e.printStackTrace();
            throw e; // relança
        }
    }


}
