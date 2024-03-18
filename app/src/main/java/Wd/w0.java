package wd;

import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* loaded from: classes.dex */
public final class w0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f48470a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ InlineClassDescriptor f48471b;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd.w0, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f48470a = obj;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.types.SharedConversationId", obj);
        inlineClassDescriptor.k("value", false);
        f48471b = inlineClassDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{dh.u0.f28491a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        String o10 = decoder.w(f48471b).o();
        AbstractC3557B.c0("value", o10);
        return new y0(o10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48471b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = ((y0) obj).f48473a;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", str);
        Encoder v10 = encoder.v(f48471b);
        if (v10 != null) {
            v10.D(str);
        }
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
