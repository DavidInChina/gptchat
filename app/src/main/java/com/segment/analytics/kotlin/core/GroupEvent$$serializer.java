package com.segment.analytics.kotlin.core;

import Qd.o;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import eh.C2899A;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"com/segment/analytics/kotlin/core/GroupEvent.$serializer", "Ldh/F;", "Lcom/segment/analytics/kotlin/core/GroupEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/GroupEvent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/GroupEvent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class GroupEvent$$serializer implements AbstractC2680F {
    public static final GroupEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GroupEvent$$serializer groupEvent$$serializer = new GroupEvent$$serializer();
        INSTANCE = groupEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("group", groupEvent$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("groupId", false);
        pluginGeneratedSerialDescriptor.k("traits", false);
        pluginGeneratedSerialDescriptor.k("type", true);
        pluginGeneratedSerialDescriptor.k("messageId", false);
        pluginGeneratedSerialDescriptor.k("anonymousId", false);
        pluginGeneratedSerialDescriptor.k("integrations", false);
        pluginGeneratedSerialDescriptor.k("context", false);
        pluginGeneratedSerialDescriptor.k("userId", true);
        pluginGeneratedSerialDescriptor.k("_metadata", true);
        pluginGeneratedSerialDescriptor.k(DiagnosticsEntry.Event.TIMESTAMP_KEY, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GroupEvent$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        KSerializer serializer = o.Companion.serializer();
        u0 u0Var = u0.f28491a;
        C2899A c2899a = C2899A.f29405a;
        return new KSerializer[]{u0Var, c2899a, serializer, u0Var, u0Var, c2899a, c2899a, u0Var, DestinationMetadata$$serializer.INSTANCE, u0Var};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.segment.analytics.kotlin.core.GroupEvent, java.lang.Object] */
    @Override // ah.AbstractC1991b
    public GroupEvent deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        String str = null;
        boolean z10 = true;
        int i10 = 0;
        String str2 = null;
        Object obj = null;
        Object obj2 = null;
        String str3 = null;
        String str4 = null;
        Object obj3 = null;
        Object obj4 = null;
        String str5 = null;
        Object obj5 = null;
        while (z10) {
            int t10 = c10.t(descriptor2);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    str2 = c10.r(descriptor2, 0);
                    i10 |= 1;
                    break;
                case 1:
                    obj = c10.n(descriptor2, 1, C2899A.f29405a, obj);
                    i10 |= 2;
                    break;
                case 2:
                    obj2 = c10.n(descriptor2, 2, o.Companion.serializer(), obj2);
                    i10 |= 4;
                    break;
                case 3:
                    str3 = c10.r(descriptor2, 3);
                    i10 |= 8;
                    break;
                case 4:
                    str4 = c10.r(descriptor2, 4);
                    i10 |= 16;
                    break;
                case 5:
                    obj3 = c10.n(descriptor2, 5, C2899A.f29405a, obj3);
                    i10 |= 32;
                    break;
                case 6:
                    obj4 = c10.n(descriptor2, 6, C2899A.f29405a, obj4);
                    i10 |= 64;
                    break;
                case 7:
                    str5 = c10.r(descriptor2, 7);
                    i10 |= 128;
                    break;
                case 8:
                    obj5 = c10.n(descriptor2, 8, DestinationMetadata$$serializer.INSTANCE, obj5);
                    i10 |= 256;
                    break;
                case 9:
                    str = c10.r(descriptor2, 9);
                    i10 |= 512;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(descriptor2);
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj;
        o oVar = (o) obj2;
        kotlinx.serialization.json.c cVar2 = (kotlinx.serialization.json.c) obj3;
        kotlinx.serialization.json.c cVar3 = (kotlinx.serialization.json.c) obj4;
        DestinationMetadata destinationMetadata = (DestinationMetadata) obj5;
        if (635 != (i10 & 635)) {
            R4.b.e2(i10, 635, INSTANCE.getDescriptor());
            throw null;
        }
        ?? obj6 = new Object();
        obj6.f27766a = str2;
        obj6.f27767b = cVar;
        if ((i10 & 4) == 0) {
            obj6.f27768c = o.f14645k0;
        } else {
            obj6.f27768c = oVar;
        }
        obj6.f27769d = str3;
        obj6.f27770e = str4;
        obj6.f27771f = cVar2;
        obj6.f27772g = cVar3;
        if ((i10 & 128) == 0) {
            obj6.f27773h = "";
        } else {
            obj6.f27773h = str5;
        }
        if ((i10 & 256) == 0) {
            obj6.f27774i = new DestinationMetadata();
        } else {
            obj6.f27774i = destinationMetadata;
        }
        obj6.f27775j = str;
        return obj6;
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, GroupEvent groupEvent) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", groupEvent);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        AbstractC3557B.c0("serialDesc", descriptor2);
        c10.z(0, groupEvent.f27766a, descriptor2);
        C2899A c2899a = C2899A.f29405a;
        c10.i(descriptor2, 1, c2899a, groupEvent.f27767b);
        boolean C10 = c10.C(descriptor2);
        o oVar = groupEvent.f27768c;
        if (C10 || oVar != o.f14645k0) {
            c10.i(descriptor2, 2, o.Companion.serializer(), oVar);
        }
        c10.z(3, groupEvent.f(), descriptor2);
        c10.z(4, groupEvent.c(), descriptor2);
        c10.i(descriptor2, 5, c2899a, groupEvent.e());
        c10.i(descriptor2, 6, c2899a, groupEvent.d());
        if (c10.C(descriptor2) || !AbstractC3557B.K(groupEvent.f27773h, "")) {
            c10.z(7, groupEvent.f27773h, descriptor2);
        }
        if (c10.C(descriptor2) || !AbstractC3557B.K(groupEvent.f27774i, new DestinationMetadata())) {
            c10.i(descriptor2, 8, DestinationMetadata$$serializer.INSTANCE, groupEvent.f27774i);
        }
        c10.z(9, groupEvent.g(), descriptor2);
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
