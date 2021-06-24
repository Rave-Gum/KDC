package rgproject.kdc.model;

import java.util.ArrayList;
import java.util.List;

//@Entity
public class Category {

    //@Id @GeneratedValue
    //@Column(name = "CATEGORY_ID")
    private Long id;
    private String name;

    //@OneToMany(mappedBy = "category")
    private List<Board> boards = new ArrayList<>();

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

    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }
}
