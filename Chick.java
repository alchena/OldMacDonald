class Chick implements Animal {     
    private String mySpecies;
    private String mySound;
    public Chick(String species, String sound){
    	mySpecies = species;
    	mySound = sound;
    }
    public Chick() {         
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
