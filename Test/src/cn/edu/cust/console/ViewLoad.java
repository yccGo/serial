package cn.edu.cust.console;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ViewLoad {
	public static void main(String[] args) throws ClassNotFoundException {
		String className = "cn.edu.cust.test.User";
		Class userClass = Class.forName(className);
		System.out.println(userClass.hashCode());
		System.out.println(userClass.getName());
		System.out.println(userClass.getSuperclass());
		System.out.println(userClass.getCanonicalName());
		System.out.println(String.class.hashCode());
		System.out.println(userClass == String.class);
		System.out.println(userClass.getName());//后去报名+类名
		System.out.println(userClass.getSimpleName());//获取类名q
		Field[] fields = userClass.getDeclaredFields();//获取所有的属性，如果是getFields，得到都是公共属性
		//Field[] fields = userClass.getFields();
		for(Field field : fields){
			System.out.println(field.getName() + "\t" + field.getModifiers() + "\t" + field.getType() + "\t" + field.getGenericType());
		}
		for(Field field : fields){
			System.out.println(field);
		}
		System.out.println("--------得到pulic方法--------");
		Method[] methods = userClass.getMethods();
		for(Method method : methods){
			System.out.println(method);
		}
		System.out.println("--------声明的所有方法--------------");
		Method[] declaredMethods = userClass.getDeclaredMethods();
		for(Method method : declaredMethods){
			System.out.println(method);
		}
	}
}
