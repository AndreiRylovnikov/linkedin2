//package com.linkedin;
//
//
//import com.jayway.restassured.RestAssured;
//import com.jayway.restassured.http.ContentType;
//import com.jayway.restassured.response.Response;
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import static com.jayway.restassured.RestAssured.basic;
//import  static  com.jayway.restassured.RestAssured.get;
//import static com.jayway.restassured.path.json.JsonPath.given;
//
//
//public class TestRailRestTests {
//    @BeforeClass
//    public void beforeClass(){
//        RestAssured.baseURI = "https://arylovnikov.testrail.net";
//        RestAssured.authentication = basic("rylovnikov.a@gmail.com", "IzJaev51VYi1QQZv1YUN");
//        RestAssured.requestContentType(ContentType.JSON);
//
//    }
//    @Test
//    public void TestCaseTest(){
//        int testCaseId = 1;
//        Response response = given().header("Authorization", "Basic cnlsb3ZuaWtvdi5hQGdtYWlsLmNvbTpJekphZXY1MVZZaTFRUVp2MVlVTg==").when().get("/index.php?/api/v2/get_case{t}", testCaseId);
//        System.out.println(response.asString());
//        String testCaseTitle = "verify succesful user login";
//        Assert.assertTrue(response.asString().contains(testCaseTitle),"Test case title not found in output");
//        Assert.assertEquals(200, response.getStatusCode(), "Status code is wrong");
//    }
//
//
//
////    @Test
////    public  void  test2(){
////        given()
////                .header("Authorization","Basic cnlsb3ZuaWtvdi5hQGdtYWlsLmNvbTpJekphZXY1MVZZaTFRUVp2MVlVTg==")
////                .expect()
////                .statusCode(200)
////                .response()
////                .when()
////                .get("/index.php?/api/v2/get_case{t}");
////
////
////    }
//}
//
