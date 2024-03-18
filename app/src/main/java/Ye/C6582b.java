package ye;

import Lg.n;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kf.q;
import kf.t;
import xe.C6428q;

/* renamed from: ye.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6582b extends d {

    /* renamed from: b  reason: collision with root package name */
    public final List f50901b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumC6581a f50902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6582b(String str, List list, EnumC6581a enumC6581a) {
        super(str);
        AbstractC3557B.c0("encoding", enumC6581a);
        this.f50901b = list;
        this.f50902c = enumC6581a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!e.f50907c.b(((C6428q) it.next()).f49948a)) {
                throw new Ae.e("Parameter name should be a token");
            }
        }
    }

    @Override // ye.d
    public final String a() {
        EnumC6581a enumC6581a = this.f50902c;
        AbstractC3557B.c0("encoding", enumC6581a);
        boolean isEmpty = this.f50901b.isEmpty();
        String str = this.f50904a;
        if (!isEmpty) {
            return t.m2(this.f50901b, ", ", str + ' ', null, new Oc.c(this, 12, enumC6581a), 28);
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6582b)) {
            return false;
        }
        C6582b c6582b = (C6582b) obj;
        if (!n.f2(c6582b.f50904a, this.f50904a) || !AbstractC3557B.K(c6582b.f50901b, this.f50901b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String lowerCase = this.f50904a.toLowerCase(Locale.ROOT);
        AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
        return q.z3(new Object[]{lowerCase, this.f50901b}).hashCode();
    }
}
