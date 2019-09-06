/**
 * This file is part of the ePNK project (Petri Net Kernel for eclipse). The ePNK
 * is platform for Petri net tools based on the PNML transfer format. Its
 * main idea is to provide generic Petri net types which can be easily plugged
 * in and a simple generic GMF editor, that can be used for graphically editing
 * nets of any plugged in type. Additional functionality can be plugged in.
 * 
 * Note that this project is still in an experimental phase, and is also used
 * as a case study for EMF/GMF based Model-based Software Engineering.
 * 
 * Copyright (C) 2010 Ekkart Kindler, eki@imm.dtu.dk
 * The license under which this software will be distributed is still to be decided -
 * it will probably be the EPL.
 *
 * $Id$
 */
package org.pnml.tools.epnk.pnmlcoremodel;

import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.ExtendedPNMLMetaData;
import org.pnml.tools.epnk.pnmlcoremodel.serialisation.PNMLMetaData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage#getPetriNetType()
 * @model abstract="true"
 * @generated
 */
public interface PetriNetType extends EObject {
	// The methods below are manually added for plugging in new types.
	
	public PetriNet createPetriNet(String type);
		
	public PetriNetType createPetriNetType(String type);
	
	public PetriNetType createPetriNetType();
	
	public Place createPlace(); 
	
	public Transition createTransition(); 
	
	public Arc createArc() ;
	
	public Page createPage();
	
	public RefPlace createRefPlace(); 
	
	public RefTransition createRefTransition(); 
	
	public void registerExtendedPNMLMetaData(ExtendedPNMLMetaData metadata);
	
	public void registerPNMLMetaData(PNMLMetaData metadata);

} // PetriNetType
