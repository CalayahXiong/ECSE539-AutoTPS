/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Worker#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Worker#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Worker#getSeniority <em>Seniority</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Worker#getEmployeeNumber <em>Employee Number</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Worker#getIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWorker()
 * @model
 * @generated
 */
public interface Worker extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWorker_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Worker#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWorker_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Worker#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Seniority</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.SeniorityLevel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seniority</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.SeniorityLevel
   * @see #setSeniority(SeniorityLevel)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWorker_Seniority()
   * @model
   * @generated
   */
  SeniorityLevel getSeniority();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Worker#getSeniority <em>Seniority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seniority</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.SeniorityLevel
   * @see #getSeniority()
   * @generated
   */
  void setSeniority(SeniorityLevel value);

  /**
   * Returns the value of the '<em><b>Employee Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Employee Number</em>' attribute.
   * @see #setEmployeeNumber(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWorker_EmployeeNumber()
   * @model
   * @generated
   */
  int getEmployeeNumber();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Worker#getEmployeeNumber <em>Employee Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Employee Number</em>' attribute.
   * @see #getEmployeeNumber()
   * @generated
   */
  void setEmployeeNumber(int value);

  /**
   * Returns the value of the '<em><b>Is Active</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.Boolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Active</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Boolean
   * @see #setIsActive(org.xtext.example.mydsl.myDsl.Boolean)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getWorker_IsActive()
   * @model
   * @generated
   */
  org.xtext.example.mydsl.myDsl.Boolean getIsActive();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Worker#getIsActive <em>Is Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Active</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Boolean
   * @see #getIsActive()
   * @generated
   */
  void setIsActive(org.xtext.example.mydsl.myDsl.Boolean value);

} // Worker
