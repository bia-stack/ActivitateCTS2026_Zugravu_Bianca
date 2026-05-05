package ro.ase.cts.Command.personalMedical;

import ro.ase.cts.Command.comenzi.Command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> commandList = new ArrayList<>();

    public void inregistreaza(Command comanda){
        commandList.add(comanda);

    }

    public void executaComanda(){
        if(commandList.size()>0){
            commandList.get(0).executa();
            commandList.remove(0);
        }

    }


}
