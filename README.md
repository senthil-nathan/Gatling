# Gatling
Gatling is a Load/Stress test tool to test web &amp; mobile applications REST API endpoints. It support HTTP/HTTPS protocols only.

# How to run Load/Stress test ?

gradle loadtestGoogleHome -Pusers=1 -Pramp=1 -Pduration=200 -Penv=au

gradle loadtestGoogleHome -Pusers=1 -Pramp=1 -Pduration=200 -Penv=us


# I dont have Gradle installed, how do I run the test ?

gradle wrapper --gradle-version 2.0

./gradlew loadtestGoogleHome -Pusers=1 -Pramp=1 -Pduration=200 -Penv=au


# I need more details
http://gatling.io/
