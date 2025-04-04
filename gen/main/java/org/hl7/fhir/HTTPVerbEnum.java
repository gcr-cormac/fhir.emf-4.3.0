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
 * A representation of the literals of the enumeration '<em><b>HTTP Verb Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getHTTPVerbEnum()
 * @model extendedMetaData="name='HTTPVerbEnum'"
 * @generated
 */
public enum HTTPVerbEnum implements Enumerator {
	/**
	 * The '<em><b>GET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GET
	 * <!-- end-model-doc -->
	 * @see #GET_VALUE
	 * @generated
	 * @ordered
	 */
	GET(0, "GET", "GET"),

	/**
	 * The '<em><b>HEAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HEAD
	 * <!-- end-model-doc -->
	 * @see #HEAD_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD(1, "HEAD", "HEAD"),

	/**
	 * The '<em><b>POST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POST
	 * <!-- end-model-doc -->
	 * @see #POST_VALUE
	 * @generated
	 * @ordered
	 */
	POST(2, "POST", "POST"),

	/**
	 * The '<em><b>PUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PUT
	 * <!-- end-model-doc -->
	 * @see #PUT_VALUE
	 * @generated
	 * @ordered
	 */
	PUT(3, "PUT", "PUT"),

	/**
	 * The '<em><b>DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DELETE
	 * <!-- end-model-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(4, "DELETE", "DELETE"),

	/**
	 * The '<em><b>PATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PATCH
	 * <!-- end-model-doc -->
	 * @see #PATCH_VALUE
	 * @generated
	 * @ordered
	 */
	PATCH(5, "PATCH", "PATCH");

	/**
	 * The '<em><b>GET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GET
	 * <!-- end-model-doc -->
	 * @see #GET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_VALUE = 0;

	/**
	 * The '<em><b>HEAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HEAD
	 * <!-- end-model-doc -->
	 * @see #HEAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_VALUE = 1;

	/**
	 * The '<em><b>POST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POST
	 * <!-- end-model-doc -->
	 * @see #POST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POST_VALUE = 2;

	/**
	 * The '<em><b>PUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PUT
	 * <!-- end-model-doc -->
	 * @see #PUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUT_VALUE = 3;

	/**
	 * The '<em><b>DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DELETE
	 * <!-- end-model-doc -->
	 * @see #DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 4;

	/**
	 * The '<em><b>PATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PATCH
	 * <!-- end-model-doc -->
	 * @see #PATCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATCH_VALUE = 5;

	/**
	 * An array of all the '<em><b>HTTP Verb Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HTTPVerbEnum[] VALUES_ARRAY =
		new HTTPVerbEnum[] {
			GET,
			HEAD,
			POST,
			PUT,
			DELETE,
			PATCH,
		};

	/**
	 * A public read-only list of all the '<em><b>HTTP Verb Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HTTPVerbEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HTTP Verb Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTPVerbEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HTTPVerbEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HTTP Verb Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTPVerbEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HTTPVerbEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HTTP Verb Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTPVerbEnum get(int value) {
		switch (value) {
			case GET_VALUE: return GET;
			case HEAD_VALUE: return HEAD;
			case POST_VALUE: return POST;
			case PUT_VALUE: return PUT;
			case DELETE_VALUE: return DELETE;
			case PATCH_VALUE: return PATCH;
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
	private HTTPVerbEnum(int value, String name, String literal) {
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
	
} //HTTPVerbEnum
