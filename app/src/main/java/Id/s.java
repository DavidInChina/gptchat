package id;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class s implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final s f33125a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f33126b;

    /* JADX WARN: Type inference failed for: r0v0, types: [id.s, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f33125a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.platform.spreadsheet.SpreadsheetMetadata", obj, 1);
        pluginGeneratedSerialDescriptor.k("columns", true);
        f33126b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u.f33127b[0]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f33126b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = u.f33127b;
        Map map = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 == 0) {
                    map = (Map) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], map);
                    i10 = 1;
                } else {
                    throw new C2004o(t10);
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new u(i10, map);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f33126b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u uVar = (u) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", uVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f33126b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        t tVar = u.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Map map = uVar.f33128a;
        if (C10 || !AbstractC3557B.K(map, kf.w.f37484Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 0, u.f33127b[0], map);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
