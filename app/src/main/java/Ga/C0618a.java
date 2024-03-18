package Ga;

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

/* renamed from: Ga.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0618a f6203a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f6204b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Ga.a] */
    static {
        ?? obj = new Object();
        f6203a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.tangled.impl.api.conversation.BotTokenHeader", obj, 1);
        pluginGeneratedSerialDescriptor.k("botToken", false);
        f6204b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C0619b.f6205a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f6204b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        C0621d c0621d = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    c0621d = (C0621d) c10.n(pluginGeneratedSerialDescriptor, 0, C0619b.f6205a, c0621d);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C0623f(i10, c0621d);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f6204b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0623f c0623f = (C0623f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0623f);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f6204b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C0619b.f6205a, c0623f.f6208a);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
