/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvchenry;

import Vista.*;
import Controlador.*;
/**
 *
 * @author Dell
 */


public class MvcHenry {

    public static void main(String[] args) {
        VistaMP vista = new VistaMP();
        ControllerMP controller = new ControllerMP(vista);
        controller.iniciaControl();
    }
}

