package com.val.inflando;

/**
 * Created by vale on 11/05/16.
 */
public class StringUtil {

    public static String mensajeSalida (String nombre)
    {
        char mensaje [] = null;
        char mensaje1 [] = null;
        int a = 0;
            mensaje = nombre.toCharArray();
        for(int i = mensaje.length; i > 0; i--){
            mensaje1[a] = mensaje[i];
            a++;

        }
        return mensaje1.toString();
    }
}
