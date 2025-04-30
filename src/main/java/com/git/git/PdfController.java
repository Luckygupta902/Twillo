package com.git.git;

import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

@RestController
public class PdfController {

    @GetMapping("/download-pdf")
    public ResponseEntity<InputStreamResource> downloadPdf() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            // Define user and owner passwords
            String userPassword = "user123";
            String ownerPassword = "admin123";

            // Set encryption
            WriterProperties writerProperties = new WriterProperties()
                    .setStandardEncryption(
                            userPassword.getBytes(),
                            ownerPassword.getBytes(),
                            EncryptionConstants.ALLOW_PRINTING,
                            EncryptionConstants.ENCRYPTION_AES_128
                    );

            PdfWriter writer = new PdfWriter(byteArrayOutputStream, writerProperties);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);

            document.add(new Paragraph("Hello! This is a password-protected PDF."));
            document.close();

            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Disposition", "attachment; filename=protected.pdf");

            return ResponseEntity.ok()
                    .headers(headers)
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(new InputStreamResource(inputStream));

        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}

