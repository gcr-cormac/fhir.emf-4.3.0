/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Contained Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SpecimenContainedPreference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSpecimenContainedPreference()
 * @model extendedMetaData="name='SpecimenContainedPreference' kind='elementOnly'"
 * @generated
 */
public interface SpecimenContainedPreference extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.SpecimenContainedPreferenceEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.SpecimenContainedPreferenceEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(SpecimenContainedPreferenceEnum)
	 * @see org.hl7.fhir.FhirPackage#getSpecimenContainedPreference_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	SpecimenContainedPreferenceEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SpecimenContainedPreference#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.SpecimenContainedPreferenceEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SpecimenContainedPreferenceEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.SpecimenContainedPreference#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(SpecimenContainedPreferenceEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.SpecimenContainedPreference#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(SpecimenContainedPreferenceEnum)
	 * @generated
	 */
	boolean isSetValue();

} // SpecimenContainedPreference
