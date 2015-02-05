package com.moowork.gradle.node.variant

class Variant
{
    def boolean windows

    def boolean cygwin

    def File nodeDir

    def File npmDir

    def File nodeBinDir

    def String nodeExec

    def String npmScriptFile

    def String tarGzDependency

    def String exeDependency
}
