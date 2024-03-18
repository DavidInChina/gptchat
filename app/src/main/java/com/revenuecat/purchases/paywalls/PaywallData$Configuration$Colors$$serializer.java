package com.revenuecat.purchases.paywalls;

import A7.b;
import ah.C2004o;
import ch.AbstractC2430a;
import ch.AbstractC2431b;
import com.revenuecat.purchases.paywalls.PaywallColor;
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

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.Configuration.Colors.$serializer", "Ldh/F;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Ljf/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PaywallData$Configuration$Colors$$serializer implements AbstractC2680F {
    public static final PaywallData$Configuration$Colors$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = new PaywallData$Configuration$Colors$$serializer();
        INSTANCE = paywallData$Configuration$Colors$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors", paywallData$Configuration$Colors$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("background", false);
        pluginGeneratedSerialDescriptor.k("text_1", false);
        pluginGeneratedSerialDescriptor.k("text_2", true);
        pluginGeneratedSerialDescriptor.k("text_3", true);
        pluginGeneratedSerialDescriptor.k("call_to_action_background", false);
        pluginGeneratedSerialDescriptor.k("call_to_action_foreground", false);
        pluginGeneratedSerialDescriptor.k("call_to_action_secondary_background", true);
        pluginGeneratedSerialDescriptor.k("accent_1", true);
        pluginGeneratedSerialDescriptor.k("accent_2", true);
        pluginGeneratedSerialDescriptor.k("accent_3", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallData$Configuration$Colors$$serializer() {
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new KSerializer[]{serializer, serializer, b.U0(serializer), b.U0(serializer), serializer, serializer, b.U0(serializer), b.U0(serializer), b.U0(serializer), b.U0(serializer)};
    }

    @Override // ah.AbstractC1991b
    public PaywallData.Configuration.Colors deserialize(Decoder decoder) {
        AbstractC3557B.c0("decoder", decoder);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2430a c10 = decoder.c(descriptor2);
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int t10 = c10.t(descriptor2);
            switch (t10) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    obj = c10.n(descriptor2, 0, PaywallColor.Serializer.INSTANCE, obj);
                    i10 |= 1;
                    break;
                case 1:
                    obj2 = c10.n(descriptor2, 1, PaywallColor.Serializer.INSTANCE, obj2);
                    i10 |= 2;
                    break;
                case 2:
                    obj3 = c10.v(descriptor2, 2, PaywallColor.Serializer.INSTANCE, obj3);
                    i10 |= 4;
                    break;
                case 3:
                    obj4 = c10.v(descriptor2, 3, PaywallColor.Serializer.INSTANCE, obj4);
                    i10 |= 8;
                    break;
                case 4:
                    obj5 = c10.n(descriptor2, 4, PaywallColor.Serializer.INSTANCE, obj5);
                    i10 |= 16;
                    break;
                case 5:
                    obj6 = c10.n(descriptor2, 5, PaywallColor.Serializer.INSTANCE, obj6);
                    i10 |= 32;
                    break;
                case 6:
                    obj7 = c10.v(descriptor2, 6, PaywallColor.Serializer.INSTANCE, obj7);
                    i10 |= 64;
                    break;
                case 7:
                    obj8 = c10.v(descriptor2, 7, PaywallColor.Serializer.INSTANCE, obj8);
                    i10 |= 128;
                    break;
                case 8:
                    obj9 = c10.v(descriptor2, 8, PaywallColor.Serializer.INSTANCE, obj9);
                    i10 |= 256;
                    break;
                case 9:
                    obj10 = c10.v(descriptor2, 9, PaywallColor.Serializer.INSTANCE, obj10);
                    i10 |= 512;
                    break;
                default:
                    throw new C2004o(t10);
            }
        }
        c10.b(descriptor2);
        return new PaywallData.Configuration.Colors(i10, (PaywallColor) obj, (PaywallColor) obj2, (PaywallColor) obj3, (PaywallColor) obj4, (PaywallColor) obj5, (PaywallColor) obj6, (PaywallColor) obj7, (PaywallColor) obj8, (PaywallColor) obj9, (PaywallColor) obj10, (q0) null);
    }

    @Override // ah.AbstractC1991b
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, PaywallData.Configuration.Colors colors) {
        AbstractC3557B.c0("encoder", encoder);
        AbstractC3557B.c0("value", colors);
        SerialDescriptor descriptor2 = getDescriptor();
        AbstractC2431b c10 = encoder.c(descriptor2);
        PaywallData.Configuration.Colors.write$Self(colors, c10, descriptor2);
        c10.b(descriptor2);
    }

    @Override // dh.AbstractC2680F
    public KSerializer[] typeParametersSerializers() {
        return AbstractC2704h0.f28456b;
    }
}
