import org.gradle.api.Project

const val buildVersionCode = 204001
const val buildVersionName = "2.4.1"

const val buildMinSdkVersion = 21
const val buildTargetSdkVersion = 30

const val buildNdkVersion = "23.0.7123448"

val Project.buildFlavor: String
    get() {
        return if (project(":core").file("src/main/golang/clash/script/script.go").exists())
            "premium"
        else
            "foss"
    }