package ej12;

import java.util.HashSet;
import java.util.Set;


public class SetOperations <T>{

		public static <T> Set<T> union (Set<T> a, Set<T> b){
			Set<T> resultado =new HashSet<T>(a);
			resultado.addAll(b);
			
			return resultado;
		}
		
		public static <T> Set<T> interseccion (Set<T> a, Set<T> b){
			Set<T> resultado =new HashSet<T>(a);
			resultado.retainAll(b);
			
			return resultado;
		}
		
		public static <T> Set<T> diferencia (Set<T> a, Set<T> b){
			Set<T> resultado =new HashSet<T>(a);
			resultado.removeAll(b);
			
			return resultado;
		}
		
		public static <T> Set<T> difSimetrica(Set<T> a, Set<T> b) {
	        Set<T> resultadoUnion = union (a, b);
	        Set<T> resultadoInterseccion = interseccion(a,b);
			
	         return diferencia(resultadoUnion, resultadoInterseccion);
			
		}

	}


