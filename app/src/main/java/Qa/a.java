package Qa;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.C2682H;
import dh.C2686L;
import id.AbstractC3557B;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PluginGeneratedSerialDescriptor f14542a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KSerializer f14543b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ KSerializer f14544c;

    public a(KSerializer kSerializer, KSerializer kSerializer2) {
        AbstractC3557B.c0("typeSerial0", kSerializer);
        AbstractC3557B.c0("typeSerial1", kSerializer2);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.util.Tree", this, 3);
        pluginGeneratedSerialDescriptor.k("rootNodeId", false);
        pluginGeneratedSerialDescriptor.k("nodes", false);
        pluginGeneratedSerialDescriptor.k("size", true);
        this.f14542a = pluginGeneratedSerialDescriptor;
        this.f14543b = kSerializer;
        this.f14544c = kSerializer2;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        g gVar = h.Companion;
        KSerializer kSerializer = this.f14544c;
        KSerializer kSerializer2 = this.f14543b;
        return new KSerializer[]{kSerializer2, new C2682H(kSerializer2, gVar.serializer(kSerializer2, kSerializer), 1), C2686L.f28406a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f14542a;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        Object obj = null;
        boolean z10 = true;
        Map map = null;
        int i10 = 0;
        int i11 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                KSerializer kSerializer = this.f14543b;
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            i11 = c10.m(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        map = (Map) c10.n(pluginGeneratedSerialDescriptor, 1, new C2682H(kSerializer, h.Companion.serializer(kSerializer, this.f14544c), 1), map);
                        i10 |= 2;
                    }
                } else {
                    obj = c10.n(pluginGeneratedSerialDescriptor, 0, kSerializer, obj);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new e(i10, obj, map, i11);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return this.f14542a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e eVar = (e) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", eVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f14542a;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        Object obj2 = eVar.f14547a;
        KSerializer kSerializer = this.f14543b;
        c10.i(pluginGeneratedSerialDescriptor, 0, kSerializer, obj2);
        C2682H c2682h = new C2682H(kSerializer, h.Companion.serializer(kSerializer, this.f14544c), 1);
        Map map = eVar.f14548b;
        c10.i(pluginGeneratedSerialDescriptor, 1, c2682h, map);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        int i10 = eVar.f14549c;
        if (C10 || i10 != map.size()) {
            c10.m(2, i10, pluginGeneratedSerialDescriptor);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.f14543b, this.f14544c};
    }
}
