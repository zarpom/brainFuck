package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import oop.model.Memory;

public class MemoryTest {
    private Memory memoryModel = Memory.getInstance();

    @Test
    public void getCurrentMemoryByte() {
        memoryModel.getCurrentMemoryByte();
        Assert.assertNotNull(memoryModel.getCurrentMemoryByte());
    }

    @Test
    public void incrementDecrement() {
        memoryModel.increment();
        memoryModel.increment();
        memoryModel.increment();

        memoryModel.decrement();

        int dataOfCurrentByte = memoryModel.getCurrentMemoryByte();

        assertEquals(2, dataOfCurrentByte);
    }

    @Test
    public void moveNextMoveBack() {
        memoryModel.moveNext();
        memoryModel.moveNext();
        memoryModel.moveNext();

        memoryModel.moveBack();
        memoryModel.moveBack();
        assertEquals(1, memoryModel.getDataPointer());
    }
 
}
