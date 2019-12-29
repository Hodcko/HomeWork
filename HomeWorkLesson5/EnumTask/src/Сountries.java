import api.ICountries;

enum Countries implements ICountries, Comparable<Countries> {
    BELARUS(207592, 9508000), RUSSIA(171100000, 144500000),
    UKRAINE(603628, 42220000), POLAND(312679, 38645000),
    LITHUANIA(65300, 2794000), LATVIA(64589, 1920000),
    ESTONIA(45226, 1325000), GERMANY(357386, 82790000),
    FRANCE(643801, 66990000), ITALY(301338, 60480000);

    private int area;
    private int population;


    Countries(int area, int population){
        this.area = area;
        this.population = population;
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPopulation() {
        return population;
    }


    public int compare(Countries anotherCountries){
        if (this.area == anotherCountries.getArea()) {
            return 0;
        } else if (this.area < anotherCountries.getArea()) {
            return -1;
        } else {
            return 1;
        }
    }
}
