package org.cuatrovientos.ed;
/**
 * Analizador de cadena
 * @author Gorka
 *
 */
public class Cadena {
	
		/** Función que devuelve la longitud de la cadena
		 * @param cadena
		 * @return resultado
		 */
	    public int longitud(String cadena) {
	        return cadena.length();
	    }
	    /** Función que devuelve el numero de vocales
	     * @param cadena
	     * @return resultado
	     */
	    public int vocales(String cadena) {
	    	String vocales="aeiou";
	        int contador=0;
	 
	        for(int i=0;i<cadena.length();i++)
	        {
	            for(int j=0;j<vocales.length();j++)
	            {
	                if(cadena.charAt(i)==vocales.charAt(j))
	                {
	                    contador+=1;
	                }
	            }
	        }
	        return contador;
	    }
	    /** Función para invertir la cadena
	     * @param cadena
	     * @return resultado
	     */
	    public String invertir(String cadena) {
	        String invertirCadena = "";

	        for(int i=cadena.length()-1; i>=0;i--) {
	            invertirCadena= invertirCadena + cadena.charAt(i);
	        }
	        return invertirCadena;
	    }
	    /** Función para contar las letras de la cadena
	     * @param cadena
	     * @param caracter
	     * @return resultado
	     */
	    public int contarLetra(String cadena, char caracter) {
	        int cnt= 0;
	        for(int i=0;i<cadena.length();i++) {
	            if(cadena.charAt(i) == caracter) {
	                cnt = cnt + 1;
	            }
	        }
	        return cnt;
	    }
}