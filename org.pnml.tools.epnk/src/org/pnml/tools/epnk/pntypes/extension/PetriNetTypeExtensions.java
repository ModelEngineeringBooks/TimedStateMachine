package org.pnml.tools.epnk.pntypes.extension;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;

public class PetriNetTypeExtensions {

	private static PetriNetTypeExtensions instance;
	
	private String[] names;
	private PetriNetType[] types;	

	public static synchronized PetriNetTypeExtensions getInstance() {
		if (instance == null) {
			instance = new PetriNetTypeExtensions();

			IExtensionRegistry reg = Platform.getExtensionRegistry();
			IExtensionPoint extPoint = reg.
				getExtensionPoint("org.pnml.tools.epnk.pntd");

			IExtension[] extensions = extPoint.getExtensions();

			String[] names = new String[extensions.length+1];	
			PetriNetType[] types = new PetriNetType[extensions.length+1];
			
			// the empty type is an implicit extension (it is a bit simpler
			// if all Petri net types are dealt with in this way.
			names[0] = "org.pnml.tools.epnk.empty";
			types[0] = PnmlcoremodelFactory.eINSTANCE.createEmptyType();

			int invalid = 0;
			for (int i = 0; i < extensions.length; i++) {
				IExtension extension = extensions[i];
				IConfigurationElement confs[] = extension.getConfigurationElements();
				IConfigurationElement elem = confs[0];
				try {
					names[i+1] = (String) extension.getLabel();
					types[i+1] = (PetriNetType) elem.createExecutableExtension("class");
				} catch (Exception e) {
					e.printStackTrace();
				}
				if (types[i+1] == null || names[i+1] == null) {
					invalid++;
				}
			}
			
			instance.names = new String[names.length - invalid];
			instance.types = new PetriNetType[names.length - invalid];
			int i = 0;
			int j = 0;
			while (i<instance.names.length && j<names.length) {
				if (names[j] != null && types[j] != null) {
					instance.names[i] = names[j];
					instance.types[i] = types[j];
					i++;
				}
				j++;
			}
		}

		return instance;
	}
	
	public PetriNetType[] getPetriNetTypes() {
		return types;
	}

}
