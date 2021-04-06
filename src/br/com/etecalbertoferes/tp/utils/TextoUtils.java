package br.com.etecalbertoferes.tp.utils;

import java.util.Locale;

public class TextoUtils {
    public static String paraCaixaAlta(String texto) {
        return texto.toUpperCase(Locale.ROOT);
    }

    public static int getQuantidadecaracteres(String texto) {
        return texto.length();
    }

    @Deprecated
    public static int contarCaracteres(String texto) {
        return texto.length();
    }
}
