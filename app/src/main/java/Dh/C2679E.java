package dh;

import bh.C2215e;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.E  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2679E implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2679E f28388a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f28389b = new m0("kotlin.Float", C2215e.f25990e);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return Float.valueOf(decoder.C());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28389b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        AbstractC3557B.c0("encoder", encoder);
        encoder.n(floatValue);
    }
}
