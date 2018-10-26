class NamedCow extends Cow{
	private String myName;
	public NamedCow(String name, String species, String sound){
		myName = name;
		mySpecies = species;
		mySound = sound;
	}
	public String getName(){
		return myName;
	}
}