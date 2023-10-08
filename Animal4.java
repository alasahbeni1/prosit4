
public class Animal4 {

    String family, name;
    int age;
    boolean isMammal;

    public Animal4() {

    }

    public Animal4(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public String getFamily(){
        return family;
    }

    public void setFamily(String family)
    {
        this.family=family;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age)
    {
        if(age>0)
        { this.age=age;}
    }

    public boolean getIsMammal()
    {
        return isMammal;
    }

    public void setIsMammal(boolean isMammal)
    {
        this.isMammal=isMammal;
    }
}




