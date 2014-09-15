package org.lytsiware;

import java.io.File;
import java.io.IOException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="create" , defaultPhase=LifecyclePhase.PACKAGE)
public class Launch4jMain extends AbstractMojo {
	
	@Parameter(required=true)
	private File launch4jPath;
	
	@Parameter(required=true)
	private File configPath;
	

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Creating EXE file using " + configPath);
		if (!launch4jPath.exists()){ 
			throw new MojoFailureException("Could not find launch4j file");
		}
		if (!configPath.exists()){
			throw new MojoFailureException("Could not find lauch4j configuration file");
		}
		
		try {
			Runtime.getRuntime().exec(new String[]{launch4jPath.getAbsolutePath(), configPath.getAbsolutePath()});
		} catch (IOException e) {
			throw new MojoFailureException(e.toString());
		}
	}
	
	
}
