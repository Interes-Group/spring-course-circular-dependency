package sk.stuba.fei.uim.asos.cvicenie1.circulardependency;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularDependencyApplication {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext(new String[]{"config.xml"});
    }
}