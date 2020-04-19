package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.exampleBeans.FakeDataSource;
import guru.springframework.sfgdi.exampleBeans.FakeJMSBroKer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dbUrl}")
    String url;


    @Value("${guru.jms.username}")
    String jmsUsername;
    @Value("${guru.jms.password}")
    String jmsPassword;
    @Value("${guru.jms.url}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUsername(user);
        fakeDataSource.setUrl(env.getProperty("GURU_URL"));
        return fakeDataSource;
    }

    @Bean
    public FakeJMSBroKer fakeJMSBroKer(){
        FakeJMSBroKer fakeJMSBroKer = new FakeJMSBroKer();
        fakeJMSBroKer.setPassword(jmsPassword);
        fakeJMSBroKer.setUrl(jmsUrl);
        fakeJMSBroKer.setUsername(jmsUsername);
        return fakeJMSBroKer;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
