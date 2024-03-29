package android.gov.nist.javax.sip.header;

import c.f0;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class UserAgent extends SIPHeader implements f0 {
    private static final long serialVersionUID = 4561239179796364295L;
    protected List productTokens = new LinkedList();

    public UserAgent() {
        super(SIPHeaderNames.USER_AGENT);
    }

    private StringBuilder encodeProduct(StringBuilder sb2) {
        ListIterator listIterator = this.productTokens.listIterator();
        while (listIterator.hasNext()) {
            sb2.append((String) listIterator.next());
        }
        return sb2;
    }

    public void addProductToken(String str) {
        this.productTokens.add(str);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        UserAgent userAgent = (UserAgent) super.clone();
        if (this.productTokens != null) {
            userAgent.productTokens = new LinkedList(this.productTokens);
        }
        return userAgent;
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
