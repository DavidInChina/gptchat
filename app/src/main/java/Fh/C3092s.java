package fh;

import id.AbstractC3557B;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: fh.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3092s extends kotlin.jvm.internal.k implements wf.n {
    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        int intValue = ((Number) obj2).intValue();
        AbstractC3557B.c0("p0", serialDescriptor);
        C3093t c3093t = (C3093t) this.receiver;
        c3093t.getClass();
        if (!serialDescriptor.j(intValue) && serialDescriptor.i(intValue).c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        c3093t.f30893b = z10;
        return Boolean.valueOf(z10);
    }
}
