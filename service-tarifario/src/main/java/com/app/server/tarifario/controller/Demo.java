package com.app.server.tarifario.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
	
	//	Dado un arreglo con los siguientes números [1, 24, 8, 13, 6, 15, 8, 15, 20]
	//			mostrar un arreglo solo con números pares y ordenado: [6, 8, 8, 20, 24]
		
	
		List listPares=new ArrayList();
		int lista[] ={1, 24, 8, 13, 6, 15, 8, 15, 20};
		Arrays.sort(lista);
		for(int x :lista) {
			if(x%2==0) {
				listPares.add(x);
			}
		}
		for(int x=0; x<listPares.size();x++) {
			System.out.println(listPares.get(x));
		}
		
	}

}
