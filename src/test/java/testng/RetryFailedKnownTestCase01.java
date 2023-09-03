package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedKnownTestCase01 {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testName() {

		Assert.assertEquals(false, true);

	}

	@Test
	private void testName2() {
		Assert.assertEquals(false, false);

	}

}
