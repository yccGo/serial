package cn.edu.cust.serial;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import cn.edu.cust.compare.Person;

public class ViewSerialize {
	public static void testByte() throws IOException, ClassNotFoundException{
		Person person = new Person(1,"David",23);
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(os);
		out.writeObject(person);
		byte[] personBytes = os.toByteArray();
		ByteArrayInputStream byteIn = new ByteArrayInputStream(personBytes);
		ObjectInputStream in = new ObjectInputStream(byteIn);
		Person person_cpy = (Person)in.readObject();
		System.out.println(person_cpy);
		out.close();
		in.close();
	}
	public static void testFile(){
		Person person = new Person(1,"Kobe",24);
		SerialDemo<Person> serialDemo = new SerialDemo<Person>();
		serialDemo.serialize(person);
		Person person_cpy = serialDemo.deSerialize();
		System.out.println(person_cpy);
	}
	public static void testStringFile(){
		String str = "hello world";
		SerialDemo<String> serialDemo = new SerialDemo<String>();
		serialDemo.serialize(str);
		String str_cpy = serialDemo.deSerialize();
		System.out.println(str_cpy);
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
//		ViewSerialize.testByte();
		ViewSerialize.testFile();
//		ViewSerialize.testStringFile();
	}
}
