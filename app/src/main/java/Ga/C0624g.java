package Ga;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import dh.C2701g;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: Ga.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624g implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0624g f6209a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f6210b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Ga.g, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f6209a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.tangled.impl.api.conversation.ConversationListRequest", obj, 5);
        pluginGeneratedSerialDescriptor.k("offset", false);
        pluginGeneratedSerialDescriptor.k("limit", false);
        pluginGeneratedSerialDescriptor.k("order", false);
        pluginGeneratedSerialDescriptor.k("expand", true);
        pluginGeneratedSerialDescriptor.k("isArchived", true);
        f6210b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = i.f6211f[2];
        C2686L c2686l = C2686L.f28406a;
        C2701g c2701g = C2701g.f28450a;
        return new KSerializer[]{c2686l, c2686l, kSerializer, c2701g, c2701g};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f6210b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = i.f6211f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        boolean z11 = false;
        r rVar = null;
        boolean z12 = true;
        while (z12) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    z11 = c10.q(pluginGeneratedSerialDescriptor, 4);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                z10 = c10.q(pluginGeneratedSerialDescriptor, 3);
                                i10 |= 8;
                            }
                        } else {
                            rVar = (r) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], rVar);
                            i10 |= 4;
                        }
                    } else {
                        i12 = c10.m(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    i11 = c10.m(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                }
            } else {
                z12 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new i(i10, i11, i12, rVar, z10, z11);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f6210b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", iVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f6210b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.m(0, iVar.f6212a, pluginGeneratedSerialDescriptor);
        c10.m(1, iVar.f6213b, pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 2, i.f6211f[2], iVar.f6214c);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z10 = iVar.f6215d;
        if (C10 || !z10) {
            c10.p(pluginGeneratedSerialDescriptor, 3, z10);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        boolean z11 = iVar.f6216e;
        if (C11 || z11) {
            c10.p(pluginGeneratedSerialDescriptor, 4, z11);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
