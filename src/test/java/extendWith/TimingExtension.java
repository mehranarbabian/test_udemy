package extendWith;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TimingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        getStore(extensionContext).put("StartTime",System.currentTimeMillis());
        System.out.println("after ");

    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("before");
    }
    private ExtensionContext.Store getStore(ExtensionContext context)
    {
        return context.getStore(ExtensionContext.Namespace.create(getClass(),context.getRequiredTestMethod()));
    }
}
