package com.revenuecat.purchases.paywalls;

import A7.b;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import com.revenuecat.purchases.paywalls.PaywallData;
import dh.AbstractC2680F;
import dh.AbstractC2704h0;
import dh.C2695d;
import dh.q0;
import dh.u0;
import id.AbstractC3557B;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.LocalizedConfiguration.$serializer", "Ldh/F;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaywallData$LocalizedConfiguration$$serializer implements AbstractC2680F {
    public static final PaywallData$LocalizedConfiguration$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = new PaywallData$LocalizedConfiguration$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration", paywallData$LocalizedConfiguration$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("subtitle", true);
        pluginGeneratedSerialDescriptor.k("call_to_action", false);
        pluginGeneratedSerialDescriptor.k("call_to_action_with_intro_offer", true);
        pluginGeneratedSerialDescriptor.k("call_to_action_with_multiple_intro_offers", true);
        pluginGeneratedSerialDescriptor.k("offer_details", true);
        pluginGeneratedSerialDescriptor.k("offer_details_with_intro_offer", true);
        pluginGeneratedSerialDescriptor.k("offer_details_with_multiple_intro_offers", true);
        pluginGeneratedSerialDescriptor.k("offer_name", true);
        pluginGeneratedSerialDescriptor.k("features", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallData$LocalizedConfiguration$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        KSerializer U02 = b.U0(emptyStringToNullSerializer);
        KSerializer U03 = b.U0(emptyStringToNullSerializer);
        KSerializer U04 = b.U0(emptyStringToNullSerializer);
        KSerializer U05 = b.U0(emptyStringToNullSerializer);
        KSerializer U06 = b.U0(emptyStringToNullSerializer);
        KSerializer U07 = b.U0(emptyStringToNullSerializer);
        KSerializer U08 = b.U0(emptyStringToNullSerializer);
        C2695d c2695d = new C2695d(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE, 0);
        u0 u0Var = u0.f28491a;
        return new KSerializer[]{u0Var, U02, u0Var, U03, U04, U05, U06, U07, U08, c2695d};
    }

    @Override // ah.AbstractC1991b
    public PaywallData.LocalizedConfiguration deserialize(Decoder decoder) {
        boolean z10;
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        Object obj = null;
        int i10 = 0;
        Object obj2 = null;
        Object obj3 = null;
        String str = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        String str2 = null;
        boolean z11 = true;
        while (z11) {
            int t10 = c10.t(descriptor2);
            switch (t10) {
                case -1:
                    z11 = false;
                    continue;
                case 0:
                    z10 = z11;
                    str = c10.r(descriptor2, 0);
                    i10 |= 1;
                    break;
                case 1:
                    z10 = z11;
                    obj = c10.v(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, obj);
                    i10 |= 2;
                    break;
                case 2:
                    str2 = c10.r(descriptor2, 2);
                    i10 |= 4;
                    continue;
                case 3:
                    z10 = z11;
                    obj2 = c10.v(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, obj2);
                    i10 |= 8;
                    break;
                case 4:
                    z10 = z11;
                    obj3 = c10.v(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, obj3);
                    i10 |= 16;
                    break;
                case 5:
                    z10 = z11;
                    obj4 = c10.v(descriptor2, 5, EmptyStringToNullSerializer.INSTANCE, obj4);
                    i10 |= 32;
                    break;
                case 6:
                    z10 = z11;
                    obj5 = c10.v(descriptor2, 6, EmptyStringToNullSerializer.INSTANCE, obj5);
                    i10 |= 64;
                    break;
                case 7:
                    z10 = z11;
                    obj6 = c10.v(descriptor2, 7, EmptyStringToNullSerializer.INSTANCE, obj6);
                    i10 |= 128;
                    break;
                case 8:
                    z10 = z11;
                    obj7 = c10.v(descriptor2, 8, EmptyStringToNullSerializer.INSTANCE, obj7);
                    i10 |= 256;
                    break;
                case 9:
                    z10 = z11;
                    obj8 = c10.n(descriptor2, 9, new C2695d(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE, 0), obj8);
                    i10 |= 512;
                    break;
                default:
                    throw new C2004o(t10);
            }
            z11 = z10;
        }
        c10.b(descriptor2);
        return new PaywallData.LocalizedConfiguration(i10, str, (String) obj, str2, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (List) obj8, (q0) null);
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, PaywallData.LocalizedConfiguration localizedConfiguration) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", localizedConfiguration);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        PaywallData.LocalizedConfiguration.write$Self(localizedConfiguration, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
