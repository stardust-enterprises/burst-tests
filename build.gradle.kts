@file:Suppress("DSL_SCOPE_VIOLATION")

import enterprises.stardust.burst.preset.preset
import enterprises.stardust.burst.preset.stardust.*

plugins {
    alias(libs.plugins.burst)
}

burst {
    preset<StardustPreset>()

    project {
        name = "burst-tests"
        description = "Burst testing grounds"
        version = "0.0.1-SNAPSHOT"

        pom {
            licenses { mit }
            developers { xtrm; lambdagg }
        }
        scm {
            repositoryPath = "stardust-enterprises/burst-tests"
        }
    }

    features {
        java {
            javadoc = true
            sources = true
            jvmVersion = JavaLanguageVersion.of(8)
        }
        kotlin
    }
}