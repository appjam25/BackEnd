package com.backend.backend_java.global.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Configuration
public class SecurityConfig {

//    private final JwtTokenProvider jwtTokenProvider;
//
//    private final ObjectMapper objectMapper;
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    protected SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception {
//
//        httpSecurity
//                .csrf(AbstractHttpConfigurer::disable)
//
//                .cors(cors -> cors
//                        .configurationSource(corsConfigurationSource())
//                )
//
//                .headers(headers -> headers
//                        .frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin
//                        )
//                )
//
//                .sessionManagement(sessionManagement -> sessionManagement
//                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                )
//
//                .authorizeHttpRequests(authorize -> authorize
//
//                        .requestMatchers("/auth/**", "/main", "/club/info/**", "/user/all", "/main/banner",
//                                "/image", "/notice/all", "/notice/info/**", "/inquiry/create", "/notice/search-notice/**")
//                        .permitAll()
//
//                        .requestMatchers("/notice/apply/**", "/report/apply/**", "/report/cancel/**", "/report-info/**",
//                                "/interview/choose-time", "/interview/query-time", "/notice/select")
//                        .hasAnyRole("INDEPENDENT", "ADMIN")
//
//                        .requestMatchers("/report/applicant/**", "/report/query-memo/**", "/report/modify-memo", "/question/query/**")
//                        .hasAnyRole("CLUB_MEMBER", "CLUB_LEADER", "ADMIN")
//
//                        .requestMatchers("/club/modify", "/notice/create", "/notice/update", "/notice/delete/**", "/question/answer", "/notice/add-quest", "/notice/all-quest/**", "/alarm/cancel", "/question/delete/**",
//                                "notice/delete-noticeQuest/**", "/mess/create", "/mess/delete/**", "/alarm/interview-result", "/interview/modify-time", "/interview/club-time/**", "/interview/delete-time/**")
//                        .hasAnyRole("CLUB_LEADER", "ADMIN")
//
//                        .requestMatchers("/admin-club/create", "/admin-club/delete/**", "/admin-club/page",
//                                "/admin-club/edit-member", "/mess/accept/**", "/mess/all"
//                        ).hasRole( "ADMIN")
//
//                        .requestMatchers("/announcement/create")
//                        .hasRole("REVERIE")
//
//                        .anyRequest().authenticated()
//                )
//
//                .with(new FilterConfig(jwtTokenProvider, objectMapper), Customizer.withDefaults());
//
//        return httpSecurity.build();
//
//    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();

        configuration.setAllowedOrigins(List.of("*")); // 모든 도메인 허용
        configuration.setAllowedMethods(Arrays.asList( "OPTIONS", "GET", "POST", "PUT", "PATCH", "DELETE")); // HTTP 메서드 허용
        configuration.setAllowCredentials(false);
        configuration.addAllowedHeader("*"); // 모든 헤더 허용

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration); // 모든 경로에 대해 위에서 설정한 CORS 설정 적용
        return source;
    }
}

