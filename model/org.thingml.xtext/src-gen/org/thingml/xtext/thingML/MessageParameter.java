/**
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.thingML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.MessageParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.MessageParameter#getMsgRef <em>Msg Ref</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getMessageParameter()
 * @model
 * @generated
 */
public interface MessageParameter extends ReferencedElmt, Expression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getMessageParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.MessageParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Msg Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg Ref</em>' reference.
   * @see #setMsgRef(Message)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getMessageParameter_MsgRef()
   * @model
   * @generated
   */
  Message getMsgRef();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.MessageParameter#getMsgRef <em>Msg Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msg Ref</em>' reference.
   * @see #getMsgRef()
   * @generated
   */
  void setMsgRef(Message value);

} // MessageParameter
