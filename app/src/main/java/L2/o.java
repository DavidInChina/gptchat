package L2;

import E2.C0480l;
import android.net.Uri;
import c3.C2284d;
import java.util.ArrayList;
import java.util.Map;
import nf.AbstractC4828h;
import p2.Y;
import p3.C5073A;
import p3.C5078a;
import p3.C5080c;
import p3.C5082e;
import p3.C5084g;
import q3.C5268d;
import x8.L;
import x8.N;
import x8.k0;

/* loaded from: classes2.dex */
public final class o implements t {

    /* renamed from: j0  reason: collision with root package name */
    public static final int[] f10630j0 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20};

    /* renamed from: k0  reason: collision with root package name */
    public static final U3.u f10631k0 = new U3.u(new Y(29));

    /* renamed from: l0  reason: collision with root package name */
    public static final U3.u f10632l0 = new U3.u(new A9.a(0));

    /* renamed from: Y  reason: collision with root package name */
    public boolean f10633Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f10634Z;

    /* renamed from: h0  reason: collision with root package name */
    public k0 f10635h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f10636i0;

    @Override // L2.t
    public final synchronized q[] a(Uri uri, Map map) {
        q[] qVarArr;
        try {
            int[] iArr = f10630j0;
            ArrayList arrayList = new ArrayList(20);
            int T = AbstractC4828h.T(map);
            if (T != -1) {
                b(T, arrayList);
            }
            int U10 = AbstractC4828h.U(uri);
            if (U10 != -1 && U10 != T) {
                b(U10, arrayList);
            }
            for (int i10 = 0; i10 < 20; i10++) {
                int i11 = iArr[i10];
                if (i11 != T && i11 != U10) {
                    b(i11, arrayList);
                }
            }
            qVarArr = new q[arrayList.size()];
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                qVarArr[i12] = (q) arrayList.get(i12);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return qVarArr;
    }

    public final void b(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new C5078a());
                return;
            case 1:
                arrayList.add(new C5080c());
                return;
            case 2:
                arrayList.add(new C5082e(this.f10633Y ? 1 : 0));
                return;
            case 3:
                arrayList.add(new M2.a(this.f10633Y ? 1 : 0));
                return;
            case 4:
                q v10 = f10631k0.v(0);
                if (v10 != null) {
                    arrayList.add(v10);
                    return;
                } else {
                    arrayList.add(new P2.b());
                    return;
                }
            case 5:
                arrayList.add(new Q2.b());
                return;
            case 6:
                arrayList.add(new C2284d());
                return;
            case 7:
                arrayList.add(new d3.d(this.f10634Z | (this.f10633Y ? 1 : 0)));
                return;
            case 8:
                arrayList.add(new e3.j());
                arrayList.add(new e3.m(0));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new C5073A());
                return;
            case 11:
                if (this.f10635h0 == null) {
                    L l10 = N.f49523Z;
                    this.f10635h0 = k0.f49573j0;
                }
                arrayList.add(new p3.F(new s2.z(0L), new C5084g(this.f10635h0)));
                return;
            case 12:
                arrayList.add(new C5268d());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new C0480l(this.f10636i0));
                return;
            case 15:
                q v11 = f10632l0.v(new Object[0]);
                if (v11 != null) {
                    arrayList.add(v11);
                    return;
                }
                return;
            case 16:
                arrayList.add(new N2.b());
                return;
            case 17:
                arrayList.add(new O2.a(1));
                return;
            case 18:
                arrayList.add(new R2.a(1));
                return;
            case 19:
                arrayList.add(new O2.a(0));
                return;
            case 20:
                arrayList.add(new R2.a(0));
                return;
        }
    }

    public final synchronized void c() {
        this.f10633Y = true;
    }
}
