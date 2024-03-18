package com.revenuecat.purchases.paywalls;

import A7.b;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import com.revenuecat.purchases.paywalls.PaywallData;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.q0;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.Configuration.ColorInformation.$serializer", "Ldh/F;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PaywallData$Configuration$ColorInformation$$serializer implements AbstractC2680F {
    public static final PaywallData$Configuration$ColorInformation$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PaywallData$Configuration$ColorInformation$$serializer paywallData$Configuration$ColorInformation$$serializer = new PaywallData$Configuration$ColorInformation$$serializer();
        INSTANCE = paywallData$Configuration$ColorInformation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation", paywallData$Configuration$ColorInformation$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("light", false);
        pluginGeneratedSerialDescriptor.k("dark", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallData$Configuration$ColorInformation$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
        return new KSerializer[]{paywallData$Configuration$Colors$$serializer, b.U0(paywallData$Configuration$Colors$$serializer)};
    }

    @Override // ah.AbstractC1991b
    public PaywallData.Configuration.ColorInformation deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        boolean z10 = true;
        int i10 = 0;
        Object obj = null;
        Object obj2 = null;
        while (z10) {
            int t10 = c10.t(descriptor2);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                obj = c10.n(descriptor2, 0, PaywallData$Configuration$Colors$$serializer.INSTANCE, obj);
                i10 |= 1;
            } else if (t10 != 1) {
                throw new C2004o(t10);
            } else {
                obj2 = c10.v(descriptor2, 1, PaywallData$Configuration$Colors$$serializer.INSTANCE, obj2);
                i10 |= 2;
            }
        }
        c10.b(descriptor2);
        return new PaywallData.Configuration.ColorInformation(i10, (PaywallData.Configuration.Colors) obj, (PaywallData.Configuration.Colors) obj2, (q0) null);
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, PaywallData.Configuration.ColorInformation colorInformation) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", colorInformation);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        PaywallData.Configuration.ColorInformation.write$Self(colorInformation, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
