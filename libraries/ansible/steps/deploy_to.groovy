void call(app_env){
	stage("deploy To ${app_env.long_name}"){
		println "deploying through ansible"
		app_env.ip_addresses.each{ ip ->
			println "deploying to ${ip}"
		}


}

}
