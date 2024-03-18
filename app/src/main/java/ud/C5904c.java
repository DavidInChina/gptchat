package ud;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import r0.r;

/* renamed from: ud.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5904c implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C5904c f46682a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f46683b;

    /* JADX WARN: Type inference failed for: r0v0, types: [ud.c, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f46682a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.syntaxhighlighting.CodeBlockMetadata", obj, 3);
        pluginGeneratedSerialDescriptor.k("background", true);
        pluginGeneratedSerialDescriptor.k("color", true);
        pluginGeneratedSerialDescriptor.k("children", false);
        f46683b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = h.f46690d;
        i iVar = i.f46694a;
        return new KSerializer[]{A7.b.U0(iVar), A7.b.U0(iVar), kSerializerArr[2]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46683b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = h.f46690d;
        r rVar = null;
        boolean z10 = true;
        r rVar2 = null;
        List list = null;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            list = (List) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        rVar2 = (r) c10.v(pluginGeneratedSerialDescriptor, 1, i.f46694a, rVar2);
                        i10 |= 2;
                    }
                } else {
                    rVar = (r) c10.v(pluginGeneratedSerialDescriptor, 0, i.f46694a, rVar);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new h(i10, rVar, rVar2, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f46683b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h hVar = (h) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", hVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f46683b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C5905d c5905d = h.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        r rVar = hVar.f46691a;
        if (C10 || rVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, i.f46694a, rVar);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        r rVar2 = hVar.f46692b;
        if (C11 || rVar2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, i.f46694a, rVar2);
        }
        c10.i(pluginGeneratedSerialDescriptor, 2, h.f46690d[2], hVar.f46693c);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
