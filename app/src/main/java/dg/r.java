package dg;

import Sf.AbstractC1385d;
import android.gov.nist.core.Separators;
import eg.EnumC2893a;
import fg.C3032C;
import id.AbstractC3557B;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import lg.C4470o;
import o1.C4885I;
import sg.C5625b;
import zg.AbstractC6864k;
import zg.EnumC6863j;

/* loaded from: classes.dex */
public final class r implements AbstractC6864k {

    /* renamed from: b  reason: collision with root package name */
    public final C5625b f28357b;

    /* renamed from: c  reason: collision with root package name */
    public final C5625b f28358c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC2653B f28359d;

    public r(AbstractC2653B abstractC2653B, C3032C c3032c, jg.h hVar, EnumC6863j enumC6863j) {
        AbstractC3557B.c0("kotlinClass", abstractC2653B);
        AbstractC3557B.c0("packageProto", c3032c);
        AbstractC3557B.c0("nameResolver", hVar);
        Rf.c cVar = (Rf.c) abstractC2653B;
        C5625b b10 = C5625b.b(AbstractC1385d.a(cVar.f15499a));
        C4885I c4885i = cVar.f15500b;
        C5625b c5625b = null;
        String str = ((EnumC2893a) c4885i.f40437c) != EnumC2893a.f29384n0 ? null : c4885i.f40442h;
        if (str != null && str.length() > 0) {
            c5625b = C5625b.d(str);
        }
        this.f28357b = b10;
        this.f28358c = c5625b;
        this.f28359d = abstractC2653B;
        C4470o c4470o = ig.k.f33244m;
        AbstractC3557B.b0("packageModuleName", c4470o);
        Integer num = (Integer) A7.b.P0(c3032c, c4470o);
        if (num != null) {
            hVar.b(num.intValue());
        }
    }

    @Override // zg.AbstractC6864k
    public final String a() {
        return "Class '" + b().b().b() + '\'';
    }

    public final C4290b b() {
        C4291c c4291c;
        C5625b c5625b = this.f28357b;
        String str = c5625b.f45577a;
        int lastIndexOf = str.lastIndexOf(Separators.SLASH);
        if (lastIndexOf == -1) {
            c4291c = C4291c.f37496c;
            if (c4291c == null) {
                C5625b.a(7);
                throw null;
            }
        } else {
            c4291c = new C4291c(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        String e10 = c5625b.e();
        AbstractC3557B.b0("getInternalName(...)", e10);
        return new C4290b(c4291c, C4294f.e(Lg.n.P2('/', e10, e10)));
    }

    public final String toString() {
        return r.class.getSimpleName() + ": " + this.f28357b;
    }
}
