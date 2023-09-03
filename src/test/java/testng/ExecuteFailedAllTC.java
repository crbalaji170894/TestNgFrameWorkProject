package testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class ExecuteFailedAllTC implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation arg01, Class agr02, Constructor arg03, Method arg04) {

		arg01.setRetryAnalyzer(RetryAnalyzer.class);

	}
}
