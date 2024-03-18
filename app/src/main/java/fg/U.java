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

/* loaded from: classes.dex */
public final class U extends AbstractC4467l {

    /* renamed from: i0  reason: collision with root package name */
    public int f30438i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f30439j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f30440k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f30441l0;

    /* renamed from: m0  reason: collision with root package name */
    public V f30442m0;

    /* renamed from: n0  reason: collision with root package name */
    public List f30443n0;

    /* renamed from: o0  reason: collision with root package name */
    public List f30444o0;

    /* JADX WARN: Type inference failed for: r0v0, types: [fg.U, lg.l] */
    public static U f() {
        ?? abstractC4467l = new AbstractC4467l();
        abstractC4467l.f30442m0 = V.INV;
        abstractC4467l.f30443n0 = Collections.emptyList();
        abstractC4467l.f30444o0 = Collections.emptyList();
        return abstractC4467l;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        W e10 = e();
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
        W w10 = null;
        try {
            try {
                g((W) W.f30451s0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                W w11 = (W) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    w10 = w11;
                    if (w10 != null) {
                        g(w10);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (w10 != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        g((W) pVar);
        return this;
    }

    public final Object clone() {
        U f6 = f();
        f6.g(e());
        return f6;
    }

    public final W e() {
        W w10 = new W(this);
        int i10 = this.f30438i0;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        w10.f30454i0 = this.f30439j0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        w10.f30455j0 = this.f30440k0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        w10.f30456k0 = this.f30441l0;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        w10.f30457l0 = this.f30442m0;
        if ((i10 & 16) == 16) {
            this.f30443n0 = Collections.unmodifiableList(this.f30443n0);
            this.f30438i0 &= -17;
        }
        w10.f30458m0 = this.f30443n0;
        if ((this.f30438i0 & 32) == 32) {
            this.f30444o0 = Collections.unmodifiableList(this.f30444o0);
            this.f30438i0 &= -33;
        }
        w10.f30459n0 = this.f30444o0;
        w10.f30453h0 = i11;
        return w10;
    }

    public final void g(W w10) {
        if (w10 == W.f30450r0) {
            return;
        }
        int i10 = w10.f30453h0;
        if ((i10 & 1) == 1) {
            int i11 = w10.f30454i0;
            this.f30438i0 = 1 | this.f30438i0;
            this.f30439j0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = w10.f30455j0;
            this.f30438i0 = 2 | this.f30438i0;
            this.f30440k0 = i12;
        }
        if ((i10 & 4) == 4) {
            boolean z10 = w10.f30456k0;
            this.f30438i0 = 4 | this.f30438i0;
            this.f30441l0 = z10;
        }
        if ((i10 & 8) == 8) {
            V v10 = w10.f30457l0;
            v10.getClass();
            this.f30438i0 = 8 | this.f30438i0;
            this.f30442m0 = v10;
        }
        if (!w10.f30458m0.isEmpty()) {
            if (this.f30443n0.isEmpty()) {
                this.f30443n0 = w10.f30458m0;
                this.f30438i0 &= -17;
            } else {
                if ((this.f30438i0 & 16) != 16) {
                    this.f30443n0 = new ArrayList(this.f30443n0);
                    this.f30438i0 |= 16;
                }
                this.f30443n0.addAll(w10.f30458m0);
            }
        }
        if (!w10.f30459n0.isEmpty()) {
            if (this.f30444o0.isEmpty()) {
                this.f30444o0 = w10.f30459n0;
                this.f30438i0 &= -33;
            } else {
                if ((this.f30438i0 & 32) != 32) {
                    this.f30444o0 = new ArrayList(this.f30444o0);
                    this.f30438i0 |= 32;
                }
                this.f30444o0.addAll(w10.f30459n0);
            }
        }
        d(w10);
        this.f38400Y = this.f38400Y.r(w10.f30452Z);
    }
}
