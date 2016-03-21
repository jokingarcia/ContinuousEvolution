/**
 */
package diff.util;

import diff.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see diff.DiffPackage
 * @generated
 */
public class DiffAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiffPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiffPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffSwitch<Adapter> modelSwitch =
		new DiffSwitch<Adapter>() {
			@Override
			public Adapter caseDiffModel(DiffModel object) {
				return createDiffModelAdapter();
			}
			@Override
			public Adapter caseDiffElement(DiffElement object) {
				return createDiffElementAdapter();
			}
			@Override
			public Adapter caseGenericDiffElement(GenericDiffElement object) {
				return createGenericDiffElementAdapter();
			}
			@Override
			public Adapter caseConflictingDiffElement(ConflictingDiffElement object) {
				return createConflictingDiffElementAdapter();
			}
			@Override
			public Adapter caseDiffGroup(DiffGroup object) {
				return createDiffGroupAdapter();
			}
			@Override
			public Adapter caseModelInputSnapshot(ModelInputSnapshot object) {
				return createModelInputSnapshotAdapter();
			}
			@Override
			public Adapter caseModelElementChange(ModelElementChange object) {
				return createModelElementChangeAdapter();
			}
			@Override
			public Adapter caseModelElementChangeLeftTarget(ModelElementChangeLeftTarget object) {
				return createModelElementChangeLeftTargetAdapter();
			}
			@Override
			public Adapter caseModelElementChangeRightTarget(ModelElementChangeRightTarget object) {
				return createModelElementChangeRightTargetAdapter();
			}
			@Override
			public Adapter caseAddModelElement(AddModelElement object) {
				return createAddModelElementAdapter();
			}
			@Override
			public Adapter caseRemoteAddModelElement(RemoteAddModelElement object) {
				return createRemoteAddModelElementAdapter();
			}
			@Override
			public Adapter caseRemoveModelElement(RemoveModelElement object) {
				return createRemoveModelElementAdapter();
			}
			@Override
			public Adapter caseRemoteRemoveModelElement(RemoteRemoveModelElement object) {
				return createRemoteRemoveModelElementAdapter();
			}
			@Override
			public Adapter caseUpdateModelElement(UpdateModelElement object) {
				return createUpdateModelElementAdapter();
			}
			@Override
			public Adapter caseMoveModelElement(MoveModelElement object) {
				return createMoveModelElementAdapter();
			}
			@Override
			public Adapter caseRemoteMoveModelElement(RemoteMoveModelElement object) {
				return createRemoteMoveModelElementAdapter();
			}
			@Override
			public Adapter caseAttributeChange(AttributeChange object) {
				return createAttributeChangeAdapter();
			}
			@Override
			public Adapter caseAttributeChangeLeftTarget(AttributeChangeLeftTarget object) {
				return createAttributeChangeLeftTargetAdapter();
			}
			@Override
			public Adapter caseAttributeChangeRightTarget(AttributeChangeRightTarget object) {
				return createAttributeChangeRightTargetAdapter();
			}
			@Override
			public Adapter caseAddAttribute(AddAttribute object) {
				return createAddAttributeAdapter();
			}
			@Override
			public Adapter caseRemoteAddAttribute(RemoteAddAttribute object) {
				return createRemoteAddAttributeAdapter();
			}
			@Override
			public Adapter caseRemoveAttribute(RemoveAttribute object) {
				return createRemoveAttributeAdapter();
			}
			@Override
			public Adapter caseRemoteRemoveAttribute(RemoteRemoveAttribute object) {
				return createRemoteRemoveAttributeAdapter();
			}
			@Override
			public Adapter caseUpdateAttribute(UpdateAttribute object) {
				return createUpdateAttributeAdapter();
			}
			@Override
			public Adapter caseRemoteUpdateAttribute(RemoteUpdateAttribute object) {
				return createRemoteUpdateAttributeAdapter();
			}
			@Override
			public Adapter caseReferenceChange(ReferenceChange object) {
				return createReferenceChangeAdapter();
			}
			@Override
			public Adapter caseReferenceChangeLeftTarget(ReferenceChangeLeftTarget object) {
				return createReferenceChangeLeftTargetAdapter();
			}
			@Override
			public Adapter caseReferenceChangeRightTarget(ReferenceChangeRightTarget object) {
				return createReferenceChangeRightTargetAdapter();
			}
			@Override
			public Adapter caseAddReferenceValue(AddReferenceValue object) {
				return createAddReferenceValueAdapter();
			}
			@Override
			public Adapter caseRemoteAddReferenceValue(RemoteAddReferenceValue object) {
				return createRemoteAddReferenceValueAdapter();
			}
			@Override
			public Adapter caseRemoveReferenceValue(RemoveReferenceValue object) {
				return createRemoveReferenceValueAdapter();
			}
			@Override
			public Adapter caseRemoteRemoveReferenceValue(RemoteRemoveReferenceValue object) {
				return createRemoteRemoveReferenceValueAdapter();
			}
			@Override
			public Adapter caseUpdateReference(UpdateReference object) {
				return createUpdateReferenceAdapter();
			}
			@Override
			public Adapter caseUpdateUniqueReferenceValue(UpdateUniqueReferenceValue object) {
				return createUpdateUniqueReferenceValueAdapter();
			}
			@Override
			public Adapter caseRemoteUpdateUniqueReferenceValue(RemoteUpdateUniqueReferenceValue object) {
				return createRemoteUpdateUniqueReferenceValueAdapter();
			}
			@Override
			public Adapter caseAbstractDiffExtension(AbstractDiffExtension object) {
				return createAbstractDiffExtensionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link diff.DiffModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.DiffModel
	 * @generated
	 */
	public Adapter createDiffModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.DiffElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.DiffElement
	 * @generated
	 */
	public Adapter createDiffElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.GenericDiffElement <em>Generic Diff Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.GenericDiffElement
	 * @generated
	 */
	public Adapter createGenericDiffElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.ConflictingDiffElement <em>Conflicting Diff Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.ConflictingDiffElement
	 * @generated
	 */
	public Adapter createConflictingDiffElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.DiffGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.DiffGroup
	 * @generated
	 */
	public Adapter createDiffGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.ModelInputSnapshot <em>Model Input Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.ModelInputSnapshot
	 * @generated
	 */
	public Adapter createModelInputSnapshotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.ModelElementChange <em>Model Element Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.ModelElementChange
	 * @generated
	 */
	public Adapter createModelElementChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.ModelElementChangeLeftTarget <em>Model Element Change Left Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.ModelElementChangeLeftTarget
	 * @generated
	 */
	public Adapter createModelElementChangeLeftTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.ModelElementChangeRightTarget <em>Model Element Change Right Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.ModelElementChangeRightTarget
	 * @generated
	 */
	public Adapter createModelElementChangeRightTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.AddModelElement <em>Add Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.AddModelElement
	 * @generated
	 */
	public Adapter createAddModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoteAddModelElement <em>Remote Add Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoteAddModelElement
	 * @generated
	 */
	public Adapter createRemoteAddModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoveModelElement <em>Remove Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoveModelElement
	 * @generated
	 */
	public Adapter createRemoveModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoteRemoveModelElement <em>Remote Remove Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoteRemoveModelElement
	 * @generated
	 */
	public Adapter createRemoteRemoveModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.UpdateModelElement <em>Update Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.UpdateModelElement
	 * @generated
	 */
	public Adapter createUpdateModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.MoveModelElement <em>Move Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.MoveModelElement
	 * @generated
	 */
	public Adapter createMoveModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoteMoveModelElement <em>Remote Move Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoteMoveModelElement
	 * @generated
	 */
	public Adapter createRemoteMoveModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.AttributeChange <em>Attribute Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.AttributeChange
	 * @generated
	 */
	public Adapter createAttributeChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.AttributeChangeLeftTarget <em>Attribute Change Left Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.AttributeChangeLeftTarget
	 * @generated
	 */
	public Adapter createAttributeChangeLeftTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.AttributeChangeRightTarget <em>Attribute Change Right Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.AttributeChangeRightTarget
	 * @generated
	 */
	public Adapter createAttributeChangeRightTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.AddAttribute <em>Add Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.AddAttribute
	 * @generated
	 */
	public Adapter createAddAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoteAddAttribute <em>Remote Add Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoteAddAttribute
	 * @generated
	 */
	public Adapter createRemoteAddAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoveAttribute <em>Remove Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoveAttribute
	 * @generated
	 */
	public Adapter createRemoveAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoteRemoveAttribute <em>Remote Remove Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoteRemoveAttribute
	 * @generated
	 */
	public Adapter createRemoteRemoveAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.UpdateAttribute <em>Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.UpdateAttribute
	 * @generated
	 */
	public Adapter createUpdateAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoteUpdateAttribute <em>Remote Update Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoteUpdateAttribute
	 * @generated
	 */
	public Adapter createRemoteUpdateAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.ReferenceChange <em>Reference Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.ReferenceChange
	 * @generated
	 */
	public Adapter createReferenceChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.ReferenceChangeLeftTarget <em>Reference Change Left Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.ReferenceChangeLeftTarget
	 * @generated
	 */
	public Adapter createReferenceChangeLeftTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.ReferenceChangeRightTarget <em>Reference Change Right Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.ReferenceChangeRightTarget
	 * @generated
	 */
	public Adapter createReferenceChangeRightTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.AddReferenceValue <em>Add Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.AddReferenceValue
	 * @generated
	 */
	public Adapter createAddReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoteAddReferenceValue <em>Remote Add Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoteAddReferenceValue
	 * @generated
	 */
	public Adapter createRemoteAddReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoveReferenceValue <em>Remove Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoveReferenceValue
	 * @generated
	 */
	public Adapter createRemoveReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoteRemoveReferenceValue <em>Remote Remove Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoteRemoveReferenceValue
	 * @generated
	 */
	public Adapter createRemoteRemoveReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.UpdateReference <em>Update Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.UpdateReference
	 * @generated
	 */
	public Adapter createUpdateReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.UpdateUniqueReferenceValue <em>Update Unique Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.UpdateUniqueReferenceValue
	 * @generated
	 */
	public Adapter createUpdateUniqueReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.RemoteUpdateUniqueReferenceValue <em>Remote Update Unique Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.RemoteUpdateUniqueReferenceValue
	 * @generated
	 */
	public Adapter createRemoteUpdateUniqueReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link diff.AbstractDiffExtension <em>Abstract Diff Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see diff.AbstractDiffExtension
	 * @generated
	 */
	public Adapter createAbstractDiffExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DiffAdapterFactory
