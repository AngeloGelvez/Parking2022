package com.turboparking.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tpersona") //Hacemos referencia a la tabla creada en MySQL, osea referencia de que esta clase va a estar vinculada con esa tabla
public class Usuario{
    
    @Id //Este toma la llave primaria
    @Column(name="idt_persona")
    /*
    @Id significa que este campo va a ser mi id en mi tabla
    @Column(name="cualquiera") Es para especificar el nombre de mi id en mi base de datos,
    Si se llamara igual Id, pues no habria necesidad de poner el column, que es el que me especifica
    como se llama el id en mi base de datos
    */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Este me indica como se va a estar generando el valor de manera automatica
    //Y se va a generar de IDENTITY para identificar cada elemento
    private Integer identificacion;
    
    //Debo de estar especificando que cada uno de estos elementos va a ser una columna
    //Tambien puedo especificar la longitud, esa longitud debe ser la misma que en la base de datos
    //Tambien esta el nullable que especifica que mi campo no puede estar vacio o NULL
    //Tambien esta el unique que especifica que mi dato es unico
    @Column(name = "nombre_persona", length =45, nullable =false)
    /* DATO
    Si se encuentra el @Column sin el name, es porque quiere decir que
    el nombre de la columna se llama de igual forma que el atributo
    */
    private String nombre;
    
    @Column(name = "correo_persona", length =45, unique = true, nullable =false)
    private String correo;
    
    @Column(name = "contraseña_persona", length =45, nullable =false)
    private String contraseña;
    
    @Column(name ="hora_persona", length=10, nullable =false)
    private String horaInicio;

    public Usuario() {
    }
    
    public Usuario(Integer identificacion, String nombre, String correo, String contraseña, String horaInicio) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.horaInicio = horaInicio;
    }

    public Usuario(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Override
    public String toString() {
        return "Usuario{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", horaInicio=" + horaInicio + '}';
    }  
}
