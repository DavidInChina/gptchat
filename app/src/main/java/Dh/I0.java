package dh;

import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* loaded from: classes2.dex */
public final class I0 implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final I0 f28399a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final InlineClassDescriptor f28400b = L4.a.q("kotlin.UShort", t0.f28489a);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return new jf.w(decoder.w(f28400b).B());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28400b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        short s10 = ((jf.w) obj).f36175Y;
        AbstractC3557B.c0("encoder", encoder);
        encoder.v(f28400b).h(s10);
    }
}
