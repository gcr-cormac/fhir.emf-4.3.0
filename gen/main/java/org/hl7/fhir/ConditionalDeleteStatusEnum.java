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
 * A representation of the literals of the enumeration '<em><b>Conditional Delete Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getConditionalDeleteStatusEnum()
 * @model extendedMetaData="name='ConditionalDeleteStatusEnum'"
 * @generated
 */
public enum ConditionalDeleteStatusEnum implements Enumerator {
	/**
	 * The '<em><b>Not Supported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Supported
	 * <!-- end-model-doc -->
	 * @see #NOT_SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SUPPORTED(0, "notSupported", "not-supported"),

	/**
	 * The '<em><b>Single</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Single Deletes Supported
	 * <!-- end-model-doc -->
	 * @see #SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE(1, "single", "single"),

	/**
	 * The '<em><b>Multiple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multiple Deletes Supported
	 * <!-- end-model-doc -->
	 * @see #MULTIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE(2, "multiple", "multiple");

	/**
	 * The '<em><b>Not Supported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not Supported
	 * <!-- end-model-doc -->
	 * @see #NOT_SUPPORTED
	 * @model name="notSupported" literal="not-supported"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SUPPORTED_VALUE = 0;

	/**
	 * The '<em><b>Single</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Single Deletes Supported
	 * <!-- end-model-doc -->
	 * @see #SINGLE
	 * @model name="single"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_VALUE = 1;

	/**
	 * The '<em><b>Multiple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multiple Deletes Supported
	 * <!-- end-model-doc -->
	 * @see #MULTIPLE
	 * @model name="multiple"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Conditional Delete Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionalDeleteStatusEnum[] VALUES_ARRAY =
		new ConditionalDeleteStatusEnum[] {
			NOT_SUPPORTED,
			SINGLE,
			MULTIPLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Conditional Delete Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionalDeleteStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conditional Delete Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionalDeleteStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionalDeleteStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conditional Delete Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionalDeleteStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionalDeleteStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conditional Delete Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionalDeleteStatusEnum get(int value) {
		switch (value) {
			case NOT_SUPPORTED_VALUE: return NOT_SUPPORTED;
			case SINGLE_VALUE: return SINGLE;
			case MULTIPLE_VALUE: return MULTIPLE;
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
	private ConditionalDeleteStatusEnum(int value, String name, String literal) {
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
	
} //ConditionalDeleteStatusEnum
