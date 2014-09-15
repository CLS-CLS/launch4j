launch4j
========

a simple Launch4j plugin

Runs the launch4j at the package phase to create an exe.
The properties of the launch4j are provided through the launch4j's xml configuration file

In order to use it 
1.clone this repo
2.Do a mvn install
3 add the following in your project' s pom.xml (be sure do add it after any plugin that is configured to run in the package phase as they run in order they are declared in the pom.xml)
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

