# frege-conduit

An effort to port the Haskell library [conduit-1.3.0.3][hackage-conduit] to Frege.

Please see [the excellent writeup][github-conduit] in the original repository
for usage.

## Table of Contents

<!-- https://github.com/ekalinin/github-markdown-toc -->
<!--ts-->
   * [frege-conduit](#frege-conduit)
      * [Table of Contents](#table-of-contents)
      * [How to build](#how-to-build)
      * [Using frege-conduit as a dependency](#using-frege-conduit-as-a-dependency)
         * [1. Clone the source tree as a subproject](#1-clone-the-source-tree-as-a-subproject)
         * [2. Install frege-conduit into the local repository](#2-install-frege-conduit-into-the-local-repository)

<!-- Added by: yohashi, at: 2018-09-30T12:00+09:00 -->

<!--te-->

## How to build

Go to the `frege-conduit` directory, and run:

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

First checkout a release you wish to use (omit this if you are going to use a
snapshot):

```
$ git checkout 0.3.4
```

Install `frege-conduit` into your local repository (again omit
`'set version ...'` if you use a snapshot):

```
$ sbt 'set version := "0.3.4"' publishLocal
```

Then, you can use `frege-conduit` in your library by adding this to your
`build.sbt`:

```sbt
libraryDependencies += "xyz.denshi_no_yamaoku" % "frege-conduit" % "0.3.4"
```

[frege-official-release]: https://github.com/Frege/frege/releases
[github-conduit]: https://github.com/snoyberg/conduit
[hackage-conduit]: http://hackage.haskell.org/package/conduit-1.3.0.3
