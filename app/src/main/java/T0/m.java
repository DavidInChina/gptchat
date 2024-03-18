package T0;

import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.AbstractC2020f0;
import androidx.datastore.preferences.protobuf.AbstractC2022g0;
import androidx.datastore.preferences.protobuf.AbstractC2025j;
import androidx.datastore.preferences.protobuf.AbstractC2028m;
import androidx.datastore.preferences.protobuf.C2014c0;
import androidx.datastore.preferences.protobuf.F0;
import androidx.datastore.preferences.protobuf.P;
import androidx.glance.appwidget.protobuf.AbstractC2042b;
import androidx.glance.appwidget.protobuf.AbstractC2049i;
import androidx.glance.appwidget.protobuf.AbstractC2053m;
import androidx.glance.appwidget.protobuf.C2057q;
import androidx.glance.appwidget.protobuf.b0;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2504f1;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2536r0;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.AbstractC2546w0;
import com.google.protobuf.B0;
import com.google.protobuf.C2495c1;
import com.google.protobuf.C2506g0;
import com.google.protobuf.C2514j;
import com.google.protobuf.C2540t0;
import com.google.protobuf.C2551z;
import com.google.protobuf.J;
import com.google.protobuf.N1;
import com.google.protobuf.U;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements AbstractC2020f0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16796a;

    /* renamed from: b  reason: collision with root package name */
    public int f16797b;

    /* renamed from: c  reason: collision with root package name */
    public int f16798c;

    /* renamed from: d  reason: collision with root package name */
    public int f16799d;

    /* renamed from: e  reason: collision with root package name */
    public Object f16800e;

    public m(char[] cArr, int i10, int i11) {
        this.f16796a = 0;
        this.f16797b = cArr.length;
        this.f16800e = cArr;
        this.f16798c = i10;
        this.f16799d = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void A(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 2) {
                    if (i10 == 5) {
                        do {
                            list.add(Float.valueOf(((AbstractC2028m) this.f16800e).l()));
                            if (!((AbstractC2028m) this.f16800e).c()) {
                                u10 = ((AbstractC2028m) this.f16800e).u();
                            } else {
                                return;
                            }
                        } while (u10 == this.f16797b);
                        this.f16799d = u10;
                        return;
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                int v10 = ((AbstractC2028m) this.f16800e).v();
                if ((v10 & 3) == 0) {
                    int b10 = ((AbstractC2028m) this.f16800e).b() + v10;
                    do {
                        list.add(Float.valueOf(((AbstractC2028m) this.f16800e).l()));
                    } while (((AbstractC2028m) this.f16800e).b() < b10);
                    return;
                }
                throw androidx.datastore.preferences.protobuf.D.e();
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 2) {
                    if (i11 == 5) {
                        do {
                            list.add(Float.valueOf(((AbstractC2053m) this.f16800e).l()));
                            if (!((AbstractC2053m) this.f16800e).c()) {
                                u11 = ((AbstractC2053m) this.f16800e).u();
                            } else {
                                return;
                            }
                        } while (u11 == this.f16797b);
                        this.f16799d = u11;
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                int v11 = ((AbstractC2053m) this.f16800e).v();
                h0(v11);
                int b11 = v11 + ((AbstractC2053m) this.f16800e).b();
                do {
                    list.add(Float.valueOf(((AbstractC2053m) this.f16800e).l()));
                } while (((AbstractC2053m) this.f16800e).b() < b11);
                return;
            default:
                if (list instanceof U) {
                    U u12 = (U) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 2) {
                        if (i12 == 5) {
                            do {
                                u12.s(((AbstractC2543v) this.f16800e).s());
                                if (!((AbstractC2543v) this.f16800e).g()) {
                                    F11 = ((AbstractC2543v) this.f16800e).F();
                                } else {
                                    return;
                                }
                            } while (F11 == this.f16797b);
                            this.f16799d = F11;
                            return;
                        }
                        throw C2540t0.c();
                    }
                    int G10 = ((AbstractC2543v) this.f16800e).G();
                    h0(G10);
                    int f6 = ((AbstractC2543v) this.f16800e).f() + G10;
                    do {
                        u12.s(((AbstractC2543v) this.f16800e).s());
                    } while (((AbstractC2543v) this.f16800e).f() < f6);
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 2) {
                    if (i13 == 5) {
                        do {
                            list.add(Float.valueOf(((AbstractC2543v) this.f16800e).s()));
                            if (!((AbstractC2543v) this.f16800e).g()) {
                                F10 = ((AbstractC2543v) this.f16800e).F();
                            } else {
                                return;
                            }
                        } while (F10 == this.f16797b);
                        this.f16799d = F10;
                        return;
                    }
                    throw C2540t0.c();
                }
                int G11 = ((AbstractC2543v) this.f16800e).G();
                h0(G11);
                int f10 = G11 + ((AbstractC2543v) this.f16800e).f();
                do {
                    list.add(Float.valueOf(((AbstractC2543v) this.f16800e).s()));
                } while (((AbstractC2543v) this.f16800e).f() < f10);
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int B() {
        switch (this.f16796a) {
            case 1:
                f0(0);
                return ((AbstractC2028m) this.f16800e).m();
            case 2:
                e0(0);
                return ((AbstractC2053m) this.f16800e).m();
            default:
                e0(0);
                return ((AbstractC2543v) this.f16800e).u();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void C(List list, AbstractC2022g0 abstractC2022g0, androidx.datastore.preferences.protobuf.r rVar) {
        int u10;
        int i10 = this.f16797b;
        if ((i10 & 7) == 3) {
            do {
                list.add(Y(abstractC2022g0, rVar));
                if (!((AbstractC2028m) this.f16800e).c() && this.f16799d == 0) {
                    u10 = ((AbstractC2028m) this.f16800e).u();
                } else {
                    return;
                }
            } while (u10 == i10);
            this.f16799d = u10;
            return;
        }
        throw androidx.datastore.preferences.protobuf.D.b();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int D() {
        switch (this.f16796a) {
            case 1:
                f0(5);
                return ((AbstractC2028m) this.f16800e).o();
            case 2:
                e0(5);
                return ((AbstractC2053m) this.f16800e).o();
            default:
                e0(5);
                return ((AbstractC2543v) this.f16800e).z();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void E(List list) {
        int u10;
        int u11;
        int F10;
        switch (this.f16796a) {
            case 1:
                if ((this.f16797b & 7) == 2) {
                    do {
                        list.add(z());
                        if (!((AbstractC2028m) this.f16800e).c()) {
                            u10 = ((AbstractC2028m) this.f16800e).u();
                        } else {
                            return;
                        }
                    } while (u10 == this.f16797b);
                    this.f16799d = u10;
                    return;
                }
                throw androidx.datastore.preferences.protobuf.D.b();
            case 2:
                if ((this.f16797b & 7) == 2) {
                    do {
                        list.add(U());
                        if (!((AbstractC2053m) this.f16800e).c()) {
                            u11 = ((AbstractC2053m) this.f16800e).u();
                        } else {
                            return;
                        }
                    } while (u11 == this.f16797b);
                    this.f16799d = u11;
                    return;
                }
                throw androidx.glance.appwidget.protobuf.C.b();
            default:
                if ((this.f16797b & 7) == 2) {
                    do {
                        list.add(V());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F10 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F10 == this.f16797b);
                    this.f16799d = F10;
                    return;
                }
                throw C2540t0.c();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void F(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int v10 = ((AbstractC2028m) this.f16800e).v();
                        if ((v10 & 7) == 0) {
                            int b10 = ((AbstractC2028m) this.f16800e).b() + v10;
                            do {
                                list.add(Double.valueOf(((AbstractC2028m) this.f16800e).h()));
                            } while (((AbstractC2028m) this.f16800e).b() < b10);
                            return;
                        }
                        throw androidx.datastore.preferences.protobuf.D.e();
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                do {
                    list.add(Double.valueOf(((AbstractC2028m) this.f16800e).h()));
                    if (!((AbstractC2028m) this.f16800e).c()) {
                        u10 = ((AbstractC2028m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u10 == this.f16797b);
                this.f16799d = u10;
                return;
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 1) {
                    if (i11 == 2) {
                        int v11 = ((AbstractC2053m) this.f16800e).v();
                        i0(v11);
                        int b11 = ((AbstractC2053m) this.f16800e).b() + v11;
                        do {
                            list.add(Double.valueOf(((AbstractC2053m) this.f16800e).h()));
                        } while (((AbstractC2053m) this.f16800e).b() < b11);
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                do {
                    list.add(Double.valueOf(((AbstractC2053m) this.f16800e).h()));
                    if (!((AbstractC2053m) this.f16800e).c()) {
                        u11 = ((AbstractC2053m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u11 == this.f16797b);
                this.f16799d = u11;
                return;
            default:
                if (list instanceof C2551z) {
                    C2551z c2551z = (C2551z) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 1) {
                        if (i12 == 2) {
                            int G10 = ((AbstractC2543v) this.f16800e).G();
                            i0(G10);
                            int f6 = ((AbstractC2543v) this.f16800e).f() + G10;
                            do {
                                c2551z.s(((AbstractC2543v) this.f16800e).o());
                            } while (((AbstractC2543v) this.f16800e).f() < f6);
                            return;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        c2551z.s(((AbstractC2543v) this.f16800e).o());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F11 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F11 == this.f16797b);
                    this.f16799d = F11;
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 1) {
                    if (i13 == 2) {
                        int G11 = ((AbstractC2543v) this.f16800e).G();
                        i0(G11);
                        int f10 = ((AbstractC2543v) this.f16800e).f() + G11;
                        do {
                            list.add(Double.valueOf(((AbstractC2543v) this.f16800e).o()));
                        } while (((AbstractC2543v) this.f16800e).f() < f10);
                        return;
                    }
                    throw C2540t0.c();
                }
                do {
                    list.add(Double.valueOf(((AbstractC2543v) this.f16800e).o()));
                    if (!((AbstractC2543v) this.f16800e).g()) {
                        F10 = ((AbstractC2543v) this.f16800e).F();
                    } else {
                        return;
                    }
                } while (F10 == this.f16797b);
                this.f16799d = F10;
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void G(List list, AbstractC2022g0 abstractC2022g0, androidx.datastore.preferences.protobuf.r rVar) {
        int u10;
        int i10 = this.f16797b;
        if ((i10 & 7) == 2) {
            do {
                list.add(a0(abstractC2022g0, rVar));
                if (!((AbstractC2028m) this.f16800e).c() && this.f16799d == 0) {
                    u10 = ((AbstractC2028m) this.f16800e).u();
                } else {
                    return;
                }
            } while (u10 == i10);
            this.f16799d = u10;
            return;
        }
        throw androidx.datastore.preferences.protobuf.D.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        ((androidx.datastore.preferences.protobuf.AbstractC2028m) r7.f16800e).d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(P p10, U3.i iVar, androidx.datastore.preferences.protobuf.r rVar) {
        f0(2);
        int e10 = ((AbstractC2028m) this.f16800e).e(((AbstractC2028m) this.f16800e).v());
        Object obj = iVar.f17415Z;
        Object obj2 = iVar.f17417i0;
        while (true) {
            try {
                int w10 = w();
                if (w10 == Integer.MAX_VALUE || ((AbstractC2028m) this.f16800e).c()) {
                    break;
                } else if (w10 != 1) {
                    if (w10 != 2) {
                        try {
                            if (!g0()) {
                                throw new IOException("Unable to parse map entry.");
                                break;
                            }
                        } catch (androidx.datastore.preferences.protobuf.C unused) {
                            if (!g0()) {
                                throw new IOException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = X((F0) iVar.f17416h0, iVar.f17417i0.getClass(), rVar);
                    }
                } else {
                    obj = X((F0) iVar.f17414Y, null, null);
                }
            } catch (Throwable th2) {
                ((AbstractC2028m) this.f16800e).d(e10);
                throw th2;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final long I() {
        switch (this.f16796a) {
            case 1:
                f0(0);
                return ((AbstractC2028m) this.f16800e).n();
            case 2:
                e0(0);
                return ((AbstractC2053m) this.f16800e).n();
            default:
                e0(0);
                return ((AbstractC2543v) this.f16800e).v();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final String J() {
        switch (this.f16796a) {
            case 1:
                f0(2);
                return ((AbstractC2028m) this.f16800e).t();
            case 2:
                e0(2);
                return ((AbstractC2053m) this.f16800e).t();
            default:
                e0(2);
                return ((AbstractC2543v) this.f16800e).E();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void K(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int v10 = ((AbstractC2028m) this.f16800e).v();
                        if ((v10 & 7) == 0) {
                            int b10 = ((AbstractC2028m) this.f16800e).b() + v10;
                            do {
                                list.add(Long.valueOf(((AbstractC2028m) this.f16800e).k()));
                            } while (((AbstractC2028m) this.f16800e).b() < b10);
                            return;
                        }
                        throw androidx.datastore.preferences.protobuf.D.e();
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2028m) this.f16800e).k()));
                    if (!((AbstractC2028m) this.f16800e).c()) {
                        u10 = ((AbstractC2028m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u10 == this.f16797b);
                this.f16799d = u10;
                return;
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 1) {
                    if (i11 == 2) {
                        int v11 = ((AbstractC2053m) this.f16800e).v();
                        i0(v11);
                        int b11 = ((AbstractC2053m) this.f16800e).b() + v11;
                        do {
                            list.add(Long.valueOf(((AbstractC2053m) this.f16800e).k()));
                        } while (((AbstractC2053m) this.f16800e).b() < b11);
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2053m) this.f16800e).k()));
                    if (!((AbstractC2053m) this.f16800e).c()) {
                        u11 = ((AbstractC2053m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u11 == this.f16797b);
                this.f16799d = u11;
                return;
            default:
                if (list instanceof B0) {
                    B0 b02 = (B0) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 1) {
                        if (i12 == 2) {
                            int G10 = ((AbstractC2543v) this.f16800e).G();
                            i0(G10);
                            int f6 = ((AbstractC2543v) this.f16800e).f() + G10;
                            do {
                                b02.s(((AbstractC2543v) this.f16800e).r());
                            } while (((AbstractC2543v) this.f16800e).f() < f6);
                            return;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        b02.s(((AbstractC2543v) this.f16800e).r());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F11 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F11 == this.f16797b);
                    this.f16799d = F11;
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 1) {
                    if (i13 == 2) {
                        int G11 = ((AbstractC2543v) this.f16800e).G();
                        i0(G11);
                        int f10 = ((AbstractC2543v) this.f16800e).f() + G11;
                        do {
                            list.add(Long.valueOf(((AbstractC2543v) this.f16800e).r()));
                        } while (((AbstractC2543v) this.f16800e).f() < f10);
                        return;
                    }
                    throw C2540t0.c();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2543v) this.f16800e).r()));
                    if (!((AbstractC2543v) this.f16800e).g()) {
                        F10 = ((AbstractC2543v) this.f16800e).F();
                    } else {
                        return;
                    }
                } while (F10 == this.f16797b);
                this.f16799d = F10;
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final Object L(AbstractC2022g0 abstractC2022g0, androidx.datastore.preferences.protobuf.r rVar) {
        f0(3);
        return Y(abstractC2022g0, rVar);
    }

    public final int M() {
        return this.f16799d - this.f16798c;
    }

    public final void N(AbstractC2042b abstractC2042b, b0 b0Var, C2057q c2057q) {
        e0(3);
        P(abstractC2042b, b0Var, c2057q);
    }

    public final void O(Object obj, AbstractC2504f1 abstractC2504f1, J j6) {
        e0(3);
        Q(obj, abstractC2504f1, j6);
    }

    public final void P(Object obj, b0 b0Var, C2057q c2057q) {
        int i10 = this.f16798c;
        this.f16798c = ((this.f16797b >>> 3) << 3) | 4;
        try {
            b0Var.i(obj, this, c2057q);
            if (this.f16797b == this.f16798c) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.f16798c = i10;
        }
    }

    public final void Q(Object obj, AbstractC2504f1 abstractC2504f1, J j6) {
        int i10 = this.f16798c;
        this.f16798c = ((this.f16797b >>> 3) << 3) | 4;
        try {
            abstractC2504f1.i(obj, this, j6);
            if (this.f16797b == this.f16798c) {
                return;
            }
            throw C2540t0.f();
        } finally {
            this.f16798c = i10;
        }
    }

    public final void R(Object obj, b0 b0Var, C2057q c2057q) {
        AbstractC2053m abstractC2053m;
        int v10 = ((AbstractC2053m) this.f16800e).v();
        AbstractC2053m abstractC2053m2 = (AbstractC2053m) this.f16800e;
        if (abstractC2053m2.f25244a < abstractC2053m2.f25245b) {
            int e10 = abstractC2053m2.e(v10);
            ((AbstractC2053m) this.f16800e).f25244a++;
            b0Var.i(obj, this, c2057q);
            ((AbstractC2053m) this.f16800e).a(0);
            abstractC2053m.f25244a--;
            ((AbstractC2053m) this.f16800e).d(e10);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void S(Object obj, AbstractC2504f1 abstractC2504f1, J j6) {
        AbstractC2543v abstractC2543v;
        int G10 = ((AbstractC2543v) this.f16800e).G();
        AbstractC2543v abstractC2543v2 = (AbstractC2543v) this.f16800e;
        if (abstractC2543v2.f27622a < abstractC2543v2.f27623b) {
            int l10 = abstractC2543v2.l(G10);
            ((AbstractC2543v) this.f16800e).f27622a++;
            abstractC2504f1.i(obj, this, j6);
            ((AbstractC2543v) this.f16800e).a(0);
            abstractC2543v.f27622a--;
            ((AbstractC2543v) this.f16800e).k(l10);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final io.sentry.android.core.internal.threaddump.a T() {
        int i10 = this.f16799d;
        if (i10 >= this.f16797b && i10 < this.f16798c) {
            this.f16799d = i10 + 1;
            return (io.sentry.android.core.internal.threaddump.a) ((ArrayList) this.f16800e).get(i10);
        }
        return null;
    }

    public final AbstractC2049i U() {
        e0(2);
        return ((AbstractC2053m) this.f16800e).g();
    }

    public final AbstractC2534q V() {
        e0(2);
        return ((AbstractC2543v) this.f16800e).n();
    }

    public final Object W(N1 n12, Class cls, J j6) {
        switch (n12.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(I());
            case 3:
                return Long.valueOf(c());
            case 4:
                return Integer.valueOf(B());
            case 5:
                return Long.valueOf(d());
            case 6:
                return Integer.valueOf(h());
            case 7:
                return Boolean.valueOf(i());
            case 8:
                return J();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return Z(cls, j6);
            case 11:
                return V();
            case 12:
                return Integer.valueOf(l());
            case 13:
                return Integer.valueOf(q());
            case 14:
                return Integer.valueOf(D());
            case 15:
                return Long.valueOf(j());
            case 16:
                return Integer.valueOf(s());
            case 17:
                return Long.valueOf(t());
        }
    }

    public final Object X(F0 f02, Class cls, androidx.datastore.preferences.protobuf.r rVar) {
        switch (f02.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(I());
            case 3:
                return Long.valueOf(c());
            case 4:
                return Integer.valueOf(B());
            case 5:
                return Long.valueOf(d());
            case 6:
                return Integer.valueOf(h());
            case 7:
                return Boolean.valueOf(i());
            case 8:
                return J();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                f0(2);
                return a0(C2014c0.f25030c.a(cls), rVar);
            case 11:
                return z();
            case 12:
                return Integer.valueOf(l());
            case 13:
                return Integer.valueOf(q());
            case 14:
                return Integer.valueOf(D());
            case 15:
                return Long.valueOf(j());
            case 16:
                return Integer.valueOf(s());
            case 17:
                return Long.valueOf(t());
        }
    }

    public final Object Y(AbstractC2022g0 abstractC2022g0, androidx.datastore.preferences.protobuf.r rVar) {
        int i10 = this.f16798c;
        this.f16798c = ((this.f16797b >>> 3) << 3) | 4;
        try {
            Object g10 = abstractC2022g0.g();
            abstractC2022g0.h(g10, this, rVar);
            abstractC2022g0.d(g10);
            if (this.f16797b == this.f16798c) {
                return g10;
            }
            throw androidx.datastore.preferences.protobuf.D.e();
        } finally {
            this.f16798c = i10;
        }
    }

    public final Object Z(Class cls, J j6) {
        e0(2);
        AbstractC2504f1 a5 = C2495c1.f27531c.a(cls);
        AbstractC2497d0 g10 = a5.g();
        S(g10, a5, j6);
        a5.d(g10);
        return g10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final Object a(AbstractC2022g0 abstractC2022g0, androidx.datastore.preferences.protobuf.r rVar) {
        f0(2);
        return a0(abstractC2022g0, rVar);
    }

    public final Object a0(AbstractC2022g0 abstractC2022g0, androidx.datastore.preferences.protobuf.r rVar) {
        AbstractC2028m abstractC2028m;
        int v10 = ((AbstractC2028m) this.f16800e).v();
        AbstractC2028m abstractC2028m2 = (AbstractC2028m) this.f16800e;
        if (abstractC2028m2.f25081a < abstractC2028m2.f25082b) {
            int e10 = abstractC2028m2.e(v10);
            Object g10 = abstractC2022g0.g();
            ((AbstractC2028m) this.f16800e).f25081a++;
            abstractC2022g0.h(g10, this, rVar);
            abstractC2022g0.d(g10);
            ((AbstractC2028m) this.f16800e).a(0);
            abstractC2028m.f25081a--;
            ((AbstractC2028m) this.f16800e).d(e10);
            return g10;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void b(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int b10 = ((AbstractC2028m) this.f16800e).b() + ((AbstractC2028m) this.f16800e).v();
                        do {
                            list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).q()));
                        } while (((AbstractC2028m) this.f16800e).b() < b10);
                        d0(b10);
                        return;
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).q()));
                    if (!((AbstractC2028m) this.f16800e).c()) {
                        u10 = ((AbstractC2028m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u10 == this.f16797b);
                this.f16799d = u10;
                return;
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int b11 = ((AbstractC2053m) this.f16800e).b() + ((AbstractC2053m) this.f16800e).v();
                        do {
                            list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).q()));
                        } while (((AbstractC2053m) this.f16800e).b() < b11);
                        c0(b11);
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).q()));
                    if (!((AbstractC2053m) this.f16800e).c()) {
                        u11 = ((AbstractC2053m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u11 == this.f16797b);
                this.f16799d = u11;
                return;
            default:
                if (list instanceof C2506g0) {
                    C2506g0 c2506g0 = (C2506g0) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            int f6 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                            do {
                                c2506g0.s(((AbstractC2543v) this.f16800e).B());
                            } while (((AbstractC2543v) this.f16800e).f() < f6);
                            c0(f6);
                            return;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        c2506g0.s(((AbstractC2543v) this.f16800e).B());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F11 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F11 == this.f16797b);
                    this.f16799d = F11;
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 0) {
                    if (i13 == 2) {
                        int f10 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                        do {
                            list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).B()));
                        } while (((AbstractC2543v) this.f16800e).f() < f10);
                        c0(f10);
                        return;
                    }
                    throw C2540t0.c();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).B()));
                    if (!((AbstractC2543v) this.f16800e).g()) {
                        F10 = ((AbstractC2543v) this.f16800e).F();
                    } else {
                        return;
                    }
                } while (F10 == this.f16797b);
                this.f16799d = F10;
                return;
        }
    }

    public final void b0(List list, boolean z10) {
        String str;
        int u10;
        int u11;
        String str2;
        int u12;
        int u13;
        String str3;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                if ((this.f16797b & 7) == 2) {
                    if ((list instanceof androidx.datastore.preferences.protobuf.H) && !z10) {
                        androidx.datastore.preferences.protobuf.H h10 = (androidx.datastore.preferences.protobuf.H) list;
                        do {
                            h10.b0(z());
                            if (!((AbstractC2028m) this.f16800e).c()) {
                                u11 = ((AbstractC2028m) this.f16800e).u();
                            } else {
                                return;
                            }
                        } while (u11 == this.f16797b);
                        this.f16799d = u11;
                        return;
                    }
                    do {
                        if (z10) {
                            str = J();
                        } else {
                            str = v();
                        }
                        list.add(str);
                        if (!((AbstractC2028m) this.f16800e).c()) {
                            u10 = ((AbstractC2028m) this.f16800e).u();
                        } else {
                            return;
                        }
                    } while (u10 == this.f16797b);
                    this.f16799d = u10;
                    return;
                }
                throw androidx.datastore.preferences.protobuf.D.b();
            case 2:
                if ((this.f16797b & 7) == 2) {
                    if ((list instanceof androidx.glance.appwidget.protobuf.F) && !z10) {
                        androidx.glance.appwidget.protobuf.F f6 = (androidx.glance.appwidget.protobuf.F) list;
                        do {
                            f6.a0(U());
                            if (!((AbstractC2053m) this.f16800e).c()) {
                                u13 = ((AbstractC2053m) this.f16800e).u();
                            } else {
                                return;
                            }
                        } while (u13 == this.f16797b);
                        this.f16799d = u13;
                        return;
                    }
                    do {
                        if (z10) {
                            str2 = J();
                        } else {
                            str2 = v();
                        }
                        list.add(str2);
                        if (!((AbstractC2053m) this.f16800e).c()) {
                            u12 = ((AbstractC2053m) this.f16800e).u();
                        } else {
                            return;
                        }
                    } while (u12 == this.f16797b);
                    this.f16799d = u12;
                    return;
                }
                throw androidx.glance.appwidget.protobuf.C.b();
            default:
                if ((this.f16797b & 7) == 2) {
                    if ((list instanceof AbstractC2546w0) && !z10) {
                        AbstractC2546w0 abstractC2546w0 = (AbstractC2546w0) list;
                        do {
                            abstractC2546w0.J(V());
                            if (!((AbstractC2543v) this.f16800e).g()) {
                                F11 = ((AbstractC2543v) this.f16800e).F();
                            } else {
                                return;
                            }
                        } while (F11 == this.f16797b);
                        this.f16799d = F11;
                        return;
                    }
                    do {
                        if (z10) {
                            str3 = J();
                        } else {
                            str3 = v();
                        }
                        list.add(str3);
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F10 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F10 == this.f16797b);
                    this.f16799d = F10;
                    return;
                }
                throw C2540t0.c();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final long c() {
        switch (this.f16796a) {
            case 1:
                f0(0);
                return ((AbstractC2028m) this.f16800e).w();
            case 2:
                e0(0);
                return ((AbstractC2053m) this.f16800e).w();
            default:
                e0(0);
                return ((AbstractC2543v) this.f16800e).H();
        }
    }

    public final void c0(int i10) {
        switch (this.f16796a) {
            case 2:
                if (((AbstractC2053m) this.f16800e).b() == i10) {
                    return;
                }
                throw androidx.glance.appwidget.protobuf.C.e();
            default:
                if (((AbstractC2543v) this.f16800e).f() == i10) {
                    return;
                }
                throw C2540t0.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final long d() {
        switch (this.f16796a) {
            case 1:
                f0(1);
                return ((AbstractC2028m) this.f16800e).k();
            case 2:
                e0(1);
                return ((AbstractC2053m) this.f16800e).k();
            default:
                e0(1);
                return ((AbstractC2543v) this.f16800e).r();
        }
    }

    public final void d0(int i10) {
        if (((AbstractC2028m) this.f16800e).b() == i10) {
            return;
        }
        throw androidx.datastore.preferences.protobuf.D.f();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void e(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 2) {
                    if (i10 == 5) {
                        do {
                            list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).o()));
                            if (!((AbstractC2028m) this.f16800e).c()) {
                                u10 = ((AbstractC2028m) this.f16800e).u();
                            } else {
                                return;
                            }
                        } while (u10 == this.f16797b);
                        this.f16799d = u10;
                        return;
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                int v10 = ((AbstractC2028m) this.f16800e).v();
                if ((v10 & 3) == 0) {
                    int b10 = ((AbstractC2028m) this.f16800e).b() + v10;
                    do {
                        list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).o()));
                    } while (((AbstractC2028m) this.f16800e).b() < b10);
                    return;
                }
                throw androidx.datastore.preferences.protobuf.D.e();
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 2) {
                    if (i11 == 5) {
                        do {
                            list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).o()));
                            if (!((AbstractC2053m) this.f16800e).c()) {
                                u11 = ((AbstractC2053m) this.f16800e).u();
                            } else {
                                return;
                            }
                        } while (u11 == this.f16797b);
                        this.f16799d = u11;
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                int v11 = ((AbstractC2053m) this.f16800e).v();
                h0(v11);
                int b11 = v11 + ((AbstractC2053m) this.f16800e).b();
                do {
                    list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).o()));
                } while (((AbstractC2053m) this.f16800e).b() < b11);
                return;
            default:
                if (list instanceof C2506g0) {
                    C2506g0 c2506g0 = (C2506g0) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 2) {
                        if (i12 == 5) {
                            do {
                                c2506g0.s(((AbstractC2543v) this.f16800e).z());
                                if (!((AbstractC2543v) this.f16800e).g()) {
                                    F11 = ((AbstractC2543v) this.f16800e).F();
                                } else {
                                    return;
                                }
                            } while (F11 == this.f16797b);
                            this.f16799d = F11;
                            return;
                        }
                        throw C2540t0.c();
                    }
                    int G10 = ((AbstractC2543v) this.f16800e).G();
                    h0(G10);
                    int f6 = ((AbstractC2543v) this.f16800e).f() + G10;
                    do {
                        c2506g0.s(((AbstractC2543v) this.f16800e).z());
                    } while (((AbstractC2543v) this.f16800e).f() < f6);
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 2) {
                    if (i13 == 5) {
                        do {
                            list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).z()));
                            if (!((AbstractC2543v) this.f16800e).g()) {
                                F10 = ((AbstractC2543v) this.f16800e).F();
                            } else {
                                return;
                            }
                        } while (F10 == this.f16797b);
                        this.f16799d = F10;
                        return;
                    }
                    throw C2540t0.c();
                }
                int G11 = ((AbstractC2543v) this.f16800e).G();
                h0(G11);
                int f10 = G11 + ((AbstractC2543v) this.f16800e).f();
                do {
                    list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).z()));
                } while (((AbstractC2543v) this.f16800e).f() < f10);
                return;
        }
    }

    public final void e0(int i10) {
        switch (this.f16796a) {
            case 2:
                if ((this.f16797b & 7) == i10) {
                    return;
                }
                throw androidx.glance.appwidget.protobuf.C.b();
            default:
                if ((this.f16797b & 7) == i10) {
                    return;
                }
                throw C2540t0.c();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void f(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int b10 = ((AbstractC2028m) this.f16800e).b() + ((AbstractC2028m) this.f16800e).v();
                        do {
                            list.add(Long.valueOf(((AbstractC2028m) this.f16800e).r()));
                        } while (((AbstractC2028m) this.f16800e).b() < b10);
                        d0(b10);
                        return;
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2028m) this.f16800e).r()));
                    if (!((AbstractC2028m) this.f16800e).c()) {
                        u10 = ((AbstractC2028m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u10 == this.f16797b);
                this.f16799d = u10;
                return;
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int b11 = ((AbstractC2053m) this.f16800e).b() + ((AbstractC2053m) this.f16800e).v();
                        do {
                            list.add(Long.valueOf(((AbstractC2053m) this.f16800e).r()));
                        } while (((AbstractC2053m) this.f16800e).b() < b11);
                        c0(b11);
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2053m) this.f16800e).r()));
                    if (!((AbstractC2053m) this.f16800e).c()) {
                        u11 = ((AbstractC2053m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u11 == this.f16797b);
                this.f16799d = u11;
                return;
            default:
                if (list instanceof B0) {
                    B0 b02 = (B0) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            int f6 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                            do {
                                b02.s(((AbstractC2543v) this.f16800e).C());
                            } while (((AbstractC2543v) this.f16800e).f() < f6);
                            c0(f6);
                            return;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        b02.s(((AbstractC2543v) this.f16800e).C());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F11 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F11 == this.f16797b);
                    this.f16799d = F11;
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 0) {
                    if (i13 == 2) {
                        int f10 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                        do {
                            list.add(Long.valueOf(((AbstractC2543v) this.f16800e).C()));
                        } while (((AbstractC2543v) this.f16800e).f() < f10);
                        c0(f10);
                        return;
                    }
                    throw C2540t0.c();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2543v) this.f16800e).C()));
                    if (!((AbstractC2543v) this.f16800e).g()) {
                        F10 = ((AbstractC2543v) this.f16800e).F();
                    } else {
                        return;
                    }
                } while (F10 == this.f16797b);
                this.f16799d = F10;
                return;
        }
    }

    public final void f0(int i10) {
        if ((this.f16797b & 7) == i10) {
            return;
        }
        throw androidx.datastore.preferences.protobuf.D.b();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void g(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int b10 = ((AbstractC2028m) this.f16800e).b() + ((AbstractC2028m) this.f16800e).v();
                        do {
                            list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).v()));
                        } while (((AbstractC2028m) this.f16800e).b() < b10);
                        d0(b10);
                        return;
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).v()));
                    if (!((AbstractC2028m) this.f16800e).c()) {
                        u10 = ((AbstractC2028m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u10 == this.f16797b);
                this.f16799d = u10;
                return;
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int b11 = ((AbstractC2053m) this.f16800e).b() + ((AbstractC2053m) this.f16800e).v();
                        do {
                            list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).v()));
                        } while (((AbstractC2053m) this.f16800e).b() < b11);
                        c0(b11);
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).v()));
                    if (!((AbstractC2053m) this.f16800e).c()) {
                        u11 = ((AbstractC2053m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u11 == this.f16797b);
                this.f16799d = u11;
                return;
            default:
                if (list instanceof C2506g0) {
                    C2506g0 c2506g0 = (C2506g0) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            int f6 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                            do {
                                c2506g0.s(((AbstractC2543v) this.f16800e).G());
                            } while (((AbstractC2543v) this.f16800e).f() < f6);
                            c0(f6);
                            return;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        c2506g0.s(((AbstractC2543v) this.f16800e).G());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F11 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F11 == this.f16797b);
                    this.f16799d = F11;
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 0) {
                    if (i13 == 2) {
                        int f10 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                        do {
                            list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).G()));
                        } while (((AbstractC2543v) this.f16800e).f() < f10);
                        c0(f10);
                        return;
                    }
                    throw C2540t0.c();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).G()));
                    if (!((AbstractC2543v) this.f16800e).g()) {
                        F10 = ((AbstractC2543v) this.f16800e).F();
                    } else {
                        return;
                    }
                } while (F10 == this.f16797b);
                this.f16799d = F10;
                return;
        }
    }

    public final boolean g0() {
        int i10;
        int i11;
        int i12;
        switch (this.f16796a) {
            case 1:
                if (((AbstractC2028m) this.f16800e).c() || (i10 = this.f16797b) == this.f16798c) {
                    return false;
                }
                return ((AbstractC2028m) this.f16800e).x(i10);
            case 2:
                if (((AbstractC2053m) this.f16800e).c() || (i11 = this.f16797b) == this.f16798c) {
                    return false;
                }
                return ((AbstractC2053m) this.f16800e).x(i11);
            default:
                if (((AbstractC2543v) this.f16800e).g() || (i12 = this.f16797b) == this.f16798c) {
                    return false;
                }
                return ((AbstractC2543v) this.f16800e).I(i12);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int getTag() {
        switch (this.f16796a) {
            case 1:
                return this.f16797b;
            case 2:
                return this.f16797b;
            default:
                return this.f16797b;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int h() {
        switch (this.f16796a) {
            case 1:
                f0(5);
                return ((AbstractC2028m) this.f16800e).j();
            case 2:
                e0(5);
                return ((AbstractC2053m) this.f16800e).j();
            default:
                e0(5);
                return ((AbstractC2543v) this.f16800e).q();
        }
    }

    public final void h0(int i10) {
        switch (this.f16796a) {
            case 2:
                if ((i10 & 3) == 0) {
                    return;
                }
                throw new IOException("Failed to parse the message.");
            default:
                if ((i10 & 3) == 0) {
                    return;
                }
                throw C2540t0.f();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final boolean i() {
        switch (this.f16796a) {
            case 1:
                f0(0);
                return ((AbstractC2028m) this.f16800e).f();
            case 2:
                e0(0);
                return ((AbstractC2053m) this.f16800e).f();
            default:
                e0(0);
                return ((AbstractC2543v) this.f16800e).m();
        }
    }

    public final void i0(int i10) {
        switch (this.f16796a) {
            case 2:
                if ((i10 & 7) == 0) {
                    return;
                }
                throw new IOException("Failed to parse the message.");
            default:
                if ((i10 & 7) == 0) {
                    return;
                }
                throw C2540t0.f();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final long j() {
        switch (this.f16796a) {
            case 1:
                f0(1);
                return ((AbstractC2028m) this.f16800e).p();
            case 2:
                e0(1);
                return ((AbstractC2053m) this.f16800e).p();
            default:
                e0(1);
                return ((AbstractC2543v) this.f16800e).A();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void k(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int b10 = ((AbstractC2028m) this.f16800e).b() + ((AbstractC2028m) this.f16800e).v();
                        do {
                            list.add(Long.valueOf(((AbstractC2028m) this.f16800e).w()));
                        } while (((AbstractC2028m) this.f16800e).b() < b10);
                        d0(b10);
                        return;
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2028m) this.f16800e).w()));
                    if (!((AbstractC2028m) this.f16800e).c()) {
                        u10 = ((AbstractC2028m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u10 == this.f16797b);
                this.f16799d = u10;
                return;
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int b11 = ((AbstractC2053m) this.f16800e).b() + ((AbstractC2053m) this.f16800e).v();
                        do {
                            list.add(Long.valueOf(((AbstractC2053m) this.f16800e).w()));
                        } while (((AbstractC2053m) this.f16800e).b() < b11);
                        c0(b11);
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2053m) this.f16800e).w()));
                    if (!((AbstractC2053m) this.f16800e).c()) {
                        u11 = ((AbstractC2053m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u11 == this.f16797b);
                this.f16799d = u11;
                return;
            default:
                if (list instanceof B0) {
                    B0 b02 = (B0) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            int f6 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                            do {
                                b02.s(((AbstractC2543v) this.f16800e).H());
                            } while (((AbstractC2543v) this.f16800e).f() < f6);
                            c0(f6);
                            return;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        b02.s(((AbstractC2543v) this.f16800e).H());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F11 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F11 == this.f16797b);
                    this.f16799d = F11;
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 0) {
                    if (i13 == 2) {
                        int f10 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                        do {
                            list.add(Long.valueOf(((AbstractC2543v) this.f16800e).H()));
                        } while (((AbstractC2543v) this.f16800e).f() < f10);
                        c0(f10);
                        return;
                    }
                    throw C2540t0.c();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2543v) this.f16800e).H()));
                    if (!((AbstractC2543v) this.f16800e).g()) {
                        F10 = ((AbstractC2543v) this.f16800e).F();
                    } else {
                        return;
                    }
                } while (F10 == this.f16797b);
                this.f16799d = F10;
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int l() {
        switch (this.f16796a) {
            case 1:
                f0(0);
                return ((AbstractC2028m) this.f16800e).v();
            case 2:
                e0(0);
                return ((AbstractC2053m) this.f16800e).v();
            default:
                e0(0);
                return ((AbstractC2543v) this.f16800e).G();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void m(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int b10 = ((AbstractC2028m) this.f16800e).b() + ((AbstractC2028m) this.f16800e).v();
                        do {
                            list.add(Long.valueOf(((AbstractC2028m) this.f16800e).n()));
                        } while (((AbstractC2028m) this.f16800e).b() < b10);
                        d0(b10);
                        return;
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2028m) this.f16800e).n()));
                    if (!((AbstractC2028m) this.f16800e).c()) {
                        u10 = ((AbstractC2028m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u10 == this.f16797b);
                this.f16799d = u10;
                return;
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int b11 = ((AbstractC2053m) this.f16800e).b() + ((AbstractC2053m) this.f16800e).v();
                        do {
                            list.add(Long.valueOf(((AbstractC2053m) this.f16800e).n()));
                        } while (((AbstractC2053m) this.f16800e).b() < b11);
                        c0(b11);
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2053m) this.f16800e).n()));
                    if (!((AbstractC2053m) this.f16800e).c()) {
                        u11 = ((AbstractC2053m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u11 == this.f16797b);
                this.f16799d = u11;
                return;
            default:
                if (list instanceof B0) {
                    B0 b02 = (B0) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            int f6 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                            do {
                                b02.s(((AbstractC2543v) this.f16800e).v());
                            } while (((AbstractC2543v) this.f16800e).f() < f6);
                            c0(f6);
                            return;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        b02.s(((AbstractC2543v) this.f16800e).v());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F11 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F11 == this.f16797b);
                    this.f16799d = F11;
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 0) {
                    if (i13 == 2) {
                        int f10 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                        do {
                            list.add(Long.valueOf(((AbstractC2543v) this.f16800e).v()));
                        } while (((AbstractC2543v) this.f16800e).f() < f10);
                        c0(f10);
                        return;
                    }
                    throw C2540t0.c();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2543v) this.f16800e).v()));
                    if (!((AbstractC2543v) this.f16800e).g()) {
                        F10 = ((AbstractC2543v) this.f16800e).F();
                    } else {
                        return;
                    }
                } while (F10 == this.f16797b);
                this.f16799d = F10;
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void n(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 1) {
                    if (i10 == 2) {
                        int v10 = ((AbstractC2028m) this.f16800e).v();
                        if ((v10 & 7) == 0) {
                            int b10 = ((AbstractC2028m) this.f16800e).b() + v10;
                            do {
                                list.add(Long.valueOf(((AbstractC2028m) this.f16800e).p()));
                            } while (((AbstractC2028m) this.f16800e).b() < b10);
                            return;
                        }
                        throw androidx.datastore.preferences.protobuf.D.e();
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2028m) this.f16800e).p()));
                    if (!((AbstractC2028m) this.f16800e).c()) {
                        u10 = ((AbstractC2028m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u10 == this.f16797b);
                this.f16799d = u10;
                return;
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 1) {
                    if (i11 == 2) {
                        int v11 = ((AbstractC2053m) this.f16800e).v();
                        i0(v11);
                        int b11 = ((AbstractC2053m) this.f16800e).b() + v11;
                        do {
                            list.add(Long.valueOf(((AbstractC2053m) this.f16800e).p()));
                        } while (((AbstractC2053m) this.f16800e).b() < b11);
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2053m) this.f16800e).p()));
                    if (!((AbstractC2053m) this.f16800e).c()) {
                        u11 = ((AbstractC2053m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u11 == this.f16797b);
                this.f16799d = u11;
                return;
            default:
                if (list instanceof B0) {
                    B0 b02 = (B0) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 1) {
                        if (i12 == 2) {
                            int G10 = ((AbstractC2543v) this.f16800e).G();
                            i0(G10);
                            int f6 = ((AbstractC2543v) this.f16800e).f() + G10;
                            do {
                                b02.s(((AbstractC2543v) this.f16800e).A());
                            } while (((AbstractC2543v) this.f16800e).f() < f6);
                            return;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        b02.s(((AbstractC2543v) this.f16800e).A());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F11 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F11 == this.f16797b);
                    this.f16799d = F11;
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 1) {
                    if (i13 == 2) {
                        int G11 = ((AbstractC2543v) this.f16800e).G();
                        i0(G11);
                        int f10 = ((AbstractC2543v) this.f16800e).f() + G11;
                        do {
                            list.add(Long.valueOf(((AbstractC2543v) this.f16800e).A()));
                        } while (((AbstractC2543v) this.f16800e).f() < f10);
                        return;
                    }
                    throw C2540t0.c();
                }
                do {
                    list.add(Long.valueOf(((AbstractC2543v) this.f16800e).A()));
                    if (!((AbstractC2543v) this.f16800e).g()) {
                        F10 = ((AbstractC2543v) this.f16800e).F();
                    } else {
                        return;
                    }
                } while (F10 == this.f16797b);
                this.f16799d = F10;
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void o(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int b10 = ((AbstractC2028m) this.f16800e).b() + ((AbstractC2028m) this.f16800e).v();
                        do {
                            list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).m()));
                        } while (((AbstractC2028m) this.f16800e).b() < b10);
                        d0(b10);
                        return;
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).m()));
                    if (!((AbstractC2028m) this.f16800e).c()) {
                        u10 = ((AbstractC2028m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u10 == this.f16797b);
                this.f16799d = u10;
                return;
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int b11 = ((AbstractC2053m) this.f16800e).b() + ((AbstractC2053m) this.f16800e).v();
                        do {
                            list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).m()));
                        } while (((AbstractC2053m) this.f16800e).b() < b11);
                        c0(b11);
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).m()));
                    if (!((AbstractC2053m) this.f16800e).c()) {
                        u11 = ((AbstractC2053m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u11 == this.f16797b);
                this.f16799d = u11;
                return;
            default:
                if (list instanceof C2506g0) {
                    C2506g0 c2506g0 = (C2506g0) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            int f6 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                            do {
                                c2506g0.s(((AbstractC2543v) this.f16800e).u());
                            } while (((AbstractC2543v) this.f16800e).f() < f6);
                            c0(f6);
                            return;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        c2506g0.s(((AbstractC2543v) this.f16800e).u());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F11 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F11 == this.f16797b);
                    this.f16799d = F11;
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 0) {
                    if (i13 == 2) {
                        int f10 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                        do {
                            list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).u()));
                        } while (((AbstractC2543v) this.f16800e).f() < f10);
                        c0(f10);
                        return;
                    }
                    throw C2540t0.c();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).u()));
                    if (!((AbstractC2543v) this.f16800e).g()) {
                        F10 = ((AbstractC2543v) this.f16800e).F();
                    } else {
                        return;
                    }
                } while (F10 == this.f16797b);
                this.f16799d = F10;
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void p(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int b10 = ((AbstractC2028m) this.f16800e).b() + ((AbstractC2028m) this.f16800e).v();
                        do {
                            list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).i()));
                        } while (((AbstractC2028m) this.f16800e).b() < b10);
                        d0(b10);
                        return;
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).i()));
                    if (!((AbstractC2028m) this.f16800e).c()) {
                        u10 = ((AbstractC2028m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u10 == this.f16797b);
                this.f16799d = u10;
                return;
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int b11 = ((AbstractC2053m) this.f16800e).b() + ((AbstractC2053m) this.f16800e).v();
                        do {
                            list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).i()));
                        } while (((AbstractC2053m) this.f16800e).b() < b11);
                        c0(b11);
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).i()));
                    if (!((AbstractC2053m) this.f16800e).c()) {
                        u11 = ((AbstractC2053m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u11 == this.f16797b);
                this.f16799d = u11;
                return;
            default:
                if (list instanceof C2506g0) {
                    C2506g0 c2506g0 = (C2506g0) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            int f6 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                            do {
                                c2506g0.s(((AbstractC2543v) this.f16800e).p());
                            } while (((AbstractC2543v) this.f16800e).f() < f6);
                            c0(f6);
                            return;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        c2506g0.s(((AbstractC2543v) this.f16800e).p());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F11 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F11 == this.f16797b);
                    this.f16799d = F11;
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 0) {
                    if (i13 == 2) {
                        int f10 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                        do {
                            list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).p()));
                        } while (((AbstractC2543v) this.f16800e).f() < f10);
                        c0(f10);
                        return;
                    }
                    throw C2540t0.c();
                }
                do {
                    list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).p()));
                    if (!((AbstractC2543v) this.f16800e).g()) {
                        F10 = ((AbstractC2543v) this.f16800e).F();
                    } else {
                        return;
                    }
                } while (F10 == this.f16797b);
                this.f16799d = F10;
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int q() {
        switch (this.f16796a) {
            case 1:
                f0(0);
                return ((AbstractC2028m) this.f16800e).i();
            case 2:
                e0(0);
                return ((AbstractC2053m) this.f16800e).i();
            default:
                e0(0);
                return ((AbstractC2543v) this.f16800e).p();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void r(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 2) {
                    if (i10 == 5) {
                        do {
                            list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).j()));
                            if (!((AbstractC2028m) this.f16800e).c()) {
                                u10 = ((AbstractC2028m) this.f16800e).u();
                            } else {
                                return;
                            }
                        } while (u10 == this.f16797b);
                        this.f16799d = u10;
                        return;
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                int v10 = ((AbstractC2028m) this.f16800e).v();
                if ((v10 & 3) == 0) {
                    int b10 = ((AbstractC2028m) this.f16800e).b() + v10;
                    do {
                        list.add(Integer.valueOf(((AbstractC2028m) this.f16800e).j()));
                    } while (((AbstractC2028m) this.f16800e).b() < b10);
                    return;
                }
                throw androidx.datastore.preferences.protobuf.D.e();
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 2) {
                    if (i11 == 5) {
                        do {
                            list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).j()));
                            if (!((AbstractC2053m) this.f16800e).c()) {
                                u11 = ((AbstractC2053m) this.f16800e).u();
                            } else {
                                return;
                            }
                        } while (u11 == this.f16797b);
                        this.f16799d = u11;
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                int v11 = ((AbstractC2053m) this.f16800e).v();
                h0(v11);
                int b11 = v11 + ((AbstractC2053m) this.f16800e).b();
                do {
                    list.add(Integer.valueOf(((AbstractC2053m) this.f16800e).j()));
                } while (((AbstractC2053m) this.f16800e).b() < b11);
                return;
            default:
                if (list instanceof C2506g0) {
                    C2506g0 c2506g0 = (C2506g0) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 2) {
                        if (i12 == 5) {
                            do {
                                c2506g0.s(((AbstractC2543v) this.f16800e).q());
                                if (!((AbstractC2543v) this.f16800e).g()) {
                                    F11 = ((AbstractC2543v) this.f16800e).F();
                                } else {
                                    return;
                                }
                            } while (F11 == this.f16797b);
                            this.f16799d = F11;
                            return;
                        }
                        throw C2540t0.c();
                    }
                    int G10 = ((AbstractC2543v) this.f16800e).G();
                    h0(G10);
                    int f6 = ((AbstractC2543v) this.f16800e).f() + G10;
                    do {
                        c2506g0.s(((AbstractC2543v) this.f16800e).q());
                    } while (((AbstractC2543v) this.f16800e).f() < f6);
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 2) {
                    if (i13 == 5) {
                        do {
                            list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).q()));
                            if (!((AbstractC2543v) this.f16800e).g()) {
                                F10 = ((AbstractC2543v) this.f16800e).F();
                            } else {
                                return;
                            }
                        } while (F10 == this.f16797b);
                        this.f16799d = F10;
                        return;
                    }
                    throw C2540t0.c();
                }
                int G11 = ((AbstractC2543v) this.f16800e).G();
                h0(G11);
                int f10 = G11 + ((AbstractC2543v) this.f16800e).f();
                do {
                    list.add(Integer.valueOf(((AbstractC2543v) this.f16800e).q()));
                } while (((AbstractC2543v) this.f16800e).f() < f10);
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final double readDouble() {
        switch (this.f16796a) {
            case 1:
                f0(1);
                return ((AbstractC2028m) this.f16800e).h();
            case 2:
                e0(1);
                return ((AbstractC2053m) this.f16800e).h();
            default:
                e0(1);
                return ((AbstractC2543v) this.f16800e).o();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final float readFloat() {
        switch (this.f16796a) {
            case 1:
                f0(5);
                return ((AbstractC2028m) this.f16800e).l();
            case 2:
                e0(5);
                return ((AbstractC2053m) this.f16800e).l();
            default:
                e0(5);
                return ((AbstractC2543v) this.f16800e).s();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int s() {
        switch (this.f16796a) {
            case 1:
                f0(0);
                return ((AbstractC2028m) this.f16800e).q();
            case 2:
                e0(0);
                return ((AbstractC2053m) this.f16800e).q();
            default:
                e0(0);
                return ((AbstractC2543v) this.f16800e).B();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final long t() {
        switch (this.f16796a) {
            case 1:
                f0(0);
                return ((AbstractC2028m) this.f16800e).r();
            case 2:
                e0(0);
                return ((AbstractC2053m) this.f16800e).r();
            default:
                e0(0);
                return ((AbstractC2543v) this.f16800e).C();
        }
    }

    public final String toString() {
        switch (this.f16796a) {
            case 0:
                return "";
            default:
                return super.toString();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void u(List list) {
        int u10;
        int u11;
        int F10;
        int F11;
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16797b & 7;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int b10 = ((AbstractC2028m) this.f16800e).b() + ((AbstractC2028m) this.f16800e).v();
                        do {
                            list.add(Boolean.valueOf(((AbstractC2028m) this.f16800e).f()));
                        } while (((AbstractC2028m) this.f16800e).b() < b10);
                        d0(b10);
                        return;
                    }
                    throw androidx.datastore.preferences.protobuf.D.b();
                }
                do {
                    list.add(Boolean.valueOf(((AbstractC2028m) this.f16800e).f()));
                    if (!((AbstractC2028m) this.f16800e).c()) {
                        u10 = ((AbstractC2028m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u10 == this.f16797b);
                this.f16799d = u10;
                return;
            case 2:
                int i11 = this.f16797b & 7;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int b11 = ((AbstractC2053m) this.f16800e).b() + ((AbstractC2053m) this.f16800e).v();
                        do {
                            list.add(Boolean.valueOf(((AbstractC2053m) this.f16800e).f()));
                        } while (((AbstractC2053m) this.f16800e).b() < b11);
                        c0(b11);
                        return;
                    }
                    throw androidx.glance.appwidget.protobuf.C.b();
                }
                do {
                    list.add(Boolean.valueOf(((AbstractC2053m) this.f16800e).f()));
                    if (!((AbstractC2053m) this.f16800e).c()) {
                        u11 = ((AbstractC2053m) this.f16800e).u();
                    } else {
                        return;
                    }
                } while (u11 == this.f16797b);
                this.f16799d = u11;
                return;
            default:
                if (list instanceof C2514j) {
                    C2514j c2514j = (C2514j) list;
                    int i12 = this.f16797b & 7;
                    if (i12 != 0) {
                        if (i12 == 2) {
                            int f6 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                            do {
                                c2514j.s(((AbstractC2543v) this.f16800e).m());
                            } while (((AbstractC2543v) this.f16800e).f() < f6);
                            c0(f6);
                            return;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        c2514j.s(((AbstractC2543v) this.f16800e).m());
                        if (!((AbstractC2543v) this.f16800e).g()) {
                            F11 = ((AbstractC2543v) this.f16800e).F();
                        } else {
                            return;
                        }
                    } while (F11 == this.f16797b);
                    this.f16799d = F11;
                    return;
                }
                int i13 = this.f16797b & 7;
                if (i13 != 0) {
                    if (i13 == 2) {
                        int f10 = ((AbstractC2543v) this.f16800e).f() + ((AbstractC2543v) this.f16800e).G();
                        do {
                            list.add(Boolean.valueOf(((AbstractC2543v) this.f16800e).m()));
                        } while (((AbstractC2543v) this.f16800e).f() < f10);
                        c0(f10);
                        return;
                    }
                    throw C2540t0.c();
                }
                do {
                    list.add(Boolean.valueOf(((AbstractC2543v) this.f16800e).m()));
                    if (!((AbstractC2543v) this.f16800e).g()) {
                        F10 = ((AbstractC2543v) this.f16800e).F();
                    } else {
                        return;
                    }
                } while (F10 == this.f16797b);
                this.f16799d = F10;
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final String v() {
        switch (this.f16796a) {
            case 1:
                f0(2);
                return ((AbstractC2028m) this.f16800e).s();
            case 2:
                e0(2);
                return ((AbstractC2053m) this.f16800e).s();
            default:
                e0(2);
                return ((AbstractC2543v) this.f16800e).D();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int w() {
        switch (this.f16796a) {
            case 1:
                int i10 = this.f16799d;
                if (i10 != 0) {
                    this.f16797b = i10;
                    this.f16799d = 0;
                } else {
                    this.f16797b = ((AbstractC2028m) this.f16800e).u();
                }
                int i11 = this.f16797b;
                if (i11 == 0 || i11 == this.f16798c) {
                    return Integer.MAX_VALUE;
                }
                return i11 >>> 3;
            case 2:
                int i12 = this.f16799d;
                if (i12 != 0) {
                    this.f16797b = i12;
                    this.f16799d = 0;
                } else {
                    this.f16797b = ((AbstractC2053m) this.f16800e).u();
                }
                int i13 = this.f16797b;
                if (i13 == 0 || i13 == this.f16798c) {
                    return Integer.MAX_VALUE;
                }
                return i13 >>> 3;
            default:
                int i14 = this.f16799d;
                if (i14 != 0) {
                    this.f16797b = i14;
                    this.f16799d = 0;
                } else {
                    this.f16797b = ((AbstractC2543v) this.f16800e).F();
                }
                int i15 = this.f16797b;
                if (i15 == 0 || i15 == this.f16798c) {
                    return Integer.MAX_VALUE;
                }
                return i15 >>> 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void x(List list) {
        switch (this.f16796a) {
            case 1:
                b0(list, false);
                return;
            case 2:
                b0(list, false);
                return;
            default:
                b0(list, false);
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void y(List list) {
        switch (this.f16796a) {
            case 1:
                b0(list, true);
                return;
            case 2:
                b0(list, true);
                return;
            default:
                b0(list, true);
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final AbstractC2025j z() {
        f0(2);
        return ((AbstractC2028m) this.f16800e).g();
    }

    public m(ArrayList arrayList) {
        this.f16796a = 6;
        this.f16800e = arrayList;
        this.f16797b = 0;
        this.f16798c = arrayList.size();
    }

    public m(AbstractC2028m abstractC2028m) {
        this.f16796a = 1;
        this.f16799d = 0;
        Charset charset = androidx.datastore.preferences.protobuf.B.f24959a;
        this.f16800e = abstractC2028m;
        abstractC2028m.f25084d = this;
    }

    public m(AbstractC2053m abstractC2053m) {
        this.f16796a = 2;
        this.f16799d = 0;
        Charset charset = androidx.glance.appwidget.protobuf.A.f25144a;
        this.f16800e = abstractC2053m;
        abstractC2053m.f25247d = this;
    }

    public m(AbstractC2543v abstractC2543v) {
        this.f16796a = 5;
        this.f16799d = 0;
        AbstractC2536r0.a("input", abstractC2543v);
        this.f16800e = abstractC2543v;
        abstractC2543v.f27625d = this;
    }

    public m(int i10) {
        this.f16796a = 3;
        this.f16797b = i10;
    }

    public m(int i10, int i11, int i12, SparseArray sparseArray) {
        this.f16796a = 4;
        this.f16797b = i10;
        this.f16798c = i11;
        this.f16799d = i12;
        this.f16800e = sparseArray;
    }
}
