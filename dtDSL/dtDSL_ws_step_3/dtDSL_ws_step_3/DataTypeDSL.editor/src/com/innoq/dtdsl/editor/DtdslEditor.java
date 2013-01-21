package com.innoq.dtdsl.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import com.innoq.dtdsl.DtdslEditorPlugin;

public class DtdslEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return DtdslEditorPlugin.getDefault();
   }
}
