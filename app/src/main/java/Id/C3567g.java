package id;

import bh.C2215e;
import dh.m0;
import eh.AbstractC2910j;
import eh.AbstractC2911k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.JsonNull;

/* renamed from: id.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3567g implements KSerializer {

    /* renamed from: a  reason: collision with root package name */
    public static final C3567g f33094a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f33095b = Ad.l.t("DoubleOrString", C2215e.f25994i);

    @Override // ah.AbstractC1991b
    public final Object deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        if (decoder instanceof AbstractC2910j) {
            kotlinx.serialization.json.b k10 = ((AbstractC2910j) decoder).k();
            boolean z10 = k10 instanceof kotlinx.serialization.json.d;
            if (z10) {
                kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) k10;
                InlineClassDescriptor inlineClassDescriptor = AbstractC2911k.f29457a;
                AbstractC3557B.c0("<this>", dVar);
                if (Lg.m.V1(dVar.r()) != null) {
                    return new C3563c(Double.parseDouble(AbstractC2911k.h(k10).r()));
                }
            }
            if (z10 && AbstractC2911k.e((kotlinx.serialization.json.d) k10) != null) {
                return new C3565e(AbstractC2911k.h(k10).r());
            }
            if (k10 instanceof JsonNull) {
                return C3564d.f33092a;
            }
            throw new IllegalArgumentException("Expected double, string, or null. Got " + k10);
        }
        throw new IllegalStateException("Decoder is not JsonDecoder.".toString());
    }

    @Override // ah.AbstractC1991b
    public final SerialDescriptor getDescriptor() {
        return f33095b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3566f abstractC3566f = (AbstractC3566f) obj;
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", abstractC3566f);
        if (abstractC3566f instanceof C3563c) {
            encoder.g(((C3563c) abstractC3566f).f33091a);
        } else if (abstractC3566f instanceof C3565e) {
            encoder.D(((C3565e) abstractC3566f).f33093a);
        } else if (abstractC3566f instanceof C3564d) {
            encoder.e();
        }
    }
}
