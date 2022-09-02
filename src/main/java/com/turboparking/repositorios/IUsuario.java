/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turboparking.repositorios;

import com.turboparking.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * ESTA ES MI INTERFACE
 */
public interface IUsuario extends JpaRepository<Usuario, Integer>{
    //JpaRepository es una clase de tipo Interface que es la que posee los métodos para estar haciendo un CRUD
    
    
}
