package org.debugroom.sample.aws.codebuild.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan("org.debugroom.sample.aws.codebuild")
@Configuration
public class MvcConfig implements WebMvcConfigurer {
}
