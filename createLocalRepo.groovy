repokeyArt1 = userInput (
    type : "STRING", // "BOOLEAN", "INTEGER", "INSTANCE", "REPOSITORY"
    description : "Repository Key",
    validations : (["cron"])
  )

artifactory("Art-1") { //Enter the source artifactory node
localRepository(repokeyArt1) {
description "Public description"
    notes "Some internal notes"
    includesPattern "**/*" // default
    excludesPattern "" // default
    repoLayoutRef "maven-2-default"
    propertySets // (["ps1", "ps2"])
    archiveBrowsingEnabled false
    blackedOut false // default
    packageType "generic"
}
}


artifactory("Art-2") { //Enter the target/s artifactory. Repeat the artifactory closure for every target in star topology.
localRepository(repokeyArt1) {
description "Public description"
    notes "Some internal notes"
    includesPattern "**/*" // default
    excludesPattern "" // default
    repoLayoutRef "maven-2-default"
    propertySets // (["ps1", "ps2"])
    archiveBrowsingEnabled false
    blackedOut false // default
    packageType "generic"
}
}

artifactory("Art3-TEAMD") { //Enter the target/s artifactory. Repeat the artifactory closure for every target in star topology.
localRepository(repokeyArt1) {
description "Public description"
    notes "Some internal notes"
    includesPattern "**/*" // default
    excludesPattern "" // default
    repoLayoutRef "maven-2-default"
    propertySets // (["ps1", "ps2"])
    archiveBrowsingEnabled false
    blackedOut false // default
    packageType "generic"
}
}