package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.NameValue;
import android.gov.nist.javax.sip.header.ParametersHeader;
import c.AbstractC2266v;
import java.text.ParseException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public class PChargingFunctionAddresses extends ParametersHeader implements PChargingFunctionAddressesHeader, SIPHeaderNamesIms, AbstractC2266v {
    public PChargingFunctionAddresses() {
        super("P-Charging-Function-Addresses");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void addChargingCollectionFunctionAddress(String str) {
        if (str != null) {
            this.parameters.set(ParameterNamesIms.CCF, str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setChargingCollectionFunctionAddress(), the ccfAddress parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void addEventChargingFunctionAddress(String str) {
        if (str != null) {
            this.parameters.set(ParameterNamesIms.ECF, str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setEventChargingFunctionAddress(), the ecfAddress parameter is null.");
    }

    public boolean delete(String str, String str2) {
        Iterator<NameValue> it = this.parameters.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            NameValue next = it.next();
            if (((String) next.getValueAsObject()).equalsIgnoreCase(str) && next.getName().equalsIgnoreCase(str2)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (!this.duplicates.isEmpty()) {
            this.duplicates.encode(sb2);
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public ListIterator getChargingCollectionFunctionAddresses() {
        Iterator<NameValue> it = this.parameters.iterator();
        LinkedList linkedList = new LinkedList();
        while (it.hasNext()) {
            NameValue next = it.next();
            if (next.getName().equalsIgnoreCase(ParameterNamesIms.CCF)) {
                NameValue nameValue = new NameValue();
                nameValue.setName(next.getName());
                nameValue.setValueAsObject(next.getValueAsObject());
                linkedList.add(nameValue);
            }
        }
        return linkedList.listIterator();
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public ListIterator<NameValue> getEventChargingFunctionAddresses() {
        LinkedList linkedList = new LinkedList();
        Iterator<NameValue> it = this.parameters.iterator();
        ListIterator<NameValue> listIterator = linkedList.listIterator();
        while (it.hasNext()) {
            NameValue next = it.next();
            if (next.getName().equalsIgnoreCase(ParameterNamesIms.ECF)) {
                NameValue nameValue = new NameValue();
                nameValue.setName(next.getName());
                nameValue.setValueAsObject(next.getValueAsObject());
                listIterator.add(nameValue);
            }
        }
        return listIterator;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void removeChargingCollectionFunctionAddress(String str) {
        if (str != null) {
            if (delete(str, ParameterNamesIms.CCF)) {
                return;
            }
            throw new ParseException("CCF Address Not Removed", 0);
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setChargingCollectionFunctionAddress(), the ccfAddress parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void removeEventChargingFunctionAddress(String str) {
        if (str != null) {
            if (delete(str, ParameterNamesIms.ECF)) {
                return;
            }
            throw new ParseException("ECF Address Not Removed", 0);
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setEventChargingFunctionAddress(), the ecfAddress parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void setChargingCollectionFunctionAddress(String str) {
        if (str != null) {
            setMultiParameter(ParameterNamesIms.CCF, str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setChargingCollectionFunctionAddress(), the ccfAddress parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader
    public void setEventChargingFunctionAddress(String str) {
        if (str != null) {
            setMultiParameter(ParameterNamesIms.ECF, str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, P-Charging-Function-Addresses, setEventChargingFunctionAddress(), the ecfAddress parameter is null.");
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }
}
