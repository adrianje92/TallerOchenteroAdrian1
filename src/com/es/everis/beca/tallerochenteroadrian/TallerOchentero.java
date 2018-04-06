package com.es.everis.beca.tallerochenteroadrian;

import java.util.ArrayList;
import java.util.List;

import com.es.everis.beca.tallerochenteroadrian.modelo.Empleado;
import com.es.everis.beca.tallerochenteroadrian.modelo.Mecanico;


/**
 * Clase contendora del Taller. Almacena las instancias de las clases del modelo de negocio.
 */
public class TallerOchentero {

  private static TallerOchentero taller;

  //private List<Mesa> mesas;
  private List<Empleado> empleados;

  private TallerOchentero() {
    empleados = new ArrayList<>();
    inicializarTaller();
  }

  public static TallerOchentero getInstance() {
    if(taller == null) {
    	taller = new TallerOchentero();
    }
    return taller;
  }

  public List<Empleado> getEmpleados() {
    return empleados;
  }

  public void setEmpleados(List<Empleado> empleados) {
    this.empleados = empleados;
  }

  private void inicializarTaller() {

    empleados.add(new Mecanico());
    empleados.add(new Mecanico());
    empleados.add(new Mecanico());

  }
}
