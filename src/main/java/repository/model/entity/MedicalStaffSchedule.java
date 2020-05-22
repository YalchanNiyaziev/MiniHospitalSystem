package repository.model.entity;

import repository.model.entity.enums.MonthType;

import java.util.List;

public class MedicalStaffSchedule extends BaseEntity{

    private MonthType month;
    List<DayEvent> dayEvents;

    public MedicalStaffSchedule() {
    }

    public MonthType getMonth() {
        return month;
    }

    public void setMonth(MonthType month) {
        this.month = month;
    }

    public List<DayEvent> getDayEvents() {
        return dayEvents;
    }

    public void setDayEvents(List<DayEvent> dayEvents) {
        this.dayEvents = dayEvents;
    }

    @Override
    public String toString() {
        return "MedicalStaffSchedule{" +
                "month=" + month +
                ", dayEvents=" + dayEvents +
                '}';
    }
}
