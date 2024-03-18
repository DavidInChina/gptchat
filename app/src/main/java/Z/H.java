package Z;

import b0.C2104h;
import id.AbstractC3557B;
import j0.AbstractC3882G;
import j0.AbstractC3884I;
import j0.AbstractC3893i;
import nf.AbstractC4828h;
import w.AbstractC6075v;
import w.C6072s;

/* loaded from: classes.dex */
public final class H extends AbstractC3884I {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f22492h = new Object();

    /* renamed from: c  reason: collision with root package name */
    public int f22493c;

    /* renamed from: d  reason: collision with root package name */
    public int f22494d;

    /* renamed from: e  reason: collision with root package name */
    public C6072s f22495e;

    /* renamed from: f  reason: collision with root package name */
    public Object f22496f = f22492h;

    /* renamed from: g  reason: collision with root package name */
    public int f22497g;

    public H() {
        C6072s c6072s = AbstractC6075v.f47638a;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>", c6072s);
        this.f22495e = c6072s;
    }

    @Override // j0.AbstractC3884I
    public final void a(AbstractC3884I abstractC3884I) {
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>", abstractC3884I);
        H h10 = (H) abstractC3884I;
        this.f22495e = h10.f22495e;
        this.f22496f = h10.f22496f;
        this.f22497g = h10.f22497g;
    }

    @Override // j0.AbstractC3884I
    public final AbstractC3884I b() {
        return new H();
    }

    public final boolean c(J j6, AbstractC3893i abstractC3893i) {
        boolean z10;
        boolean z11;
        Object obj = j0.p.f35918b;
        synchronized (obj) {
            z10 = true;
            if (this.f22493c == abstractC3893i.d()) {
                if (this.f22494d == abstractC3893i.h()) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        if (this.f22496f == f22492h || (z11 && this.f22497g != d(j6, abstractC3893i))) {
            z10 = false;
        }
        if (z10 && z11) {
            synchronized (obj) {
                this.f22493c = abstractC3893i.d();
                this.f22494d = abstractC3893i.h();
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
        r3 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(J j6, AbstractC3893i abstractC3893i) {
        C6072s c6072s;
        int i10;
        Throwable th2;
        int length;
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC3884I abstractC3884I;
        synchronized (j0.p.f35918b) {
            c6072s = this.f22495e;
        }
        char c10 = 7;
        if (c6072s.f47629e != 0) {
            C2104h C10 = AbstractC4828h.C();
            int i15 = C10.f25569h0;
            int i16 = 1;
            if (i15 > 0) {
                Object[] objArr = C10.f25567Y;
                int i17 = 0;
                do {
                    ((C1731q) ((K) objArr[i17])).b();
                    i17++;
                } while (i17 < i15);
                try {
                    Object[] objArr2 = c6072s.f47626b;
                    int[] iArr = c6072s.f47627c;
                    long[] jArr = c6072s.f47625a;
                    length = jArr.length - 2;
                    if (length < 0) {
                        int i18 = 7;
                        int i19 = 0;
                        while (true) {
                            long j10 = jArr[i19];
                            if ((((~j10) << c10) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i20 = 8;
                                int i21 = 8 - ((~(i19 - length)) >>> 31);
                                int i22 = 0;
                                while (i22 < i21) {
                                    if ((j10 & 255) < 128) {
                                        int i23 = (i19 << 3) + i22;
                                        AbstractC3882G abstractC3882G = (AbstractC3882G) objArr2[i23];
                                        if (iArr[i23] == i16) {
                                            if (abstractC3882G instanceof I) {
                                                I i24 = (I) abstractC3882G;
                                                AbstractC3884I r10 = j0.p.r(i24.f22501i0, abstractC3893i.d(), abstractC3893i.e());
                                                if (r10 != null) {
                                                    i10 = 0;
                                                    try {
                                                        abstractC3884I = i24.h((H) r10, abstractC3893i, false, i24.f22499Z);
                                                    } catch (Throwable th3) {
                                                        th2 = th3;
                                                        int i25 = C10.f25569h0;
                                                        if (i25 > 0) {
                                                            Object[] objArr3 = C10.f25567Y;
                                                            int i26 = i10;
                                                            do {
                                                                ((C1731q) ((K) objArr3[i26])).a();
                                                                i26++;
                                                            } while (i26 < i25);
                                                            throw th2;
                                                        }
                                                        throw th2;
                                                    }
                                                } else {
                                                    j0.p.q();
                                                    throw null;
                                                }
                                            } else {
                                                abstractC3884I = j0.p.r(abstractC3882G.r(), abstractC3893i.d(), abstractC3893i.e());
                                                if (abstractC3884I == null) {
                                                    j0.p.q();
                                                    throw null;
                                                }
                                            }
                                            i18 = (((i18 * 31) + System.identityHashCode(abstractC3884I)) * 31) + abstractC3884I.f35854a;
                                        }
                                        i14 = 8;
                                    } else {
                                        i14 = i20;
                                    }
                                    j10 >>= i14;
                                    i22++;
                                    i20 = i14;
                                    i16 = 1;
                                }
                                i12 = 0;
                                if (i21 != i20) {
                                    break;
                                }
                            } else {
                                i12 = 0;
                            }
                            if (i19 == length) {
                                break;
                            }
                            i19++;
                            c10 = 7;
                            i16 = 1;
                        }
                    } else {
                        i12 = 0;
                        i11 = 7;
                    }
                    i13 = C10.f25569h0;
                    if (i13 <= 0) {
                        Object[] objArr4 = C10.f25567Y;
                        int i27 = i12;
                        do {
                            ((C1731q) ((K) objArr4[i27])).a();
                            i27++;
                        } while (i27 < i13);
                        return i11;
                    }
                    return i11;
                } catch (Throwable th4) {
                    th2 = th4;
                    i10 = 0;
                }
            } else {
                Object[] objArr22 = c6072s.f47626b;
                int[] iArr2 = c6072s.f47627c;
                long[] jArr2 = c6072s.f47625a;
                length = jArr2.length - 2;
                if (length < 0) {
                }
                i13 = C10.f25569h0;
                if (i13 <= 0) {
                }
            }
        } else {
            return 7;
        }
    }
}
