package lexicon.se;
import lexicon.se.config.ComponentScanConfig;
import lexicon.se.util.UserInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        UserInputService userInputService =context.getBean(UserInputService.class);

    }

}