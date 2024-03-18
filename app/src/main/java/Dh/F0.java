package dh;

import id.AbstractC3557B;
import jf.C3970t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* loaded from: classes2.dex */
public final class F0 implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final F0 f28391a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final InlineClassDescriptor f28392b = L4.a.q("kotlin.ULong", S.f28417a);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return new C3970t(decoder.w(f28392b).p());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28392b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j6 = ((C3970t) obj).f36172Y;
        AbstractC3557B.c0("encoder", encoder);
        encoder.v(f28392b).y(j6);
    }
}
