package org.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;


import java.util.List;

@Entity
@Table(name = "chesspieces")
public class ChessPieces {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;



    @Column(name = "image",columnDefinition = "text")
    @JsonProperty("image")
    private String image;


    @Column(name = "piecename")
    private String pieceName;





    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
