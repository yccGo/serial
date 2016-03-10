package cn.edu.cust.console;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import cn.edu.cust.annotaion.YccField;
import cn.edu.cust.annotaion.YccTable;

public class ViewAnnotation {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		try {
			Class stuClass= Class.forName("cn.edu.cust.model.Stu");
			Annotation[] annotations = stuClass.getAnnotations();
			for(Annotation annotation : annotations){
				System.out.println(annotation);
			}
			YccTable yccTable = (YccTable) stuClass.getAnnotation(YccTable.class);
			System.out.println(yccTable.value());
			Field idField = stuClass.getDeclaredField("id");
			System.out.println(idField.getName());
			YccField idAnno = idField.getAnnotation(YccField.class);
			System.out.println(idAnno.name() + "\t" + idAnno.len() + "\t" + idAnno.type());
			YccField nameAnno = stuClass.getDeclaredField("username").getAnnotation(YccField.class);
			System.out.println(nameAnno.name() + "\t" + nameAnno.len() + "\t" + nameAnno.type());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
