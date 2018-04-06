package com.es.everis.beca.tallerochenteroadrian.controller;


import com.es.everis.beca.tallerochenteroadrian.modelo.Persona;

import java.io.PrintStream;
import java.util.List;

public interface ReservaController {
  boolean hayMesasLibres();

  Mesa reservar(Mesa mesaAReservar, Persona persona, int numComnesales);

  void listarReservas(PrintStream printer);

  List<Mesa> getReservas();

  List<Mesa> getMesasDisponibles();

  Mesa getMesaById(Integer id);
  
  void atenderReserva(Integer idMesa);

}
