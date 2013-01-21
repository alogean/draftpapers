package com.innoq.dtdsl.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewProjectWizard;

import com.innoq.dtdsl.DtdslEditorPlugin;

public class NewDtdslProjectWizard extends AbstractNewProjectWizard {

	public NewDtdslProjectWizard() {
		super();
		setLangName("dtdsl");
		setGeneratorProjectName("DataTypeDSL.generator");
		setDslProjectName("DataTypeDSL");
		setFileExtension("dtdsl");
		setPackageName("com/innoq/dtdsl/");
	}
	
	@Override
	protected LanguageUtilities getUtilities() {
		return DtdslEditorPlugin.getDefault().getUtilities();
	}
}

