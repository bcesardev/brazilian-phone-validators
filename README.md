Brazilian Mobile and Land Line phone numbers Validators - Annotations

Complement of Hibernate Validator.

Use with @Valid


Example:

DTO:
	
	public class ContactDTO {

		@NotBlank(message = "Telefone celular não informado")
		@BrazilianMobile(message = "Número do telefone celular inválido")
		String mobile;

		@NotBlank(message = "Telefone fixo não informado")
		@BrazilianMobile(message = "Número do telefone fixo inválido")
		String landLine;

		@NotBlank(message = "Número do telefone para contato não informado")
		@BrazilianMobileOrLandLine(message = "Número de telefone para contato inválido")
		String mobileOrLandLine;
    
      //getters
      //setters

	}
	
Controller:
	
	public void saveContact(@Valid @RequestBody ContactDTO dto) {

      // code
		
	}
  
