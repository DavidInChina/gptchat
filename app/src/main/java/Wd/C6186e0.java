package wd;

import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* renamed from: wd.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6186e0 implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C6186e0 f48396a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ InlineClassDescriptor f48397b;

    /* JADX WARN: Type inference failed for: r0v0, types: [dh.F, wd.e0, java.lang.Object] */
    static {
        ?? obj = new Object();
        f48396a = obj;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.types.ModelSlug", obj);
        inlineClassDescriptor.k("name", false);
        f48397b = inlineClassDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{dh.u0.f28491a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        String o10 = decoder.w(f48397b).o();
        AbstractC3557B.c0("name", o10);
        return new C6190g0(o10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f48397b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = ((C6190g0) obj).f48419a;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", str);
        Encoder v10 = encoder.v(f48397b);
        if (v10 != null) {
            v10.D(str);
        }
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
