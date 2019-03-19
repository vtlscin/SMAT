import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        int int3 = simulator0.getProgress();
        try {
            float float5 = simulator0.getThrBps((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        long long11 = simulator0.getTime();
        try {
            boolean boolean13 = simulator0.removeNode(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        long long4 = simulator0.getTime();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        try {
            simulator0.changeNodeParams(10, 1, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        simulator0.confParams();
        float float3 = simulator0.getSysThrBps();
        simulator0.addNode(1, (int) (short) 0, (int) '4', (int) 'a', 1, 0);
        try {
            float float12 = simulator0.getJitter(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        java.lang.Class<?> wildcardClass5 = simulator0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        int int13 = simulator0.getProgress();
        long long14 = simulator0.getTime();
        int int15 = simulator0.getProgress();
        try {
            boolean boolean17 = simulator0.removeNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        int int4 = simulator0.getProgress();
        try {
            boolean boolean6 = simulator0.removeAllSources((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        try {
            float float8 = simulator0.getQDelay(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        int int13 = simulator0.getProgress();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        try {
            float float10 = simulator0.getDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        long long2 = simulator0.getTime();
        try {
            boolean boolean4 = simulator0.removeAllSources((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        long long3 = simulator0.getTime();
        float float4 = simulator0.getSysThrPkts();
        try {
            float float6 = simulator0.getQDelay(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        try {
            simulator0.changeNodeParams((int) 'a', 0, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        boolean boolean10 = simulator0.removeNode(0);
        try {
            simulator0.removeSource((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        long long2 = simulator0.getTime();
        try {
            simulator0.removeSource((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getJitter(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        try {
            float float14 = simulator0.getUtil((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        int int10 = simulator0.getProgress();
        simulator0.removeAllNodes();
        try {
            float float13 = simulator0.getMDelay((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        int int13 = simulator0.getProgress();
        long long14 = simulator0.getTime();
        long long15 = simulator0.getTime();
        float float16 = simulator0.getSysThrPkts();
        try {
            float float18 = simulator0.getJitter((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.removeAllNodes();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        float float11 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        long long13 = simulator0.getTime();
        try {
            float float15 = simulator0.getThrBps((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        simulator0.confParams();
        try {
            pamvotis.core.MobileNode mobileNode8 = simulator0.getNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.confParams();
        float float16 = simulator0.getSysThrBps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysUtil();
        long long16 = simulator0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        try {
            float float5 = simulator0.getJitter((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        try {
            float float12 = simulator0.getJitter((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        simulator0.addNode((int) (byte) -1, 10, (int) 'a', (int) (short) 100, (int) 'a', (int) (byte) 10);
        long long15 = simulator0.getTime();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        float float14 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        try {
            boolean boolean17 = simulator0.removeAllSources((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        pamvotis.sources.Source source12 = null;
        try {
            boolean boolean13 = simulator0.appendNewSource((int) (short) -1, source12);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        float float14 = simulator0.getSysThrPkts();
        pamvotis.sources.Source source16 = null;
        try {
            boolean boolean17 = simulator0.appendNewSource((int) (byte) 0, source16);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        simulator0.confParams();
        try {
            float float7 = simulator0.getQDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((int) (short) 10, (-1), (int) 'a', 10, (int) (short) -1, (int) '4');
        simulator0.confParams();
        float float12 = simulator0.getSysUtil();
        try {
            float float14 = simulator0.getThrPkts((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        simulator0.addNode((int) (byte) -1, 10, (int) 'a', (int) (short) 100, (int) 'a', (int) (byte) 10);
        pamvotis.sources.Source source16 = null;
        try {
            boolean boolean17 = simulator0.appendNewSource((int) '4', source16);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float11 = simulator0.getSysThrPkts();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        float float13 = simulator0.getSysUtil();
        float float14 = simulator0.getSysUtil();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        long long3 = simulator0.getTime();
        int int4 = simulator0.getProgress();
        int int5 = simulator0.getProgress();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        try {
            float float6 = simulator0.getUtil((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.confParams();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) ' ', 0, (int) (byte) 100, (int) (short) 0);
        float float18 = simulator0.getMDelay(1);
        try {
            float float20 = simulator0.getJitter((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        float float13 = simulator0.getSysUtil();
        simulator0.confParams();
        try {
            boolean boolean16 = simulator0.removeAllSources(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        simulator0.printMeanValues();
        pamvotis.sources.Source source16 = null;
        try {
            boolean boolean17 = simulator0.appendNewSource(0, source16);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        simulator0.removeAllNodes();
        try {
            float float13 = simulator0.getRatts(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysThrPkts();
        try {
            boolean boolean12 = simulator0.removeAllSources((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        simulator0.confParams();
        simulator0.confParams();
        try {
            simulator0.addNode(0, (int) (byte) -1, (int) (byte) 1, (int) 'a', 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementExistsException; message: Node 0 already exists.");
        } catch (pamvotis.exceptions.ElementExistsException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        long long5 = simulator0.getTime();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        try {
            simulator0.changeNodeParams((int) (byte) -1, (int) '4', 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass4 = simulator0.getClass();
        float float5 = simulator0.getSysUtil();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        try {
            simulator0.removeSource((int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        float float17 = simulator0.getSysUtil();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float17, Float.NaN, 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysThrPkts();
        try {
            float float14 = simulator0.getDelay(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        float float19 = simulator0.getDelay((int) (short) 1);
        try {
            float float21 = simulator0.getQDelay((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float13 = simulator0.getSysThrPkts();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        try {
            float float6 = simulator0.getRatts(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        long long11 = simulator0.getTime();
        try {
            float float13 = simulator0.getDelay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        int int13 = simulator0.getProgress();
        try {
            simulator0.removeSource(100, 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.confParams();
        float float4 = simulator0.getSysUtil();
        try {
            simulator0.removeSource((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float9 = simulator0.getSysThrBps();
        try {
            float float11 = simulator0.getQDelay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        boolean boolean10 = simulator0.removeNode(0);
        try {
            float float12 = simulator0.getThrBps((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        float float13 = simulator0.getUtil(0);
        simulator0.removeAllNodes();
        long long15 = simulator0.getTime();
        java.lang.Class<?> wildcardClass16 = simulator0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        try {
            float float5 = simulator0.getJitter((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((int) (short) 10, (-1), (int) 'a', 10, (int) (short) -1, (int) '4');
        simulator0.confParams();
        float float12 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        try {
            float float15 = simulator0.getQLength(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        long long3 = simulator0.getTime();
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        try {
            pamvotis.core.MobileNode mobileNode3 = simulator0.getNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) ' ', 0, (int) (byte) 100, (int) (short) 0);
        try {
            float float18 = simulator0.getRatts((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        float float15 = simulator0.getSysUtil();
        float float16 = simulator0.getSysThrBps();
        try {
            simulator0.removeSource((int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Source 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((int) (short) 10, (-1), (int) 'a', 10, (int) (short) -1, (int) '4');
        simulator0.confParams();
        boolean boolean13 = simulator0.removeAllSources(10);
        float float14 = simulator0.getSysUtil();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        float float14 = simulator0.getSysThrBps();
        float float15 = simulator0.getSysThrBps();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        float float14 = simulator0.getDelay(100);
        float float16 = simulator0.getThrPkts((int) (byte) 100);
        try {
            float float18 = simulator0.getQLength((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        long long4 = simulator0.getTime();
        simulator0.printMeanValues();
        pamvotis.sources.Source source7 = null;
        try {
            boolean boolean8 = simulator0.appendNewSource((int) (short) 10, source7);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        simulator0.confParams();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getDelay((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        simulator0.removeAllNodes();
        float float4 = simulator0.getSysThrPkts();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        int int13 = simulator0.getProgress();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        float float3 = simulator0.getSysThrBps();
        try {
            simulator0.removeSource((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        int int10 = simulator0.getProgress();
        simulator0.addNode((int) 'a', 1, (int) (short) 10, 0, (int) (byte) 100, (int) (byte) 10);
        float float18 = simulator0.getSysUtil();
        try {
            float float20 = simulator0.getThrBps((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals((float) float18, Float.NaN, 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        float float9 = simulator0.getMDelay(100);
        try {
            boolean boolean11 = simulator0.removeNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        int int3 = simulator0.getProgress();
        simulator0.removeAllNodes();
        try {
            float float6 = simulator0.getUtil((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        simulator0.removeAllNodes();
        try {
            float float11 = simulator0.getThrPkts((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        simulator0.printMeanValues();
        float float15 = simulator0.getSysThrPkts();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        java.lang.Class<?> wildcardClass1 = simulator0.getClass();
        float float2 = simulator0.getSysUtil();
        try {
            float float4 = simulator0.getUtil((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode14 = simulator0.getNode(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(mobileNode14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        float float11 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        long long13 = simulator0.getTime();
        try {
            float float15 = simulator0.getDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        long long3 = simulator0.getTime();
        float float4 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.removeAllNodes();
        simulator0.addNode((int) (short) -1, 1, (int) (byte) 100, (int) ' ', 10, (int) (byte) 100);
        try {
            float float20 = simulator0.getQLength((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        float float10 = simulator0.getSysThrBps();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysThrPkts();
        java.lang.Class<?> wildcardClass16 = simulator0.getClass();
        try {
            float float18 = simulator0.getQLength((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        simulator0.addNode((int) '#', 10, (int) (byte) 100, 100, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        try {
            simulator0.changeNodeParams(1, (int) '#', (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        try {
            simulator0.changeNodeParams((int) '4', (int) (byte) 100, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysThrPkts();
        float float14 = simulator0.getDelay((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        simulator0.printMeanValues();
        simulator0.confParams();
        float float16 = simulator0.getSysUtil();
        try {
            pamvotis.core.MobileNode mobileNode18 = simulator0.getNode((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        simulator0.printMeanValues();
        try {
            float float8 = simulator0.getThrBps((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        try {
            float float10 = simulator0.getThrBps((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        simulator0.confParams();
        try {
            float float4 = simulator0.getDelay(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        simulator0.printMeanValues();
        try {
            float float11 = simulator0.getMDelay(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        float float15 = simulator0.getRatts((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        float float15 = simulator0.getSysUtil();
        float float16 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        try {
            float float19 = simulator0.getJitter((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        try {
            float float13 = simulator0.getJitter(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        long long7 = simulator0.getTime();
        try {
            float float9 = simulator0.getThrPkts((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        float float14 = simulator0.getSysUtil();
        try {
            float float16 = simulator0.getUtil((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        simulator0.printMeanValues();
        simulator0.confParams();
        try {
            boolean boolean17 = simulator0.removeNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        int int10 = simulator0.getProgress();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        try {
            float float15 = simulator0.getMDelay((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        long long3 = simulator0.getTime();
        try {
            boolean boolean5 = simulator0.removeNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        float float15 = simulator0.getSysUtil();
        float float16 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        long long18 = simulator0.getTime();
        float float19 = simulator0.getSysThrBps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals((float) float19, Float.NaN, 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        float float13 = simulator0.getUtil(0);
        simulator0.removeAllNodes();
        long long15 = simulator0.getTime();
        simulator0.removeAllNodes();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        long long10 = simulator0.getTime();
        float float11 = simulator0.getSysThrPkts();
        try {
            float float13 = simulator0.getMDelay((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        try {
            boolean boolean14 = simulator0.removeAllSources((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        int int3 = simulator0.getProgress();
        simulator0.removeAllNodes();
        try {
            float float6 = simulator0.getQLength((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysThrPkts();
        try {
            float float12 = simulator0.getJitter((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        int int10 = simulator0.getProgress();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrPkts();
        boolean boolean14 = simulator0.removeAllSources((int) (byte) 10);
        try {
            float float16 = simulator0.getDelay((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((int) (short) 10, (-1), (int) 'a', 10, (int) (short) -1, (int) '4');
        simulator0.confParams();
        float float12 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        try {
            simulator0.removeSource((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        simulator0.addNode((int) (byte) 10, (int) '4', (int) '#', (int) (short) 1, 1, (int) 'a');
        float float11 = simulator0.getSysThrPkts();
        try {
            float float13 = simulator0.getThrPkts((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        long long3 = simulator0.getTime();
        simulator0.confParams();
        try {
            float float6 = simulator0.getRatts((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.removeAllNodes();
        simulator0.removeAllNodes();
        long long13 = simulator0.getTime();
        simulator0.addNode(0, (int) '4', (int) (short) 10, 100, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        long long5 = simulator0.getTime();
        try {
            float float7 = simulator0.getThrBps((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float13 = simulator0.getSysThrPkts();
        float float14 = simulator0.getSysUtil();
        int int15 = simulator0.getProgress();
        try {
            pamvotis.core.MobileNode mobileNode17 = simulator0.getNode(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int12 = simulator0.getProgress();
        int int13 = simulator0.getProgress();
        float float14 = simulator0.getSysUtil();
        try {
            simulator0.changeNodeParams((int) (byte) 100, 0, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100 >= 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        simulator0.removeAllNodes();
        simulator0.removeAllNodes();
        int int5 = simulator0.getProgress();
        pamvotis.sources.Source source7 = null;
        try {
            boolean boolean8 = simulator0.appendNewSource((int) (short) -1, source7);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        float float10 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        float float12 = simulator0.getSysUtil();
        try {
            float float14 = simulator0.getThrPkts((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        long long11 = simulator0.getTime();
        try {
            float float13 = simulator0.getUtil((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        long long2 = simulator0.getTime();
        float float3 = simulator0.getSysThrPkts();
        java.lang.Class<?> wildcardClass4 = simulator0.getClass();
        try {
            float float6 = simulator0.getMDelay((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        try {
            pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        simulator0.confParams();
        simulator0.confParams();
        try {
            simulator0.addNode((int) (short) 0, (int) '4', 100, (int) (short) 10, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementExistsException; message: Node 0 already exists.");
        } catch (pamvotis.exceptions.ElementExistsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        float float9 = simulator0.getSysThrBps();
        try {
            float float11 = simulator0.getUtil((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.confParams();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrPkts();
        try {
            float float14 = simulator0.getThrPkts((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrPkts();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        int int10 = simulator0.getProgress();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrPkts();
        boolean boolean14 = simulator0.removeAllSources((int) (byte) 10);
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        float float5 = simulator0.getSysThrBps();
        try {
            float float7 = simulator0.getUtil(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        try {
            float float10 = simulator0.getThrPkts(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        long long11 = simulator0.getTime();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        simulator0.confParams();
        int int14 = simulator0.getProgress();
        try {
            simulator0.removeSource((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        float float14 = simulator0.getMDelay(0);
        java.lang.Class<?> wildcardClass15 = simulator0.getClass();
        try {
            pamvotis.core.MobileNode mobileNode17 = simulator0.getNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        float float14 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        try {
            boolean boolean17 = simulator0.removeNode((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        float float10 = simulator0.getSysUtil();
        pamvotis.sources.Source source12 = null;
        try {
            boolean boolean13 = simulator0.appendNewSource((-1), source12);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        simulator0.addNode((int) (byte) 10, (int) '4', (int) '#', (int) (short) 1, 1, (int) 'a');
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        try {
            float float15 = simulator0.getUtil((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.removeAllNodes();
        simulator0.removeAllNodes();
        long long13 = simulator0.getTime();
        try {
            float float15 = simulator0.getThrBps((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        float float19 = simulator0.getDelay((int) (short) 1);
        float float20 = simulator0.getSysThrPkts();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertEquals((float) float20, Float.NaN, 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) 0, (int) 'a', (int) 'a', (int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        try {
            float float12 = simulator0.getThrPkts((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        try {
            float float14 = simulator0.getRatts((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        long long11 = simulator0.getTime();
        try {
            float float13 = simulator0.getMDelay((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        float float14 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        float float16 = simulator0.getSysThrBps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        float float5 = simulator0.getSysThrBps();
        try {
            boolean boolean7 = simulator0.removeNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        try {
            simulator0.changeNodeParams((int) (short) 10, (int) (short) 100, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10 >= 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((int) (short) 10, (-1), (int) 'a', 10, (int) (short) -1, (int) '4');
        try {
            simulator0.changeNodeParams((-1), (int) ' ', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.addNode((int) '4', (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        float float12 = simulator0.getSysUtil();
        try {
            float float14 = simulator0.getThrBps((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        simulator0.printMeanValues();
        simulator0.confParams();
        float float16 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass17 = simulator0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        float float15 = simulator0.getSysUtil();
        float float16 = simulator0.getSysUtil();
        try {
            float float18 = simulator0.getThrBps((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        simulator0.addNode((int) (short) -1, 100, (int) '4', 100, 0, 0);
        try {
            boolean boolean20 = simulator0.removeAllSources(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        float float9 = simulator0.getSysThrBps();
        float float11 = simulator0.getUtil(100);
        float float13 = simulator0.getThrBps(100);
        simulator0.confParams();
        try {
            pamvotis.core.MobileNode mobileNode16 = simulator0.getNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        float float12 = simulator0.getSysUtil();
        simulator0.confParams();
        float float15 = simulator0.getQDelay(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        float float14 = simulator0.getDelay(100);
        try {
            float float16 = simulator0.getQDelay((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        simulator0.confParams();
        long long6 = simulator0.getTime();
        float float7 = simulator0.getSysUtil();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        simulator0.printMeanValues();
        simulator0.addNode(100, (int) (short) 100, (int) (short) 1, (int) ' ', 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.confParams();
        simulator0.printMeanValues();
        try {
            float float13 = simulator0.getThrBps((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        int int13 = simulator0.getProgress();
        long long14 = simulator0.getTime();
        simulator0.addNode((int) (short) -1, (-1), 0, (int) (byte) 100, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        simulator0.removeAllNodes();
        int int10 = simulator0.getProgress();
        simulator0.removeAllNodes();
        try {
            float float13 = simulator0.getQDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        float float9 = simulator0.getMDelay(100);
        try {
            float float11 = simulator0.getQLength((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        simulator0.confParams();
        try {
            float float20 = simulator0.getUtil((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        simulator0.removeAllNodes();
        int int10 = simulator0.getProgress();
        float float11 = simulator0.getSysThrBps();
        try {
            pamvotis.core.MobileNode mobileNode13 = simulator0.getNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getJitter((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        try {
            float float14 = simulator0.getMDelay((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int6 = simulator0.getProgress();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.confParams();
        float float4 = simulator0.getSysUtil();
        try {
            float float6 = simulator0.getQDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        try {
            simulator0.removeSource(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.removeAllNodes();
        try {
            boolean boolean12 = simulator0.removeNode(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        simulator0.confParams();
        simulator0.confParams();
        try {
            boolean boolean15 = simulator0.removeAllSources((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        float float11 = simulator0.getJitter(10);
        try {
            float float13 = simulator0.getThrPkts((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysThrBps();
        try {
            float float4 = simulator0.getThrBps((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        try {
            float float10 = simulator0.getJitter((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        float float19 = simulator0.getDelay((int) (short) 1);
        float float21 = simulator0.getJitter((int) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        try {
            float float12 = simulator0.getQDelay(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysThrPkts();
        simulator0.removeAllNodes();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        simulator0.addNode((int) (short) 10, (int) (short) 100, (int) (short) 0, (int) (short) 100, (int) ' ', (int) (short) 0);
        simulator0.removeAllNodes();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        try {
            float float6 = simulator0.getThrPkts(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        try {
            float float10 = simulator0.getQLength(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        float float9 = simulator0.getSysThrBps();
        try {
            pamvotis.core.MobileNode mobileNode11 = simulator0.getNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        simulator0.removeAllNodes();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        try {
            float float11 = simulator0.getJitter((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        long long2 = simulator0.getTime();
        float float3 = simulator0.getSysThrBps();
        long long4 = simulator0.getTime();
        try {
            simulator0.removeSource((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.addNode((int) ' ', (-1), (int) (short) 0, 10, (int) (byte) 10, 0);
        try {
            float float21 = simulator0.getUtil((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.confParams();
        try {
            float float12 = simulator0.getThrBps((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        pamvotis.sources.Source source14 = null;
        try {
            boolean boolean15 = simulator0.appendNewSource(0, source14);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        try {
            float float5 = simulator0.getMDelay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        float float5 = simulator0.getSysThrPkts();
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int12 = simulator0.getProgress();
        simulator0.printMeanValues();
        float float14 = simulator0.getSysUtil();
        try {
            float float16 = simulator0.getDelay((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.removeAllNodes();
        try {
            float float13 = simulator0.getThrPkts((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        simulator0.confParams();
        try {
            float float8 = simulator0.getMDelay(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        long long10 = simulator0.getTime();
        try {
            float float12 = simulator0.getUtil((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        simulator0.confParams();
        float float5 = simulator0.getSysUtil();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        boolean boolean14 = simulator0.removeAllSources((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = simulator0.getClass();
        try {
            pamvotis.core.MobileNode mobileNode17 = simulator0.getNode(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        try {
            float float14 = simulator0.getThrPkts((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        simulator0.removeAllNodes();
        simulator0.removeAllNodes();
        float float5 = simulator0.getSysThrPkts();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        int int11 = simulator0.getProgress();
        try {
            float float13 = simulator0.getThrPkts((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        float float12 = simulator0.getSysUtil();
        simulator0.confParams();
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        long long2 = simulator0.getTime();
        simulator0.printMeanValues();
        int int4 = simulator0.getProgress();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        long long5 = simulator0.getTime();
        simulator0.addNode((int) (short) 0, (int) (short) 10, (int) (byte) 100, (int) (byte) 10, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        try {
            pamvotis.core.MobileNode mobileNode2 = simulator0.getNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        simulator0.removeAllNodes();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        try {
            float float4 = simulator0.getThrPkts((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int12 = simulator0.getProgress();
        simulator0.printMeanValues();
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysThrBps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        float float11 = simulator0.getJitter(10);
        pamvotis.sources.Source source13 = null;
        try {
            boolean boolean14 = simulator0.appendNewSource((int) '#', source13);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        long long11 = simulator0.getTime();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        simulator0.confParams();
        int int14 = simulator0.getProgress();
        try {
            boolean boolean16 = simulator0.removeNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        float float14 = simulator0.getDelay(100);
        try {
            float float16 = simulator0.getThrPkts((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int12 = simulator0.getProgress();
        pamvotis.core.MobileNode mobileNode14 = simulator0.getNode((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(mobileNode14);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.addNode((int) (byte) 1, (int) (short) 100, (int) (byte) 10, (-1), 100, 10);
        simulator0.confParams();
        try {
            float float24 = simulator0.getQLength(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        long long13 = simulator0.getTime();
        float float14 = simulator0.getSysThrBps();
        float float15 = simulator0.getSysThrBps();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        float float15 = simulator0.getSysUtil();
        float float16 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        float float12 = simulator0.getSysThrPkts();
        try {
            simulator0.removeSource((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int12 = simulator0.getProgress();
        int int13 = simulator0.getProgress();
        float float14 = simulator0.getSysUtil();
        try {
            pamvotis.core.MobileNode mobileNode16 = simulator0.getNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        int int13 = simulator0.getProgress();
        long long14 = simulator0.getTime();
        int int15 = simulator0.getProgress();
        pamvotis.core.MobileNode mobileNode17 = simulator0.getNode((int) (short) 0);
        float float18 = simulator0.getSysThrBps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mobileNode17);
        org.junit.Assert.assertEquals((float) float18, Float.NaN, 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        try {
            float float12 = simulator0.getQDelay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysUtil();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.confParams();
        try {
            float float5 = simulator0.getQDelay((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        java.lang.Class<?> wildcardClass1 = simulator0.getClass();
        float float2 = simulator0.getSysThrPkts();
        simulator0.printMeanValues();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        try {
            float float5 = simulator0.getMDelay((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass4 = simulator0.getClass();
        try {
            simulator0.removeSource((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        simulator0.printMeanValues();
        float float15 = simulator0.getSysThrBps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        try {
            float float8 = simulator0.getThrPkts((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        float float10 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        float float12 = simulator0.getSysUtil();
        try {
            float float14 = simulator0.getQDelay(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        pamvotis.sources.Source source5 = null;
        try {
            boolean boolean6 = simulator0.appendNewSource((int) (byte) 1, source5);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        java.lang.Class<?> wildcardClass1 = simulator0.getClass();
        float float2 = simulator0.getSysUtil();
        try {
            pamvotis.core.MobileNode mobileNode4 = simulator0.getNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        long long3 = simulator0.getTime();
        int int4 = simulator0.getProgress();
        simulator0.removeAllNodes();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        simulator0.confParams();
        float float11 = simulator0.getSysUtil();
        try {
            float float13 = simulator0.getQLength((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.addNode((int) (byte) 1, (int) (short) 100, (int) (byte) 10, (-1), 100, 10);
        simulator0.confParams();
        try {
            float float24 = simulator0.getDelay(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        long long4 = simulator0.getTime();
        try {
            float float6 = simulator0.getUtil((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        float float5 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) ' ', (-1), (int) '#', (int) (short) 100, (int) (byte) 0);
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        long long3 = simulator0.getTime();
        int int4 = simulator0.getProgress();
        try {
            boolean boolean6 = simulator0.removeNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((int) (short) 10, (-1), (int) 'a', 10, (int) (short) -1, (int) '4');
        int int11 = simulator0.getProgress();
        simulator0.changeNodeParams((int) (short) 0, (int) (byte) 10, 10, 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.addNode((int) '4', (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, (int) (short) -1);
        float float12 = simulator0.getJitter((int) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        int int18 = simulator0.getProgress();
        simulator0.removeAllNodes();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        long long5 = simulator0.getTime();
        simulator0.removeAllNodes();
        try {
            float float8 = simulator0.getMDelay(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        simulator0.confParams();
        int int11 = simulator0.getProgress();
        try {
            boolean boolean13 = simulator0.removeAllSources((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        boolean boolean14 = simulator0.removeAllSources((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = simulator0.getClass();
        float float17 = simulator0.getThrBps(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals((float) float17, Float.NaN, 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        long long10 = simulator0.getTime();
        float float12 = simulator0.getRatts(0);
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        long long4 = simulator0.getTime();
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        long long3 = simulator0.getTime();
        try {
            float float5 = simulator0.getThrPkts((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        long long11 = simulator0.getTime();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        simulator0.addNode((int) (short) -1, (int) ' ', (int) (byte) 0, 0, (int) (short) 10, (int) (short) -1);
        long long20 = simulator0.getTime();
        try {
            float float22 = simulator0.getQLength((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        try {
            simulator0.removeSource((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        float float18 = simulator0.getMDelay((int) (short) 0);
        try {
            pamvotis.core.MobileNode mobileNode20 = simulator0.getNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        float float13 = simulator0.getUtil(0);
        simulator0.confParams();
        float float15 = simulator0.getSysUtil();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrPkts((int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int12 = simulator0.getProgress();
        simulator0.printMeanValues();
        float float14 = simulator0.getSysThrBps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        float float14 = simulator0.getMDelay(0);
        float float15 = simulator0.getSysThrBps();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.printMeanValues();
        try {
            float float13 = simulator0.getDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        float float13 = simulator0.getUtil(0);
        simulator0.removeAllNodes();
        try {
            float float16 = simulator0.getJitter((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        try {
            float float13 = simulator0.getUtil((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        simulator0.confParams();
        try {
            boolean boolean15 = simulator0.removeNode(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        long long11 = simulator0.getTime();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        simulator0.confParams();
        try {
            boolean boolean15 = simulator0.removeAllSources((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        float float12 = simulator0.getSysThrPkts();
        try {
            simulator0.removeSource((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        float float14 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        try {
            float float6 = simulator0.getMDelay((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float13 = simulator0.getSysUtil();
        try {
            float float15 = simulator0.getThrPkts((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        float float10 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        float float12 = simulator0.getSysUtil();
        try {
            float float14 = simulator0.getJitter((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        java.lang.Class<?> wildcardClass1 = simulator0.getClass();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrBps();
        int int4 = simulator0.getProgress();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        simulator0.removeAllNodes();
        float float12 = simulator0.getSysThrPkts();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        try {
            simulator0.removeSource((int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.confParams();
        try {
            float float6 = simulator0.getQLength((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        simulator0.addNode((int) (short) 10, 100, (int) (byte) 0, (int) (byte) 1, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        try {
            simulator0.removeSource((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        float float13 = simulator0.getSysThrPkts();
        try {
            pamvotis.core.MobileNode mobileNode15 = simulator0.getNode((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.removeAllNodes();
        try {
            float float13 = simulator0.getRatts((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        float float13 = simulator0.getSysUtil();
        int int14 = simulator0.getProgress();
        float float15 = simulator0.getSysThrPkts();
        java.lang.Class<?> wildcardClass16 = simulator0.getClass();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrPkts();
        try {
            boolean boolean14 = simulator0.removeNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        try {
            float float4 = simulator0.getMDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        float float12 = simulator0.getSysThrPkts();
        try {
            float float14 = simulator0.getQLength(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        float float9 = simulator0.getSysThrBps();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        long long5 = simulator0.getTime();
        simulator0.removeAllNodes();
        float float7 = simulator0.getSysUtil();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        long long3 = simulator0.getTime();
        float float4 = simulator0.getSysUtil();
        float float5 = simulator0.getSysUtil();
        try {
            float float7 = simulator0.getUtil(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        try {
            float float3 = simulator0.getJitter((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysThrPkts();
        java.lang.Class<?> wildcardClass16 = simulator0.getClass();
        try {
            float float18 = simulator0.getJitter((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        float float14 = simulator0.getSysThrPkts();
        float float15 = simulator0.getSysUtil();
        int int16 = simulator0.getProgress();
        try {
            simulator0.changeNodeParams((int) '4', 0, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass4 = simulator0.getClass();
        try {
            boolean boolean6 = simulator0.removeAllSources((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        simulator0.printMeanValues();
        int int13 = simulator0.getProgress();
        try {
            float float15 = simulator0.getQLength((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        try {
            float float6 = simulator0.getUtil((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysUtil();
        float float16 = simulator0.getSysThrPkts();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysThrBps();
        long long5 = simulator0.getTime();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        float float11 = simulator0.getSysUtil();
        int int12 = simulator0.getProgress();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        float float5 = simulator0.getSysUtil();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        float float12 = simulator0.getSysThrPkts();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        long long4 = simulator0.getTime();
        simulator0.printMeanValues();
        try {
            float float7 = simulator0.getThrPkts((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int12 = simulator0.getProgress();
        float float13 = simulator0.getSysUtil();
        float float14 = simulator0.getSysUtil();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        long long13 = simulator0.getTime();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        int int13 = simulator0.getProgress();
        long long14 = simulator0.getTime();
        long long15 = simulator0.getTime();
        try {
            float float17 = simulator0.getThrBps((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        float float11 = simulator0.getJitter(10);
        try {
            float float13 = simulator0.getUtil((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int12 = simulator0.getProgress();
        simulator0.printMeanValues();
        float float14 = simulator0.getSysUtil();
        pamvotis.sources.Source source16 = null;
        boolean boolean17 = simulator0.appendNewSource((int) (short) 0, source16);
        java.lang.Class<?> wildcardClass18 = simulator0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.addNode((int) '4', (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        float float12 = simulator0.getSysUtil();
        simulator0.addNode((-1), (int) (byte) 100, (int) '4', (int) (byte) 100, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((int) (short) 10, (-1), (int) 'a', 10, (int) (short) -1, (int) '4');
        float float11 = simulator0.getSysThrPkts();
        try {
            float float13 = simulator0.getRatts((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        float float13 = simulator0.getSysUtil();
        simulator0.confParams();
        long long15 = simulator0.getTime();
        try {
            float float17 = simulator0.getThrBps((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) 0, (int) 'a', (int) 'a', (int) (short) 1, (int) 'a');
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        pamvotis.sources.Source source7 = null;
        try {
            boolean boolean8 = simulator0.appendNewSource(0, source7);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.addNode((int) '4', (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        float float12 = simulator0.getSysUtil();
        float float14 = simulator0.getUtil((int) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        long long11 = simulator0.getTime();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        try {
            simulator0.removeSource(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Source -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        long long6 = simulator0.getTime();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }
}

