package in.shiv.binding;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UploadMaterial {
	private Integer uploadTypes;
	private String description;
	private Double price;
	private MultipartFile inputFile;
	
}
