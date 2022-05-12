/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.formatting2

import com.google.inject.Inject
import componentbasedsystem.assembly.AssemblyContext
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.services.CBSGrammarAccess

class CBSFormatter extends AbstractFormatter2 {
	
	@Inject extension CBSGrammarAccess

	def dispatch void format(componentbasedsystem.allocation.System system, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (assemblyContext : system.childContexts) {
			assemblyContext.format
		}
		for (assemblyConnector : system.assemblyConnectors) {
			assemblyConnector.format
		}
		for (requiredDelegationConnector : system.requiredDelegationConnectors) {
			requiredDelegationConnector.format
		}
		for (providedDelegationConnector : system.providedDelegationConnectors) {
			providedDelegationConnector.format
		}
		system.allocation.format
	}

	def dispatch void format(AssemblyContext assemblyContext, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (providedRole : assemblyContext.providedRoles) {
			providedRole.format
		}
		for (requiredRole : assemblyContext.requiredRoles) {
			requiredRole.format
		}
	}
	
	// TODO: implement for Allocation, Interface, AtomicComponent, Signature, ComplexType, Service, BranchAction, LoopAction, BranchTransition, Environment
}
