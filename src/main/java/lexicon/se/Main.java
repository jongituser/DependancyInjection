package lexicon.se;
import lexicon.se.config.ComponentScanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import lexicon.se.data_access.StudentDao;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        StudentDao studentDao = context.getBean(StudentDao.class);
    }
}