launch4j
========

a simple Laungh4j plugin

Runs the launch4j after the project is packaged to create an exe.
The properties of the launch4j are provided through the launch4j's xml configuration file

In order to use it add the following in the pom.xml
```
<build>
	<plugins>
    		<plugin>
			<groupId>org.lytsiware</groupId>
			<artifactId>launch4j-maven-plugin</artifactId>
			<version>1.0</version>
			<configuration>
				<launch4jPath>full path of your launch4j executable </launch4jPath>
				<configPath>full path of your configuration launch4j xml file</configPath>
			</configuration>
			<executions>
				<execution>
					<goals>
						<goal>create</goal>
					</goals>
				</execution>
			</executions>
		</plugin>
	</plugin>
</build>
```

