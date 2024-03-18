package xg;

import Mf.AbstractC0994c;
import Pf.AbstractC1144b;
import fg.EnumC3030A;
import fg.Q;
import id.AbstractC3557B;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class n implements o, r, t, w, AbstractC6457l, s {

    /* renamed from: b  reason: collision with root package name */
    public static final n f50030b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final n f50031c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final n f50032d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final n f50033e = new Object();

    public static /* synthetic */ void e(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i10 != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Mf.A f(EnumC3030A enumC3030A) {
        int i10;
        if (enumC3030A == null) {
            i10 = -1;
        } else {
            i10 = E.f49970a[enumC3030A.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return Mf.A.f12051Z;
                    }
                    return Mf.A.f12052h0;
                }
                return Mf.A.f12054j0;
            }
            return Mf.A.f12053i0;
        }
        return Mf.A.f12051Z;
    }

    @Override // xg.t
    public Bg.A a(Q q10, String str, Bg.D d10, Bg.D d11) {
        AbstractC3557B.c0("proto", q10);
        AbstractC3557B.c0("flexibleId", str);
        AbstractC3557B.c0("lowerBound", d10);
        AbstractC3557B.c0("upperBound", d11);
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // xg.s
    public void b(AbstractC1144b abstractC1144b, ArrayList arrayList) {
        if (abstractC1144b != null) {
            return;
        }
        e(0);
        throw null;
    }

    @Override // xg.s
    public void c(AbstractC0994c abstractC0994c) {
        if (abstractC0994c != null) {
            return;
        }
        e(2);
        throw null;
    }

    @Override // xg.r
    public Boolean d() {
        return null;
    }
}
