package Adapter;

import ProgramSpital.Medicament;

public class AdaptorSpital extends ProgramFarmacie.Medicament {
    private Medicament medicament;


    public AdaptorSpital(Medicament medicament, float pret) {
        super(medicament.getNume(), pret);
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
