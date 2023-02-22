package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.StudentDetails;

public class DemoDao {
EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
EntityManager entityManager =entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction =entityManager.getTransaction();

public void insert(StudentDetails studentDetails)
{
	entityTransaction.begin();
	entityManager.persist(studentDetails);
	entityTransaction.commit();
}
public void update(int id, String address) {
	StudentDetails details =entityManager.find(StudentDetails.class, id);
	System.out.println(details);
	details.setAddress(address);
	entityTransaction.begin();
	entityManager.merge(details);
	entityTransaction.commit();
}
public String delete(int id) {
	
		StudentDetails details =entityManager.find(StudentDetails.class, id);
		if(details!=null){
	entityTransaction.begin();
	entityManager.remove(details);
	entityTransaction.commit();
	return "data deleted";
}
		else
return "id did not found enter the valid id";	
}

public List<StudentDetails> fetchall(){
	Query query=entityManager.createQuery("select data from StudentDetails data");
	List<StudentDetails> details =query.getResultList();
	return details;
}
}
