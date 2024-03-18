package wd;

import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* renamed from: wd.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6207u implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6207u f48466a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ InlineClassDescriptor f48467b;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd.u, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f48466a = obj;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.types.AssetPointer", obj);
        inlineClassDescriptor.k("value", false);
        f48467b = inlineClassDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{dh.u0.f28491a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        String o10 = decoder.w(f48467b).o();
        AbstractC3557B.c0("value", o10);
        return new C6209w(o10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48467b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = ((C6209w) obj).f48469a;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", str);
        Encoder v10 = encoder.v(f48467b);
        if (v10 != null) {
            v10.D(str);
        }
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
