import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

def call(urlString) { 
    private OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder().url(urlString).build();
    Response response = client.newCall(request).execute();
    ResponseBody body = response.body();

    return body
}
