package fg;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.AbstractC4467l;
import lg.C4461f;
import lg.C4464i;

/* renamed from: fg.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3050s extends AbstractC4467l {

    /* renamed from: i0  reason: collision with root package name */
    public int f30715i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30716j0;

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        C3051t c3051t = new C3051t(this);
        int i10 = 1;
        if ((this.f30715i0 & 1) != 1) {
            i10 = 0;
        }
        c3051t.f30721i0 = this.f30716j0;
        c3051t.f30720h0 = i10;
        if (c3051t.isInitialized()) {
            return c3051t;
        }
        throw new n0();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC2041a b(C4461f c4461f, C4464i c4464i) {
        Throwable th2;
        C3051t c3051t = null;
        try {
            try {
                e((C3051t) C3051t.f30718m0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                C3051t c3051t2 = (C3051t) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    c3051t = c3051t2;
                    if (c3051t != null) {
                        e(c3051t);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (c3051t != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        e((C3051t) pVar);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.s, java.lang.Object, lg.l] */
    public final Object clone() {
        ?? abstractC4467l = new AbstractC4467l();
        C3051t c3051t = new C3051t(this);
        int i10 = 1;
        if ((this.f30715i0 & 1) != 1) {
            i10 = 0;
        }
        c3051t.f30721i0 = this.f30716j0;
        c3051t.f30720h0 = i10;
        abstractC4467l.e(c3051t);
        return abstractC4467l;
    }

    public final void e(C3051t c3051t) {
        if (c3051t == C3051t.f30717l0) {
            return;
        }
        if ((c3051t.f30720h0 & 1) == 1) {
            int i10 = c3051t.f30721i0;
            this.f30715i0 = 1 | this.f30715i0;
            this.f30716j0 = i10;
        }
        d(c3051t);
        this.f38400Y = this.f38400Y.r(c3051t.f30719Z);
    }
}
