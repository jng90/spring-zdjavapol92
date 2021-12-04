package pl.sda.springzdjavapol92.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .httpBasic()
                .realmName("spring")
                .and()
                .csrf()
                .disable()
                .headers()
                .and()
                .authorizeHttpRequests()
                .antMatchers("/todo/**").authenticated()
                .anyRequest().permitAll()
                .and();
    }
}
