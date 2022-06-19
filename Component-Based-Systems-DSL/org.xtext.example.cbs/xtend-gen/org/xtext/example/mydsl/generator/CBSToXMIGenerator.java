package org.xtext.example.mydsl.generator;

import com.google.inject.Injector;
import java.io.IOException;
import java.nio.file.Paths;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.example.mydsl.CBSStandaloneSetup;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CBSToXMIGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Injector injector = new CBSStandaloneSetup().createInjectorAndDoEMFRegistration();
    final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
    EcoreUtil.resolveAll(resource);
    String filename = Paths.get(resource.getURI().path()).getFileName().toString().replaceFirst("[.][^.]+$", "");
    fsa.generateFile((filename + ".xmi"), "");
    final URI outputURI = fsa.getURI((filename + ".xmi"));
    final Resource xmiResource = resourceSet.createResource(outputURI);
    xmiResource.getContents().add(resource.getContents().get(0));
    try {
      xmiResource.save(null);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
