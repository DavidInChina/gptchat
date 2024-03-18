package io.ktor.utils.io.jvm.javaio;

import Ng.B;
import id.AbstractC3557B;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class n extends B {

    /* renamed from: Z  reason: collision with root package name */
    public static final n f33515Z = new B();

    @Override // Ng.B
    public final boolean d0(AbstractC4831k abstractC4831k) {
        AbstractC3557B.c0("context", abstractC4831k);
        return true;
    }

    @Override // Ng.B
    public final void r(AbstractC4831k abstractC4831k, Runnable runnable) {
        AbstractC3557B.c0("context", abstractC4831k);
        AbstractC3557B.c0("block", runnable);
        runnable.run();
    }
}
