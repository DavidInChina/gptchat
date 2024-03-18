package Qa;

import ah.C2004o;
import android.gov.nist.javax.sip.header.ParameterNames;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import kf.v;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class f implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PluginGeneratedSerialDescriptor f14550a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KSerializer f14551b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ KSerializer f14552c;

    public f(KSerializer kSerializer, KSerializer kSerializer2) {
        AbstractC3557B.c0("typeSerial0", kSerializer);
        AbstractC3557B.c0("typeSerial1", kSerializer2);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.util.TreeNode", this, 4);
        pluginGeneratedSerialDescriptor.k(ParameterNames.ID, false);
        pluginGeneratedSerialDescriptor.k("parent", true);
        pluginGeneratedSerialDescriptor.k("children", true);
        pluginGeneratedSerialDescriptor.k("content", false);
        this.f14550a = pluginGeneratedSerialDescriptor;
        this.f14551b = kSerializer;
        this.f14552c = kSerializer2;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = this.f14551b;
        return new KSerializer[]{kSerializer, A7.b.U0(kSerializer), new C2695d(kSerializer, 0), this.f14552c};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f14550a;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        Object obj = null;
        Object obj2 = null;
        List list = null;
        Object obj3 = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                KSerializer kSerializer = this.f14551b;
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                obj3 = c10.n(pluginGeneratedSerialDescriptor, 3, this.f14552c, obj3);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            list = (List) c10.n(pluginGeneratedSerialDescriptor, 2, new C2695d(kSerializer, 0), list);
                            i10 |= 4;
                        }
                    } else {
                        obj2 = c10.v(pluginGeneratedSerialDescriptor, 1, kSerializer, obj2);
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
        return new h(i10, obj, obj2, list, obj3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return this.f14550a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h hVar = (h) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", hVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f14550a;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        KSerializer kSerializer = this.f14551b;
        c10.i(pluginGeneratedSerialDescriptor, 0, kSerializer, hVar.f14554a);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        Object obj2 = hVar.f14555b;
        if (C10 || obj2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 1, kSerializer, obj2);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        List list = hVar.f14556c;
        if (C11 || !AbstractC3557B.K(list, v.f37483Y)) {
            c10.i(pluginGeneratedSerialDescriptor, 2, new C2695d(kSerializer, 0), list);
        }
        c10.i(pluginGeneratedSerialDescriptor, 3, this.f14552c, hVar.f14557d);
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.f14551b, this.f14552c};
    }
}
