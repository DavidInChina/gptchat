package id;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes.dex */
public final class v implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final v f33129a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f33130b;

    /* JADX WARN: Type inference failed for: r0v0, types: [id.v, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f33129a = obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.platform.spreadsheet.SpreadsheetModel", obj, 6);
        pluginGeneratedSerialDescriptor.k("data", false);
        pluginGeneratedSerialDescriptor.k("metadata", true);
        pluginGeneratedSerialDescriptor.k("suggestions", true);
        pluginGeneratedSerialDescriptor.k("rows", true);
        pluginGeneratedSerialDescriptor.k("columnNames", true);
        pluginGeneratedSerialDescriptor.k("columns", true);
        f33130b = pluginGeneratedSerialDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = x.f33131g;
        KSerializer kSerializer = kSerializerArr[0];
        KSerializer kSerializer2 = kSerializerArr[2];
        KSerializer kSerializer3 = kSerializerArr[4];
        C2686L c2686l = C2686L.f28406a;
        return new KSerializer[]{kSerializer, s.f33125a, kSerializer2, c2686l, kSerializer3, c2686l};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f33130b;
        AbstractC2430a c10 = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = x.f33131g;
        List list = null;
        u uVar = null;
        List list2 = null;
        List list3 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        while (z10) {
            int t10 = c10.t(pluginGeneratedSerialDescriptor);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    list = (List) c10.n(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], list);
                    i10 |= 1;
                    break;
                case 1:
                    uVar = (u) c10.n(pluginGeneratedSerialDescriptor, 1, s.f33125a, uVar);
                    i10 |= 2;
                    break;
                case 2:
                    list2 = (List) c10.n(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list2);
                    i10 |= 4;
                    break;
                case 3:
                    i11 = c10.m(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    list3 = (List) c10.n(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list3);
                    i10 |= 16;
                    break;
                case 5:
                    i12 = c10.m(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(pluginGeneratedSerialDescriptor);
        return new x(i10, list, uVar, list2, i11, list3, i12);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f33130b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (id.AbstractC3557B.K(r5, r3) == false) goto L29;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        Collection collection;
        Set keySet;
        x xVar = (x) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", xVar);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f33130b;
        AbstractC2431b c10 = encoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = x.f33131g;
        KSerializer kSerializer = kSerializerArr[0];
        List list = xVar.f33132a;
        c10.i(pluginGeneratedSerialDescriptor, 0, kSerializer, list);
        boolean C10 = c10.C(pluginGeneratedSerialDescriptor);
        u uVar = xVar.f33133b;
        if (C10 || !AbstractC3557B.K(uVar, new u())) {
            c10.i(pluginGeneratedSerialDescriptor, 1, s.f33125a, uVar);
        }
        boolean C11 = c10.C(pluginGeneratedSerialDescriptor);
        Collection collection2 = kf.v.f37483Y;
        List list2 = xVar.f33134c;
        if (C11 || !AbstractC3557B.K(list2, collection2)) {
            c10.i(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list2);
        }
        boolean C12 = c10.C(pluginGeneratedSerialDescriptor);
        int i10 = xVar.f33135d;
        if (C12 || i10 != list.size()) {
            c10.m(3, i10, pluginGeneratedSerialDescriptor);
        }
        boolean C13 = c10.C(pluginGeneratedSerialDescriptor);
        List list3 = xVar.f33136e;
        if (!C13) {
            Map map = (Map) kf.t.h2(list);
            if (map != null && (keySet = map.keySet()) != null) {
                collection = kf.t.K2(keySet);
            } else {
                collection = null;
            }
            if (collection != null) {
                collection2 = collection;
            }
        }
        c10.i(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list3);
        boolean C14 = c10.C(pluginGeneratedSerialDescriptor);
        int i11 = xVar.f33137f;
        if (C14 || i11 != list3.size()) {
            c10.m(5, i11, pluginGeneratedSerialDescriptor);
        }
        c10.b(pluginGeneratedSerialDescriptor);
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
