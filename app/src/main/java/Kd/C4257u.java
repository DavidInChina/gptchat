package kd;

import ad.C1974b;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import wd.C6166A;
import wd.C6168C;

/* renamed from: kd.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4257u implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C4257u f37360a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f37361b;

    /* JADX WARN: Type inference failed for: r0v0, types: [kd.u, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f37360a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.platform.websockets.impl.WebSocketMessage", obj, 4);
        pluginGeneratedSerialDescriptor.k("body", false);
        pluginGeneratedSerialDescriptor.k("moreBody", false);
        pluginGeneratedSerialDescriptor.k("responseId", false);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        f37361b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C1974b.f24154a, C2701g.f28450a, u0.f28491a, C6166A.f48310a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6168C c6168c;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f37361b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        C1974b c1974b = C1974b.f24154a;
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                C6166A c6166a = C6166A.f48310a;
                                if (str3 != null) {
                                    c6168c = new C6168C(str3);
                                } else {
                                    c6168c = null;
                                }
                                C6168C c6168c2 = (C6168C) c10.n(pluginGeneratedSerialDescriptor, 3, c6166a, c6168c);
                                if (c6168c2 != null) {
                                    str3 = c6168c2.f48321a;
                                } else {
                                    str3 = null;
                                }
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            str2 = c10.r(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        }
                    } else {
                        z11 = c10.q(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    str = (String) c10.n(pluginGeneratedSerialDescriptor, 0, c1974b, str);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C4259w(i10, str, z11, str2, str3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f37361b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C4259w c4259w = (C4259w) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c4259w);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f37361b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, C1974b.f24154a, c4259w.f37362a);
        c10.p(pluginGeneratedSerialDescriptor, 1, c4259w.f37363b);
        c10.z(2, c4259w.f37364c, pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 3, C6166A.f48310a, new C6168C(c4259w.f37365d));
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
