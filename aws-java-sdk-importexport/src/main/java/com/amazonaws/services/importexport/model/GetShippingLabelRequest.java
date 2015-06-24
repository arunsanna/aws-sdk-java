/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.importexport.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetShippingLabelRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<String> jobIds;

    private String name;

    private String company;

    private String phoneNumber;

    private String country;

    private String stateOrProvince;

    private String city;

    private String postalCode;

    private String street1;

    private String street2;

    private String street3;

    private String aPIVersion;

    /**
     * Returns the value of the JobIds property for this object.
     * 
     * @return The value of the JobIds property for this object.
     */
    public java.util.List<String> getJobIds() {
        if (jobIds == null) {
            jobIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return jobIds;
    }

    /**
     * Sets the value of the JobIds property for this object.
     * 
     * @param jobIds
     *        The new value for the JobIds property for this object.
     */
    public void setJobIds(java.util.Collection<String> jobIds) {
        if (jobIds == null) {
            this.jobIds = null;
            return;
        }

        this.jobIds = new com.amazonaws.internal.SdkInternalList<String>(jobIds);
    }

    /**
     * Sets the value of the JobIds property for this object.
     * 
     * @param jobIds
     *        The new value for the JobIds property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withJobIds(String... jobIds) {
        if (this.jobIds == null) {
            setJobIds(new com.amazonaws.internal.SdkInternalList<String>(
                    jobIds.length));
        }
        for (String ele : jobIds) {
            this.jobIds.add(ele);
        }
        return this;
    }

    /**
     * Sets the value of the JobIds property for this object.
     * 
     * @param jobIds
     *        The new value for the JobIds property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withJobIds(
            java.util.Collection<String> jobIds) {
        setJobIds(jobIds);
        return this;
    }

    /**
     * Sets the value of the Name property for this object.
     * 
     * @param name
     *        The new value for the Name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the value of the Name property for this object.
     * 
     * @return The value of the Name property for this object.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the Name property for this object.
     * 
     * @param name
     *        The new value for the Name property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Sets the value of the Company property for this object.
     * 
     * @param company
     *        The new value for the Company property for this object.
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Returns the value of the Company property for this object.
     * 
     * @return The value of the Company property for this object.
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * Sets the value of the Company property for this object.
     * 
     * @param company
     *        The new value for the Company property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withCompany(String company) {
        setCompany(company);
        return this;
    }

    /**
     * Sets the value of the PhoneNumber property for this object.
     * 
     * @param phoneNumber
     *        The new value for the PhoneNumber property for this object.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the value of the PhoneNumber property for this object.
     * 
     * @return The value of the PhoneNumber property for this object.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Sets the value of the PhoneNumber property for this object.
     * 
     * @param phoneNumber
     *        The new value for the PhoneNumber property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Sets the value of the Country property for this object.
     * 
     * @param country
     *        The new value for the Country property for this object.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Returns the value of the Country property for this object.
     * 
     * @return The value of the Country property for this object.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Sets the value of the Country property for this object.
     * 
     * @param country
     *        The new value for the Country property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * Sets the value of the StateOrProvince property for this object.
     * 
     * @param stateOrProvince
     *        The new value for the StateOrProvince property for this object.
     */
    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    /**
     * Returns the value of the StateOrProvince property for this object.
     * 
     * @return The value of the StateOrProvince property for this object.
     */
    public String getStateOrProvince() {
        return this.stateOrProvince;
    }

    /**
     * Sets the value of the StateOrProvince property for this object.
     * 
     * @param stateOrProvince
     *        The new value for the StateOrProvince property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withStateOrProvince(String stateOrProvince) {
        setStateOrProvince(stateOrProvince);
        return this;
    }

    /**
     * Sets the value of the City property for this object.
     * 
     * @param city
     *        The new value for the City property for this object.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns the value of the City property for this object.
     * 
     * @return The value of the City property for this object.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets the value of the City property for this object.
     * 
     * @param city
     *        The new value for the City property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * Sets the value of the PostalCode property for this object.
     * 
     * @param postalCode
     *        The new value for the PostalCode property for this object.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Returns the value of the PostalCode property for this object.
     * 
     * @return The value of the PostalCode property for this object.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Sets the value of the PostalCode property for this object.
     * 
     * @param postalCode
     *        The new value for the PostalCode property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * Sets the value of the Street1 property for this object.
     * 
     * @param street1
     *        The new value for the Street1 property for this object.
     */
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * Returns the value of the Street1 property for this object.
     * 
     * @return The value of the Street1 property for this object.
     */
    public String getStreet1() {
        return this.street1;
    }

    /**
     * Sets the value of the Street1 property for this object.
     * 
     * @param street1
     *        The new value for the Street1 property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withStreet1(String street1) {
        setStreet1(street1);
        return this;
    }

    /**
     * Sets the value of the Street2 property for this object.
     * 
     * @param street2
     *        The new value for the Street2 property for this object.
     */
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * Returns the value of the Street2 property for this object.
     * 
     * @return The value of the Street2 property for this object.
     */
    public String getStreet2() {
        return this.street2;
    }

    /**
     * Sets the value of the Street2 property for this object.
     * 
     * @param street2
     *        The new value for the Street2 property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withStreet2(String street2) {
        setStreet2(street2);
        return this;
    }

    /**
     * Sets the value of the Street3 property for this object.
     * 
     * @param street3
     *        The new value for the Street3 property for this object.
     */
    public void setStreet3(String street3) {
        this.street3 = street3;
    }

    /**
     * Returns the value of the Street3 property for this object.
     * 
     * @return The value of the Street3 property for this object.
     */
    public String getStreet3() {
        return this.street3;
    }

    /**
     * Sets the value of the Street3 property for this object.
     * 
     * @param street3
     *        The new value for the Street3 property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withStreet3(String street3) {
        setStreet3(street3);
        return this;
    }

    /**
     * Sets the value of the APIVersion property for this object.
     * 
     * @param aPIVersion
     *        The new value for the APIVersion property for this object.
     */
    public void setAPIVersion(String aPIVersion) {
        this.aPIVersion = aPIVersion;
    }

    /**
     * Returns the value of the APIVersion property for this object.
     * 
     * @return The value of the APIVersion property for this object.
     */
    public String getAPIVersion() {
        return this.aPIVersion;
    }

    /**
     * Sets the value of the APIVersion property for this object.
     * 
     * @param aPIVersion
     *        The new value for the APIVersion property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetShippingLabelRequest withAPIVersion(String aPIVersion) {
        setAPIVersion(aPIVersion);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobIds() != null)
            sb.append("JobIds: " + getJobIds() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCompany() != null)
            sb.append("Company: " + getCompany() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber() + ",");
        if (getCountry() != null)
            sb.append("Country: " + getCountry() + ",");
        if (getStateOrProvince() != null)
            sb.append("StateOrProvince: " + getStateOrProvince() + ",");
        if (getCity() != null)
            sb.append("City: " + getCity() + ",");
        if (getPostalCode() != null)
            sb.append("PostalCode: " + getPostalCode() + ",");
        if (getStreet1() != null)
            sb.append("Street1: " + getStreet1() + ",");
        if (getStreet2() != null)
            sb.append("Street2: " + getStreet2() + ",");
        if (getStreet3() != null)
            sb.append("Street3: " + getStreet3() + ",");
        if (getAPIVersion() != null)
            sb.append("APIVersion: " + getAPIVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetShippingLabelRequest == false)
            return false;
        GetShippingLabelRequest other = (GetShippingLabelRequest) obj;
        if (other.getJobIds() == null ^ this.getJobIds() == null)
            return false;
        if (other.getJobIds() != null
                && other.getJobIds().equals(this.getJobIds()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCompany() == null ^ this.getCompany() == null)
            return false;
        if (other.getCompany() != null
                && other.getCompany().equals(this.getCompany()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null
                && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getStateOrProvince() == null
                ^ this.getStateOrProvince() == null)
            return false;
        if (other.getStateOrProvince() != null
                && other.getStateOrProvince().equals(this.getStateOrProvince()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null
                && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null
                && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getStreet1() == null ^ this.getStreet1() == null)
            return false;
        if (other.getStreet1() != null
                && other.getStreet1().equals(this.getStreet1()) == false)
            return false;
        if (other.getStreet2() == null ^ this.getStreet2() == null)
            return false;
        if (other.getStreet2() != null
                && other.getStreet2().equals(this.getStreet2()) == false)
            return false;
        if (other.getStreet3() == null ^ this.getStreet3() == null)
            return false;
        if (other.getStreet3() != null
                && other.getStreet3().equals(this.getStreet3()) == false)
            return false;
        if (other.getAPIVersion() == null ^ this.getAPIVersion() == null)
            return false;
        if (other.getAPIVersion() != null
                && other.getAPIVersion().equals(this.getAPIVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobIds() == null) ? 0 : getJobIds().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCompany() == null) ? 0 : getCompany().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode
                + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime
                * hashCode
                + ((getStateOrProvince() == null) ? 0 : getStateOrProvince()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode
                + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode
                + ((getStreet1() == null) ? 0 : getStreet1().hashCode());
        hashCode = prime * hashCode
                + ((getStreet2() == null) ? 0 : getStreet2().hashCode());
        hashCode = prime * hashCode
                + ((getStreet3() == null) ? 0 : getStreet3().hashCode());
        hashCode = prime * hashCode
                + ((getAPIVersion() == null) ? 0 : getAPIVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetShippingLabelRequest clone() {
        return (GetShippingLabelRequest) super.clone();
    }
}