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
public class main implements com.wicaku.statusInterface {

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

    public String translateHD(int predictedClass) {
        //using switch syntax to case switch
        /*switch (predictedClass) {
        case 0:
        System.out.println("The Hardisk of the instance is Working.");
        case 1:
        System.out.println("The Hardisk of the instance is Failing.");
        default:
        System.out.println("unknown: an error has occured");
        }*/
        switch (predictedClass) {
            case 200:
                return "The Hardisk of the instance is Working.";
            case 500:
                return "The Hardisk of the instance is Failing.";
            default:
                return "unknown: an error has occured";
        }
    }

    private static void test() {
        HashMap input = new HashMap();
        main app = new main();
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
            input.put(1, 1.0);
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

        int predictedClass = app.predict(input, modelFile);
        System.out.println(app.translateHD(predictedClass));
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //test();
    }

    @Override
    public String mCheckStatus() {
        HashMap input = new HashMap();
        main app = new main();
        String printOut;

        input.put(1, 1.0); //5
        input.put(2, 0.0); //10
        input.put(3, 0.0); //187
        input.put(4, 0.0); //188
        input.put(5, 0.0); //197
        input.put(6, 0.0); //198
        input.put(7, 0.0); //200
        input.put(8, 0.0); //201

        printOut = "inputed value : "
                + input.toString().toUpperCase()
                + "\n";

        String modelFile = "mClass.model";

        int predictedClass = app.predict(input, modelFile);
        printOut = printOut + app.translateHD(predictedClass) + "\n";

        return printOut;
    }

    @Override
    public String mCheckStatus(Double i5, Double i187, Double i188, Double i197, Double i198) {
        HashMap input = new HashMap();
        main app = new main();
        String printOut;

        input.put(1, i5); //5
        input.put(2, 0.0); //10
        input.put(3, i187); //187
        input.put(4, i188); //188
        input.put(5, i197); //197
        input.put(6, i198); //198
        input.put(7, 0.0); //200
        input.put(8, 0.0); //201

        printOut = "inputed value : "
                + input.toString().toUpperCase()
                + "\n";

        String modelFile = "mClass.model";

        int predictedClass = app.predict(input, modelFile);
        printOut = printOut + app.translateHD(predictedClass) + "\n";

        return printOut;
    }

    @Override
    public String mCheckStatus(Double i5, Double i10, Double i187, Double i188, Double i197, Double i198, Double i200, Double i201) {
        HashMap input = new HashMap();
        main app = new main();
        String printOut;

        input.put(1, i5); //5
        input.put(2, i10); //10
        input.put(3, i187); //187
        input.put(4, i188); //188
        input.put(5, i197); //197
        input.put(6, i198); //198
        input.put(7, i200); //200
        input.put(8, i201); //201

        printOut = "inputed value : "
                + input.toString().toUpperCase()
                + "\n";

        String modelFile = "mClass.model";

        int predictedClass = app.predict(input, modelFile);
        printOut = printOut + app.translateHD(predictedClass) + "\n";

        return printOut;
    }
}
