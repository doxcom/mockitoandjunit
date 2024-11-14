package com.example.unit_testing.business;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

    String actualResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";


    @Test
    public void JsonAssert_StrictTrue() throws JSONException {
        //dont care about spaces
        String expectedResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, true);
    }


    @Test
    public void JsonAssert_StrictFalse() throws JSONException {
        //dont care about missing element on json
        String expectedResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, false);
    }

    @Test
    public void JsonAssert_WithoutEscapeCharacters() throws JSONException {
        //dont care about missing element on json
        String expectedResponse = "{id:1,name:\"Ball\",price:10}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, false);
    }

}
