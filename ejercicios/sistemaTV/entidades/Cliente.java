package entidades;

import genericos.Identificable;

public class Cliente implements Identificable<String> {
    private String id;
    private String nombre;
    private String email;

    public Cliente(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente [id: " + id + ", nombre: " + nombre + ", email: " + email + "]";
    }
    
}




