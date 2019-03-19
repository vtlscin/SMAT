import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.printHeaders();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        simulator0.simulate((long) 10, 0L);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        float float5 = simulator0.getSysThrPkts();
        simulator0.printHeaders();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrBps();
        simulator0.printHeaders();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode((int) (byte) 100, (int) (short) 0, (int) ' ', (int) ' ', 100, (int) (short) 10);
        float float9 = simulator0.getMDelay(100);
        simulator0.printHeaders();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.simulate((long) (byte) 1, (long) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.printHeaders();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        simulator0.printHeaders();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        float float2 = simulator0.getSysUtil();
        int int3 = simulator0.getProgress();
        float float4 = simulator0.getSysThrBps();
        simulator0.printHeaders();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.printHeaders();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        simulator0.printHeaders();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        float float15 = simulator0.getSysUtil();
        simulator0.printHeaders();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        simulator0.simulate((long) 'a', (long) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        simulator0.printHeaders();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.removeAllNodes();
        long long5 = simulator0.getTime();
        simulator0.simulate(10L, 0L);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        simulator0.printMeanValues();
        simulator0.printMeanValues();
        simulator0.simulate((long) 100, (long) (-1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        simulator0.simulate((long) '#', (long) 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float4 = simulator0.getSysThrPkts();
        float float5 = simulator0.getSysThrPkts();
        simulator0.addNode((int) (byte) 0, (int) ' ', (-1), (int) '#', (int) (short) 100, (int) (byte) 0);
        simulator0.printHeaders();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.printMeanValues();
        simulator0.simulate((long) (byte) -1, (-1L));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        int int13 = simulator0.getProgress();
        simulator0.simulate((long) 1, (long) (short) 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.removeAllNodes();
        simulator0.confParams();
        float float3 = simulator0.getSysThrBps();
        simulator0.addNode(1, (int) (short) 0, (int) '4', (int) 'a', 1, 0);
        simulator0.printHeaders();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float13 = simulator0.getSysThrPkts();
        simulator0.printHeaders();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysUtil();
        long long11 = simulator0.getTime();
        simulator0.simulate((long) 1, (long) (-1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        float float14 = simulator0.getSysUtil();
        simulator0.removeAllNodes();
        simulator0.simulate((long) (byte) 100, (long) (-1));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.removeAllNodes();
        float float14 = simulator0.getSysThrPkts();
        simulator0.printHeaders();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), 100, (int) 'a', (int) '4', (int) ' ', 0);
        float float11 = simulator0.getSysUtil();
        simulator0.printHeaders();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        simulator0.confParams();
        simulator0.printHeaders();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((int) (short) 10, (-1), (int) 'a', 10, (int) (short) -1, (int) '4');
        simulator0.confParams();
        float float12 = simulator0.getSysUtil();
        simulator0.simulate(10L, (long) (byte) -1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        int int10 = simulator0.getProgress();
        simulator0.printMeanValues();
        simulator0.printHeaders();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        long long3 = simulator0.getTime();
        simulator0.printHeaders();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        simulator0.printHeaders();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        float float10 = simulator0.getSysThrBps();
        simulator0.printHeaders();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.confParams();
        simulator0.printHeaders();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        int int2 = simulator0.getProgress();
        long long3 = simulator0.getTime();
        int int4 = simulator0.getProgress();
        simulator0.printHeaders();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.addNode(100, 0, (int) (byte) 0, (int) (short) 1, (int) (short) 100, (int) (short) -1);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass9 = simulator0.getClass();
        simulator0.confParams();
        simulator0.printHeaders();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        simulator0.confParams();
        java.lang.Class<?> wildcardClass10 = simulator0.getClass();
        pamvotis.core.MobileNode mobileNode12 = simulator0.getNode((int) (short) 0);
        simulator0.printHeaders();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        float float5 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass6 = simulator0.getClass();
        long long7 = simulator0.getTime();
        simulator0.printHeaders();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        float float2 = simulator0.getSysThrBps();
        simulator0.printMeanValues();
        simulator0.confParams();
        simulator0.printHeaders();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        long long12 = simulator0.getTime();
        float float14 = simulator0.getDelay(0);
        simulator0.confParams();
        simulator0.simulate((long) 'a', (long) (-1));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrBps();
        long long11 = simulator0.getTime();
        java.lang.Class<?> wildcardClass12 = simulator0.getClass();
        simulator0.printHeaders();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysThrBps();
        float float3 = simulator0.getSysThrBps();
        float float4 = simulator0.getSysUtil();
        float float5 = simulator0.getSysThrPkts();
        simulator0.printHeaders();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.addNode((int) (byte) 10, (int) (byte) 100, (int) 'a', (int) 'a', 0, (int) (short) 1);
        int int9 = simulator0.getProgress();
        simulator0.simulate((long) (byte) 10, 0L);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        boolean boolean10 = simulator0.removeNode(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printHeaders();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        float float3 = simulator0.getSysThrPkts();
        long long4 = simulator0.getTime();
        simulator0.printHeaders();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        simulator0.removeAllNodes();
        float float3 = simulator0.getSysUtil();
        int int4 = simulator0.getProgress();
        simulator0.printHeaders();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        simulator0.confParams();
        simulator0.printHeaders();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        simulator0.confParams();
        long long2 = simulator0.getTime();
        long long3 = simulator0.getTime();
        simulator0.printHeaders();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysThrBps();
        float float2 = simulator0.getSysUtil();
        java.lang.Class<?> wildcardClass3 = simulator0.getClass();
        simulator0.addNode((-1), (int) (short) 1, 1, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
        long long11 = simulator0.getTime();
        float float12 = simulator0.getSysThrBps();
        simulator0.addNode((int) ' ', (-1), (int) (short) 0, 10, (int) (byte) 10, 0);
        simulator0.printHeaders();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        float float11 = simulator0.getSysUtil();
        simulator0.printMeanValues();
        float float13 = simulator0.getSysThrPkts();
        float float14 = simulator0.getSysUtil();
        int int15 = simulator0.getProgress();
        simulator0.printHeaders();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        float float1 = simulator0.getSysUtil();
        simulator0.addNode((int) (byte) 0, (-1), 0, (int) (short) 100, (int) '#', (int) (short) 0);
        float float10 = simulator0.getJitter(0);
        simulator0.simulate((long) 100, (long) (byte) 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        pamvotis.core.Simulator simulator0 = new pamvotis.core.Simulator();
        long long1 = simulator0.getTime();
        simulator0.removeAllNodes();
        simulator0.addNode(0, (int) ' ', 1, (int) (byte) 1, 0, 100);
        float float10 = simulator0.getSysThrPkts();
        float float12 = simulator0.getThrBps((int) (byte) 0);
        simulator0.confParams();
        simulator0.confParams();
        simulator0.printHeaders();
    }
}

