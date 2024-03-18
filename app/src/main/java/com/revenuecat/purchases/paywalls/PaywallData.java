package com.revenuecat.purchases.paywalls;

import E9.f;
import R4.b;
import ah.AbstractC1998i;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import ch.AbstractC2431b;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.utils.LocaleExtensionsKt;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import dh.C2682H;
import dh.C2695d;
import dh.q0;
import dh.u0;
import id.AbstractC3557B;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jf.C3959i;
import kf.q;
import kf.t;
import kf.v;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import r9.y;

@AbstractC1998i
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0004JIKLB=\u0012\u0006\u0010$\u001a\u00020\u0014\u0012\u0006\u0010%\u001a\u00020\u0017\u0012\u0006\u0010&\u001a\u00020\u001a\u0012\b\b\u0002\u0010'\u001a\u00020\u001d\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0 \u00a2\u0006\u0004\bC\u0010DB]\b\u0017\u0012\u0006\u0010E\u001a\u00020\u001d\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010'\u001a\u00020\u001d\u0012\u0016\b\u0001\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010 \u0012\b\u0010G\u001a\u0004\u0018\u00010F\u00a2\u0006\u0004\bC\u0010HJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00c6\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u00c6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u00c6\u0003\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0 H\u00c0\u0003\u00a2\u0006\u0004\b!\u0010\"JN\u0010)\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001d2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0 H\u00c6\u0001\u00a2\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\b+\u0010\u0016J\u0010\u0010,\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\b,\u0010\u001fJ\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b/\u00100R \u0010$\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b$\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0016R\u0017\u0010%\u001a\u00020\u00178\u0006\u00a2\u0006\f\n\u0004\b%\u00105\u001a\u0004\b6\u0010\u0019R \u0010&\u001a\u00020\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b&\u00107\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010\u001cR\u0017\u0010'\u001a\u00020\u001d8\u0006\u00a2\u0006\f\n\u0004\b'\u0010:\u001a\u0004\b;\u0010\u001fR,\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0 8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\b(\u0010<\u0012\u0004\b>\u00104\u001a\u0004\b=\u0010\"R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r8CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b?\u0010@R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r8G\u00a2\u0006\u0006\u001a\u0004\bB\u0010@\u00a8\u0006M"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData;", "", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "Ljava/util/Locale;", "locales", "Ljf/i;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "localizedConfiguration", "(Ljava/util/List;)Ljf/i;", "requiredLocale", "configForLocale", "(Ljava/util/Locale;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "", "component1", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "component2", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "Ljava/net/URL;", "component3", "()Ljava/net/URL;", "", "component4", "()I", "", "component5$purchases_customEntitlementComputationRelease", "()Ljava/util/Map;", "component5", "templateName", "config", "assetBaseURL", "revision", "localization", "copy", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTemplateName", "getTemplateName$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "getConfig", "Ljava/net/URL;", "getAssetBaseURL", "getAssetBaseURL$annotations", TokenNames.f24313I, "getRevision", "Ljava/util/Map;", "getLocalization$purchases_customEntitlementComputationRelease", "getLocalization$purchases_customEntitlementComputationRelease$annotations", "getFallbackLocalizedConfiguration", "()Ljf/i;", "fallbackLocalizedConfiguration", "getLocalizedConfiguration", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Ljava/net/URL;ILjava/util/Map;Ldh/q0;)V", "Companion", "$serializer", "Configuration", "LocalizedConfiguration", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PaywallData {
    public static final Companion Companion = new Companion(null);
    private final URL assetBaseURL;
    private final Configuration config;
    private final Map<String, LocalizedConfiguration> localization;
    private final int revision;
    private final String templateName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final KSerializer serializer() {
            return PaywallData$$serializer.INSTANCE;
        }
    }

    @AbstractC1998i
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0005UVWTXBm\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010!\u001a\u00020\u0016\u00a2\u0006\u0004\bM\u0010NB_\b\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010L\u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\bM\u0010OB\u0087\u0001\b\u0017\u0012\u0006\u0010P\u001a\u00020%\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010R\u001a\u0004\u0018\u00010Q\u00a2\u0006\u0004\bM\u0010SJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bH\u00c0\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\bH\u00c0\u0003\u00a2\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016H\u00c6\u0003\u00a2\u0006\u0004\b\u0017\u0010\u0018Jz\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010!\u001a\u00020\u0016H\u00c6\u0001\u00a2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\b$\u0010\u0007J\u0010\u0010&\u001a\u00020%H\u00d6\u0001\u00a2\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b)\u0010*J(\u00101\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u00c7\u0001\u00a2\u0006\u0004\b1\u00102R&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0019\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0005R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001a\u00107\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010\u0007R\"\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\b\u001b\u0010:\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010\nR\"\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\b\u001c\u0010:\u0012\u0004\b>\u00106\u001a\u0004\b=\u0010\nR \u0010\u001d\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001d\u0010?\u0012\u0004\bA\u00106\u001a\u0004\b@\u0010\u0010R \u0010\u001e\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001e\u0010?\u0012\u0004\bC\u00106\u001a\u0004\bB\u0010\u0010R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u001f\u0010D\u0012\u0004\bF\u00106\u001a\u0004\bE\u0010\u0014R\"\u0010 \u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b \u0010D\u0012\u0004\bH\u00106\u001a\u0004\bG\u0010\u0014R\u0017\u0010!\u001a\u00020\u00168\u0006\u00a2\u0006\f\n\u0004\b!\u0010I\u001a\u0004\bJ\u0010\u0018R\u0011\u0010L\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\bK\u0010\n\u00a8\u0006Y"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "", "", "", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "component3$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "component3", "component4$purchases_customEntitlementComputationRelease", "component4", "", "component5", "()Z", "component6", "Ljava/net/URL;", "component7", "()Ljava/net/URL;", "component8", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "component9", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "packageIds", "defaultPackage", "imagesWebp", "legacyImages", "blurredBackgroundImage", "displayRestorePurchases", "termsOfServiceURL", "privacyURL", "colors", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getPackageIds", "getPackageIds$annotations", "()V", "Ljava/lang/String;", "getDefaultPackage", "getDefaultPackage$annotations", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "getImagesWebp$purchases_customEntitlementComputationRelease", "getImagesWebp$purchases_customEntitlementComputationRelease$annotations", "getLegacyImages$purchases_customEntitlementComputationRelease", "getLegacyImages$purchases_customEntitlementComputationRelease$annotations", "Z", "getBlurredBackgroundImage", "getBlurredBackgroundImage$annotations", "getDisplayRestorePurchases", "getDisplayRestorePurchases$annotations", "Ljava/net/URL;", "getTermsOfServiceURL", "getTermsOfServiceURL$annotations", "getPrivacyURL", "getPrivacyURL$annotations", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "getColors", "getImages", "images", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;)V", "(Ljava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;ZZLjava/net/URL;Ljava/net/URL;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;ZZLjava/net/URL;Ljava/net/URL;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Ldh/q0;)V", "Companion", "$serializer", "ColorInformation", "Colors", "Images", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class Configuration {
        public static final Companion Companion = new Companion(null);
        private final boolean blurredBackgroundImage;
        private final ColorInformation colors;
        private final String defaultPackage;
        private final boolean displayRestorePurchases;
        private final Images imagesWebp;
        private final Images legacyImages;
        private final List<String> packageIds;
        private final URL privacyURL;
        private final URL termsOfServiceURL;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final KSerializer serializer() {
                return PaywallData$Configuration$$serializer.INSTANCE;
            }
        }

        @AbstractC1998i
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b(\u0010)B?\b\u0017\u0012\u0006\u0010*\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u00a2\u0006\u0004\b(\u0010-J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\fJ4\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\fR\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\fR\"\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\fR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0$8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u00060"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "component2", "component3", "header", "background", ParameterNames.ICON, "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getHeader$annotations", "()V", "getBackground", "getBackground$annotations", "getIcon", "getIcon$annotations", "", "getAll$purchases_customEntitlementComputationRelease", "()Ljava/util/List;", "all", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldh/q0;)V", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class Images {
            public static final Companion Companion = new Companion(null);
            private final String background;
            private final String header;
            private final String icon;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
            /* loaded from: classes.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(g gVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return PaywallData$Configuration$Images$$serializer.INSTANCE;
                }
            }

            public Images() {
                this((String) null, (String) null, (String) null, 7, (g) null);
            }

            public static /* synthetic */ Images copy$default(Images images, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = images.header;
                }
                if ((i10 & 2) != 0) {
                    str2 = images.background;
                }
                if ((i10 & 4) != 0) {
                    str3 = images.icon;
                }
                return images.copy(str, str2, str3);
            }

            @AbstractC1998i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @AbstractC1998i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getHeader$annotations() {
            }

            @AbstractC1998i(with = EmptyStringToNullSerializer.class)
            public static /* synthetic */ void getIcon$annotations() {
            }

            public static final void write$Self(Images images, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
                AbstractC3557B.c0("self", images);
                AbstractC3557B.c0("output", abstractC2431b);
                AbstractC3557B.c0("serialDesc", serialDescriptor);
                if (abstractC2431b.C(serialDescriptor) || images.header != null) {
                    abstractC2431b.q(serialDescriptor, 0, EmptyStringToNullSerializer.INSTANCE, images.header);
                }
                if (abstractC2431b.C(serialDescriptor) || images.background != null) {
                    abstractC2431b.q(serialDescriptor, 1, EmptyStringToNullSerializer.INSTANCE, images.background);
                }
                if (abstractC2431b.C(serialDescriptor) || images.icon != null) {
                    abstractC2431b.q(serialDescriptor, 2, EmptyStringToNullSerializer.INSTANCE, images.icon);
                }
            }

            public final String component1() {
                return this.header;
            }

            public final String component2() {
                return this.background;
            }

            public final String component3() {
                return this.icon;
            }

            public final Images copy(String str, String str2, String str3) {
                return new Images(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Images)) {
                    return false;
                }
                Images images = (Images) obj;
                return AbstractC3557B.K(this.header, images.header) && AbstractC3557B.K(this.background, images.background) && AbstractC3557B.K(this.icon, images.icon);
            }

            public final List<String> getAll$purchases_customEntitlementComputationRelease() {
                return q.h3(new String[]{this.header, this.background, this.icon});
            }

            public final String getBackground() {
                return this.background;
            }

            public final String getHeader() {
                return this.header;
            }

            public final String getIcon() {
                return this.icon;
            }

            public int hashCode() {
                String str = this.header;
                int i10 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.background;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.icon;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Images(header=");
                sb2.append(this.header);
                sb2.append(", background=");
                sb2.append(this.background);
                sb2.append(", icon=");
                return a.n(sb2, this.icon, ')');
            }

            public /* synthetic */ Images(int i10, @AbstractC1998i(with = EmptyStringToNullSerializer.class) String str, @AbstractC1998i(with = EmptyStringToNullSerializer.class) String str2, @AbstractC1998i(with = EmptyStringToNullSerializer.class) String str3, q0 q0Var) {
                if ((i10 & 1) == 0) {
                    this.header = null;
                } else {
                    this.header = str;
                }
                if ((i10 & 2) == 0) {
                    this.background = null;
                } else {
                    this.background = str2;
                }
                if ((i10 & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = str3;
                }
            }

            public Images(String str, String str2, String str3) {
                this.header = str;
                this.background = str2;
                this.icon = str3;
            }

            public /* synthetic */ Images(String str, String str2, String str3, int i10, g gVar) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
            }
        }

        public /* synthetic */ Configuration(int i10, List list, String str, Images images, Images images2, boolean z10, boolean z11, @AbstractC1998i(with = OptionalURLSerializer.class) URL url, @AbstractC1998i(with = OptionalURLSerializer.class) URL url2, ColorInformation colorInformation, q0 q0Var) {
            if (257 != (i10 & 257)) {
                b.e2(i10, 257, PaywallData$Configuration$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.packageIds = list;
            if ((i10 & 2) == 0) {
                this.defaultPackage = null;
            } else {
                this.defaultPackage = str;
            }
            if ((i10 & 4) == 0) {
                this.imagesWebp = null;
            } else {
                this.imagesWebp = images;
            }
            if ((i10 & 8) == 0) {
                this.legacyImages = null;
            } else {
                this.legacyImages = images2;
            }
            if ((i10 & 16) == 0) {
                this.blurredBackgroundImage = false;
            } else {
                this.blurredBackgroundImage = z10;
            }
            if ((i10 & 32) == 0) {
                this.displayRestorePurchases = true;
            } else {
                this.displayRestorePurchases = z11;
            }
            if ((i10 & 64) == 0) {
                this.termsOfServiceURL = null;
            } else {
                this.termsOfServiceURL = url;
            }
            if ((i10 & 128) == 0) {
                this.privacyURL = null;
            } else {
                this.privacyURL = url2;
            }
            this.colors = colorInformation;
        }

        public static /* synthetic */ void getBlurredBackgroundImage$annotations() {
        }

        public static /* synthetic */ void getDefaultPackage$annotations() {
        }

        public static /* synthetic */ void getDisplayRestorePurchases$annotations() {
        }

        public static /* synthetic */ void getImagesWebp$purchases_customEntitlementComputationRelease$annotations() {
        }

        public static /* synthetic */ void getLegacyImages$purchases_customEntitlementComputationRelease$annotations() {
        }

        public static /* synthetic */ void getPackageIds$annotations() {
        }

        @AbstractC1998i(with = OptionalURLSerializer.class)
        public static /* synthetic */ void getPrivacyURL$annotations() {
        }

        @AbstractC1998i(with = OptionalURLSerializer.class)
        public static /* synthetic */ void getTermsOfServiceURL$annotations() {
        }

        public static final void write$Self(Configuration configuration, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
            AbstractC3557B.c0("self", configuration);
            AbstractC3557B.c0("output", abstractC2431b);
            AbstractC3557B.c0("serialDesc", serialDescriptor);
            u0 u0Var = u0.f28491a;
            abstractC2431b.i(serialDescriptor, 0, new C2695d(u0Var, 0), configuration.packageIds);
            if (abstractC2431b.C(serialDescriptor) || configuration.defaultPackage != null) {
                abstractC2431b.q(serialDescriptor, 1, u0Var, configuration.defaultPackage);
            }
            if (abstractC2431b.C(serialDescriptor) || configuration.imagesWebp != null) {
                abstractC2431b.q(serialDescriptor, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, configuration.imagesWebp);
            }
            if (abstractC2431b.C(serialDescriptor) || configuration.legacyImages != null) {
                abstractC2431b.q(serialDescriptor, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, configuration.legacyImages);
            }
            if (abstractC2431b.C(serialDescriptor) || configuration.blurredBackgroundImage) {
                abstractC2431b.p(serialDescriptor, 4, configuration.blurredBackgroundImage);
            }
            if (abstractC2431b.C(serialDescriptor) || !configuration.displayRestorePurchases) {
                abstractC2431b.p(serialDescriptor, 5, configuration.displayRestorePurchases);
            }
            if (abstractC2431b.C(serialDescriptor) || configuration.termsOfServiceURL != null) {
                abstractC2431b.q(serialDescriptor, 6, OptionalURLSerializer.INSTANCE, configuration.termsOfServiceURL);
            }
            if (abstractC2431b.C(serialDescriptor) || configuration.privacyURL != null) {
                abstractC2431b.q(serialDescriptor, 7, OptionalURLSerializer.INSTANCE, configuration.privacyURL);
            }
            abstractC2431b.i(serialDescriptor, 8, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, configuration.colors);
        }

        public final List<String> component1() {
            return this.packageIds;
        }

        public final String component2() {
            return this.defaultPackage;
        }

        public final Images component3$purchases_customEntitlementComputationRelease() {
            return this.imagesWebp;
        }

        public final Images component4$purchases_customEntitlementComputationRelease() {
            return this.legacyImages;
        }

        public final boolean component5() {
            return this.blurredBackgroundImage;
        }

        public final boolean component6() {
            return this.displayRestorePurchases;
        }

        public final URL component7() {
            return this.termsOfServiceURL;
        }

        public final URL component8() {
            return this.privacyURL;
        }

        public final ColorInformation component9() {
            return this.colors;
        }

        public final Configuration copy(List<String> list, String str, Images images, Images images2, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation) {
            AbstractC3557B.c0("packageIds", list);
            AbstractC3557B.c0("colors", colorInformation);
            return new Configuration(list, str, images, images2, z10, z11, url, url2, colorInformation);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return AbstractC3557B.K(this.packageIds, configuration.packageIds) && AbstractC3557B.K(this.defaultPackage, configuration.defaultPackage) && AbstractC3557B.K(this.imagesWebp, configuration.imagesWebp) && AbstractC3557B.K(this.legacyImages, configuration.legacyImages) && this.blurredBackgroundImage == configuration.blurredBackgroundImage && this.displayRestorePurchases == configuration.displayRestorePurchases && AbstractC3557B.K(this.termsOfServiceURL, configuration.termsOfServiceURL) && AbstractC3557B.K(this.privacyURL, configuration.privacyURL) && AbstractC3557B.K(this.colors, configuration.colors);
        }

        public final boolean getBlurredBackgroundImage() {
            return this.blurredBackgroundImage;
        }

        public final ColorInformation getColors() {
            return this.colors;
        }

        public final String getDefaultPackage() {
            return this.defaultPackage;
        }

        public final boolean getDisplayRestorePurchases() {
            return this.displayRestorePurchases;
        }

        public final Images getImages() {
            String str;
            String str2;
            String icon;
            Images images = this.imagesWebp;
            String str3 = null;
            if (images == null || (str = images.getHeader()) == null) {
                Images images2 = this.legacyImages;
                if (images2 != null) {
                    str = images2.getHeader();
                } else {
                    str = null;
                }
            }
            Images images3 = this.imagesWebp;
            if (images3 == null || (str2 = images3.getBackground()) == null) {
                Images images4 = this.legacyImages;
                if (images4 != null) {
                    str2 = images4.getBackground();
                } else {
                    str2 = null;
                }
            }
            Images images5 = this.imagesWebp;
            if (images5 != null && (icon = images5.getIcon()) != null) {
                str3 = icon;
            } else {
                Images images6 = this.legacyImages;
                if (images6 != null) {
                    str3 = images6.getIcon();
                }
            }
            return new Images(str, str2, str3);
        }

        public final Images getImagesWebp$purchases_customEntitlementComputationRelease() {
            return this.imagesWebp;
        }

        public final Images getLegacyImages$purchases_customEntitlementComputationRelease() {
            return this.legacyImages;
        }

        public final List<String> getPackageIds() {
            return this.packageIds;
        }

        public final URL getPrivacyURL() {
            return this.privacyURL;
        }

        public final URL getTermsOfServiceURL() {
            return this.termsOfServiceURL;
        }

        public int hashCode() {
            int hashCode = this.packageIds.hashCode() * 31;
            String str = this.defaultPackage;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Images images = this.imagesWebp;
            int hashCode3 = (hashCode2 + (images == null ? 0 : images.hashCode())) * 31;
            Images images2 = this.legacyImages;
            int hashCode4 = (hashCode3 + (images2 == null ? 0 : images2.hashCode())) * 31;
            boolean z10 = this.blurredBackgroundImage;
            int i11 = 1;
            if (z10) {
                z10 = true;
            }
            int i12 = z10 ? 1 : 0;
            int i13 = z10 ? 1 : 0;
            int i14 = (hashCode4 + i12) * 31;
            boolean z11 = this.displayRestorePurchases;
            if (!z11) {
                i11 = z11 ? 1 : 0;
            }
            int i15 = (i14 + i11) * 31;
            URL url = this.termsOfServiceURL;
            int hashCode5 = (i15 + (url == null ? 0 : url.hashCode())) * 31;
            URL url2 = this.privacyURL;
            if (url2 != null) {
                i10 = url2.hashCode();
            }
            return this.colors.hashCode() + ((hashCode5 + i10) * 31);
        }

        public String toString() {
            return "Configuration(packageIds=" + this.packageIds + ", defaultPackage=" + this.defaultPackage + ", imagesWebp=" + this.imagesWebp + ", legacyImages=" + this.legacyImages + ", blurredBackgroundImage=" + this.blurredBackgroundImage + ", displayRestorePurchases=" + this.displayRestorePurchases + ", termsOfServiceURL=" + this.termsOfServiceURL + ", privacyURL=" + this.privacyURL + ", colors=" + this.colors + ')';
        }

        @AbstractC1998i
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u001f\u0010 B/\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0015\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\b\u001f\u0010$J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\fJ&\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001e\u0010\f\u00a8\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "component1", "()Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "component2", "light", "dark", "copy", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "getLight", "getDark", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Ldh/q0;)V", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes2.dex */
        public static final class ColorInformation {
            public static final Companion Companion = new Companion(null);
            private final Colors dark;
            private final Colors light;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$ColorInformation;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
            /* loaded from: classes2.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(g gVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return PaywallData$Configuration$ColorInformation$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ ColorInformation(int i10, Colors colors, Colors colors2, q0 q0Var) {
                if (1 != (i10 & 1)) {
                    b.e2(i10, 1, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.light = colors;
                if ((i10 & 2) == 0) {
                    this.dark = null;
                } else {
                    this.dark = colors2;
                }
            }

            public static /* synthetic */ ColorInformation copy$default(ColorInformation colorInformation, Colors colors, Colors colors2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    colors = colorInformation.light;
                }
                if ((i10 & 2) != 0) {
                    colors2 = colorInformation.dark;
                }
                return colorInformation.copy(colors, colors2);
            }

            public static final void write$Self(ColorInformation colorInformation, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
                AbstractC3557B.c0("self", colorInformation);
                AbstractC3557B.c0("output", abstractC2431b);
                AbstractC3557B.c0("serialDesc", serialDescriptor);
                PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
                abstractC2431b.i(serialDescriptor, 0, paywallData$Configuration$Colors$$serializer, colorInformation.light);
                if (abstractC2431b.C(serialDescriptor) || colorInformation.dark != null) {
                    abstractC2431b.q(serialDescriptor, 1, paywallData$Configuration$Colors$$serializer, colorInformation.dark);
                }
            }

            public final Colors component1() {
                return this.light;
            }

            public final Colors component2() {
                return this.dark;
            }

            public final ColorInformation copy(Colors colors, Colors colors2) {
                AbstractC3557B.c0("light", colors);
                return new ColorInformation(colors, colors2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) obj;
                return AbstractC3557B.K(this.light, colorInformation.light) && AbstractC3557B.K(this.dark, colorInformation.dark);
            }

            public final Colors getDark() {
                return this.dark;
            }

            public final Colors getLight() {
                return this.light;
            }

            public int hashCode() {
                int hashCode = this.light.hashCode() * 31;
                Colors colors = this.dark;
                return hashCode + (colors == null ? 0 : colors.hashCode());
            }

            public String toString() {
                return "ColorInformation(light=" + this.light + ", dark=" + this.dark + ')';
            }

            public ColorInformation(Colors colors, Colors colors2) {
                AbstractC3557B.c0("light", colors);
                this.light = colors;
                this.dark = colors2;
            }

            public /* synthetic */ ColorInformation(Colors colors, Colors colors2, int i10, g gVar) {
                this(colors, (i10 & 2) != 0 ? null : colors2);
            }
        }

        @AbstractC1998i
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBo\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\bB\u0010CB\u0093\u0001\b\u0017\u0012\u0006\u0010D\u001a\u00020\u001d\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u00a2\u0006\u0004\bB\u0010GJ\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\u0004J\u0080\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u00d6\u0001\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\"\u0010#J(\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u00c7\u0001\u00a2\u0006\u0004\b*\u0010+R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u000e\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0004R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u000f\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u0004R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0010\u0010,\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\u0004R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0011\u0010,\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\u0004R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0012\u0010,\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010\u0004R \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0013\u0010,\u0012\u0004\b9\u0010/\u001a\u0004\b8\u0010\u0004R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0014\u0010,\u0012\u0004\b;\u0010/\u001a\u0004\b:\u0010\u0004R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0015\u0010,\u0012\u0004\b=\u0010/\u001a\u0004\b<\u0010\u0004R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0016\u0010,\u0012\u0004\b?\u0010/\u001a\u0004\b>\u0010\u0004R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0017\u0010,\u0012\u0004\bA\u0010/\u001a\u0004\b@\u0010\u0004\u00a8\u0006J"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "component1", "()Lcom/revenuecat/purchases/paywalls/PaywallColor;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "background", "text1", "text2", "text3", "callToActionBackground", "callToActionForeground", "callToActionSecondaryBackground", "accent1", "accent2", "accent3", "copy", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "getBackground", "getBackground$annotations", "()V", "getText1", "getText1$annotations", "getText2", "getText2$annotations", "getText3", "getText3$annotations", "getCallToActionBackground", "getCallToActionBackground$annotations", "getCallToActionForeground", "getCallToActionForeground$annotations", "getCallToActionSecondaryBackground", "getCallToActionSecondaryBackground$annotations", "getAccent1", "getAccent1$annotations", "getAccent2", "getAccent2$annotations", "getAccent3", "getAccent3$annotations", "<init>", "(Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Lcom/revenuecat/purchases/paywalls/PaywallColor;Ldh/q0;)V", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes2.dex */
        public static final class Colors {
            public static final Companion Companion = new Companion(null);
            private final PaywallColor accent1;
            private final PaywallColor accent2;
            private final PaywallColor accent3;
            private final PaywallColor background;
            private final PaywallColor callToActionBackground;
            private final PaywallColor callToActionForeground;
            private final PaywallColor callToActionSecondaryBackground;
            private final PaywallColor text1;
            private final PaywallColor text2;
            private final PaywallColor text3;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
            /* loaded from: classes2.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(g gVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return PaywallData$Configuration$Colors$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Colors(int i10, @AbstractC1998i(with = PaywallColor.Serializer.class) PaywallColor paywallColor, @AbstractC1998i(with = PaywallColor.Serializer.class) PaywallColor paywallColor2, @AbstractC1998i(with = PaywallColor.Serializer.class) PaywallColor paywallColor3, @AbstractC1998i(with = PaywallColor.Serializer.class) PaywallColor paywallColor4, @AbstractC1998i(with = PaywallColor.Serializer.class) PaywallColor paywallColor5, @AbstractC1998i(with = PaywallColor.Serializer.class) PaywallColor paywallColor6, @AbstractC1998i(with = PaywallColor.Serializer.class) PaywallColor paywallColor7, @AbstractC1998i(with = PaywallColor.Serializer.class) PaywallColor paywallColor8, @AbstractC1998i(with = PaywallColor.Serializer.class) PaywallColor paywallColor9, @AbstractC1998i(with = PaywallColor.Serializer.class) PaywallColor paywallColor10, q0 q0Var) {
                if (51 != (i10 & 51)) {
                    b.e2(i10, 51, PaywallData$Configuration$Colors$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.background = paywallColor;
                this.text1 = paywallColor2;
                if ((i10 & 4) == 0) {
                    this.text2 = null;
                } else {
                    this.text2 = paywallColor3;
                }
                if ((i10 & 8) == 0) {
                    this.text3 = null;
                } else {
                    this.text3 = paywallColor4;
                }
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                if ((i10 & 64) == 0) {
                    this.callToActionSecondaryBackground = null;
                } else {
                    this.callToActionSecondaryBackground = paywallColor7;
                }
                if ((i10 & 128) == 0) {
                    this.accent1 = null;
                } else {
                    this.accent1 = paywallColor8;
                }
                if ((i10 & 256) == 0) {
                    this.accent2 = null;
                } else {
                    this.accent2 = paywallColor9;
                }
                if ((i10 & 512) == 0) {
                    this.accent3 = null;
                } else {
                    this.accent3 = paywallColor10;
                }
            }

            @AbstractC1998i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent1$annotations() {
            }

            @AbstractC1998i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent2$annotations() {
            }

            @AbstractC1998i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getAccent3$annotations() {
            }

            @AbstractC1998i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getBackground$annotations() {
            }

            @AbstractC1998i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionBackground$annotations() {
            }

            @AbstractC1998i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionForeground$annotations() {
            }

            @AbstractC1998i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getCallToActionSecondaryBackground$annotations() {
            }

            @AbstractC1998i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText1$annotations() {
            }

            @AbstractC1998i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText2$annotations() {
            }

            @AbstractC1998i(with = PaywallColor.Serializer.class)
            public static /* synthetic */ void getText3$annotations() {
            }

            public static final void write$Self(Colors colors, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
                AbstractC3557B.c0("self", colors);
                AbstractC3557B.c0("output", abstractC2431b);
                AbstractC3557B.c0("serialDesc", serialDescriptor);
                PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
                abstractC2431b.i(serialDescriptor, 0, serializer, colors.background);
                abstractC2431b.i(serialDescriptor, 1, serializer, colors.text1);
                if (abstractC2431b.C(serialDescriptor) || colors.text2 != null) {
                    abstractC2431b.q(serialDescriptor, 2, serializer, colors.text2);
                }
                if (abstractC2431b.C(serialDescriptor) || colors.text3 != null) {
                    abstractC2431b.q(serialDescriptor, 3, serializer, colors.text3);
                }
                abstractC2431b.i(serialDescriptor, 4, serializer, colors.callToActionBackground);
                abstractC2431b.i(serialDescriptor, 5, serializer, colors.callToActionForeground);
                if (abstractC2431b.C(serialDescriptor) || colors.callToActionSecondaryBackground != null) {
                    abstractC2431b.q(serialDescriptor, 6, serializer, colors.callToActionSecondaryBackground);
                }
                if (abstractC2431b.C(serialDescriptor) || colors.accent1 != null) {
                    abstractC2431b.q(serialDescriptor, 7, serializer, colors.accent1);
                }
                if (abstractC2431b.C(serialDescriptor) || colors.accent2 != null) {
                    abstractC2431b.q(serialDescriptor, 8, serializer, colors.accent2);
                }
                if (abstractC2431b.C(serialDescriptor) || colors.accent3 != null) {
                    abstractC2431b.q(serialDescriptor, 9, serializer, colors.accent3);
                }
            }

            public final PaywallColor component1() {
                return this.background;
            }

            public final PaywallColor component10() {
                return this.accent3;
            }

            public final PaywallColor component2() {
                return this.text1;
            }

            public final PaywallColor component3() {
                return this.text2;
            }

            public final PaywallColor component4() {
                return this.text3;
            }

            public final PaywallColor component5() {
                return this.callToActionBackground;
            }

            public final PaywallColor component6() {
                return this.callToActionForeground;
            }

            public final PaywallColor component7() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor component8() {
                return this.accent1;
            }

            public final PaywallColor component9() {
                return this.accent2;
            }

            public final Colors copy(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10) {
                AbstractC3557B.c0("background", paywallColor);
                AbstractC3557B.c0("text1", paywallColor2);
                AbstractC3557B.c0("callToActionBackground", paywallColor5);
                AbstractC3557B.c0("callToActionForeground", paywallColor6);
                return new Colors(paywallColor, paywallColor2, paywallColor3, paywallColor4, paywallColor5, paywallColor6, paywallColor7, paywallColor8, paywallColor9, paywallColor10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Colors)) {
                    return false;
                }
                Colors colors = (Colors) obj;
                return AbstractC3557B.K(this.background, colors.background) && AbstractC3557B.K(this.text1, colors.text1) && AbstractC3557B.K(this.text2, colors.text2) && AbstractC3557B.K(this.text3, colors.text3) && AbstractC3557B.K(this.callToActionBackground, colors.callToActionBackground) && AbstractC3557B.K(this.callToActionForeground, colors.callToActionForeground) && AbstractC3557B.K(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && AbstractC3557B.K(this.accent1, colors.accent1) && AbstractC3557B.K(this.accent2, colors.accent2) && AbstractC3557B.K(this.accent3, colors.accent3);
            }

            public final PaywallColor getAccent1() {
                return this.accent1;
            }

            public final PaywallColor getAccent2() {
                return this.accent2;
            }

            public final PaywallColor getAccent3() {
                return this.accent3;
            }

            public final PaywallColor getBackground() {
                return this.background;
            }

            public final PaywallColor getCallToActionBackground() {
                return this.callToActionBackground;
            }

            public final PaywallColor getCallToActionForeground() {
                return this.callToActionForeground;
            }

            public final PaywallColor getCallToActionSecondaryBackground() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor getText1() {
                return this.text1;
            }

            public final PaywallColor getText2() {
                return this.text2;
            }

            public final PaywallColor getText3() {
                return this.text3;
            }

            public int hashCode() {
                int hashCode = (this.text1.hashCode() + (this.background.hashCode() * 31)) * 31;
                PaywallColor paywallColor = this.text2;
                int i10 = 0;
                int hashCode2 = (hashCode + (paywallColor == null ? 0 : paywallColor.hashCode())) * 31;
                PaywallColor paywallColor2 = this.text3;
                int hashCode3 = paywallColor2 == null ? 0 : paywallColor2.hashCode();
                int hashCode4 = (this.callToActionForeground.hashCode() + ((this.callToActionBackground.hashCode() + ((hashCode2 + hashCode3) * 31)) * 31)) * 31;
                PaywallColor paywallColor3 = this.callToActionSecondaryBackground;
                int hashCode5 = (hashCode4 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.accent1;
                int hashCode6 = (hashCode5 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.accent2;
                int hashCode7 = (hashCode6 + (paywallColor5 == null ? 0 : paywallColor5.hashCode())) * 31;
                PaywallColor paywallColor6 = this.accent3;
                if (paywallColor6 != null) {
                    i10 = paywallColor6.hashCode();
                }
                return hashCode7 + i10;
            }

            public String toString() {
                return "Colors(background=" + this.background + ", text1=" + this.text1 + ", text2=" + this.text2 + ", text3=" + this.text3 + ", callToActionBackground=" + this.callToActionBackground + ", callToActionForeground=" + this.callToActionForeground + ", callToActionSecondaryBackground=" + this.callToActionSecondaryBackground + ", accent1=" + this.accent1 + ", accent2=" + this.accent2 + ", accent3=" + this.accent3 + ')';
            }

            public Colors(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10) {
                AbstractC3557B.c0("background", paywallColor);
                AbstractC3557B.c0("text1", paywallColor2);
                AbstractC3557B.c0("callToActionBackground", paywallColor5);
                AbstractC3557B.c0("callToActionForeground", paywallColor6);
                this.background = paywallColor;
                this.text1 = paywallColor2;
                this.text2 = paywallColor3;
                this.text3 = paywallColor4;
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                this.callToActionSecondaryBackground = paywallColor7;
                this.accent1 = paywallColor8;
                this.accent2 = paywallColor9;
                this.accent3 = paywallColor10;
            }

            public /* synthetic */ Colors(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, int i10, g gVar) {
                this(paywallColor, paywallColor2, (i10 & 4) != 0 ? null : paywallColor3, (i10 & 8) != 0 ? null : paywallColor4, paywallColor5, paywallColor6, (i10 & 64) != 0 ? null : paywallColor7, (i10 & 128) != 0 ? null : paywallColor8, (i10 & 256) != 0 ? null : paywallColor9, (i10 & 512) != 0 ? null : paywallColor10);
            }
        }

        public Configuration(List<String> list, String str, Images images, Images images2, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation) {
            AbstractC3557B.c0("packageIds", list);
            AbstractC3557B.c0("colors", colorInformation);
            this.packageIds = list;
            this.defaultPackage = str;
            this.imagesWebp = images;
            this.legacyImages = images2;
            this.blurredBackgroundImage = z10;
            this.displayRestorePurchases = z11;
            this.termsOfServiceURL = url;
            this.privacyURL = url2;
            this.colors = colorInformation;
        }

        public /* synthetic */ Configuration(List list, String str, Images images, Images images2, boolean z10, boolean z11, URL url, URL url2, ColorInformation colorInformation, int i10, g gVar) {
            this(list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : images, (i10 & 8) != 0 ? null : images2, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? true : z11, (i10 & 64) != 0 ? null : url, (i10 & 128) != 0 ? null : url2, colorInformation);
        }

        public /* synthetic */ Configuration(List list, String str, Images images, ColorInformation colorInformation, boolean z10, boolean z11, URL url, URL url2, int i10, g gVar) {
            this(list, (i10 & 2) != 0 ? null : str, images, colorInformation, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? true : z11, (i10 & 64) != 0 ? null : url, (i10 & 128) != 0 ? null : url2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(List<String> list, String str, Images images, ColorInformation colorInformation, boolean z10, boolean z11, URL url, URL url2) {
            this(list, str, images, (Images) null, z10, z11, url, url2, colorInformation, 8, (g) null);
            AbstractC3557B.c0("packageIds", list);
            AbstractC3557B.c0("images", images);
            AbstractC3557B.c0("colors", colorInformation);
        }
    }

    @AbstractC1998i
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0003IHJB{\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0004\bB\u0010CB\u0095\u0001\b\u0017\u0012\u0006\u0010D\u001a\u00020\u001e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010F\u001a\u0004\u0018\u00010E\u00a2\u0006\u0004\bB\u0010GJ\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\u0004J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0088\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u001d\u0010\u0004J\u0010\u0010\u001f\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b#\u0010$J(\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u00c7\u0001\u00a2\u0006\u0004\b+\u0010,R\u0017\u0010\u0011\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010\u0004R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0012\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0004R \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0013\u0010-\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u0004R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0014\u0010-\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u0004R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0015\u0010-\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\u0004R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0016\u0010-\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010\u0004R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0017\u0010-\u0012\u0004\b;\u00101\u001a\u0004\b:\u0010\u0004R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0018\u0010-\u0012\u0004\b=\u00101\u001a\u0004\b<\u0010\u0004R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0019\u0010-\u0012\u0004\b?\u00101\u001a\u0004\b>\u0010\u0004R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006\u00a2\u0006\f\n\u0004\b\u001a\u0010@\u001a\u0004\bA\u0010\u0010\u00a8\u0006K"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "component10", "()Ljava/util/List;", "title", "subtitle", "callToAction", "callToActionWithIntroOffer", "callToActionWithMultipleIntroOffers", "offerDetails", "offerDetailsWithIntroOffer", "offerDetailsWithMultipleIntroOffers", "offerName", "features", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getSubtitle$annotations", "()V", "getCallToAction", "getCallToAction$annotations", "getCallToActionWithIntroOffer", "getCallToActionWithIntroOffer$annotations", "getCallToActionWithMultipleIntroOffers", "getCallToActionWithMultipleIntroOffers$annotations", "getOfferDetails", "getOfferDetails$annotations", "getOfferDetailsWithIntroOffer", "getOfferDetailsWithIntroOffer$annotations", "getOfferDetailsWithMultipleIntroOffers", "getOfferDetailsWithMultipleIntroOffers$annotations", "getOfferName", "getOfferName$annotations", "Ljava/util/List;", "getFeatures", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ldh/q0;)V", "Companion", "$serializer", "Feature", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class LocalizedConfiguration {
        public static final Companion Companion = new Companion(null);
        private final String callToAction;
        private final String callToActionWithIntroOffer;
        private final String callToActionWithMultipleIntroOffers;
        private final List<Feature> features;
        private final String offerDetails;
        private final String offerDetailsWithIntroOffer;
        private final String offerDetailsWithMultipleIntroOffers;
        private final String offerName;
        private final String subtitle;
        private final String title;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final KSerializer serializer() {
                return PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ LocalizedConfiguration(int i10, String str, @AbstractC1998i(with = EmptyStringToNullSerializer.class) String str2, String str3, @AbstractC1998i(with = EmptyStringToNullSerializer.class) String str4, @AbstractC1998i(with = EmptyStringToNullSerializer.class) String str5, @AbstractC1998i(with = EmptyStringToNullSerializer.class) String str6, @AbstractC1998i(with = EmptyStringToNullSerializer.class) String str7, @AbstractC1998i(with = EmptyStringToNullSerializer.class) String str8, @AbstractC1998i(with = EmptyStringToNullSerializer.class) String str9, List list, q0 q0Var) {
            if (5 != (i10 & 5)) {
                b.e2(i10, 5, PaywallData$LocalizedConfiguration$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.title = str;
            if ((i10 & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.callToAction = str3;
            if ((i10 & 8) == 0) {
                this.callToActionWithIntroOffer = null;
            } else {
                this.callToActionWithIntroOffer = str4;
            }
            if ((i10 & 16) == 0) {
                this.callToActionWithMultipleIntroOffers = null;
            } else {
                this.callToActionWithMultipleIntroOffers = str5;
            }
            if ((i10 & 32) == 0) {
                this.offerDetails = null;
            } else {
                this.offerDetails = str6;
            }
            if ((i10 & 64) == 0) {
                this.offerDetailsWithIntroOffer = null;
            } else {
                this.offerDetailsWithIntroOffer = str7;
            }
            if ((i10 & 128) == 0) {
                this.offerDetailsWithMultipleIntroOffers = null;
            } else {
                this.offerDetailsWithMultipleIntroOffers = str8;
            }
            if ((i10 & 256) == 0) {
                this.offerName = null;
            } else {
                this.offerName = str9;
            }
            if ((i10 & 512) == 0) {
                this.features = v.f37483Y;
            } else {
                this.features = list;
            }
        }

        public static /* synthetic */ void getCallToAction$annotations() {
        }

        @AbstractC1998i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithIntroOffer$annotations() {
        }

        @AbstractC1998i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getCallToActionWithMultipleIntroOffers$annotations() {
        }

        @AbstractC1998i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetails$annotations() {
        }

        @AbstractC1998i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
        }

        @AbstractC1998i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
        }

        @AbstractC1998i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getOfferName$annotations() {
        }

        @AbstractC1998i(with = EmptyStringToNullSerializer.class)
        public static /* synthetic */ void getSubtitle$annotations() {
        }

        public static final void write$Self(LocalizedConfiguration localizedConfiguration, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
            AbstractC3557B.c0("self", localizedConfiguration);
            AbstractC3557B.c0("output", abstractC2431b);
            AbstractC3557B.c0("serialDesc", serialDescriptor);
            abstractC2431b.z(0, localizedConfiguration.title, serialDescriptor);
            if (abstractC2431b.C(serialDescriptor) || localizedConfiguration.subtitle != null) {
                abstractC2431b.q(serialDescriptor, 1, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.subtitle);
            }
            abstractC2431b.z(2, localizedConfiguration.callToAction, serialDescriptor);
            if (abstractC2431b.C(serialDescriptor) || localizedConfiguration.callToActionWithIntroOffer != null) {
                abstractC2431b.q(serialDescriptor, 3, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.callToActionWithIntroOffer);
            }
            if (abstractC2431b.C(serialDescriptor) || localizedConfiguration.callToActionWithMultipleIntroOffers != null) {
                abstractC2431b.q(serialDescriptor, 4, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.callToActionWithMultipleIntroOffers);
            }
            if (abstractC2431b.C(serialDescriptor) || localizedConfiguration.offerDetails != null) {
                abstractC2431b.q(serialDescriptor, 5, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetails);
            }
            if (abstractC2431b.C(serialDescriptor) || localizedConfiguration.offerDetailsWithIntroOffer != null) {
                abstractC2431b.q(serialDescriptor, 6, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetailsWithIntroOffer);
            }
            if (abstractC2431b.C(serialDescriptor) || localizedConfiguration.offerDetailsWithMultipleIntroOffers != null) {
                abstractC2431b.q(serialDescriptor, 7, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetailsWithMultipleIntroOffers);
            }
            if (abstractC2431b.C(serialDescriptor) || localizedConfiguration.offerName != null) {
                abstractC2431b.q(serialDescriptor, 8, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerName);
            }
            if (abstractC2431b.C(serialDescriptor) || !AbstractC3557B.K(localizedConfiguration.features, v.f37483Y)) {
                abstractC2431b.i(serialDescriptor, 9, new C2695d(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE, 0), localizedConfiguration.features);
            }
        }

        public final String component1() {
            return this.title;
        }

        public final List<Feature> component10() {
            return this.features;
        }

        public final String component2() {
            return this.subtitle;
        }

        public final String component3() {
            return this.callToAction;
        }

        public final String component4() {
            return this.callToActionWithIntroOffer;
        }

        public final String component5() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final String component6() {
            return this.offerDetails;
        }

        public final String component7() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String component8() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String component9() {
            return this.offerName;
        }

        public final LocalizedConfiguration copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<Feature> list) {
            AbstractC3557B.c0("title", str);
            AbstractC3557B.c0("callToAction", str3);
            AbstractC3557B.c0("features", list);
            return new LocalizedConfiguration(str, str2, str3, str4, str5, str6, str7, str8, str9, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalizedConfiguration)) {
                return false;
            }
            LocalizedConfiguration localizedConfiguration = (LocalizedConfiguration) obj;
            return AbstractC3557B.K(this.title, localizedConfiguration.title) && AbstractC3557B.K(this.subtitle, localizedConfiguration.subtitle) && AbstractC3557B.K(this.callToAction, localizedConfiguration.callToAction) && AbstractC3557B.K(this.callToActionWithIntroOffer, localizedConfiguration.callToActionWithIntroOffer) && AbstractC3557B.K(this.callToActionWithMultipleIntroOffers, localizedConfiguration.callToActionWithMultipleIntroOffers) && AbstractC3557B.K(this.offerDetails, localizedConfiguration.offerDetails) && AbstractC3557B.K(this.offerDetailsWithIntroOffer, localizedConfiguration.offerDetailsWithIntroOffer) && AbstractC3557B.K(this.offerDetailsWithMultipleIntroOffers, localizedConfiguration.offerDetailsWithMultipleIntroOffers) && AbstractC3557B.K(this.offerName, localizedConfiguration.offerName) && AbstractC3557B.K(this.features, localizedConfiguration.features);
        }

        public final String getCallToAction() {
            return this.callToAction;
        }

        public final String getCallToActionWithIntroOffer() {
            return this.callToActionWithIntroOffer;
        }

        public final String getCallToActionWithMultipleIntroOffers() {
            return this.callToActionWithMultipleIntroOffers;
        }

        public final List<Feature> getFeatures() {
            return this.features;
        }

        public final String getOfferDetails() {
            return this.offerDetails;
        }

        public final String getOfferDetailsWithIntroOffer() {
            return this.offerDetailsWithIntroOffer;
        }

        public final String getOfferDetailsWithMultipleIntroOffers() {
            return this.offerDetailsWithMultipleIntroOffers;
        }

        public final String getOfferName() {
            return this.offerName;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int i16 = 0;
            if (str == null) {
                i10 = 0;
            } else {
                i10 = str.hashCode();
            }
            int v10 = f.v(this.callToAction, (hashCode + i10) * 31, 31);
            String str2 = this.callToActionWithIntroOffer;
            if (str2 == null) {
                i11 = 0;
            } else {
                i11 = str2.hashCode();
            }
            int i17 = (v10 + i11) * 31;
            String str3 = this.callToActionWithMultipleIntroOffers;
            if (str3 == null) {
                i12 = 0;
            } else {
                i12 = str3.hashCode();
            }
            int i18 = (i17 + i12) * 31;
            String str4 = this.offerDetails;
            if (str4 == null) {
                i13 = 0;
            } else {
                i13 = str4.hashCode();
            }
            int i19 = (i18 + i13) * 31;
            String str5 = this.offerDetailsWithIntroOffer;
            if (str5 == null) {
                i14 = 0;
            } else {
                i14 = str5.hashCode();
            }
            int i20 = (i19 + i14) * 31;
            String str6 = this.offerDetailsWithMultipleIntroOffers;
            if (str6 == null) {
                i15 = 0;
            } else {
                i15 = str6.hashCode();
            }
            int i21 = (i20 + i15) * 31;
            String str7 = this.offerName;
            if (str7 != null) {
                i16 = str7.hashCode();
            }
            return this.features.hashCode() + ((i21 + i16) * 31);
        }

        public String toString() {
            return "LocalizedConfiguration(title=" + this.title + ", subtitle=" + this.subtitle + ", callToAction=" + this.callToAction + ", callToActionWithIntroOffer=" + this.callToActionWithIntroOffer + ", callToActionWithMultipleIntroOffers=" + this.callToActionWithMultipleIntroOffers + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerName=" + this.offerName + ", features=" + this.features + ')';
        }

        @AbstractC1998i
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B'\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\"\u0010#B;\b\u0017\u0012\u0006\u0010$\u001a\u00020\u0015\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u00a2\u0006\u0004\b\"\u0010'J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\fJ2\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\"\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\f\u00a8\u0006*"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ljf/y;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "component2", "component3", "title", "content", "iconID", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getContent", "getIconID", "getIconID$annotations", "()V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldh/q0;)V", "Companion", "$serializer", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class Feature {
            public static final Companion Companion = new Companion(null);
            private final String content;
            private final String iconID;
            private final String title;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
            /* loaded from: classes2.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(g gVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Feature(int i10, String str, String str2, String str3, q0 q0Var) {
                if (1 != (i10 & 1)) {
                    b.e2(i10, 1, PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.title = str;
                if ((i10 & 2) == 0) {
                    this.content = null;
                } else {
                    this.content = str2;
                }
                if ((i10 & 4) == 0) {
                    this.iconID = null;
                } else {
                    this.iconID = str3;
                }
            }

            public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = feature.title;
                }
                if ((i10 & 2) != 0) {
                    str2 = feature.content;
                }
                if ((i10 & 4) != 0) {
                    str3 = feature.iconID;
                }
                return feature.copy(str, str2, str3);
            }

            public static /* synthetic */ void getIconID$annotations() {
            }

            public static final void write$Self(Feature feature, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
                AbstractC3557B.c0("self", feature);
                AbstractC3557B.c0("output", abstractC2431b);
                AbstractC3557B.c0("serialDesc", serialDescriptor);
                abstractC2431b.z(0, feature.title, serialDescriptor);
                if (abstractC2431b.C(serialDescriptor) || feature.content != null) {
                    abstractC2431b.q(serialDescriptor, 1, u0.f28491a, feature.content);
                }
                if (abstractC2431b.C(serialDescriptor) || feature.iconID != null) {
                    abstractC2431b.q(serialDescriptor, 2, u0.f28491a, feature.iconID);
                }
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.content;
            }

            public final String component3() {
                return this.iconID;
            }

            public final Feature copy(String str, String str2, String str3) {
                AbstractC3557B.c0("title", str);
                return new Feature(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Feature)) {
                    return false;
                }
                Feature feature = (Feature) obj;
                return AbstractC3557B.K(this.title, feature.title) && AbstractC3557B.K(this.content, feature.content) && AbstractC3557B.K(this.iconID, feature.iconID);
            }

            public final String getContent() {
                return this.content;
            }

            public final String getIconID() {
                return this.iconID;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.content;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.iconID;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("Feature(title=");
                sb2.append(this.title);
                sb2.append(", content=");
                sb2.append(this.content);
                sb2.append(", iconID=");
                return a.n(sb2, this.iconID, ')');
            }

            public Feature(String str, String str2, String str3) {
                AbstractC3557B.c0("title", str);
                this.title = str;
                this.content = str2;
                this.iconID = str3;
            }

            public /* synthetic */ Feature(String str, String str2, String str3, int i10, g gVar) {
                this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
            }
        }

        public LocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<Feature> list) {
            AbstractC3557B.c0("title", str);
            AbstractC3557B.c0("callToAction", str3);
            AbstractC3557B.c0("features", list);
            this.title = str;
            this.subtitle = str2;
            this.callToAction = str3;
            this.callToActionWithIntroOffer = str4;
            this.callToActionWithMultipleIntroOffers = str5;
            this.offerDetails = str6;
            this.offerDetailsWithIntroOffer = str7;
            this.offerDetailsWithMultipleIntroOffers = str8;
            this.offerName = str9;
            this.features = list;
        }

        public /* synthetic */ LocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i10, g gVar) {
            this(str, (i10 & 2) != 0 ? null : str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? v.f37483Y : list);
        }
    }

    public /* synthetic */ PaywallData(int i10, String str, Configuration configuration, @AbstractC1998i(with = URLSerializer.class) URL url, int i11, Map map, q0 q0Var) {
        if (23 != (i10 & 23)) {
            b.e2(i10, 23, PaywallData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.templateName = str;
        this.config = configuration;
        this.assetBaseURL = url;
        if ((i10 & 8) == 0) {
            this.revision = 0;
        } else {
            this.revision = i11;
        }
        this.localization = map;
    }

    public static /* synthetic */ PaywallData copy$default(PaywallData paywallData, String str, Configuration configuration, URL url, int i10, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = paywallData.templateName;
        }
        if ((i11 & 2) != 0) {
            configuration = paywallData.config;
        }
        Configuration configuration2 = configuration;
        if ((i11 & 4) != 0) {
            url = paywallData.assetBaseURL;
        }
        URL url2 = url;
        if ((i11 & 8) != 0) {
            i10 = paywallData.revision;
        }
        int i12 = i10;
        Map<String, LocalizedConfiguration> map2 = map;
        if ((i11 & 16) != 0) {
            map2 = paywallData.localization;
        }
        return paywallData.copy(str, configuration2, url2, i12, map2);
    }

    @AbstractC1998i(with = URLSerializer.class)
    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    private final C3959i getFallbackLocalizedConfiguration() {
        Map.Entry entry = (Map.Entry) t.e2(this.localization.entrySet());
        return new C3959i(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
    }

    public static /* synthetic */ void getLocalization$purchases_customEntitlementComputationRelease$annotations() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    public static final void write$Self(PaywallData paywallData, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("self", paywallData);
        AbstractC3557B.c0("output", abstractC2431b);
        AbstractC3557B.c0("serialDesc", serialDescriptor);
        abstractC2431b.z(0, paywallData.templateName, serialDescriptor);
        abstractC2431b.i(serialDescriptor, 1, PaywallData$Configuration$$serializer.INSTANCE, paywallData.config);
        abstractC2431b.i(serialDescriptor, 2, URLSerializer.INSTANCE, paywallData.assetBaseURL);
        if (abstractC2431b.C(serialDescriptor) || paywallData.revision != 0) {
            abstractC2431b.m(3, paywallData.revision, serialDescriptor);
        }
        abstractC2431b.i(serialDescriptor, 4, new C2682H(u0.f28491a, PaywallData$LocalizedConfiguration$$serializer.INSTANCE, 1), paywallData.localization);
    }

    public final String component1() {
        return this.templateName;
    }

    public final Configuration component2() {
        return this.config;
    }

    public final URL component3() {
        return this.assetBaseURL;
    }

    public final int component4() {
        return this.revision;
    }

    public final Map<String, LocalizedConfiguration> component5$purchases_customEntitlementComputationRelease() {
        return this.localization;
    }

    public final LocalizedConfiguration configForLocale(Locale locale) {
        Object obj;
        AbstractC3557B.c0("requiredLocale", locale);
        LocalizedConfiguration localizedConfiguration = this.localization.get(locale.toString());
        if (localizedConfiguration == null) {
            Iterator<T> it = this.localization.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (LocaleExtensionsKt.sharedLanguageCodeWith(locale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) obj).getKey()))) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null) {
                return null;
            }
            return (LocalizedConfiguration) entry.getValue();
        }
        return localizedConfiguration;
    }

    public final PaywallData copy(String str, Configuration configuration, URL url, int i10, Map<String, LocalizedConfiguration> map) {
        AbstractC3557B.c0("templateName", str);
        AbstractC3557B.c0("config", configuration);
        AbstractC3557B.c0("assetBaseURL", url);
        AbstractC3557B.c0("localization", map);
        return new PaywallData(str, configuration, url, i10, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallData)) {
            return false;
        }
        PaywallData paywallData = (PaywallData) obj;
        return AbstractC3557B.K(this.templateName, paywallData.templateName) && AbstractC3557B.K(this.config, paywallData.config) && AbstractC3557B.K(this.assetBaseURL, paywallData.assetBaseURL) && this.revision == paywallData.revision && AbstractC3557B.K(this.localization, paywallData.localization);
    }

    public final URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final Configuration getConfig() {
        return this.config;
    }

    public final Map<String, LocalizedConfiguration> getLocalization$purchases_customEntitlementComputationRelease() {
        return this.localization;
    }

    public final C3959i getLocalizedConfiguration() {
        return localizedConfiguration(LocaleExtensionsKt.getDefaultLocales());
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        int hashCode = this.config.hashCode();
        int hashCode2 = this.assetBaseURL.hashCode();
        return this.localization.hashCode() + ((((hashCode2 + ((hashCode + (this.templateName.hashCode() * 31)) * 31)) * 31) + this.revision) * 31);
    }

    public final C3959i localizedConfiguration(List<Locale> list) {
        AbstractC3557B.c0("locales", list);
        for (Locale locale : list) {
            Locale convertToCorrectlyFormattedLocale = LocaleExtensionsKt.convertToCorrectlyFormattedLocale(locale);
            LocalizedConfiguration configForLocale = configForLocale(convertToCorrectlyFormattedLocale);
            if (configForLocale != null) {
                return new C3959i(convertToCorrectlyFormattedLocale, configForLocale);
            }
        }
        return getFallbackLocalizedConfiguration();
    }

    public String toString() {
        return "PaywallData(templateName=" + this.templateName + ", config=" + this.config + ", assetBaseURL=" + this.assetBaseURL + ", revision=" + this.revision + ", localization=" + this.localization + ')';
    }

    public PaywallData(String str, Configuration configuration, URL url, int i10, Map<String, LocalizedConfiguration> map) {
        AbstractC3557B.c0("templateName", str);
        AbstractC3557B.c0("config", configuration);
        AbstractC3557B.c0("assetBaseURL", url);
        AbstractC3557B.c0("localization", map);
        this.templateName = str;
        this.config = configuration;
        this.assetBaseURL = url;
        this.revision = i10;
        this.localization = map;
    }

    public /* synthetic */ PaywallData(String str, Configuration configuration, URL url, int i10, Map map, int i11, g gVar) {
        this(str, configuration, url, (i11 & 8) != 0 ? 0 : i10, map);
    }
}
