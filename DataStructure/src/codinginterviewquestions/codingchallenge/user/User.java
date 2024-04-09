package codinginterviewquestions.codingchallenge.user;

import codinginterviewquestions.codingchallenge.jukebox.Jukebox;

public class User
{
    private final Jukebox jukebox;

    public User(Jukebox jukebox) {
        this.jukebox = jukebox;
    }

    public Jukebox getJukebox() {
        return jukebox;
    }
}
