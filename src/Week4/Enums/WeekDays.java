package Week4.Enums;

public enum WeekDays {

    // Haftanın günlerini enum sabitleri olarak tanımlayalım ve çalışma saatlerini de içine atayalım.

    MONDAY ("08:30 - 14:30"),
    TUESDAY ("06:00 - 12:00"),
    WEDNESDAY ("14:30 - 20:30"),
    THURSDAY ("12:00 - 18:00"),
    FRIDAY ("20:30 - 03:30"),
    SATURDAY("03:30 - 09:30"),
    SUNDAY ("09:00 - 17:00");

    private final String shiftHours;


    // Constructor;

    WeekDays(String shiftHours) {
        this.shiftHours = shiftHours;
    }

    // shiftHours için getter metodu;

    public String getShiftHours() {
        return shiftHours;
    }
}
