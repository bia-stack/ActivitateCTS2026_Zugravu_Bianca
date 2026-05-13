package Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IStructura {
   private String denumire;
   List<IStructura> subSectiune;

    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.subSectiune = new ArrayList<>();
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Denumire sectiune:"+this.denumire);
        for(IStructura structura:subSectiune){
            structura.afiseazaDetaliiStructura();
        }
    }

    public void adaugaNod(IStructura structura){
        subSectiune.add(structura);
    }

    public void stergeNod(IStructura structura){
        subSectiune.remove(structura);
    }

    public IStructura afiseazaPozitieNod(int poz){
        return subSectiune.get(poz);
    }
}
