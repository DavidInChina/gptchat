package android.gov.nist.javax.sip.header;

import java.util.ListIterator;

/* loaded from: classes2.dex */
public class ExtensionHeaderList extends SIPHeaderList<ExtensionHeaderImpl> {
    private static final long serialVersionUID = 4681326807149890197L;

    public ExtensionHeaderList(String str) {
        super(ExtensionHeaderImpl.class, str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeaderList, android.gov.nist.core.GenericObject
    public Object clone() {
        ExtensionHeaderList extensionHeaderList = new ExtensionHeaderList(this.headerName);
        extensionHeaderList.clonehlist(this.hlist);
        return extensionHeaderList;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeaderList, android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb2 = new StringBuilder();
        ListIterator<ExtensionHeaderImpl> listIterator = listIterator();
        while (listIterator.hasNext()) {
            sb2.append(listIterator.next().encode());
        }
        return sb2.toString();
    }

    public ExtensionHeaderList() {
        super(ExtensionHeaderImpl.class, null);
    }
}
