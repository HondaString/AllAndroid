package com.infinite.livedatajava;

import android.os.SystemClock;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Timer;
import java.util.TimerTask;

public class MainViewModel extends ViewModel {

    private static final int ONE_SECOND = 1000;

    private final long mInitialTime;
    private final MutableLiveData<Long> mElapsedTime = new MutableLiveData<>();

    public MainViewModel() {
        mInitialTime = SystemClock.elapsedRealtime();
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                final long newValue = (SystemClock.elapsedRealtime() - mInitialTime) / 1000;

                mElapsedTime.postValue(newValue);
            }
        }, ONE_SECOND, ONE_SECOND);
    }

    LiveData<Long> getElapsedTime() {
        return mElapsedTime;
    }
}
