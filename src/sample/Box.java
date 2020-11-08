package sample;

public class Box {
    private int[] num = new int[9];

    public Box() {
        this.num[0] = (int) (Math.random()*9)+1;
        this.num[1] = (int) (Math.random()*9)+1;
        this.num[2] = (int) (Math.random()*9)+1;
        this.num[3] = (int) (Math.random()*9)+1;
        this.num[4] = (int) (Math.random()*9)+1;
        this.num[5] = (int) (Math.random()*9)+1;
        this.num[6] = (int) (Math.random()*9)+1;
        this.num[7] = (int) (Math.random()*9)+1;
        this.num[8] = (int) (Math.random()*9)+1;
    }

    public void randomizeValues() {
        this.num[0] = (int) (Math.random()*9)+1;
        this.num[1] = (int) (Math.random()*9)+1;
        this.num[2] = (int) (Math.random()*9)+1;
        this.num[3] = (int) (Math.random()*9)+1;
        this.num[4] = (int) (Math.random()*9)+1;
        this.num[5] = (int) (Math.random()*9)+1;
        this.num[6] = (int) (Math.random()*9)+1;
        this.num[7] = (int) (Math.random()*9)+1;
        this.num[8] = (int) (Math.random()*9)+1;
    }

    public void setValue(int index, int value) {
        switch (index) {
            case 0 -> this.num[0] = value;
            case 1 -> this.num[1] = value;
            case 2 -> this.num[2] = value;
            case 3 -> this.num[3] = value;
            case 4 -> this.num[4] = value;
            case 5 -> this.num[5] = value;
            case 6 -> this.num[6] = value;
            case 7 -> this.num[7] = value;
            case 8 -> this.num[8] = value;
            default -> throw new IllegalArgumentException("Unexpected value: " + index);
        }
    }

    public int getValue(int index) {
        switch (index) {
            case 0 -> { return this.num[0]; }
            case 1 -> { return this.num[1]; }
            case 2 -> { return this.num[2]; }
            case 3 -> { return this.num[3]; }
            case 4 -> { return this.num[4]; }
            case 5 -> { return this.num[5]; }
            case 6 -> { return this.num[6]; }
            case 7 -> { return this.num[7]; }
            case 8 -> { return this.num[8]; }
            default -> throw new IllegalStateException("Unexpected value: " + index);
        }
    }

    public int[] getBoxArray() {
        return this.num;
    }

    public boolean checkIfComplete() {
        boolean flag = true;
        for (int i=0; i < num.length; i++) {
            for (int j=i+1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
        /*
        if (this.num[0] + this.num[1] + this.num[2] + this.num[3] + this.num[4] + this.num[5] + this.num[6] + this.num[7] + this.num[8] != 45) {
            return false;
        } else if (this.num[0] == this.num[1] || this.num[0] == this.num[2] || this.num[0] == this.num[3] || this.num[0] == this.num[4] || this.num[0] == this.num[5] || this.num[0] == this.num[6] || this.num[0] == this.num[7] || this.num[0] == this.num[8]) {
            return false;
        } else if (this.num[1] == this.num[2] || this.num[1] == this.num[3] || this.num[1] == this.num[4] || this.num[1] == this.num[5] || this.num[1] == this.num[6] || this.num[1] == this.num[7] || this.num[1] == this.num[8]) {
            return false;
        } else if (this.num[2] == this.num[3] || this.num[2] == this.num[4] ||this.num[2] == this.num[5] || this.num[2] == this.num[6] || this.num[2] == this.num[7] || this.num[2] == this.num[8]) {
            return false;
        } else if (this.num[3] == this.num[4] || this.num[3] == this.num[5] || this.num[3] == this.num[6] || this.num[3] == this.num[7] || this.num[3] == this.num[8]) {
            return false;
        } else if (this.num[4] == this.num[5] || this.num[4] == this.num[6] || this.num[4] == this.num[7] || this.num[4] == this.num[8]) {
            return false;
        } else if (this.num[5] == this.num[6] || this.num[5] == this.num[7] || this.num[5] == this.num[8]) {
            return false;
        } else if (this.num[6] == this.num[7] || this.num[6] == this.num[8]) {
            return false;
        } else if (this.num[7] == this.num[8]) {
            return false;
        } else {
            return true;
        }
         */
    }
}
