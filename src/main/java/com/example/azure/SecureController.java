package com.example.azure;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 *
 * </p>
 *
 * @author praveenkamath
 * created on 11/05/20
 * @since 1.0.0
 */
@Controller
public class SecureController {

	@GetMapping("/secure_page")
	public String securePage(final Model model){
		model.addAttribute("name", "pk");
		return "secure_page";
	}
}
