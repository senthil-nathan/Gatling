package versent.api.loadtest.commons

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object HttpHeaders {

  val TUAPI_OAuth_header = Map(
    //"Keep-Alive" -> "30",
    "Content-Type" -> "application/x-www-form-urlencoded")

  val httpProtocol = http
    .baseURL(Config.environment)
    //.proxy("10.72.128.49", 8080)
    .acceptHeader("application/json")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Gatling API Test")

}

