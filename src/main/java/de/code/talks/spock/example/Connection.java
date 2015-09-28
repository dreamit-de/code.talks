package de.code.talks.spock.example;

/**
 * @author Niels Falk
 */
public class Connection {

    private Connection open() {
        System.out.println("Connection.open");
        return this;
    }

    private void close(){
        System.out.println("Connection.close");
    }

    private void flush(){
        System.out.println("Connection.flush");
    }
}
