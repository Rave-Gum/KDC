package rgproject.kdc.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

    @Id @GeneratedValue
    @Column(name = "COMMENT_ID")
    private Long id;
    @Lob
    private String content;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POST_ID")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

}
