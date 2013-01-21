package com.innoq.dtdsl.resource;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;
import org.openarchitectureware.xtext.parser.IXtextParser;
import org.openarchitectureware.xtext.resource.AbstractXtextResource;

import com.innoq.dtdsl.parser.XtextParser;

public class dtdslResource extends AbstractXtextResource {
	public dtdslResource(URI uri) {
		super(uri);
		setFormattingExtension("com::innoq::dtdsl::Formatting");
		setResourceLoader(new ResourceLoaderImpl(XtextParser.class.getClassLoader()));
	}

	@Override
	protected IXtextParser createParser(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

}

