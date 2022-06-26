package com.nobodycodewithme;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Collectors;

@OpenAPIDefinition(
        info = @Info(title = "Quan ly sinh vien", version = "1.0", description = "Documentation Quan ly sinh vien API v1.0"))
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Lab1JavaCircleciDigitaloceanApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab1JavaCircleciDigitaloceanApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STANDARD);

        return modelMapper;
    }

    @Bean
    public OpenAPI customOpenAPI() {
        List<String> servers = List.of("https://api-quanlysinhvien.ddns.net/",
                "http://localhost:8080");
        return new OpenAPI().servers(
                servers.stream().map(serverUrl -> new Server().url(serverUrl)).collect(Collectors.toList())
        );
    }
}
