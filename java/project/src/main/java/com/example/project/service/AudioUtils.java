package com.example.project.service;

import org.springframework.web.multipart.MultipartFile;
import java.nio.file.*;

public class AudioUtils {

        public static void uploadAudio(MultipartFile audio) throws Exception {
            Path path = Path.of("uploads/audio/" + audio.getOriginalFilename());
            Files.createDirectories(path.getParent());
            Files.write(path, audio.getBytes());
        }

        public static byte[] getAudioBytes(String filePath) throws Exception {
            Path path = Path.of(filePath);
            return Files.readAllBytes(path);
        }
}
