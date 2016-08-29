package com.example.mitchelle.mitch.utils;

import com.squareup.otto.Bus;

/**
 * Created by mitchelle on 8/27/16.
 */
public class EventBus extends Bus {
    public static final EventBus bus  =  new EventBus();

    public static Bus getInstance(){
        return bus;
    }
    private EventBus(){}
}
