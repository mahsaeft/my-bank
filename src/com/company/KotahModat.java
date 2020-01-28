package com.company;

public class KotahModat extends Account {
    public KotahModat(int meghdaraAvali){
        super(meghdaraAvali);
    }

    @Override
    public void variz(int x) throws varizExp {
        if (x<=0){
            throw new varizExp("mablagh namotabar ast");
        }
        else if(x>=30000000){
            throw new varizExp("mablagh bishaz hade mojaz ast ");
        }
        else {
            super.mojodi+=x;
            System.out.println("amaliat anjam shod\nmojodie jadid:"+ super.mojodi);
        }
    }

    @Override
    public void bardasht(int x) throws bardashtExp {
        if(x>super.mojodi){
            throw new bardashtExp("adame kefayate mojodi");
        }
        else  if(x<=0){
            throw new bardashtExp("mablagh namotabar ast");
        }
        else if(x>=3000000){
            throw new bardashtExp("mablagh bishaz hade mojaz ast");
        }
        else {
            super.mojodi-=x;
            System.out.println("amaliat anjam shod\nmojodie jadid:"+ super.mojodi);
        }

    }

    @Override
    public void sood(int x) {

    }
}
