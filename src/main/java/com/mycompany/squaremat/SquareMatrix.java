package com.mycompany.squaremat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;
/**
 *
 * @author Nicolas, Ayose
 */
public class SquareMatrix {
    private double[][] Matriz;
    private double min;
    private double max;
    public SquareMatrix(int Index, double min, double max){
        Matriz = new double[Index][Index];
        this.min = min;
        this.max = max;
        Initialize(min, max);
    }
    
    private void Initialize(double Min, double Max){
        for (int i = 0; i<Matriz.length; i++){
            for (int j = 0; j<Matriz.length; j++){
                Matriz[i][j] = Math.random()*Max + Min;
            }
        }
    }
    public double getMax(){
        return max;
    }
    public double getMin(){
        return min;
    }
    
    @Override
    public String toString(){
        String a = "Minimo: " + this.min + " Maximo: " + this.max + "\n";
        for (int i = 0; i<Matriz.length; i++){
            a = a + "(";
            for (int j = 0; j<Matriz.length; j++){
                if (j != Matriz.length - 1){a=a + String.format("%05.2f",Matriz[i][j]) + " ";} 
                else{a = a + String.format("%05.2f",Matriz[i][j]) + "";}
            }
            a = a +")\n";
        }
        return a;
    }
    public String toString(int mini, int maxi){
        String a = "Minimo: " + mini + " Maximo: " + maxi + "\n";
        String insert = "";
        for (int i = 0; i<Matriz.length; i++){
            a = a + "(";
            for (int j = 0; j<Matriz.length; j++){
                if (Matriz[i][j] <(double) mini || Matriz[i][j] >(double) maxi){insert = "-";}
                else{insert = String.format("%05.2f",Matriz[i][j]);}
                if (j != Matriz.length - 1){a=a+insert+"  ";} 
                else{a = a+ insert + "";}
            }
            a = a + ")\n";
            
        }
        System.out.print(a);
        return a;
    }
}
