package fg;

import androidx.datastore.preferences.protobuf.n0;
import androidx.glance.appwidget.protobuf.AbstractC2041a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.AbstractC4456a;
import lg.AbstractC4466k;
import lg.C4461f;
import lg.C4464i;

/* renamed from: fg.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3047o extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public int f30690Z;

    /* renamed from: h0  reason: collision with root package name */
    public EnumC3048p f30691h0;

    /* renamed from: i0  reason: collision with root package name */
    public List f30692i0;

    /* renamed from: j0  reason: collision with root package name */
    public C3054w f30693j0;

    /* renamed from: k0  reason: collision with root package name */
    public EnumC3049q f30694k0;

    /* JADX WARN: Type inference failed for: r0v0, types: [lg.k, fg.o] */
    public static C3047o e() {
        ?? abstractC4466k = new AbstractC4466k();
        abstractC4466k.f30691h0 = EnumC3048p.RETURNS_CONSTANT;
        abstractC4466k.f30692i0 = Collections.emptyList();
        abstractC4466k.f30693j0 = C3054w.f30737q0;
        abstractC4466k.f30694k0 = EnumC3049q.AT_MOST_ONCE;
        return abstractC4466k;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        r d10 = d();
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
        r rVar = null;
        try {
            try {
                f((r) r.f30706o0.b(c4461f, c4464i));
                return this;
            } catch (lg.t e10) {
                r rVar2 = (r) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    rVar = rVar2;
                    if (rVar != null) {
                        f(rVar);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (rVar != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(lg.p pVar) {
        f((r) pVar);
        return this;
    }

    public final Object clone() {
        C3047o e10 = e();
        e10.f(d());
        return e10;
    }

    public final r d() {
        r rVar = new r(this);
        int i10 = this.f30690Z;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        rVar.f30709h0 = this.f30691h0;
        if ((i10 & 2) == 2) {
            this.f30692i0 = Collections.unmodifiableList(this.f30692i0);
            this.f30690Z &= -3;
        }
        rVar.f30710i0 = this.f30692i0;
        if ((i10 & 4) == 4) {
            i11 |= 2;
        }
        rVar.f30711j0 = this.f30693j0;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        rVar.f30712k0 = this.f30694k0;
        rVar.f30708Z = i11;
        return rVar;
    }

    public final void f(r rVar) {
        C3054w c3054w;
        if (rVar == r.f30705n0) {
            return;
        }
        boolean z10 = true;
        if ((rVar.f30708Z & 1) == 1) {
            EnumC3048p enumC3048p = rVar.f30709h0;
            enumC3048p.getClass();
            this.f30690Z |= 1;
            this.f30691h0 = enumC3048p;
        }
        if (!rVar.f30710i0.isEmpty()) {
            if (this.f30692i0.isEmpty()) {
                this.f30692i0 = rVar.f30710i0;
                this.f30690Z &= -3;
            } else {
                if ((this.f30690Z & 2) != 2) {
                    this.f30692i0 = new ArrayList(this.f30692i0);
                    this.f30690Z |= 2;
                }
                this.f30692i0.addAll(rVar.f30710i0);
            }
        }
        if ((rVar.f30708Z & 2) != 2) {
            z10 = false;
        }
        if (z10) {
            C3054w c3054w2 = rVar.f30711j0;
            if ((this.f30690Z & 4) == 4 && (c3054w = this.f30693j0) != C3054w.f30737q0) {
                C3052u e10 = C3052u.e();
                e10.f(c3054w);
                e10.f(c3054w2);
                this.f30693j0 = e10.d();
            } else {
                this.f30693j0 = c3054w2;
            }
            this.f30690Z |= 4;
        }
        if ((rVar.f30708Z & 4) == 4) {
            EnumC3049q enumC3049q = rVar.f30712k0;
            enumC3049q.getClass();
            this.f30690Z |= 8;
            this.f30694k0 = enumC3049q;
        }
        this.f38400Y = this.f38400Y.r(rVar.f30707Y);
    }
}
