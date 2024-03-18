package N;

import E0.AbstractC0461u;
import q0.C5251c;
import wf.AbstractC6216a;

/* renamed from: N.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030n implements AbstractC1032p {

    /* renamed from: a  reason: collision with root package name */
    public final long f12383a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6216a f12384b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6216a f12385c;

    /* renamed from: d  reason: collision with root package name */
    public N0.C f12386d;

    /* renamed from: e  reason: collision with root package name */
    public int f12387e = -1;

    public C1030n(long j6, M.g gVar, M.g gVar2) {
        this.f12383a = j6;
        this.f12384b = gVar;
        this.f12385c = gVar2;
    }

    public final long a(C1034s c1034s, boolean z10) {
        int i10;
        r rVar = c1034s.f12408a;
        long j6 = this.f12383a;
        if (!z10 || rVar.f12405c == j6) {
            r rVar2 = c1034s.f12409b;
            if (z10 || rVar2.f12405c == j6) {
                if (c() == null) {
                    return C5251c.f43621d;
                }
                N0.C c10 = (N0.C) this.f12385c.mo122invoke();
                if (c10 == null) {
                    return C5251c.f43621d;
                }
                if (z10) {
                    i10 = rVar.f12404b;
                } else {
                    i10 = rVar2.f12404b;
                }
                return U3.f.X(c10, com.google.android.gms.internal.play_billing.N.p(i10, 0, b(c10)), z10, c1034s.f12410c);
            }
        }
        return C5251c.f43621d;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized int b(N0.C c10) {
        boolean z10;
        int h10;
        int i10;
        try {
            if (this.f12386d != c10) {
                N0.i iVar = c10.f12478b;
                boolean z11 = iVar.f12526c;
                int i11 = 0;
                if (!z11 && ((int) (c10.f12479c & 4294967295L)) >= iVar.f12528e) {
                    z10 = false;
                    if (z10 && !z11) {
                        h10 = c10.h((int) (c10.f12479c & 4294967295L));
                        i10 = c10.f12478b.f12529f - 1;
                        if (h10 > i10) {
                            h10 = i10;
                        }
                        while (h10 >= 0 && c10.l(h10) >= ((int) (c10.f12479c & 4294967295L))) {
                            h10--;
                        }
                        if (h10 < 0) {
                            i11 = h10;
                        }
                        this.f12387e = c10.f(i11, true);
                        this.f12386d = c10;
                    }
                    i11 = iVar.f12529f - 1;
                    this.f12387e = c10.f(i11, true);
                    this.f12386d = c10;
                }
                z10 = true;
                if (z10) {
                    h10 = c10.h((int) (c10.f12479c & 4294967295L));
                    i10 = c10.f12478b.f12529f - 1;
                    if (h10 > i10) {
                    }
                    while (h10 >= 0) {
                        h10--;
                    }
                    if (h10 < 0) {
                    }
                    this.f12387e = c10.f(i11, true);
                    this.f12386d = c10;
                }
                i11 = iVar.f12529f - 1;
                this.f12387e = c10.f(i11, true);
                this.f12386d = c10;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f12387e;
    }

    public final AbstractC0461u c() {
        AbstractC0461u abstractC0461u = (AbstractC0461u) this.f12384b.mo122invoke();
        if (abstractC0461u != null && abstractC0461u.i()) {
            return abstractC0461u;
        }
        return null;
    }
}
