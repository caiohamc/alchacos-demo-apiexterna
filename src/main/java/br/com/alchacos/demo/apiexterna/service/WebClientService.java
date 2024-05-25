package br.com.alchacos.demo.apiexterna.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebClientService {

    private final WebClient webClient;

    public WebClientService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.github.com").build();
    }

    public Mono<String> getGitHubUser(String username) {
        return this.webClient.get()
                .uri("/users/{username}", username)
                .retrieve()
                .bodyToMono(String.class);
    }
}