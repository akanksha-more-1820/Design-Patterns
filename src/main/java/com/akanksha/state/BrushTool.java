package com.akanksha.state;

public class BrushTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Brush Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a lin");
    }
}