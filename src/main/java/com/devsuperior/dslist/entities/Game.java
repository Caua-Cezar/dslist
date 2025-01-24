package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Title;

    @Column(name = "game_Year")
    private Integer Year;
    private String Genre;
    private String PlataForm;
    private String ImgUrl;
    private String ShortDescription;
    private String LongDescription;

    public Game() {

    }

    public Game(Long id, String Title, Integer Year, String Genre, String PlataForm, String ImgUrl, String ShortDescription, String LongDescription) {
        this.id = id;
        this.Title = Title;
        this.Year = Year;
        this.Genre = Genre;
        this.PlataForm = PlataForm;
        this.ImgUrl = ImgUrl;
        this.ShortDescription = ShortDescription;
        this.LongDescription = LongDescription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer Year) {
        this.Year = Year;
    }
    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getPlataForm() {
        return PlataForm;
    }

    public void setPlataForm(String PlataForm) {
        this.PlataForm = PlataForm;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public String getShortDescription() {
        return ShortDescription;
    }

    public void setShortDescription(String ShortDescription) {
        this.ShortDescription = ShortDescription;
    }

    public String getLongDescription() {
        return LongDescription;
    }

    public void setLongDescription(String LongDescription) {
        this.LongDescription = LongDescription;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
