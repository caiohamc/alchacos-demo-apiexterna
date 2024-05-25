package br.com.alchacos.demo.apiexterna.service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class OkHttpService {

    private final OkHttpClient client = new OkHttpClient();

    public String getGitHubUser(String username) throws IOException {
        Request request = new Request.Builder()
                .url("https://api.github.com/users/" + username)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            return response.body().string();
        }
    }
}