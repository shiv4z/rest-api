package in.shiv.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.shiv.binding.UploadMaterial;

@RestController
public class MaterialController {
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadMaterials(@RequestBody UploadMaterial uploadMaterial){
		System.out.println(uploadMaterial);
		String msg = "Materials has been uploaded successfully.";
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
	
	 @PostMapping(value = "/uploadnew", consumes = "multipart/form-data")
	    public ResponseEntity<String> uploadMaterials(
	            @RequestParam("uploadTypes") Integer uploadTypes,
	            @RequestParam("description") String description,
	            @RequestParam("price") Double price,
	            @RequestParam("inputFile") MultipartFile inputFile) {
	        System.out.println("uploadTypes: " + uploadTypes);
	        System.out.println("description: " + description);
	        System.out.println("price: " + price);
	        System.out.println("Original Filename: " + inputFile.getOriginalFilename());

	        String msg = "Materials have been uploaded successfully.";
	        return new ResponseEntity<>(msg, HttpStatus.CREATED);
	    }

}
