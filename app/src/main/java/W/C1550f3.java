package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import z.C6697f0;

/* renamed from: W.f3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1550f3 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20060a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f20061b;

    /* renamed from: c  reason: collision with root package name */
    public final C f20062c;

    /* renamed from: d  reason: collision with root package name */
    public Z0.b f20063d;

    public C1550f3(boolean z10, Z0.b bVar, EnumC1555g3 enumC1555g3, wf.k kVar, boolean z11) {
        this.f20060a = z10;
        this.f20061b = z11;
        if (z10 && enumC1555g3 == EnumC1555g3.f20080h0) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
        }
        if (z11 && enumC1555g3 == EnumC1555g3.f20078Y) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
        }
        C6697f0 c6697f0 = AbstractC1576l.f20202a;
        this.f20062c = new C(enumC1555g3, new W1(this, 1), new C1560h3(3, this), kVar);
        this.f20063d = bVar;
    }

    public static Object a(C1550f3 c1550f3, EnumC1555g3 enumC1555g3, AbstractC4825e abstractC4825e) {
        Object p10 = kotlin.jvm.internal.m.p(c1550f3.f20062c, enumC1555g3, c1550f3.f20062c.f19001j.h(), abstractC4825e);
        if (p10 != EnumC5000a.f41328Y) {
            return jf.y.f36177a;
        }
        return p10;
    }

    public final Object b(AbstractC4825e abstractC4825e) {
        if (!this.f20061b) {
            Object a5 = a(this, EnumC1555g3.f20078Y, abstractC4825e);
            if (a5 == EnumC5000a.f41328Y) {
                return a5;
            }
            return jf.y.f36177a;
        }
        throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
    }

    public final boolean c() {
        if (this.f20062c.f18997f.getValue() != EnumC1555g3.f20078Y) {
            return true;
        }
        return false;
    }

    public final Object d(AbstractC4825e abstractC4825e) {
        if (!this.f20060a) {
            Object a5 = a(this, EnumC1555g3.f20080h0, abstractC4825e);
            if (a5 == EnumC5000a.f41328Y) {
                return a5;
            }
            return jf.y.f36177a;
        }
        throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
    }

    public final Object e(AbstractC4825e abstractC4825e) {
        F1 d10 = this.f20062c.d();
        EnumC1555g3 enumC1555g3 = EnumC1555g3.f20080h0;
        if (!d10.f19126a.containsKey(enumC1555g3)) {
            enumC1555g3 = EnumC1555g3.f20079Z;
        }
        Object a5 = a(this, enumC1555g3, abstractC4825e);
        if (a5 == EnumC5000a.f41328Y) {
            return a5;
        }
        return jf.y.f36177a;
    }
}
