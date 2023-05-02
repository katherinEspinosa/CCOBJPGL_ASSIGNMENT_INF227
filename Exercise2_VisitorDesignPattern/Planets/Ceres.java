package Planets;

import Explorers.Explorer;

public class Ceres implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}