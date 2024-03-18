package dh;

import bh.C2215e;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2707j implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2707j f28460a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f28461b = new m0("kotlin.Byte", C2215e.f25987b);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return Byte.valueOf(decoder.z());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28461b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        byte byteValue = ((Number) obj).byteValue();
        AbstractC3557B.c0("encoder", encoder);
        encoder.j(byteValue);
    }
}
