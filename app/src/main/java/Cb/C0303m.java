package Cb;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: Cb.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0303m implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0303m f2954a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f2955b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Cb.m, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f2954a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.onboarding.impl.ArkoseErrorResponse", obj, 1);
        pluginGeneratedSerialDescriptor.k("error", false);
        f2955b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C0300j.f2951a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2955b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        C0302l c0302l = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    c0302l = (C0302l) c10.n(pluginGeneratedSerialDescriptor, 0, C0300j.f2951a, c0302l);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C0305o(i10, c0302l);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f2955b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0305o c0305o = (C0305o) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0305o);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2955b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C0300j.f2951a, c0305o.f2956a);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
