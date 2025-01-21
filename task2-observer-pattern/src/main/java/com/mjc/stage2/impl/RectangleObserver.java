package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {

    @Override
    public void handleEvent(RectangleEvent rectangleEvent) {
        Rectangle rectangle = rectangleEvent.getSource();

        RectangleWarehouse warehouse = RectangleWarehouse.getInstance();

        double newPerimeter = 2 * (rectangle.getSideA() + rectangle.getSideB());
        double newArea = rectangle.getSideA() * rectangle.getSideB();

        warehouse.put(rectangle.getId(), new RectangleValues(newPerimeter, newArea));
    }
}