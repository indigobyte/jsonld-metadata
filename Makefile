
.PHONY: gen clean

gen:
	./gradlew :generator:run

clean:
	./gradlew clean && rm -rf src/generated/java
