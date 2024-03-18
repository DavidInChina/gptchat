package y;

import Z.C1724m0;
import Z.l1;
import Z.o1;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import l0.AbstractC4313e;
import nf.AbstractC4828h;
import z.C6729v0;

/* renamed from: y.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6460A implements AbstractC6482u {

    /* renamed from: a  reason: collision with root package name */
    public final C6729v0 f50078a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC4313e f50079b;

    /* renamed from: c  reason: collision with root package name */
    public Z0.l f50080c;

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f50081d = AbstractC4828h.Z(new Z0.k(0), o1.f22665a);

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f50082e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public l1 f50083f;

    public C6460A(C6729v0 c6729v0, AbstractC4313e abstractC4313e, Z0.l lVar) {
        this.f50078a = c6729v0;
        this.f50079b = abstractC4313e;
        this.f50080c = lVar;
    }

    public static final long d(C6460A c6460a) {
        l1 l1Var = c6460a.f50083f;
        if (l1Var != null) {
            return ((Z0.k) l1Var.getValue()).f22804a;
        }
        return ((Z0.k) c6460a.f50081d.getValue()).f22804a;
    }

    @Override // z.AbstractC6717p0
    public final Object a() {
        return this.f50078a.c().a();
    }

    @Override // z.AbstractC6717p0
    public final boolean b(Object obj, Object obj2) {
        if (AbstractC3557B.K(obj, a()) && AbstractC3557B.K(obj2, c())) {
            return true;
        }
        return false;
    }

    @Override // z.AbstractC6717p0
    public final Object c() {
        return this.f50078a.c().c();
    }

    public final boolean e(int i10) {
        if (!AbstractC4828h.H(i10, 0) && ((!AbstractC4828h.H(i10, 4) || this.f50080c != Z0.l.f22805Y) && (!AbstractC4828h.H(i10, 5) || this.f50080c != Z0.l.f22806Z))) {
            return false;
        }
        return true;
    }

    public final boolean f(int i10) {
        if (AbstractC4828h.H(i10, 1)) {
            return true;
        }
        if (AbstractC4828h.H(i10, 4) && this.f50080c == Z0.l.f22806Z) {
            return true;
        }
        if (AbstractC4828h.H(i10, 5) && this.f50080c == Z0.l.f22805Y) {
            return true;
        }
        return false;
    }
}
