package br.com.alchacos.demo.apiexterna.service;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class HttpClientService {

    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    public String getGitHubUser(String username) throws IOException {
        HttpGet request = new HttpGet("https://api.github.com/users/" + username);

        try (CloseableHttpResponse response = httpClient.execute(request)) {
            return EntityUtils.toString(response.getEntity());
        }
    }
}