package in.AnantIT.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	@Id
	@Column(name = "Book_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "Book_Name")
	private String name;
	
	@Column(name = "Book_Price")
	private Integer price;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Books() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", price=" + price  + "]";
	}
	
}
