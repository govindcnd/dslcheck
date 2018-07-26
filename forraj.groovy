job("AboutPageTestSuite_Chrome") {
	description()
	keepDependencies(false)
	scm {
		git {
			remote {
				github("https://bitbucket.org/intigral/dawriplus-webtest.git", "https")
				credentials("e90cfe10-0bfe-4873-9e37-3ff4e5d480a5")
			}
			branch("*/master")
		}
	}
	disabled(false)
	concurrentBuild(false)
	steps {
		gradle {
			switches()
			tasks("clean test -Dbrowser=\"chrome\" -Dcucumber.options=\"src\\test\\resources\\features\\AboutPage.feature\"")
			fromRootBuildScriptDir()
			buildFile("build.gradle")
			gradleName("(Default)")
			useWrapper(true)
			makeExecutable(false)
			useWorkspaceAsHome(false)
		}
	}
	wrappers {
		timeout {
			absolute(15)
		}
		timestamps()
	}
}
