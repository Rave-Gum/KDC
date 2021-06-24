package rgproject.kdc.model;

//@Entity
public class Board {

    //@Id @GeneratedValue
    //@Column(name = "MEMBER_ID")
    private Long id;
    private String name;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "MEMBER_ID")
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
