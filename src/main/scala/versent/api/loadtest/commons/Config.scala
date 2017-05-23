package versent.api.loadtest.commons

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import versent.api.loadtest.commons._
import versent.api.loadtest.commons.Config._

object Config {
   var environment = ""
  if (System.getProperty("env").toString.equals("au")){
    environment =  "https://www.google.com.au"
  }
  else if (System.getProperty("env").toString.equals("us")){
    environment =  "https://www.google.com"
  }
  else {
    environment = System.getProperty("env").toString
  }
}
