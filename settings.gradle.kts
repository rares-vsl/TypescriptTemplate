plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "2.0.30"
}

gitHooks {
    commitMsg {
        conventionalCommits()
    }
    createHooks(true)
}

rootProject.name = "TypescriptTemplate"
