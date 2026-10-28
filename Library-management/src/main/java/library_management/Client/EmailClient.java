
package library_management.Client;

import library_management.DTO.EmailRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "email-service", url = "${email.service.url}")
public interface EmailClient {

    @PostMapping("/send-email")
    void sendEmail(@RequestBody EmailRequest request);
}
