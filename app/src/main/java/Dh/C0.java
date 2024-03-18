package dh;

import id.AbstractC3557B;
import jf.C3968r;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* loaded from: classes2.dex */
public final class C0 implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C0 f28383a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final InlineClassDescriptor f28384b = L4.a.q("kotlin.UInt", C2686L.f28406a);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return new C3968r(decoder.w(f28384b).l());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f28384b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i10 = ((C3968r) obj).f36170Y;
        AbstractC3557B.c0("encoder", encoder);
        encoder.v(f28384b).u(i10);
    }
}
