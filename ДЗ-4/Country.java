package Countys;

public enum Country implements ICountrys{
    RUSSIA(17075200, 143420300), CANADA(9976140, 32805000),
    USA(9629091, 295734100), CHINA(9596960, 1306313800),
    BRAZIL(8511965, 186112800), AUSTRALIA(7686850, 20090400),
    ITALY(301230, 58103000), BELARUS(207600, 10300500),
    FRANCE(547030, 60656200), GERMANY(357021, 82431400);
    private int area;
    private int population;

    Country(int area, int population) {
        this.area = area;
        this.population = population;
    }
    public int getArea() {
        return area;
    }
    public int getPopulation() {
        return population;
    }
    public static Country valueOfIgnoreCase(String CountryName) {
        return valueOf(CountryName.toUpperCase());
    }

}