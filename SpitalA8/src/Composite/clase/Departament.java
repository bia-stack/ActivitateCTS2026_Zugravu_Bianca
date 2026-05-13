package Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura {
    private String departament;
    List<IStructura> subStruct ;

    public Departament(String departament) {
        this.departament = departament;
        this.subStruct = new ArrayList<>();
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Nume departament: "+departament);
        for(IStructura structura:subStruct){
            structura.afiseazaDetaliiStructura();
        }
    }

    public void adaugaNod(IStructura structura){
        subStruct.add(structura);
    }

    public void stergeNod(IStructura structura){
        subStruct.remove(structura);
    }

    IStructura getNod(int poz){
        return subStruct.get(poz);
    }
}
