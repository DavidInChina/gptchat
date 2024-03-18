package N0;

import android.graphics.Matrix;
import android.graphics.Shader;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5252d;
import r0.AbstractC5350n;
import r0.AbstractC5352p;
import r0.C5351o;
import r0.J;
import r0.K;
import r0.N;
import t0.AbstractC5650i;
import t0.AbstractC5651j;
import t0.C5649h;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final k f12524a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12525b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12526c;

    /* renamed from: d  reason: collision with root package name */
    public final float f12527d;

    /* renamed from: e  reason: collision with root package name */
    public final float f12528e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12529f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f12530g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f12531h;

    public i(k kVar, long j6, int i10, boolean z10) {
        boolean z11;
        C5252d c5252d;
        int i11;
        this.f12524a = kVar;
        this.f12525b = i10;
        if (Z0.a.j(j6) == 0 && Z0.a.i(j6) == 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = kVar.f12538e;
            int size = arrayList2.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            float f6 = 0.0f;
            while (i13 < size) {
                n nVar = (n) arrayList2.get(i13);
                o oVar = nVar.f12546a;
                int h10 = Z0.a.h(j6);
                if (Z0.a.c(j6)) {
                    i11 = Z0.a.g(j6) - ((int) Math.ceil(f6));
                    if (i11 < 0) {
                        i11 = i12;
                    }
                } else {
                    i11 = Z0.a.g(j6);
                }
                long n10 = A7.b.n(i12, h10, i12, i11, 5);
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics", oVar);
                C1042a c1042a = new C1042a((V0.c) oVar, this.f12525b - i14, z10, n10);
                float b10 = c1042a.b() + f6;
                O0.s sVar = c1042a.f12495d;
                int i15 = i14 + sVar.f13321e;
                arrayList.add(new m(c1042a, nVar.f12547b, nVar.f12548c, i14, i15, f6, b10));
                if (!sVar.f13319c) {
                    i14 = i15;
                    if (i14 != this.f12525b || i13 == AbstractC4344b.u0(this.f12524a.f12538e)) {
                        i13++;
                        f6 = b10;
                        i12 = 0;
                    }
                } else {
                    i14 = i15;
                }
                z11 = true;
                f6 = b10;
                break;
            }
            z11 = false;
            this.f12528e = f6;
            this.f12529f = i14;
            this.f12526c = z11;
            this.f12531h = arrayList;
            this.f12527d = Z0.a.h(j6);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i16 = 0; i16 < size2; i16++) {
                m mVar = (m) arrayList.get(i16);
                List list = ((C1042a) mVar.f12539a).f12497f;
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    C5252d c5252d2 = (C5252d) list.get(i17);
                    if (c5252d2 != null) {
                        c5252d = c5252d2.i(R4.b.r(0.0f, mVar.f12544f));
                    } else {
                        c5252d = null;
                    }
                    arrayList4.add(c5252d);
                }
                kf.s.N1(arrayList4, arrayList3);
            }
            if (arrayList3.size() < this.f12524a.f12535b.size()) {
                int size4 = this.f12524a.f12535b.size() - arrayList3.size();
                ArrayList arrayList5 = new ArrayList(size4);
                for (int i18 = 0; i18 < size4; i18++) {
                    arrayList5.add(null);
                }
                arrayList3 = kf.t.w2(arrayList5, arrayList3);
            }
            this.f12530g = arrayList3;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public static void a(i iVar, AbstractC5352p abstractC5352p, long j6, K k10, Y0.j jVar, AbstractC5651j abstractC5651j) {
        AbstractC5650i.f45621D.getClass();
        int i10 = C5649h.f45619b;
        iVar.getClass();
        abstractC5352p.h();
        ArrayList arrayList = iVar.f12531h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            ((C1042a) mVar.f12539a).e(abstractC5352p, j6, k10, jVar, abstractC5651j, i10);
            abstractC5352p.p(0.0f, ((C1042a) mVar.f12539a).b());
        }
        abstractC5352p.q();
    }

    public static void b(i iVar, AbstractC5352p abstractC5352p, AbstractC5350n abstractC5350n, float f6, K k10, Y0.j jVar, AbstractC5651j abstractC5651j) {
        AbstractC5650i.f45621D.getClass();
        int i10 = C5649h.f45619b;
        iVar.getClass();
        abstractC5352p.h();
        ArrayList arrayList = iVar.f12531h;
        if (arrayList.size() <= 1) {
            AbstractC4828h.F(iVar, abstractC5352p, abstractC5350n, f6, k10, jVar, abstractC5651j, i10);
        } else if (abstractC5350n instanceof N) {
            AbstractC4828h.F(iVar, abstractC5352p, abstractC5350n, f6, k10, jVar, abstractC5651j, i10);
        } else if (abstractC5350n instanceof J) {
            int size = arrayList.size();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                m mVar = (m) arrayList.get(i11);
                f11 += ((C1042a) mVar.f12539a).b();
                f10 = Math.max(f10, ((C1042a) mVar.f12539a).c());
            }
            Shader b10 = ((J) abstractC5350n).b(AbstractC4828h.i(f10, f11));
            Matrix matrix = new Matrix();
            b10.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                m mVar2 = (m) arrayList.get(i12);
                ((C1042a) mVar2.f12539a).f(abstractC5352p, new C5351o(b10), f6, k10, jVar, abstractC5651j, i10);
                C1042a c1042a = (C1042a) mVar2.f12539a;
                abstractC5352p.p(0.0f, c1042a.b());
                matrix.setTranslate(0.0f, -c1042a.b());
                b10.setLocalMatrix(matrix);
            }
        }
        abstractC5352p.q();
    }

    public final void c(int i10) {
        k kVar = this.f12524a;
        if (i10 >= 0 && i10 < kVar.f12534a.f12512Y.length()) {
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("offset(", i10, ") is out of bounds [0, ");
        q10.append(kVar.f12534a.f12512Y.length());
        q10.append(')');
        throw new IllegalArgumentException(q10.toString().toString());
    }

    public final void d(int i10) {
        k kVar = this.f12524a;
        if (i10 >= 0 && i10 <= kVar.f12534a.f12512Y.length()) {
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("offset(", i10, ") is out of bounds [0, ");
        q10.append(kVar.f12534a.f12512Y.length());
        q10.append(']');
        throw new IllegalArgumentException(q10.toString().toString());
    }

    public final void e(int i10) {
        int i11 = this.f12529f;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')').toString());
    }
}
