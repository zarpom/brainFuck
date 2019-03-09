package oop.model;

public class Memory {

    private byte[] memory = new byte[65535];
    private int dataPointer;

    private static Memory instance;
 
    public byte getCurrentMemoryByte() {
        return memory[dataPointer];
    }

    public void moveNext() {
        dataPointer = (dataPointer == memory.length - 1) ? 0 : dataPointer + 1;
    }

    public void moveBack() {
        dataPointer = (dataPointer == 0) ? memory.length - 1 : dataPointer - 1;
    }
    public void printValue() {
        System.out.print((char) memory[dataPointer]);
    }

    public void setMemory(byte[] mem) {
        this.memory = mem;
    }

    public int getDataPointer() {
        return dataPointer;
    }

    public void setDataPointer(int dataPointer) {
        this.dataPointer = dataPointer;
    }

    public void increment() {
        ++memory[dataPointer];
    }

    public void decrement() {
        --memory[dataPointer];
    }

    private Memory() {
    }

    public static Memory getInstance() {
        if (instance == null) {
            instance = new Memory();
        }
        return instance;
    }
}
