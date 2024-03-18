package Sc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import wd.EnumC6212z;

@AbstractC1998i
/* loaded from: classes.dex */
public final class w {
    public static final k Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f16559c = {new C2695d(h.f16518a, 0), new C2695d(l.f16530a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final List f16560a;

    /* renamed from: b  reason: collision with root package name */
    public final List f16561b;

    public w(int i10, List list, List list2) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, g.f16517b);
            throw null;
        }
        this.f16560a = list;
        this.f16561b = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n a(j jVar) {
        n nVar;
        Object obj;
        AbstractC3557B.c0("category", jVar);
        List list = this.f16561b;
        Iterator it = list.iterator();
        while (true) {
            nVar = null;
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3557B.K(((n) obj).f16534b, jVar.f16524d)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        n nVar2 = (n) obj;
        if (nVar2 == null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((n) next).f16533a == jVar.f16521a) {
                    nVar = next;
                    break;
                }
            }
            n nVar3 = nVar;
            if (nVar3 == null) {
                n nVar4 = (n) kf.t.h2(list);
                if (nVar4 == null) {
                    Qc.b.f14570a.getClass();
                    return (n) kf.t.f2(Qc.a.f14568b.f16561b);
                }
                return nVar4;
            }
            return nVar3;
        }
        return nVar2;
    }

    public final j b() {
        for (j jVar : this.f16560a) {
            if (jVar.f16521a == EnumC6212z.f48474Y) {
                return jVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (AbstractC3557B.K(this.f16560a, wVar.f16560a) && AbstractC3557B.K(this.f16561b, wVar.f16561b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16561b.hashCode() + (this.f16560a.hashCode() * 31);
    }

    public final String toString() {
        return "Models(categories=" + this.f16560a + ", models=" + this.f16561b + Separators.RPAREN;
    }

    public w(List list, List list2) {
        this.f16560a = list;
        this.f16561b = list2;
    }
}
