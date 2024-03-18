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

/* renamed from: L9.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0911q implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0911q f10946a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f10947b;

    /* JADX WARN: Type inference failed for: r0v0, types: [L9.q, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f10946a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ConversationStreamGizmoRatingResponse", obj, 1);
        pluginGeneratedSerialDescriptor.k("gizmoId", false);
        f10947b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{wd.M.f48360a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        wd.O o10;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10947b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    wd.M m10 = wd.M.f48360a;
                    if (str != null) {
                        o10 = new wd.O(str);
                    } else {
                        o10 = null;
                    }
                    wd.O o11 = (wd.O) c10.n(pluginGeneratedSerialDescriptor, 0, m10, o10);
                    if (o11 != null) {
                        str = o11.f48362a;
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
        return new C0912s(i10, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f10947b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0912s c0912s = (C0912s) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c0912s);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10947b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, wd.M.f48360a, new wd.O(c0912s.f10948a));
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
