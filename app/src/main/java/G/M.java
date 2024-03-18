package G;

import Z.C1720k0;
import Z.C1724m0;
import Z.o1;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5440a;

    /* renamed from: b  reason: collision with root package name */
    public final N f5441b;

    /* renamed from: c  reason: collision with root package name */
    public final C1720k0 f5442c = U3.f.h0(-1);

    /* renamed from: d  reason: collision with root package name */
    public final C1720k0 f5443d = U3.f.h0(0);

    /* renamed from: e  reason: collision with root package name */
    public final C1724m0 f5444e;

    /* renamed from: f  reason: collision with root package name */
    public final C1724m0 f5445f;

    public M(Object obj, N n10) {
        this.f5440a = obj;
        this.f5441b = n10;
        o1 o1Var = o1.f22665a;
        this.f5444e = AbstractC4828h.Z(null, o1Var);
        this.f5445f = AbstractC4828h.Z(null, o1Var);
    }

    public final M a() {
        C1720k0 c1720k0 = this.f5443d;
        if (c1720k0.h() == 0) {
            this.f5441b.f5446Y.add(this);
            M m10 = (M) this.f5445f.getValue();
            if (m10 != null) {
                m10.a();
            } else {
                m10 = null;
            }
            this.f5444e.setValue(m10);
        }
        c1720k0.i(c1720k0.h() + 1);
        return this;
    }

    public final void b() {
        C1720k0 c1720k0 = this.f5443d;
        if (c1720k0.h() > 0) {
            c1720k0.i(c1720k0.h() - 1);
            if (c1720k0.h() == 0) {
                this.f5441b.f5446Y.remove(this);
                C1724m0 c1724m0 = this.f5444e;
                M m10 = (M) c1724m0.getValue();
                if (m10 != null) {
                    m10.b();
                }
                c1724m0.setValue(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once".toString());
    }
}
