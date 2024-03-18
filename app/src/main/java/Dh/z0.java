package dh;

import id.AbstractC3557B;
import jf.C3966p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* loaded from: classes.dex */
public final class z0 implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final z0 f28513a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final InlineClassDescriptor f28514b = L4.a.q("kotlin.UByte", C2707j.f28460a);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return new C3966p(decoder.w(f28514b).z());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28514b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        byte b10 = ((C3966p) obj).f36168Y;
        AbstractC3557B.c0("encoder", encoder);
        encoder.v(f28514b).j(b10);
    }
}
