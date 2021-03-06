/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.CBSRuntimeModule;
import org.xtext.example.mydsl.CBSStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CBSIdeSetup extends CBSStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CBSRuntimeModule(), new CBSIdeModule()));
	}
	
}
