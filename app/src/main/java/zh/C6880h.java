package zh;

import java.util.List;
import sh.C5629a;
import th.C5805m;
import wh.C6247l;
import wh.C6261z;
import yh.l1;
import yh.t1;

/* renamed from: zh.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6880h extends x {

    /* renamed from: f  reason: collision with root package name */
    public final C6261z f52125f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C6881i f52126g;

    public C6880h(C6881i c6881i, C6261z c6261z) {
        this.f52126g = c6881i;
        this.f52125f = c6261z;
    }

    @Override // zh.x
    public final C6881i F0() {
        C6881i c6881i = this.f52126g;
        AbstractC6884l abstractC6884l = c6881i.f52128g;
        C6247l c6247l = c6881i.f52127f;
        String str = c6247l.f48550a;
        C5629a c5629a = new C5629a(c6247l.f48552c);
        l1.a aVar = c6247l.f48553d;
        List m12 = A7.b.m1(new C5629a(c6247l.f48554e), this.f52125f);
        c6247l.getClass();
        t1 t1Var = new t1(c6247l.f48555f);
        c6247l.getClass();
        return new C6881i(abstractC6884l, new C6247l(str, c6247l.f48551b, c5629a, aVar, m12, t1Var, new C5805m(0, c6247l.f48556g), c6247l.f48557h, c6247l.f48558i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6880h.class != obj.getClass()) {
            return false;
        }
        C6880h c6880h = (C6880h) obj;
        if (this.f52125f.equals(c6880h.f52125f) && this.f52126g.equals(c6880h.f52126g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f52125f.hashCode();
        return this.f52126g.hashCode() + ((hashCode + (C6880h.class.hashCode() * 31)) * 31);
    }
}
