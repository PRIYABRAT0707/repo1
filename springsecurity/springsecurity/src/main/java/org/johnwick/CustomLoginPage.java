package org.johnwick;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class CustomLoginPage  {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authz) -> {
                    try {
                        authz.anyRequest().authenticated().and().formLogin(form->form.loginPage("/login").loginProcessingUrl("/loginsub").defaultSuccessUrl("/").permitAll()).logout().permitAll();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });

        return http.build();
    }
    @Bean
    public UserDetailsService getUserDetails() {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        UserDetails user =
                User.builder()
                        .username("ppanda")
                        .password(encoder.encode("priya1997"))
                        .roles("USER")
                        .build();
        return new InMemoryUserDetailsManager(user);

    }


   /*@Bean(name = "filter1")
    public SecurityFilterChain myFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((aut)->aut.anyRequest().permitAll()).httpBasic(withDefaults());

        return http.build();
    }
*/
  /* @Bean(name = "filter2")
    public SecurityFilterChain SecFilter(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable();

        return http.build();
    }*/

   /* @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers("/member");
    }*/
  /*  @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests().requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/**").hasRole("USER").and().formLogin();
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.builder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        UserDetails admin = User.builder()
                .username("admin")
                .password("password")
                .roles("ADMIN", "USER")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }
*/
  /* @Bean(name = "filter24")
   public SecurityFilterChain myFilterChain(HttpSecurity http) throws Exception {
       http.

       return http.build();
   }
*/



}
