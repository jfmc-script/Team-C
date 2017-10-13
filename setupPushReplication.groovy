artifactoryToUserInput = userInput (
    name : "Input to name artifactory",
    type : "ARTIFACTORY",
    description : "please provide a name for the artifactory"
)

artifactory(artifactoryToUserInput.name) {
  localRepository("teamc-generic-local") {
    replication(artifactoryToUserInput) {
      username admin
      password password
	  url https://artifactory-edge2-team-c.jfrogdev.co/artifactory/
      cronExp "0 0/9 14 * * ?"
      socketTimeoutMillis 15000
    }
  }
}