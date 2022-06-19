/**
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import componentbasedsystem.repository.Interface;
import componentbasedsystem.repository.Parameter;
import componentbasedsystem.repository.Repository;
import componentbasedsystem.repository.Signature;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CBSGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Repository> _filter = Iterables.<Repository>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Repository.class);
    for (final Repository e : _filter) {
      fsa.generateFile("repository/Helper.java", this.compile(e));
    }
    Iterable<Interface> _filter_1 = Iterables.<Interface>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Interface.class);
    for (final Interface e_1 : _filter_1) {
      String _string = this._iQualifiedNameProvider.getFullyQualifiedName(e_1).toString("/");
      String _plus = ("repository/I" + _string);
      String _plus_1 = (_plus + ".java");
      fsa.generateFile(_plus_1, 
        this.compile(e_1));
    }
  }

  public CharSequence compile(final Repository e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package repository;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Helper {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence compile(final Interface e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("package repository;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public interface I");
    String _name = e.getName();
    _builder.append(_name, "  ");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Signature> _signatures = e.getSignatures();
      for(final Signature f : _signatures) {
        CharSequence _compile = this.compile(f);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence compile(final Signature e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = e.getReturnType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _name_1 = e.getName();
    _builder.append(_name_1);
    _builder.append("(");
    {
      EList<Parameter> _parameters = e.getParameters();
      boolean _hasElements = false;
      for(final Parameter f : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _compile = this.compile(f);
        _builder.append(_compile);
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }

  public CharSequence compile(final Parameter e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _name_1 = e.getName();
    _builder.append(_name_1);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
