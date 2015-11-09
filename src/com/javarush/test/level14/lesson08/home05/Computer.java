package com.javarush.test.level14.lesson08.home05;

/**
 * Created by inatoff on 26.10.2015.
 */
public class Computer
{
    private Keyboard keyboard;

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    private Monitor monitor;

    public Monitor getMonitor()
    {
        return monitor;
    }

    private Mouse mouse;

    public Mouse getMouse()
    {
        return mouse;
    }

    public Computer()
    {
        this.monitor = new Monitor();
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
    }

}
