package repository.model.entity;

import java.time.LocalTime;

public class HourEvent extends BaseEntity {
    private LocalTime time;
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

    @Override
    public String toString() {
        return "HourEvent{" +
                "time=" + time +
                ", healthService=" + healthService +
                '}';
    }
}
