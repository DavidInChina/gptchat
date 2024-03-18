package ig;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.C4461f;
import lg.C4464i;
import lg.p;
import lg.t;

/* renamed from: ig.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3580f extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public int f33195Z;

    /* renamed from: h0  reason: collision with root package name */
    public List f33196h0;

    /* renamed from: i0  reason: collision with root package name */
    public List f33197i0;

    /* JADX WARN: Type inference failed for: r0v0, types: [ig.f, lg.k] */
    public static C3580f e() {
        ?? abstractC4466k = new AbstractC4466k();
        abstractC4466k.f33196h0 = Collections.emptyList();
        abstractC4466k.f33197i0 = Collections.emptyList();
        return abstractC4466k;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        j d10 = d();
        if (d10.isInitialized()) {
            return d10;
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
        j jVar = null;
        try {
            try {
                f((j) j.f33225m0.b(c4461f, c4464i));
                return this;
            } catch (t e10) {
                j jVar2 = (j) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    jVar = jVar2;
                    if (jVar != null) {
                        f(jVar);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (jVar != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(p pVar) {
        f((j) pVar);
        return this;
    }

    public final Object clone() {
        C3580f e10 = e();
        e10.f(d());
        return e10;
    }

    public final j d() {
        j jVar = new j(this);
        if ((this.f33195Z & 1) == 1) {
            this.f33196h0 = Collections.unmodifiableList(this.f33196h0);
            this.f33195Z &= -2;
        }
        jVar.f33227Z = this.f33196h0;
        if ((this.f33195Z & 2) == 2) {
            this.f33197i0 = Collections.unmodifiableList(this.f33197i0);
            this.f33195Z &= -3;
        }
        jVar.f33228h0 = this.f33197i0;
        return jVar;
    }

    public final void f(j jVar) {
        if (jVar == j.f33224l0) {
            return;
        }
        if (!jVar.f33227Z.isEmpty()) {
            if (this.f33196h0.isEmpty()) {
                this.f33196h0 = jVar.f33227Z;
                this.f33195Z &= -2;
            } else {
                if ((this.f33195Z & 1) != 1) {
                    this.f33196h0 = new ArrayList(this.f33196h0);
                    this.f33195Z |= 1;
                }
                this.f33196h0.addAll(jVar.f33227Z);
            }
        }
        if (!jVar.f33228h0.isEmpty()) {
            if (this.f33197i0.isEmpty()) {
                this.f33197i0 = jVar.f33228h0;
                this.f33195Z &= -3;
            } else {
                if ((this.f33195Z & 2) != 2) {
                    this.f33197i0 = new ArrayList(this.f33197i0);
                    this.f33195Z |= 2;
                }
                this.f33197i0.addAll(jVar.f33228h0);
            }
        }
        this.f38400Y = this.f38400Y.r(jVar.f33226Y);
    }
}
