package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
//		FileOutputStream outputStream = null;
//		ObjectOutputStream objectStream = null;
//		Employee emp = new Employee(1001, "Amal", 45000);

		// writing an object to a file
//		try {
//			outputStream = new FileOutputStream("employee.data");
//			objectStream = new ObjectOutputStream(outputStream);
//			objectStream.writeObject(emp);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				outputStream.close();
//				objectStream.close();
//			} catch (IOException e2) {
//				e2.printStackTrace();
//			}
//
//		}
//		 //reading an object
		FileInputStream inputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			inputStream = new FileInputStream("employee.data");
			objectInputStream = new ObjectInputStream(inputStream);
			Employee emp = (Employee) objectInputStream.readObject();
			System.out.println(emp);
		} catch (IOException | ClassNotFoundException e) {

			System.err.println(e.getMessage());
		}

	}

}
