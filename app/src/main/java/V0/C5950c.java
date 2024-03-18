package v0;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import r0.AbstractC5350n;
import r0.C5335B;
import r0.C5344h;
import r0.N;
import t0.AbstractC5650i;
import t0.C5643b;
import t0.C5645d;
import w.C6077x;

/* renamed from: v0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5950c extends AbstractC5939C {

    /* renamed from: b  reason: collision with root package name */
    public float[] f46899b;

    /* renamed from: h  reason: collision with root package name */
    public C5344h f46905h;

    /* renamed from: i  reason: collision with root package name */
    public wf.k f46906i;

    /* renamed from: l  reason: collision with root package name */
    public float f46909l;

    /* renamed from: m  reason: collision with root package name */
    public float f46910m;

    /* renamed from: n  reason: collision with root package name */
    public float f46911n;

    /* renamed from: q  reason: collision with root package name */
    public float f46914q;

    /* renamed from: r  reason: collision with root package name */
    public float f46915r;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f46900c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f46901d = true;

    /* renamed from: e  reason: collision with root package name */
    public long f46902e = r0.r.f44263k;

    /* renamed from: f  reason: collision with root package name */
    public List f46903f = kf.v.f37483Y;

    /* renamed from: g  reason: collision with root package name */
    public boolean f46904g = true;

    /* renamed from: j  reason: collision with root package name */
    public final C6077x f46907j = new C6077x(27, this);

    /* renamed from: k  reason: collision with root package name */
    public String f46908k = "";

    /* renamed from: o  reason: collision with root package name */
    public float f46912o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f46913p = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    public boolean f46916s = true;

    public C5950c() {
        int i10 = AbstractC5944H.f46870a;
    }

    @Override // v0.AbstractC5939C
    public final void a(AbstractC5650i abstractC5650i) {
        if (this.f46916s) {
            float[] fArr = this.f46899b;
            if (fArr == null) {
                fArr = C5335B.a();
                this.f46899b = fArr;
            } else {
                C5335B.d(fArr);
            }
            C5335B.f(fArr, this.f46914q + this.f46910m, this.f46915r + this.f46911n);
            double d10 = (this.f46909l * 3.141592653589793d) / 180.0d;
            float cos = (float) Math.cos(d10);
            float sin = (float) Math.sin(d10);
            float f6 = fArr[0];
            float f10 = fArr[4];
            float f11 = (sin * f10) + (cos * f6);
            float f12 = -sin;
            float f13 = (f10 * cos) + (f6 * f12);
            float f14 = fArr[1];
            float f15 = fArr[5];
            float f16 = (sin * f15) + (cos * f14);
            float f17 = (f15 * cos) + (f14 * f12);
            float f18 = fArr[2];
            float f19 = fArr[6];
            float f20 = (sin * f19) + (cos * f18);
            float f21 = (f19 * cos) + (f18 * f12);
            float f22 = fArr[3];
            float f23 = fArr[7];
            float f24 = (sin * f23) + (cos * f22);
            float f25 = (cos * f23) + (f12 * f22);
            fArr[0] = f11;
            fArr[1] = f16;
            fArr[2] = f20;
            fArr[3] = f24;
            fArr[4] = f13;
            fArr[5] = f17;
            fArr[6] = f21;
            fArr[7] = f25;
            float f26 = this.f46912o;
            float f27 = this.f46913p;
            fArr[0] = f11 * f26;
            fArr[1] = f16 * f26;
            fArr[2] = f20 * f26;
            fArr[3] = f24 * f26;
            fArr[4] = f13 * f27;
            fArr[5] = f17 * f27;
            fArr[6] = f21 * f27;
            fArr[7] = f25 * f27;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
            C5335B.f(fArr, -this.f46910m, -this.f46911n);
            this.f46916s = false;
        }
        if (this.f46904g) {
            if (!this.f46903f.isEmpty()) {
                C5344h c5344h = this.f46905h;
                if (c5344h == null) {
                    c5344h = androidx.compose.ui.graphics.a.g();
                    this.f46905h = c5344h;
                }
                AbstractC5949b.b(this.f46903f, c5344h);
            }
            this.f46904g = false;
        }
        C5643b V10 = abstractC5650i.V();
        long b10 = V10.b();
        V10.a().h();
        float[] fArr2 = this.f46899b;
        C5645d c5645d = V10.f45609a;
        if (fArr2 != null) {
            c5645d.f45615a.a().l(fArr2);
        }
        C5344h c5344h2 = this.f46905h;
        if ((!this.f46903f.isEmpty()) && c5344h2 != null) {
            c5645d.f45615a.a().g(c5344h2, 1);
        }
        ArrayList arrayList = this.f46900c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC5939C) arrayList.get(i10)).a(abstractC5650i);
        }
        V10.a().q();
        V10.c(b10);
    }

    @Override // v0.AbstractC5939C
    public final wf.k b() {
        return this.f46906i;
    }

    @Override // v0.AbstractC5939C
    public final void d(C6077x c6077x) {
        this.f46906i = c6077x;
    }

    public final void e(int i10, AbstractC5939C abstractC5939C) {
        ArrayList arrayList = this.f46900c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, abstractC5939C);
        } else {
            arrayList.add(abstractC5939C);
        }
        g(abstractC5939C);
        abstractC5939C.d(this.f46907j);
        c();
    }

    public final void f(long j6) {
        if (!this.f46901d) {
            return;
        }
        long j10 = r0.r.f44263k;
        if (j6 != j10) {
            long j11 = this.f46902e;
            if (j11 == j10) {
                this.f46902e = j6;
                return;
            }
            int i10 = AbstractC5944H.f46870a;
            if (r0.r.h(j11) != r0.r.h(j6) || r0.r.g(j11) != r0.r.g(j6) || r0.r.e(j11) != r0.r.e(j6)) {
                this.f46901d = false;
                this.f46902e = j10;
            }
        }
    }

    public final void g(AbstractC5939C abstractC5939C) {
        if (abstractC5939C instanceof C5955h) {
            C5955h c5955h = (C5955h) abstractC5939C;
            AbstractC5350n abstractC5350n = c5955h.f46953b;
            if (this.f46901d && abstractC5350n != null) {
                if (abstractC5350n instanceof N) {
                    f(((N) abstractC5350n).f44223a);
                } else {
                    this.f46901d = false;
                    this.f46902e = r0.r.f44263k;
                }
            }
            AbstractC5350n abstractC5350n2 = c5955h.f46958g;
            if (this.f46901d && abstractC5350n2 != null) {
                if (abstractC5350n2 instanceof N) {
                    f(((N) abstractC5350n2).f44223a);
                    return;
                }
                this.f46901d = false;
                this.f46902e = r0.r.f44263k;
            }
        } else if (abstractC5939C instanceof C5950c) {
            C5950c c5950c = (C5950c) abstractC5939C;
            if (c5950c.f46901d && this.f46901d) {
                f(c5950c.f46902e);
                return;
            }
            this.f46901d = false;
            this.f46902e = r0.r.f44263k;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f46908k);
        ArrayList arrayList = this.f46900c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(Separators.HT);
            sb2.append(((AbstractC5939C) arrayList.get(i10)).toString());
            sb2.append(Separators.RETURN);
        }
        return sb2.toString();
    }
}
