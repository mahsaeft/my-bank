package com.company;

public abstract class  Account  {
    int mojodi;
    public Account(int meghdreAvali){
        this.mojodi=meghdreAvali;
    }
    public abstract void variz(int x)throws varizExp;
    public abstract void bardasht(int x) throws bardashtExp;
    public abstract void sood(int x);

}
