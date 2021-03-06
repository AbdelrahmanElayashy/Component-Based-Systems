/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.generator;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CBSGenerator extends AbstractGenerator {
  @Inject
  private CBSToJavaGenerator cbsToJavaGenerator;

  @Inject
  private CBSToXMIGenerator cbsToXMIGenerator;

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.cbsToJavaGenerator.doGenerate(resource, fsa, context);
    this.cbsToXMIGenerator.doGenerate(resource, fsa, context);
  }
}
