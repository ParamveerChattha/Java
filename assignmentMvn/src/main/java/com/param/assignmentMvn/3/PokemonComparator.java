import java.util.Comparator;
public class PokemonComparator implements Comparable<PokemonComparator>{
private String name;
private int power;
public String getName(){
  return name;
}
public int getPower(){
  return power;
}

public PokemonComparator(String name, int power){
  this.name = name;
  this.power= power;
}
public int compareTo(PokemonComparator pc){
  return 1;
}

public String toString(){
  return "name has " + this.name + "power of " + this.power;
}

public static Comparator<PokemonComparator> powerComp = new  Comparator<PokemonComparator>(){
  public int compare(PokemonComparator pc1, PokemonComparator pc2){
  return (int) (pc1.getPower() - pc2.getPower());
  }
  };
public static Comparator<PokemonComparator> nameComp = new Comparator<PokemonComparator>(){
  public int compare(PokemonComparator pc1, PokemonComparator pc2){
  return (int) (pc1.getName().compareTo(pc2.getName()));
}
};
}
