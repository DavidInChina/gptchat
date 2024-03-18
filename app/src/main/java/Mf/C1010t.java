package Mf;

import Df.AbstractC0407f;
import id.AbstractC3557B;
import kg.C4290b;

/* renamed from: Mf.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1010t extends kotlin.jvm.internal.j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C1010t f12120Y = new kotlin.jvm.internal.j(1);

    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        return kotlin.jvm.internal.C.f37623a.b(C4290b.class);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C4290b c4290b = (C4290b) obj;
        AbstractC3557B.c0("p0", c4290b);
        return c4290b.f();
    }
}
