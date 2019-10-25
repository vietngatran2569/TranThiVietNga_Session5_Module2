package animalAndEdible.fruit;

public class AbstractAndInterfaceJuice {
    public static void main(String[] args) {
        Fruit[] fruits=new Fruit[2];
        fruits[0]= new Orange();
        fruits[1]=new Apple();

        for(Fruit a:fruits){
            System.out.println(a.howToEat());
        }
    }


}
