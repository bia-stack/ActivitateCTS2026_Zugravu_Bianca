import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<Command> listaComenzi = new ArrayList<>();

    public void adaugaComanda(Command comanda){
        listaComenzi.add(comanda);
    }

    public void executaComanda(){
        if(listaComenzi.size()>0){
            listaComenzi.get(0).pleacaInCursa();
            listaComenzi.remove(0);
        }
    }
}
