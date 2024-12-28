package fr.chocapiks.gamemanagerapi.core.events;

import fr.chocapiks.gamemanagerapi.core.Event;
import fr.chocapiks.gamemanagerapi.utils.AsyncTimer;

//When Timer Resumed
public class TimerResumed extends Event {
    private final AsyncTimer asyncTimer;

    public TimerResumed(AsyncTimer asyncTimer) {
        this.asyncTimer = asyncTimer;
    }

    public AsyncTimer getAsyncTimer() {
        return asyncTimer;
    }

    public int getDuration() {
        return asyncTimer.getDuration();
    }
    public long getRemainingTime() {
        return asyncTimer.getRemainingTime();
    }

    public String getName() {
        return asyncTimer.getName();
    }

}
