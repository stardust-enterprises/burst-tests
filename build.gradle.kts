@file:Suppress("DSL_SCOPE_VIOLATION")

import fr.stardustenterprises.burst.meta.impl.pom.mit

plugins {
    alias(libs.plugins.burst)
}

burst {
    project {
        name = "burst-tests"
        description = "Burst testing grounds"
        version = "4.0.0"

        group = "fr.stardustenterprises.burst"
        vendor = "Stardust Enterprises"

        scm {
            repositoryId = "stardust-enterprises/burst-tests"
        }

        pom {
            licenses {
                mit
            }
            developers {
                "xtrm" { email = "oss@xtrm.me" }
                "lambdagg"()
            }
        }
    }.also { println(it) }

//    features {
//        kotlin
//        java {
//            compileVersion = JavaVersion.VERSION_1_8
//        }
//        dokka {
//
//        }
//    }
}