package com.solonarv.mods.ctmgen.lib;

import java.util.Arrays;

import net.minecraft.util.MathHelper;

public class MathUtils {
    /**
     * Recursive maximum-over-array function
     * 
     * @param vals an array of doubles
     * @return the maximum value within the given array
     */
    public static double max(double... vals) {
        switch (vals.length) {
            case 0:
                throw new IllegalArgumentException("Cannot take maximum of no values!");
            case 1:
                return vals[0];
            default:
                int split = MathHelper.floor_double(vals.length / 2);
                return Math.max(max(Arrays.copyOfRange(vals, 0, split)), max(Arrays.copyOfRange(vals, split, vals.length)));
        }
    }
    
    public static double abs_pow(double base, double exp) {
        return Math.pow(Math.abs(base), exp);
    }
}
