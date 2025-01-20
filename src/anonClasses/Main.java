package anonClasses;

public class Main {
	public static void printSomething(MyInterface m) {
		System.out.println(m.getSomeText());
	}
	public static void main(String[] args) {
		
		//uma interface não pode ser instanciada
		//aqui estamos usando uma classe anônima
		//ela é criada no momento que declaramos 'new' e ela implementa
		//a interface MyInterface
		printSomething(new MyInterface() {
			
			private void test() {
				System.out.println("test");
			}
			
			@Override
			public String getSomeText() {
				test();
				return "some text";
			}
		});
			
	}
}
