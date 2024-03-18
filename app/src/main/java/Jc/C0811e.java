package Jc;

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

/* renamed from: Jc.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0811e implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0811e f9046a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f9047b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Jc.e, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f9046a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.files.api.FileServiceDownloadResponse", obj, 4);
        pluginGeneratedSerialDescriptor.k("status", false);
        pluginGeneratedSerialDescriptor.k("downloadUrl", false);
        pluginGeneratedSerialDescriptor.k("errorCode", true);
        pluginGeneratedSerialDescriptor.k("errorMessage", true);
        f9047b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = g.f9048e[0];
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{kSerializer, A7.b.U0(u0Var), A7.b.U0(u0Var), A7.b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9047b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = g.f9048e;
        y yVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str3);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            str2 = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str2);
                            i10 |= 4;
                        }
                    } else {
                        str = (String) c10.v(pluginGeneratedSerialDescriptor, 1, u0.f28491a, str);
                        i10 |= 2;
                    }
                } else {
                    yVar = (y) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], yVar);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new g(i10, yVar, str, str2, str3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f9047b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", gVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9047b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        c10.i(pluginGeneratedSerialDescriptor, 0, g.f9048e[0], gVar.f9049a);
        u0 u0Var = u0.f28491a;
        c10.q(pluginGeneratedSerialDescriptor, 1, u0Var, gVar.f9050b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = gVar.f9051c;
        if (C10 || str != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, u0Var, str);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str2 = gVar.f9052d;
        if (C11 || str2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, u0Var, str2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
