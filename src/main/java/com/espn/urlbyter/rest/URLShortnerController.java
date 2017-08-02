package com.espn.urlbyter.rest;

import com.espn.urlbyter.domain.URLRequest;
import com.espn.urlbyter.impl.URLShortnerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class URLShortnerController
{
    @Autowired URLShortnerImpl urlShortner;

    @RequestMapping(value = "/r/{redirectId}", produces = {
            MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
    public ModelAndView redirectURL(@PathVariable(value = "redirectId") String redirectId)
    {
        return new ModelAndView("redirect:" + urlShortner.getRedirectURL(redirectId));
       // return new ModelAndView("redirect:" + "http://www.yahoo.com");
    }

    @RequestMapping(value = "/shortenURL", produces = {
            MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.POST)
    public String shortenURL(@RequestBody URLRequest urlRequest)
    {
        return urlShortner.generateShortenURL(urlRequest.getUrl());
    }

}

