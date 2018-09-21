# frege-conduit

An effort to port the Haskell library [conduit][hackage-conduit] to Frege.

Please see [the excellent writeup][github-conduit] in the original repository
for usage.

## How to build

This library is configured to depend on [frege-3.25.42][frege-official-release].
Unfortunately, the artifact is not published to public repositories such as
Maven Central. Thus, you have to manually install one into your local
repository.

If you are using Linux and SBT, create a temporary directory first and download
the release:

```
$ mkdir ~/tmp
$ cd    ~/tmp
$ curl -LO https://github.com/Frege/frege/releases/download/3.25alpha/frege3.25.42.jar
```

Then, initialize a temporary SBT project by creating `build.sbt` with the
following content:

```build.sbt
// https://stackoverflow.com/a/26532219/5118228
// run "sbt publishLocal" to install into ~/.ivy2/local
organization := "org.frege-lang"
name := "frege"
version := "3.25.42"
autoScalaLibrary := false
crossPaths := false
packageBin in Compile := file(s"frege3.25.42.jar")
```

And `project/build.properties`:

```project/build.properties
sbt.version=1.2.1
```

When done, install the jar into `~/.ivy/local`:

```
$ sbt publishLocal
```

Once finished, remove the temporary directory (if desired) and go back to the
`frege-conduit` directory, and run:

```
$ sbt compile
```

## Using `frege-conduit` as a dependency

There are two ways to use `frege-conduit` as a dependency:

### 1. Clone the source tree as a subproject

This method trades build time for better compatibility. If you wish to use the
other version of Frege, this is the way to go.

TODO howto

### 2. Install `frege-conduit` into the local repository

Install `frege-conduit` into your local repository:

```
$ sbt publishLocal
```

Then, you can use `frege-conduit` in your library by adding this to your
`build.sbt`:

```sbt
libraryDependencies += "xyz.denshi_no_yamaoku" % "frege-conduit" % "0.1-SNAPSHOT"
```

[frege-official-release]: https://github.com/Frege/frege/releases
[github-conduit]: https://github.com/snoyberg/conduit
[hackage-conduit]: http://hackage.haskell.org/package/conduit-1.3.0.3