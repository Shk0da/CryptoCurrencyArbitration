package ai.trading.bot.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider {

    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextProvider.applicationContext = applicationContext;
    }
}
