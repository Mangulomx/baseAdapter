package com.cursoandroid.mycustombaseadapter;

/**
 * Created by Miguel on 13/01/2015.
 */
public class Usuario {
    private String Nombre;
    private String dni;
    private int telefono;

    public Usuario(String Nombre, String Dni, int telefono)
    {
        this.Nombre = Nombre;
        this.dni = Dni;
        this.telefono = telefono;
    }
    public String getNombre()
    {
        return Nombre;
    }
    public String getDni()
    {
        return dni;
    }
    public int getTelefono()
    {
        return telefono;
    }


}
