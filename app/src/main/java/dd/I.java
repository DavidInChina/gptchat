package Dd;

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

/* loaded from: classes.dex */
public final class I implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final I f3518a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f3519b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Dd.I] */
    static {
        ?? obj = new Object();
        f3518a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.VoiceModeMessageWrapper", obj, 2);
        pluginGeneratedSerialDescriptor.k("type", true);
        pluginGeneratedSerialDescriptor.k("payload", false);
        f3519b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{K.f3520c[0], C0393n.f3564d};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3519b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = K.f3520c;
        EnumC0401w enumC0401w = null;
        boolean z10 = true;
        AbstractC0392m abstractC0392m = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 == 1) {
                        abstractC0392m = (AbstractC0392m) c10.n(pluginGeneratedSerialDescriptor, 1, C0393n.f3564d, abstractC0392m);
                        i10 |= 2;
                    } else {
                        throw new C2004o(t10);
                    }
                } else {
                    enumC0401w = (EnumC0401w) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC0401w);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new K(i10, enumC0401w, abstractC0392m);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f3519b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        K k10 = (K) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", k10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3519b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        J j6 = K.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        EnumC0401w enumC0401w = k10.f3521a;
        if (C10 || enumC0401w != EnumC0401w.f3579i0) {
            c10.i(pluginGeneratedSerialDescriptor, 0, K.f3520c[0], enumC0401w);
        }
        c10.i(pluginGeneratedSerialDescriptor, 1, C0393n.f3564d, k10.f3522b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
