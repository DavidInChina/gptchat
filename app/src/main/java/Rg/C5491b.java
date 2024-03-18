package rg;

import Df.AbstractC0407f;
import Mf.h0;
import Pf.b0;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.j;
import wf.k;

/* renamed from: rg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5491b extends j implements k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C5491b f44983Y = new j(1);

    @Override // kotlin.jvm.internal.AbstractC4305d, Df.AbstractC0404c
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final AbstractC0407f getOwner() {
        return C.f37623a.b(h0.class);
    }

    @Override // kotlin.jvm.internal.AbstractC4305d
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        h0 h0Var = (h0) obj;
        AbstractC3557B.c0("p0", h0Var);
        return Boolean.valueOf(((b0) h0Var).w0());
    }
}
