package vc;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import zd.C6841a;

/* renamed from: vc.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6011a implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6011a f47437a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f47438b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, vc.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        f47437a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.settings.ApiUserSettings", obj, 4);
        pluginGeneratedSerialDescriptor.k("settings", false);
        pluginGeneratedSerialDescriptor.k("betaSettings", true);
        pluginGeneratedSerialDescriptor.k("announcements", false);
        pluginGeneratedSerialDescriptor.k("eligibleAnnouncements", false);
        f47438b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C6013c.f47439e;
        return new KSerializer[]{C6017g.f47448a, A7.b.U0(C6841a.f51957a), kSerializerArr[2], kSerializerArr[3]};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f47438b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6013c.f47439e;
        C6019i c6019i = null;
        zd.c cVar = null;
        Map map = null;
        List list = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                list = (List) c10.n(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            map = (Map) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], map);
                            i10 |= 4;
                        }
                    } else {
                        cVar = (zd.c) c10.v(pluginGeneratedSerialDescriptor, 1, C6841a.f51957a, cVar);
                        i10 |= 2;
                    }
                } else {
                    c6019i = (C6019i) c10.n(pluginGeneratedSerialDescriptor, 0, C6017g.f47448a, c6019i);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C6013c(i10, c6019i, cVar, map, list);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f47438b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6013c c6013c = (C6013c) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c6013c);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f47438b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C6012b c6012b = C6013c.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C6017g.f47448a, c6013c.f47440a);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        zd.c cVar = c6013c.f47441b;
        if (C10 || cVar != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, C6841a.f51957a, cVar);
        }
        KSerializer[] kSerializerArr = C6013c.f47439e;
        c10.i(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], c6013c.f47442c);
        c10.i(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], c6013c.f47443d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
