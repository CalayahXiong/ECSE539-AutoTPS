/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.Difficulty;
import org.xtext.example.mydsl.myDsl.DifficultyCondition;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Difficulty Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.DifficultyConditionImpl#getDifficulty <em>Difficulty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DifficultyConditionImpl extends ConditionImpl implements DifficultyCondition
{
  /**
   * The default value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifficulty()
   * @generated
   * @ordered
   */
  protected static final Difficulty DIFFICULTY_EDEFAULT = Difficulty.EASY;

  /**
   * The cached value of the '{@link #getDifficulty() <em>Difficulty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifficulty()
   * @generated
   * @ordered
   */
  protected Difficulty difficulty = DIFFICULTY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DifficultyConditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.DIFFICULTY_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Difficulty getDifficulty()
  {
    return difficulty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDifficulty(Difficulty newDifficulty)
  {
    Difficulty oldDifficulty = difficulty;
    difficulty = newDifficulty == null ? DIFFICULTY_EDEFAULT : newDifficulty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DIFFICULTY_CONDITION__DIFFICULTY, oldDifficulty, difficulty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.DIFFICULTY_CONDITION__DIFFICULTY:
        return getDifficulty();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.DIFFICULTY_CONDITION__DIFFICULTY:
        setDifficulty((Difficulty)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.DIFFICULTY_CONDITION__DIFFICULTY:
        setDifficulty(DIFFICULTY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.DIFFICULTY_CONDITION__DIFFICULTY:
        return difficulty != DIFFICULTY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (difficulty: ");
    result.append(difficulty);
    result.append(')');
    return result.toString();
  }
  
  public boolean evaluate(String difficulty) {
	  return this.getDifficulty().toString().equals(difficulty);
  }

} //DifficultyConditionImpl
