package interfaz;

import java.util.Map;

@FunctionalInterface
public interface ContadorPalabras {
    Map<String, Integer> palabraMasRepetida(String frase);
}

