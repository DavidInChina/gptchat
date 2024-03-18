package xd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kf.t;
import kotlinx.serialization.KSerializer;
import l8.AbstractC4344b;
import wd.C6195j;
import wd.C6201n;
import wd.C6205s;
import x8.W;

@AbstractC1998i
/* loaded from: classes.dex */
public final class e {
    public static final d Companion = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer[] f49808c = {null, new C2695d(C6201n.f48444a, 0)};

    /* renamed from: a  reason: collision with root package name */
    public final String f49809a;

    /* renamed from: b  reason: collision with root package name */
    public final List f49810b;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xd.d] */
    static {
        C6205s.Companion.getClass();
        C6205s c6205s = C6205s.f48452c;
        String a5 = c6205s.a();
        AbstractC3557B.Z(a5);
        C6205s c6205s2 = C6205s.f48453d;
        new e(a5, AbstractC4344b.G0(c6205s, c6205s2));
        String a10 = c6205s2.a();
        AbstractC3557B.Z(a10);
        new e(a10, AbstractC4344b.G0(c6205s, c6205s2));
        C6205s c6205s3 = C6205s.f48454e;
        String a11 = c6205s3.a();
        AbstractC3557B.Z(a11);
        new e(a11, AbstractC4344b.G0(c6205s, c6205s2, c6205s3, C6205s.f48455f, C6205s.f48456g));
    }

    public e(int i10, String str, List list) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, c.f49807b);
            throw null;
        }
        this.f49809a = str;
        this.f49810b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static e a(e eVar, String str, ArrayList arrayList, int i10) {
        if ((i10 & 1) != 0) {
            str = eVar.f49809a;
        }
        ArrayList arrayList2 = arrayList;
        if ((i10 & 2) != 0) {
            arrayList2 = eVar.f49810b;
        }
        eVar.getClass();
        AbstractC3557B.c0("activeAccountId", str);
        AbstractC3557B.c0("availableAccountUsers", arrayList2);
        return new e(str, arrayList2);
    }

    public final C6205s b() {
        String str;
        Object obj;
        List list = this.f49810b;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = this.f49809a;
            if (hasNext) {
                obj = it.next();
                String a5 = ((C6205s) obj).a();
                if (a5 != null && AbstractC3557B.K(a5, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C6205s c6205s = (C6205s) obj;
        if (c6205s == null) {
            W.G(Bi.c.i1(Pc.b.f13936n0), android.gov.nist.core.a.A("Missing accountId for ", C6195j.a(str), " for user! Falling back to first account"), null, 6);
            return (C6205s) t.f2(list);
        }
        return c6205s;
    }

    public final e c(String str) {
        C6195j c6195j;
        List<C6205s> list = this.f49810b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C6205s c6205s : list) {
                String a5 = c6205s.a();
                if (a5 != null && AbstractC3557B.K(a5, this.f49809a)) {
                    return this;
                }
            }
        }
        if (str == null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    String a10 = ((C6205s) it.next()).a();
                    if (a10 != null) {
                        c6195j = new C6195j(a10);
                        continue;
                    } else {
                        c6195j = null;
                        continue;
                    }
                    if (c6195j != null) {
                        break;
                    }
                } else {
                    c6195j = null;
                    break;
                }
            }
            if (c6195j != null) {
                str = c6195j.f48426a;
            } else {
                throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
            }
        }
        return a(this, str, null, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3557B.K(this.f49809a, eVar.f49809a) && AbstractC3557B.K(this.f49810b, eVar.f49810b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49810b.hashCode() + (this.f49809a.hashCode() * 31);
    }

    public final String toString() {
        String a5 = C6195j.a(this.f49809a);
        return "AccountUserState(activeAccountId=" + a5 + ", availableAccountUsers=" + this.f49810b + Separators.RPAREN;
    }

    public e(String str, List list) {
        AbstractC3557B.c0("activeAccountId", str);
        this.f49809a = str;
        this.f49810b = list;
    }
}
