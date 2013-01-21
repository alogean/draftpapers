package com.innoq.dtdsl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.openarchitectureware.xtext.AbstractLanguageUtilities;
import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.IXtextParser;

import com.innoq.dtdsl.parser.XtextParser;

public class DtdslUtilities extends AbstractLanguageUtilities {

	// enforce eager registration of metamodel
	private static final EPackage EPACKAGE = com.innoq.dtdsl.MetaModelRegistration.getEPackage();
	
	@Override
	protected IXtextParser internalParse(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

	public String getFileExtension() {
		return "dtdsl";
	}

	public EPackage getEPackage() {
		return EPACKAGE;
	}

	List<String> r = new ArrayList<String>();
	{
		r.add("short");
		r.add("integer");
		r.add("char");
		r.add("string");
		r.add("boolean");
		r.add("datatype");
		r.add("long");
		r.add("primitiveDatatype");
		r.add("float");
		r.add("octet");
	}
	public List<String> allKeywords() {
		return r;
	}

	protected ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}

	public IPartitionTokenScanner getPartitionScanner() {
		return new GeneratedPartitionScanner();
	}

	@Override
	public AbstractXtextEditorPlugin getXtextEditorPlugin() {
		return DtdslEditorPlugin.getDefault();
	}
	
	@Override
	public String getPackageForExtensions() {
		return "com::innoq::dtdsl";
	}
	
	public XtextFile getXtextFile() {
		return MetaModelRegistration.getXtextFile();
	}
}
