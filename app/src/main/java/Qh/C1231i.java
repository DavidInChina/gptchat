package Qh;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: Qh.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1231i extends AbstractC1230h {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f14996a;

    public C1231i(AbstractC1234l... abstractC1234lArr) {
        List<AbstractC1234l> asList = Arrays.asList(abstractC1234lArr);
        this.f14996a = new ArrayList(asList.size());
        for (AbstractC1234l abstractC1234l : asList) {
            if (abstractC1234l instanceof C1231i) {
                this.f14996a.addAll(((C1231i) abstractC1234l).f14996a);
            } else {
                this.f14996a.add(abstractC1234l);
            }
        }
    }

    @Override // Qh.AbstractC1234l
    public final boolean a(Object obj) {
        Iterator it = this.f14996a.iterator();
        while (it.hasNext()) {
            if (!((AbstractC1234l) it.next()).a(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1231i.class == obj.getClass() && this.f14996a.equals(((C1231i) obj).f14996a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14996a.hashCode() + (C1231i.class.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
        Iterator it = this.f14996a.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            AbstractC1234l abstractC1234l = (AbstractC1234l) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(" and ");
            }
            sb2.append(abstractC1234l);
        }
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
