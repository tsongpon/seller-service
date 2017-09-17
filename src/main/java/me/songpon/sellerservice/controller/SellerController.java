package me.songpon.sellerservice.controller;

import me.songpon.sellerservice.domain.Seller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 */
@RestController
public class SellerController {

    private final Logger log = LoggerFactory.getLogger(SellerController.class);

    @GetMapping("/v1/sellers/{id}")
    public ResponseEntity<?> getSeller(@PathVariable Long id) {
        log.info("Get request for seller info id {}", id);
        //just return mock seller
        Seller seller = new Seller(id, "Ethan Hunt", "etan@imf.gov");

        return ResponseEntity.ok(seller);
    }
}
