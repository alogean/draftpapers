package com.innoq.dtdsl;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class DtdslEditorPlugin extends AbstractXtextEditorPlugin {
   private static DtdslEditorPlugin plugin;
   public static DtdslEditorPlugin getDefault() {
      return plugin;
   }

   private DtdslUtilities utilities = new DtdslUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public DtdslEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
}
