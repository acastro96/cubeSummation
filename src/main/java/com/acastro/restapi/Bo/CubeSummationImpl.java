/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acastro.restapi.Bo;

import com.acastro.restapi.dao.IOperacionDao;
import com.acastro.restapi.dao.OperacionDaoImpl;
import com.acastro.restapi.model.Operacion;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class CubeSummationImpl implements ICubeSummation{

    @Override
    public String resolveCube(String dataInput) {
        
        Operacion operacion = new Operacion();
        operacion.setDatosEntrada(dataInput);
        
        String lines[] = dataInput.split("\\r?\\n");
        
        int x1, y1, z1, x2, y2, z2, pos = 1;
        String[] arrayDataCase;
        String[] arrayData;
        HashMap<String, Long> matrizVal;
        
        int numberTestCases = Integer.parseInt(lines[0]);
        
        for(int i=0; i<numberTestCases; i++){
            
            matrizVal = new HashMap<>();

            String testCase = lines[pos];
            
            arrayData = testCase.split(" ");

            int numberOperations = Integer.valueOf(arrayData[1]);

            for(int j=0; j<numberOperations; j++){
                pos++;
                String matrizCase = lines[pos];

                if(matrizCase.contains("UPDATE")){
                    
                    arrayDataCase = matrizCase.split(" ");
                    
                    x1 = Integer.valueOf(arrayDataCase[1]);
                    y1 = Integer.valueOf(arrayDataCase[2]);
                    z1 = Integer.valueOf(arrayDataCase[3]);

                    long value = Long.valueOf(arrayDataCase[4]);

                    String key = x1 + " " + y1 + " " + z1;

                    matrizVal.put(key, value);
                    
                }else if(matrizCase.contains("QUERY")){
                    
                    arrayDataCase = matrizCase.split(" ");

                    x1 = Integer.valueOf(arrayDataCase[1]);
                    y1 = Integer.valueOf(arrayDataCase[2]);
                    z1 = Integer.valueOf(arrayDataCase[3]);

                    x2 = Integer.valueOf(arrayDataCase[4]);
                    y2 = Integer.valueOf(arrayDataCase[5]);
                    z2 = Integer.valueOf(arrayDataCase[6]);

                    long sum = 0;

                    for(Map.Entry<String, Long> entry : matrizVal.entrySet()){

                        int x, y, z;

                        String[] arrayKey = entry.getKey().split(" ");
                        x = Integer.parseInt(arrayKey[0]);
                        y = Integer.parseInt(arrayKey[1]);
                        z = Integer.parseInt(arrayKey[2]);

                        if((x>=x1 && x<=x2) && (y>=y1 && y<=y2) && (z>=z1 && z<=z2)){
                            sum += entry.getValue();
                        }
                    }

                    System.out.println(sum);
                }
            }
            pos++;
        }
        
        
        
        return "";
    }

    @Override
    public String guardarCube(Operacion operacion) throws Exception  {
        IOperacionDao daoOperacion = new OperacionDaoImpl();
        
        if(operacion.getDatosEntrada().equalsIgnoreCase("")){
            throw new Exception("Los datos de entrada no pueden estar vacios");
        }
        
        return daoOperacion.saveCube(operacion);
        
    }
    
}
