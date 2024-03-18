package Rc;

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
public final class m implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final m f15415a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f15416b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, Rc.m, java.lang.Object] */
    static {
        ?? obj = new Object();
        f15415a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.api.ModelsResponseProductFeatures", obj, 1);
        pluginGeneratedSerialDescriptor.k("attachments", true);
        f15416b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(d.f15387a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15416b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        f fVar = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    fVar = (f) c10.v(pluginGeneratedSerialDescriptor, 0, d.f15387a, fVar);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new o(i10, fVar);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f15416b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o oVar = (o) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", oVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f15416b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        f fVar = oVar.f15417a;
        if (C10 || fVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, d.f15387a, fVar);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
