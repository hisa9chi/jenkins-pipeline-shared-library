import java.io.BufferedReader 
import java.io.InputStreamReader 
import java.io.OutputStreamWriter 
import java.net.URL 
import java.net.URLConnection 

def call(urlString, paramString) { 
    def url = new URL(urlString) 
    def conn = url.openConnection() 
    conn.setDoOutput(true) 
    def writer = new OutputStreamWriter(conn.getOutputStream()) 

    writer.write(paramString) 
    writer.flush() 
    String line 
    def reader = new BufferedReader(new  InputStreamReader(conn.getInputStream())) 
    while ((line = reader.readLine()) != null) { 
     println line 
    } 
    writer.close() 
    reader.close() 
} 