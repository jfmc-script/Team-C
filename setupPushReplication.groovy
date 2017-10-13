artifactoryToUserInput = userInput (
    name : "Input to name artifactory",
    type : "ARTIFACTORY",
    description : "please provide a to name artifactory"
)

artifactory(artifactoryToUserInput.name) {
  localRepository("teamc-generic-local") {
    replication() {
      username "admin"
      password "password"
	  url "https://artifactory-edge2-team-c.jfrogdev.co/artifactory"
      cronExp "0 0/9 14 * * ?"
      socketTimeoutMillis 15000
    }
  }
}