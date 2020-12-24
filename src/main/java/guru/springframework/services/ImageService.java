package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author frank
 * @create 2020-12-23
 */
public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}
