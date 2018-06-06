package test;

import java.util.Scanner;

public class Reader {


        private Scanner reader;

        public Reader () {
            this.reader = new Scanner(System.in);
        }

        public String readString(){
            String read = this.reader.nextLine();
            return read;
        }

        public int readInteger(){
            int read = Integer.parseInt(this.reader.nextLine());
            return read;
        }

}
