package ua.training;

public class RomeWatchFactory implements WatchFactory {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
