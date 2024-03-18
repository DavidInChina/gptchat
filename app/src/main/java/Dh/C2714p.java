package dh;

import bh.C2215e;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: dh.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2714p implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C2714p f28474a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f28475b = new m0("kotlin.Char", C2215e.f25988c);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return Character.valueOf(decoder.e());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28475b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        char charValue = ((Character) obj).charValue();
        AbstractC3557B.c0("encoder", encoder);
        encoder.o(charValue);
    }
}
