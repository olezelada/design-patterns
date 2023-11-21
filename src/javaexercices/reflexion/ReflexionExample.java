package javaexercices.reflexion;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class ReflexionExample {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clase = String.class;

        //get the name of class;
        String className = clase.getName();
        System.out.println("Class Name : " + className);

        //get fields
        Field[] fields = clase.getDeclaredFields();
        System.out.println(" class fields : ");
        for (Field field: fields){
            System.out.println(field.getName()+ ", ");
        }

        // get methods
        Method[] methods = clase.getDeclaredMethods();
        System.out.println(" class methods");
        for (Method method: methods){
            System.out.println(method.getName()+", ");
        }

        //get constructs
        Constructor<?>[] constructors = clase.getDeclaredConstructors();
        System.out.println("class cosntrutctors : ");
        for (Constructor<?> constructor: constructors){
            System.out.println(constructor.getName()+", ");
        }

        // get class for name as parameter.
        Class<?> clas = Class.forName("java.util.ArrayList");
        System.out.println("nombre de la clase : " + clas.getName());

        Method[] metodos = clas.getMethods();
        System.out.println("Métodos de la clase:");
        for (Method metodo : metodos) {
            System.out.println(metodo.getName());
        }
    }
}
