package com.openai.experiment;

import Df.AbstractC0405d;
import ah.AbstractC1998i;
import ah.C1994e;
import ah.C1996g;
import android.gov.nist.javax.sip.parser.TokenNames;
import ch.AbstractC2431b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import dh.q0;
import id.AbstractC3557B;
import j$.util.Objects;
import java.lang.annotation.Annotation;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import wf.AbstractC6216a;

@AbstractC1998i
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 %*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:6&'()*+,-./01234%56789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZB\u001f\b\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\u00a2\u0006\u0004\b\u001f\u0010 B5\b\u0017\u0012\u0006\u0010!\u001a\u00020\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\b\u001f\u0010$JB\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u00c7\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0006\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0001\u0001[\u00a8\u0006\\"}, d2 = {"Lcom/openai/experiment/ExperimentKey;", "", TokenNames.T, "T0", "self", "Lch/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Ljf/y;", "write$Self", "(Lcom/openai/experiment/ExperimentKey;Lch/b;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", SubscriberAttributeKt.JSON_NAME_KEY, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "LDf/d;", "valueType", "LDf/d;", "getValueType", "()LDf/d;", "<init>", "(Ljava/lang/String;LDf/d;)V", "seen1", "Ldh/q0;", "serializationConstructorMarker", "(ILjava/lang/String;LDf/d;Ldh/q0;)V", "Companion", "AdaV2Enabled", "AlphaModelsEnabled", "AppReviewPrompt", "AssistantMinimizerEnabled", "AtMentionGizmo", "AudioMessageAutoReadEnabled", "AudioMessageEnabled", "BadgeBetaFeaturesEnabled", "BooleanKey", "BreezeEnabled", "BreezeFeedbackEnabled", "BrowserLoginAllowlist", "BrowserLoginWarning", "C2PAEnabled", "ClientActionsEnabled", "ComplianceCheckEnabled", "ConversationTokensEnabled", "ConversationUpsell", "ConversationsAreReportable", "DetailedMessageFeedbackEnabled", "EasterEggDisabled", "EditImageEnabled", "EmployeeInternalRequiredDisabled", "FileUploadEnabled", "GizmoCommandsEnabled", "GizmoReviewsEnabled", "GizmoStoreEnabled", "HapticsDisabled", "HeavyTrafficLogSampling", "LazyLoadMessages", "LocalContextEnabled", "MemoryExperienceEnabled", "MemoryViewEnabled", "OaiAnalyticsEnabled", "QuickTileAssistantGPTEnabled", "ShareButtonEnabled", "ShortcutsEnabled", "StarterPrompts", "StatsigAnalytics", "SubscriptionsEnabled", "SuggestedReplies", "VisionEnabled", "VoiceActionCommandEnabled", "VoiceActionsEnabled", "VoiceAttachmentEnabled", "VoiceHangUpEnabled", "VoiceInterruptibilityEnabled", "VoiceMessageStreamingEnabled", "VoiceTrainingSettingEnabled", "WebSocketOnForegroundEnabled", "WhisperDisabled", "WhisperTextSelectDisabled", "WriteAheadLogging", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "experiment"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class ExperimentKey<T> {
    private final String key;
    private final AbstractC0405d valueType;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] $childSerializers = {null, new C1994e(kotlin.jvm.internal.C.f37623a.b(AbstractC0405d.class), new Annotation[0])};
    private static final AbstractC3957g $cachedSerializer$delegate = R4.b.C1(EnumC3958h.f36152Y, Companion.AnonymousClass1.INSTANCE);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$AdaV2Enabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class AdaV2Enabled extends BooleanKey {
        public static final AdaV2Enabled INSTANCE = new AdaV2Enabled();

        private AdaV2Enabled() {
            super("android_ada_v2", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$AlphaModelsEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class AlphaModelsEnabled extends BooleanKey {
        public static final AlphaModelsEnabled INSTANCE = new AlphaModelsEnabled();

        private AlphaModelsEnabled() {
            super("android_alpha_models_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$AppReviewPrompt;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class AppReviewPrompt extends BooleanKey {
        public static final AppReviewPrompt INSTANCE = new AppReviewPrompt();

        private AppReviewPrompt() {
            super("android_app_review_prompt", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$AssistantMinimizerEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class AssistantMinimizerEnabled extends BooleanKey {
        public static final AssistantMinimizerEnabled INSTANCE = new AssistantMinimizerEnabled();

        private AssistantMinimizerEnabled() {
            super("android_assistant_minimizer_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$AtMentionGizmo;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class AtMentionGizmo extends BooleanKey {
        public static final AtMentionGizmo INSTANCE = new AtMentionGizmo();

        private AtMentionGizmo() {
            super("android_at_mention_gizmo", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$AudioMessageAutoReadEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class AudioMessageAutoReadEnabled extends BooleanKey {
        public static final AudioMessageAutoReadEnabled INSTANCE = new AudioMessageAutoReadEnabled();

        private AudioMessageAutoReadEnabled() {
            super("android_audio_message_auto_read_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$AudioMessageEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class AudioMessageEnabled extends BooleanKey {
        public static final AudioMessageEnabled INSTANCE = new AudioMessageEnabled();

        private AudioMessageEnabled() {
            super("android_audio_message_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$BadgeBetaFeaturesEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class BadgeBetaFeaturesEnabled extends BooleanKey {
        public static final BadgeBetaFeaturesEnabled INSTANCE = new BadgeBetaFeaturesEnabled();

        private BadgeBetaFeaturesEnabled() {
            super("android_badge_beta_features_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u0082\u00014\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789\u00a8\u0006:"}, d2 = {"Lcom/openai/experiment/ExperimentKey$BooleanKey;", "Lcom/openai/experiment/ExperimentKey;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "(Ljava/lang/String;)V", "Lcom/openai/experiment/ExperimentKey$AdaV2Enabled;", "Lcom/openai/experiment/ExperimentKey$AlphaModelsEnabled;", "Lcom/openai/experiment/ExperimentKey$AppReviewPrompt;", "Lcom/openai/experiment/ExperimentKey$AssistantMinimizerEnabled;", "Lcom/openai/experiment/ExperimentKey$AtMentionGizmo;", "Lcom/openai/experiment/ExperimentKey$AudioMessageAutoReadEnabled;", "Lcom/openai/experiment/ExperimentKey$AudioMessageEnabled;", "Lcom/openai/experiment/ExperimentKey$BadgeBetaFeaturesEnabled;", "Lcom/openai/experiment/ExperimentKey$BreezeEnabled;", "Lcom/openai/experiment/ExperimentKey$BreezeFeedbackEnabled;", "Lcom/openai/experiment/ExperimentKey$BrowserLoginAllowlist;", "Lcom/openai/experiment/ExperimentKey$BrowserLoginWarning;", "Lcom/openai/experiment/ExperimentKey$C2PAEnabled;", "Lcom/openai/experiment/ExperimentKey$ClientActionsEnabled;", "Lcom/openai/experiment/ExperimentKey$ComplianceCheckEnabled;", "Lcom/openai/experiment/ExperimentKey$ConversationTokensEnabled;", "Lcom/openai/experiment/ExperimentKey$ConversationUpsell;", "Lcom/openai/experiment/ExperimentKey$ConversationsAreReportable;", "Lcom/openai/experiment/ExperimentKey$DetailedMessageFeedbackEnabled;", "Lcom/openai/experiment/ExperimentKey$EasterEggDisabled;", "Lcom/openai/experiment/ExperimentKey$EditImageEnabled;", "Lcom/openai/experiment/ExperimentKey$EmployeeInternalRequiredDisabled;", "Lcom/openai/experiment/ExperimentKey$FileUploadEnabled;", "Lcom/openai/experiment/ExperimentKey$GizmoCommandsEnabled;", "Lcom/openai/experiment/ExperimentKey$GizmoReviewsEnabled;", "Lcom/openai/experiment/ExperimentKey$GizmoStoreEnabled;", "Lcom/openai/experiment/ExperimentKey$HapticsDisabled;", "Lcom/openai/experiment/ExperimentKey$HeavyTrafficLogSampling;", "Lcom/openai/experiment/ExperimentKey$LazyLoadMessages;", "Lcom/openai/experiment/ExperimentKey$LocalContextEnabled;", "Lcom/openai/experiment/ExperimentKey$MemoryExperienceEnabled;", "Lcom/openai/experiment/ExperimentKey$MemoryViewEnabled;", "Lcom/openai/experiment/ExperimentKey$OaiAnalyticsEnabled;", "Lcom/openai/experiment/ExperimentKey$QuickTileAssistantGPTEnabled;", "Lcom/openai/experiment/ExperimentKey$ShareButtonEnabled;", "Lcom/openai/experiment/ExperimentKey$ShortcutsEnabled;", "Lcom/openai/experiment/ExperimentKey$StarterPrompts;", "Lcom/openai/experiment/ExperimentKey$StatsigAnalytics;", "Lcom/openai/experiment/ExperimentKey$SubscriptionsEnabled;", "Lcom/openai/experiment/ExperimentKey$SuggestedReplies;", "Lcom/openai/experiment/ExperimentKey$VisionEnabled;", "Lcom/openai/experiment/ExperimentKey$VoiceActionCommandEnabled;", "Lcom/openai/experiment/ExperimentKey$VoiceActionsEnabled;", "Lcom/openai/experiment/ExperimentKey$VoiceAttachmentEnabled;", "Lcom/openai/experiment/ExperimentKey$VoiceHangUpEnabled;", "Lcom/openai/experiment/ExperimentKey$VoiceInterruptibilityEnabled;", "Lcom/openai/experiment/ExperimentKey$VoiceMessageStreamingEnabled;", "Lcom/openai/experiment/ExperimentKey$VoiceTrainingSettingEnabled;", "Lcom/openai/experiment/ExperimentKey$WebSocketOnForegroundEnabled;", "Lcom/openai/experiment/ExperimentKey$WhisperDisabled;", "Lcom/openai/experiment/ExperimentKey$WhisperTextSelectDisabled;", "Lcom/openai/experiment/ExperimentKey$WriteAheadLogging;", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static abstract class BooleanKey extends ExperimentKey<Boolean> {
        public /* synthetic */ BooleanKey(String str, kotlin.jvm.internal.g gVar) {
            this(str);
        }

        private BooleanKey(String str) {
            super(str, kotlin.jvm.internal.C.f37623a.b(Boolean.TYPE), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$BreezeEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class BreezeEnabled extends BooleanKey {
        public static final BreezeEnabled INSTANCE = new BreezeEnabled();

        private BreezeEnabled() {
            super("android_breeze_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$BreezeFeedbackEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class BreezeFeedbackEnabled extends BooleanKey {
        public static final BreezeFeedbackEnabled INSTANCE = new BreezeFeedbackEnabled();

        private BreezeFeedbackEnabled() {
            super("android_breeze_feedback_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$BrowserLoginAllowlist;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class BrowserLoginAllowlist extends BooleanKey {
        public static final BrowserLoginAllowlist INSTANCE = new BrowserLoginAllowlist();

        private BrowserLoginAllowlist() {
            super("android_browser_login_allowlist", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$BrowserLoginWarning;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class BrowserLoginWarning extends BooleanKey {
        public static final BrowserLoginWarning INSTANCE = new BrowserLoginWarning();

        private BrowserLoginWarning() {
            super("android_browser_login_warning", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$C2PAEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class C2PAEnabled extends BooleanKey {
        public static final C2PAEnabled INSTANCE = new C2PAEnabled();

        private C2PAEnabled() {
            super("c2pa_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$ClientActionsEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class ClientActionsEnabled extends BooleanKey {
        public static final ClientActionsEnabled INSTANCE = new ClientActionsEnabled();

        private ClientActionsEnabled() {
            super("android_client_actions_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004H\u00c6\u0001\u00a8\u0006\b"}, d2 = {"Lcom/openai/experiment/ExperimentKey$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/openai/experiment/ExperimentKey;", "T0", "typeSerial0", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = r9.y.f44626f)
        /* renamed from: com.openai.experiment.ExperimentKey$Companion$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements AbstractC6216a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // wf.AbstractC6216a
            /* renamed from: invoke */
            public final KSerializer mo122invoke() {
                return new C1996g("com.openai.experiment.ExperimentKey", kotlin.jvm.internal.C.f37623a.b(ExperimentKey.class), new AbstractC0405d[0], new KSerializer[0], new Annotation[0]);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ExperimentKey.$cachedSerializer$delegate.getValue();
        }

        public final <T0> KSerializer serializer(KSerializer kSerializer) {
            AbstractC3557B.c0("typeSerial0", kSerializer);
            return get$cachedSerializer();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$ComplianceCheckEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class ComplianceCheckEnabled extends BooleanKey {
        public static final ComplianceCheckEnabled INSTANCE = new ComplianceCheckEnabled();

        private ComplianceCheckEnabled() {
            super("chatgpt_mobile_compliance_check_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$ConversationTokensEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class ConversationTokensEnabled extends BooleanKey {
        public static final ConversationTokensEnabled INSTANCE = new ConversationTokensEnabled();

        private ConversationTokensEnabled() {
            super("android_conversation_tokens_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$ConversationUpsell;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class ConversationUpsell extends BooleanKey {
        public static final ConversationUpsell INSTANCE = new ConversationUpsell();

        private ConversationUpsell() {
            super("android_conversation_upsell", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$ConversationsAreReportable;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class ConversationsAreReportable extends BooleanKey {
        public static final ConversationsAreReportable INSTANCE = new ConversationsAreReportable();

        private ConversationsAreReportable() {
            super("conversations_are_reportable", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$DetailedMessageFeedbackEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class DetailedMessageFeedbackEnabled extends BooleanKey {
        public static final DetailedMessageFeedbackEnabled INSTANCE = new DetailedMessageFeedbackEnabled();

        private DetailedMessageFeedbackEnabled() {
            super("android_enable_detailed_message_feedabck", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$EasterEggDisabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class EasterEggDisabled extends BooleanKey {
        public static final EasterEggDisabled INSTANCE = new EasterEggDisabled();

        private EasterEggDisabled() {
            super("easter_egg_disabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$EditImageEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class EditImageEnabled extends BooleanKey {
        public static final EditImageEnabled INSTANCE = new EditImageEnabled();

        private EditImageEnabled() {
            super("android_enable_edit_image", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$EmployeeInternalRequiredDisabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class EmployeeInternalRequiredDisabled extends BooleanKey {
        public static final EmployeeInternalRequiredDisabled INSTANCE = new EmployeeInternalRequiredDisabled();

        private EmployeeInternalRequiredDisabled() {
            super("android_employee_internal_required_disabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$FileUploadEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class FileUploadEnabled extends BooleanKey {
        public static final FileUploadEnabled INSTANCE = new FileUploadEnabled();

        private FileUploadEnabled() {
            super("android_file_upload_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$GizmoCommandsEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class GizmoCommandsEnabled extends BooleanKey {
        public static final GizmoCommandsEnabled INSTANCE = new GizmoCommandsEnabled();

        private GizmoCommandsEnabled() {
            super("android_gizmo_commands", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$GizmoReviewsEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class GizmoReviewsEnabled extends BooleanKey {
        public static final GizmoReviewsEnabled INSTANCE = new GizmoReviewsEnabled();

        private GizmoReviewsEnabled() {
            super("android_gizmo_reviews_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$GizmoStoreEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class GizmoStoreEnabled extends BooleanKey {
        public static final GizmoStoreEnabled INSTANCE = new GizmoStoreEnabled();

        private GizmoStoreEnabled() {
            super("android_gizmo_store_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$HapticsDisabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class HapticsDisabled extends BooleanKey {
        public static final HapticsDisabled INSTANCE = new HapticsDisabled();

        private HapticsDisabled() {
            super("android_haptics_disabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$HeavyTrafficLogSampling;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class HeavyTrafficLogSampling extends BooleanKey {
        public static final HeavyTrafficLogSampling INSTANCE = new HeavyTrafficLogSampling();

        private HeavyTrafficLogSampling() {
            super("android_heavy_traffic_log_sampling", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$LazyLoadMessages;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class LazyLoadMessages extends BooleanKey {
        public static final LazyLoadMessages INSTANCE = new LazyLoadMessages();

        private LazyLoadMessages() {
            super("android_lazy_load_messages", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$LocalContextEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class LocalContextEnabled extends BooleanKey {
        public static final LocalContextEnabled INSTANCE = new LocalContextEnabled();

        private LocalContextEnabled() {
            super("android_local_context_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$MemoryExperienceEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class MemoryExperienceEnabled extends BooleanKey {
        public static final MemoryExperienceEnabled INSTANCE = new MemoryExperienceEnabled();

        private MemoryExperienceEnabled() {
            super("android_sunshine_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$MemoryViewEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class MemoryViewEnabled extends BooleanKey {
        public static final MemoryViewEnabled INSTANCE = new MemoryViewEnabled();

        private MemoryViewEnabled() {
            super("android_memory_view_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$OaiAnalyticsEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class OaiAnalyticsEnabled extends BooleanKey {
        public static final OaiAnalyticsEnabled INSTANCE = new OaiAnalyticsEnabled();

        private OaiAnalyticsEnabled() {
            super("android_oai_analytics_service", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$QuickTileAssistantGPTEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class QuickTileAssistantGPTEnabled extends BooleanKey {
        public static final QuickTileAssistantGPTEnabled INSTANCE = new QuickTileAssistantGPTEnabled();

        private QuickTileAssistantGPTEnabled() {
            super("android_qt_gpt_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$ShareButtonEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class ShareButtonEnabled extends BooleanKey {
        public static final ShareButtonEnabled INSTANCE = new ShareButtonEnabled();

        private ShareButtonEnabled() {
            super("android_share_conversation_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$ShortcutsEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class ShortcutsEnabled extends BooleanKey {
        public static final ShortcutsEnabled INSTANCE = new ShortcutsEnabled();

        private ShortcutsEnabled() {
            super("android_shortcuts_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$StarterPrompts;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class StarterPrompts extends BooleanKey {
        public static final StarterPrompts INSTANCE = new StarterPrompts();

        private StarterPrompts() {
            super("android_starter_prompts_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$StatsigAnalytics;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class StatsigAnalytics extends BooleanKey {
        public static final StatsigAnalytics INSTANCE = new StatsigAnalytics();

        private StatsigAnalytics() {
            super("android_enable_statsig_analytics", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$SubscriptionsEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class SubscriptionsEnabled extends BooleanKey {
        public static final SubscriptionsEnabled INSTANCE = new SubscriptionsEnabled();

        private SubscriptionsEnabled() {
            super("android_subscriptions_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$SuggestedReplies;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class SuggestedReplies extends BooleanKey {
        public static final SuggestedReplies INSTANCE = new SuggestedReplies();

        private SuggestedReplies() {
            super("android_suggested_replies_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$VisionEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class VisionEnabled extends BooleanKey {
        public static final VisionEnabled INSTANCE = new VisionEnabled();

        private VisionEnabled() {
            super("android_vision_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$VoiceActionCommandEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class VoiceActionCommandEnabled extends BooleanKey {
        public static final VoiceActionCommandEnabled INSTANCE = new VoiceActionCommandEnabled();

        private VoiceActionCommandEnabled() {
            super("android_voice_action_command_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$VoiceActionsEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class VoiceActionsEnabled extends BooleanKey {
        public static final VoiceActionsEnabled INSTANCE = new VoiceActionsEnabled();

        private VoiceActionsEnabled() {
            super("android_voice_actions_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$VoiceAttachmentEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class VoiceAttachmentEnabled extends BooleanKey {
        public static final VoiceAttachmentEnabled INSTANCE = new VoiceAttachmentEnabled();

        private VoiceAttachmentEnabled() {
            super("android_voice_attachments_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$VoiceHangUpEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class VoiceHangUpEnabled extends BooleanKey {
        public static final VoiceHangUpEnabled INSTANCE = new VoiceHangUpEnabled();

        private VoiceHangUpEnabled() {
            super("android_voice_hangup_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$VoiceInterruptibilityEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class VoiceInterruptibilityEnabled extends BooleanKey {
        public static final VoiceInterruptibilityEnabled INSTANCE = new VoiceInterruptibilityEnabled();

        private VoiceInterruptibilityEnabled() {
            super("android_voice_interruptibility_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$VoiceMessageStreamingEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class VoiceMessageStreamingEnabled extends BooleanKey {
        public static final VoiceMessageStreamingEnabled INSTANCE = new VoiceMessageStreamingEnabled();

        private VoiceMessageStreamingEnabled() {
            super("android_voice_message_streaming_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$VoiceTrainingSettingEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class VoiceTrainingSettingEnabled extends BooleanKey {
        public static final VoiceTrainingSettingEnabled INSTANCE = new VoiceTrainingSettingEnabled();

        private VoiceTrainingSettingEnabled() {
            super("android_voice_training_setting_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$WebSocketOnForegroundEnabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class WebSocketOnForegroundEnabled extends BooleanKey {
        public static final WebSocketOnForegroundEnabled INSTANCE = new WebSocketOnForegroundEnabled();

        private WebSocketOnForegroundEnabled() {
            super("android_web_socket_on_foreground_enabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$WhisperDisabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes2.dex */
    public static final class WhisperDisabled extends BooleanKey {
        public static final WhisperDisabled INSTANCE = new WhisperDisabled();

        private WhisperDisabled() {
            super("android_whisper_disabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$WhisperTextSelectDisabled;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class WhisperTextSelectDisabled extends BooleanKey {
        public static final WhisperTextSelectDisabled INSTANCE = new WhisperTextSelectDisabled();

        private WhisperTextSelectDisabled() {
            super("android_whisper_text_select_disabled", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/openai/experiment/ExperimentKey$WriteAheadLogging;", "Lcom/openai/experiment/ExperimentKey$BooleanKey;", "()V", "experiment"}, k = 1, mv = {1, 9, 0}, xi = r9.y.f44626f)
    /* loaded from: classes.dex */
    public static final class WriteAheadLogging extends BooleanKey {
        public static final WriteAheadLogging INSTANCE = new WriteAheadLogging();

        private WriteAheadLogging() {
            super("android_write_ahead_logging", null);
        }
    }

    public /* synthetic */ ExperimentKey(String str, AbstractC0405d abstractC0405d, kotlin.jvm.internal.g gVar) {
        this(str, abstractC0405d);
    }

    public static final /* synthetic */ void write$Self(ExperimentKey experimentKey, AbstractC2431b abstractC2431b, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        KSerializer[] kSerializerArr = $childSerializers;
        abstractC2431b.z(0, experimentKey.key, serialDescriptor);
        abstractC2431b.i(serialDescriptor, 1, kSerializerArr[1], experimentKey.valueType);
    }

    public boolean equals(Object obj) {
        ExperimentKey experimentKey;
        String str = this.key;
        String str2 = null;
        if (obj instanceof ExperimentKey) {
            experimentKey = (ExperimentKey) obj;
        } else {
            experimentKey = null;
        }
        if (experimentKey != null) {
            str2 = experimentKey.key;
        }
        return Objects.equals(str, str2);
    }

    public final String getKey() {
        return this.key;
    }

    public final AbstractC0405d getValueType() {
        return this.valueType;
    }

    public int hashCode() {
        return Objects.hashCode(this.key);
    }

    public /* synthetic */ ExperimentKey(int i10, String str, AbstractC0405d abstractC0405d, q0 q0Var) {
        this.key = str;
        this.valueType = abstractC0405d;
    }

    private ExperimentKey(String str, AbstractC0405d abstractC0405d) {
        this.key = str;
        this.valueType = abstractC0405d;
    }
}
