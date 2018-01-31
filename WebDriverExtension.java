package test;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class WebDriverExtension implements ParameterResolver{

	@Override
	public Object resolveParameter(ParameterContext parameterContext,ExtensionContext extensionContext) throws ParameterResolutionException {
		Class<?> para = parameterContext.getParameter().getType();
		if (para == Chrome.class) {
			return new Chrome();
		}else if (para == Edge.class){
			return new Edge();
		}else if (para == IE.class){
			return new IE();
		}else if (para == Firefox.class){
			return new Firefox();
		}else if (para == ChromeHeadless.class){
			return new ChromeHeadless();
		}else if (para == FirefoxHeadless.class){
			return new FirefoxHeadless();
		}else {
			return null;
		}
	}

	@Override
	public boolean supportsParameter(ParameterContext parameterContext,ExtensionContext extensionContext) throws ParameterResolutionException {
		Class<?> para = parameterContext.getParameter().getType();
		if (para == Chrome.class || para == Edge.class || para == IE.class || para == Firefox.class || para == ChromeHeadless.class || para == FirefoxHeadless.class) {
			return true;
		}else {
			return false;
		}
	}

}
