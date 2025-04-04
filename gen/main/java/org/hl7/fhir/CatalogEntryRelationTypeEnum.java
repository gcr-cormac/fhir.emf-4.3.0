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
 * A representation of the literals of the enumeration '<em><b>Catalog Entry Relation Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getCatalogEntryRelationTypeEnum()
 * @model extendedMetaData="name='CatalogEntryRelationTypeEnum'"
 * @generated
 */
public enum CatalogEntryRelationTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Triggers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggers
	 * <!-- end-model-doc -->
	 * @see #TRIGGERS_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGERS(0, "triggers", "triggers"),

	/**
	 * The '<em><b>Is Replaced By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaced By
	 * <!-- end-model-doc -->
	 * @see #IS_REPLACED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_REPLACED_BY(1, "isReplacedBy", "is-replaced-by");

	/**
	 * The '<em><b>Triggers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggers
	 * <!-- end-model-doc -->
	 * @see #TRIGGERS
	 * @model name="triggers"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGERS_VALUE = 0;

	/**
	 * The '<em><b>Is Replaced By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaced By
	 * <!-- end-model-doc -->
	 * @see #IS_REPLACED_BY
	 * @model name="isReplacedBy" literal="is-replaced-by"
	 * @generated
	 * @ordered
	 */
	public static final int IS_REPLACED_BY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Catalog Entry Relation Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CatalogEntryRelationTypeEnum[] VALUES_ARRAY =
		new CatalogEntryRelationTypeEnum[] {
			TRIGGERS,
			IS_REPLACED_BY,
		};

	/**
	 * A public read-only list of all the '<em><b>Catalog Entry Relation Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CatalogEntryRelationTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Catalog Entry Relation Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CatalogEntryRelationTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CatalogEntryRelationTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Catalog Entry Relation Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CatalogEntryRelationTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CatalogEntryRelationTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Catalog Entry Relation Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CatalogEntryRelationTypeEnum get(int value) {
		switch (value) {
			case TRIGGERS_VALUE: return TRIGGERS;
			case IS_REPLACED_BY_VALUE: return IS_REPLACED_BY;
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
	private CatalogEntryRelationTypeEnum(int value, String name, String literal) {
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
	
} //CatalogEntryRelationTypeEnum
