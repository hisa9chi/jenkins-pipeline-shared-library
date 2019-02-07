import groovy.json.JsonBuilder
@Grab("org.jodd:jodd-http:3.8.5")
import jodd.http.HttpRequest

def call(urlString) { 
    private HttpRequest httpRequest = new HttpRequest()
    private String userAgent = 'Jenkins'

    def resp = httpRequest.get(urlString)
            .header("User-Agent", userAgent)
            .send()
    return resp
}
