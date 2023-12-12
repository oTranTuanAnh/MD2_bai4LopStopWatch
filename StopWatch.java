import java.time.LocalTime;

public class StopWatch {
    LocalTime startTime, endTime;

    public StopWatch() {
        this.startTime = LocalTime.now();
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime start(){
        return this.startTime = LocalTime.now();
    }

    public LocalTime end(){
        return this.endTime = LocalTime.now();
    }

    public int getElapsedTime(){
        return ((this.startTime.getHour()-this.endTime.getHour())*60*60+(this.startTime.getMinute()-this.endTime.getMinute())*60+(this.startTime.getSecond()-this.endTime.getSecond()))*1000
                ;
    }
}
