artifactory('art1'){
localRepository('aaa') {
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