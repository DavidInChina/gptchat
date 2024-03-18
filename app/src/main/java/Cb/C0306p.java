package Cb;

import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* renamed from: Cb.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0306p implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C0306p f2957a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ InlineClassDescriptor f2958b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, java.lang.Object, Cb.p] */
    static {
        ?? obj = new Object();
        f2957a = obj;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.feature.onboarding.impl.ArkoseToken", obj);
        inlineClassDescriptor.k("value", false);
        f2958b = inlineClassDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u0.f28491a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        String o10 = decoder.w(f2958b).o();
        AbstractC3557B.c0("value", o10);
        return new r(o10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f2958b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = ((r) obj).f2959a;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", str);
        Encoder v10 = encoder.v(f2958b);
        if (v10 != null) {
            v10.D(str);
        }
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
