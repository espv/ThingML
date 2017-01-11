/**
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.thingML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Property Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getProperty <em>Property</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getIndex <em>Index</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getInit <em>Init</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getConfigPropertyAssign()
 * @model
 * @generated
 */
public interface ConfigPropertyAssign extends EObject
{
  /**
   * Returns the value of the '<em><b>Instance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' containment reference.
   * @see #setInstance(InstanceRef)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getConfigPropertyAssign_Instance()
   * @model containment="true"
   * @generated
   */
  InstanceRef getInstance();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getInstance <em>Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' containment reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(InstanceRef value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(Property)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getConfigPropertyAssign_Property()
   * @model
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getConfigPropertyAssign_Index()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getIndex();

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(Expression)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getConfigPropertyAssign_Init()
   * @model containment="true"
   * @generated
   */
  Expression getInit();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(Expression value);

  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.PlatformAnnotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getConfigPropertyAssign_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<PlatformAnnotation> getAnnotations();

} // ConfigPropertyAssign