/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ShiftCondition#getShift <em>Shift</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getShiftCondition()
 * @model
 * @generated
 */
public interface ShiftCondition extends Condition
{
  /**
   * Returns the value of the '<em><b>Shift</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.Shift}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Shift
   * @see #setShift(Shift)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getShiftCondition_Shift()
   * @model
   * @generated
   */
  Shift getShift();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ShiftCondition#getShift <em>Shift</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.Shift
   * @see #getShift()
   * @generated
   */
  void setShift(Shift value);
  
  boolean evaluate(String shift);

} // ShiftCondition
