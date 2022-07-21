/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractCBSValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/componentbasedsystem"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/allocation"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/environment"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/assembly"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/repository"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/types"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/behavioraldescription"));
		return result;
	}
}
