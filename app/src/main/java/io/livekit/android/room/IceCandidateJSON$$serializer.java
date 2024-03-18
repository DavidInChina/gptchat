package io.livekit.android.room;

import A7.b;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import dh.u0;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"io/livekit/android/room/IceCandidateJSON.$serializer", "Ldh/F;", "Lio/livekit/android/room/IceCandidateJSON;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/livekit/android/room/IceCandidateJSON;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/livekit/android/room/IceCandidateJSON;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IceCandidateJSON$$serializer implements AbstractC2680F {
    public static final IceCandidateJSON$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        IceCandidateJSON$$serializer iceCandidateJSON$$serializer = new IceCandidateJSON$$serializer();
        INSTANCE = iceCandidateJSON$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.livekit.android.room.IceCandidateJSON", iceCandidateJSON$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("candidate", false);
        pluginGeneratedSerialDescriptor.k("sdpMLineIndex", false);
        pluginGeneratedSerialDescriptor.k("sdpMid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IceCandidateJSON$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, C2686L.f28406a, b.U0(u0Var)};
    }

    @Override // ah.AbstractC1991b
    public IceCandidateJSON deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        String str = null;
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        Object obj = null;
        while (z10) {
            int t10 = c10.t(descriptor2);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                str = c10.r(descriptor2, 0);
                i10 |= 1;
            } else if (t10 == 1) {
                i11 = c10.m(descriptor2, 1);
                i10 |= 2;
            } else if (t10 != 2) {
                throw new C2004o(t10);
            } else {
                obj = c10.v(descriptor2, 2, u0.f28491a, obj);
                i10 |= 4;
            }
        }
        c10.b(descriptor2);
        return new IceCandidateJSON(i10, i11, str, (String) obj);
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, IceCandidateJSON iceCandidateJSON) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", iceCandidateJSON);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        c10.z(0, iceCandidateJSON.f33702a, descriptor2);
        c10.m(1, iceCandidateJSON.f33703b, descriptor2);
        c10.q(descriptor2, 2, u0.f28491a, iceCandidateJSON.f33704c);
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
