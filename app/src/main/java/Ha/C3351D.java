package ha;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6178a0;
import wd.C6182c0;

/* renamed from: ha.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3351D implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C3351D f31999a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f32000b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, ha.D] */
    static {
        ?? obj = new Object();
        f31999a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.metadata.CustomActionCall.Action.DenyAction", obj, 3);
        pluginGeneratedSerialDescriptor.k("actionType", true);
        pluginGeneratedSerialDescriptor.k("name", true);
        pluginGeneratedSerialDescriptor.k("targetMessageId", true);
        f32000b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{A7.b.U0(u0.f28491a), C3354G.f32005d[1], A7.b.U0(C6178a0.f48382a)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6182c0 c6182c0;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32000b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C3354G.f32005d;
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        EnumC3352E enumC3352E = null;
        String str2 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 == 2) {
                            C6178a0 c6178a0 = C6178a0.f48382a;
                            if (str2 != null) {
                                c6182c0 = new C6182c0(str2);
                            } else {
                                c6182c0 = null;
                            }
                            C6182c0 c6182c02 = (C6182c0) c10.v(pluginGeneratedSerialDescriptor, 2, c6178a0, c6182c0);
                            if (c6182c02 != null) {
                                str2 = c6182c02.f48393Y;
                            } else {
                                str2 = null;
                            }
                            i10 |= 4;
                        } else {
                            throw new C2004o(t10);
                        }
                    } else {
                        enumC3352E = (EnumC3352E) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC3352E);
                        i10 |= 2;
                    }
                } else {
                    str = (String) c10.v(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C3354G(i10, str, enumC3352E, str2);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f32000b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6182c0 c6182c0;
        C3354G c3354g = (C3354G) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c3354g);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f32000b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C3353F c3353f = C3354G.Companion;
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = c3354g.f32006a;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 0, u0.f28491a, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        EnumC3352E enumC3352E = c3354g.f32007b;
        if (C11 || enumC3352E != EnumC3352E.f32002Z) {
            c10.i(pluginGeneratedSerialDescriptor, 1, C3354G.f32005d[1], enumC3352E);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = c3354g.f32008c;
        if (C12 || str2 != null) {
            C6178a0 c6178a0 = C6178a0.f48382a;
            if (str2 != null) {
                c6182c0 = new C6182c0(str2);
            } else {
                c6182c0 = null;
            }
            c10.q(pluginGeneratedSerialDescriptor, 2, c6178a0, c6182c0);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
