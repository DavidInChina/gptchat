package Z;

import a0.C1904a;
import android.os.Trace;
import b0.C2097a;
import b0.C2099c;
import b0.C2105i;
import h0.C3288a;
import id.AbstractC3557B;
import j0.AbstractC3882G;
import j0.AbstractC3883H;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import jf.C3959i;
import w.C6072s;
import w.C6073t;
import w.C6074u;
import wf.AbstractC6216a;

/* renamed from: Z.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1744x implements D, I0, AbstractC1743w0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1738u f22748Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC1707e f22749Z;

    /* renamed from: j0  reason: collision with root package name */
    public final HashSet f22752j0;

    /* renamed from: k0  reason: collision with root package name */
    public final N0 f22753k0;

    /* renamed from: o0  reason: collision with root package name */
    public final C1904a f22757o0;

    /* renamed from: p0  reason: collision with root package name */
    public final C1904a f22758p0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f22761s0;

    /* renamed from: t0  reason: collision with root package name */
    public C1744x f22762t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f22763u0;

    /* renamed from: v0  reason: collision with root package name */
    public final G6.a f22764v0;

    /* renamed from: w0  reason: collision with root package name */
    public final r f22765w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f22766x0;

    /* renamed from: h0  reason: collision with root package name */
    public final AtomicReference f22750h0 = new AtomicReference(null);

    /* renamed from: i0  reason: collision with root package name */
    public final Object f22751i0 = new Object();

    /* renamed from: l0  reason: collision with root package name */
    public final C2105i f22754l0 = new C2105i();

    /* renamed from: m0  reason: collision with root package name */
    public final HashSet f22755m0 = new HashSet();

    /* renamed from: n0  reason: collision with root package name */
    public final C2105i f22756n0 = new C2105i();

    /* renamed from: q0  reason: collision with root package name */
    public final C2105i f22759q0 = new C2105i();

    /* renamed from: r0  reason: collision with root package name */
    public C2097a f22760r0 = new C2097a();

    /* JADX WARN: Type inference failed for: r0v7, types: [G6.a, java.lang.Object] */
    public C1744x(AbstractC1738u abstractC1738u, AbstractC1699a abstractC1699a) {
        this.f22748Y = abstractC1738u;
        this.f22749Z = abstractC1699a;
        HashSet hashSet = new HashSet();
        this.f22752j0 = hashSet;
        N0 n02 = new N0();
        this.f22753k0 = n02;
        C1904a c1904a = new C1904a();
        this.f22757o0 = c1904a;
        C1904a c1904a2 = new C1904a();
        this.f22758p0 = c1904a2;
        ?? obj = new Object();
        obj.f6064Y = false;
        this.f22764v0 = obj;
        r rVar = new r(abstractC1699a, abstractC1738u, n02, hashSet, c1904a, c1904a2, this);
        abstractC1738u.k(rVar);
        this.f22765w0 = rVar;
        boolean z10 = abstractC1738u instanceof E0;
        int i10 = AbstractC1717j.f22650a;
    }

    @Override // Z.AbstractC1743w0
    public final void a() {
        this.f22761s0 = true;
    }

    @Override // Z.AbstractC1743w0
    public final void b(Object obj) {
        C1741v0 z10;
        int i10;
        r rVar = this.f22765w0;
        if (rVar.f22721z <= 0 && (z10 = rVar.z()) != null) {
            int i11 = z10.f22736a | 1;
            z10.f22736a = i11;
            if ((i11 & 32) == 0) {
                C6072s c6072s = z10.f22741f;
                if (c6072s == null) {
                    c6072s = new C6072s();
                    z10.f22741f = c6072s;
                }
                int i12 = z10.f22740e;
                int c10 = c6072s.c(obj);
                if (c10 < 0) {
                    c10 = ~c10;
                    i10 = -1;
                } else {
                    i10 = c6072s.f47627c[c10];
                }
                c6072s.f47626b[c10] = obj;
                c6072s.f47627c[c10] = i12;
                if (i10 != z10.f22740e) {
                    if (obj instanceof J) {
                        C6073t c6073t = z10.f22742g;
                        if (c6073t == null) {
                            c6073t = new C6073t();
                            z10.f22742g = c6073t;
                        }
                        c6073t.l(obj, ((I) ((J) obj)).i().f22496f);
                    }
                } else {
                    return;
                }
            }
            if (obj instanceof AbstractC3883H) {
                ((AbstractC3883H) obj).g(1);
            }
            this.f22754l0.a(obj, z10);
            if (obj instanceof J) {
                C2105i c2105i = this.f22756n0;
                c2105i.c(obj);
                C6072s c6072s2 = ((I) ((J) obj)).i().f22495e;
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
                                if ((255 & j6) < 128) {
                                    AbstractC3882G abstractC3882G = (AbstractC3882G) objArr[(i13 << 3) + i15];
                                    if (abstractC3882G instanceof AbstractC3883H) {
                                        ((AbstractC3883H) abstractC3882G).g(1);
                                    }
                                    c2105i.a(abstractC3882G, obj);
                                }
                                j6 >>= 8;
                            }
                            if (i14 != 8) {
                                return;
                            }
                        }
                        if (i13 != length) {
                            i13++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // Z.AbstractC1743w0
    public final int c(C1741v0 c1741v0, Object obj) {
        C1744x c1744x;
        int i10 = c1741v0.f22736a;
        if ((i10 & 2) != 0) {
            c1741v0.f22736a = i10 | 4;
        }
        C1705d c1705d = c1741v0.f22738c;
        if (c1705d != null && c1705d.a()) {
            if (!this.f22753k0.I(c1705d)) {
                synchronized (this.f22751i0) {
                    c1744x = this.f22762t0;
                }
                if (c1744x != null) {
                    r rVar = c1744x.f22765w0;
                    if (rVar.f22685E && rVar.b0(c1741v0, obj)) {
                        return 4;
                    }
                }
                return 1;
            } else if (c1741v0.f22739d != null) {
                return t(c1741v0, c1705d, obj);
            }
        }
        return 1;
    }

    @Override // Z.AbstractC1736t
    public final void d(wf.n nVar) {
        n((C3288a) nVar);
    }

    @Override // Z.AbstractC1736t
    public final void dispose() {
        boolean z10;
        synchronized (this.f22751i0) {
            try {
                r rVar = this.f22765w0;
                if (!rVar.f22685E) {
                    if (!this.f22766x0) {
                        this.f22766x0 = true;
                        int i10 = AbstractC1717j.f22650a;
                        C1904a c1904a = rVar.f22691K;
                        if (c1904a != null) {
                            i(c1904a);
                        }
                        if (this.f22753k0.f22521Z > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 || (!this.f22752j0.isEmpty())) {
                            C1742w c1742w = new C1742w(this.f22752j0);
                            if (z10) {
                                this.f22749Z.getClass();
                                Q0 y10 = this.f22753k0.y();
                                AbstractC1734s.n(y10, c1742w);
                                y10.e();
                                this.f22749Z.clear();
                                this.f22749Z.h();
                                c1742w.b();
                            }
                            c1742w.a();
                        }
                        r rVar2 = this.f22765w0;
                        rVar2.getClass();
                        Trace.beginSection("Compose:Composer.dispose");
                        rVar2.f22697b.n(rVar2);
                        rVar2.f22684D.f22652a.clear();
                        rVar2.f22713r.clear();
                        rVar2.f22700e.f23806a.b();
                        rVar2.f22716u = null;
                        rVar2.f22696a.clear();
                        Trace.endSection();
                    }
                } else {
                    throw new IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.".toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f22748Y.o(this);
    }

    public final void e() {
        this.f22750h0.set(null);
        this.f22757o0.f23806a.b();
        this.f22758p0.f23806a.b();
        this.f22752j0.clear();
    }

    public final HashSet f(HashSet hashSet, Object obj, boolean z10) {
        HashSet hashSet2;
        int i10;
        Object f6 = this.f22754l0.f25570a.f(obj);
        if (f6 != null) {
            boolean z11 = f6 instanceof C6074u;
            HashSet hashSet3 = this.f22755m0;
            C2105i c2105i = this.f22759q0;
            if (z11) {
                C6074u c6074u = (C6074u) f6;
                Object[] objArr = c6074u.f47643b;
                long[] jArr = c6074u.f47642a;
                int length = jArr.length - 2;
                HashSet hashSet4 = hashSet;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j6 = jArr[i11];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j6 & 255) < 128) {
                                    C1741v0 c1741v0 = (C1741v0) objArr[(i11 << 3) + i14];
                                    if (!c2105i.b(obj, c1741v0) && c1741v0.b(obj) != 1) {
                                        if (c1741v0.f22742g != null && !z10) {
                                            hashSet3.add(c1741v0);
                                        } else {
                                            if (hashSet4 == null) {
                                                hashSet4 = new HashSet();
                                            }
                                            hashSet4.add(c1741v0);
                                        }
                                    }
                                    i10 = 8;
                                } else {
                                    i10 = i12;
                                }
                                j6 >>= i10;
                                i14++;
                                i12 = i10;
                            }
                            if (i13 != i12) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
                return hashSet4;
            }
            C1741v0 c1741v02 = (C1741v0) f6;
            if (!c2105i.b(obj, c1741v02) && c1741v02.b(obj) != 1) {
                if (c1741v02.f22742g != null && !z10) {
                    hashSet3.add(c1741v02);
                } else {
                    if (hashSet == null) {
                        hashSet2 = new HashSet();
                    } else {
                        hashSet2 = hashSet;
                    }
                    hashSet2.add(c1741v02);
                    return hashSet2;
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x022c, code lost:
        if (r15.b() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024e, code lost:
        if (r12.contains(r15) == true) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01dd, code lost:
        if (r12.contains(r9) == true) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Set set, boolean z10) {
        HashSet hashSet;
        String str;
        long[] jArr;
        long[] jArr2;
        int i10;
        int i11;
        long j6;
        String str2;
        boolean z11;
        Object[] objArr;
        int i12;
        String str3;
        Object[] objArr2;
        String str4;
        long[] jArr3;
        boolean z12;
        int i13;
        long j10;
        int i14;
        String str5;
        int i15;
        int i16;
        long[] jArr4;
        Object[] objArr3;
        Object[] objArr4;
        int i17;
        long j11;
        boolean z13 = set instanceof C2099c;
        C2105i c2105i = this.f22756n0;
        char c10 = 7;
        Object obj = null;
        if (z13) {
            C2099c c2099c = (C2099c) set;
            Object[] objArr5 = c2099c.f25559Z;
            int i18 = c2099c.f25558Y;
            hashSet = null;
            int i19 = 0;
            while (i19 < i18) {
                Object obj2 = objArr5[i19];
                AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj2);
                if (obj2 instanceof C1741v0) {
                    ((C1741v0) obj2).b(obj);
                } else {
                    HashSet f6 = f(hashSet, obj2, z10);
                    Object f10 = c2105i.f25570a.f(obj2);
                    if (f10 != null) {
                        if (f10 instanceof C6074u) {
                            C6074u c6074u = (C6074u) f10;
                            Object[] objArr6 = c6074u.f47643b;
                            long[] jArr5 = c6074u.f47642a;
                            int length = jArr5.length - 2;
                            if (length >= 0) {
                                int i20 = length;
                                int i21 = 0;
                                while (true) {
                                    long j12 = jArr5[i21];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i22 = 8 - ((~(i21 - i20)) >>> 31);
                                        for (int i23 = 0; i23 < i22; i23++) {
                                            if ((j12 & 255) < 128) {
                                                f6 = f(f6, (J) objArr6[(i21 << 3) + i23], z10);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i22 != 8) {
                                            break;
                                        }
                                    }
                                    int i24 = i20;
                                    if (i21 == i24) {
                                        break;
                                    }
                                    i21++;
                                    i20 = i24;
                                }
                            }
                        } else {
                            hashSet = f(f6, (J) f10, z10);
                        }
                    }
                    hashSet = f6;
                }
                i19++;
                obj = null;
            }
        } else {
            hashSet = null;
            for (Object obj3 : set) {
                if (obj3 instanceof C1741v0) {
                    ((C1741v0) obj3).b(null);
                } else {
                    HashSet f11 = f(hashSet, obj3, z10);
                    Object f12 = c2105i.f25570a.f(obj3);
                    if (f12 != null) {
                        if (f12 instanceof C6074u) {
                            C6074u c6074u2 = (C6074u) f12;
                            Object[] objArr7 = c6074u2.f47643b;
                            long[] jArr6 = c6074u2.f47642a;
                            int length2 = jArr6.length - 2;
                            if (length2 >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j13 = jArr6[i25];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length2)) >>> 31);
                                        for (int i27 = 0; i27 < i26; i27++) {
                                            if ((j13 & 255) < 128) {
                                                f11 = f(f11, (J) objArr7[(i25 << 3) + i27], z10);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i26 != 8) {
                                            break;
                                        }
                                    }
                                    if (i25 == length2) {
                                        break;
                                    }
                                    i25++;
                                }
                            }
                        } else {
                            hashSet = f(f11, (J) f12, z10);
                        }
                    }
                    hashSet = f11;
                }
            }
        }
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>";
        C2105i c2105i2 = this.f22754l0;
        if (z10) {
            HashSet hashSet2 = this.f22755m0;
            if (!hashSet2.isEmpty()) {
                C6073t c6073t = c2105i2.f25570a;
                long[] jArr7 = c6073t.f47631a;
                int length3 = jArr7.length - 2;
                if (length3 >= 0) {
                    int i28 = 0;
                    while (true) {
                        long j14 = jArr7[i28];
                        int i29 = length3;
                        if ((((~j14) << c10) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i30 = 8 - ((~(i28 - i29)) >>> 31);
                            int i31 = 0;
                            while (i31 < i30) {
                                if ((j14 & 255) < 128) {
                                    int i32 = (i28 << 3) + i31;
                                    Object obj4 = c6073t.f47632b[i32];
                                    Object obj5 = c6073t.f47633c[i32];
                                    if (obj5 instanceof C6074u) {
                                        AbstractC3557B.a0(str6, obj5);
                                        C6074u c6074u3 = (C6074u) obj5;
                                        Object[] objArr8 = c6074u3.f47643b;
                                        long[] jArr8 = c6074u3.f47642a;
                                        int length4 = jArr8.length - 2;
                                        if (length4 >= 0) {
                                            jArr4 = jArr7;
                                            i16 = i30;
                                            i15 = i31;
                                            int i33 = 0;
                                            while (true) {
                                                long j15 = jArr8[i33];
                                                Object[] objArr9 = objArr8;
                                                long[] jArr9 = jArr8;
                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i34 = 8 - ((~(i33 - length4)) >>> 31);
                                                    Object[] objArr10 = objArr9;
                                                    str5 = str6;
                                                    int i35 = 0;
                                                    while (i35 < i34) {
                                                        if ((j15 & 255) < 128) {
                                                            i17 = i28;
                                                            int i36 = (i33 << 3) + i35;
                                                            objArr4 = objArr10;
                                                            C1741v0 c1741v0 = (C1741v0) objArr10[i36];
                                                            if (!hashSet2.contains(c1741v0)) {
                                                                if (hashSet != null) {
                                                                    j11 = j14;
                                                                }
                                                            } else {
                                                                j11 = j14;
                                                            }
                                                            c6074u3.h(i36);
                                                            j15 >>= 8;
                                                            i35++;
                                                            i28 = i17;
                                                            objArr10 = objArr4;
                                                            j14 = j11;
                                                        } else {
                                                            objArr4 = objArr10;
                                                            i17 = i28;
                                                        }
                                                        j11 = j14;
                                                        j15 >>= 8;
                                                        i35++;
                                                        i28 = i17;
                                                        objArr10 = objArr4;
                                                        j14 = j11;
                                                    }
                                                    objArr3 = objArr10;
                                                    i14 = i28;
                                                    j10 = j14;
                                                    if (i34 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    i14 = i28;
                                                    j10 = j14;
                                                    objArr3 = objArr9;
                                                    str5 = str6;
                                                }
                                                if (i33 == length4) {
                                                    break;
                                                }
                                                i33++;
                                                str6 = str5;
                                                jArr8 = jArr9;
                                                i28 = i14;
                                                objArr8 = objArr3;
                                                j14 = j10;
                                            }
                                        } else {
                                            str5 = str6;
                                            jArr4 = jArr7;
                                            i16 = i30;
                                            i15 = i31;
                                            i14 = i28;
                                            j10 = j14;
                                        }
                                    } else {
                                        str5 = str6;
                                        jArr4 = jArr7;
                                        i16 = i30;
                                        i15 = i31;
                                        i14 = i28;
                                        j10 = j14;
                                        AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1", obj5);
                                        C1741v0 c1741v02 = (C1741v0) obj5;
                                        if (!hashSet2.contains(c1741v02)) {
                                            if (hashSet != null) {
                                            }
                                        }
                                        c6073t.j(i32);
                                        j14 = j10 >> 8;
                                        i31 = i15 + 1;
                                        jArr7 = jArr4;
                                        i30 = i16;
                                        str6 = str5;
                                        i28 = i14;
                                    }
                                } else {
                                    str5 = str6;
                                    jArr4 = jArr7;
                                    i16 = i30;
                                    i15 = i31;
                                    i14 = i28;
                                    j10 = j14;
                                }
                                j14 = j10 >> 8;
                                i31 = i15 + 1;
                                jArr7 = jArr4;
                                i30 = i16;
                                str6 = str5;
                                i28 = i14;
                            }
                            str4 = str6;
                            jArr3 = jArr7;
                            int i37 = i28;
                            z12 = true;
                            if (i30 != 8) {
                                break;
                            }
                            length3 = i29;
                            i13 = i37;
                        } else {
                            str4 = str6;
                            jArr3 = jArr7;
                            z12 = true;
                            length3 = i29;
                            i13 = i28;
                        }
                        if (i13 == length3) {
                            break;
                        }
                        i28 = i13 + 1;
                        c10 = 7;
                        jArr7 = jArr3;
                        str6 = str4;
                    }
                }
                hashSet2.clear();
                l();
                return;
            }
        }
        String str7 = str6;
        if (hashSet != null) {
            C6073t c6073t2 = c2105i2.f25570a;
            long[] jArr10 = c6073t2.f47631a;
            int length5 = jArr10.length - 2;
            if (length5 >= 0) {
                int i38 = 0;
                while (true) {
                    long j16 = jArr10[i38];
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i39 = 8 - ((~(i38 - length5)) >>> 31);
                        int i40 = 0;
                        while (i40 < i39) {
                            if ((j16 & 255) < 128) {
                                int i41 = (i38 << 3) + i40;
                                Object obj6 = c6073t2.f47632b[i41];
                                Object obj7 = c6073t2.f47633c[i41];
                                if (obj7 instanceof C6074u) {
                                    String str8 = str7;
                                    AbstractC3557B.a0(str8, obj7);
                                    C6074u c6074u4 = (C6074u) obj7;
                                    Object[] objArr11 = c6074u4.f47643b;
                                    long[] jArr11 = c6074u4.f47642a;
                                    int length6 = jArr11.length - 2;
                                    jArr2 = jArr10;
                                    i10 = length5;
                                    i11 = i38;
                                    if (length6 >= 0) {
                                        int i42 = 0;
                                        while (true) {
                                            long j17 = jArr11[i42];
                                            j6 = j16;
                                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i43 = 8 - ((~(i42 - length6)) >>> 31);
                                                i12 = length6;
                                                int i44 = 0;
                                                while (i44 < i43) {
                                                    if ((j17 & 255) < 128) {
                                                        str3 = str8;
                                                        int i45 = (i42 << 3) + i44;
                                                        objArr2 = objArr11;
                                                        if (hashSet.contains((C1741v0) objArr11[i45])) {
                                                            c6074u4.h(i45);
                                                        }
                                                    } else {
                                                        str3 = str8;
                                                        objArr2 = objArr11;
                                                    }
                                                    j17 >>= 8;
                                                    i44++;
                                                    str8 = str3;
                                                    objArr11 = objArr2;
                                                }
                                                str2 = str8;
                                                objArr = objArr11;
                                                if (i43 != 8) {
                                                    break;
                                                }
                                            } else {
                                                i12 = length6;
                                                str2 = str8;
                                                objArr = objArr11;
                                            }
                                            if (i42 == i12) {
                                                break;
                                            }
                                            i42++;
                                            length6 = i12;
                                            j16 = j6;
                                            str8 = str2;
                                            objArr11 = objArr;
                                        }
                                    } else {
                                        j6 = j16;
                                        str2 = str8;
                                    }
                                    z11 = c6074u4.b();
                                } else {
                                    jArr2 = jArr10;
                                    i10 = length5;
                                    i11 = i38;
                                    j6 = j16;
                                    str2 = str7;
                                    AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1", obj7);
                                    z11 = hashSet.contains((C1741v0) obj7);
                                }
                                if (z11) {
                                    c6073t2.j(i41);
                                }
                            } else {
                                jArr2 = jArr10;
                                i10 = length5;
                                i11 = i38;
                                j6 = j16;
                                str2 = str7;
                            }
                            j16 = j6 >> 8;
                            i40++;
                            length5 = i10;
                            i38 = i11;
                            jArr10 = jArr2;
                            str7 = str2;
                        }
                        jArr = jArr10;
                        int i46 = length5;
                        int i47 = i38;
                        str = str7;
                        if (i39 != 8) {
                            break;
                        }
                        length5 = i46;
                        i38 = i47;
                    } else {
                        jArr = jArr10;
                        str = str7;
                    }
                    if (i38 == length5) {
                        break;
                    }
                    i38++;
                    jArr10 = jArr;
                    str7 = str;
                }
            }
            l();
        }
    }

    public final void h() {
        synchronized (this.f22751i0) {
            try {
                i(this.f22757o0);
                q();
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f22752j0.isEmpty()) {
                            HashSet hashSet = this.f22752j0;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!hashSet.isEmpty()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        it.remove();
                                        ((G0) it.next()).a();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        e();
                        throw e10;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (((Z.C1741v0) r11).a() == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(C1904a c1904a) {
        C1904a c1904a2;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        C1904a c1904a3;
        C1904a c1904a4;
        long[] jArr;
        int i10;
        int i11;
        int i12;
        long[] jArr2;
        C1904a c1904a5;
        long j6;
        char c10;
        int i13;
        long[] jArr3;
        long[] jArr4;
        AbstractC1707e abstractC1707e = this.f22749Z;
        C1904a c1904a6 = this.f22758p0;
        C1742w c1742w = new C1742w(this.f22752j0);
        try {
            if (c1904a.f23806a.d()) {
                if (c1904a6.f23806a.d()) {
                    c1742w.a();
                    return;
                }
                return;
            }
            Trace.beginSection("Compose:applyChanges");
            try {
                abstractC1707e.getClass();
                Q0 y10 = this.f22753k0.y();
                try {
                    c1904a.a(abstractC1707e, y10, c1742w);
                    y10.e();
                    abstractC1707e.h();
                    Trace.endSection();
                    c1742w.b();
                    ArrayList arrayList = c1742w.f22746d;
                    int i14 = 0;
                    if (!arrayList.isEmpty()) {
                        Trace.beginSection("Compose:sideeffects");
                        int size = arrayList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            ((AbstractC6216a) arrayList.get(i15)).mo122invoke();
                        }
                        arrayList.clear();
                        Trace.endSection();
                    }
                    if (this.f22761s0) {
                        try {
                            try {
                                Trace.beginSection("Compose:unobserve");
                                try {
                                    this.f22761s0 = false;
                                    C6073t c6073t = this.f22754l0.f25570a;
                                    long[] jArr5 = c6073t.f47631a;
                                    int length = jArr5.length - 2;
                                    if (length >= 0) {
                                        int i16 = 0;
                                        while (true) {
                                            long j10 = jArr5[i16];
                                            char c11 = 7;
                                            long j11 = -9187201950435737472L;
                                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i17 = 8;
                                                int i18 = 8 - ((~(i16 - length)) >>> 31);
                                                int i19 = i14;
                                                while (i19 < i18) {
                                                    if ((j10 & 255) < 128) {
                                                        int i20 = (i16 << 3) + i19;
                                                        Object obj = c6073t.f47632b[i20];
                                                        Object obj2 = c6073t.f47633c[i20];
                                                        if (obj2 instanceof C6074u) {
                                                            AbstractC3557B.a0("null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>", obj2);
                                                            C6074u c6074u = (C6074u) obj2;
                                                            Object[] objArr = c6074u.f47643b;
                                                            long[] jArr6 = c6074u.f47642a;
                                                            int length2 = jArr6.length - 2;
                                                            jArr2 = jArr5;
                                                            c1904a5 = c1904a6;
                                                            if (length2 >= 0) {
                                                                int i21 = 0;
                                                                while (true) {
                                                                    try {
                                                                        long j12 = jArr6[i21];
                                                                        i12 = length;
                                                                        i11 = i16;
                                                                        c10 = 7;
                                                                        j6 = -9187201950435737472L;
                                                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                            int i23 = 0;
                                                                            while (i23 < i22) {
                                                                                if ((j12 & 255) < 128) {
                                                                                    jArr4 = jArr6;
                                                                                    int i24 = (i21 << 3) + i23;
                                                                                    if (!((C1741v0) objArr[i24]).a()) {
                                                                                        c6074u.h(i24);
                                                                                    }
                                                                                } else {
                                                                                    jArr4 = jArr6;
                                                                                }
                                                                                j12 >>= 8;
                                                                                i23++;
                                                                                jArr6 = jArr4;
                                                                            }
                                                                            jArr3 = jArr6;
                                                                            if (i22 != 8) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            jArr3 = jArr6;
                                                                        }
                                                                        if (i21 == length2) {
                                                                            break;
                                                                        }
                                                                        i21++;
                                                                        length = i12;
                                                                        i16 = i11;
                                                                        jArr6 = jArr3;
                                                                    } catch (Throwable th5) {
                                                                        th4 = th5;
                                                                        Trace.endSection();
                                                                        throw th4;
                                                                    }
                                                                }
                                                            } else {
                                                                i12 = length;
                                                                i11 = i16;
                                                                c10 = 7;
                                                                j6 = -9187201950435737472L;
                                                            }
                                                            if (c6074u.b()) {
                                                                c6073t.j(i20);
                                                            }
                                                            i13 = 8;
                                                        } else {
                                                            jArr2 = jArr5;
                                                            c1904a5 = c1904a6;
                                                            i12 = length;
                                                            i11 = i16;
                                                            c10 = c11;
                                                            j6 = -9187201950435737472L;
                                                            AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1", obj2);
                                                        }
                                                    } else {
                                                        jArr2 = jArr5;
                                                        c1904a5 = c1904a6;
                                                        i12 = length;
                                                        i11 = i16;
                                                        c10 = c11;
                                                        j6 = j11;
                                                        i13 = i17;
                                                    }
                                                    j10 >>= i13;
                                                    i19++;
                                                    i17 = i13;
                                                    c11 = c10;
                                                    j11 = j6;
                                                    c1904a6 = c1904a5;
                                                    jArr5 = jArr2;
                                                    length = i12;
                                                    i16 = i11;
                                                }
                                                jArr = jArr5;
                                                c1904a3 = c1904a6;
                                                int i25 = length;
                                                int i26 = i16;
                                                if (i18 != i17) {
                                                    break;
                                                }
                                                length = i25;
                                                i10 = i26;
                                            } else {
                                                jArr = jArr5;
                                                c1904a3 = c1904a6;
                                                i10 = i16;
                                            }
                                            if (i10 == length) {
                                                break;
                                            }
                                            i16 = i10 + 1;
                                            c1904a6 = c1904a3;
                                            jArr5 = jArr;
                                            i14 = 0;
                                        }
                                    } else {
                                        c1904a3 = c1904a6;
                                    }
                                    l();
                                    Trace.endSection();
                                    c1904a4 = c1904a3;
                                } catch (Throwable th6) {
                                    th4 = th6;
                                }
                            } catch (Throwable th7) {
                                th2 = th7;
                                c1904a2 = c1904a6;
                                if (c1904a2.f23806a.d()) {
                                    c1742w.a();
                                }
                                throw th2;
                            }
                        } catch (Throwable th8) {
                            th2 = th8;
                            c1904a2 = c1904a6;
                            if (c1904a2.f23806a.d()) {
                            }
                            throw th2;
                        }
                    } else {
                        c1904a4 = c1904a6;
                    }
                    if (c1904a4.f23806a.d()) {
                        c1742w.a();
                    }
                } catch (Throwable th9) {
                    c1904a2 = c1904a6;
                    try {
                        y10.e();
                        throw th9;
                    } catch (Throwable th10) {
                        th3 = th10;
                        try {
                            Trace.endSection();
                            throw th3;
                        } catch (Throwable th11) {
                            th2 = th11;
                            if (c1904a2.f23806a.d()) {
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th12) {
                th3 = th12;
                c1904a2 = c1904a6;
            }
        } catch (Throwable th13) {
            th2 = th13;
            c1904a2 = c1904a6;
        }
    }

    public final void j() {
        synchronized (this.f22751i0) {
            try {
                if (this.f22758p0.f23806a.e()) {
                    i(this.f22758p0);
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f22752j0.isEmpty()) {
                        HashSet hashSet = this.f22752j0;
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        if (!hashSet.isEmpty()) {
                            Trace.beginSection("Compose:abandons");
                            try {
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    it.remove();
                                    ((G0) it.next()).a();
                                }
                                Trace.endSection();
                            } catch (Throwable th3) {
                                Trace.endSection();
                                throw th3;
                            }
                        }
                    }
                    throw th2;
                } catch (Exception e10) {
                    e();
                    throw e10;
                } finally {
                }
            }
        }
    }

    public final void k() {
        synchronized (this.f22751i0) {
            try {
                this.f22765w0.f22716u = null;
                if (!this.f22752j0.isEmpty()) {
                    HashSet hashSet = this.f22752j0;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            ((G0) it.next()).a();
                        }
                        Trace.endSection();
                    }
                }
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f22752j0.isEmpty()) {
                            HashSet hashSet2 = this.f22752j0;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!hashSet2.isEmpty()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = hashSet2.iterator();
                                    while (it2.hasNext()) {
                                        it2.remove();
                                        ((G0) it2.next()).a();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        e();
                        throw e10;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
        if (r5.b() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
        if (r10.f25570a.b((Z.J) r5) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f7, code lost:
        r1.j(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fa, code lost:
        r2 = 8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        boolean z10;
        long[] jArr;
        int i10;
        long j6;
        int i11;
        int i12;
        long[] jArr2;
        long j10;
        int i13;
        long[] jArr3;
        Object[] objArr;
        long[] jArr4;
        Object[] objArr2;
        C6073t c6073t = this.f22756n0.f25570a;
        long[] jArr5 = c6073t.f47631a;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j11 = jArr5[i14];
                long j12 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            int i18 = (i14 << 3) + i17;
                            Object obj = c6073t.f47632b[i18];
                            Object obj2 = c6073t.f47633c[i18];
                            boolean z11 = obj2 instanceof C6074u;
                            C2105i c2105i = this.f22754l0;
                            if (z11) {
                                AbstractC3557B.a0("null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>", obj2);
                                C6074u c6074u = (C6074u) obj2;
                                Object[] objArr3 = c6074u.f47643b;
                                long[] jArr6 = c6074u.f47642a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i12 = length;
                                if (length2 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        long j13 = jArr6[i19];
                                        i11 = i14;
                                        j6 = j11;
                                        j10 = -9187201950435737472L;
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j13 & 255) < 128) {
                                                    int i22 = (i19 << 3) + i21;
                                                    jArr4 = jArr6;
                                                    objArr2 = objArr3;
                                                    if (!c2105i.f25570a.b((J) objArr3[i22])) {
                                                        c6074u.h(i22);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                    objArr2 = objArr3;
                                                }
                                                j13 >>= 8;
                                                i21++;
                                                objArr3 = objArr2;
                                                jArr6 = jArr4;
                                            }
                                            jArr3 = jArr6;
                                            objArr = objArr3;
                                            if (i20 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr3 = jArr6;
                                            objArr = objArr3;
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        objArr3 = objArr;
                                        i14 = i11;
                                        j11 = j6;
                                        jArr6 = jArr3;
                                    }
                                } else {
                                    i11 = i14;
                                    j6 = j11;
                                    j10 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr5;
                                i12 = length;
                                i11 = i14;
                                j6 = j11;
                                j10 = j12;
                                AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1", obj2);
                            }
                        } else {
                            jArr2 = jArr5;
                            i12 = length;
                            i11 = i14;
                            j6 = j11;
                            j10 = j12;
                            i13 = i15;
                        }
                        j11 = j6 >> i13;
                        i17++;
                        i15 = i13;
                        j12 = j10;
                        jArr5 = jArr2;
                        length = i12;
                        i14 = i11;
                    }
                    jArr = jArr5;
                    int i23 = length;
                    int i24 = i14;
                    if (i16 != i15) {
                        break;
                    }
                    length = i23;
                    i10 = i24;
                } else {
                    jArr = jArr5;
                    i10 = i14;
                }
                if (i10 == length) {
                    break;
                }
                i14 = i10 + 1;
                jArr5 = jArr;
            }
        }
        HashSet hashSet = this.f22755m0;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((C1741v0) it.next()).f22742g != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    it.remove();
                }
            }
        }
    }

    public final void m(C3288a c3288a) {
        try {
            synchronized (this.f22751i0) {
                p();
                C2097a c2097a = this.f22760r0;
                this.f22760r0 = new C2097a();
                try {
                    if (!this.f22764v0.f6064Y) {
                        this.f22748Y.getClass();
                        AbstractC3557B.K(null, null);
                    }
                    this.f22765w0.k(c2097a, c3288a);
                } catch (Exception e10) {
                    this.f22760r0 = c2097a;
                    throw e10;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f22752j0.isEmpty()) {
                    HashSet hashSet = this.f22752j0;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            ((G0) it.next()).a();
                        }
                        Trace.endSection();
                    }
                }
                throw th2;
            } catch (Exception e11) {
                e();
                throw e11;
            }
        }
    }

    public final void n(C3288a c3288a) {
        if (!this.f22766x0) {
            this.f22748Y.a(this, c3288a);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    public final void o() {
        boolean z10;
        AbstractC1707e abstractC1707e = this.f22749Z;
        N0 n02 = this.f22753k0;
        if (n02.f22521Z > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        HashSet hashSet = this.f22752j0;
        if (z10 || (true ^ hashSet.isEmpty())) {
            Trace.beginSection("Compose:deactivate");
            try {
                C1742w c1742w = new C1742w(hashSet);
                if (z10) {
                    abstractC1707e.getClass();
                    Q0 y10 = n02.y();
                    AbstractC1734s.l(y10, c1742w);
                    y10.e();
                    abstractC1707e.h();
                    c1742w.b();
                }
                c1742w.a();
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        this.f22754l0.f25570a.a();
        this.f22756n0.f25570a.a();
        C2097a c2097a = this.f22760r0;
        c2097a.f25556c = 0;
        kf.q.d3(0, r1.length, null, c2097a.f25554a);
        kf.q.d3(0, r0.length, null, c2097a.f25555b);
        this.f22757o0.f23806a.b();
        r rVar = this.f22765w0;
        rVar.f22684D.f22652a.clear();
        rVar.f22713r.clear();
        rVar.f22700e.f23806a.b();
        rVar.f22716u = null;
    }

    public final void p() {
        AtomicReference atomicReference = this.f22750h0;
        Object obj = AbstractC1746y.f22769a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (!AbstractC3557B.K(andSet, obj)) {
                if (andSet instanceof Set) {
                    g((Set) andSet, true);
                    return;
                } else if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        g(set, true);
                    }
                    return;
                } else {
                    AbstractC1734s.j("corrupt pendingModifications drain: " + atomicReference);
                    throw null;
                }
            }
            AbstractC1734s.j("pending composition has not been applied");
            throw null;
        }
    }

    public final void q() {
        AtomicReference atomicReference = this.f22750h0;
        Object andSet = atomicReference.getAndSet(null);
        if (!AbstractC3557B.K(andSet, AbstractC1746y.f22769a)) {
            if (andSet instanceof Set) {
                g((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    g(set, false);
                }
            } else if (andSet == null) {
                AbstractC1734s.j("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw null;
            } else {
                AbstractC1734s.j("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
        }
    }

    public final void r(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                ((AbstractC1704c0) ((C3959i) arrayList.get(i10)).f36155Y).getClass();
                if (!AbstractC3557B.K(null, this)) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        AbstractC1734s.o(z10);
        try {
            r rVar = this.f22765w0;
            rVar.getClass();
            rVar.C(arrayList);
            rVar.j();
        } catch (Throwable th2) {
            HashSet hashSet = this.f22752j0;
            try {
                if (!hashSet.isEmpty()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!hashSet.isEmpty()) {
                        Trace.beginSection("Compose:abandons");
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            it.remove();
                            ((G0) it.next()).a();
                        }
                        Trace.endSection();
                    }
                }
                throw th2;
            } catch (Exception e10) {
                e();
                throw e10;
            }
        }
    }

    public final void s() {
        Object[] objArr;
        C1741v0 c1741v0;
        AbstractC1743w0 abstractC1743w0;
        synchronized (this.f22751i0) {
            try {
                for (Object obj : this.f22753k0.f22522h0) {
                    if (obj instanceof C1741v0) {
                        c1741v0 = (C1741v0) obj;
                    } else {
                        c1741v0 = null;
                    }
                    if (c1741v0 != null && (abstractC1743w0 = c1741v0.f22737b) != null) {
                        abstractC1743w0.c(c1741v0, null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:4:0x0003, B:6:0x0008, B:9:0x0014, B:11:0x0018, B:13:0x001e, B:17:0x002c, B:18:0x0035, B:19:0x0036, B:20:0x003f, B:25:0x0045, B:27:0x004b, B:32:0x0056, B:33:0x005c, B:35:0x0064, B:37:0x006c, B:38:0x0070), top: B:48:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(C1741v0 c1741v0, C1705d c1705d, Object obj) {
        synchronized (this.f22751i0) {
            try {
                C1744x c1744x = this.f22762t0;
                if (c1744x != null) {
                    N0 n02 = this.f22753k0;
                    int i10 = this.f22763u0;
                    if (!n02.f22525k0) {
                        if (i10 >= 0 && i10 < n02.f22521Z) {
                            if (n02.I(c1705d)) {
                                int m10 = M3.H.m(n02.f22520Y, i10) + i10;
                                int i11 = c1705d.f22611a;
                                if (i10 <= i11 && i11 < m10) {
                                    if (c1744x == null) {
                                        r rVar = this.f22765w0;
                                        if (rVar.f22685E && rVar.b0(c1741v0, obj)) {
                                            return 4;
                                        }
                                        if (obj == null) {
                                            this.f22760r0.c(c1741v0, null);
                                        } else {
                                            C2097a c2097a = this.f22760r0;
                                            if (c2097a.a(c1741v0) >= 0) {
                                                C2099c c2099c = (C2099c) c2097a.b(c1741v0);
                                                if (c2099c != null) {
                                                    c2099c.add(obj);
                                                }
                                            } else {
                                                C2099c c2099c2 = new C2099c();
                                                c2099c2.add(obj);
                                                c2097a.c(c1741v0, c2099c2);
                                            }
                                        }
                                    }
                                    if (c1744x == null) {
                                        return c1744x.t(c1741v0, c1705d, obj);
                                    }
                                    this.f22748Y.h(this);
                                    if (this.f22765w0.f22685E) {
                                        return 3;
                                    }
                                    return 2;
                                }
                            }
                        } else {
                            AbstractC1734s.j("Invalid group index".toString());
                            throw null;
                        }
                    } else {
                        AbstractC1734s.j("Writer is active".toString());
                        throw null;
                    }
                }
                c1744x = null;
                if (c1744x == null) {
                }
                if (c1744x == null) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u(Object obj) {
        Object f6 = this.f22754l0.f25570a.f(obj);
        if (f6 != null) {
            boolean z10 = f6 instanceof C6074u;
            C2105i c2105i = this.f22759q0;
            if (z10) {
                C6074u c6074u = (C6074u) f6;
                Object[] objArr = c6074u.f47643b;
                long[] jArr = c6074u.f47642a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j6 = jArr[i10];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j6) < 128) {
                                    C1741v0 c1741v0 = (C1741v0) objArr[(i10 << 3) + i12];
                                    if (c1741v0.b(obj) == 4) {
                                        c2105i.a(obj, c1741v0);
                                    }
                                }
                                j6 >>= 8;
                            }
                            if (i11 != 8) {
                                return;
                            }
                        }
                        if (i10 != length) {
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                C1741v0 c1741v02 = (C1741v0) f6;
                if (c1741v02.b(obj) == 4) {
                    c2105i.a(obj, c1741v02);
                }
            }
        }
    }

    public final boolean v(C2099c c2099c) {
        Object[] objArr = c2099c.f25559Z;
        int i10 = c2099c.f25558Y;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj);
            if (this.f22754l0.f25570a.b(obj) || this.f22756n0.f25570a.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        boolean E10;
        synchronized (this.f22751i0) {
            try {
                p();
                C2097a c2097a = this.f22760r0;
                this.f22760r0 = new C2097a();
                try {
                    if (!this.f22764v0.f6064Y) {
                        this.f22748Y.getClass();
                        AbstractC3557B.K(null, null);
                    }
                    E10 = this.f22765w0.E(c2097a);
                    if (!E10) {
                        q();
                    }
                } catch (Exception e10) {
                    this.f22760r0 = c2097a;
                    throw e10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return E10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void x(C2099c c2099c) {
        C2099c c2099c2;
        while (true) {
            Object obj = this.f22750h0.get();
            if (obj == null || AbstractC3557B.K(obj, AbstractC1746y.f22769a)) {
                c2099c2 = c2099c;
            } else if (obj instanceof Set) {
                c2099c2 = new Set[]{obj, c2099c};
            } else if (obj instanceof Object[]) {
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = c2099c;
                c2099c2 = copyOf;
            } else {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.f22750h0).toString());
            }
            AtomicReference atomicReference = this.f22750h0;
            while (!atomicReference.compareAndSet(obj, c2099c2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f22751i0) {
                    q();
                }
                return;
            }
            return;
        }
    }

    public final void y(Object obj) {
        synchronized (this.f22751i0) {
            try {
                u(obj);
                Object f6 = this.f22756n0.f25570a.f(obj);
                if (f6 != null) {
                    if (f6 instanceof C6074u) {
                        C6074u c6074u = (C6074u) f6;
                        Object[] objArr = c6074u.f47643b;
                        long[] jArr = c6074u.f47642a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j6 = jArr[i10];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((255 & j6) < 128) {
                                            u((J) objArr[(i10 << 3) + i12]);
                                        }
                                        j6 >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    }
                                }
                                if (i10 == length) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    } else {
                        u((J) f6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
