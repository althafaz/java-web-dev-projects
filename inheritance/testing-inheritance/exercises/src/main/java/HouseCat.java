public class HouseCat extends Cat {
    private final String name;
    private final String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}