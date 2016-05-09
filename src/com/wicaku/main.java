/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wicaku;

import java.util.HashMap;
import libsvm.svm;
import libsvm.svm_model;
import libsvm.svm_node;

/**
 *
 * @author wicaku
 */
public class main {

    int predict(HashMap<Integer, Double> input, String modelFile) {
        int predictedClass = 0;
        try {
            //Need Model
            svm_model model = svm.svm_load_model(modelFile);

            // Format the data for processing by LibSVM
            svm_node[] x = new svm_node[input.size()];

            int i = 0;
            for (Integer attributeIndex : input.keySet()) {
                x[i] = new svm_node();
                x[i].index = attributeIndex;
                x[i].value = input.get(attributeIndex);
                i++;
            }

            //result of the prediction
            predictedClass = (int) svm.svm_predict(model, x);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return predictedClass;
    }

    public void translateHD(int predictedClass) {
        //using switch syntax to case switch
        /*switch (predictedClass) {
        case 0:
        System.out.println("The Hardisk of the instance is Working.");
        case 1:
        System.out.println("The Hardisk of the instance is Failing.");
        default:
        System.out.println("unknown: an error has occured");
        }*/
        if (predictedClass == 200) {
            System.out.println("The Hardisk of the instance is Working. ");
        } else if (predictedClass == 500) {
            System.out.println("The Hardisk of the instance is Failing. ");
        } else {
            System.out.println("unknown: an error has occured");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        HashMap input = new HashMap();

        int inputData = 200; //working
        //int inputData = 500; //fail

        //fail data
        if (inputData == 500) {
            input.put(1, 1814.0);
            input.put(2, 0.0);
            input.put(3, 90.0);
            input.put(4, 30065229834.0);
            input.put(5, 0.0);
            input.put(6, 0.0);
            input.put(7, 0.0);
            input.put(8, 0.0);
        }

        //working data
        if (inputData == 200) {
            input.put(1, 0.0);
            input.put(2, 0.0);
            input.put(3, 0.0);
            input.put(4, 0.0);
            input.put(5, 0.0);
            input.put(6, 0.0);
            input.put(7, 0.0);
            input.put(8, 0.0);
        }

        System.out.println(input);

        String modelFile = "mClass.model";

        main app = new main();
        int predictedClass = app.predict(input, modelFile);
        app.translateHD(predictedClass);
    }

}
