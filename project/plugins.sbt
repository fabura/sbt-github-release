resolvers += "Era7 maven releases" at "https://s3-eu-west-1.amazonaws.com/releases.era7.com"
resolvers += Resolver.jcenterRepo

//addSbtPlugin("ohnosequences" % "nice-sbt-settings" % "0.9.0-4-g2ca7993")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.3")

// dependencyOverrides += "ohnosequences" % "sbt-github-release" % "0.6.0-16-ge8e5ec5"
