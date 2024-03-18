package j0;

import G0.C0578g;
import Z.C1731q;
import Z.Z0;
import Z.o1;
import b0.C2099c;
import b0.C2104h;
import b0.C2105i;
import id.AbstractC3557B;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import nf.AbstractC4828h;
import w.C6072s;
import w.C6073t;
import w.C6074u;
import w.C6077x;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f35942a;

    /* renamed from: b  reason: collision with root package name */
    public Object f35943b;

    /* renamed from: c  reason: collision with root package name */
    public C6072s f35944c;

    /* renamed from: j  reason: collision with root package name */
    public int f35951j;

    /* renamed from: d  reason: collision with root package name */
    public int f35945d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final C2105i f35946e = new C2105i();

    /* renamed from: f  reason: collision with root package name */
    public final C6073t f35947f = new C6073t();

    /* renamed from: g  reason: collision with root package name */
    public final C6074u f35948g = new C6074u();

    /* renamed from: h  reason: collision with root package name */
    public final C2104h f35949h = new C2104h(new Z.J[16]);

    /* renamed from: i  reason: collision with root package name */
    public final C1731q f35950i = new C1731q(1, this);

    /* renamed from: k  reason: collision with root package name */
    public final C2105i f35952k = new C2105i();

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f35953l = new HashMap();

    public z(wf.k kVar) {
        this.f35942a = kVar;
    }

    public final void a(Object obj, C6077x c6077x, AbstractC6216a abstractC6216a) {
        long[] jArr;
        long[] jArr2;
        int i10;
        boolean z10;
        Object obj2 = this.f35943b;
        C6072s c6072s = this.f35944c;
        int i11 = this.f35945d;
        this.f35943b = obj;
        this.f35944c = (C6072s) this.f35947f.f(obj);
        if (this.f35945d == -1) {
            this.f35945d = p.i().d();
        }
        C1731q c1731q = this.f35950i;
        C2104h C10 = AbstractC4828h.C();
        try {
            C10.b(c1731q);
            int i12 = AbstractC3893i.f35891e;
            io.sentry.hints.i.e(abstractC6216a, c6077x);
            C10.n(C10.f25569h0 - 1);
            Object obj3 = this.f35943b;
            AbstractC3557B.Z(obj3);
            int i13 = this.f35945d;
            C6072s c6072s2 = this.f35944c;
            if (c6072s2 != null) {
                long[] jArr3 = c6072s2.f47625a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j6 = jArr3[i14];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8;
                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j6 & 255) < 128) {
                                    int i18 = (i14 << 3) + i17;
                                    Object obj4 = c6072s2.f47626b[i18];
                                    jArr2 = jArr3;
                                    if (c6072s2.f47627c[i18] != i13) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        d(obj3, obj4);
                                    }
                                    if (z10) {
                                        c6072s2.g(i18);
                                    }
                                    i10 = 8;
                                } else {
                                    jArr2 = jArr3;
                                    i10 = i15;
                                }
                                j6 >>= i10;
                                i17++;
                                i15 = i10;
                                jArr3 = jArr2;
                            }
                            jArr = jArr3;
                            if (i16 != i15) {
                                break;
                            }
                        } else {
                            jArr = jArr3;
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                        jArr3 = jArr;
                    }
                }
            }
            this.f35943b = obj2;
            this.f35944c = c6072s;
            this.f35945d = i11;
        } catch (Throwable th2) {
            C10.n(C10.f25569h0 - 1);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x02af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Set set) {
        boolean z10;
        Iterator it;
        C2105i c2105i;
        HashMap hashMap;
        Object obj;
        Object f6;
        C2105i c2105i2;
        HashMap hashMap2;
        long[] jArr;
        Iterator it2;
        C2105i c2105i3;
        Object obj2;
        HashMap hashMap3;
        long[] jArr2;
        int i10;
        C2105i c2105i4;
        long[] jArr3;
        long[] jArr4;
        C2105i c2105i5;
        Object[] objArr;
        C2105i c2105i6;
        Object[] objArr2;
        C6072s c6072s;
        Object[] objArr3;
        int i11;
        C2105i c2105i7;
        String str;
        int i12;
        o1 o1Var;
        Object f10;
        Object f11;
        long[] jArr5;
        Object[] objArr4;
        int i13;
        int i14;
        String str2;
        C2105i c2105i8;
        int i15;
        int i16;
        long[] jArr6;
        Object[] objArr5;
        long[] jArr7;
        long[] jArr8;
        HashMap hashMap4 = this.f35953l;
        boolean z11 = set instanceof C2099c;
        o1 o1Var2 = o1.f22665a;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        C2104h c2104h = this.f35949h;
        int i17 = 2;
        C2105i c2105i9 = this.f35952k;
        C2105i c2105i10 = this.f35946e;
        C6074u c6074u = this.f35948g;
        if (z11) {
            C2099c c2099c = (C2099c) set;
            Object[] objArr6 = c2099c.f25559Z;
            int i18 = c2099c.f25558Y;
            int i19 = 0;
            z10 = false;
            while (i19 < i18) {
                Object obj3 = objArr6[i19];
                AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj3);
                if ((obj3 instanceof AbstractC3883H) && !((AbstractC3883H) obj3).f(i17)) {
                    i12 = i18;
                    objArr3 = objArr6;
                    o1Var = o1Var2;
                    str = str3;
                    c2105i7 = c2105i9;
                    i11 = i19;
                } else {
                    if (c2105i9.f25570a.b(obj3) && (f11 = c2105i9.f25570a.f(obj3)) != null) {
                        if (f11 instanceof C6074u) {
                            C6074u c6074u2 = (C6074u) f11;
                            Object[] objArr7 = c6074u2.f47643b;
                            long[] jArr9 = c6074u2.f47642a;
                            int length = jArr9.length - i17;
                            if (length >= 0) {
                                objArr3 = objArr6;
                                o1Var = o1Var2;
                                int i20 = 0;
                                while (true) {
                                    long j6 = jArr9[i20];
                                    i12 = i18;
                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i21 = 8 - ((~(i20 - length)) >>> 31);
                                        int i22 = 0;
                                        while (i22 < i21) {
                                            if ((j6 & 255) < 128) {
                                                jArr6 = jArr9;
                                                Z.J j10 = (Z.J) objArr7[(i20 << 3) + i22];
                                                AbstractC3557B.a0(str3, j10);
                                                objArr5 = objArr7;
                                                Object obj4 = hashMap4.get(j10);
                                                str2 = str3;
                                                Z.I i23 = (Z.I) j10;
                                                c2105i8 = c2105i9;
                                                Z0 z02 = i23.f22500h0;
                                                if (z02 == null) {
                                                    z02 = o1Var;
                                                }
                                                if (!z02.a(i23.i().f22496f, obj4)) {
                                                    Object f12 = c2105i10.f25570a.f(j10);
                                                    if (f12 != null) {
                                                        if (f12 instanceof C6074u) {
                                                            C6074u c6074u3 = (C6074u) f12;
                                                            Object[] objArr8 = c6074u3.f47643b;
                                                            long[] jArr10 = c6074u3.f47642a;
                                                            int length2 = jArr10.length - 2;
                                                            if (length2 >= 0) {
                                                                i15 = i19;
                                                                i16 = length;
                                                                int i24 = 0;
                                                                while (true) {
                                                                    long j11 = jArr10[i24];
                                                                    i13 = i21;
                                                                    i14 = i22;
                                                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i25 = 8 - ((~(i24 - length2)) >>> 31);
                                                                        int i26 = 0;
                                                                        while (i26 < i25) {
                                                                            if ((j11 & 255) < 128) {
                                                                                jArr8 = jArr10;
                                                                                c6074u.c(objArr8[(i24 << 3) + i26]);
                                                                                z10 = true;
                                                                            } else {
                                                                                jArr8 = jArr10;
                                                                            }
                                                                            j11 >>= 8;
                                                                            i26++;
                                                                            jArr10 = jArr8;
                                                                        }
                                                                        jArr7 = jArr10;
                                                                        if (i25 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr7 = jArr10;
                                                                    }
                                                                    if (i24 == length2) {
                                                                        break;
                                                                    }
                                                                    i24++;
                                                                    i21 = i13;
                                                                    i22 = i14;
                                                                    jArr10 = jArr7;
                                                                }
                                                            }
                                                        } else {
                                                            i13 = i21;
                                                            i14 = i22;
                                                            i15 = i19;
                                                            i16 = length;
                                                            c6074u.c(f12);
                                                            z10 = true;
                                                        }
                                                    }
                                                    i13 = i21;
                                                    i14 = i22;
                                                    i15 = i19;
                                                    i16 = length;
                                                } else {
                                                    i13 = i21;
                                                    i14 = i22;
                                                    i15 = i19;
                                                    i16 = length;
                                                    c2104h.b(j10);
                                                }
                                            } else {
                                                i13 = i21;
                                                i14 = i22;
                                                str2 = str3;
                                                c2105i8 = c2105i9;
                                                i15 = i19;
                                                i16 = length;
                                                jArr6 = jArr9;
                                                objArr5 = objArr7;
                                            }
                                            j6 >>= 8;
                                            i22 = i14 + 1;
                                            objArr7 = objArr5;
                                            jArr9 = jArr6;
                                            str3 = str2;
                                            c2105i9 = c2105i8;
                                            i19 = i15;
                                            length = i16;
                                            i21 = i13;
                                        }
                                        str = str3;
                                        c2105i7 = c2105i9;
                                        i11 = i19;
                                        int i27 = length;
                                        jArr5 = jArr9;
                                        objArr4 = objArr7;
                                        if (i21 != 8) {
                                            break;
                                        }
                                        length = i27;
                                    } else {
                                        str = str3;
                                        c2105i7 = c2105i9;
                                        i11 = i19;
                                        jArr5 = jArr9;
                                        objArr4 = objArr7;
                                    }
                                    if (i20 == length) {
                                        break;
                                    }
                                    i20++;
                                    i18 = i12;
                                    objArr7 = objArr4;
                                    jArr9 = jArr5;
                                    str3 = str;
                                    c2105i9 = c2105i7;
                                    i19 = i11;
                                }
                            }
                        } else {
                            i12 = i18;
                            objArr3 = objArr6;
                            o1Var = o1Var2;
                            str = str3;
                            c2105i7 = c2105i9;
                            i11 = i19;
                            Z.J j12 = (Z.J) f11;
                            Object obj5 = hashMap4.get(j12);
                            Z.I i28 = (Z.I) j12;
                            Z0 z03 = i28.f22500h0;
                            if (z03 == null) {
                                z03 = o1Var;
                            }
                            if (!z03.a(i28.i().f22496f, obj5)) {
                                Object f13 = c2105i10.f25570a.f(j12);
                                if (f13 != null) {
                                    if (f13 instanceof C6074u) {
                                        C6074u c6074u4 = (C6074u) f13;
                                        Object[] objArr9 = c6074u4.f47643b;
                                        long[] jArr11 = c6074u4.f47642a;
                                        int length3 = jArr11.length - 2;
                                        if (length3 >= 0) {
                                            int i29 = 0;
                                            while (true) {
                                                long j13 = jArr11[i29];
                                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i30 = 8 - ((~(i29 - length3)) >>> 31);
                                                    for (int i31 = 0; i31 < i30; i31++) {
                                                        if ((j13 & 255) < 128) {
                                                            c6074u.c(objArr9[(i29 << 3) + i31]);
                                                            z10 = true;
                                                        }
                                                        j13 >>= 8;
                                                    }
                                                    if (i30 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i29 == length3) {
                                                    break;
                                                }
                                                i29++;
                                            }
                                        }
                                    } else {
                                        c6074u.c(f13);
                                        z10 = true;
                                    }
                                }
                            } else {
                                c2104h.b(j12);
                            }
                        }
                        f10 = c2105i10.f25570a.f(obj3);
                        if (f10 != null) {
                            if (f10 instanceof C6074u) {
                                C6074u c6074u5 = (C6074u) f10;
                                Object[] objArr10 = c6074u5.f47643b;
                                long[] jArr12 = c6074u5.f47642a;
                                int length4 = jArr12.length - 2;
                                if (length4 >= 0) {
                                    int i32 = 0;
                                    while (true) {
                                        long j14 = jArr12[i32];
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i33 = 8 - ((~(i32 - length4)) >>> 31);
                                            for (int i34 = 0; i34 < i33; i34++) {
                                                if ((j14 & 255) < 128) {
                                                    c6074u.c(objArr10[(i32 << 3) + i34]);
                                                    z10 = true;
                                                }
                                                j14 >>= 8;
                                            }
                                            if (i33 != 8) {
                                                break;
                                            }
                                        }
                                        if (i32 != length4) {
                                            i32++;
                                        }
                                    }
                                }
                            } else {
                                c6074u.c(f10);
                                z10 = true;
                            }
                        }
                    }
                    i12 = i18;
                    objArr3 = objArr6;
                    o1Var = o1Var2;
                    str = str3;
                    c2105i7 = c2105i9;
                    i11 = i19;
                    f10 = c2105i10.f25570a.f(obj3);
                    if (f10 != null) {
                    }
                }
                i19 = i11 + 1;
                i17 = 2;
                objArr6 = objArr3;
                o1Var2 = o1Var;
                i18 = i12;
                str3 = str;
                c2105i9 = c2105i7;
            }
        } else {
            C2105i c2105i11 = c2105i9;
            Iterator it3 = set.iterator();
            z10 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if ((next instanceof AbstractC3883H) && !((AbstractC3883H) next).f(2)) {
                    it = it3;
                    hashMap = hashMap4;
                    c2105i = c2105i10;
                } else {
                    C2105i c2105i12 = c2105i11;
                    if (c2105i12.f25570a.b(next) && (f6 = c2105i12.f25570a.f(next)) != null) {
                        if (f6 instanceof C6074u) {
                            C6074u c6074u6 = (C6074u) f6;
                            Object[] objArr11 = c6074u6.f47643b;
                            long[] jArr13 = c6074u6.f47642a;
                            int length5 = jArr13.length - 2;
                            if (length5 >= 0) {
                                int i35 = 0;
                                while (true) {
                                    long j15 = jArr13[i35];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i36 = 8 - ((~(i35 - length5)) >>> 31);
                                        int i37 = 0;
                                        while (i37 < i36) {
                                            if ((j15 & 255) < 128) {
                                                Z.J j16 = (Z.J) objArr11[(i35 << 3) + i37];
                                                it2 = it3;
                                                AbstractC3557B.a0(str3, j16);
                                                Object obj6 = hashMap4.get(j16);
                                                c2105i3 = c2105i12;
                                                Z.I i38 = (Z.I) j16;
                                                jArr2 = jArr13;
                                                Z0 z04 = i38.f22500h0;
                                                if (z04 == null) {
                                                    z04 = o1Var2;
                                                }
                                                if (!z04.a(i38.i().f22496f, obj6)) {
                                                    Object f14 = c2105i10.f25570a.f(j16);
                                                    if (f14 != null) {
                                                        if (f14 instanceof C6074u) {
                                                            C6074u c6074u7 = (C6074u) f14;
                                                            Object[] objArr12 = c6074u7.f47643b;
                                                            long[] jArr14 = c6074u7.f47642a;
                                                            int length6 = jArr14.length - 2;
                                                            if (length6 >= 0) {
                                                                obj2 = next;
                                                                hashMap3 = hashMap4;
                                                                int i39 = 0;
                                                                while (true) {
                                                                    long j17 = jArr14[i39];
                                                                    i10 = length5;
                                                                    c2105i4 = c2105i10;
                                                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i40 = 8 - ((~(i39 - length6)) >>> 31);
                                                                        int i41 = 0;
                                                                        while (i41 < i40) {
                                                                            if ((j17 & 255) < 128) {
                                                                                jArr4 = jArr14;
                                                                                c6074u.c(objArr12[(i39 << 3) + i41]);
                                                                                z10 = true;
                                                                            } else {
                                                                                jArr4 = jArr14;
                                                                            }
                                                                            j17 >>= 8;
                                                                            i41++;
                                                                            jArr14 = jArr4;
                                                                        }
                                                                        jArr3 = jArr14;
                                                                        if (i40 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr14;
                                                                    }
                                                                    if (i39 == length6) {
                                                                        break;
                                                                    }
                                                                    i39++;
                                                                    c2105i10 = c2105i4;
                                                                    length5 = i10;
                                                                    jArr14 = jArr3;
                                                                }
                                                            }
                                                        } else {
                                                            obj2 = next;
                                                            hashMap3 = hashMap4;
                                                            i10 = length5;
                                                            c2105i4 = c2105i10;
                                                            c6074u.c(f14);
                                                            z10 = true;
                                                        }
                                                    }
                                                    obj2 = next;
                                                    hashMap3 = hashMap4;
                                                } else {
                                                    obj2 = next;
                                                    hashMap3 = hashMap4;
                                                    i10 = length5;
                                                    c2105i4 = c2105i10;
                                                    c2104h.b(j16);
                                                }
                                                j15 >>= 8;
                                                i37++;
                                                it3 = it2;
                                                jArr13 = jArr2;
                                                hashMap4 = hashMap3;
                                                next = obj2;
                                                c2105i12 = c2105i3;
                                                c2105i10 = c2105i4;
                                                length5 = i10;
                                            } else {
                                                it2 = it3;
                                                obj2 = next;
                                                hashMap3 = hashMap4;
                                                c2105i3 = c2105i12;
                                                jArr2 = jArr13;
                                            }
                                            i10 = length5;
                                            c2105i4 = c2105i10;
                                            j15 >>= 8;
                                            i37++;
                                            it3 = it2;
                                            jArr13 = jArr2;
                                            hashMap4 = hashMap3;
                                            next = obj2;
                                            c2105i12 = c2105i3;
                                            c2105i10 = c2105i4;
                                            length5 = i10;
                                        }
                                        it = it3;
                                        obj = next;
                                        hashMap2 = hashMap4;
                                        c2105i11 = c2105i12;
                                        jArr = jArr13;
                                        int i42 = length5;
                                        c2105i2 = c2105i10;
                                        if (i36 != 8) {
                                            break;
                                        }
                                        length5 = i42;
                                    } else {
                                        it = it3;
                                        obj = next;
                                        hashMap2 = hashMap4;
                                        c2105i11 = c2105i12;
                                        jArr = jArr13;
                                        c2105i2 = c2105i10;
                                    }
                                    if (i35 == length5) {
                                        break;
                                    }
                                    i35++;
                                    it3 = it;
                                    jArr13 = jArr;
                                    hashMap4 = hashMap2;
                                    next = obj;
                                    c2105i12 = c2105i11;
                                    c2105i10 = c2105i2;
                                }
                            } else {
                                it = it3;
                                obj = next;
                                hashMap2 = hashMap4;
                                c2105i11 = c2105i12;
                                c2105i2 = c2105i10;
                            }
                            hashMap = hashMap2;
                            c2105i = c2105i2;
                        } else {
                            it = it3;
                            obj = next;
                            c2105i11 = c2105i12;
                            C2105i c2105i13 = c2105i10;
                            Z.J j18 = (Z.J) f6;
                            hashMap = hashMap4;
                            Object obj7 = hashMap.get(j18);
                            Z.I i43 = (Z.I) j18;
                            Z0 z05 = i43.f22500h0;
                            if (z05 == null) {
                                z05 = o1Var2;
                            }
                            if (!z05.a(i43.i().f22496f, obj7)) {
                                c2105i = c2105i13;
                                Object f15 = c2105i.f25570a.f(j18);
                                if (f15 != null) {
                                    if (f15 instanceof C6074u) {
                                        C6074u c6074u8 = (C6074u) f15;
                                        Object[] objArr13 = c6074u8.f47643b;
                                        long[] jArr15 = c6074u8.f47642a;
                                        int length7 = jArr15.length - 2;
                                        if (length7 >= 0) {
                                            int i44 = 0;
                                            while (true) {
                                                long j19 = jArr15[i44];
                                                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i45 = 8 - ((~(i44 - length7)) >>> 31);
                                                    for (int i46 = 0; i46 < i45; i46++) {
                                                        if ((j19 & 255) < 128) {
                                                            c6074u.c(objArr13[(i44 << 3) + i46]);
                                                            z10 = true;
                                                        }
                                                        j19 >>= 8;
                                                    }
                                                    if (i45 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i44 == length7) {
                                                    break;
                                                }
                                                i44++;
                                            }
                                        }
                                    } else {
                                        c6074u.c(f15);
                                        z10 = true;
                                    }
                                }
                            } else {
                                c2105i = c2105i13;
                                c2104h.b(j18);
                            }
                        }
                    } else {
                        it = it3;
                        obj = next;
                        hashMap = hashMap4;
                        c2105i11 = c2105i12;
                        c2105i = c2105i10;
                    }
                    Object f16 = c2105i.f25570a.f(obj);
                    if (f16 != null) {
                        if (f16 instanceof C6074u) {
                            C6074u c6074u9 = (C6074u) f16;
                            Object[] objArr14 = c6074u9.f47643b;
                            long[] jArr16 = c6074u9.f47642a;
                            int length8 = jArr16.length - 2;
                            if (length8 >= 0) {
                                int i47 = 0;
                                while (true) {
                                    long j20 = jArr16[i47];
                                    if ((((~j20) << 7) & j20 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i48 = 8 - ((~(i47 - length8)) >>> 31);
                                        for (int i49 = 0; i49 < i48; i49++) {
                                            if ((j20 & 255) < 128) {
                                                c6074u.c(objArr14[(i47 << 3) + i49]);
                                                z10 = true;
                                            }
                                            j20 >>= 8;
                                        }
                                        if (i48 != 8) {
                                            break;
                                        }
                                    }
                                    if (i47 != length8) {
                                        i47++;
                                    }
                                }
                            }
                        } else {
                            c6074u.c(f16);
                            z10 = true;
                        }
                    }
                }
                hashMap4 = hashMap;
                c2105i10 = c2105i;
                it3 = it;
            }
        }
        C2105i c2105i14 = c2105i10;
        if (c2104h.l()) {
            int i50 = c2104h.f25569h0;
            if (i50 > 0) {
                Object[] objArr15 = c2104h.f25567Y;
                int i51 = 0;
                while (true) {
                    Z.J j21 = (Z.J) objArr15[i51];
                    int d10 = p.i().d();
                    Object f17 = c2105i14.f25570a.f(j21);
                    if (f17 != null) {
                        boolean z12 = f17 instanceof C6074u;
                        C6073t c6073t = this.f35947f;
                        if (z12) {
                            C6074u c6074u10 = (C6074u) f17;
                            Object[] objArr16 = c6074u10.f47643b;
                            long[] jArr17 = c6074u10.f47642a;
                            int length9 = jArr17.length - 2;
                            if (length9 >= 0) {
                                int i52 = 0;
                                while (true) {
                                    long j22 = jArr17[i52];
                                    int i53 = i52;
                                    if ((((~j22) << 7) & j22 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i54 = 8 - ((~(i53 - length9)) >>> 31);
                                        int i55 = 0;
                                        while (i55 < i54) {
                                            if ((j22 & 255) < 128) {
                                                c2105i6 = c2105i14;
                                                Object obj8 = objArr16[(i53 << 3) + i55];
                                                C6072s c6072s2 = (C6072s) c6073t.f(obj8);
                                                objArr2 = objArr15;
                                                if (c6072s2 == null) {
                                                    c6072s = new C6072s();
                                                    c6073t.l(obj8, c6072s);
                                                } else {
                                                    c6072s = c6072s2;
                                                }
                                                c(j21, d10, obj8, c6072s);
                                            } else {
                                                c2105i6 = c2105i14;
                                                objArr2 = objArr15;
                                            }
                                            j22 >>= 8;
                                            i55++;
                                            objArr15 = objArr2;
                                            c2105i14 = c2105i6;
                                        }
                                        c2105i5 = c2105i14;
                                        objArr = objArr15;
                                        if (i54 != 8) {
                                            break;
                                        }
                                    } else {
                                        c2105i5 = c2105i14;
                                        objArr = objArr15;
                                    }
                                    if (i53 == length9) {
                                        break;
                                    }
                                    i52 = i53 + 1;
                                    objArr15 = objArr;
                                    c2105i14 = c2105i5;
                                }
                            } else {
                                c2105i5 = c2105i14;
                                objArr = objArr15;
                            }
                        } else {
                            c2105i5 = c2105i14;
                            objArr = objArr15;
                            C6072s c6072s3 = (C6072s) c6073t.f(f17);
                            if (c6072s3 == null) {
                                c6072s3 = new C6072s();
                                c6073t.l(f17, c6072s3);
                            }
                            c(j21, d10, f17, c6072s3);
                        }
                    } else {
                        c2105i5 = c2105i14;
                        objArr = objArr15;
                    }
                    i51++;
                    if (i51 >= i50) {
                        break;
                    }
                    objArr15 = objArr;
                    c2105i14 = c2105i5;
                }
            }
            c2104h.f();
        }
        return z10;
    }

    public final void c(Object obj, int i10, Object obj2, C6072s c6072s) {
        int i11;
        if (this.f35951j > 0) {
            return;
        }
        int c10 = c6072s.c(obj);
        if (c10 < 0) {
            c10 = ~c10;
            i11 = -1;
        } else {
            i11 = c6072s.f47627c[c10];
        }
        c6072s.f47626b[c10] = obj;
        c6072s.f47627c[c10] = i10;
        if ((obj instanceof Z.J) && i11 != i10) {
            Z.H i12 = ((Z.I) ((Z.J) obj)).i();
            this.f35953l.put(obj, i12.f22496f);
            C6072s c6072s2 = i12.f22495e;
            C2105i c2105i = this.f35952k;
            c2105i.c(obj);
            Object[] objArr = c6072s2.f47626b;
            long[] jArr = c6072s2.f47625a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j6 = jArr[i13];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((j6 & 255) < 128) {
                                AbstractC3882G abstractC3882G = (AbstractC3882G) objArr[(i13 << 3) + i15];
                                if (abstractC3882G instanceof AbstractC3883H) {
                                    ((AbstractC3883H) abstractC3882G).g(2);
                                }
                                c2105i.a(abstractC3882G, obj);
                            }
                            j6 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        }
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        if (i11 == -1) {
            if (obj instanceof AbstractC3883H) {
                ((AbstractC3883H) obj).g(2);
            }
            this.f35946e.a(obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        C2105i c2105i = this.f35946e;
        c2105i.b(obj2, obj);
        if ((obj2 instanceof Z.J) && !c2105i.f25570a.b(obj2)) {
            this.f35952k.c(obj2);
            this.f35953l.remove(obj2);
        }
    }

    public final void e() {
        long[] jArr;
        C0578g c0578g;
        int i10;
        int i11;
        int i12;
        int i13;
        long[] jArr2;
        C0578g c0578g2;
        char c10;
        long j6;
        int i14;
        int i15;
        C0578g c0578g3 = C0578g.f5750q0;
        C6073t c6073t = this.f35947f;
        long[] jArr3 = c6073t.f47631a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i16 = 0;
            while (true) {
                long j10 = jArr3[i16];
                char c11 = 7;
                long j11 = -9187201950435737472L;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8;
                    int i18 = 8 - ((~(i16 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j10 & 255) < 128) {
                            int i20 = (i16 << 3) + i19;
                            Object obj = c6073t.f47632b[i20];
                            C6072s c6072s = (C6072s) c6073t.f47633c[i20];
                            Boolean bool = (Boolean) c0578g3.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = c6072s.f47626b;
                                int[] iArr = c6072s.f47627c;
                                long[] jArr4 = c6072s.f47625a;
                                int length2 = jArr4.length - 2;
                                c0578g2 = c0578g3;
                                jArr2 = jArr3;
                                i13 = length;
                                if (length2 >= 0) {
                                    int i21 = 0;
                                    while (true) {
                                        long j12 = jArr4[i21];
                                        i12 = i18;
                                        long[] jArr5 = jArr4;
                                        c10 = 7;
                                        j6 = -9187201950435737472L;
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j12 & 255) < 128) {
                                                    int i24 = (i21 << 3) + i23;
                                                    i15 = i16;
                                                    Object obj2 = objArr[i24];
                                                    int i25 = iArr[i24];
                                                    d(obj, obj2);
                                                } else {
                                                    i15 = i16;
                                                }
                                                j12 >>= 8;
                                                i23++;
                                                i16 = i15;
                                            }
                                            i11 = i16;
                                            if (i22 != 8) {
                                                break;
                                            }
                                        } else {
                                            i11 = i16;
                                        }
                                        if (i21 == length2) {
                                            break;
                                        }
                                        i21++;
                                        i18 = i12;
                                        jArr4 = jArr5;
                                        i16 = i11;
                                    }
                                } else {
                                    i11 = i16;
                                    i12 = i18;
                                    j6 = -9187201950435737472L;
                                    c10 = 7;
                                }
                            } else {
                                c0578g2 = c0578g3;
                                jArr2 = jArr3;
                                i13 = length;
                                i11 = i16;
                                i12 = i18;
                                c10 = c11;
                                j6 = j11;
                            }
                            if (bool.booleanValue()) {
                                c6073t.j(i20);
                            }
                            i14 = 8;
                        } else {
                            c0578g2 = c0578g3;
                            jArr2 = jArr3;
                            i13 = length;
                            i11 = i16;
                            i12 = i18;
                            c10 = c11;
                            j6 = j11;
                            i14 = i17;
                        }
                        j10 >>= i14;
                        i19++;
                        i17 = i14;
                        j11 = j6;
                        c11 = c10;
                        c0578g3 = c0578g2;
                        jArr3 = jArr2;
                        length = i13;
                        i18 = i12;
                        i16 = i11;
                    }
                    c0578g = c0578g3;
                    jArr = jArr3;
                    int i26 = length;
                    int i27 = i16;
                    if (i18 == i17) {
                        length = i26;
                        i10 = i27;
                    } else {
                        return;
                    }
                } else {
                    c0578g = c0578g3;
                    jArr = jArr3;
                    i10 = i16;
                }
                if (i10 != length) {
                    i16 = i10 + 1;
                    c0578g3 = c0578g;
                    jArr3 = jArr;
                } else {
                    return;
                }
            }
        }
    }
}
