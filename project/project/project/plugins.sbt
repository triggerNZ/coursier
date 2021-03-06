addSbtPlugin("io.get-coursier" % "sbt-coursier" % coursierVersion0)

// important: this line is matched / substituted during releases (via sbt-release)
def coursierVersion0 = "1.0.0-RC13"

// required for just released things
resolvers += Resolver.sonatypeRepo("releases")
