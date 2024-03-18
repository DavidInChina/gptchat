package v7;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import t7.C5680b;
import u7.C5849e;
import w7.AbstractC6134f;
import w7.C6127E;
import w7.C6132d;
import w7.C6136h;
import w7.C6138j;
import w7.C6139k;

/* loaded from: classes2.dex */
public final class y implements N7.b {

    /* renamed from: Y  reason: collision with root package name */
    public final C5987e f47353Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f47354Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C5983a f47355h0;

    /* renamed from: i0  reason: collision with root package name */
    public final long f47356i0;

    /* renamed from: j0  reason: collision with root package name */
    public final long f47357j0;

    public y(C5987e c5987e, int i10, C5983a c5983a, long j6, long j10) {
        this.f47353Y = c5987e;
        this.f47354Z = i10;
        this.f47355h0 = c5983a;
        this.f47356i0 = j6;
        this.f47357j0 = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C6132d a(s sVar, AbstractC6134f abstractC6134f, int i10) {
        C6132d c6132d;
        C6127E c6127e = abstractC6134f.f48159u;
        if (c6127e == null) {
            c6132d = null;
        } else {
            c6132d = c6127e.f48082i0;
        }
        if (c6132d != null && c6132d.f48117Z) {
            int[] iArr = c6132d.f48119i0;
            int i11 = 0;
            if (iArr == null) {
                int[] iArr2 = c6132d.f48121k0;
                if (iArr2 != null) {
                    while (i11 < iArr2.length) {
                        if (iArr2[i11] != i10) {
                            i11++;
                        }
                    }
                }
                if (sVar.f47339l < c6132d.f48120j0) {
                    return null;
                }
                return c6132d;
            }
            while (i11 < iArr.length) {
                if (iArr[i11] == i10) {
                    if (sVar.f47339l < c6132d.f48120j0) {
                    }
                } else {
                    i11++;
                }
            }
        }
        return null;
    }

    @Override // N7.b
    public final void b(N7.m mVar) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j6;
        int i16;
        if (this.f47353Y.a()) {
            C6139k c6139k = C6138j.a().f48175a;
            if (c6139k == null || c6139k.f48177Z) {
                s sVar = (s) this.f47353Y.f47310o0.get(this.f47355h0);
                if (sVar != null) {
                    AbstractC6134f abstractC6134f = sVar.f47329b;
                    if (abstractC6134f instanceof AbstractC6134f) {
                        long j10 = 0;
                        boolean z11 = true;
                        if (this.f47356i0 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i17 = abstractC6134f.f48154p;
                        if (c6139k != null) {
                            z10 &= c6139k.f48178h0;
                            int i18 = c6139k.f48179i0;
                            int i19 = c6139k.f48180j0;
                            i12 = c6139k.f48176Y;
                            if (abstractC6134f.f48159u != null && !abstractC6134f.q()) {
                                C6132d a5 = a(sVar, abstractC6134f, this.f47354Z);
                                if (a5 != null) {
                                    if (!a5.f48118h0 || this.f47356i0 <= 0) {
                                        z11 = false;
                                    }
                                    i19 = a5.f48120j0;
                                    z10 = z11;
                                } else {
                                    return;
                                }
                            }
                            i11 = i18;
                            i10 = i19;
                        } else {
                            i12 = 0;
                            i10 = 100;
                            i11 = 5000;
                        }
                        C5987e c5987e = this.f47353Y;
                        if (mVar.e()) {
                            i14 = 0;
                            i13 = 0;
                        } else {
                            if (mVar.f12738d) {
                                i14 = 100;
                            } else {
                                Exception c10 = mVar.c();
                                if (c10 instanceof C5849e) {
                                    Status status = ((C5849e) c10).f46452Y;
                                    i16 = status.f26807Y;
                                    C5680b c5680b = status.f26810i0;
                                    if (c5680b != null) {
                                        i13 = c5680b.f45761Z;
                                        i14 = i16;
                                    }
                                } else {
                                    i16 = 101;
                                }
                                i14 = i16;
                            }
                            i13 = -1;
                        }
                        if (z10) {
                            long j11 = this.f47356i0;
                            long j12 = this.f47357j0;
                            long currentTimeMillis = System.currentTimeMillis();
                            i15 = (int) (SystemClock.elapsedRealtime() - j12);
                            j6 = j11;
                            j10 = currentTimeMillis;
                        } else {
                            j6 = 0;
                            i15 = -1;
                        }
                        c5987e.getClass();
                        z zVar = new z(new C6136h(this.f47354Z, i14, i13, j6, j10, null, null, i17, i15), i12, i11, i10);
                        H7.d dVar = c5987e.f47313r0;
                        dVar.sendMessage(dVar.obtainMessage(18, zVar));
                    }
                }
            }
        }
    }
}
