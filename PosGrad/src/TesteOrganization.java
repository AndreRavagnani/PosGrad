
public class TesteOrganization {
public static void main(String[] args) {
	Contact c = new Contact();
	c.firstName.englishName = "Robert";
	c.firstName.chineseName = "FlangoFlito";
	c.fax.areaCode = 85;
	c.fax.countryCode = 55;
	c.fax.number = 40050500;
	c.mobile.areaCode = 85;
	c.mobile.countryCode = 55;
	c.mobile.number = 940050500;
	c.phone.areaCode = 85;
	c.phone.countryCode = 55;
	c.phone.number = 40050500;
	
	Organization o = new Organization();
	o.id = 5;
	o.contact = c;
	o.tel.areaCode = 85;
	o.tel.countryCode = 55;
	o.tel.number = 40050500;
	o.fax.areaCode = 85;
	o.fax.countryCode = 55;
	o.fax.number = 40050500;
	o.name.chineseName = "MihLing";
	o.name.englishName ="N�o sei";
	System.out.println("Deu Certo.");
	
}
}
