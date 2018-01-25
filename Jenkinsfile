node {
	stage('Preparation') {
		checkout(scm)
	}
	stage('Build') {
		devfactory (portfolio: 'Default portfolio for DevFactory', product: 'AMeln - Test', productVersion: 'JSP_FIXED_GIT', types: 'Java') {
			sh './gradlew build'
		}
	}
}
