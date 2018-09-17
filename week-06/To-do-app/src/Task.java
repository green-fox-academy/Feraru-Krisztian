import java.time.Duration;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.*;

public class Task {

    private String name;
    private boolean isDone;
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    public Task(String name, int id, LocalDateTime createdAt, LocalDateTime completedAt, boolean isDone) {
        this.id = id;
        this.isDone = isDone;
        this.name = name;
        this.createdAt = createdAt;
        this.completedAt = completedAt;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setCompletedAt() {
        this.completedAt = now();
    }

    public int getId() {
        return id;
    }

    public void setDone(boolean done) {
        isDone = done;
    }


    public String completionTime() {
        Duration timebetween = Duration.between(createdAt, completedAt);
        long durationSec = Math.abs(timebetween.getSeconds());
        long sec = 1;
        long min = sec * 60;
        long hour = min * 60;
        long day = hour * 24;
        long days = durationSec / day;
        durationSec = durationSec % day;
        long hours = durationSec / hour;
        durationSec = durationSec % hour;
        long minutes = durationSec / min;
        durationSec = durationSec % min;
        long seconds = durationSec / sec;
        durationSec = durationSec % sec;
        String duration = ", completed in " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds";

        return duration;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getName() {
        return name;
    }

    public String isCompleted() {
        if (completedAt == null) {
            return "null";
        }
        return completedAt.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (isDone) {
            return id + " - [X] " + name + completionTime();
        }
        return id + " - [ ] " + name;
    }
}
