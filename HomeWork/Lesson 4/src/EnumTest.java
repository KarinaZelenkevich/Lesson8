public enum EnumTest {
    Декабрь ("зима", "декабрь"),
    Январь ("зима", "январь" ),
    Февраль ("зима", "февраль"),
    Март("весна", "март"),
    Апрель("весна", "апрель"),
    Май("весна", "май"),
    Июнь("лето", "июнь"),
    Июль("лето", "июль"),
    Август("лето", "август"),
    Сентябрь("осень", "сентябрь"),
    Октябрь("осень", "октябрь"),
    Ноябрь("осень", "ноябрь");

    private String season;
    private String month;

    EnumTest(String season, String month) {
        this.season = season;
        this.month = month;
    }

    public void printSeason(){
        System.out.println(month + " это " + season);
    }
}

