package com.espn.urlbyter.domain;

import javax.persistence.*;

@Entity
public class URLEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String redirectURL;

    String redirectId;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getRedirectURL()
    {
        return redirectURL;
    }

    public void setRedirectURL(String redirectURL)
    {
        this.redirectURL = redirectURL;
    }

    public String getRedirectId()
    {
        return redirectId;
    }

    public void setRedirectId(String redirectId)
    {
        this.redirectId = redirectId;
    }
}
