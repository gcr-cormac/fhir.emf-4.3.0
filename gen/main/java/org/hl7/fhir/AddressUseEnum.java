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
 * A representation of the literals of the enumeration '<em><b>Address Use Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getAddressUseEnum()
 * @model extendedMetaData="name='AddressUseEnum'"
 * @generated
 */
public enum AddressUseEnum implements Enumerator {
	/**
	 * The '<em><b>Home</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Home
	 * <!-- end-model-doc -->
	 * @see #HOME_VALUE
	 * @generated
	 * @ordered
	 */
	HOME(0, "home", "home"),

	/**
	 * The '<em><b>Work</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Work
	 * <!-- end-model-doc -->
	 * @see #WORK_VALUE
	 * @generated
	 * @ordered
	 */
	WORK(1, "work", "work"),

	/**
	 * The '<em><b>Temp</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporary
	 * <!-- end-model-doc -->
	 * @see #TEMP_VALUE
	 * @generated
	 * @ordered
	 */
	TEMP(2, "temp", "temp"),

	/**
	 * The '<em><b>Old</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Old / Incorrect
	 * <!-- end-model-doc -->
	 * @see #OLD_VALUE
	 * @generated
	 * @ordered
	 */
	OLD(3, "old", "old"),

	/**
	 * The '<em><b>Billing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Billing
	 * <!-- end-model-doc -->
	 * @see #BILLING_VALUE
	 * @generated
	 * @ordered
	 */
	BILLING(4, "billing", "billing");

	/**
	 * The '<em><b>Home</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Home
	 * <!-- end-model-doc -->
	 * @see #HOME
	 * @model name="home"
	 * @generated
	 * @ordered
	 */
	public static final int HOME_VALUE = 0;

	/**
	 * The '<em><b>Work</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Work
	 * <!-- end-model-doc -->
	 * @see #WORK
	 * @model name="work"
	 * @generated
	 * @ordered
	 */
	public static final int WORK_VALUE = 1;

	/**
	 * The '<em><b>Temp</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temporary
	 * <!-- end-model-doc -->
	 * @see #TEMP
	 * @model name="temp"
	 * @generated
	 * @ordered
	 */
	public static final int TEMP_VALUE = 2;

	/**
	 * The '<em><b>Old</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Old / Incorrect
	 * <!-- end-model-doc -->
	 * @see #OLD
	 * @model name="old"
	 * @generated
	 * @ordered
	 */
	public static final int OLD_VALUE = 3;

	/**
	 * The '<em><b>Billing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Billing
	 * <!-- end-model-doc -->
	 * @see #BILLING
	 * @model name="billing"
	 * @generated
	 * @ordered
	 */
	public static final int BILLING_VALUE = 4;

	/**
	 * An array of all the '<em><b>Address Use Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AddressUseEnum[] VALUES_ARRAY =
		new AddressUseEnum[] {
			HOME,
			WORK,
			TEMP,
			OLD,
			BILLING,
		};

	/**
	 * A public read-only list of all the '<em><b>Address Use Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AddressUseEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Address Use Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddressUseEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddressUseEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Address Use Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddressUseEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AddressUseEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Address Use Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AddressUseEnum get(int value) {
		switch (value) {
			case HOME_VALUE: return HOME;
			case WORK_VALUE: return WORK;
			case TEMP_VALUE: return TEMP;
			case OLD_VALUE: return OLD;
			case BILLING_VALUE: return BILLING;
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
	private AddressUseEnum(int value, String name, String literal) {
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
	
} //AddressUseEnum
