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

/* renamed from: ig.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3581g extends AbstractC4466k {

    /* renamed from: Z  reason: collision with root package name */
    public int f33198Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f33199h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33200i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f33201j0;

    /* renamed from: k0  reason: collision with root package name */
    public EnumC3582h f33202k0;

    /* renamed from: l0  reason: collision with root package name */
    public List f33203l0;

    /* renamed from: m0  reason: collision with root package name */
    public List f33204m0;

    /* JADX WARN: Type inference failed for: r0v0, types: [ig.g, lg.k] */
    public static C3581g e() {
        ?? abstractC4466k = new AbstractC4466k();
        abstractC4466k.f33199h0 = 1;
        abstractC4466k.f33201j0 = "";
        abstractC4466k.f33202k0 = EnumC3582h.NONE;
        abstractC4466k.f33203l0 = Collections.emptyList();
        abstractC4466k.f33204m0 = Collections.emptyList();
        return abstractC4466k;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2041a
    public final AbstractC4456a a() {
        C3583i d10 = d();
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
        C3583i c3583i = null;
        try {
            try {
                f((C3583i) C3583i.f33211s0.b(c4461f, c4464i));
                return this;
            } catch (t e10) {
                C3583i c3583i2 = (C3583i) e10.f38415Y;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th2 = th3;
                    c3583i = c3583i2;
                    if (c3583i != null) {
                        f(c3583i);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (c3583i != null) {
            }
            throw th2;
        }
    }

    @Override // lg.AbstractC4466k
    public final /* bridge */ /* synthetic */ AbstractC4466k c(p pVar) {
        f((C3583i) pVar);
        return this;
    }

    public final Object clone() {
        C3581g e10 = e();
        e10.f(d());
        return e10;
    }

    public final C3583i d() {
        C3583i c3583i = new C3583i(this);
        int i10 = this.f33198Z;
        int i11 = 1;
        if ((i10 & 1) != 1) {
            i11 = 0;
        }
        c3583i.f33214h0 = this.f33199h0;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        c3583i.f33215i0 = this.f33200i0;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        c3583i.f33216j0 = this.f33201j0;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        c3583i.f33217k0 = this.f33202k0;
        if ((i10 & 16) == 16) {
            this.f33203l0 = Collections.unmodifiableList(this.f33203l0);
            this.f33198Z &= -17;
        }
        c3583i.f33218l0 = this.f33203l0;
        if ((this.f33198Z & 32) == 32) {
            this.f33204m0 = Collections.unmodifiableList(this.f33204m0);
            this.f33198Z &= -33;
        }
        c3583i.f33220n0 = this.f33204m0;
        c3583i.f33213Z = i11;
        return c3583i;
    }

    public final void f(C3583i c3583i) {
        if (c3583i == C3583i.f33210r0) {
            return;
        }
        int i10 = c3583i.f33213Z;
        if ((i10 & 1) == 1) {
            int i11 = c3583i.f33214h0;
            this.f33198Z = 1 | this.f33198Z;
            this.f33199h0 = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = c3583i.f33215i0;
            this.f33198Z = 2 | this.f33198Z;
            this.f33200i0 = i12;
        }
        if ((i10 & 4) == 4) {
            this.f33198Z |= 4;
            this.f33201j0 = c3583i.f33216j0;
        }
        if ((i10 & 8) == 8) {
            EnumC3582h enumC3582h = c3583i.f33217k0;
            enumC3582h.getClass();
            this.f33198Z = 8 | this.f33198Z;
            this.f33202k0 = enumC3582h;
        }
        if (!c3583i.f33218l0.isEmpty()) {
            if (this.f33203l0.isEmpty()) {
                this.f33203l0 = c3583i.f33218l0;
                this.f33198Z &= -17;
            } else {
                if ((this.f33198Z & 16) != 16) {
                    this.f33203l0 = new ArrayList(this.f33203l0);
                    this.f33198Z |= 16;
                }
                this.f33203l0.addAll(c3583i.f33218l0);
            }
        }
        if (!c3583i.f33220n0.isEmpty()) {
            if (this.f33204m0.isEmpty()) {
                this.f33204m0 = c3583i.f33220n0;
                this.f33198Z &= -33;
            } else {
                if ((this.f33198Z & 32) != 32) {
                    this.f33204m0 = new ArrayList(this.f33204m0);
                    this.f33198Z |= 32;
                }
                this.f33204m0.addAll(c3583i.f33220n0);
            }
        }
        this.f38400Y = this.f38400Y.r(c3583i.f33212Y);
    }
}
