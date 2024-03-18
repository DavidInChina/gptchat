package cb;

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

/* renamed from: cb.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2335D implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C2335D f26464a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f26465b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, cb.D] */
    static {
        ?? obj = new Object();
        f26464a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.GizmoAbout", obj, 4);
        pluginGeneratedSerialDescriptor.k("gizmo", false);
        pluginGeneratedSerialDescriptor.k("toolTypes", false);
        pluginGeneratedSerialDescriptor.k("aboutBlocks", true);
        pluginGeneratedSerialDescriptor.k("ratingData", true);
        f26465b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C2337F.f26466e;
        return new KSerializer[]{C2357a.f26503a, kSerializerArr[1], A7.b.U0(kSerializerArr[2]), A7.b.U0(kSerializerArr[3])};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26465b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2337F.f26466e;
        C2334C c2334c = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            if (t10 != -1) {
                if (t10 != 0) {
                    if (t10 != 1) {
                        if (t10 != 2) {
                            if (t10 == 3) {
                                list3 = (List) c10.v(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list3);
                                i10 |= 8;
                            } else {
                                throw new C2004o(t10);
                            }
                        } else {
                            list2 = (List) c10.v(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list2);
                            i10 |= 4;
                        }
                    } else {
                        list = (List) c10.n(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                        i10 |= 2;
                    }
                } else {
                    c2334c = (C2334C) c10.n(pluginGeneratedSerialDescriptor, 0, C2357a.f26503a, c2334c);
                    i10 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new C2337F(i10, c2334c, list, list2, list3);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f26465b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2337F c2337f = (C2337F) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", c2337f);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f26465b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        C2336E c2336e = C2337F.Companion;
        c10.i(pluginGeneratedSerialDescriptor, 0, C2357a.f26503a, c2337f.f26467a);
        KSerializer[] kSerializerArr = C2337F.f26466e;
        c10.i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], c2337f.f26468b);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        List list = c2337f.f26469c;
        if (C10 || list != null) {
            c10.q(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        List list2 = c2337f.f26470d;
        if (C11 || list2 != null) {
            c10.q(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list2);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
