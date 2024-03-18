package android.gov.nist.javax.sip.header;

import c.Y;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public class Server extends SIPHeader implements Y {
    private static final long serialVersionUID = -3587764149383342973L;
    protected List productTokens = new LinkedList();

    public Server() {
        super(SIPHeaderNames.SERVER);
    }

    private StringBuilder encodeProduct(StringBuilder sb2) {
        ListIterator listIterator = this.productTokens.listIterator();
        while (listIterator.hasNext()) {
            sb2.append((String) listIterator.next());
            if (!listIterator.hasNext()) {
                break;
            }
            sb2.append('/');
        }
        return sb2;
    }

    public void addProductToken(String str) {
        this.productTokens.add(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        return encodeProduct(sb2);
    }

    public ListIterator getProduct() {
        List list = this.productTokens;
        if (list != null && !list.isEmpty()) {
            return this.productTokens.listIterator();
        }
        return null;
    }

    public void setProduct(List list) {
        if (list != null) {
            this.productTokens = list;
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, UserAgent, setProduct(), the  product parameter is null");
    }
}
