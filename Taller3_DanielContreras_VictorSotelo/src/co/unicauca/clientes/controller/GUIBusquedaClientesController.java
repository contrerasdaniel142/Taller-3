package co.unicauca.clientes.controller;

import co.unicauca.clientes.modelo.ClientesDB;
import co.unicauca.clientes.vista.GUIBusquedaClientes;
import co.unicauca.clientes.vista.GuiBarra;
import co.unicauca.clientes.vista.GuiGenero;
import java.awt.event.ActionEvent;

/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano Controlador de la
 * GUIBusquedaClientes. Es la unica que tiene un controlador porque cambia el
 * estado del modelo. Las otras GUIs tienen el controlador dentro de la misma
 * vista.
 */
public class GUIBusquedaClientesController implements java.awt.event.ActionListener {

    private ClientesDB modelo;
    private GUIBusquedaClientes vista;
    private GuiGenero vista2;
    private GuiBarra vista3;

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        modelo.buscarClientesPorProfesion(vista.getProfesion());
        modelo.calcularPorcentajes();
        vista2.update(modelo, vista2);
        vista3.update(modelo,vista3);
        
      
        
        
    }

    public void addModel(ClientesDB m) {
        this.modelo = m;
    }

    public void addView(GUIBusquedaClientes v) {
        this.vista = v;
    }
        
    public void addView2(GuiGenero genero)
    {
        this.vista2 = genero;
    }
    public void addView3(GuiBarra estadistica){
        this.vista3 = estadistica;
    }

}
