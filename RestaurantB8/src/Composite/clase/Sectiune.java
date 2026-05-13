package Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IStructura{
    private String denumire;
    List<IStructura> subSectiune;

    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.subSectiune=new ArrayList<>();
    }

    @Override
    public void afiseazaDetaliiStructura(String spatiu) {
        System.out.println("Denumire sectiune:"+denumire);
        for(IStructura structura: subSectiune){
            structura.afiseazaDetaliiStructura("\n");
        }
    }

    public void adaugaNod(IStructura structura){
        subSectiune.add(structura);
    }

    public void stergeNod(IStructura structura){
        subSectiune.remove(structura);
    }

    public IStructura getNod(int poz){
        return subSectiune.get(poz);
    }
}
