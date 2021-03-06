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
    proxy "proxy-ref"
    socketTimeoutMillis 15000
    retrievalCachePeriodSecs 43200
    failedRetrievalCachePeriodSecs 30
    missedRetrievalCachePeriodSecs 7200
    unusedArtifactsCleanupEnabled false
    unusedArtifactsCleanupPeriodHours 0
    shareConfiguration false
    synchronizeProperties false
    enableCookieManagement false
  }
}