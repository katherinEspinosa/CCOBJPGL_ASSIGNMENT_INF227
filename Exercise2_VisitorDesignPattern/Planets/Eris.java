package Planets;

import Explorers.Explorer;

public class Eris implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}