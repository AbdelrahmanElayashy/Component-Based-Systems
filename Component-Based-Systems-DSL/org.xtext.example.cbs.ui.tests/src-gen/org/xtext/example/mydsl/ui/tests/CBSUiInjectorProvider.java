/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.cbs.ui.internal.CbsActivator;

public class CBSUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CbsActivator.getInstance().getInjector("org.xtext.example.mydsl.CBS");
	}

}
