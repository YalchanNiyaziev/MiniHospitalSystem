package model.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name="hour_events")
public class HourEvent extends BaseEntity {
    @Column
    private LocalTime time;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="day_event")
    private DayEvent dayEvent;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "health_service", referencedColumnName = "id",unique = true)
    private HealthService healthService;

    public HourEvent() {
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public HealthService getHealthService() {
        return healthService;
    }

    public void setHealthService(HealthService healthService) {
        this.healthService = healthService;
    }

    public DayEvent getDayEvent() {
        return dayEvent;
    }

    public void setDayEvent(DayEvent dayEvent) {
        this.dayEvent = dayEvent;
    }

    @Override
    public String toString() {
        return "HourEvent{" +
                "time=" + time +
                ", healthService=" + healthService +
                '}';
    }
}
