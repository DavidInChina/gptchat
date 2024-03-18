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

/* renamed from: Dd.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386g implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0386g f3559a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f3560b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Dd.g, java.lang.Object] */
    static {
        ?? obj = new Object();
        f3559a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.LegacyVoiceSettings", obj, 1);
        pluginGeneratedSerialDescriptor.k("selectedVoice", true);
        f3560b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(C0388i.f3561b[0])};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3560b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C0388i.f3561b;
        Ed.i iVar = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    iVar = (Ed.i) c10.v(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], iVar);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C0388i(i10, iVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f3560b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0388i c0388i = (C0388i) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0388i);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f3560b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C0387h c0387h = C0388i.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Ed.i iVar = c0388i.f3562a;
        if (C10 || iVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, C0388i.f3561b[0], iVar);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
