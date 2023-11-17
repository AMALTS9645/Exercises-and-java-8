package InterfaceEg;

public class PrinterMain {
	public static void main(String []args) {
		CannonPrinter printer = new CannonPrinter();
		HpPrinter scan = new HpPrinter();
		
		printer.print();
		printer.Scan();
		scan.print();
	}
	
}
