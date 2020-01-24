package dog.ceo.msbreedconfigurations.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UrlResponse {

    @Value("${url.list.all}")
    private String urlListAll;
    @Value("${url.images.breed}")
    private String urlImagesBreed;

    public UrlResponse() {
    }

    public UrlResponse(String urlListAll, String urlImagesBreed) {
        this.urlListAll = urlListAll;
        this.urlImagesBreed = urlImagesBreed;
    }

    public String getUrlListAll() {
        return urlListAll;
    }
    public String getUrlImagesBreed() {
        return urlImagesBreed;
    }
}
