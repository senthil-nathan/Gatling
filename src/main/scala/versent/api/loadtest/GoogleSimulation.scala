package versent.api.loadtest


import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import versent.api.loadtest.commons._
import versent.api.loadtest.chains._

class GoogleSimulation extends Simulation {

  val users = System.getProperty("users").toInt
  val ramp  = System.getProperty("ramp").toInt

  private val DEFAULT_SIMULATION_DURATION = 30;
  var duration = DEFAULT_SIMULATION_DURATION

  if (System.getProperty("duration").equals(""))
    duration = DEFAULT_SIMULATION_DURATION
  else
    duration = System.getProperty("duration").toInt

  println(">> Running simulation for " + duration + " seconds <<")

  val LocationSimulationScenario = scenario("Google_Transactions")
    .during(duration seconds) {
    randomSwitch(
      99.0 -> GoogleHome.Google_Home
    )
  }

  setUp(LocationSimulationScenario.inject(rampUsers(users) over(ramp seconds))).protocols(HttpHeaders.httpProtocol)
 // setUp(scn.inject(constantUsersPerSec(1) during(1 seconds))).protocols(httpProtocol)
 // setUp(scn.inject(atOnceUsers(1)).protocols(httpProtocol))

  //setUp(scn.users(threads).ramp(10).protocolConfig(httpConf))
}