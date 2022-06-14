package com.formacionjava.excepciones;

public class Ejemplo {
	public static void main(String[] args) {
		
		int[] array = new int[20];
		
		try {
			
			System.out.println(array[10]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("esto es el error de indice negativo: "+e);
			
		} catch (Error e) {
			System.out.println("esto es el error de carga de tipo incorrecto de array: "+e);
		}finally {
			
			System.out.println("finally");
			
		}
		
		
	}
}
