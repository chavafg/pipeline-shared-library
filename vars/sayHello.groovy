#!/usr/bin/env groovy

def call(String name = 'human') {
	echo "Hello ${name}."
	echo "This is PR ${BRANCH_NAME}"
	echo "shalala"
	sh "pwd"
	sh "env"
}
