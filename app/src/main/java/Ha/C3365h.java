package ha;

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
import wd.C6207u;
import wd.C6209w;

/* renamed from: ha.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3365h implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C3365h f32066a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f32067b;

    /* JADX WARN: Type inference failed for: r0v0, types: [ha.h, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f32066a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.metadata.CitationLink.File", obj, 1);
        pluginGeneratedSerialDescriptor.k("file", false);
        f32067b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C6207u.f48466a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6209w c6209w;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32067b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    C6207u c6207u = C6207u.f48466a;
                    if (str != null) {
                        c6209w = new C6209w(str);
                    } else {
                        c6209w = null;
                    }
                    C6209w c6209w2 = (C6209w) c10.n(pluginGeneratedSerialDescriptor, 0, c6207u, c6209w);
                    if (c6209w2 != null) {
                        str = c6209w2.f48469a;
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
        return new C3367j(i10, str);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f32067b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C3367j c3367j = (C3367j) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c3367j);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32067b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C6207u.f48466a, new C6209w(c3367j.f32068a));
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
