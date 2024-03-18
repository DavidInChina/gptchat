package V1;

import E2.C0488u;
import E2.C0492y;
import N.C1025i;
import android.animation.Animator;
import android.graphics.Point;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import h7.EnumC3329c;
import id.AbstractC3557B;
import io.sentry.AbstractC3635c0;
import io.sentry.C3634c;
import io.sentry.C3653i0;
import io.sentry.D0;
import io.sentry.E0;
import io.sentry.EnumC3642e1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.navigation.SentryNavigationListener;
import io.sentry.r1;
import io.sentry.w1;
import j7.C3919i;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l7.AbstractC4341b;
import l8.AbstractC4344b;
import p2.C5064q;
import p2.C5065s;
import p2.h0;
import p2.r0;
import s2.AbstractC5530A;
import x8.j0;
import x8.k0;
import y1.AbstractC6496f;
import z2.AbstractC6758c;
import z2.C6752A;
import z2.C6757b;

/* renamed from: V1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1464e implements AbstractC6496f, s2.m, s2.n, H2.m, AbstractC4341b, AbstractC3635c0, io.sentry.util.a, E0, io.sentry.instrumentation.file.a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18180Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f18181Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f18182h0;

    public /* synthetic */ C1464e(Object obj, int i10, Object obj2) {
        this.f18180Y = i10;
        this.f18181Z = obj;
        this.f18182h0 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    @Override // H2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k0 a(int i10, h0 h0Var, int[] iArr) {
        int i11;
        boolean z10;
        Object[] objArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Point point;
        int i18;
        int i19;
        boolean z11;
        boolean z12;
        Object[] objArr2;
        int i20 = 4;
        int i21 = this.f18180Y;
        Object obj = this.f18182h0;
        Object obj2 = this.f18181Z;
        switch (i21) {
            case 12:
                H2.i iVar = (H2.i) obj2;
                j0 j0Var = H2.p.f7318i;
                int i22 = ((int[]) obj)[i10];
                int i23 = iVar.f42176n0;
                if (i23 != Integer.MAX_VALUE && (i12 = iVar.f42177o0) != Integer.MAX_VALUE) {
                    int i24 = Integer.MAX_VALUE;
                    int i25 = 0;
                    while (i25 < h0Var.f42072Y) {
                        C5065s c5065s = h0Var.f42075i0[i25];
                        int i26 = c5065s.f42324v0;
                        if (i26 > 0 && (i13 = c5065s.f42325w0) > 0) {
                            if (iVar.f42178p0) {
                                if (i26 > i13) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (i23 > i12) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z11 != z12) {
                                    i15 = i23;
                                    i14 = i12;
                                    i16 = i26 * i15;
                                    i17 = i13 * i14;
                                    if (i16 < i17) {
                                        point = new Point(i14, AbstractC5530A.f(i17, i26));
                                    } else {
                                        point = new Point(AbstractC5530A.f(i16, i13), i15);
                                    }
                                    i18 = c5065s.f42324v0;
                                    i19 = i18 * i13;
                                    if (i18 >= ((int) (point.x * 0.98f)) && i13 >= ((int) (point.y * 0.98f)) && i19 < i24) {
                                        i24 = i19;
                                    }
                                }
                            }
                            i14 = i23;
                            i15 = i12;
                            i16 = i26 * i15;
                            i17 = i13 * i14;
                            if (i16 < i17) {
                            }
                            i18 = c5065s.f42324v0;
                            i19 = i18 * i13;
                            if (i18 >= ((int) (point.x * 0.98f))) {
                                i24 = i19;
                            }
                        }
                        i25++;
                        i20 = 4;
                    }
                    i11 = i24;
                } else {
                    i20 = 4;
                    i11 = Integer.MAX_VALUE;
                }
                AbstractC4344b.T(i20, "initialCapacity");
                Object[] objArr3 = new Object[i20];
                int i27 = 0;
                int i28 = 0;
                boolean z13 = false;
                while (i27 < h0Var.f42072Y) {
                    int c10 = h0Var.f42075i0[i27].c();
                    if (i11 != Integer.MAX_VALUE && (c10 == -1 || c10 > i11)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    H2.o oVar = new H2.o(i10, h0Var, i27, iVar, iArr[i27], i22, z10);
                    int i29 = i28 + 1;
                    if (objArr3.length < i29) {
                        objArr = Arrays.copyOf(objArr3, r.f.x(objArr3.length, i29));
                    } else if (z13) {
                        objArr = (Object[]) objArr3.clone();
                    } else {
                        objArr3[i28] = oVar;
                        i27++;
                        i28++;
                    }
                    objArr3 = objArr;
                    z13 = false;
                    objArr3[i28] = oVar;
                    i27++;
                    i28++;
                }
                return x8.N.T(i28, objArr3);
            default:
                H2.i iVar2 = (H2.i) obj2;
                String str = (String) obj;
                j0 j0Var2 = H2.p.f7318i;
                x8.L l10 = x8.N.f49523Z;
                AbstractC4344b.T(4, "initialCapacity");
                Object[] objArr4 = new Object[4];
                int i30 = 0;
                int i31 = 0;
                boolean z14 = false;
                while (i30 < h0Var.f42072Y) {
                    H2.l lVar = new H2.l(i10, h0Var, i30, iVar2, iArr[i30], str);
                    int i32 = i31 + 1;
                    if (objArr4.length < i32) {
                        objArr2 = Arrays.copyOf(objArr4, r.f.x(objArr4.length, i32));
                    } else if (z14) {
                        objArr2 = (Object[]) objArr4.clone();
                    } else {
                        objArr4[i31] = lVar;
                        i30++;
                        i31++;
                    }
                    objArr4 = objArr2;
                    z14 = false;
                    objArr4[i31] = lVar;
                    i30++;
                    i31++;
                }
                return x8.N.T(i31, objArr4);
        }
    }

    @Override // io.sentry.util.a
    public final void accept(Object obj) {
        io.sentry.android.core.cache.a aVar = (io.sentry.android.core.cache.a) this.f18181Z;
        int i10 = io.sentry.android.core.cache.a.f34088n0;
        aVar.getClass();
        Long valueOf = Long.valueOf(((io.sentry.android.core.x) obj).f34260d);
        io.sentry.H logger = ((SentryAndroidOptions) this.f18182h0).getLogger();
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        logger.f(enumC3642e1, "Writing last reported ANR marker with timestamp %d", valueOf);
        r1 r1Var = aVar.f34289Y;
        String cacheDirPath = r1Var.getCacheDirPath();
        if (cacheDirPath == null) {
            r1Var.getLogger().f(enumC3642e1, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            fileOutputStream.write(String.valueOf(valueOf).getBytes(io.sentry.cache.c.f34288l0));
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th2) {
            r1Var.getLogger().d(EnumC3642e1.ERROR, "Error writing the ANR marker to the disk", th2);
        }
    }

    @Override // y1.AbstractC6496f
    public final void b() {
        e0 e0Var = (e0) this.f18182h0;
        AbstractC3557B.c0("$operation", e0Var);
        ((Animator) this.f18181Z).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + e0Var + " has been canceled.");
        }
    }

    @Override // l7.AbstractC4341b
    public final Object c() {
        int i10 = this.f18180Y;
        Object obj = this.f18182h0;
        C3919i c3919i = (C3919i) this.f18181Z;
        switch (i10) {
            case 14:
                Iterable iterable = (Iterable) obj;
                k7.k kVar = (k7.k) c3919i.f36057c;
                kVar.getClass();
                if (iterable.iterator().hasNext()) {
                    kVar.a().compileStatement("DELETE FROM events WHERE _id in " + k7.k.m(iterable)).execute();
                }
                return null;
            default:
                c3919i.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    EnumC3329c enumC3329c = EnumC3329c.INVALID_PAYLOD;
                    k7.k kVar2 = (k7.k) c3919i.f36063i;
                    kVar2.getClass();
                    kVar2.i(new z2.s(((Integer) entry.getValue()).intValue(), (String) entry.getKey(), enumC3329c));
                }
                return null;
        }
    }

    @Override // io.sentry.instrumentation.file.a
    public final Object call() {
        int i10;
        int i11 = this.f18180Y;
        Object obj = this.f18182h0;
        Object obj2 = this.f18181Z;
        switch (i11) {
            case 23:
                return Integer.valueOf(((io.sentry.instrumentation.file.d) obj2).f34382Y.read((byte[]) obj));
            case 24:
                int read = ((io.sentry.instrumentation.file.d) obj2).f34382Y.read();
                ((AtomicInteger) obj).set(read);
                if (read != -1) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                return Integer.valueOf(i10);
            default:
                byte[] bArr = (byte[]) obj;
                ((io.sentry.instrumentation.file.e) obj2).f34384Y.write(bArr);
                return Integer.valueOf(bArr.length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [U3.e, java.lang.Object] */
    @Override // s2.n
    public final void d(Object obj, C5064q c5064q) {
        p2.X x10 = (p2.X) this.f18182h0;
        AbstractC6758c abstractC6758c = (AbstractC6758c) obj;
        SparseArray sparseArray = ((z2.w) this.f18181Z).f51540j0;
        ?? obj2 = new Object();
        obj2.f17400Y = c5064q;
        SparseBooleanArray sparseBooleanArray = c5064q.f42219a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a5 = c5064q.a(i10);
            C6757b c6757b = (C6757b) sparseArray.get(a5);
            c6757b.getClass();
            sparseArray2.append(a5, c6757b);
        }
        obj2.f17401Z = sparseArray2;
        ((C6752A) abstractC6758c).d(x10, obj2);
    }

    @Override // io.sentry.AbstractC3635c0
    public final Object e() {
        C3653i0 c3653i0 = (C3653i0) this.f18182h0;
        ((Wh.p) this.f18181Z).getClass();
        try {
            try {
                return Integer.valueOf(c3653i0.m0());
            } catch (Exception unused) {
                return Long.valueOf(c3653i0.A0());
            }
        } catch (Exception unused2) {
            return Double.valueOf(c3653i0.a0());
        }
    }

    @Override // io.sentry.E0
    public final void f(io.sentry.N n10) {
        io.sentry.android.core.internal.gestures.e eVar = (io.sentry.android.core.internal.gestures.e) this.f18181Z;
        io.sentry.T t10 = (io.sentry.T) this.f18182h0;
        eVar.getClass();
        D0 d02 = (D0) n10;
        synchronized (d02.f33775n) {
            if (d02.f33763b == null) {
                ((D0) n10).b(t10);
            } else {
                eVar.f34123c.getLogger().f(EnumC3642e1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", t10.getName());
            }
        }
    }

    public final void g(io.sentry.T t10) {
        int i10 = this.f18180Y;
        Object obj = this.f18182h0;
        Object obj2 = this.f18181Z;
        switch (i10) {
            case 17:
                w1 w1Var = (w1) obj2;
                io.sentry.N n10 = (io.sentry.N) obj;
                w1Var.getClass();
                if (t10 == w1Var) {
                    ((D0) n10).a();
                    return;
                }
                return;
            case 21:
                io.sentry.N n11 = (io.sentry.N) obj;
                if (t10 == ((io.sentry.android.core.internal.gestures.e) obj2).f34125e) {
                    ((D0) n11).a();
                    return;
                }
                return;
            default:
                SentryNavigationListener sentryNavigationListener = (SentryNavigationListener) obj2;
                io.sentry.N n12 = (io.sentry.N) obj;
                AbstractC3557B.c0("this$0", sentryNavigationListener);
                AbstractC3557B.c0("$scope", n12);
                if (AbstractC3557B.K(t10, sentryNavigationListener.f34272g)) {
                    ((D0) n12).a();
                    return;
                }
                return;
        }
    }

    public final void h(s3.z zVar) {
        String str;
        r1 r1Var = (r1) this.f18181Z;
        io.sentry.N n10 = (io.sentry.N) this.f18182h0;
        C3634c c3634c = (C3634c) zVar.f45398e;
        if (c3634c == null) {
            c3634c = new C3634c(r1Var.getLogger());
            zVar.f45398e = c3634c;
        }
        if (c3634c.f34281c) {
            D0 d02 = (D0) n10;
            s3.z zVar2 = d02.f33779r;
            io.sentry.protocol.C c10 = d02.f33765d;
            c3634c.d("sentry-trace_id", ((io.sentry.protocol.s) zVar2.f45394a).toString());
            c3634c.d("sentry-public_key", (String) new s3.z(r1Var.getDsn()).f45397d);
            c3634c.d("sentry-release", r1Var.getRelease());
            c3634c.d("sentry-environment", r1Var.getEnvironment());
            if (c10 != null) {
                str = C3634c.c(c10);
            } else {
                str = null;
            }
            c3634c.d("sentry-user_segment", str);
            c3634c.d("sentry-transaction", null);
            c3634c.d("sentry-sample_rate", null);
            c3634c.d("sentry-sampled", null);
            c3634c.f34281c = false;
        }
    }

    @Override // s2.m
    public final void invoke(Object obj) {
        int i10 = this.f18180Y;
        Object obj2 = this.f18182h0;
        switch (i10) {
            case 1:
                ((AbstractC6758c) obj).getClass();
                return;
            case 2:
                ((AbstractC6758c) obj).getClass();
                return;
            case 3:
                ((AbstractC6758c) obj).getClass();
                return;
            case 4:
                r0 r0Var = (r0) obj2;
                C6752A c6752a = (C6752A) ((AbstractC6758c) obj);
                C1025i c1025i = c6752a.f51476o;
                if (c1025i != null) {
                    C5065s c5065s = (C5065s) c1025i.f12351h0;
                    if (c5065s.f42325w0 == -1) {
                        p2.r b10 = c5065s.b();
                        b10.f42242p = r0Var.f42258Y;
                        b10.f42243q = r0Var.f42259Z;
                        c6752a.f51476o = new C1025i(c1025i.f12350Z, 2, (String) c1025i.f12352i0, new C5065s(b10));
                    }
                }
                int i11 = r0Var.f42258Y;
                return;
            case 5:
                ((AbstractC6758c) obj).getClass();
                return;
            case 6:
                ((AbstractC6758c) obj).getClass();
                return;
            case 7:
                C6757b c6757b = (C6757b) this.f18181Z;
                C0488u c0488u = (C0488u) obj2;
                C6752A c6752a2 = (C6752A) ((AbstractC6758c) obj);
                c6752a2.getClass();
                if (c6757b.f51494d != null) {
                    C5065s c5065s2 = c0488u.f4415c;
                    c5065s2.getClass();
                    C0492y c0492y = c6757b.f51494d;
                    c0492y.getClass();
                    C1025i c1025i2 = new C1025i(c0488u.f4416d, 2, c6752a2.f51463b.d(c6757b.f51492b, c0492y), c5065s2);
                    int i12 = c0488u.f4414b;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 == 3) {
                                    c6752a2.f51478q = c1025i2;
                                    return;
                                }
                                return;
                            }
                        } else {
                            c6752a2.f51477p = c1025i2;
                            return;
                        }
                    }
                    c6752a2.f51476o = c1025i2;
                    return;
                }
                return;
            case 8:
                ((AbstractC6758c) obj).getClass();
                return;
            case 9:
                ((AbstractC6758c) obj).getClass();
                return;
            default:
                ((AbstractC6758c) obj).getClass();
                return;
        }
    }
}
