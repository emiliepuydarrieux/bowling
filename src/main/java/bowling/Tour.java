package bowling;

import java.util.ArrayList;

public class Tour {
    private ArrayList<Lancer> lancers = new ArrayList<>();
    private boolean isLastTour = false;

    public Tour(boolean isLastTour) {
        this.isLastTour = isLastTour;
    }


    public boolean strike(){
        return lancers.size()==1 && lancers.get(0).getQuillesAbattues()==10;
    }

    public boolean spare(){
        if (lancers.size()==2 && lancers.get(0).getQuillesAbattues()+lancers.get(1).getQuillesAbattues()==10 && lancers.get(0).getQuillesAbattues()!=10){
            return true;
        }
        return false;

    }
    
    public boolean termine(){
        if (!isLastTour){
            if(strike()){
                return true;
                }
                return lancers.size()==2;
            
        
        }
        if (isLastTour) {
            if (strike()) {
                return lancers.size() == 3;
            }
            if (spare()) {
                return lancers.size() == 3;
            }
            return lancers.size() == 2;
        }

        return false;
    }


    public void ajoutLancer(int quillesAbattues){
        lancers.add(new Lancer(quillesAbattues));
    }

    public int numLancerCourant(){
        return lancers.size();
    }

    public ArrayList<Integer> getLancers() {
        ArrayList<Integer> quilles = new ArrayList<>();
        for (Lancer lancer : lancers) {
            quilles.add(lancer.getQuillesAbattues());
        }
        return quilles;
    } 


}


