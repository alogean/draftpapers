
package com.innoq.dtdsl.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewFileWizard;

import com.innoq.dtdsl.DtdslEditorPlugin;

public class NewDtdslFileWizard extends AbstractNewFileWizard {

	@Override
	protected LanguageUtilities getUtilities() {
		return DtdslEditorPlugin.getDefault().getUtilities();
	}
}
