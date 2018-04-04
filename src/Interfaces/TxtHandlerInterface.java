/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author fernandocardoce
 */
public interface TxtHandlerInterface {
    public void cargar(ArrayList<String> list);
    public float procesar(ArrayList<String> list);
    public void guardar(float value);
}
