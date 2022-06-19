package org.xtext.example.mydsl.generator

import java.nio.file.Paths
import org.eclipse.emf.ecore.util.EcoreUtil
import com.google.inject.Injector
import org.eclipse.xtext.resource.XtextResourceSet
import org.xtext.example.mydsl.CBSStandaloneSetup
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.emf.ecore.resource.Resource
import java.io.IOException
import org.eclipse.emf.common.util.URI

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CBSToXMIGenerator extends AbstractGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val Injector injector = new CBSStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		val XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
		
		EcoreUtil.resolveAll(resource);
		
		var String filename = Paths.get(resource.URI.path).getFileName().toString().replaceFirst("[.][^.]+$", "");
		fsa.generateFile(filename+ ".xmi", "")
		val URI outputURI = fsa.getURI(filename+ ".xmi")
	
		val Resource xmiResource = resourceSet.createResource(outputURI);
		xmiResource.getContents().add(resource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}
}
