/**
 * Copyright (C) 2014 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sintef.thingml.impl;

import org.eclipse.emf.ecore.EClass;

import org.sintef.thingml.*;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends CompositeStateImpl implements StateMachine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingmlPackage.Literals.STATE_MACHINE;
	}


    //Derived properties

    /**
     *
     * @return
     * @generated NOT
     */
    @Override
    public List<State> allContainedStates() {
        return ((Region)this).allContainedStates();
    }

    /**
     *
     * @return
     * @generated NOT
     */
    @Override
    public List<Region> allContainedRegions() {
        return ((Region)this).allContainedRegions();
    }

    /**
     *
     * @return
     * @generated NOT
     */
    @Override
    public List<Property> allContainedProperties() {return ((Region)this).allContainedProperties();}

} //StateMachineImpl
