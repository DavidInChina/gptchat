package Pf;

import Mf.AbstractC0994c;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import ng.C4846m;
import ug.AbstractC5926h;

/* renamed from: Pf.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1160s extends K4.J {

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ int f14125n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ Collection f14126o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ ug.o f14127p0;

    public C1160s(C1161t c1161t, LinkedHashSet linkedHashSet) {
        this.f14127p0 = c1161t;
        this.f14126o0 = linkedHashSet;
    }

    public static /* synthetic */ void l0(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            if (i10 != 2) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "fromCurrent";
            }
        } else {
            objArr[0] = "fromSuper";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "addFakeOverride";
        } else {
            objArr[2] = "conflict";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // K4.J
    public final void g(AbstractC0994c abstractC0994c) {
        int i10 = this.f14125n0;
        Collection collection = this.f14126o0;
        switch (i10) {
            case 0:
                if (abstractC0994c != null) {
                    C4846m.r(abstractC0994c, null);
                    ((Set) collection).add(abstractC0994c);
                    return;
                }
                l0(0);
                throw null;
            default:
                AbstractC3557B.c0("fakeOverride", abstractC0994c);
                C4846m.r(abstractC0994c, null);
                ((ArrayList) collection).add(abstractC0994c);
                return;
        }
    }

    @Override // K4.J
    public final void n(AbstractC0994c abstractC0994c, AbstractC0994c abstractC0994c2) {
        switch (this.f14125n0) {
            case 0:
                if (abstractC0994c2 != null) {
                    return;
                }
                l0(2);
                throw null;
            default:
                AbstractC3557B.c0("fromCurrent", abstractC0994c2);
                throw new IllegalStateException(("Conflict in scope of " + ((AbstractC5926h) this.f14127p0).f46791b + ": " + abstractC0994c + " vs " + abstractC0994c2).toString());
        }
    }

    public C1160s(ArrayList arrayList, AbstractC5926h abstractC5926h) {
        this.f14126o0 = arrayList;
        this.f14127p0 = abstractC5926h;
    }
}
