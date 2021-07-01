package zephyr.application

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("zephyr.application")
		.start()
}

