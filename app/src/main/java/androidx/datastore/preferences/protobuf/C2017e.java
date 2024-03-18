package androidx.datastore.preferences.protobuf;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2017e implements AbstractC2020f0 {

    /* renamed from: a  reason: collision with root package name */
    public int f25038a;

    /* renamed from: b  reason: collision with root package name */
    public int f25039b;

    /* renamed from: c  reason: collision with root package name */
    public int f25040c;

    /* renamed from: d  reason: collision with root package name */
    public int f25041d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25042e;

    /* renamed from: f  reason: collision with root package name */
    public int f25043f;

    /* renamed from: g  reason: collision with root package name */
    public Object f25044g;

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void A(List list) {
        int i10;
        int i11 = this.f25041d & 7;
        if (i11 != 2) {
            if (i11 == 5) {
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (M()) {
                        return;
                    }
                    i10 = this.f25038a;
                } while (U() == this.f25041d);
                this.f25038a = i10;
                return;
            }
            throw D.b();
        }
        int U10 = U();
        X(U10);
        if ((U10 & 3) == 0) {
            int i12 = this.f25038a + U10;
            while (this.f25038a < i12) {
                list.add(Float.valueOf(Float.intBitsToFloat(P())));
            }
            return;
        }
        throw D.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int B() {
        Y(0);
        return U();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void C(List list, AbstractC2022g0 abstractC2022g0, r rVar) {
        int i10;
        int i11 = this.f25041d;
        if ((i11 & 7) == 3) {
            do {
                list.add(O(abstractC2022g0, rVar));
                if (M()) {
                    return;
                }
                i10 = this.f25038a;
            } while (U() == i11);
            this.f25038a = i10;
            return;
        }
        throw D.b();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int D() {
        Y(5);
        X(4);
        return P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void E(List list) {
        int i10;
        if ((this.f25041d & 7) == 2) {
            do {
                list.add(z());
                if (M()) {
                    return;
                }
                i10 = this.f25038a;
            } while (U() == this.f25041d);
            this.f25038a = i10;
            return;
        }
        throw D.b();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void F(List list) {
        int i10;
        int i11 = this.f25041d & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int U10 = U();
                X(U10);
                if ((U10 & 7) == 0) {
                    int i12 = this.f25038a + U10;
                    while (this.f25038a < i12) {
                        list.add(Double.valueOf(Double.longBitsToDouble(Q())));
                    }
                    return;
                }
                throw D.e();
            }
            throw D.b();
        }
        do {
            list.add(Double.valueOf(readDouble()));
            if (M()) {
                return;
            }
            i10 = this.f25038a;
        } while (U() == this.f25041d);
        this.f25038a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void G(List list, AbstractC2022g0 abstractC2022g0, r rVar) {
        int i10;
        int i11 = this.f25041d;
        if ((i11 & 7) == 2) {
            do {
                list.add(R(abstractC2022g0, rVar));
                if (M()) {
                    return;
                }
                i10 = this.f25038a;
            } while (U() == i11);
            this.f25038a = i10;
            return;
        }
        throw D.b();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void H(P p10, U3.i iVar, r rVar) {
        Y(2);
        int U10 = U();
        X(U10);
        int i10 = this.f25040c;
        this.f25040c = this.f25038a + U10;
        try {
            Object obj = iVar.f17415Z;
            Object obj2 = iVar.f17417i0;
            while (true) {
                int w10 = w();
                if (w10 == Integer.MAX_VALUE) {
                    p10.put(obj, obj2);
                    return;
                } else if (w10 != 1) {
                    if (w10 != 2) {
                        try {
                            if (!a0()) {
                                throw new IOException("Unable to parse map entry.");
                                break;
                            }
                        } catch (C unused) {
                            if (!a0()) {
                                throw new IOException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = N((F0) iVar.f17416h0, iVar.f17417i0.getClass(), rVar);
                    }
                } else {
                    obj = N((F0) iVar.f17414Y, null, null);
                }
            }
        } finally {
            this.f25040c = i10;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final long I() {
        Y(0);
        return V();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final String J() {
        return S(true);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void K(List list) {
        int i10;
        int i11 = this.f25041d & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int U10 = U();
                X(U10);
                if ((U10 & 7) == 0) {
                    int i12 = this.f25038a + U10;
                    while (this.f25038a < i12) {
                        list.add(Long.valueOf(Q()));
                    }
                    return;
                }
                throw D.e();
            }
            throw D.b();
        }
        do {
            list.add(Long.valueOf(d()));
            if (M()) {
                return;
            }
            i10 = this.f25038a;
        } while (U() == this.f25041d);
        this.f25038a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final Object L(AbstractC2022g0 abstractC2022g0, r rVar) {
        Y(3);
        return O(abstractC2022g0, rVar);
    }

    public final boolean M() {
        if (this.f25038a == this.f25040c) {
            return true;
        }
        return false;
    }

    public final Object N(F0 f02, Class cls, r rVar) {
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
                return S(true);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                Y(2);
                return R(C2014c0.f25030c.a(cls), rVar);
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

    public final Object O(AbstractC2022g0 abstractC2022g0, r rVar) {
        int i10 = this.f25043f;
        this.f25043f = ((this.f25041d >>> 3) << 3) | 4;
        try {
            Object g10 = abstractC2022g0.g();
            abstractC2022g0.h(g10, this, rVar);
            abstractC2022g0.d(g10);
            if (this.f25041d == this.f25043f) {
                return g10;
            }
            throw D.e();
        } finally {
            this.f25043f = i10;
        }
    }

    public final int P() {
        int i10 = this.f25038a;
        byte[] bArr = (byte[]) this.f25044g;
        this.f25038a = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long Q() {
        int i10 = this.f25038a;
        byte[] bArr = (byte[]) this.f25044g;
        this.f25038a = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final Object R(AbstractC2022g0 abstractC2022g0, r rVar) {
        int U10 = U();
        X(U10);
        int i10 = this.f25040c;
        int i11 = this.f25038a + U10;
        this.f25040c = i11;
        try {
            Object g10 = abstractC2022g0.g();
            abstractC2022g0.h(g10, this, rVar);
            abstractC2022g0.d(g10);
            if (this.f25038a == i11) {
                return g10;
            }
            throw D.e();
        } finally {
            this.f25040c = i10;
        }
    }

    public final String S(boolean z10) {
        Y(2);
        int U10 = U();
        if (U10 == 0) {
            return "";
        }
        X(U10);
        if (z10) {
            int i10 = this.f25038a;
            if (A0.f24958a.m(i10, i10 + U10, (byte[]) this.f25044g) != 0) {
                throw D.a();
            }
        }
        String str = new String((byte[]) this.f25044g, this.f25038a, U10, B.f24959a);
        this.f25038a += U10;
        return str;
    }

    public final void T(List list, boolean z10) {
        int i10;
        int i11;
        if ((this.f25041d & 7) == 2) {
            if ((list instanceof H) && !z10) {
                H h10 = (H) list;
                do {
                    h10.b0(z());
                    if (M()) {
                        return;
                    }
                    i11 = this.f25038a;
                } while (U() == this.f25041d);
                this.f25038a = i11;
                return;
            }
            do {
                list.add(S(z10));
                if (M()) {
                    return;
                }
                i10 = this.f25038a;
            } while (U() == this.f25041d);
            this.f25038a = i10;
            return;
        }
        throw D.b();
    }

    public final int U() {
        int i10;
        int i11 = this.f25038a;
        int i12 = this.f25040c;
        if (i12 != i11) {
            Object obj = this.f25044g;
            int i13 = i11 + 1;
            byte b10 = ((byte[]) obj)[i11];
            if (b10 >= 0) {
                this.f25038a = i13;
                return b10;
            } else if (i12 - i13 < 9) {
                return (int) W();
            } else {
                int i14 = i11 + 2;
                int i15 = (((byte[]) obj)[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = i15 ^ (((byte[]) obj)[i14] << 14);
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        i14 = i11 + 4;
                        int i18 = i17 ^ (((byte[]) obj)[i16] << 21);
                        if (i18 < 0) {
                            i10 = (-2080896) ^ i18;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = ((byte[]) obj)[i14];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i14 = i11 + 6;
                                if (((byte[]) obj)[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (((byte[]) obj)[i14] < 0) {
                                        i14 = i11 + 8;
                                        if (((byte[]) obj)[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (((byte[]) obj)[i14] < 0) {
                                                i14 = i11 + 10;
                                                if (((byte[]) obj)[i16] < 0) {
                                                    throw D.c();
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i19;
                            }
                            i10 = i19;
                        }
                    }
                    i14 = i16;
                }
                this.f25038a = i14;
                return i10;
            }
        }
        throw D.f();
    }

    public final long V() {
        long j6;
        long j10;
        long j11;
        int i10 = this.f25038a;
        int i11 = this.f25040c;
        if (i11 != i10) {
            byte[] bArr = (byte[]) this.f25044g;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f25038a = i12;
                return b10;
            } else if (i11 - i12 < 9) {
                return W();
            } else {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j6 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j6 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i13 = i17;
                            j6 = (-2080896) ^ i18;
                        } else {
                            long j12 = i18;
                            i13 = i10 + 5;
                            long j13 = j12 ^ (bArr[i17] << 28);
                            if (j13 >= 0) {
                                j11 = 266354560;
                            } else {
                                int i19 = i10 + 6;
                                long j14 = j13 ^ (bArr[i13] << 35);
                                if (j14 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j13 = j14 ^ (bArr[i19] << 42);
                                    if (j13 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i19 = i10 + 8;
                                        j14 = j13 ^ (bArr[i13] << 49);
                                        if (j14 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j15 = (j14 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i20;
                                                } else {
                                                    throw D.c();
                                                }
                                            }
                                            j6 = j15;
                                        }
                                    }
                                }
                                j6 = j14 ^ j10;
                                i13 = i19;
                            }
                            j6 = j13 ^ j11;
                        }
                    }
                }
                this.f25038a = i13;
                return j6;
            }
        }
        throw D.f();
    }

    public final long W() {
        long j6 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f25038a;
            if (i11 != this.f25040c) {
                this.f25038a = i11 + 1;
                byte b10 = ((byte[]) this.f25044g)[i11];
                j6 |= (b10 & Byte.MAX_VALUE) << i10;
                if ((b10 & 128) == 0) {
                    return j6;
                }
            } else {
                throw D.f();
            }
        }
        throw D.c();
    }

    public final void X(int i10) {
        if (i10 >= 0 && i10 <= this.f25040c - this.f25038a) {
            return;
        }
        throw D.f();
    }

    public final void Y(int i10) {
        if ((this.f25041d & 7) == i10) {
            return;
        }
        throw D.b();
    }

    public final void Z(RecyclerView recyclerView) {
        int i10 = this.f25041d;
        if (i10 >= 0) {
            this.f25041d = -1;
            recyclerView.M(i10);
            this.f25042e = false;
        } else if (this.f25042e) {
            Interpolator interpolator = (Interpolator) this.f25044g;
            if (interpolator != null && this.f25040c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f25040c;
            if (i11 >= 1) {
                recyclerView.f25450d1.b(this.f25038a, this.f25039b, i11, interpolator);
                int i12 = this.f25043f + 1;
                this.f25043f = i12;
                if (i12 > 10) {
                    AbstractC3612c.c("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f25042e = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f25043f = 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final Object a(AbstractC2022g0 abstractC2022g0, r rVar) {
        Y(2);
        return R(abstractC2022g0, rVar);
    }

    public final boolean a0() {
        int i10;
        int i11;
        if (M() || (i10 = this.f25041d) == (i11 = this.f25043f)) {
            return false;
        }
        int i12 = i10 & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 5) {
                            X(4);
                            this.f25038a += 4;
                            return true;
                        }
                        throw D.b();
                    }
                    this.f25043f = ((i10 >>> 3) << 3) | 4;
                    while (w() != Integer.MAX_VALUE && a0()) {
                    }
                    if (this.f25041d == this.f25043f) {
                        this.f25043f = i11;
                        return true;
                    }
                    throw D.e();
                }
                int U10 = U();
                X(U10);
                this.f25038a += U10;
                return true;
            }
            X(8);
            this.f25038a += 8;
            return true;
        }
        int i13 = this.f25040c;
        int i14 = this.f25038a;
        if (i13 - i14 >= 10) {
            byte[] bArr = (byte[]) this.f25044g;
            int i15 = 0;
            while (i15 < 10) {
                int i16 = i14 + 1;
                if (bArr[i14] >= 0) {
                    this.f25038a = i16;
                    break;
                }
                i15++;
                i14 = i16;
            }
        }
        for (int i17 = 0; i17 < 10; i17++) {
            int i18 = this.f25038a;
            if (i18 != this.f25040c) {
                this.f25038a = i18 + 1;
                if (((byte[]) this.f25044g)[i18] >= 0) {
                    return true;
                }
            } else {
                throw D.f();
            }
        }
        throw D.c();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void b(List list) {
        int i10;
        int i11 = this.f25041d & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int U10 = this.f25038a + U();
                while (this.f25038a < U10) {
                    int U11 = U();
                    list.add(Integer.valueOf((-(U11 & 1)) ^ (U11 >>> 1)));
                }
                return;
            }
            throw D.b();
        }
        do {
            list.add(Integer.valueOf(s()));
            if (M()) {
                return;
            }
            i10 = this.f25038a;
        } while (U() == this.f25041d);
        this.f25038a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final long c() {
        Y(0);
        return V();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final long d() {
        Y(1);
        X(8);
        return Q();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void e(List list) {
        int i10;
        int i11 = this.f25041d & 7;
        if (i11 != 2) {
            if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(D()));
                    if (M()) {
                        return;
                    }
                    i10 = this.f25038a;
                } while (U() == this.f25041d);
                this.f25038a = i10;
                return;
            }
            throw D.b();
        }
        int U10 = U();
        X(U10);
        if ((U10 & 3) == 0) {
            int i12 = this.f25038a + U10;
            while (this.f25038a < i12) {
                list.add(Integer.valueOf(P()));
            }
            return;
        }
        throw D.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void f(List list) {
        int i10;
        int i11 = this.f25041d & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int U10 = this.f25038a + U();
                while (this.f25038a < U10) {
                    long V10 = V();
                    list.add(Long.valueOf((-(V10 & 1)) ^ (V10 >>> 1)));
                }
                return;
            }
            throw D.b();
        }
        do {
            list.add(Long.valueOf(t()));
            if (M()) {
                return;
            }
            i10 = this.f25038a;
        } while (U() == this.f25041d);
        this.f25038a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void g(List list) {
        int i10;
        int i11 = this.f25041d & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int U10 = this.f25038a + U();
                while (this.f25038a < U10) {
                    list.add(Integer.valueOf(U()));
                }
                return;
            }
            throw D.b();
        }
        do {
            list.add(Integer.valueOf(l()));
            if (M()) {
                return;
            }
            i10 = this.f25038a;
        } while (U() == this.f25041d);
        this.f25038a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int getTag() {
        return this.f25041d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int h() {
        Y(5);
        X(4);
        return P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final boolean i() {
        Y(0);
        if (U() == 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final long j() {
        Y(1);
        X(8);
        return Q();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void k(List list) {
        int i10;
        int i11;
        int i12 = this.f25041d & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int U10 = this.f25038a + U();
                while (true) {
                    i11 = this.f25038a;
                    if (i11 >= U10) {
                        break;
                    }
                    list.add(Long.valueOf(V()));
                }
                if (i11 == U10) {
                    return;
                }
                throw D.f();
            }
            throw D.b();
        }
        do {
            list.add(Long.valueOf(c()));
            if (M()) {
                return;
            }
            i10 = this.f25038a;
        } while (U() == this.f25041d);
        this.f25038a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int l() {
        Y(0);
        return U();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void m(List list) {
        int i10;
        int i11;
        int i12 = this.f25041d & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int U10 = this.f25038a + U();
                while (true) {
                    i11 = this.f25038a;
                    if (i11 >= U10) {
                        break;
                    }
                    list.add(Long.valueOf(V()));
                }
                if (i11 == U10) {
                    return;
                }
                throw D.f();
            }
            throw D.b();
        }
        do {
            list.add(Long.valueOf(I()));
            if (M()) {
                return;
            }
            i10 = this.f25038a;
        } while (U() == this.f25041d);
        this.f25038a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void n(List list) {
        int i10;
        int i11 = this.f25041d & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int U10 = U();
                X(U10);
                if ((U10 & 7) == 0) {
                    int i12 = this.f25038a + U10;
                    while (this.f25038a < i12) {
                        list.add(Long.valueOf(Q()));
                    }
                    return;
                }
                throw D.e();
            }
            throw D.b();
        }
        do {
            list.add(Long.valueOf(j()));
            if (M()) {
                return;
            }
            i10 = this.f25038a;
        } while (U() == this.f25041d);
        this.f25038a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void o(List list) {
        int i10;
        int i11;
        int i12 = this.f25041d & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int U10 = this.f25038a + U();
                while (true) {
                    i11 = this.f25038a;
                    if (i11 >= U10) {
                        break;
                    }
                    list.add(Integer.valueOf(U()));
                }
                if (i11 == U10) {
                    return;
                }
                throw D.f();
            }
            throw D.b();
        }
        do {
            list.add(Integer.valueOf(B()));
            if (M()) {
                return;
            }
            i10 = this.f25038a;
        } while (U() == this.f25041d);
        this.f25038a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void p(List list) {
        int i10;
        int i11 = this.f25041d & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int U10 = this.f25038a + U();
                while (this.f25038a < U10) {
                    list.add(Integer.valueOf(U()));
                }
                return;
            }
            throw D.b();
        }
        do {
            list.add(Integer.valueOf(q()));
            if (M()) {
                return;
            }
            i10 = this.f25038a;
        } while (U() == this.f25041d);
        this.f25038a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int q() {
        Y(0);
        return U();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void r(List list) {
        int i10;
        int i11 = this.f25041d & 7;
        if (i11 != 2) {
            if (i11 == 5) {
                do {
                    list.add(Integer.valueOf(h()));
                    if (M()) {
                        return;
                    }
                    i10 = this.f25038a;
                } while (U() == this.f25041d);
                this.f25038a = i10;
                return;
            }
            throw D.b();
        }
        int U10 = U();
        X(U10);
        if ((U10 & 3) == 0) {
            int i12 = this.f25038a + U10;
            while (this.f25038a < i12) {
                list.add(Integer.valueOf(P()));
            }
            return;
        }
        throw D.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final double readDouble() {
        Y(1);
        X(8);
        return Double.longBitsToDouble(Q());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final float readFloat() {
        Y(5);
        X(4);
        return Float.intBitsToFloat(P());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int s() {
        Y(0);
        int U10 = U();
        return (-(U10 & 1)) ^ (U10 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final long t() {
        Y(0);
        long V10 = V();
        return (-(V10 & 1)) ^ (V10 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void u(List list) {
        int i10;
        int i11;
        boolean z10;
        int i12 = this.f25041d & 7;
        if (i12 != 0) {
            if (i12 == 2) {
                int U10 = this.f25038a + U();
                while (true) {
                    i11 = this.f25038a;
                    if (i11 >= U10) {
                        break;
                    }
                    if (U() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    list.add(Boolean.valueOf(z10));
                }
                if (i11 == U10) {
                    return;
                }
                throw D.f();
            }
            throw D.b();
        }
        do {
            list.add(Boolean.valueOf(i()));
            if (M()) {
                return;
            }
            i10 = this.f25038a;
        } while (U() == this.f25041d);
        this.f25038a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final String v() {
        return S(false);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final int w() {
        if (M()) {
            return Integer.MAX_VALUE;
        }
        int U10 = U();
        this.f25041d = U10;
        if (U10 == this.f25043f) {
            return Integer.MAX_VALUE;
        }
        return U10 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void x(List list) {
        T(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final void y(List list) {
        T(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2020f0
    public final AbstractC2025j z() {
        AbstractC2025j abstractC2025j;
        Y(2);
        int U10 = U();
        if (U10 == 0) {
            return AbstractC2025j.f25066Z;
        }
        X(U10);
        if (this.f25042e) {
            int i10 = this.f25038a;
            C2026k c2026k = AbstractC2025j.f25066Z;
            abstractC2025j = new C2024i((byte[]) this.f25044g, i10, U10);
        } else {
            abstractC2025j = AbstractC2025j.s((byte[]) this.f25044g, this.f25038a, U10);
        }
        this.f25038a += U10;
        return abstractC2025j;
    }
}
