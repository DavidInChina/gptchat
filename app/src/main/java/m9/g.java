package M9;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
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
import wd.C6166A;
import wd.C6168C;

/* loaded from: classes.dex */
public final class g implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final g f11736a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f11737b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, M9.g, java.lang.Object] */
    static {
        ?? obj = new Object();
        f11736a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.feedback.MessageFeedbackResponse", obj, 5);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("userId", false);
        pluginGeneratedSerialDescriptor.k("rating", false);
        pluginGeneratedSerialDescriptor.k("content", false);
        f11737b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = i.f11738f[3];
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{C6166A.f48310a, u0Var, u0Var, kSerializer, u0Var};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6168C c6168c;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f11737b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = i.f11738f;
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        c cVar = null;
        String str4 = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    str4 = c10.r(pluginGeneratedSerialDescriptor, 4);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                cVar = (c) c10.n(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], cVar);
                                i10 |= 8;
                            }
                        } else {
                            str3 = c10.r(pluginGeneratedSerialDescriptor, 2);
                            i10 |= 4;
                        }
                    } else {
                        str2 = c10.r(pluginGeneratedSerialDescriptor, 1);
                        i10 |= 2;
                    }
                } else {
                    C6166A c6166a = C6166A.f48310a;
                    if (str != null) {
                        c6168c = new C6168C(str);
                    } else {
                        c6168c = null;
                    }
                    C6168C c6168c2 = (C6168C) c10.n(pluginGeneratedSerialDescriptor, 0, c6166a, c6168c);
                    if (c6168c2 != null) {
                        str = c6168c2.f48321a;
                    } else {
                        str = null;
                    }
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new i(i10, str, str2, str3, cVar, str4);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f11737b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", iVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f11737b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        h hVar = i.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C6166A.f48310a, new C6168C(iVar.f11739a));
        c10.z(1, iVar.f11740b, pluginGeneratedSerialDescriptor);
        c10.z(2, iVar.f11741c, pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 3, i.f11738f[3], iVar.f11742d);
        c10.z(4, iVar.f11743e, pluginGeneratedSerialDescriptor);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
