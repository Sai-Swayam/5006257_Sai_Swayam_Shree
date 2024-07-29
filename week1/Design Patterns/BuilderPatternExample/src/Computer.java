public class Computer {
    String CPU;
    int RAM;
    int Storage;

    public Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        Storage = builder.Storage   ;
    }

    @Override
    public String toString(){
        return new String("CPU: " + this.CPU + "\nRAM: " + this.RAM + "\nStorage: " + this.Storage);
    }

    public static class Builder {
        private String CPU;
        private int RAM;
        private int Storage;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int Storage) {
            this.Storage = Storage;
            return this;
        }

        public Computer computerBuilder(){
            return new Computer(this);
        }

//        public Builder getInstance() {
//            return new Builder();
//        }
    }
}
