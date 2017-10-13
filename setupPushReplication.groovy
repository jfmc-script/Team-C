artifactoryToUserInput = userInput (
    simpleName : "Input to name artifactory",
    type : "ARTIFACTORY",
    description : "please provide a to name artifactory"
)

artifactory(artifactoryToUserInput.simpleName) {
  localRepository("local-repository-key") {
    replication(artifactoryToUserInput.simpleName) {
      username "admin"
      password "password"
	  url http://localhost:8082/artifactory/bower-local
      cronExp "0 0/9 14 * * ?"
      socketTimeoutMillis 15000
    }
  }
}