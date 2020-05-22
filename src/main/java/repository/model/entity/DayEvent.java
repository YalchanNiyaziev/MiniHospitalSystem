package repository.model.entity;


import java.time.LocalDate;
import java.util.List;

public class DayEvent extends BaseEntity {
    private LocalDate date;
    private List<HourEvent> hourEventList;

    public DayEvent() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<HourEvent> getHourEventList() {
        return hourEventList;
    }

    public void setHourEventList(List<HourEvent> hourEventList) {
        this.hourEventList = hourEventList;
    }

    @Override
    public String toString() {
        return "DayEvent{" +
                "date=" + date +
                ", hourEventList=" + hourEventList +
                '}';
    }
}
