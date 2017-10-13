artifactory("Art-2") { //Enter the source artifactory node
remoteRepository ('teamc-generic-remote') {
    description "Public description"
    notes "Some internal notes"
    includesPattern "**/*" // default
    excludesPattern "" // default
    repoLayoutRef "maven-2-default"
    propertySets // (["ps1", "ps2"])
    archiveBrowsingEnabled false
    blackedOut false // default
    url "https://artifactory-edge1-team-c.jfrogdev.co/artifactory/teamc-generic-local"
    username "admin"
    password "password" 
    packageType "generic"
  }
}