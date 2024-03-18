package Vf;

import K4.J;
import Mf.AbstractC0994c;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import ng.C4846m;
import xg.s;

/* loaded from: classes2.dex */
public final class a extends J {

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ s f18935n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ Set f18936o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ boolean f18937p0;

    public a(s sVar, LinkedHashSet linkedHashSet, boolean z10) {
        this.f18935n0 = sVar;
        this.f18936o0 = linkedHashSet;
        this.f18937p0 = z10;
    }

    public static /* synthetic */ void l0(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "overridden";
                    }
                } else {
                    objArr[0] = "member";
                }
            } else {
                objArr[0] = "fromCurrent";
            }
        } else {
            objArr[0] = "fromSuper";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "addFakeOverride";
            } else {
                objArr[2] = "setOverriddenDescriptors";
            }
        } else {
            objArr[2] = "conflict";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // K4.J
    public final void a0(AbstractC0994c abstractC0994c, Collection collection) {
        if (abstractC0994c != null) {
            if (this.f18937p0 && abstractC0994c.e() != 2) {
                return;
            }
            super.a0(abstractC0994c, collection);
            return;
        }
        l0(3);
        throw null;
    }

    @Override // K4.J
    public final void g(AbstractC0994c abstractC0994c) {
        if (abstractC0994c != null) {
            C4846m.r(abstractC0994c, new Jf.i(2, this));
            this.f18936o0.add(abstractC0994c);
            return;
        }
        l0(0);
        throw null;
    }

    @Override // K4.J
    public final void n(AbstractC0994c abstractC0994c, AbstractC0994c abstractC0994c2) {
        if (abstractC0994c2 != null) {
            return;
        }
        l0(2);
        throw null;
    }
}
