package genericos;

import java.util.ArrayList;
import java.util.List;

//ServicioGenerico<Cliente, String> 
public class ServicioGenerico<T extends Identificable<ID>, ID> {
    private List<T> datos = new ArrayList<>();
   
    //Validar para no permitir duplicados de ID
    public void agregar(T elemento) {
        if (buscarPorId(elemento.getId()) != null) {
            System.out.println("El elemento con ID " + elemento.getId() + " ya existe.");
        }else{
        datos.add(elemento); // Agregar el elemento a la lista
        System.out.println("Guardado: " + elemento.getId() + " correctamente.");
        }
    }

    public List<T> listar() {
        return datos;
    }

    //Buscar en la lista si se encuentra el elemento o no
    public T buscarPorId(ID id) {
        for (T elemento : datos) {
            if (elemento.getId().equals(id)) {
                return elemento;
            }
        }
        return null;
    }

    //Eliminar un elemento por ID 
    public boolean eliminarPorId(ID id) {
        for(int i=0; i<datos.size(); i++){
            if(datos.get(i).getId().equals(id)){
                datos.remove(i); // Eliminar el elemento de la lista
                System.out.println("Eliminado elemento con ID: " + id);
                return true;
            }
        }
        System.out.println("Elemento con ID: " + id + " no encontrado.");
        return false;
    }

    public boolean actualizarPorId(ID id, T nuevoElemento) {
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(id)) {
                datos.set(i, nuevoElemento);
                System.out.println("Actualizado elemento con ID: " + id + " con: " + nuevoElemento);
                return true;
            }
        }
        System.out.println("Elemento con ID: " + id + " no encontrado.");
        return false;
    }

}












