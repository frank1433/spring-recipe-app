package guru.springframework.services.impl;

import guru.springframework.services.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author frank
 * @create 2020-12-23
 */
@Slf4j
@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {
           log.debug("received a file");
    }
}
