package L9;

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
import wd.C6178a0;
import wd.C6182c0;

/* loaded from: classes2.dex */
public final class M implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final M f10888a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10889b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, L9.M] */
    static {
        ?? obj = new Object();
        f10888a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.GenerateTitleRequest", obj, 1);
        pluginGeneratedSerialDescriptor.k("messageId", false);
        f10889b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C6178a0.f48382a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6182c0 c6182c0;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10889b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    C6178a0 c6178a0 = C6178a0.f48382a;
                    if (str != null) {
                        c6182c0 = new C6182c0(str);
                    } else {
                        c6182c0 = null;
                    }
                    C6182c0 c6182c02 = (C6182c0) c10.n(pluginGeneratedSerialDescriptor, 0, c6178a0, c6182c0);
                    if (c6182c02 != null) {
                        str = c6182c02.f48393Y;
                    } else {
                        str = null;
                    }
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new O(i10, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10889b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        O o10 = (O) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", o10);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10889b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C6178a0.f48382a, new C6182c0(o10.f10890a));
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
