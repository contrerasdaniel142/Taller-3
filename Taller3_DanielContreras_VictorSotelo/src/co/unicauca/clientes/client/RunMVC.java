package co.unicauca.clientes.client;

import co.unicauca.clientes.controller.GUIBusquedaClientesController;
import co.unicauca.clientes.modelo.ClientesDB;
import co.unicauca.clientes.vista.GUIBusquedaClientes;
import co.unicauca.clientes.vista.GUIClientesProfesion;
import co.unicauca.clientes.vista.GuiBarra;
import co.unicauca.clientes.vista.GuiGenero;

/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano
 */
public class RunMVC {

    public RunMVC() {
        //create Model and View

        ClientesDB myModel = new ClientesDB();
        
        GUIBusquedaClientes myView = new GUIBusquedaClientes(400, 50);
        GUIClientesProfesion myView2 = new GUIClientesProfesion(400,250);
        GuiGenero View3=new GuiGenero(400,450);
        GuiBarra View4=new GuiBarra(700,450);
        


        myModel.addObserver(myView);
        myModel.addObserver(myView2);
        myModel.addObserver(View3);
        myModel.addObserver(View4);

        GUIBusquedaClientesController myController = new GUIBusquedaClientesController();
        myController.addModel(myModel);
        myController.addView(myView);
        myController.addView2(View3);
        myController.addView3(View4);
                
        
        myView.addController(myController);
    }

}
