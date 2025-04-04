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
 * A representation of the literals of the enumeration '<em><b>System Restful Interaction Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getSystemRestfulInteractionEnum()
 * @model extendedMetaData="name='SystemRestfulInteractionEnum'"
 * @generated
 */
public enum SystemRestfulInteractionEnum implements Enumerator {
	/**
	 * The '<em><b>Transaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * transaction
	 * <!-- end-model-doc -->
	 * @see #TRANSACTION_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION(0, "transaction", "transaction"),

	/**
	 * The '<em><b>Batch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * batch
	 * <!-- end-model-doc -->
	 * @see #BATCH_VALUE
	 * @generated
	 * @ordered
	 */
	BATCH(1, "batch", "batch"),

	/**
	 * The '<em><b>Search System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * search-system
	 * <!-- end-model-doc -->
	 * @see #SEARCH_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH_SYSTEM(2, "searchSystem", "search-system"),

	/**
	 * The '<em><b>History System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * history-system
	 * <!-- end-model-doc -->
	 * @see #HISTORY_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORY_SYSTEM(3, "historySystem", "history-system");

	/**
	 * The '<em><b>Transaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * transaction
	 * <!-- end-model-doc -->
	 * @see #TRANSACTION
	 * @model name="transaction"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_VALUE = 0;

	/**
	 * The '<em><b>Batch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * batch
	 * <!-- end-model-doc -->
	 * @see #BATCH
	 * @model name="batch"
	 * @generated
	 * @ordered
	 */
	public static final int BATCH_VALUE = 1;

	/**
	 * The '<em><b>Search System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * search-system
	 * <!-- end-model-doc -->
	 * @see #SEARCH_SYSTEM
	 * @model name="searchSystem" literal="search-system"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_SYSTEM_VALUE = 2;

	/**
	 * The '<em><b>History System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * history-system
	 * <!-- end-model-doc -->
	 * @see #HISTORY_SYSTEM
	 * @model name="historySystem" literal="history-system"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORY_SYSTEM_VALUE = 3;

	/**
	 * An array of all the '<em><b>System Restful Interaction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SystemRestfulInteractionEnum[] VALUES_ARRAY =
		new SystemRestfulInteractionEnum[] {
			TRANSACTION,
			BATCH,
			SEARCH_SYSTEM,
			HISTORY_SYSTEM,
		};

	/**
	 * A public read-only list of all the '<em><b>System Restful Interaction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SystemRestfulInteractionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>System Restful Interaction Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemRestfulInteractionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemRestfulInteractionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Restful Interaction Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemRestfulInteractionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemRestfulInteractionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Restful Interaction Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemRestfulInteractionEnum get(int value) {
		switch (value) {
			case TRANSACTION_VALUE: return TRANSACTION;
			case BATCH_VALUE: return BATCH;
			case SEARCH_SYSTEM_VALUE: return SEARCH_SYSTEM;
			case HISTORY_SYSTEM_VALUE: return HISTORY_SYSTEM;
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
	private SystemRestfulInteractionEnum(int value, String name, String literal) {
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
	
} //SystemRestfulInteractionEnum
