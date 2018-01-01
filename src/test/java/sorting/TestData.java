package sorting;

import java.util.HashSet;
import java.util.Set;

public class TestData {
    private static final int[] intArr1 = new int[]{1, 4, 6, 2, 3, 7, 5};
    private static final int[] intArr2 = new int[]{1, 4, 6};
    private static final int[] intArr3 = new int[]{6, 4, 1};
    private static final int[] intArr4 = new int[]{6};

    public static Set<int[]> getIntTestData(){
        Set<int[]> intTestSet = new HashSet<int[]>();
        intTestSet.add(intArr1);
        intTestSet.add(intArr2);
        intTestSet.add(intArr3);
        intTestSet.add(intArr4);
        return intTestSet;
    }

    private static final float[] floatArr1 = new float[]{1, 4, 6, 2, 3, 7, 5};
    private static final float[] floatArr2 = new float[]{1, 4, 6};
    private static final float[] floatArr3 = new float[]{6, 4, 1};
    private static final float[] floatArr4 = new float[]{6};

    public static Set<float[]> getFloatTestData(){
        Set<float[]> intTestSet = new HashSet<float[]>();
        intTestSet.add(floatArr1);
        intTestSet.add(floatArr2);
        intTestSet.add(floatArr3);
        intTestSet.add(floatArr4);
        return intTestSet;
    }

    private static final long[] longArr1 = new long[]{1, 4, 6, 2, 3, 7, 5};
    private static final long[] longArr2 = new long[]{1, 4, 6};
    private static final long[] longArr3 = new long[]{6, 4, 1};
    private static final long[] longArr4 = new long[]{6};

    public static Set<long[]> getLongTestData(){
        Set<long[]> intTestSet = new HashSet<long[]>();
        intTestSet.add(longArr1);
        intTestSet.add(longArr2);
        intTestSet.add(longArr3);
        intTestSet.add(longArr4);
        return intTestSet;
    }

    private static final double[] doubleArr1 = new double[]{1.3, 4.2, 6.4, 2.3, 3.1, 7.4, 7.1};
    private static final double[] doubleArr2 = new double[]{1.3, 4.0, 6.1};
    private static final double[] doubleArr3 = new double[]{6.3, 4.2, 1.1};
    private static final double[] doubleArr4 = new double[]{6.0};

    public static Set<double[]> getDoubleTestData(){
        Set<double[]> intTestSet = new HashSet<double[]>();
        intTestSet.add(doubleArr1);
        intTestSet.add(doubleArr2);
        intTestSet.add(doubleArr3);
        intTestSet.add(doubleArr4);
        return intTestSet;
    }
}
