package functionInterface;

import Datos.Student;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class UnaryOperatorEjemplo {

    //sirve cuando el input y output son del mismo tipo
    static UnaryOperator<String> unaryOperator = (texto) -> texto.concat(" agregado");

    static Comparator<Integer> comparatorNro = (nro1,nro2) -> nro1.compareTo(nro2);

    static Predicate<Character> p11 = (nro) -> nro == 48;

    static Function<Integer, Integer> nroDeCeros = (nro) -> {
        String conversion = nro.toBinaryString(nro);
        Integer cantidad = 0, mayor = 0;
        for(Character c: conversion.toCharArray()){
            if(p11.test(c)){
                cantidad += 1;
                if(mayor < cantidad) mayor = cantidad;
            }else {
                cantidad = 0;
            }
        }
        return mayor;
    };

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a,b) -> a * b;

        System.out.println("resultado binary operator: " + binaryOperator.apply(12,9));

        //usamos maxBy
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparatorNro);
        System.out.println("Resultado maxBy: " + maxBy.apply(454511,221214));

        //usamos minBy
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparatorNro);
        System.out.println("Resultado minBy: " + minBy.apply(2334,2322));

        System.out.println("Integer - binario: " + nroDeCeros.apply(210011));
    }

}
