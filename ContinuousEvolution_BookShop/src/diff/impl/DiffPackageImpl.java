/**
 */
package diff.impl;

import diff.AbstractDiffExtension;
import diff.AddAttribute;
import diff.AddModelElement;
import diff.AddReferenceValue;
import diff.AttributeChange;
import diff.AttributeChangeLeftTarget;
import diff.AttributeChangeRightTarget;
import diff.ConflictingDiffElement;
import diff.DiffElement;
import diff.DiffFactory;
import diff.DiffGroup;
import diff.DiffModel;
import diff.DiffPackage;
import diff.DifferenceKind;
import diff.GenericDiffElement;
import diff.ModelElementChange;
import diff.ModelElementChangeLeftTarget;
import diff.ModelElementChangeRightTarget;
import diff.ModelInputSnapshot;
import diff.MoveModelElement;
import diff.ReferenceChange;
import diff.ReferenceChangeLeftTarget;
import diff.ReferenceChangeRightTarget;
import diff.RemoteAddAttribute;
import diff.RemoteAddModelElement;
import diff.RemoteAddReferenceValue;
import diff.RemoteMoveModelElement;
import diff.RemoteRemoveAttribute;
import diff.RemoteRemoveModelElement;
import diff.RemoteRemoveReferenceValue;
import diff.RemoteUpdateAttribute;
import diff.RemoteUpdateUniqueReferenceValue;
import diff.RemoveAttribute;
import diff.RemoveModelElement;
import diff.RemoveReferenceValue;
import diff.UpdateAttribute;
import diff.UpdateModelElement;
import diff.UpdateReference;
import diff.UpdateUniqueReferenceValue;

import org.eclipse.emf.compare.diff.merge.api.IMerger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffPackageImpl extends EPackageImpl implements DiffPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericDiffElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictingDiffElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelInputSnapshotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementChangeLeftTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementChangeRightTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteAddModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteRemoveModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteMoveModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeChangeLeftTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeChangeRightTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteAddAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteRemoveAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteUpdateAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceChangeLeftTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceChangeRightTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteAddReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteRemoveReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateUniqueReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteUpdateUniqueReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDiffExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum differenceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iMergerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see diff.DiffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiffPackageImpl() {
		super(eNS_URI, DiffFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DiffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiffPackage init() {
		if (isInited) return (DiffPackage)EPackage.Registry.INSTANCE.getEPackage(DiffPackage.eNS_URI);

		// Obtain or create and register package
		DiffPackageImpl theDiffPackage = (DiffPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiffPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiffPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiffPackage.createPackageContents();

		// Initialize created meta-data
		theDiffPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiffPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiffPackage.eNS_URI, theDiffPackage);
		return theDiffPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffModel() {
		return diffModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_Left() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_Origin() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffModel_Right() {
		return (EAttribute)diffModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffModel_OwnedElements() {
		return (EReference)diffModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffElement() {
		return diffElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffElement_SubDiffElements() {
		return (EReference)diffElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffElement_IsHiddenBy() {
		return (EReference)diffElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffElement_Conflicting() {
		return (EAttribute)diffElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffElement_Kind() {
		return (EAttribute)diffElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericDiffElement() {
		return genericDiffElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericDiffElement_LeftElement() {
		return (EReference)genericDiffElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericDiffElement_RightElement() {
		return (EReference)genericDiffElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflictingDiffElement() {
		return conflictingDiffElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflictingDiffElement_LeftParent() {
		return (EReference)conflictingDiffElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflictingDiffElement_RightParent() {
		return (EReference)conflictingDiffElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflictingDiffElement_OriginElement() {
		return (EReference)conflictingDiffElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffGroup() {
		return diffGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffGroup_LeftParent() {
		return (EReference)diffGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiffGroup_Subchanges() {
		return (EAttribute)diffGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelInputSnapshot() {
		return modelInputSnapshotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelInputSnapshot_Date() {
		return (EAttribute)modelInputSnapshotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelInputSnapshot_Diff() {
		return (EReference)modelInputSnapshotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElementChange() {
		return modelElementChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElementChangeLeftTarget() {
		return modelElementChangeLeftTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementChangeLeftTarget_RightParent() {
		return (EReference)modelElementChangeLeftTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementChangeLeftTarget_LeftElement() {
		return (EReference)modelElementChangeLeftTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElementChangeRightTarget() {
		return modelElementChangeRightTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementChangeRightTarget_LeftParent() {
		return (EReference)modelElementChangeRightTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElementChangeRightTarget_RightElement() {
		return (EReference)modelElementChangeRightTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddModelElement() {
		return addModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteAddModelElement() {
		return remoteAddModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveModelElement() {
		return removeModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteRemoveModelElement() {
		return remoteRemoveModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateModelElement() {
		return updateModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateModelElement_RightElement() {
		return (EReference)updateModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateModelElement_LeftElement() {
		return (EReference)updateModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveModelElement() {
		return moveModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveModelElement_LeftTarget() {
		return (EReference)moveModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveModelElement_RightTarget() {
		return (EReference)moveModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteMoveModelElement() {
		return remoteMoveModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeChange() {
		return attributeChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeChange_Attribute() {
		return (EReference)attributeChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeChange_LeftElement() {
		return (EReference)attributeChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeChange_RightElement() {
		return (EReference)attributeChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeChangeLeftTarget() {
		return attributeChangeLeftTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeChangeLeftTarget_LeftTarget() {
		return (EReference)attributeChangeLeftTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeChangeRightTarget() {
		return attributeChangeRightTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeChangeRightTarget_RightTarget() {
		return (EReference)attributeChangeRightTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddAttribute() {
		return addAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteAddAttribute() {
		return remoteAddAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveAttribute() {
		return removeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteRemoveAttribute() {
		return remoteRemoveAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAttribute() {
		return updateAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteUpdateAttribute() {
		return remoteUpdateAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceChange() {
		return referenceChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceChange_Reference() {
		return (EReference)referenceChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceChange_RightElement() {
		return (EReference)referenceChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceChange_LeftElement() {
		return (EReference)referenceChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceChangeLeftTarget() {
		return referenceChangeLeftTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceChangeLeftTarget_LeftRemovedTarget() {
		return (EReference)referenceChangeLeftTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceChangeLeftTarget_RightRemovedTarget() {
		return (EReference)referenceChangeLeftTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceChangeRightTarget() {
		return referenceChangeRightTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceChangeRightTarget_RightAddedTarget() {
		return (EReference)referenceChangeRightTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceChangeRightTarget_LeftAddedTarget() {
		return (EReference)referenceChangeRightTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddReferenceValue() {
		return addReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteAddReferenceValue() {
		return remoteAddReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveReferenceValue() {
		return removeReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteRemoveReferenceValue() {
		return remoteRemoveReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateReference() {
		return updateReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateUniqueReferenceValue() {
		return updateUniqueReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateUniqueReferenceValue_LeftTarget() {
		return (EReference)updateUniqueReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateUniqueReferenceValue_RightTarget() {
		return (EReference)updateUniqueReferenceValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteUpdateUniqueReferenceValue() {
		return remoteUpdateUniqueReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDiffExtension() {
		return abstractDiffExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDiffExtension_HideElements() {
		return (EReference)abstractDiffExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDiffExtension_IsCollapsed() {
		return (EAttribute)abstractDiffExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractDiffExtension__Visit__DiffModel() {
		return abstractDiffExtensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractDiffExtension__GetText() {
		return abstractDiffExtensionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractDiffExtension__GetImage() {
		return abstractDiffExtensionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractDiffExtension__ProvideMerger() {
		return abstractDiffExtensionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDifferenceKind() {
		return differenceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIMerger() {
		return iMergerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffFactory getDiffFactory() {
		return (DiffFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		diffModelEClass = createEClass(DIFF_MODEL);
		createEAttribute(diffModelEClass, DIFF_MODEL__LEFT);
		createEAttribute(diffModelEClass, DIFF_MODEL__ORIGIN);
		createEAttribute(diffModelEClass, DIFF_MODEL__RIGHT);
		createEReference(diffModelEClass, DIFF_MODEL__OWNED_ELEMENTS);

		diffElementEClass = createEClass(DIFF_ELEMENT);
		createEReference(diffElementEClass, DIFF_ELEMENT__SUB_DIFF_ELEMENTS);
		createEReference(diffElementEClass, DIFF_ELEMENT__IS_HIDDEN_BY);
		createEAttribute(diffElementEClass, DIFF_ELEMENT__CONFLICTING);
		createEAttribute(diffElementEClass, DIFF_ELEMENT__KIND);

		genericDiffElementEClass = createEClass(GENERIC_DIFF_ELEMENT);
		createEReference(genericDiffElementEClass, GENERIC_DIFF_ELEMENT__LEFT_ELEMENT);
		createEReference(genericDiffElementEClass, GENERIC_DIFF_ELEMENT__RIGHT_ELEMENT);

		conflictingDiffElementEClass = createEClass(CONFLICTING_DIFF_ELEMENT);
		createEReference(conflictingDiffElementEClass, CONFLICTING_DIFF_ELEMENT__LEFT_PARENT);
		createEReference(conflictingDiffElementEClass, CONFLICTING_DIFF_ELEMENT__RIGHT_PARENT);
		createEReference(conflictingDiffElementEClass, CONFLICTING_DIFF_ELEMENT__ORIGIN_ELEMENT);

		diffGroupEClass = createEClass(DIFF_GROUP);
		createEReference(diffGroupEClass, DIFF_GROUP__LEFT_PARENT);
		createEAttribute(diffGroupEClass, DIFF_GROUP__SUBCHANGES);

		modelInputSnapshotEClass = createEClass(MODEL_INPUT_SNAPSHOT);
		createEAttribute(modelInputSnapshotEClass, MODEL_INPUT_SNAPSHOT__DATE);
		createEReference(modelInputSnapshotEClass, MODEL_INPUT_SNAPSHOT__DIFF);

		modelElementChangeEClass = createEClass(MODEL_ELEMENT_CHANGE);

		modelElementChangeLeftTargetEClass = createEClass(MODEL_ELEMENT_CHANGE_LEFT_TARGET);
		createEReference(modelElementChangeLeftTargetEClass, MODEL_ELEMENT_CHANGE_LEFT_TARGET__RIGHT_PARENT);
		createEReference(modelElementChangeLeftTargetEClass, MODEL_ELEMENT_CHANGE_LEFT_TARGET__LEFT_ELEMENT);

		modelElementChangeRightTargetEClass = createEClass(MODEL_ELEMENT_CHANGE_RIGHT_TARGET);
		createEReference(modelElementChangeRightTargetEClass, MODEL_ELEMENT_CHANGE_RIGHT_TARGET__LEFT_PARENT);
		createEReference(modelElementChangeRightTargetEClass, MODEL_ELEMENT_CHANGE_RIGHT_TARGET__RIGHT_ELEMENT);

		addModelElementEClass = createEClass(ADD_MODEL_ELEMENT);

		remoteAddModelElementEClass = createEClass(REMOTE_ADD_MODEL_ELEMENT);

		removeModelElementEClass = createEClass(REMOVE_MODEL_ELEMENT);

		remoteRemoveModelElementEClass = createEClass(REMOTE_REMOVE_MODEL_ELEMENT);

		updateModelElementEClass = createEClass(UPDATE_MODEL_ELEMENT);
		createEReference(updateModelElementEClass, UPDATE_MODEL_ELEMENT__RIGHT_ELEMENT);
		createEReference(updateModelElementEClass, UPDATE_MODEL_ELEMENT__LEFT_ELEMENT);

		moveModelElementEClass = createEClass(MOVE_MODEL_ELEMENT);
		createEReference(moveModelElementEClass, MOVE_MODEL_ELEMENT__LEFT_TARGET);
		createEReference(moveModelElementEClass, MOVE_MODEL_ELEMENT__RIGHT_TARGET);

		remoteMoveModelElementEClass = createEClass(REMOTE_MOVE_MODEL_ELEMENT);

		attributeChangeEClass = createEClass(ATTRIBUTE_CHANGE);
		createEReference(attributeChangeEClass, ATTRIBUTE_CHANGE__ATTRIBUTE);
		createEReference(attributeChangeEClass, ATTRIBUTE_CHANGE__LEFT_ELEMENT);
		createEReference(attributeChangeEClass, ATTRIBUTE_CHANGE__RIGHT_ELEMENT);

		attributeChangeLeftTargetEClass = createEClass(ATTRIBUTE_CHANGE_LEFT_TARGET);
		createEReference(attributeChangeLeftTargetEClass, ATTRIBUTE_CHANGE_LEFT_TARGET__LEFT_TARGET);

		attributeChangeRightTargetEClass = createEClass(ATTRIBUTE_CHANGE_RIGHT_TARGET);
		createEReference(attributeChangeRightTargetEClass, ATTRIBUTE_CHANGE_RIGHT_TARGET__RIGHT_TARGET);

		addAttributeEClass = createEClass(ADD_ATTRIBUTE);

		remoteAddAttributeEClass = createEClass(REMOTE_ADD_ATTRIBUTE);

		removeAttributeEClass = createEClass(REMOVE_ATTRIBUTE);

		remoteRemoveAttributeEClass = createEClass(REMOTE_REMOVE_ATTRIBUTE);

		updateAttributeEClass = createEClass(UPDATE_ATTRIBUTE);

		remoteUpdateAttributeEClass = createEClass(REMOTE_UPDATE_ATTRIBUTE);

		referenceChangeEClass = createEClass(REFERENCE_CHANGE);
		createEReference(referenceChangeEClass, REFERENCE_CHANGE__REFERENCE);
		createEReference(referenceChangeEClass, REFERENCE_CHANGE__RIGHT_ELEMENT);
		createEReference(referenceChangeEClass, REFERENCE_CHANGE__LEFT_ELEMENT);

		referenceChangeLeftTargetEClass = createEClass(REFERENCE_CHANGE_LEFT_TARGET);
		createEReference(referenceChangeLeftTargetEClass, REFERENCE_CHANGE_LEFT_TARGET__LEFT_REMOVED_TARGET);
		createEReference(referenceChangeLeftTargetEClass, REFERENCE_CHANGE_LEFT_TARGET__RIGHT_REMOVED_TARGET);

		referenceChangeRightTargetEClass = createEClass(REFERENCE_CHANGE_RIGHT_TARGET);
		createEReference(referenceChangeRightTargetEClass, REFERENCE_CHANGE_RIGHT_TARGET__RIGHT_ADDED_TARGET);
		createEReference(referenceChangeRightTargetEClass, REFERENCE_CHANGE_RIGHT_TARGET__LEFT_ADDED_TARGET);

		addReferenceValueEClass = createEClass(ADD_REFERENCE_VALUE);

		remoteAddReferenceValueEClass = createEClass(REMOTE_ADD_REFERENCE_VALUE);

		removeReferenceValueEClass = createEClass(REMOVE_REFERENCE_VALUE);

		remoteRemoveReferenceValueEClass = createEClass(REMOTE_REMOVE_REFERENCE_VALUE);

		updateReferenceEClass = createEClass(UPDATE_REFERENCE);

		updateUniqueReferenceValueEClass = createEClass(UPDATE_UNIQUE_REFERENCE_VALUE);
		createEReference(updateUniqueReferenceValueEClass, UPDATE_UNIQUE_REFERENCE_VALUE__LEFT_TARGET);
		createEReference(updateUniqueReferenceValueEClass, UPDATE_UNIQUE_REFERENCE_VALUE__RIGHT_TARGET);

		remoteUpdateUniqueReferenceValueEClass = createEClass(REMOTE_UPDATE_UNIQUE_REFERENCE_VALUE);

		abstractDiffExtensionEClass = createEClass(ABSTRACT_DIFF_EXTENSION);
		createEReference(abstractDiffExtensionEClass, ABSTRACT_DIFF_EXTENSION__HIDE_ELEMENTS);
		createEAttribute(abstractDiffExtensionEClass, ABSTRACT_DIFF_EXTENSION__IS_COLLAPSED);
		createEOperation(abstractDiffExtensionEClass, ABSTRACT_DIFF_EXTENSION___VISIT__DIFFMODEL);
		createEOperation(abstractDiffExtensionEClass, ABSTRACT_DIFF_EXTENSION___GET_TEXT);
		createEOperation(abstractDiffExtensionEClass, ABSTRACT_DIFF_EXTENSION___GET_IMAGE);
		createEOperation(abstractDiffExtensionEClass, ABSTRACT_DIFF_EXTENSION___PROVIDE_MERGER);

		// Create enums
		differenceKindEEnum = createEEnum(DIFFERENCE_KIND);

		// Create data types
		iMergerEDataType = createEDataType(IMERGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		genericDiffElementEClass.getESuperTypes().add(this.getDiffElement());
		conflictingDiffElementEClass.getESuperTypes().add(this.getDiffElement());
		diffGroupEClass.getESuperTypes().add(this.getDiffElement());
		modelElementChangeEClass.getESuperTypes().add(this.getDiffElement());
		modelElementChangeLeftTargetEClass.getESuperTypes().add(this.getModelElementChange());
		modelElementChangeRightTargetEClass.getESuperTypes().add(this.getModelElementChange());
		addModelElementEClass.getESuperTypes().add(this.getModelElementChangeRightTarget());
		remoteAddModelElementEClass.getESuperTypes().add(this.getModelElementChangeLeftTarget());
		removeModelElementEClass.getESuperTypes().add(this.getModelElementChangeLeftTarget());
		remoteRemoveModelElementEClass.getESuperTypes().add(this.getModelElementChangeRightTarget());
		updateModelElementEClass.getESuperTypes().add(this.getModelElementChange());
		moveModelElementEClass.getESuperTypes().add(this.getUpdateModelElement());
		remoteMoveModelElementEClass.getESuperTypes().add(this.getMoveModelElement());
		attributeChangeEClass.getESuperTypes().add(this.getDiffElement());
		attributeChangeLeftTargetEClass.getESuperTypes().add(this.getAttributeChange());
		attributeChangeRightTargetEClass.getESuperTypes().add(this.getAttributeChange());
		addAttributeEClass.getESuperTypes().add(this.getAttributeChangeRightTarget());
		remoteAddAttributeEClass.getESuperTypes().add(this.getAttributeChangeLeftTarget());
		removeAttributeEClass.getESuperTypes().add(this.getAttributeChangeLeftTarget());
		remoteRemoveAttributeEClass.getESuperTypes().add(this.getAttributeChangeRightTarget());
		updateAttributeEClass.getESuperTypes().add(this.getAttributeChange());
		remoteUpdateAttributeEClass.getESuperTypes().add(this.getUpdateAttribute());
		referenceChangeEClass.getESuperTypes().add(this.getDiffElement());
		referenceChangeLeftTargetEClass.getESuperTypes().add(this.getReferenceChange());
		referenceChangeRightTargetEClass.getESuperTypes().add(this.getReferenceChange());
		addReferenceValueEClass.getESuperTypes().add(this.getReferenceChangeRightTarget());
		remoteAddReferenceValueEClass.getESuperTypes().add(this.getReferenceChangeLeftTarget());
		removeReferenceValueEClass.getESuperTypes().add(this.getReferenceChangeLeftTarget());
		remoteRemoveReferenceValueEClass.getESuperTypes().add(this.getReferenceChangeRightTarget());
		updateReferenceEClass.getESuperTypes().add(this.getReferenceChange());
		updateUniqueReferenceValueEClass.getESuperTypes().add(this.getUpdateReference());
		remoteUpdateUniqueReferenceValueEClass.getESuperTypes().add(this.getUpdateUniqueReferenceValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(diffModelEClass, DiffModel.class, "DiffModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffModel_Left(), ecorePackage.getEString(), "left", null, 0, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_Origin(), ecorePackage.getEString(), "origin", null, 0, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffModel_Right(), ecorePackage.getEString(), "right", null, 0, 1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffModel_OwnedElements(), this.getDiffElement(), null, "ownedElements", null, 0, -1, DiffModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffElementEClass, DiffElement.class, "DiffElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiffElement_SubDiffElements(), this.getDiffElement(), null, "subDiffElements", null, 0, -1, DiffElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffElement_IsHiddenBy(), this.getAbstractDiffExtension(), this.getAbstractDiffExtension_HideElements(), "isHiddenBy", null, 0, -1, DiffElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffElement_Conflicting(), ecorePackage.getEBoolean(), "conflicting", null, 0, 1, DiffElement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffElement_Kind(), this.getDifferenceKind(), "kind", "Addition", 0, 1, DiffElement.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(genericDiffElementEClass, GenericDiffElement.class, "GenericDiffElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericDiffElement_LeftElement(), ecorePackage.getEObject(), null, "leftElement", null, 0, 1, GenericDiffElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericDiffElement_RightElement(), ecorePackage.getEObject(), null, "rightElement", null, 0, 1, GenericDiffElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conflictingDiffElementEClass, ConflictingDiffElement.class, "ConflictingDiffElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConflictingDiffElement_LeftParent(), ecorePackage.getEObject(), null, "leftParent", null, 0, 1, ConflictingDiffElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflictingDiffElement_RightParent(), ecorePackage.getEObject(), null, "rightParent", null, 0, 1, ConflictingDiffElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflictingDiffElement_OriginElement(), ecorePackage.getEObject(), null, "originElement", null, 0, 1, ConflictingDiffElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffGroupEClass, DiffGroup.class, "DiffGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiffGroup_LeftParent(), ecorePackage.getEObject(), null, "leftParent", null, 0, 1, DiffGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffGroup_Subchanges(), ecorePackage.getEInt(), "subchanges", null, 0, 1, DiffGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(modelInputSnapshotEClass, ModelInputSnapshot.class, "ModelInputSnapshot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelInputSnapshot_Date(), ecorePackage.getEDate(), "date", null, 0, 1, ModelInputSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelInputSnapshot_Diff(), this.getDiffModel(), null, "diff", null, 0, 1, ModelInputSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementChangeEClass, ModelElementChange.class, "ModelElementChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelElementChangeLeftTargetEClass, ModelElementChangeLeftTarget.class, "ModelElementChangeLeftTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElementChangeLeftTarget_RightParent(), ecorePackage.getEObject(), null, "rightParent", null, 0, 1, ModelElementChangeLeftTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementChangeLeftTarget_LeftElement(), ecorePackage.getEObject(), null, "leftElement", null, 0, 1, ModelElementChangeLeftTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementChangeRightTargetEClass, ModelElementChangeRightTarget.class, "ModelElementChangeRightTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElementChangeRightTarget_LeftParent(), ecorePackage.getEObject(), null, "leftParent", null, 0, 1, ModelElementChangeRightTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElementChangeRightTarget_RightElement(), ecorePackage.getEObject(), null, "rightElement", null, 0, 1, ModelElementChangeRightTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addModelElementEClass, AddModelElement.class, "AddModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteAddModelElementEClass, RemoteAddModelElement.class, "RemoteAddModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeModelElementEClass, RemoveModelElement.class, "RemoveModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteRemoveModelElementEClass, RemoteRemoveModelElement.class, "RemoteRemoveModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateModelElementEClass, UpdateModelElement.class, "UpdateModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateModelElement_RightElement(), ecorePackage.getEObject(), null, "rightElement", null, 0, 1, UpdateModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateModelElement_LeftElement(), ecorePackage.getEObject(), null, "leftElement", null, 0, 1, UpdateModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveModelElementEClass, MoveModelElement.class, "MoveModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoveModelElement_LeftTarget(), ecorePackage.getEObject(), null, "leftTarget", null, 0, 1, MoveModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoveModelElement_RightTarget(), ecorePackage.getEObject(), null, "rightTarget", null, 0, 1, MoveModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteMoveModelElementEClass, RemoteMoveModelElement.class, "RemoteMoveModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeChangeEClass, AttributeChange.class, "AttributeChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeChange_Attribute(), ecorePackage.getEAttribute(), null, "attribute", null, 0, 1, AttributeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeChange_LeftElement(), ecorePackage.getEObject(), null, "leftElement", null, 0, 1, AttributeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeChange_RightElement(), ecorePackage.getEObject(), null, "rightElement", null, 0, 1, AttributeChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeChangeLeftTargetEClass, AttributeChangeLeftTarget.class, "AttributeChangeLeftTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeChangeLeftTarget_LeftTarget(), ecorePackage.getEObject(), null, "leftTarget", null, 0, 1, AttributeChangeLeftTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeChangeRightTargetEClass, AttributeChangeRightTarget.class, "AttributeChangeRightTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeChangeRightTarget_RightTarget(), ecorePackage.getEObject(), null, "rightTarget", null, 0, 1, AttributeChangeRightTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addAttributeEClass, AddAttribute.class, "AddAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteAddAttributeEClass, RemoteAddAttribute.class, "RemoteAddAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeAttributeEClass, RemoveAttribute.class, "RemoveAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteRemoveAttributeEClass, RemoteRemoveAttribute.class, "RemoteRemoveAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateAttributeEClass, UpdateAttribute.class, "UpdateAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteUpdateAttributeEClass, RemoteUpdateAttribute.class, "RemoteUpdateAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceChangeEClass, ReferenceChange.class, "ReferenceChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceChange_Reference(), ecorePackage.getEReference(), null, "reference", null, 0, 1, ReferenceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceChange_RightElement(), ecorePackage.getEObject(), null, "rightElement", null, 0, 1, ReferenceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceChange_LeftElement(), ecorePackage.getEObject(), null, "leftElement", null, 0, 1, ReferenceChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceChangeLeftTargetEClass, ReferenceChangeLeftTarget.class, "ReferenceChangeLeftTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceChangeLeftTarget_LeftRemovedTarget(), ecorePackage.getEObject(), null, "leftRemovedTarget", null, 0, 1, ReferenceChangeLeftTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceChangeLeftTarget_RightRemovedTarget(), ecorePackage.getEObject(), null, "rightRemovedTarget", null, 0, 1, ReferenceChangeLeftTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceChangeRightTargetEClass, ReferenceChangeRightTarget.class, "ReferenceChangeRightTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceChangeRightTarget_RightAddedTarget(), ecorePackage.getEObject(), null, "rightAddedTarget", null, 0, 1, ReferenceChangeRightTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceChangeRightTarget_LeftAddedTarget(), ecorePackage.getEObject(), null, "leftAddedTarget", null, 0, 1, ReferenceChangeRightTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addReferenceValueEClass, AddReferenceValue.class, "AddReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteAddReferenceValueEClass, RemoteAddReferenceValue.class, "RemoteAddReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeReferenceValueEClass, RemoveReferenceValue.class, "RemoveReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteRemoveReferenceValueEClass, RemoteRemoveReferenceValue.class, "RemoteRemoveReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateReferenceEClass, UpdateReference.class, "UpdateReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateUniqueReferenceValueEClass, UpdateUniqueReferenceValue.class, "UpdateUniqueReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateUniqueReferenceValue_LeftTarget(), ecorePackage.getEObject(), null, "leftTarget", null, 0, 1, UpdateUniqueReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateUniqueReferenceValue_RightTarget(), ecorePackage.getEObject(), null, "rightTarget", null, 0, 1, UpdateUniqueReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteUpdateUniqueReferenceValueEClass, RemoteUpdateUniqueReferenceValue.class, "RemoteUpdateUniqueReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractDiffExtensionEClass, AbstractDiffExtension.class, "AbstractDiffExtension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractDiffExtension_HideElements(), this.getDiffElement(), this.getDiffElement_IsHiddenBy(), "hideElements", null, 0, -1, AbstractDiffExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractDiffExtension_IsCollapsed(), ecorePackage.getEBoolean(), "isCollapsed", "false", 0, 1, AbstractDiffExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAbstractDiffExtension__Visit__DiffModel(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDiffModel(), "diffModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractDiffExtension__GetText(), ecorePackage.getEString(), "getText", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractDiffExtension__GetImage(), ecorePackage.getEJavaObject(), "getImage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractDiffExtension__ProvideMerger(), this.getIMerger(), "provideMerger", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(differenceKindEEnum, DifferenceKind.class, "DifferenceKind");
		addEEnumLiteral(differenceKindEEnum, DifferenceKind.ADDITION);
		addEEnumLiteral(differenceKindEEnum, DifferenceKind.DELETION);
		addEEnumLiteral(differenceKindEEnum, DifferenceKind.CHANGE);
		addEEnumLiteral(differenceKindEEnum, DifferenceKind.MOVE);
		addEEnumLiteral(differenceKindEEnum, DifferenceKind.CONFLICT);

		// Initialize data types
		initEDataType(iMergerEDataType, IMerger.class, "IMerger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DiffPackageImpl
