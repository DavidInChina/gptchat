package fa;

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
import wd.P;
import wd.Y;

/* renamed from: fa.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2974c implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2974c f30058a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f30059b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, fa.c] */
    static {
        ?? obj = new Object();
        f30058a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.message.Content.Image", obj, 1);
        pluginGeneratedSerialDescriptor.k("content", false);
        f30059b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{P.f48363a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f30059b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        Y y10 = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    y10 = (Y) c10.n(pluginGeneratedSerialDescriptor, 0, P.f48363a, y10);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C2976e(i10, y10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f30059b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2976e c2976e = (C2976e) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2976e);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f30059b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C2975d c2975d = C2976e.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, P.f48363a, c2976e.f30060b);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
