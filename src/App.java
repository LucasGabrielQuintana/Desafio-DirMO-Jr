
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String mensaje = "";
        Scanner men = new Scanner(System.in);
        System.out.println("Ingrese un mensaje");
        mensaje = String.valueOf(men.nextLine());
        System.out.println(transformMessage(mensaje));
    }
    /**
     * Descripcion: esta funcion busca la coincidencia en letras para reemplazar por la secuencia de numeros segun su posición.
     * @param message mensaje recibido para convertir a la secuencia de teclas que hay que pulsar.
     * @return retorna el mensaje transformado en secuencia de teclas.
     */
    public static String transformMessage(String message){
        char[] letras = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String[] numeros = {"0","2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        String transformedMessage = " ";
        char[] messageString = message.toLowerCase().toCharArray();
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < letras.length; j++) {
                if(messageString[i] == letras[j]){

                    if(compare(transformedMessage,numeros[j])){
                        
                        transformedMessage+= " "  ;
                    }
                    if(transformedMessage==" "){
                        
                        transformedMessage = numeros[j];
                    }else{

                        transformedMessage += numeros[j];
                    }
                }    
            }
        }
        return transformedMessage;
    }
    /**
     * Descripcion: esta función compara entre dos String si son iguales las ultima letra de uno con la primera del otro.
     * @param pri primer string recibido, de este se extrae su ultimo caracter.
     * @param sec segundo string recibido, de este se extrae su primer caracter.
     * @return retorna true si encontro coincidencia. 
     */
    public static boolean compare(String pri, String sec){
        boolean value = false;
        char[] lastCharArray = pri.toCharArray();
        char lastChar = lastCharArray[lastCharArray.length-1];
        char[] firstCharArray = sec.toCharArray();
        char firstChar = firstCharArray[0];

        if(lastChar == firstChar){
            value = true;
        }
        return value;
    }
}
