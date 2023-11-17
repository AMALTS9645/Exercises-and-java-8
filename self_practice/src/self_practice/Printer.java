package self_practice;

//Interface seggregation example

interface Printers {
	void print();

}

interface Scanners {
	void scan();
}

class HPPrinter implements Printers, Scanners {

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub

	}

}

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
