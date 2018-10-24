class Pig implements Animal {     
    private String mySpecies;
    private String mySound;
    public Pig(String species, String sound){
    	mySpecies = species;
    	mySound = sound;
    }
    public Pig() {         
        mySpecies = "unknown";         
        mySound = "unknown";     
     }   
    public String getType(){
    	return mySpecies;
    }
    public String getSound(){
    	return mySound;
    }
}
