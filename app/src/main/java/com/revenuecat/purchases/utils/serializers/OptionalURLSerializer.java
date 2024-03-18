package com.revenuecat.purchases.utils.serializers;

import A7.b;
import Ad.l;
import bh.C2215e;
import id.AbstractC3557B;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c0\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/OptionalURLSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/net/URL;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/net/URL;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/net/URL;)V", "delegate", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OptionalURLSerializer implements KSerializer {
    public static final OptionalURLSerializer INSTANCE = new OptionalURLSerializer();
    private static final KSerializer delegate = b.U0(URLSerializer.INSTANCE);
    private static final SerialDescriptor descriptor = l.t("URL?", C2215e.f25994i);

    private OptionalURLSerializer() {
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ah.AbstractC1991b
    public URL deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        try {
            return (URL) delegate.deserialize(decoder);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public void serialize(Encoder encoder, URL url) {
        AbstractC3557B.c0("encoder", encoder);
        if (url == null) {
            encoder.D("");
        } else {
            delegate.serialize(encoder, url);
        }
    }
}
