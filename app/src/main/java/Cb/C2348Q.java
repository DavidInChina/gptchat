package cb;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: cb.Q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2348Q implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2348Q f26483a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26484b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, cb.Q] */
    static {
        ?? obj = new Object();
        f26483a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.GizmoCategory", obj, 5);
        pluginGeneratedSerialDescriptor.k(ParameterNames.INFO, false);
        pluginGeneratedSerialDescriptor.k("list", false);
        pluginGeneratedSerialDescriptor.k("cursor", false);
        pluginGeneratedSerialDescriptor.k("title", true);
        pluginGeneratedSerialDescriptor.k("description", true);
        f26484b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C2350T.f26485f[1];
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{C2351U.f26491a, kSerializer, A7.b.U0(u0Var), u0Var, u0Var};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26484b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2350T.f26485f;
        int i10 = 0;
        C2353W c2353w = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    str3 = c10.r(pluginGeneratedSerialDescriptor, 4);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                str2 = c10.r(pluginGeneratedSerialDescriptor, 3);
                                i10 |= 8;
                            }
                        } else {
                            str = (String) c10.v(pluginGeneratedSerialDescriptor, 2, u0.f28491a, str);
                            i10 |= 4;
                        }
                    } else {
                        list = (List) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                        i10 |= 2;
                    }
                } else {
                    c2353w = (C2353W) c10.n(pluginGeneratedSerialDescriptor, 0, C2351U.f26491a, c2353w);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C2350T(i10, c2353w, list, str, str2, str3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26484b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (id.AbstractC3557B.K(r7, r2) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (id.AbstractC3557B.K(r4, r1) == false) goto L9;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        C2350T c2350t = (C2350T) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2350t);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26484b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C2349S c2349s = C2350T.Companion;
        C2351U c2351u = C2351U.f26491a;
        C2353W c2353w = c2350t.f26486a;
        c10.i(pluginGeneratedSerialDescriptor, 0, c2351u, c2353w);
        c10.i(pluginGeneratedSerialDescriptor, 1, C2350T.f26485f[1], c2350t.f26487b);
        c10.q(pluginGeneratedSerialDescriptor, 2, u0.f28491a, c2350t.f26488c);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        String str = "";
        String str2 = c2350t.f26489d;
        if (!C10) {
            String str3 = c2353w.f26494b;
            if (str3 == null) {
                str3 = str;
            }
        }
        c10.z(3, str2, pluginGeneratedSerialDescriptor);
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        String str4 = c2350t.f26490e;
        if (!C11) {
            String str5 = c2353w.f26495c;
            if (str5 != null) {
                str = str5;
            }
        }
        c10.z(4, str4, pluginGeneratedSerialDescriptor);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
