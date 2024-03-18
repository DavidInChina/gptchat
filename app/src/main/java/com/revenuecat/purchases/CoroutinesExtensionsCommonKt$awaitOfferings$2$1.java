package com.revenuecat.purchases;

import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import r9.y;

@Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public /* synthetic */ class CoroutinesExtensionsCommonKt$awaitOfferings$2$1 extends k implements wf.k {
    public CoroutinesExtensionsCommonKt$awaitOfferings$2$1(Object obj) {
        super(1, obj, AbstractC4828h.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Offerings) obj);
        return jf.y.f36177a;
    }

    public final void invoke(Offerings offerings) {
        AbstractC3557B.c0("p0", offerings);
        ((AbstractC4825e) this.receiver).resumeWith(offerings);
    }
}
