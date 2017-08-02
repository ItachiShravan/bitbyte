package com.espn.urlbyter.impl;

import com.espn.urlbyter.domain.URLEntity;
import com.espn.urlbyter.repository.URLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class URLShortnerImpl
{
    @Autowired URLRepository urlRepository;

    public String generateShortenURL(String parentURL)
    {
        String urlId = UUID.randomUUID().toString().subSequence(0, 6).toString();
        //TOOO add logic to check uniqueness of urlid and regenerate if required
        URLEntity urlEntity = new URLEntity();
        urlEntity.setRedirectId(urlId);
        urlEntity.setRedirectURL(parentURL);
        urlRepository.save(urlEntity);
        return generateRedirectURL(urlId);
    }

    private String generateRedirectURL(String urlId)
    {
        return "http://localhost:8080/r/" + urlId;
    }

    public String getRedirectURL(String urlId)
    {
        return urlRepository.findByRedirectId(urlId).get(0).getRedirectURL();
    }
}
