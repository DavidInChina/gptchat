package xa;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final h f49718c = new h(0, Yg.p.f22416h0);

    /* renamed from: a  reason: collision with root package name */
    public final int f49719a;

    /* renamed from: b  reason: collision with root package name */
    public final Yg.p f49720b;

    static {
        Yg.p.Companion.getClass();
    }

    public h(int i10, Yg.p pVar) {
        AbstractC3557B.c0("oldestDate", pVar);
        this.f49719a = i10;
        this.f49720b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f49719a == hVar.f49719a && AbstractC3557B.K(this.f49720b, hVar.f49720b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f49720b.f22419Y.hashCode() + (this.f49719a * 31);
    }

    public final String toString() {
        return "HistoryRefreshCheckpoint(offset=" + this.f49719a + ", oldestDate=" + this.f49720b + Separators.RPAREN;
    }
}
