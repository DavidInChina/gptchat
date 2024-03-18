package dh;

import bh.C2215e;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2701g implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2701g f28450a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f28451b = new m0("kotlin.Boolean", C2215e.f25986a);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return Boolean.valueOf(decoder.d());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28451b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        AbstractC3557B.c0("encoder", encoder);
        encoder.k(booleanValue);
    }
}
