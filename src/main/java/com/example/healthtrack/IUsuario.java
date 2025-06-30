package com.example.healthtrack;

public interface IUsuario {
    String getNombre();
    double getPeso();
    void actualizarPeso(double nuevoPeso);
    void mostrarInformacion();
}