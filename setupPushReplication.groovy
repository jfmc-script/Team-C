input=userInput (
    name : "User Friendly Name", // Optional
    type : "ARTIFACTORY", // "BOOLEAN", "INTEGER", "INSTANCE", "XRAY", "ARTIFACTORY", "REPOSITORY", "PACKAGE_TYPE"
    value : "default value",
    description : "please provide a value"
  
  )

artifactory(input) {
  localRepository('RT1-maven-local') {
    description userInput
    notes "Some internal notes"
    includesPattern "**/*" // default
    excludesPattern "" // default
    repoLayoutRef "maven-2-default"
    propertySets // (["ps1", "ps2"])
    archiveBrowsingEnabled false
    blackedOut false // default
    packageType "maven"
  }
}