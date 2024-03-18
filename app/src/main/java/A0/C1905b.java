package a0;

import Z.AbstractC1702b0;
import Z.AbstractC1704c0;
import Z.AbstractC1734s;
import Z.AbstractC1738u;
import Z.C1705d;
import Z.T;
import Z.k1;
import h0.C3289b;
import id.AbstractC3557B;
import java.util.ArrayList;
import nf.AbstractC4828h;

/* renamed from: a0.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1905b {

    /* renamed from: a  reason: collision with root package name */
    public final Z.r f23807a;

    /* renamed from: b  reason: collision with root package name */
    public C1904a f23808b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23809c;

    /* renamed from: f  reason: collision with root package name */
    public int f23812f;

    /* renamed from: g  reason: collision with root package name */
    public int f23813g;

    /* renamed from: l  reason: collision with root package name */
    public int f23818l;

    /* renamed from: d  reason: collision with root package name */
    public final T f23810d = new T();

    /* renamed from: e  reason: collision with root package name */
    public boolean f23811e = true;

    /* renamed from: h  reason: collision with root package name */
    public final k1 f23814h = new k1();

    /* renamed from: i  reason: collision with root package name */
    public int f23815i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f23816j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f23817k = -1;

    public C1905b(Z.r rVar, C1904a c1904a) {
        this.f23807a = rVar;
        this.f23808b = c1904a;
    }

    public final void a(ArrayList arrayList, C3289b c3289b) {
        C1904a c1904a = this.f23808b;
        c1904a.getClass();
        if (!arrayList.isEmpty()) {
            C1909f c1909f = C1909f.f23823c;
            C1903I c1903i = c1904a.f23806a;
            c1903i.h(c1909f);
            AbstractC4828h.m0(c1903i, 1, arrayList);
            AbstractC4828h.m0(c1903i, 0, c3289b);
            int i10 = c1903i.f23804g;
            int i11 = c1909f.f23792a;
            int a5 = C1903I.a(c1903i, i11);
            int i12 = c1909f.f23793b;
            if (i10 != a5 || c1903i.f23805h != C1903I.a(c1903i, i12)) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    if (((1 << i14) & c1903i.f23804g) != 0) {
                        if (i13 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(c1909f.b(i14));
                        i13++;
                    }
                }
                String sb3 = sb2.toString();
                StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
                int i15 = 0;
                for (int i16 = 0; i16 < i12; i16++) {
                    if (((1 << i16) & c1903i.f23805h) != 0) {
                        if (i13 > 0) {
                            u10.append(", ");
                        }
                        u10.append(c1909f.c(i16));
                        i15++;
                    }
                }
                String sb4 = u10.toString();
                AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(c1909f);
                sb5.append(". Not all arguments were provided. Missing ");
                android.gov.nist.core.a.x(sb5, i13, " int arguments (", sb3, ") and ");
                throw new IllegalStateException(R.a.s(sb5, i15, " object arguments (", sb4, ").").toString());
            }
        }
    }

    public final void b(AbstractC1702b0 abstractC1702b0, AbstractC1738u abstractC1738u, AbstractC1704c0 abstractC1704c0, AbstractC1704c0 abstractC1704c02) {
        C1904a c1904a = this.f23808b;
        c1904a.getClass();
        C1910g c1910g = C1910g.f23824c;
        C1903I c1903i = c1904a.f23806a;
        c1903i.h(c1910g);
        AbstractC4828h.m0(c1903i, 0, abstractC1702b0);
        AbstractC4828h.m0(c1903i, 1, abstractC1738u);
        AbstractC4828h.m0(c1903i, 3, abstractC1704c02);
        AbstractC4828h.m0(c1903i, 2, abstractC1704c0);
        int i10 = c1903i.f23804g;
        int i11 = c1910g.f23792a;
        int a5 = C1903I.a(c1903i, i11);
        int i12 = c1910g.f23793b;
        if (i10 == a5 && c1903i.f23805h == C1903I.a(c1903i, i12)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (((1 << i14) & c1903i.f23804g) != 0) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1910g.b(i14));
                i13++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            if (((1 << i16) & c1903i.f23805h) != 0) {
                if (i13 > 0) {
                    u10.append(", ");
                }
                u10.append(c1910g.c(i16));
                i15++;
            }
        }
        String sb4 = u10.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(c1910g);
        sb5.append(". Not all arguments were provided. Missing ");
        android.gov.nist.core.a.x(sb5, i13, " int arguments (", sb3, ") and ");
        throw new IllegalStateException(R.a.s(sb5, i15, " object arguments (", sb4, ").").toString());
    }

    public final void c(C3289b c3289b, C1705d c1705d) {
        f();
        C1904a c1904a = this.f23808b;
        c1904a.getClass();
        C1912i c1912i = C1912i.f23826c;
        C1903I c1903i = c1904a.f23806a;
        c1903i.h(c1912i);
        AbstractC4828h.m0(c1903i, 0, c3289b);
        AbstractC4828h.m0(c1903i, 1, c1705d);
        int i10 = c1903i.f23804g;
        int i11 = c1912i.f23792a;
        int a5 = C1903I.a(c1903i, i11);
        int i12 = c1912i.f23793b;
        if (i10 == a5 && c1903i.f23805h == C1903I.a(c1903i, i12)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (((1 << i14) & c1903i.f23804g) != 0) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1912i.b(i14));
                i13++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            if (((1 << i16) & c1903i.f23805h) != 0) {
                if (i13 > 0) {
                    u10.append(", ");
                }
                u10.append(c1912i.c(i16));
                i15++;
            }
        }
        String sb4 = u10.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(c1912i);
        sb5.append(". Not all arguments were provided. Missing ");
        android.gov.nist.core.a.x(sb5, i13, " int arguments (", sb3, ") and ");
        throw new IllegalStateException(R.a.s(sb5, i15, " object arguments (", sb4, ").").toString());
    }

    public final void d(C1904a c1904a, C3289b c3289b) {
        C1904a c1904a2 = this.f23808b;
        c1904a2.getClass();
        if (c1904a.f23806a.e()) {
            C1908e c1908e = C1908e.f23822c;
            C1903I c1903i = c1904a2.f23806a;
            c1903i.h(c1908e);
            AbstractC4828h.m0(c1903i, 0, c1904a);
            AbstractC4828h.m0(c1903i, 1, c3289b);
            int i10 = c1903i.f23804g;
            int i11 = c1908e.f23792a;
            int a5 = C1903I.a(c1903i, i11);
            int i12 = c1908e.f23793b;
            if (i10 != a5 || c1903i.f23805h != C1903I.a(c1903i, i12)) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    if (((1 << i14) & c1903i.f23804g) != 0) {
                        if (i13 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(c1908e.b(i14));
                        i13++;
                    }
                }
                String sb3 = sb2.toString();
                StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
                int i15 = 0;
                for (int i16 = 0; i16 < i12; i16++) {
                    if (((1 << i16) & c1903i.f23805h) != 0) {
                        if (i13 > 0) {
                            u10.append(", ");
                        }
                        u10.append(c1908e.c(i16));
                        i15++;
                    }
                }
                String sb4 = u10.toString();
                AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(c1908e);
                sb5.append(". Not all arguments were provided. Missing ");
                android.gov.nist.core.a.x(sb5, i13, " int arguments (", sb3, ") and ");
                throw new IllegalStateException(R.a.s(sb5, i15, " object arguments (", sb4, ").").toString());
            }
        }
    }

    public final void e() {
        ArrayList arrayList;
        k1 k1Var = this.f23814h;
        if (!k1Var.f22652a.isEmpty()) {
            k1Var.f22652a.remove(arrayList.size() - 1);
            return;
        }
        this.f23813g++;
    }

    public final void f() {
        boolean z10;
        C1905b c1905b = this;
        int i10 = c1905b.f23813g;
        int i11 = 0;
        if (i10 > 0) {
            C1904a c1904a = c1905b.f23808b;
            c1904a.getClass();
            C1899E c1899e = C1899E.f23790c;
            C1903I c1903i = c1904a.f23806a;
            c1903i.h(c1899e);
            AbstractC4828h.l0(c1903i, 0, i10);
            int i12 = c1903i.f23804g;
            int i13 = c1899e.f23792a;
            int a5 = C1903I.a(c1903i, i13);
            int i14 = c1899e.f23793b;
            if (i12 == a5 && c1903i.f23805h == C1903I.a(c1903i, i14)) {
                c1905b.f23813g = 0;
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i15 = 0;
                while (i15 < i13) {
                    int i16 = i13;
                    if (((1 << i15) & c1903i.f23804g) != 0) {
                        if (i11 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(c1899e.b(i15));
                        i11++;
                    }
                    i15++;
                    i13 = i16;
                }
                String sb3 = sb2.toString();
                StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
                int i17 = 0;
                int i18 = 0;
                while (i18 < i14) {
                    int i19 = i14;
                    if (((1 << i18) & c1903i.f23805h) != 0) {
                        if (i11 > 0) {
                            u10.append(", ");
                        }
                        u10.append(c1899e.c(i18));
                        i17++;
                    }
                    i18++;
                    i14 = i19;
                }
                String sb4 = u10.toString();
                AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(c1899e);
                sb5.append(". Not all arguments were provided. Missing ");
                android.gov.nist.core.a.x(sb5, i11, " int arguments (", sb3, ") and ");
                throw new IllegalStateException(R.a.s(sb5, i17, " object arguments (", sb4, ").").toString());
            }
        } else {
            c1905b = this;
        }
        k1 k1Var = c1905b.f23814h;
        if (!k1Var.f22652a.isEmpty()) {
            C1904a c1904a2 = c1905b.f23808b;
            ArrayList arrayList = k1Var.f22652a;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i20 = 0; i20 < size; i20++) {
                objArr[i20] = arrayList.get(i20);
            }
            c1904a2.getClass();
            if (size == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                j jVar = j.f23827c;
                C1903I c1903i2 = c1904a2.f23806a;
                c1903i2.h(jVar);
                AbstractC4828h.m0(c1903i2, 0, objArr);
                int i21 = c1903i2.f23804g;
                int i22 = jVar.f23792a;
                int a10 = C1903I.a(c1903i2, i22);
                int i23 = jVar.f23793b;
                if (i21 != a10 || c1903i2.f23805h != C1903I.a(c1903i2, i23)) {
                    StringBuilder sb6 = new StringBuilder();
                    int i24 = 0;
                    for (int i25 = 0; i25 < i22; i25++) {
                        if (((1 << i25) & c1903i2.f23804g) != 0) {
                            if (i24 > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(jVar.b(i25));
                            i24++;
                        }
                    }
                    String sb7 = sb6.toString();
                    StringBuilder u11 = R.a.u("StringBuilder().apply(builderAction).toString()", sb7);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < i23) {
                        int i28 = i23;
                        if (((1 << i26) & c1903i2.f23805h) != 0) {
                            if (i24 > 0) {
                                u11.append(", ");
                            }
                            u11.append(jVar.c(i26));
                            i27++;
                        }
                        i26++;
                        i23 = i28;
                    }
                    String sb8 = u11.toString();
                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb8);
                    StringBuilder sb9 = new StringBuilder("Error while pushing ");
                    sb9.append(jVar);
                    sb9.append(". Not all arguments were provided. Missing ");
                    android.gov.nist.core.a.x(sb9, i24, " int arguments (", sb7, ") and ");
                    throw new IllegalStateException(R.a.s(sb9, i27, " object arguments (", sb8, ").").toString());
                }
            }
            arrayList.clear();
        }
    }

    public final void g() {
        int i10 = this.f23818l;
        if (i10 > 0) {
            int i11 = this.f23815i;
            if (i11 >= 0) {
                f();
                C1904a c1904a = this.f23808b;
                c1904a.getClass();
                x xVar = x.f23841c;
                C1903I c1903i = c1904a.f23806a;
                c1903i.h(xVar);
                AbstractC4828h.l0(c1903i, 0, i11);
                AbstractC4828h.l0(c1903i, 1, i10);
                int i12 = c1903i.f23804g;
                int i13 = xVar.f23792a;
                int a5 = C1903I.a(c1903i, i13);
                int i14 = xVar.f23793b;
                if (i12 == a5 && c1903i.f23805h == C1903I.a(c1903i, i14)) {
                    this.f23815i = -1;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i13) {
                        int i17 = i13;
                        if (((1 << i15) & c1903i.f23804g) != 0) {
                            if (i16 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(xVar.b(i15));
                            i16++;
                        }
                        i15++;
                        i13 = i17;
                    }
                    String sb3 = sb2.toString();
                    StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
                    int i18 = 0;
                    int i19 = 0;
                    while (i19 < i14) {
                        int i20 = i14;
                        if (((1 << i19) & c1903i.f23805h) != 0) {
                            if (i16 > 0) {
                                u10.append(", ");
                            }
                            u10.append(xVar.c(i19));
                            i18++;
                        }
                        i19++;
                        i14 = i20;
                    }
                    String sb4 = u10.toString();
                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(xVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    android.gov.nist.core.a.x(sb5, i16, " int arguments (", sb3, ") and ");
                    throw new IllegalStateException(R.a.s(sb5, i18, " object arguments (", sb4, ").").toString());
                }
            } else {
                int i21 = this.f23817k;
                int i22 = this.f23816j;
                f();
                C1904a c1904a2 = this.f23808b;
                c1904a2.getClass();
                t tVar = t.f23837c;
                C1903I c1903i2 = c1904a2.f23806a;
                c1903i2.h(tVar);
                AbstractC4828h.l0(c1903i2, 1, i21);
                AbstractC4828h.l0(c1903i2, 0, i22);
                AbstractC4828h.l0(c1903i2, 2, i10);
                int i23 = c1903i2.f23804g;
                int i24 = tVar.f23792a;
                int a10 = C1903I.a(c1903i2, i24);
                int i25 = tVar.f23793b;
                if (i23 == a10 && c1903i2.f23805h == C1903I.a(c1903i2, i25)) {
                    this.f23816j = -1;
                    this.f23817k = -1;
                } else {
                    int i26 = 0;
                    StringBuilder sb6 = new StringBuilder();
                    for (int i27 = 0; i27 < i24; i27++) {
                        if (((1 << i27) & c1903i2.f23804g) != 0) {
                            if (i26 > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(tVar.b(i27));
                            i26++;
                        }
                    }
                    String sb7 = sb6.toString();
                    StringBuilder u11 = R.a.u("StringBuilder().apply(builderAction).toString()", sb7);
                    int i28 = 0;
                    int i29 = 0;
                    while (i29 < i25) {
                        int i30 = i25;
                        if (((1 << i29) & c1903i2.f23805h) != 0) {
                            if (i26 > 0) {
                                u11.append(", ");
                            }
                            u11.append(tVar.c(i29));
                            i28++;
                        }
                        i29++;
                        i25 = i30;
                    }
                    String sb8 = u11.toString();
                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb8);
                    StringBuilder sb9 = new StringBuilder("Error while pushing ");
                    sb9.append(tVar);
                    sb9.append(". Not all arguments were provided. Missing ");
                    android.gov.nist.core.a.x(sb9, i26, " int arguments (", sb7, ") and ");
                    throw new IllegalStateException(R.a.s(sb9, i28, " object arguments (", sb8, ").").toString());
                }
            }
            this.f23818l = 0;
        }
    }

    public final void h(boolean z10) {
        int i10;
        Z.r rVar = this.f23807a;
        if (z10) {
            i10 = rVar.f22686F.f22516i;
        } else {
            i10 = rVar.f22686F.f22514g;
        }
        int i11 = i10 - this.f23812f;
        if (i11 >= 0) {
            if (i11 > 0) {
                C1904a c1904a = this.f23808b;
                c1904a.getClass();
                C1907d c1907d = C1907d.f23821c;
                C1903I c1903i = c1904a.f23806a;
                c1903i.h(c1907d);
                AbstractC4828h.l0(c1903i, 0, i11);
                int i12 = c1903i.f23804g;
                int i13 = c1907d.f23792a;
                int a5 = C1903I.a(c1903i, i13);
                int i14 = c1907d.f23793b;
                if (i12 == a5 && c1903i.f23805h == C1903I.a(c1903i, i14)) {
                    this.f23812f = i10;
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                int i15 = 0;
                for (int i16 = 0; i16 < i13; i16++) {
                    if (((1 << i16) & c1903i.f23804g) != 0) {
                        if (i15 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(c1907d.b(i16));
                        i15++;
                    }
                }
                String sb3 = sb2.toString();
                StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
                int i17 = 0;
                for (int i18 = 0; i18 < i14; i18++) {
                    if (((1 << i18) & c1903i.f23805h) != 0) {
                        if (i15 > 0) {
                            u10.append(", ");
                        }
                        u10.append(c1907d.c(i18));
                        i17++;
                    }
                }
                String sb4 = u10.toString();
                AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(c1907d);
                sb5.append(". Not all arguments were provided. Missing ");
                android.gov.nist.core.a.x(sb5, i15, " int arguments (", sb3, ") and ");
                throw new IllegalStateException(R.a.s(sb5, i17, " object arguments (", sb4, ").").toString());
            }
            return;
        }
        AbstractC1734s.j("Tried to seek backward".toString());
        throw null;
    }

    public final void i(int i10, int i11) {
        if (i11 > 0) {
            if (i10 >= 0) {
                if (this.f23815i == i10) {
                    this.f23818l += i11;
                    return;
                }
                g();
                this.f23815i = i10;
                this.f23818l = i11;
                return;
            }
            AbstractC1734s.j(("Invalid remove index " + i10).toString());
            throw null;
        }
    }
}
