package n2;

import S4.o;
import androidx.lifecycle.Y;
import jh.L1;
import w.C6050B;

/* renamed from: n2.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4712c extends Y {

    /* renamed from: f  reason: collision with root package name */
    public static final L1 f39604f = new L1(1);

    /* renamed from: d  reason: collision with root package name */
    public final C6050B f39605d = new C6050B();

    /* renamed from: e  reason: collision with root package name */
    public boolean f39606e = false;

    @Override // androidx.lifecycle.Y
    public final void c() {
        C6050B c6050b = this.f39605d;
        int f6 = c6050b.f();
        for (int i10 = 0; i10 < f6; i10++) {
            C4710a c4710a = (C4710a) c6050b.g(i10);
            o2.b bVar = c4710a.f39596n;
            bVar.a();
            bVar.f40515d = true;
            C4711b c4711b = c4710a.f39598p;
            if (c4711b != null) {
                c4710a.h(c4711b);
                if (c4711b.f39601Z) {
                    ((o) c4711b.f39603i0).getClass();
                }
            }
            o2.c cVar = bVar.f40513b;
            if (cVar != null) {
                if (cVar == c4710a) {
                    bVar.f40513b = null;
                    if (c4711b != null) {
                        boolean z10 = c4711b.f39601Z;
                    }
                    bVar.f40516e = true;
                    bVar.f40514c = false;
                    bVar.f40515d = false;
                    bVar.f40517f = false;
                } else {
                    throw new IllegalArgumentException("Attempting to unregister the wrong listener");
                }
            } else {
                throw new IllegalStateException("No listener register");
            }
        }
        int i11 = c6050b.f47564i0;
        Object[] objArr = c6050b.f47563h0;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        c6050b.f47564i0 = 0;
        c6050b.f47561Y = false;
    }
}
