package dog.ceo.msbreedconfigurations.controller;

import dog.ceo.msbreedconfigurations.dto.UrlResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BreedConfigurationsController {

    @Autowired
    UrlResponse urlResponse;

    @RequestMapping(value="/api/breed/urls", produces = {"application/json"}, method = RequestMethod.GET)
    public ResponseEntity<UrlResponse> getUrlsApiBreed () {
        return new ResponseEntity<UrlResponse>(new UrlResponse(urlResponse.getUrlListAll(), urlResponse.getUrlImagesBreed()), HttpStatus.OK);
    }
}
