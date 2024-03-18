package M9;

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
import wd.C6166A;
import wd.C6168C;
import wd.C6178a0;
import wd.C6182c0;

/* loaded from: classes.dex */
public final class d implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final d f11728a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f11729b;

    /* JADX WARN: Type inference failed for: r0v0, types: [M9.d, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f11728a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.feedback.MessageFeedbackRequest", obj, 5);
        pluginGeneratedSerialDescriptor.k("conversationId", false);
        pluginGeneratedSerialDescriptor.k("messageId", false);
        pluginGeneratedSerialDescriptor.k("rating", false);
        pluginGeneratedSerialDescriptor.k(ParameterNames.TEXT, false);
        pluginGeneratedSerialDescriptor.k("tags", true);
        f11729b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = f.f11730f;
        return new KSerializer[]{C6166A.f48310a, C6178a0.f48382a, kSerializerArr[2], A7.b.U0(u0.f28491a), A7.b.U0(kSerializerArr[4])};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        C6182c0 c6182c0;
        C6168C c6168c;
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f11729b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = f.f11730f;
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        c cVar = null;
        String str3 = null;
        List list = null;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 != 3) {
                                if (t10 == 4) {
                                    list = (List) c10.v(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
                                    i10 |= 16;
                                } else {
                                    throw new C2004o(t10);
                                }
                            } else {
                                str3 = (String) c10.v(pluginGeneratedSerialDescriptor, 3, u0.f28491a, str3);
                                i10 |= 8;
                            }
                        } else {
                            cVar = (c) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], cVar);
                            i10 |= 4;
                        }
                    } else {
                        C6178a0 c6178a0 = C6178a0.f48382a;
                        if (str2 != null) {
                            c6182c0 = new C6182c0(str2);
                        } else {
                            c6182c0 = null;
                        }
                        C6182c0 c6182c02 = (C6182c0) c10.n(pluginGeneratedSerialDescriptor, 1, c6178a0, c6182c0);
                        if (c6182c02 != null) {
                            str2 = c6182c02.f48393Y;
                        } else {
                            str2 = null;
                        }
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
        return new f(i10, str, str2, cVar, str3, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f11729b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", fVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f11729b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        e eVar = f.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C6166A.f48310a, new C6168C(fVar.f11731a));
        c10.i(pluginGeneratedSerialDescriptor, 1, C6178a0.f48382a, new C6182c0(fVar.f11732b));
        KSerializer[] kSerializerArr = f.f11730f;
        c10.i(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], fVar.f11733c);
        c10.q(pluginGeneratedSerialDescriptor, 3, u0.f28491a, fVar.f11734d);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = fVar.f11735e;
        if (C10 || list != null) {
            c10.q(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
