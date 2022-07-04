package componentBasedSystems;

import componentbasedsystem.repository.Signature;
import componentbasedsystem.repository.Parameter;
import componentbasedsystem.repository.types.Type;
import componentbasedsystem.repository.types.SimpleType;
import componentbasedsystem.repository.types.Void;
import componentbasedsystem.repository.types.ComplexType;
import componentbasedsystem.repository.types.CollectionType;

import org.eclipse.emf.common.util.EList;

/**
 * The services class used by VSM.
 */
public class Services {
	public Services() {

	}
    
	public String printParameters(Signature sig) {
		String result = "";
		EList<Parameter> parameters = sig.getParameters();
		
		if(parameters == null) // invalid list
			return "";
		
		for (Parameter p : parameters) {
			Type parameterType = p.getType();
			String type = getDataTypeName(parameterType);
			result += type + " " + p.getName() + ", ";
		}
		if (result.endsWith(", "))
			result = result.substring(0, result.length() - 2);
		return result;
	}
	
	
	public String getDataTypeName(Type dataType) {
		String type = "";
		if (dataType == null) {
			type = "UNSPECIFIED";
		} else if(dataType instanceof Void) {
			type = "void";
		} else if (dataType instanceof SimpleType) {
			type = ((SimpleType) dataType).getType().name().toLowerCase();
		} else if ((dataType instanceof CollectionType)) {
			String innerTypeString = getDataTypeName(((CollectionType) dataType).getInnerType());
			String collectionTypeString = ((CollectionType) dataType).getType().name().toLowerCase();
			type = collectionTypeString + "<" + innerTypeString + ">";
		} else if ((dataType instanceof ComplexType)) {
			type = firstCharToLowerCase(((ComplexType) dataType).getName());
		}

		return type;
	}
	
	private String firstCharToLowerCase(String original) {
		return Character.toLowerCase(original.charAt(0)) + original.substring(1);
	}
}
