
.PHONY: gen clean test install

gen:
	./gradlew :generator:run

clean:
	./gradlew clean && rm -rf src/generated/java && rm -rf src/generated-test/java

test: gen
	./gradlew test

install: clean test
	./gradlew install
