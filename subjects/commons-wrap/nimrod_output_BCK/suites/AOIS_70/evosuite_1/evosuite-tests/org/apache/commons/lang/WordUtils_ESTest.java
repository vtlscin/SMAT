/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 16 13:40:26 GMT 2019
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class WordUtils_ESTest extends WordUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.StringIndexOutOfBoundsException : String index out of range: -1
      WordUtils.wrap(";@qw!eN,5,", (-1047));
  }
}