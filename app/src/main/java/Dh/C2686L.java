package dh;

import bh.C2215e;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.L  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2686L implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2686L f28406a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f28407b = new m0("kotlin.Int", C2215e.f25991f);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return Integer.valueOf(decoder.l());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28407b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int intValue = ((Number) obj).intValue();
        AbstractC3557B.c0("encoder", encoder);
        encoder.u(intValue);
    }
}
