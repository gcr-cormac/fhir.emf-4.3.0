/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Audit Event Outcome Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getAuditEventOutcomeEnum()
 * @model extendedMetaData="name='AuditEventOutcomeEnum'"
 * @generated
 */
public enum AuditEventOutcomeEnum implements Enumerator {
	/**
	 * The '<em><b>0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Success
	 * <!-- end-model-doc -->
	 * @see #_0_VALUE
	 * @generated
	 * @ordered
	 */
	_0(0, "_0", "0"),

	/**
	 * The '<em><b>4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minor failure
	 * <!-- end-model-doc -->
	 * @see #_4_VALUE
	 * @generated
	 * @ordered
	 */
	_4(1, "_4", "4"),

	/**
	 * The '<em><b>8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Serious failure
	 * <!-- end-model-doc -->
	 * @see #_8_VALUE
	 * @generated
	 * @ordered
	 */
	_8(2, "_8", "8"),

	/**
	 * The '<em><b>12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Major failure
	 * <!-- end-model-doc -->
	 * @see #_12_VALUE
	 * @generated
	 * @ordered
	 */
	_12(3, "_12", "12");

	/**
	 * The '<em><b>0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Success
	 * <!-- end-model-doc -->
	 * @see #_0
	 * @model literal="0"
	 * @generated
	 * @ordered
	 */
	public static final int _0_VALUE = 0;

	/**
	 * The '<em><b>4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minor failure
	 * <!-- end-model-doc -->
	 * @see #_4
	 * @model literal="4"
	 * @generated
	 * @ordered
	 */
	public static final int _4_VALUE = 1;

	/**
	 * The '<em><b>8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Serious failure
	 * <!-- end-model-doc -->
	 * @see #_8
	 * @model literal="8"
	 * @generated
	 * @ordered
	 */
	public static final int _8_VALUE = 2;

	/**
	 * The '<em><b>12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Major failure
	 * <!-- end-model-doc -->
	 * @see #_12
	 * @model literal="12"
	 * @generated
	 * @ordered
	 */
	public static final int _12_VALUE = 3;

	/**
	 * An array of all the '<em><b>Audit Event Outcome Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AuditEventOutcomeEnum[] VALUES_ARRAY =
		new AuditEventOutcomeEnum[] {
			_0,
			_4,
			_8,
			_12,
		};

	/**
	 * A public read-only list of all the '<em><b>Audit Event Outcome Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AuditEventOutcomeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Audit Event Outcome Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditEventOutcomeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuditEventOutcomeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Audit Event Outcome Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditEventOutcomeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuditEventOutcomeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Audit Event Outcome Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuditEventOutcomeEnum get(int value) {
		switch (value) {
			case _0_VALUE: return _0;
			case _4_VALUE: return _4;
			case _8_VALUE: return _8;
			case _12_VALUE: return _12;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AuditEventOutcomeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AuditEventOutcomeEnum
