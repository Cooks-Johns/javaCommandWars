package test;

public class Calculator {

        private Reader reader;
        private int numberCalc;

        public Calculator () {
            this.reader = new Reader ();
            this.numberCalc = 0;
        }

        public void start() {
            while (true) {
                System.out.print("command: ");
                String command = this.reader.readString();
                if (command.equals("end")) {
                    break;
                }

                if (command.equals("sum")) {
                    sum();
                } else if (command.equals("difference")) {
                    difference();
                } else if (command.equals("product")) {
                    product();
                }
            }

            statistics();
        }

        private void sum () {

            System.out.print("value1: ");
            int value1 = this.reader.readInteger();

            System.out.print("value2: ");
            int value2 = this.reader.readInteger();

            int sum = value1 + value2;

            System.out.println("sum of the values " + sum);

            this.numberCalc++;
        }

        private void difference () {
            System.out.print("value1: ");
            int value1 = this.reader.readInteger();

            System.out.print("value2: ");
            int value2 = this.reader.readInteger();

            int difference = value1 - value2;

            System.out.println("difference of the values " + difference);

            this.numberCalc++;
        }

        private void product () {
            System.out.print("value1: ");
            int value1 = this.reader.readInteger();

            System.out.print("value2: ");
            int value2 = this.reader.readInteger();

            int product = value1 * value2;

            System.out.println("product of the values " + product);

            this.numberCalc++;
        }

        private void statistics() {
            System.out.println("Calculations done " + this.numberCalc);
        }
    }

