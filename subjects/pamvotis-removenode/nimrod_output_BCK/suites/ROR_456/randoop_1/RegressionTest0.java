import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        try {
            simulator0.removeSource(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        try {
            float float3 = simulator0.getThrPkts((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        try {
            boolean boolean2 = simulator0.removeAllSources((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        try {
            float float3 = simulator0.getMDelay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        pamvotis.sources.Source source3 = null;
        try {
            boolean boolean4 = simulator0.appendNewSource((int) (byte) 0, source3);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        try {
            float float2 = simulator0.getRatts((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        try {
            float float9 = simulator0.getRatts(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        try {
            simulator0.removeSource(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        try {
            float float3 = simulator0.getThrPkts(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        try {
            boolean boolean4 = simulator0.removeNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        try {
            simulator0.changeNodeParams((int) '#', (-1), 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35 >= 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        try {
            float float10 = simulator0.getMDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        try {
            boolean boolean3 = simulator0.removeAllSources((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        try {
            float float6 = simulator0.getMDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        try {
            float float6 = simulator0.getThrBps(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        try {
            boolean boolean3 = simulator0.removeAllSources(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        try {
            float float3 = simulator0.getMDelay(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        try {
            boolean boolean3 = simulator0.removeAllSources((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        pamvotis.sources.Source source10 = null;
        try {
            boolean boolean11 = simulator0.appendNewSource((int) (short) 1, source10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        try {
            float float10 = simulator0.getDelay((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        try {
            boolean boolean3 = simulator0.removeAllSources((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        try {
            float float5 = simulator0.getUtil((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        try {
            float float4 = simulator0.getMDelay(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        try {
            boolean boolean5 = simulator0.removeNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getJitter(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        try {
            float float3 = simulator0.getQDelay((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        pamvotis.sources.Source source12 = null;
        try {
            boolean boolean13 = simulator0.appendNewSource((int) (short) 10, source12);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        try {
            boolean boolean4 = simulator0.removeAllSources(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        pamvotis.sources.Source source5 = null;
        try {
            boolean boolean6 = simulator0.appendNewSource(100, source5);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        pamvotis.sources.Source source5 = null;
        try {
            boolean boolean6 = simulator0.appendNewSource(10, source5);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        try {
            boolean boolean3 = simulator0.removeNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        try {
            float float2 = simulator0.getUtil((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        try {
            float float10 = simulator0.getMDelay((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        try {
            float float6 = simulator0.getThrPkts((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        try {
            float float4 = simulator0.getThrPkts((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        try {
            float float4 = simulator0.getQLength(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        try {
            float float9 = simulator0.getThrBps((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        try {
            float float9 = simulator0.getQLength((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        try {
            simulator0.changeNodeParams(1, (int) (byte) 100, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        try {
            float float3 = simulator0.getJitter((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        float float5 = simulator0.getSysThrPkts();
        try {
            boolean boolean7 = simulator0.removeNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getMDelay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        try {
            simulator0.removeSource((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        try {
            float float2 = simulator0.getQLength(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        try {
            float float12 = simulator0.getDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        try {
            float float10 = simulator0.getThrBps((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        try {
            float float11 = simulator0.getQDelay((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        try {
            float float5 = simulator0.getThrBps((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        try {
            float float13 = simulator0.getMDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        float float9 = simulator0.getMDelay(100);
        try {
            boolean boolean11 = simulator0.removeNode((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        try {
            simulator0.changeNodeParams((int) (short) -1, (-1), (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        try {
            float float12 = simulator0.getThrPkts((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        try {
            float float3 = simulator0.getUtil(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        try {
            boolean boolean4 = simulator0.removeNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        long long2 = simulator0.getTime();
        try {
            float float4 = simulator0.getDelay((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        try {
            simulator0.removeSource((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        try {
            float float12 = simulator0.getJitter((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        long long2 = simulator0.getTime();
        try {
            pamvotis.core.MobileNode mobileNode4 = simulator0.getNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        try {
            pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        try {
            simulator0.removeSource((int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        try {
            float float11 = simulator0.getJitter((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        try {
            float float5 = simulator0.getUtil(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        try {
            float float10 = simulator0.getDelay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        try {
            float float10 = simulator0.getUtil((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        try {
            boolean boolean3 = simulator0.removeAllSources((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        try {
            float float4 = simulator0.getQDelay((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        try {
            float float4 = simulator0.getUtil((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        try {
            simulator0.removeSource((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        try {
            simulator0.changeNodeParams(0, (int) (byte) 0, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        try {
            float float11 = simulator0.getRatts((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        java.lang.Class<?> wildcardClass1 = simulator0.getClass();
        try {
            boolean boolean3 = simulator0.removeNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        try {
            float float3 = simulator0.getDelay(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        try {
            pamvotis.core.MobileNode mobileNode6 = simulator0.getNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        simulator0.confParams();
        try {
            simulator0.removeSource((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        try {
            float float5 = simulator0.getDelay((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        try {
            float float10 = simulator0.getThrBps((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        float float5 = simulator0.getSysThrPkts();
        try {
            boolean boolean7 = simulator0.removeNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        try {
            pamvotis.core.MobileNode mobileNode10 = simulator0.getNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        try {
            boolean boolean5 = simulator0.removeNode((int) (short) -1);
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
            System.out.format("%n%s%n", "RegressionTest0.test080");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        float float5 = simulator0.getSysThrPkts();
        try {
            float float7 = simulator0.getQLength(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        try {
            float float5 = simulator0.getUtil((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        try {
            float float11 = simulator0.getUtil(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        try {
            float float11 = simulator0.getJitter((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        try {
            float float12 = simulator0.getJitter((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        try {
            simulator0.removeSource((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        try {
            float float5 = simulator0.getJitter((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        try {
            boolean boolean6 = simulator0.removeAllSources((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        try {
            float float5 = simulator0.getMDelay((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        float float9 = simulator0.getSysThrBps();
        try {
            float float11 = simulator0.getThrBps((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        try {
            float float4 = simulator0.getMDelay((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        try {
            float float10 = simulator0.getUtil((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        try {
            float float3 = simulator0.getJitter((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        simulator0.addNode((int) (byte) 10, (int) '4', (int) '#', (int) (short) 1, 1, (int) 'a');
        try {
            float float12 = simulator0.getQLength((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        float float9 = simulator0.getSysThrBps();
        try {
            float float11 = simulator0.getJitter((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        try {
            float float6 = simulator0.getMDelay((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        try {
            boolean boolean3 = simulator0.removeNode(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        simulator0.removeAllNodes();
        try {
            float float13 = simulator0.getQDelay((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        float float5 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) ' ', (-1), (int) '#', (int) (short) 100, (int) (byte) 0);
        try {
            pamvotis.core.MobileNode mobileNode14 = simulator0.getNode((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        try {
            simulator0.addNode(100, 0, (-1), (int) (short) 10, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementExistsException; message: Node 100 already exists.");
        } catch (pamvotis.exceptions.ElementExistsException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        int int10 = simulator0.getProgress();
        try {
            simulator0.addNode(0, (int) 'a', (int) (short) 0, (int) (short) -1, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementExistsException; message: Node 0 already exists.");
        } catch (pamvotis.exceptions.ElementExistsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        pamvotis.sources.Source source15 = null;
        try {
            boolean boolean16 = simulator0.appendNewSource((int) '4', source15);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        try {
            float float9 = simulator0.getThrPkts((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        try {
            pamvotis.core.MobileNode mobileNode10 = simulator0.getNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        try {
            float float5 = simulator0.getDelay((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        try {
            boolean boolean3 = simulator0.removeNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        try {
            pamvotis.core.MobileNode mobileNode3 = simulator0.getNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float11 = simulator0.getSysUtil();
        try {
            float float13 = simulator0.getQDelay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        long long10 = simulator0.getTime();
        try {
            float float12 = simulator0.getJitter((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        try {
            simulator0.removeSource((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        try {
            simulator0.removeSource((int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        try {
            simulator0.removeSource((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        try {
            float float4 = simulator0.getJitter(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysThrPkts();
        try {
            float float14 = simulator0.getThrPkts((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        simulator0.confParams();
        try {
            float float12 = simulator0.getQLength((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        long long2 = simulator0.getTime();
        try {
            float float4 = simulator0.getQLength((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        java.lang.Class<?> wildcardClass1 = simulator0.getClass();
        try {
            float float3 = simulator0.getQDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        try {
            float float4 = simulator0.getThrPkts((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysThrBps();
        try {
            float float4 = simulator0.getDelay((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        try {
            simulator0.changeNodeParams((int) (byte) 0, 0, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        simulator0.addNode((int) (byte) 10, (int) '4', (int) '#', (int) (short) 1, 1, (int) 'a');
        try {
            float float12 = simulator0.getMDelay(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        try {
            simulator0.removeSource((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        try {
            float float11 = simulator0.getThrPkts((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        try {
            float float4 = simulator0.getQLength((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        try {
            float float14 = simulator0.getThrBps((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        long long4 = simulator0.getTime();
        try {
            float float6 = simulator0.getRatts(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        try {
            float float6 = simulator0.getThrBps((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.removeAllNodes();
        try {
            float float13 = simulator0.getMDelay((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        try {
            float float12 = simulator0.getThrPkts((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        try {
            float float15 = simulator0.getDelay((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float11 = simulator0.getSysUtil();
        try {
            float float13 = simulator0.getRatts((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float11 = simulator0.getSysUtil();
        try {
            float float13 = simulator0.getRatts(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        try {
            float float10 = simulator0.getQLength((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        try {
            pamvotis.core.MobileNode mobileNode14 = simulator0.getNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        try {
            simulator0.changeNodeParams((int) (byte) 1, (int) (short) 1, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1 >= 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        try {
            simulator0.changeNodeParams(10, (int) 'a', 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        java.lang.Class<?> wildcardClass1 = simulator0.getClass();
        float float2 = simulator0.getSysUtil();
        try {
            float float4 = simulator0.getMDelay((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        try {
            boolean boolean13 = simulator0.removeNode(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        try {
            float float12 = simulator0.getUtil((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        try {
            simulator0.removeSource((int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        long long4 = simulator0.getTime();
        try {
            float float6 = simulator0.getRatts((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        try {
            float float14 = simulator0.getRatts(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        try {
            simulator0.addNode((int) (short) 0, (int) (byte) 100, 0, 100, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementExistsException; message: Node 0 already exists.");
        } catch (pamvotis.exceptions.ElementExistsException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        try {
            boolean boolean3 = simulator0.removeNode((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        try {
            float float6 = simulator0.getDelay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysUtil();
        try {
            float float17 = simulator0.getMDelay((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        try {
            float float3 = simulator0.getMDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        try {
            simulator0.addNode((int) (byte) -1, 1, (int) (byte) 1, (int) (byte) 0, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementExistsException; message: Node -1 already exists.");
        } catch (pamvotis.exceptions.ElementExistsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        try {
            float float5 = simulator0.getJitter((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        try {
            boolean boolean4 = simulator0.removeAllSources((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        try {
            float float6 = simulator0.getUtil(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        try {
            simulator0.removeSource((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        try {
            simulator0.removeSource((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        try {
            float float12 = simulator0.getRatts((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        try {
            float float12 = simulator0.getThrBps((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        try {
            float float15 = simulator0.getRatts((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        java.lang.Class<?> wildcardClass1 = simulator0.getClass();
        float float2 = simulator0.getSysUtil();
        try {
            boolean boolean4 = simulator0.removeNode(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysUtil();
        try {
            simulator0.changeNodeParams((int) ' ', (int) (short) 10, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32 >= 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        float float14 = simulator0.getSysUtil();
        try {
            float float16 = simulator0.getDelay((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float11 = simulator0.getSysUtil();
        try {
            float float13 = simulator0.getThrBps((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        simulator0.confParams();
        try {
            simulator0.removeSource((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        try {
            float float6 = simulator0.getQDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        float float14 = simulator0.getMDelay(0);
        try {
            float float16 = simulator0.getThrPkts((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        try {
            float float12 = simulator0.getMDelay((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) ' ', 0, (int) (byte) 100, (int) (short) 0);
        try {
            simulator0.removeSource((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Source 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        try {
            boolean boolean16 = simulator0.removeNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float13 = simulator0.getSysThrPkts();
        try {
            boolean boolean15 = simulator0.removeAllSources((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        try {
            boolean boolean15 = simulator0.removeNode(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        try {
            float float3 = simulator0.getJitter((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        try {
            float float13 = simulator0.getJitter(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        simulator0.confParams();
        try {
            float float12 = simulator0.getMDelay((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        try {
            float float5 = simulator0.getQDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        try {
            float float3 = simulator0.getThrBps((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        try {
            boolean boolean6 = simulator0.removeNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        long long2 = simulator0.getTime();
        try {
            pamvotis.core.MobileNode mobileNode4 = simulator0.getNode((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        try {
            float float7 = simulator0.getQDelay((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        try {
            pamvotis.core.MobileNode mobileNode13 = simulator0.getNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        long long2 = simulator0.getTime();
        try {
            boolean boolean4 = simulator0.removeNode((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) ' ', 0, (int) (byte) 100, (int) (short) 0);
        try {
            float float18 = simulator0.getMDelay((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        long long3 = simulator0.getTime();
        try {
            boolean boolean5 = simulator0.removeAllSources((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        float float9 = simulator0.getSysThrBps();
        try {
            float float11 = simulator0.getJitter((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        try {
            float float15 = simulator0.getUtil((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.addNode((int) '#', (int) (short) -1, (int) ' ', (int) (byte) 10, 100, (int) (byte) 0);
        try {
            float float11 = simulator0.getMDelay((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float13 = simulator0.getSysThrPkts();
        try {
            float float15 = simulator0.getRatts((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        float float9 = simulator0.getMDelay(100);
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        try {
            float float12 = simulator0.getThrBps((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.removeAllNodes();
        try {
            boolean boolean13 = simulator0.removeNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        try {
            simulator0.removeSource((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.addNode((int) '#', (int) (short) -1, (int) ' ', (int) (byte) 10, 100, (int) (byte) 0);
        try {
            simulator0.removeSource((int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        long long18 = simulator0.getTime();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        try {
            float float15 = simulator0.getUtil((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        try {
            simulator0.changeNodeParams(10, (int) (byte) 0, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10 >= 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        try {
            float float5 = simulator0.getRatts(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        long long3 = simulator0.getTime();
        try {
            boolean boolean5 = simulator0.removeNode((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int12 = simulator0.getProgress();
        float float14 = simulator0.getQDelay(0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        try {
            float float12 = simulator0.getQLength(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        simulator0.addNode((int) (byte) 10, (int) '4', (int) '#', (int) (short) 1, 1, (int) 'a');
        try {
            simulator0.removeSource((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        try {
            float float11 = simulator0.getDelay((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        java.lang.Class<?> wildcardClass1 = simulator0.getClass();
        float float2 = simulator0.getSysUtil();
        try {
            float float4 = simulator0.getQLength((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        try {
            boolean boolean15 = simulator0.removeAllSources((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        float float11 = simulator0.getSysUtil();
        pamvotis.sources.Source source13 = null;
        try {
            boolean boolean14 = simulator0.appendNewSource((int) (short) 10, source13);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.confParams();
        try {
            simulator0.changeNodeParams((-1), 0, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        try {
            float float14 = simulator0.getJitter((int) (short) 100);
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        int int10 = simulator0.getProgress();
        try {
            pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.confParams();
        try {
            float float17 = simulator0.getQDelay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrBps();
        pamvotis.sources.Source source5 = null;
        try {
            boolean boolean6 = simulator0.appendNewSource((int) (byte) 0, source5);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        float float5 = simulator0.getSysThrPkts();
        try {
            simulator0.removeSource((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysUtil();
        try {
            boolean boolean14 = simulator0.removeAllSources((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        try {
            float float5 = simulator0.getThrBps((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        try {
            float float6 = simulator0.getThrPkts(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        try {
            float float4 = simulator0.getRatts((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        simulator0.confParams();
        try {
            float float13 = simulator0.getQLength(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        try {
            float float6 = simulator0.getUtil((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        try {
            simulator0.changeNodeParams((int) (short) 1, (int) 'a', (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        float float4 = simulator0.getSysThrBps();
        try {
            boolean boolean6 = simulator0.removeNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        try {
            float float5 = simulator0.getDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getQLength((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        pamvotis.sources.Source source12 = null;
        try {
            boolean boolean13 = simulator0.appendNewSource((int) 'a', source12);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysThrPkts();
        pamvotis.sources.Source source17 = null;
        try {
            boolean boolean18 = simulator0.appendNewSource((int) (byte) 10, source17);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        try {
            float float10 = simulator0.getMDelay((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        try {
            float float7 = simulator0.getMDelay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        float float13 = simulator0.getSysUtil();
        try {
            boolean boolean15 = simulator0.removeAllSources((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        try {
            float float12 = simulator0.getUtil((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        float float9 = simulator0.getSysThrBps();
        float float11 = simulator0.getUtil(100);
        float float12 = simulator0.getSysThrPkts();
        try {
            float float14 = simulator0.getThrBps(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        long long3 = simulator0.getTime();
        try {
            float float5 = simulator0.getDelay((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        float float9 = simulator0.getSysThrBps();
        float float11 = simulator0.getUtil(100);
        try {
            simulator0.addNode(100, 100, (int) '4', (int) (short) 10, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementExistsException; message: Node 100 already exists.");
        } catch (pamvotis.exceptions.ElementExistsException e) {
        }
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        simulator0.confParams();
        int int11 = simulator0.getProgress();
        try {
            float float13 = simulator0.getUtil((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getMDelay((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysThrPkts();
        try {
            float float17 = simulator0.getUtil((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.addNode((int) '#', (int) (short) -1, (int) ' ', (int) (byte) 10, 100, (int) (byte) 0);
        simulator0.addNode((int) (short) 10, (-1), (int) (short) 10, (int) (short) 100, (int) (byte) 10, (int) '#');
        try {
            float float18 = simulator0.getThrPkts((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        try {
            boolean boolean3 = simulator0.removeNode((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        try {
            float float5 = simulator0.getMDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        long long3 = simulator0.getTime();
        try {
            float float5 = simulator0.getMDelay((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        pamvotis.sources.Source source11 = null;
        try {
            boolean boolean12 = simulator0.appendNewSource(1, source11);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.removeAllNodes();
        try {
            boolean boolean12 = simulator0.removeNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        try {
            float float6 = simulator0.getDelay((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.confParams();
        try {
            pamvotis.core.MobileNode mobileNode17 = simulator0.getNode((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.confParams();
        pamvotis.sources.Source source17 = null;
        try {
            boolean boolean18 = simulator0.appendNewSource((int) (byte) 10, source17);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        try {
            float float4 = simulator0.getThrBps((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        long long10 = simulator0.getTime();
        try {
            float float12 = simulator0.getThrBps((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        simulator0.confParams();
        try {
            float float13 = simulator0.getThrBps((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        pamvotis.sources.Source source12 = null;
        try {
            boolean boolean13 = simulator0.appendNewSource(100, source12);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        pamvotis.sources.Source source5 = null;
        try {
            boolean boolean6 = simulator0.appendNewSource((int) ' ', source5);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        try {
            float float11 = simulator0.getUtil((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        try {
            boolean boolean4 = simulator0.removeAllSources(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.removeAllNodes();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        float float5 = simulator0.getSysThrPkts();
        try {
            boolean boolean7 = simulator0.removeNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        try {
            float float12 = simulator0.getQDelay((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        try {
            boolean boolean13 = simulator0.removeAllSources((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        try {
            pamvotis.core.MobileNode mobileNode5 = simulator0.getNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.confParams();
        try {
            pamvotis.core.MobileNode mobileNode17 = simulator0.getNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        try {
            boolean boolean4 = simulator0.removeAllSources(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        try {
            float float7 = simulator0.getDelay((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        try {
            simulator0.removeSource((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getRatts(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        simulator0.addNode(100, 0, (int) (byte) 100, 0, (int) (short) 1, (int) '#');
        try {
            pamvotis.core.MobileNode mobileNode23 = simulator0.getNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        try {
            float float10 = simulator0.getMDelay((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        long long5 = simulator0.getTime();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getQDelay((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        int int1 = simulator0.getProgress();
        try {
            float float3 = simulator0.getMDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        long long2 = simulator0.getTime();
        float float3 = simulator0.getSysThrPkts();
        try {
            boolean boolean5 = simulator0.removeNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        try {
            pamvotis.core.MobileNode mobileNode7 = simulator0.getNode(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        long long5 = simulator0.getTime();
        try {
            float float7 = simulator0.getDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float13 = simulator0.getSysThrPkts();
        try {
            float float15 = simulator0.getDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        try {
            float float3 = simulator0.getJitter((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        try {
            float float4 = simulator0.getUtil((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.confParams();
        try {
            float float12 = simulator0.getJitter((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        try {
            float float14 = simulator0.getUtil((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        try {
            boolean boolean11 = simulator0.removeNode(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        try {
            simulator0.changeNodeParams((int) '4', (int) (byte) 10, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52 >= 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        pamvotis.sources.Source source9 = null;
        try {
            boolean boolean10 = simulator0.appendNewSource((int) (byte) 1, source9);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        long long3 = simulator0.getTime();
        try {
            float float5 = simulator0.getThrPkts(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float13 = simulator0.getSysThrPkts();
        float float14 = simulator0.getSysUtil();
        try {
            boolean boolean16 = simulator0.removeAllSources((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        simulator0.removeAllNodes();
        long long12 = simulator0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        try {
            float float9 = simulator0.getThrPkts((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        try {
            simulator0.removeSource(10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        try {
            float float6 = simulator0.getQLength((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        try {
            float float11 = simulator0.getThrPkts((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        try {
            float float6 = simulator0.getDelay((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        simulator0.addNode((int) (byte) 10, (int) '4', (int) '#', (int) (short) 1, 1, (int) 'a');
        float float11 = simulator0.getSysThrPkts();
        try {
            float float13 = simulator0.getMDelay((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        long long5 = simulator0.getTime();
        try {
            float float7 = simulator0.getQLength((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        try {
            boolean boolean8 = simulator0.removeAllSources((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        simulator0.addNode(100, 0, (int) (byte) 100, 0, (int) (short) 1, (int) '#');
        int int22 = simulator0.getProgress();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        try {
            simulator0.removeSource((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Source 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        try {
            boolean boolean3 = simulator0.removeNode(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float11 = simulator0.getSysUtil();
        try {
            float float13 = simulator0.getJitter((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        try {
            float float5 = simulator0.getThrPkts((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        pamvotis.sources.Source source6 = null;
        try {
            boolean boolean7 = simulator0.appendNewSource((-1), source6);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        try {
            float float3 = simulator0.getThrPkts((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        float float4 = simulator0.getSysThrBps();
        try {
            float float6 = simulator0.getThrPkts((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        try {
            float float11 = simulator0.getRatts((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        try {
            pamvotis.core.MobileNode mobileNode5 = simulator0.getNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        long long3 = simulator0.getTime();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        try {
            float float8 = simulator0.getThrBps(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysThrPkts();
        simulator0.confParams();
        pamvotis.sources.Source source15 = null;
        try {
            boolean boolean16 = simulator0.appendNewSource((-1), source15);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        float float13 = simulator0.getSysUtil();
        pamvotis.sources.Source source15 = null;
        try {
            boolean boolean16 = simulator0.appendNewSource((int) 'a', source15);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float15 = simulator0.getThrBps(0);
        try {
            boolean boolean17 = simulator0.removeNode(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        try {
            float float6 = simulator0.getThrPkts((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        long long10 = simulator0.getTime();
        try {
            float float12 = simulator0.getThrPkts((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        simulator0.addNode((-1), 100, 0, 0, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        try {
            boolean boolean7 = simulator0.removeAllSources(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.addNode((int) ' ', (-1), (int) (short) 0, 10, (int) (byte) 10, 0);
        try {
            boolean boolean21 = simulator0.removeAllSources((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        simulator0.printMeanValues();
        try {
            float float14 = simulator0.getUtil((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        try {
            pamvotis.core.MobileNode mobileNode5 = simulator0.getNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        try {
            float float4 = simulator0.getRatts(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        try {
            boolean boolean14 = simulator0.removeAllSources((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        int int3 = simulator0.getProgress();
        long long4 = simulator0.getTime();
        try {
            float float6 = simulator0.getQLength((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        simulator0.removeAllNodes();
        try {
            boolean boolean14 = simulator0.removeNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.addNode((int) '4', (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, (int) (short) -1);
        try {
            float float12 = simulator0.getQLength((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        long long2 = simulator0.getTime();
        float float3 = simulator0.getSysThrPkts();
        try {
            float float5 = simulator0.getQDelay((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.confParams();
        try {
            float float5 = simulator0.getThrBps((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        simulator0.confParams();
        try {
            simulator0.changeNodeParams((int) (byte) 0, (int) (short) 100, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        long long3 = simulator0.getTime();
        pamvotis.sources.Source source5 = null;
        try {
            boolean boolean6 = simulator0.appendNewSource((int) (short) -1, source5);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        float float11 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        try {
            float float14 = simulator0.getThrPkts((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        simulator0.confParams();
        int int5 = simulator0.getProgress();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        simulator0.addNode(0, 10, (int) (short) 10, (int) (short) 1, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
            float float19 = simulator0.getQDelay((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
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
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        int int3 = simulator0.getProgress();
        try {
            boolean boolean5 = simulator0.removeNode((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        float float19 = simulator0.getDelay((int) (short) 1);
        pamvotis.sources.Source source21 = null;
        try {
            boolean boolean22 = simulator0.appendNewSource((-1), source21);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrPkts();
        try {
            float float14 = simulator0.getUtil((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        simulator0.printMeanValues();
        pamvotis.sources.Source source16 = null;
        try {
            boolean boolean17 = simulator0.appendNewSource((int) (short) 1, source16);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (short) 1, 0, 100, (int) '#', (int) (byte) 1, (int) (short) 10);
        try {
            pamvotis.core.MobileNode mobileNode21 = simulator0.getNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        int int3 = simulator0.getProgress();
        try {
            simulator0.changeNodeParams((int) (short) 10, (-1), (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        int int3 = simulator0.getProgress();
        try {
            simulator0.changeNodeParams((int) ' ', (int) 'a', 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        try {
            float float4 = simulator0.getUtil((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        simulator0.confParams();
        try {
            float float13 = simulator0.getMDelay((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        try {
            float float6 = simulator0.getDelay((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        simulator0.addNode((int) (byte) 10, (int) '4', (int) '#', (int) (short) 1, 1, (int) 'a');
        float float11 = simulator0.getSysThrPkts();
        float float13 = simulator0.getUtil((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        float float13 = simulator0.getSysUtil();
        simulator0.confParams();
        try {
            float float16 = simulator0.getUtil(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        try {
            simulator0.removeSource(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        try {
            pamvotis.core.MobileNode mobileNode6 = simulator0.getNode((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        try {
            float float4 = simulator0.getQDelay((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        int int10 = simulator0.getProgress();
        simulator0.removeAllNodes();
        try {
            float float13 = simulator0.getJitter((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        try {
            float float8 = simulator0.getRatts((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int12 = simulator0.getProgress();
        int int13 = simulator0.getProgress();
        pamvotis.sources.Source source15 = null;
        try {
            boolean boolean16 = simulator0.appendNewSource((int) (byte) -1, source15);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (short) 10, (int) (byte) -1, 100, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        simulator0.removeAllNodes();
        int int10 = simulator0.getProgress();
        try {
            pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        int int3 = simulator0.getProgress();
        pamvotis.sources.Source source5 = null;
        try {
            boolean boolean6 = simulator0.appendNewSource(100, source5);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        try {
            float float4 = simulator0.getJitter((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        try {
            float float15 = simulator0.getThrPkts((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        float float13 = simulator0.getSysUtil();
        simulator0.confParams();
        try {
            simulator0.changeNodeParams(100, (int) (short) 10, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100 >= 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(mobileNode12);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        try {
            float float7 = simulator0.getJitter((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        int int18 = simulator0.getProgress();
        try {
            float float20 = simulator0.getThrBps((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        long long2 = simulator0.getTime();
        simulator0.printMeanValues();
        try {
            boolean boolean5 = simulator0.removeNode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        try {
            pamvotis.core.MobileNode mobileNode4 = simulator0.getNode(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        try {
            pamvotis.core.MobileNode mobileNode9 = simulator0.getNode(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        simulator0.confParams();
        try {
            float float8 = simulator0.getRatts(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        float float14 = simulator0.getSysThrBps();
        float float16 = simulator0.getJitter((-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        long long5 = simulator0.getTime();
        try {
            float float7 = simulator0.getMDelay((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
            float float17 = simulator0.getQLength(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        float float7 = simulator0.getSysThrBps();
        try {
            float float9 = simulator0.getDelay((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        try {
            boolean boolean9 = simulator0.removeNode(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getQDelay((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        long long14 = simulator0.getTime();
        try {
            boolean boolean16 = simulator0.removeAllSources((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        float float11 = simulator0.getSysUtil();
        try {
            boolean boolean13 = simulator0.removeNode(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.confParams();
        float float4 = simulator0.getSysUtil();
        long long5 = simulator0.getTime();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        try {
            boolean boolean6 = simulator0.removeAllSources((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        float float14 = simulator0.getSysThrBps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        float float19 = simulator0.getDelay((int) (short) 1);
        try {
            float float21 = simulator0.getRatts((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysThrPkts();
        try {
            float float14 = simulator0.getThrPkts(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        try {
            float float12 = simulator0.getUtil(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        long long5 = simulator0.getTime();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        try {
            boolean boolean8 = simulator0.removeAllSources((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        float float5 = simulator0.getSysThrPkts();
        try {
            float float7 = simulator0.getRatts((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        try {
            float float8 = simulator0.getQDelay((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        try {
            float float8 = simulator0.getQDelay((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        try {
            float float15 = simulator0.getThrPkts((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        try {
            float float5 = simulator0.getUtil((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        try {
            float float3 = simulator0.getThrPkts((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
            float float18 = simulator0.getMDelay((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        int int12 = simulator0.getProgress();
        simulator0.printMeanValues();
        try {
            float float15 = simulator0.getRatts((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        try {
            boolean boolean13 = simulator0.removeNode((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.addNode((int) ' ', (-1), (int) (short) 0, 10, (int) (byte) 10, 0);
        try {
            simulator0.changeNodeParams((int) (short) 100, 0, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100 >= 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        float float5 = simulator0.getSysThrPkts();
        try {
            boolean boolean7 = simulator0.removeNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        int int18 = simulator0.getProgress();
        try {
            float float20 = simulator0.getJitter(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysUtil();
        boolean boolean17 = simulator0.removeNode(0);
        try {
            float float19 = simulator0.getUtil((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        simulator0.confParams();
        try {
            float float8 = simulator0.getThrBps((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysThrPkts();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        simulator0.confParams();
        try {
            float float20 = simulator0.getDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        float float13 = simulator0.getSysUtil();
        try {
            simulator0.changeNodeParams((int) '4', (int) (short) 100, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52 >= 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        float float5 = simulator0.getSysThrPkts();
        try {
            float float7 = simulator0.getThrBps((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        pamvotis.sources.Source source6 = null;
        try {
            boolean boolean7 = simulator0.appendNewSource(0, source6);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        try {
            boolean boolean7 = simulator0.removeNode((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        simulator0.confParams();
        try {
            float float8 = simulator0.getMDelay((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        int int18 = simulator0.getProgress();
        try {
            simulator0.removeSource((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        simulator0.removeAllNodes();
        try {
            simulator0.changeNodeParams((int) 'a', 100, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        long long3 = simulator0.getTime();
        try {
            boolean boolean5 = simulator0.removeAllSources(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysThrPkts();
        try {
            float float14 = simulator0.getUtil((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        float float5 = simulator0.getSysThrPkts();
        try {
            simulator0.changeNodeParams((int) (short) 0, (int) (short) -1, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        long long2 = simulator0.getTime();
        simulator0.printMeanValues();
        try {
            float float5 = simulator0.getThrPkts((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float14 = simulator0.getThrPkts((int) (byte) 0);
        try {
            float float16 = simulator0.getUtil((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float12 = simulator0.getSysThrBps();
        try {
            pamvotis.core.MobileNode mobileNode14 = simulator0.getNode((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        java.lang.Class<?> wildcardClass1 = simulator0.getClass();
        float float2 = simulator0.getSysUtil();
        try {
            float float4 = simulator0.getJitter((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        int int10 = simulator0.getProgress();
        simulator0.addNode((int) 'a', 1, (int) (short) 10, 0, (int) (byte) 100, (int) (byte) 10);
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.removeAllNodes();
        pamvotis.sources.Source source12 = null;
        try {
            boolean boolean13 = simulator0.appendNewSource((int) 'a', source12);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.addNode((int) '4', (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        float float12 = simulator0.getSysUtil();
        try {
            float float14 = simulator0.getDelay((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        simulator0.removeAllNodes();
        simulator0.removeAllNodes();
        try {
            float float6 = simulator0.getQLength((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        simulator0.confParams();
        try {
            float float8 = simulator0.getThrBps(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        float float15 = simulator0.getSysUtil();
        try {
            float float17 = simulator0.getRatts((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
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
            boolean boolean17 = simulator0.removeAllSources((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        simulator0.addNode(100, 0, (int) (byte) 100, 0, (int) (short) 1, (int) '#');
        try {
            simulator0.printHeaders();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
            float float19 = simulator0.getThrPkts((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
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
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        try {
            float float15 = simulator0.getJitter((int) (short) 100);
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
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysThrBps();
        int int5 = simulator0.getProgress();
        try {
            float float7 = simulator0.getDelay((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        float float4 = simulator0.getSysThrBps();
        try {
            simulator0.changeNodeParams((int) 'a', (int) 'a', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        simulator0.removeAllNodes();
        try {
            simulator0.removeSource((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        try {
            simulator0.removeSource(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        try {
            simulator0.removeSource((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        simulator0.removeAllNodes();
        simulator0.removeAllNodes();
        try {
            float float14 = simulator0.getMDelay(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.addNode((int) '4', (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        try {
            float float13 = simulator0.getThrBps(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysUtil();
        try {
            float float14 = simulator0.getQLength((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysThrPkts();
        try {
            float float17 = simulator0.getDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        try {
            float float9 = simulator0.getRatts((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        java.lang.Class<?> wildcardClass7 = simulator0.getClass();
        try {
            boolean boolean9 = simulator0.removeAllSources(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        long long3 = simulator0.getTime();
        simulator0.confParams();
        try {
            float float6 = simulator0.getQLength((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysUtil();
        float float5 = simulator0.getSysThrBps();
        try {
            boolean boolean7 = simulator0.removeAllSources((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        int int18 = simulator0.getProgress();
        try {
            float float20 = simulator0.getThrBps((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysUtil();
        boolean boolean17 = simulator0.removeNode(0);
        try {
            float float19 = simulator0.getQDelay((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysUtil();
        float float17 = simulator0.getMDelay((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float15 = simulator0.getThrBps(0);
        long long16 = simulator0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        pamvotis.sources.Source source5 = null;
        try {
            boolean boolean6 = simulator0.appendNewSource((int) (byte) -1, source5);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        float float3 = simulator0.getSysThrBps();
        try {
            float float5 = simulator0.getQDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        try {
            boolean boolean6 = simulator0.removeNode((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        int int11 = simulator0.getProgress();
        try {
            float float13 = simulator0.getUtil((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        try {
            float float4 = simulator0.getUtil((int) 'a');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.addNode((int) '4', (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        try {
            float float13 = simulator0.getMDelay(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        long long14 = simulator0.getTime();
        try {
            simulator0.changeNodeParams((int) (short) 100, 0, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        float float11 = simulator0.getJitter(10);
        try {
            float float13 = simulator0.getDelay(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        long long2 = simulator0.getTime();
        try {
            pamvotis.core.MobileNode mobileNode4 = simulator0.getNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        simulator0.confParams();
        try {
            pamvotis.core.MobileNode mobileNode13 = simulator0.getNode(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.confParams();
        float float16 = simulator0.getSysThrPkts();
        try {
            float float18 = simulator0.getJitter(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals((float) float16, Float.NaN, 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysThrPkts();
        simulator0.confParams();
        simulator0.changeNodeParams((int) (short) 0, (int) '#', (-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        simulator0.addNode(100, 10, (int) (byte) 100, (int) (short) 1, (int) 'a', (int) '#');
        try {
            float float12 = simulator0.getQLength((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        float float12 = simulator0.getSysThrPkts();
        try {
            boolean boolean14 = simulator0.removeNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        simulator0.removeAllNodes();
        try {
            simulator0.changeNodeParams((int) (short) -1, (-1), (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        try {
            float float14 = simulator0.getMDelay((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        java.lang.Class<?> wildcardClass1 = simulator0.getClass();
        float float2 = simulator0.getSysThrBps();
        try {
            pamvotis.core.MobileNode mobileNode4 = simulator0.getNode((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.confParams();
        pamvotis.sources.Source source6 = null;
        try {
            boolean boolean7 = simulator0.appendNewSource((int) 'a', source6);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 97 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        float float15 = simulator0.getSysUtil();
        boolean boolean17 = simulator0.removeNode(0);
        java.lang.Class<?> wildcardClass18 = simulator0.getClass();
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float15, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        float float7 = simulator0.getSysThrBps();
        try {
            float float9 = simulator0.getThrBps((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.addNode((int) '4', (int) (byte) 10, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        float float12 = simulator0.getSysUtil();
        pamvotis.sources.Source source14 = null;
        try {
            boolean boolean15 = simulator0.appendNewSource(0, source14);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        try {
            pamvotis.core.MobileNode mobileNode10 = simulator0.getNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
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
            float float24 = simulator0.getUtil((int) (short) 100);
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
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        float float5 = simulator0.getSysThrPkts();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        try {
            float float6 = simulator0.getThrBps((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.addNode((int) (byte) 1, (int) (short) 100, (int) (byte) 10, (-1), 100, 10);
        try {
            float float23 = simulator0.getMDelay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        simulator0.printMeanValues();
        try {
            float float16 = simulator0.getDelay(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        float float9 = simulator0.getSysThrBps();
        float float11 = simulator0.getUtil(100);
        float float12 = simulator0.getSysThrPkts();
        try {
            float float14 = simulator0.getJitter((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        long long2 = simulator0.getTime();
        float float3 = simulator0.getSysThrBps();
        simulator0.confParams();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        long long14 = simulator0.getTime();
        try {
            pamvotis.core.MobileNode mobileNode16 = simulator0.getNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        float float13 = simulator0.getJitter(0);
        try {
            pamvotis.core.MobileNode mobileNode15 = simulator0.getNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        simulator0.addNode((int) (short) -1, 100, (int) '4', 100, 0, 0);
        float float20 = simulator0.getThrPkts((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals((float) float20, Float.NaN, 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        long long3 = simulator0.getTime();
        float float4 = simulator0.getSysThrPkts();
        try {
            float float6 = simulator0.getThrPkts((int) '4');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 52 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        try {
            float float3 = simulator0.getQLength((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        simulator0.addNode((int) (byte) 10, (int) (short) 1, (int) 'a', (int) 'a', (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        float float10 = simulator0.getSysUtil();
        float float11 = simulator0.getSysThrPkts();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        int int13 = simulator0.getProgress();
        try {
            float float15 = simulator0.getQLength((int) '#');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 35 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        float float11 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        long long13 = simulator0.getTime();
        try {
            float float15 = simulator0.getDelay((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        simulator0.confParams();
        float float3 = simulator0.getSysThrBps();
        simulator0.addNode(1, (int) (short) 0, (int) '4', (int) 'a', 1, 0);
        float float12 = simulator0.getJitter((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        long long3 = simulator0.getTime();
        try {
            float float5 = simulator0.getThrBps((int) ' ');
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 32 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        long long2 = simulator0.getTime();
        float float3 = simulator0.getSysThrPkts();
        try {
            float float5 = simulator0.getQLength((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        try {
            boolean boolean12 = simulator0.removeNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        float float14 = simulator0.getSysThrPkts();
        float float15 = simulator0.getSysUtil();
        try {
            float float17 = simulator0.getMDelay((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        long long5 = simulator0.getTime();
        try {
            float float7 = simulator0.getJitter(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        try {
            float float16 = simulator0.getUtil((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        simulator0.confParams();
        simulator0.confParams();
        pamvotis.core.MobileNode mobileNode15 = simulator0.getNode((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertNotNull(mobileNode15);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        simulator0.addNode((int) (byte) 10, (int) '4', (int) '#', (int) (short) 1, 1, (int) 'a');
        try {
            float float12 = simulator0.getJitter((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        int int3 = simulator0.getProgress();
        simulator0.addNode((int) (byte) 10, (int) '4', (int) '#', (int) (short) 1, 1, (int) 'a');
        try {
            float float12 = simulator0.getQLength((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        long long4 = simulator0.getTime();
        try {
            boolean boolean6 = simulator0.removeNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) 0, (int) 'a', (int) 'a', (int) (short) 1, (int) 'a');
        try {
            float float11 = simulator0.getQLength(10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        java.lang.Class<?> wildcardClass7 = simulator0.getClass();
        try {
            float float9 = simulator0.getThrPkts((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        float float10 = simulator0.getSysUtil();
        try {
            simulator0.removeSource((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Source 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        try {
            simulator0.removeSource(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 10 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        float float5 = simulator0.getSysThrBps();
        try {
            float float7 = simulator0.getJitter((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        simulator0.addNode((int) (short) 10, (int) (short) 100, (int) (short) 0, (int) (short) 100, (int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = simulator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        float float10 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass11 = simulator0.getClass();
        try {
            float float13 = simulator0.getThrPkts(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        float float5 = simulator0.getSysThrPkts();
        try {
            boolean boolean7 = simulator0.removeNode((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        long long3 = simulator0.getTime();
        int int4 = simulator0.getProgress();
        try {
            float float6 = simulator0.getMDelay(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        pamvotis.sources.Source source12 = null;
        boolean boolean13 = simulator0.appendNewSource(0, source12);
        float float14 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals((float) float14, Float.NaN, 0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        int int3 = simulator0.getProgress();
        simulator0.removeAllNodes();
        try {
            float float6 = simulator0.getUtil((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        long long3 = simulator0.getTime();
        try {
            simulator0.removeSource(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((int) (short) 10, (-1), (int) 'a', 10, (int) (short) -1, (int) '4');
        simulator0.confParams();
        float float12 = simulator0.getSysUtil();
        simulator0.confParams();
        try {
            float float15 = simulator0.getQDelay((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals((float) float12, Float.NaN, 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) (short) 10, (int) (short) 1, 0, 100, 1);
        float float13 = simulator0.getUtil(0);
        simulator0.confParams();
        float float16 = simulator0.getDelay((int) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals((float) float13, Float.NaN, 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        float float10 = simulator0.getSysThrBps();
        simulator0.addNode((int) (byte) 1, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        simulator0.confParams();
        simulator0.removeAllNodes();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        simulator0.removeAllNodes();
        simulator0.removeAllNodes();
        try {
            float float6 = simulator0.getThrPkts((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        java.lang.Class<?> wildcardClass4 = simulator0.getClass();
        try {
            pamvotis.core.MobileNode mobileNode6 = simulator0.getNode(100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        float float9 = simulator0.getSysThrBps();
        float float11 = simulator0.getUtil(100);
        try {
            simulator0.changeNodeParams((int) (short) 10, (int) (short) -1, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10 >= 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertEquals((float) float9, Float.NaN, 0);
        org.junit.Assert.assertEquals((float) float11, Float.NaN, 0);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        try {
            float float12 = simulator0.getQLength((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        simulator0.removeAllNodes();
        try {
            simulator0.changeNodeParams(10, (int) '#', 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10 >= 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        long long4 = simulator0.getTime();
        try {
            float float6 = simulator0.getQLength((-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        simulator0.removeAllNodes();
        java.lang.Class<?> wildcardClass4 = simulator0.getClass();
        try {
            pamvotis.core.MobileNode mobileNode6 = simulator0.getNode(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        int int10 = simulator0.getProgress();
        simulator0.printMeanValues();
        try {
            float float13 = simulator0.getRatts(0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        try {
            simulator0.removeSource((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 100 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        try {
            float float8 = simulator0.getDelay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node -1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        simulator0.addNode(100, 0, (int) 'a', (-1), (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        try {
            float float11 = simulator0.getRatts((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 0 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        int int2 = simulator0.getProgress();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        long long2 = simulator0.getTime();
        float float3 = simulator0.getSysThrPkts();
        try {
            float float5 = simulator0.getMDelay(1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        try {
            float float13 = simulator0.getUtil((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type pamvotis.exceptions.ElementDoesNotExistException; message: Node 1 does not exist.");
        } catch (pamvotis.exceptions.ElementDoesNotExistException e) {
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals((float) float10, Float.NaN, 0);
    }
}

