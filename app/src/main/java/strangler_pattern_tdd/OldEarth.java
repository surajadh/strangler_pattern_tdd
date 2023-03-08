package strangler_pattern_tdd;

import java.util.List;

public class OldEarth implements Earth {
    @Override
    public List<String> nutrients() {
        someFancyDBStuffs();
        return List.of("low_oxygen", "dead_microbes", "nitrogen");
    }

    private void someFancyDBStuffs() {
        System.out.println("Fancy DB Stuffs in progress");
        System.currentTimeMillis();
        System.out.println("Fancy DB Stuffs completed");
    }

    @Override
    public String soil() {
        return null;
    }
}
