package aliGlez.councilsGameBack.config;

import org.springframework.stereotype.Component;

@Component
public class ImagesStoreConfiguration {
    String uploadDir = "src/main/resources/static/images/";

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
