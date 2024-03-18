package fg;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.AbstractC4467l;
import lg.C4461f;
import lg.C4464i;

/* renamed from: fg.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3043k extends AbstractC4467l {

    /* renamed from: i0  reason: collision with root package name */
    public int f30668i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30669j0;

    /* renamed from: k0  reason: collision with root package name */
    public List f30670k0;

    /* renamed from: l0  reason: collision with root package name */
    public List f30671l0;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.k, lg.l] */
    public static C3043k f() {
        ?? abstractC4467l = new AbstractC4467l();
        abstractC4467l.f30669j0 = 6;
        abstractC4467l.f30670k0 = Collections.emptyList();
        abstractC4467l.f30671l0 = Collections.emptyList();
        return abstractC4467l;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        C3044l e10 = e();
        if (e10.isInitialized()) {
            return e10;
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
        C3044l c3044l = null;
        try {
            try {
                g((C3044l) C3044l.f30673o0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                C3044l c3044l2 = (C3044l) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    c3044l = c3044l2;
                    if (c3044l != null) {
                        g(c3044l);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (c3044l != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        g((C3044l) pVar);
        return this;
    }

    public final Object clone() {
        C3043k f6 = f();
        f6.g(e());
        return f6;
    }

    public final C3044l e() {
        C3044l c3044l = new C3044l(this);
        int i10 = this.f30668i0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        c3044l.f30676i0 = this.f30669j0;
        if ((i10 & 2) == 2) {
            this.f30670k0 = Collections.unmodifiableList(this.f30670k0);
            this.f30668i0 &= -3;
        }
        c3044l.f30677j0 = this.f30670k0;
        if ((this.f30668i0 & 4) == 4) {
            this.f30671l0 = Collections.unmodifiableList(this.f30671l0);
            this.f30668i0 &= -5;
        }
        c3044l.f30678k0 = this.f30671l0;
        c3044l.f30675h0 = i11;
        return c3044l;
    }

    public final void g(C3044l c3044l) {
        if (c3044l == C3044l.f30672n0) {
            return;
        }
        if ((c3044l.f30675h0 & 1) == 1) {
            int i10 = c3044l.f30676i0;
            this.f30668i0 = 1 | this.f30668i0;
            this.f30669j0 = i10;
        }
        if (!c3044l.f30677j0.isEmpty()) {
            if (this.f30670k0.isEmpty()) {
                this.f30670k0 = c3044l.f30677j0;
                this.f30668i0 &= -3;
            } else {
                if ((this.f30668i0 & 2) != 2) {
                    this.f30670k0 = new ArrayList(this.f30670k0);
                    this.f30668i0 |= 2;
                }
                this.f30670k0.addAll(c3044l.f30677j0);
            }
        }
        if (!c3044l.f30678k0.isEmpty()) {
            if (this.f30671l0.isEmpty()) {
                this.f30671l0 = c3044l.f30678k0;
                this.f30668i0 &= -5;
            } else {
                if ((this.f30668i0 & 4) != 4) {
                    this.f30671l0 = new ArrayList(this.f30671l0);
                    this.f30668i0 |= 4;
                }
                this.f30671l0.addAll(c3044l.f30678k0);
            }
        }
        d(c3044l);
        this.f38400Y = this.f38400Y.r(c3044l.f30674Z);
    }
}
