package com.revenuecat.purchases.paywalls.events;

import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2686L;
import dh.C2701g;
import dh.u0;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/events/PaywallPostReceiptData.$serializer", "Ldh/F;", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaywallPostReceiptData$$serializer implements AbstractC2680F {
    public static final PaywallPostReceiptData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PaywallPostReceiptData$$serializer paywallPostReceiptData$$serializer = new PaywallPostReceiptData$$serializer();
        INSTANCE = paywallPostReceiptData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData", paywallPostReceiptData$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("session_id", false);
        pluginGeneratedSerialDescriptor.k("revision", false);
        pluginGeneratedSerialDescriptor.k("display_mode", false);
        pluginGeneratedSerialDescriptor.k("dark_mode", false);
        pluginGeneratedSerialDescriptor.k("locale", false);
        pluginGeneratedSerialDescriptor.k("offering_id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallPostReceiptData$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, C2686L.f28406a, u0Var, C2701g.f28450a, u0Var, u0Var};
    }

    @Override // ah.AbstractC1991b
    public PaywallPostReceiptData deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z11 = true;
        while (z11) {
            int t10 = c10.t(descriptor2);
            switch (t10) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    str = c10.r(descriptor2, 0);
                    i10 |= 1;
                    break;
                case 1:
                    i11 = c10.m(descriptor2, 1);
                    i10 |= 2;
                    break;
                case 2:
                    str2 = c10.r(descriptor2, 2);
                    i10 |= 4;
                    break;
                case 3:
                    z10 = c10.q(descriptor2, 3);
                    i10 |= 8;
                    break;
                case 4:
                    str3 = c10.r(descriptor2, 4);
                    i10 |= 16;
                    break;
                case 5:
                    str4 = c10.r(descriptor2, 5);
                    i10 |= 32;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(descriptor2);
        return new PaywallPostReceiptData(i10, str, i11, str2, z10, str3, str4, null);
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, PaywallPostReceiptData paywallPostReceiptData) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", paywallPostReceiptData);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        PaywallPostReceiptData.write$Self(paywallPostReceiptData, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
