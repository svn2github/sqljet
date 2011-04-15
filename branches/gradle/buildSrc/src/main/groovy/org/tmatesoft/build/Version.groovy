package org.tmatesoft.build;

import java.text.SimpleDateFormat

class Version {
	
	Version(String version, String bNumber) {
		def parts = version.split('[\\.\\-]')
		major = parts[0]
		minor = parts[1]
		micro = parts[2]
		qualifier = parts[3]
		
		buildNumber = bNumber + '_v' + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
	}
	
	String major
	String minor
	String micro
	String qualifier
	String buildNumber
	
	String toString() {
		return major + '.' + minor + '.' + micro + '-' + qualifier
	}
}
