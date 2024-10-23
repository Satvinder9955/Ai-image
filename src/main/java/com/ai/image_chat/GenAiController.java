package com.ai.image_chat;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.ai.image.ImageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class GenAiController {

    private final ChatService chatService;
    private final ImageService imageService;

    public GenAiController(ChatService chatService) {
        this.chatService = chatService;
        this.imageService = imageService;
    }

    @GetMapping("ask-ai")
    public String getResponse(@RequestParam String prompt) {
        return chatService.getResponse(prompt);
    }

    @GetMapping("ask-ai-options")
    public String getResponseOptions(@RequestParam String prompt) {
        return chatService.getResponseOptions(prompt);
    }
//
//    @GetMapping("generate-images")
//    public void generateImages(HttpServletResponse response, @RequestParam String prompt) throws IOException {
//         ImageResponse imageResponse =imageService.generateImage(prompt);
//         imageResponse.getResult().getOutput().getUrl();
//         String imageUrl = imageResponse.getResult().getOutput().getUrl();
//         response.sendRedirect(imageUrl);
//
//    }
    @GetMapping("generate-images")
    public List<String> generateImages(HttpServletResponse response, @RequestParam String prompt) throws IOException {
         ImageResponse imageResponse =imageService.generateImage(prompt);
        List<String> imageUrls = imageResponse.getResults().stream()
                 .map(result -> result.getOutput().getUrl())
                 .toList();

        return imageUrls;

    }
}

