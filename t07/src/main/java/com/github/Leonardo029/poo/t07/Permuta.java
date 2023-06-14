package com.github.Leonardo029.poo.t07;

public class Permuta {
    public static void Permutacao(String p, String S){
        if(S.length() == 1){
            System.out.println(p+S);
        }
        else{
            String Slinha;
            String pLinha;

            for(int i=0; i< S.length(); i++){
                SLinha = S.substring(0,i) + S.substring(i+i);
                pLinha = p+S.charArt(i);
                Permutacao(pLinha, Slinha);
            }
        }
    }

    public static void main(String[] args){
        Permutacao(new String(), args[0]);
    }
}