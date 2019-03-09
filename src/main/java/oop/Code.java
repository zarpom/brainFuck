package oop;

import java.util.Iterator;

import oop.model.Memory;

public class Code implements Iterable<Character> {
    private String codeProgram;
  
    public String getCode() {
        return codeProgram;
    }

    public void setCode(String code) {
        this.codeProgram = code;
    }

    private Memory memory;

    public Code(String textProgram, Memory memory) {
        super();
        this.codeProgram = textProgram;
        this.memory = memory;
    }

    public Iterator<Character> iterator() {
        return new Iterator<Character>() {
            private int current;
            public boolean hasNext() {
                return current < codeProgram.length();
            }

            public Character next() {
                int countBraket = 0;  
                if (codeProgram.charAt(current) == ']') {
                    if (memory.getCurrentMemoryByte() != 0) {
                        current--;
                        while (countBraket > 0 || codeProgram.charAt(current) != '[') {
                            if (codeProgram.charAt(current) == ']')
                                countBraket++;
                            if (codeProgram.charAt(current) == '[')
                                countBraket--;
                            current--;
                        }

                    }
                }
                return codeProgram.charAt(current++);
            }
        };
    }
}
