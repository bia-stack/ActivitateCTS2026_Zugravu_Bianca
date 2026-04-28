package Spital.clase;

public class Salon {

    private boolean patLiber[] = new boolean[5];

    public Salon() {
        this.patLiber[2] = true;
        this.patLiber[3] = true;
    }

    public int getPatLiber() {
        for(int i = 0; i < patLiber.length;i++){
            if(patLiber[i]){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int indexPat) {
        this.patLiber[indexPat] = false;
    }
}
