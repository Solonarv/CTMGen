package com.solonarv.mods.ctmgen.lib;

import java.util.ArrayList;
import java.util.List;

public abstract class Metric {
    
    public static final Metric MANHATTAN = new Metric() {
        public double apply(double dx, double dy, double dz) {
            return Math.abs(dx) + Math.abs(dy) + Math.abs(dz);
        }
    };
    
    public static final Metric CHEBYSHEV = new Metric() {
        
        @Override
        public double apply(double dx, double dy, double dz) {
            return MathUtils.max(Math.abs(dx), Math.abs(dy), Math.abs(dz));
        }
    };
    
    public static final Metric EUCLIDIAN = new Metric() {
        
        @Override
        public double apply(double dx, double dy, double dz) {
            return Math.sqrt(dx * dx + dy * dy + dz * dz);
        }
    };
    
    public static final Metric TAXICAB = MANHATTAN;
    public static final Metric CHESSBOARD = CHEBYSHEV;
    
    public abstract double apply(double dx, double dy, double dz);
    
    public int id;
    
    private static int nextID = 0;
    private static List<Metric> allMetrics = new ArrayList<Metric>();
    
    public Metric() {
        this.id = nextID++;
        allMetrics.add(this);
    }
    
    public static Metric getMetricByID(int id) {
        return allMetrics.get(id);
    }
}
