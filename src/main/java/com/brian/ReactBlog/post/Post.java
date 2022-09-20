package com.brian.ReactBlog.post;

import org.joda.time.DateTime;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column (name = "authorID", nullable = false)
    private Long authorId;
    @Column (name = "parentId", nullable = true)
    private Long parentId;
    @Column (name = "title", nullable = false)
    private String title;
    @Column (name = "metaTitle", nullable = false)
    private String metaTitle;
    @Column (name = "slug", nullable = false)
    private String slug;
    @Column (name = "summary", nullable = false)
    private String summary;
    @Column (name = "published", nullable = false)
    private int published;
    @Column (name = "createdAt", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private DateTime createdAt;
    @Column (name = "updatedAt", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private DateTime updatedAt;
    @Column (name = "publishedAt", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private DateTime publishedAt;
    @Column (name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    public Post() {
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(DateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}