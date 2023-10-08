public class zoo4 {
    final int NBR_CAGES_MAX = 25;

    Animal4[] cages;
    Animal4[] animals;
    String name, city;

    int nbrCages;
    int nbrAnimals;



    public zoo4() {
        cages = new Animal4[NBR_CAGES_MAX];
        nbrAnimals =0;


    }
    boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES_MAX;

    }
    public int getnbrAnimals() {
        return nbrAnimals;
    }
    public zoo4  comparerZoo( zoo4 z1, zoo4 z2) {

        if (z1.getnbrAnimals() > z2.getnbrAnimals()) return z1;
        else {
            return z2;
        }
    }




    public zoo4(String name, String city, int nbrCages) {
        animals = new Animal4[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages);
    }

    boolean addAnimal(Animal4 animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (nbrAnimals == nbrCages)
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    boolean removeAnimal(Animal4 animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal4 animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages/Animals: " + nbrCages;
    }





    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city=city;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public int getNbrAnimals()
    {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals)
    {
        this.nbrAnimals=nbrAnimals;
    }

    public Animal4[] getAnimals()
    {
        return animals;
    }

    public void setAnimals(Animal4[] animals)
    {
        this.animals=animals;
    }
}