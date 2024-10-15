/**
 * 
 */
/**
 * 
 */
module JPA {
	requires junit;
	requires java.persistence;
	opens br.com.edmar.domain to org.hibernate.orm.core;
}