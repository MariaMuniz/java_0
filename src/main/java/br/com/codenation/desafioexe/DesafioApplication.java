package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> listFibonacci = new ArrayList<>();

		listFibonacci.add(0);
		listFibonacci.add(1);

		Integer fibNum = 1;

		for(int i = 3; fibNum <= 400 ; i++ ){
			listFibonacci.add(fibNum);
			fibNum = listFibonacci.get(i-1) + listFibonacci.get(i-2);
		}

		return listFibonacci;
	}

	public static Boolean isFibonacci(Integer a) {

		return fibonacci().contains(a);
	}
}
