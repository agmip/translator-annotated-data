package org.agmip.translators.annotation.api;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InputTranslator {
	private static final Logger LOG = LoggerFactory.getLogger(InputTranslator.class);
	// Inputs to this InputTranslator:
	// * Source directory of files to translate
	// * Sidecar file 2 - in source directory
	// * Output file
	private Path sourcePath;
	private Path outputPath;
	private Path sidecard;

	public InputTranslator() {}

	public void setSourcePath(String path) {
		this.sourcePath = Paths.get(path).normalize().toAbsolutePath();
	}

	public void setSourcePath(Path path) {
		this.sourcePath = path.normalize().toAbsolutePath();
	}

	public void setDestinationPath(String path) {
		this.outputPath = Paths.get(path).normalize().toAbsolutePath();
	}

	public void setDestinationPath(Path path) {
		this.outputPath = path.normalize().toAbsolutePath();
	}

	public void execute() {
		// Do something
	}
}
