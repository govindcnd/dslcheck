job("myfristjobviadsl") {
	description("Automatically generated test<!-- Managed by Jenkins Job Builder -->")
	keepDependencies(false)
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("ls")
	}
}
