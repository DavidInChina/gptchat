package v2;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import s2.AbstractC5530A;
import x8.k0;

/* renamed from: v2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5964c implements AbstractC5969h {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f47063a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f47064b = new ArrayList(1);

    /* renamed from: c  reason: collision with root package name */
    public int f47065c;

    /* renamed from: d  reason: collision with root package name */
    public l f47066d;

    public AbstractC5964c(boolean z10) {
        this.f47063a = z10;
    }

    @Override // v2.AbstractC5969h
    public final void g(F f6) {
        f6.getClass();
        ArrayList arrayList = this.f47064b;
        if (!arrayList.contains(f6)) {
            arrayList.add(f6);
            this.f47065c++;
        }
    }

    @Override // v2.AbstractC5969h
    public Map j() {
        return Collections.emptyMap();
    }

    public final void p(int i10) {
        l lVar = this.f47066d;
        int i11 = AbstractC5530A.f45131a;
        for (int i12 = 0; i12 < this.f47065c; i12++) {
            boolean z10 = this.f47063a;
            I2.g gVar = (I2.g) ((F) this.f47064b.get(i12));
            synchronized (gVar) {
                k0 k0Var = I2.g.f7974n;
                if (z10 && (lVar.f47103i & 8) != 8) {
                    gVar.f7988h += i10;
                }
            }
        }
    }

    public final void q() {
        boolean z10;
        l lVar = this.f47066d;
        int i10 = AbstractC5530A.f45131a;
        for (int i11 = 0; i11 < this.f47065c; i11++) {
            boolean z11 = this.f47063a;
            I2.g gVar = (I2.g) ((F) this.f47064b.get(i11));
            synchronized (gVar) {
                try {
                    k0 k0Var = I2.g.f7974n;
                    if (z11 && (lVar.f47103i & 8) != 8) {
                        if (gVar.f7986f > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Gi.e.n(z10);
                        ((s2.w) gVar.f7983c).getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i12 = (int) (elapsedRealtime - gVar.f7987g);
                        gVar.f7989i += i12;
                        long j6 = gVar.f7990j;
                        long j10 = gVar.f7988h;
                        gVar.f7990j = j6 + j10;
                        if (i12 > 0) {
                            gVar.f7985e.a((int) Math.sqrt(j10), (((float) j10) * 8000.0f) / i12);
                            if (gVar.f7989i < 2000) {
                                if (gVar.f7990j >= 524288) {
                                }
                                gVar.c(gVar.f7988h, i12, gVar.f7991k);
                                gVar.f7987g = elapsedRealtime;
                                gVar.f7988h = 0L;
                            }
                            gVar.f7991k = gVar.f7985e.b();
                            gVar.c(gVar.f7988h, i12, gVar.f7991k);
                            gVar.f7987g = elapsedRealtime;
                            gVar.f7988h = 0L;
                        }
                        gVar.f7986f--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f47066d = null;
    }

    public final void r() {
        for (int i10 = 0; i10 < this.f47065c; i10++) {
            ((F) this.f47064b.get(i10)).getClass();
        }
    }

    public final void s(l lVar) {
        this.f47066d = lVar;
        for (int i10 = 0; i10 < this.f47065c; i10++) {
            boolean z10 = this.f47063a;
            I2.g gVar = (I2.g) ((F) this.f47064b.get(i10));
            synchronized (gVar) {
                try {
                    k0 k0Var = I2.g.f7974n;
                    if (z10 && (lVar.f47103i & 8) != 8) {
                        if (gVar.f7986f == 0) {
                            ((s2.w) gVar.f7983c).getClass();
                            gVar.f7987g = SystemClock.elapsedRealtime();
                        }
                        gVar.f7986f++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
