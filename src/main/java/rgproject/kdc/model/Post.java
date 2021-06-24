package rgproject.kdc.model;

import java.util.Date;

//@Entity
public class Post {

    //@Id @GeneratedValue
    //@Column(name = "POST_ID")
    private Long id;
    private Long categoryId;
    private String title;
    //@Lob
    private String content;
    //@Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    private Long views;
    private String fileUrl;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "BOARD_ID")
    private Board board;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "MEMBER_ID")
    private Member member;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
