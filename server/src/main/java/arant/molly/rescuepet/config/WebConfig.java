package arant.molly.rescuepet.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by mollyarant on 7/5/17.
 */
@EnableWebMvc
@Configuration
@ComponentScan("arant.molly.rescuepet")
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public RestTemplate template() {return new RestTemplate();}


}
