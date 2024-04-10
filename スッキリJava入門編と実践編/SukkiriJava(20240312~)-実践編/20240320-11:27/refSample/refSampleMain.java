package refSample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class refSampleMain {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Class<?> clazz = refSample.class;
		
		Constructor<?> cons = clazz.getConstructor(int.class);
		refSample rs = (refSample)cons.newInstance(256);
		
		Field f = clazz.getField("times");
		f.set(rs, 3);
		System.out.println(f.get(rs));
		
		Method m = clazz.getMethod("hello", String.class, int.class);
		m.invoke(rs, "reflection!",128);
		
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		boolean finm = Modifier.isFinal(m.getModifiers());
	}

}
