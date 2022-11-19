package hackerank.arcesium;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JsonParserProgram {

    /*
     * Complete the 'calculateNAV' function below.
     *
     * The function is expected to return a DOUBLE.
     * The function accepts STRING date as parameter.
     */

    public static void main(String[] args) {
        //apiResponseParser(Arrays.asList("username", "EQUALS","vinayk"), 0);
        apiResponseParser(Arrays.asList("address.city", "IN", "Mumbai, Kolkata"), 0);
    }

    private static String getApiData(String urll) {
        try {
            URL url = new URL(urll);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();
            String inline = "";
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()) {
                inline += scanner.nextLine();
            }

            scanner.close();

            return inline;

        } catch (Exception e) {
            System.out.println("exception code =" + e);
        }
        return "";
    }

    private static List<Integer> apiResponseParser(List<String> inputList, int size) {
        String URL = "https://raw.githubusercontent.com/arcjsonapi/ApiSampleData/master/api/users";
        String response = getApiData(URL);
        JsonElement jelement = new JsonParser().parse(response);
        JsonArray jobject = jelement.getAsJsonArray();
        int jResponseLength = jobject.size();
        String jsonId = "";
        String jsonIdChild = "";
        String criteria = "";
        String searchText = "";
        String searchText2 = "";

        if (!inputList.isEmpty()) {
            jsonId = inputList.get(0);
            criteria = inputList.get(1);
            searchText = inputList.get(2);
        }

        List<Integer> matchingId = new ArrayList<>();
        String str = new String("Udemy.txt");
        String s = "test.test";

        if (searchText.contains(",")) {
            String result[] = searchText.split("\\,");

            searchText = result[0];
            searchText2 = result[1];
        }
        if (jsonId.contains(".")) {
            String result[] = jsonId.split("\\.");

            jsonId = result[0];
            jsonIdChild = result[1];

        }

        if ("EQUALS".equals(criteria) && jsonIdChild.isEmpty()) { // Noramal Case
            for (int i = 0; i <= jResponseLength; i++) {
                JsonElement resp = jelement.getAsJsonArray().get(i).getAsJsonObject().get(jsonId);
                if (resp.getAsString().equals(searchText)) {
                    matchingId.add(i);
                    System.out.println("resp = " + resp);
                }
            }
        }

        if ("IN".equals(criteria)) {
            for (int i = 0; i < jResponseLength; i++) {
                JsonElement resp = jelement.getAsJsonArray().get(i).getAsJsonObject().get(jsonId);
                if (!resp.isJsonNull()) {
                    JsonElement respIN = resp.getAsJsonObject().get(jsonIdChild);
                    if (respIN.getAsString().equals(searchText.replaceAll("\\s", ""))
                    ) {

                        matchingId.add(i + 1);
                        System.out.println("resp = " + resp);
                    } else {
                        if (respIN.getAsString().equals(searchText2.replaceAll("\\s", ""))) {
                            matchingId.add(i + 1);
                            System.out.println("resp = " + resp);
                        }
                    }
                }
            }
        }
        return matchingId;

    }


}
