package Z;

import L.C0841c0;
import b0.C2104h;
import h0.C3289b;
import j0.AbstractC3882G;
import j0.AbstractC3883H;
import j0.AbstractC3884I;
import j0.AbstractC3893i;
import nf.AbstractC4828h;
import w.C6072s;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class I extends AbstractC3883H implements J {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6216a f22499Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Z0 f22500h0;

    /* renamed from: i0  reason: collision with root package name */
    public H f22501i0 = new H();

    public I(Z0 z02, AbstractC6216a abstractC6216a) {
        this.f22499Z = abstractC6216a;
        this.f22500h0 = z02;
    }

    @Override // Z.l1
    public final Object getValue() {
        int i10 = AbstractC3893i.f35891e;
        wf.k f6 = j0.p.i().f();
        if (f6 != null) {
            f6.invoke(this);
        }
        return h((H) j0.p.h(this.f22501i0), j0.p.i(), true, this.f22499Z).f22496f;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:10:0x0027, B:12:0x0033, B:15:0x003f, B:18:0x004d, B:20:0x0060, B:22:0x006c, B:24:0x0076, B:26:0x008e, B:29:0x0097, B:35:0x00a8, B:36:0x00af), top: B:95:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H h(H h10, AbstractC3893i abstractC3893i, boolean z10, AbstractC6216a abstractC6216a) {
        int i10;
        int i11;
        Z0 z02;
        C3289b c3289b;
        int length;
        int i12;
        long[] jArr;
        long[] jArr2;
        int i13;
        H h11 = h10;
        if (h11.c(this, abstractC3893i)) {
            if (z10) {
                C2104h C10 = AbstractC4828h.C();
                int i14 = C10.f25569h0;
                if (i14 > 0) {
                    Object[] objArr = C10.f25567Y;
                    int i15 = 0;
                    do {
                        ((C1731q) ((K) objArr[i15])).b();
                        i15++;
                    } while (i15 < i14);
                    try {
                        C6072s c6072s = h11.f22495e;
                        h1 h1Var = a1.f22598a;
                        c3289b = (C3289b) h1Var.a();
                        if (c3289b == null) {
                            c3289b = new C3289b(0);
                            h1Var.b(c3289b);
                        }
                        int i16 = c3289b.f31682a;
                        Object[] objArr2 = c6072s.f47626b;
                        int[] iArr = c6072s.f47627c;
                        long[] jArr3 = c6072s.f47625a;
                        length = jArr3.length - 2;
                        if (length >= 0) {
                            int i17 = 0;
                            while (true) {
                                long j6 = jArr3[i17];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i18 = 8;
                                    int i19 = 8 - ((~(i17 - length)) >>> 31);
                                    int i20 = 0;
                                    while (i20 < i19) {
                                        if ((j6 & 255) < 128) {
                                            int i21 = (i17 << 3) + i20;
                                            AbstractC3882G abstractC3882G = (AbstractC3882G) objArr2[i21];
                                            jArr2 = jArr3;
                                            c3289b.f31682a = i16 + iArr[i21];
                                            wf.k f6 = abstractC3893i.f();
                                            if (f6 != null) {
                                                f6.invoke(abstractC3882G);
                                            }
                                            i13 = 8;
                                        } else {
                                            jArr2 = jArr3;
                                            i13 = i18;
                                        }
                                        j6 >>= i13;
                                        i20++;
                                        i18 = i13;
                                        jArr3 = jArr2;
                                    }
                                    jArr = jArr3;
                                    if (i19 != i18) {
                                        break;
                                    }
                                } else {
                                    jArr = jArr3;
                                }
                                if (i17 == length) {
                                    break;
                                }
                                i17++;
                                jArr3 = jArr;
                            }
                        }
                        c3289b.f31682a = i16;
                        i12 = C10.f25569h0;
                        if (i12 > 0) {
                            Object[] objArr3 = C10.f25567Y;
                            int i22 = 0;
                            do {
                                ((C1731q) ((K) objArr3[i22])).a();
                                i22++;
                            } while (i22 < i12);
                        }
                    } catch (Throwable th2) {
                        int i23 = C10.f25569h0;
                        if (i23 > 0) {
                            Object[] objArr4 = C10.f25567Y;
                            int i24 = 0;
                            do {
                                ((C1731q) ((K) objArr4[i24])).a();
                                i24++;
                            } while (i24 < i23);
                            throw th2;
                        }
                        throw th2;
                    }
                } else {
                    C6072s c6072s2 = h11.f22495e;
                    h1 h1Var2 = a1.f22598a;
                    c3289b = (C3289b) h1Var2.a();
                    if (c3289b == null) {
                    }
                    int i162 = c3289b.f31682a;
                    Object[] objArr22 = c6072s2.f47626b;
                    int[] iArr2 = c6072s2.f47627c;
                    long[] jArr32 = c6072s2.f47625a;
                    length = jArr32.length - 2;
                    if (length >= 0) {
                    }
                    c3289b.f31682a = i162;
                    i12 = C10.f25569h0;
                    if (i12 > 0) {
                    }
                }
            }
            return h11;
        }
        C6072s c6072s3 = new C6072s();
        h1 h1Var3 = a1.f22598a;
        C3289b c3289b2 = (C3289b) h1Var3.a();
        if (c3289b2 == null) {
            i10 = 0;
            c3289b2 = new C3289b(0);
            h1Var3.b(c3289b2);
        } else {
            i10 = 0;
        }
        C3289b c3289b3 = c3289b2;
        int i25 = c3289b3.f31682a;
        C2104h C11 = AbstractC4828h.C();
        int i26 = C11.f25569h0;
        if (i26 > 0) {
            Object[] objArr5 = C11.f25567Y;
            int i27 = i10;
            do {
                ((C1731q) ((K) objArr5[i27])).b();
                i27++;
            } while (i27 < i26);
            try {
                c3289b3.f31682a = i25 + 1;
                int i28 = AbstractC3893i.f35891e;
                Object e10 = io.sentry.hints.i.e(abstractC6216a, new C0841c0(this, c3289b3, c6072s3, i25, 2));
                c3289b3.f31682a = i25;
                i11 = C11.f25569h0;
                if (i11 <= 0) {
                    Object[] objArr6 = C11.f25567Y;
                    do {
                        ((C1731q) ((K) objArr6[i10])).a();
                        i10++;
                    } while (i10 < i11);
                    synchronized (j0.p.f35918b) {
                        try {
                            int i29 = AbstractC3893i.f35891e;
                            AbstractC3893i i30 = j0.p.i();
                            Object obj = h11.f22496f;
                            if (obj != H.f22492h && (z02 = this.f22500h0) != null && z02.a(e10, obj)) {
                                h11.f22495e = c6072s3;
                                h11.f22497g = h11.d(this, i30);
                                h11.f22493c = abstractC3893i.d();
                                h11.f22494d = abstractC3893i.h();
                            } else {
                                h11 = (H) j0.p.l(this.f22501i0, this, i30);
                                h11.f22495e = c6072s3;
                                h11.f22497g = h11.d(this, i30);
                                h11.f22493c = abstractC3893i.d();
                                h11.f22494d = abstractC3893i.h();
                                h11.f22496f = e10;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    C3289b c3289b4 = (C3289b) a1.f22598a.a();
                    if (c3289b4 != null && c3289b4.f31682a == 0) {
                        j0.p.i().m();
                    }
                    return h11;
                }
                synchronized (j0.p.f35918b) {
                }
            } catch (Throwable th4) {
                int i31 = C11.f25569h0;
                if (i31 > 0) {
                    Object[] objArr7 = C11.f25567Y;
                    do {
                        ((C1731q) ((K) objArr7[i10])).a();
                        i10++;
                    } while (i10 < i31);
                    throw th4;
                }
                throw th4;
            }
        } else {
            c3289b3.f31682a = i25 + 1;
            int i282 = AbstractC3893i.f35891e;
            Object e102 = io.sentry.hints.i.e(abstractC6216a, new C0841c0(this, c3289b3, c6072s3, i25, 2));
            c3289b3.f31682a = i25;
            i11 = C11.f25569h0;
            if (i11 <= 0) {
            }
        }
    }

    public final H i() {
        int i10 = AbstractC3893i.f35891e;
        return h((H) j0.p.h(this.f22501i0), j0.p.i(), false, this.f22499Z);
    }

    @Override // j0.AbstractC3882G
    public final AbstractC3884I r() {
        return this.f22501i0;
    }

    public final String toString() {
        String str;
        H h10 = (H) j0.p.h(this.f22501i0);
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        H h11 = (H) j0.p.h(this.f22501i0);
        int i10 = AbstractC3893i.f35891e;
        if (h11.c(this, j0.p.i())) {
            str = String.valueOf(h11.f22496f);
        } else {
            str = "<Not calculated>";
        }
        sb2.append(str);
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }

    @Override // j0.AbstractC3882G
    public final void y(AbstractC3884I abstractC3884I) {
        this.f22501i0 = (H) abstractC3884I;
    }
}
