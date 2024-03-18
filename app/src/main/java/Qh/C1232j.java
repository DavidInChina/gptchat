package Qh;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: Qh.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1232j extends AbstractC1230h {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f14997a;

    public C1232j(AbstractC1234l... abstractC1234lArr) {
        List<AbstractC1234l> asList = Arrays.asList(abstractC1234lArr);
        this.f14997a = new ArrayList(asList.size());
        for (AbstractC1234l abstractC1234l : asList) {
            if (abstractC1234l instanceof C1232j) {
                this.f14997a.addAll(((C1232j) abstractC1234l).f14997a);
            } else {
                this.f14997a.add(abstractC1234l);
            }
        }
    }

    @Override // Qh.AbstractC1234l
    public final boolean a(Object obj) {
        Iterator it = this.f14997a.iterator();
        while (it.hasNext()) {
            if (((AbstractC1234l) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1232j.class == obj.getClass() && this.f14997a.equals(((C1232j) obj).f14997a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14997a.hashCode() + (C1232j.class.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        Iterator it = this.f14997a.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            AbstractC1234l abstractC1234l = (AbstractC1234l) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(" or ");
            }
            sb2.append(abstractC1234l);
        }
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
