package O9;

import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* loaded from: classes2.dex */
public final class b1 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final b1 f13522a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ InlineClassDescriptor f13523b;

    /* JADX WARN: Type inference failed for: r0v0, types: [O9.b1, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f13522a = obj;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.feature.conversations.api.message.ApiMultimodalTextContentPart.Image", obj);
        inlineClassDescriptor.k("value", false);
        f13523b = inlineClassDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{wd.P.f48363a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        wd.Y y10 = (wd.Y) decoder.w(f13523b).g(wd.P.f48363a);
        AbstractC3557B.c0("value", y10);
        return new d1(y10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f13523b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wd.Y y10 = ((d1) obj).f13530a;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", y10);
        Encoder v10 = encoder.v(f13523b);
        if (v10 != null) {
            v10.w(wd.P.f48363a, y10);
        }
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
