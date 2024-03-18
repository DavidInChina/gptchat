package android.gov.nist.javax.sip.header;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class AllowList extends SIPHeaderList<Allow> {
    private static final long serialVersionUID = -4699795429662562358L;

    public AllowList() {
        super(Allow.class, SIPHeaderNames.ALLOW);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeaderList, android.gov.nist.core.GenericObject
    public Object clone() {
        AllowList allowList = new AllowList();
        allowList.clonehlist(this.hlist);
        return allowList;
    }

    public ListIterator<String> getMethods() {
        LinkedList linkedList = new LinkedList();
        for (HDR hdr : this.hlist) {
            linkedList.add(hdr.getMethod());
        }
        return linkedList.listIterator();
    }

    public void setMethods(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Allow allow = new Allow();
            allow.setMethod(listIterator.next());
            add((AllowList) allow);
        }
    }
}
