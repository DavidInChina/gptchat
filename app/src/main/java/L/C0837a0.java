package L;

import N0.C1042a;
import android.graphics.Matrix;
import android.graphics.Path;
import db.C2618f;
import h0.C3288a;
import id.AbstractC3557B;
import q0.C5251c;
import r0.C5344h;

/* renamed from: L.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0837a0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10090Y = 2;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f10091Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f10092h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f10093i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0837a0(Object obj, int i10, int i11) {
        super(1);
        this.f10091Z = i10;
        this.f10092h0 = i11;
        this.f10093i0 = obj;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f10090Y;
        Object obj2 = this.f10093i0;
        int i11 = this.f10092h0;
        int i12 = this.f10091Z;
        switch (i10) {
            case 1:
                N0.m mVar = (N0.m) obj;
                r0.E e10 = (r0.E) obj2;
                N0.l lVar = mVar.f12539a;
                int a5 = mVar.a(i12);
                int a10 = mVar.a(i11);
                C1042a c1042a = (C1042a) lVar;
                CharSequence charSequence = c1042a.f12496e;
                if (a5 >= 0 && a5 <= a10 && a10 <= charSequence.length()) {
                    Path path = new Path();
                    O0.s sVar = c1042a.f12495d;
                    sVar.f13320d.getSelectionPath(a5, a10, path);
                    int i13 = sVar.f13322f;
                    if (i13 != 0 && !path.isEmpty()) {
                        path.offset(0.0f, i13);
                    }
                    long r10 = R4.b.r(0.0f, mVar.f12544f);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate(C5251c.d(r10), C5251c.e(r10));
                    path.transform(matrix);
                    long j6 = C5251c.f43619b;
                    C5344h c5344h = (C5344h) e10;
                    c5344h.getClass();
                    c5344h.f44241a.addPath(path, C5251c.d(j6), C5251c.e(j6));
                    return yVar;
                }
                StringBuilder A10 = E9.f.A("start(", a5, ") or end(", a10, ") is out of range [0..");
                A10.append(charSequence.length());
                A10.append("], or start > end!");
                throw new IllegalArgumentException(A10.toString().toString());
            default:
                F.B b10 = (F.B) obj;
                AbstractC3557B.c0("$this$LazyRow", b10);
                if (1 <= i12) {
                    int i14 = 1;
                    while (true) {
                        if (i14 <= i11) {
                            E9.f.t(b10, null, new C3288a(new C2618f(i14, 0, (wf.k) obj2), true, 1108165242), 3);
                        } else {
                            E9.f.t(b10, null, new C3288a(new C2618f(i14, 1, (wf.k) obj2), true, -278066159), 3);
                        }
                        if (i14 != i12) {
                            i14++;
                        }
                    }
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0837a0(C5344h c5344h, int i10, int i11) {
        super(1);
        this.f10093i0 = c5344h;
        this.f10091Z = i10;
        this.f10092h0 = i11;
    }
}
