package O9;

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

/* renamed from: O9.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106h implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C1106h f13540a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f13541b;

    /* JADX WARN: Type inference failed for: r0v0, types: [O9.h, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f13540a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiConversationFinishDetails", obj, 1);
        pluginGeneratedSerialDescriptor.k("type", false);
        f13541b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C1116m.f13558b[0]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13541b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1116m.f13558b;
        EnumC1114l enumC1114l = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    enumC1114l = (EnumC1114l) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC1114l);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C1116m(i10, enumC1114l);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13541b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1116m c1116m = (C1116m) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c1116m);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f13541b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C1116m.f13558b[0], c1116m.f13559a);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
