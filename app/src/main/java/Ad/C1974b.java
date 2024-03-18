package ad;

import Ad.l;
import Fe.c;
import bh.C2215e;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: ad.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1974b implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C1974b f24154a = new Object();

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        return c.a(decoder.o());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return l.t("Base64String", C2215e.f25994i);
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", str);
        encoder.D(c.b(str));
    }
}
