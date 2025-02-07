/**
 * generated by Xtext 2.37.0
 */
package org.xtext.example.mydsl.myDsl.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xtext.example.mydsl.myDsl.MyDslFactory;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.PrimaryCondition;

/**
 * This is the item provider adapter for a {@link org.xtext.example.mydsl.myDsl.PrimaryCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimaryConditionItemProvider extends ConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryConditionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MyDslPackage.Literals.PRIMARY_CONDITION__INNER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PrimaryCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrimaryCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PrimaryCondition_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PrimaryCondition.class)) {
			case MyDslPackage.PRIMARY_CONDITION__INNER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.PRIMARY_CONDITION__INNER,
				 MyDslFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.PRIMARY_CONDITION__INNER,
				 MyDslFactory.eINSTANCE.createShiftCondition()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.PRIMARY_CONDITION__INNER,
				 MyDslFactory.eINSTANCE.createComparison()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.PRIMARY_CONDITION__INNER,
				 MyDslFactory.eINSTANCE.createDifficultyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.PRIMARY_CONDITION__INNER,
				 MyDslFactory.eINSTANCE.createOrCondition()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.PRIMARY_CONDITION__INNER,
				 MyDslFactory.eINSTANCE.createAndCondition()));

		newChildDescriptors.add
			(createChildParameter
				(MyDslPackage.Literals.PRIMARY_CONDITION__INNER,
				 MyDslFactory.eINSTANCE.createPrimaryCondition()));
	}

}
