package Bh;

import Rh.p1;
import yh.C6641v;
import yh.l1;

/* renamed from: Bh.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0239d extends Nh.d {

    /* renamed from: J  reason: collision with root package name */
    public final p1 f2321J;

    public C0239d(int i10, p1 p1Var) {
        super(null, i10);
        this.f2321J = p1Var;
    }

    @Override // Nh.d
    public final String A(String str, String str2) {
        String replace = str.replace('/', '.');
        p1 p1Var = this.f2321J;
        l1 a5 = p1Var.a(replace).a();
        l1 a10 = p1Var.a(str2.replace('/', '.')).a();
        if (a5.f0(a10)) {
            return a5.D0();
        }
        if (a5.K0(a10)) {
            return a10.D0();
        }
        if (!a5.E0() && !a10.E0()) {
            do {
                l1.a L10 = a5.L();
                if (L10 == null) {
                    return C6641v.l1(Object.class).D0();
                }
                a5 = L10.l0();
            } while (!a5.f0(a10));
            return a5.D0();
        }
        return C6641v.l1(Object.class).D0();
    }

    public C0239d(int i10, Nh.b bVar, p1 p1Var) {
        super(bVar, i10);
        this.f2321J = p1Var;
    }
}
