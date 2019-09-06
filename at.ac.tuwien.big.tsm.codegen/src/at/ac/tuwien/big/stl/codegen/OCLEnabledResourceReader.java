package at.ac.tuwien.big.stl.codegen;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.pivot.internal.delegate.OCLDelegateDomain;
import org.eclipse.ocl.pivot.model.OCLstdlib;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.eclipse.ocl.xtext.oclinecore.OCLinEcoreStandaloneSetup;
import org.eclipse.ocl.xtext.oclstdlib.OCLstdlibStandaloneSetup;
import org.eclipse.xtext.mwe.Reader;

public class OCLEnabledResourceReader extends Reader {

	@Override
	protected ResourceSet getResourceSet() {
		ResourceSet resourceSet = super.getResourceSet();
		CompleteOCLStandaloneSetup.doSetup();
		EssentialOCLStandaloneSetup.doSetup();
		OCLinEcoreStandaloneSetup.doSetup();
		OCLstdlibStandaloneSetup.doSetup();
		OCLstdlib.install();
		OCL.newInstance(resourceSet);
		OCLDelegateDomain.initialize(resourceSet);
		return resourceSet;
	}

}
