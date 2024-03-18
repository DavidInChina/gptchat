package jc;

import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.u0;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* renamed from: jc.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3937e implements AbstractC2680F {

    /* renamed from: a  reason: collision with root package name */
    public static final C3937e f36106a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ InlineClassDescriptor f36107b;

    /* JADX WARN: Type inference failed for: r0v0, types: [jc.e, dh.F, java.lang.Object] */
    static {
        ?? obj = new Object();
        f36106a = obj;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.feature.settings.impl.memory.api.MemoryId", obj);
        inlineClassDescriptor.k("value", false);
        f36107b = inlineClassDescriptor;
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u0.f28491a};
    }

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        String o10 = decoder.w(f36107b).o();
        AbstractC3557B.c0("value", o10);
        return new C3939g(o10);
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f36107b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = ((C3939g) obj).f36108a;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", str);
        Encoder v10 = encoder.v(f36107b);
        if (v10 != null) {
            v10.D(str);
        }
    }

    @Override // dh.AbstractC2680F
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
