import java.util.Arrays;
class Pokemon{
  String name;
  int power;
  public Pokemon(String name, int power){
    this.name=name;
    this.power=power;
  }
  public static void main(String args[]){
    PokemonComparator[] pcArr = new PokemonComparator[4];
    pcArr[0]= new PokemonComparator("Bulbasaur",3);
    pcArr[1]= new PokemonComparator("charmendor",7);
    pcArr[2]= new PokemonComparator("Mewton",153);
    pcArr[3]= new PokemonComparator("Jiglypuff",54);
    Arrays.sort(pcArr);
    System.out.println("Default array" + Arrays.toString(pcArr));
    Arrays.sort(pcArr,PokemonComparator.powerComp);
    System.out.println("sorted with power" + Arrays.toString(pcArr));
    Arrays.sort(pcArr, PokemonComparator.powerComp);
    System.out.println("Sorted with name" + Arrays.toString(pcArr));

  }
}
