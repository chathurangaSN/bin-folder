package exercises;

interface A {
	void print();

	interface B extends A {
		void print();
	}

	interface C extends A {
		void print();
	}

	public class Diamond implements B, C {
		public static void main(String[] args) {
			Diamond diamond = new Diamond();
			diamond.print();
		}

		@Override
		public void print() {
			System.out.println("gtgg");

		}

	}
}