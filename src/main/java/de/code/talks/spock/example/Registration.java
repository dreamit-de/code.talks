package de.code.talks.spock.example;

/**
 * @author Niels Falk
 */
public class Registration {

    private String user;

    //@Inject
    private DataStore dataStore;

    public void register() {
        if (!dataStore.save(user)) {
            throw new RuntimeException("save not successful");
        }
    }
}
