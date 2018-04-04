/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.TxtHandlerInterface;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author fernandocardoce
 */
public class TxtHandler implements TxtHandlerInterface{
    @Override
    public void cargar(ArrayList<String> list) {
        String csvFile = fileChooser();
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error "+e);
        }
    }
    
    @Override
    public float procesar(ArrayList<String> list) {
        float total = 0;
        try {
            String cvsSplitBy = ",";
            for (int i = 0; list.size() > i; i++) {
                String[] data = list.get(i).split(cvsSplitBy);
                int num1 = Integer.parseInt(data[0]);
                char op = data[1].charAt(0);
                int num2 = Integer.parseInt(data[2]);
                total += calcular(num1, op, num2);
            }

        } catch (NumberFormatException e) {
            System.out.println("Error "+e);
        }
        return total;
    }
    
    @Override
    public void guardar(float value) {
        String file = fileChooser();
        String total = String.valueOf(value);
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("El gran total de la operacion es: "+value);
            bufferedWriter.close();
       } catch(IOException ex){
            System.out.println(ex.toString());
       }
        
    }
    
    
    
    
//    PRIVATE METHODS
    private float calcular(int numero1, char operacion, int numero2) {
        float totalParcial = 0;
        switch (operacion) {
            case '+':
                totalParcial = numero1 + numero2;
                return totalParcial;
            case '-':
                totalParcial = numero1 - numero2;
                return totalParcial;
            case '*':
                totalParcial = numero1 * numero2;
                return totalParcial;
            case '/':
                try {
                    totalParcial = numero1 / numero2;
                    return totalParcial;
                } catch (ArithmeticException e) {
                    System.out.println("Error " + e);
                }
        }
        return totalParcial;
    }
    
    private String fileChooser() {
        String fileName = "";
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            fileName = selectedFile.getAbsolutePath();
        }
        return fileName;
    }


   
    
}
