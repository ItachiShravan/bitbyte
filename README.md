# URL shortner utility

## This is a spring boot project to generate the shorten URL for given WEB URL.

Call POST METHOD to below URL, which will return the shorten URL. Returned short URL can be used to refer the new address.

http://localhost:8080/shortenURL

Sample POST DATA :
{
	"url":"http://www.bing.com"
}

Sample Return :

http://localhost:8080/r/abdfef

##Further enhancement that are planned

1. Refactoring method to generate random string to avoid duplicate and have duplicate check.
2. URL expiry, if the URL is not accessed for a long time, we can reuse this URL and assign it to new URL.