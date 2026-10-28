package library_management.email_microservice.Controller;

import library_management.email_microservice.DTO.EmailRequest;
import library_management.email_microservice.Service.EmailService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send-email")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public String sendEmail(@RequestBody EmailRequest request) {

        emailService.sendEmail(
                request.getEmail(),
                request.getMessage()
        );

        return "Email request received successfully";
    }
}