class Chick implements Animal {     
    private String mySpecies;
    private String mySound;
    private int random = (int)(Math.random()* 2);
    public Chick(String species, String sound, String soundTwo){
        if (random > 0){
           mySound = soundTwo;
        }else{
           mySound = sound;
        }
    	mySpecies = species;
    }
    public String getType(){
        return mySpecies;
    }
    public String getSound(){
    	return mySound;
    }
}
