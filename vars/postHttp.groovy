import groovy.json.JsonBuilder
@Grab("org.jodd:jodd-http:3.8.5")
import jodd.http.HttpRequest

import java.io.BufferedReader 
import java.io.InputStreamReader 
import java.io.OutputStreamWriter 
import java.net.URL 
import java.net.URLConnection 

def call(urlString) { 
    private HttpRequest httpRequest
    private String userAgent = 'Jenkins'

    def httpRequest = new HttpRequest()

    def resp = httpRequest.get(urlString)
            .header("User-Agent", userAgent)
            .send()
    return resp.bodyText()
}
