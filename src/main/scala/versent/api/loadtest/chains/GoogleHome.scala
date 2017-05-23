package versent.api.loadtest.chains

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import versent.api.loadtest.commons._

object GoogleHome {

  var min_thinktime = 0;
  var max_thinktime = 15;


  val Google_Home = exec(http("Google_Home")
    .get("/?gws_rd=ssl")
    .check(status.is(200)))
    .pause(min_thinktime seconds, max_thinktime seconds)

}

