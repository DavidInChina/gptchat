package Bg;

import Df.AbstractC0405d;
import id.AbstractC3557B;
import jh.L1;

/* renamed from: Bg.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0220m {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f2136a;

    /* renamed from: b  reason: collision with root package name */
    public static final L1 f2137b;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f2136a = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.c(AbstractC0220m.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        P p10 = Q.f2084Z;
        AbstractC0405d b10 = d10.b(C0219l.class);
        p10.getClass();
        String p11 = b10.p();
        AbstractC3557B.Z(p11);
        f2137b = new L1(p10.b(p11));
    }

    public static final Nf.i a(Q q10) {
        Nf.i iVar;
        AbstractC3557B.c0("<this>", q10);
        Df.v vVar = f2136a[0];
        L1 l12 = f2137b;
        l12.getClass();
        AbstractC3557B.c0("property", vVar);
        C0219l c0219l = (C0219l) q10.f7771Y.get(l12.f36264Y);
        if (c0219l == null || (iVar = c0219l.f2134a) == null) {
            return Nf.h.f12822a;
        }
        return iVar;
    }
}
