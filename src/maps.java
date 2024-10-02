import java.util.HashMap;
import java.util.Scanner;

class GestorHashMap {
    private HashMap<String, Integer> hashMap;

    public GestorHashMap() {
        this.hashMap = new HashMap<>();
    }

    public void agregarElemento(String clave, int valor) {
        hashMap.put(clave, valor);
    }

    public int obtenerValor(String clave) {
        return hashMap.getOrDefault(clave, -1);
    }


    public boolean contieneClave(String clave) {
        return hashMap.containsKey(clave);
    }


    public void eliminarElemento(String clave) {
        hashMap.remove(clave);
    }

    public void mostrarHashMap() {
        System.out.println("Contenido del HashMap: " + hashMap);
    }
}