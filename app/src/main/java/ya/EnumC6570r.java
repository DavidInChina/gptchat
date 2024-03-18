package ya;

import com.openai.chatgpt.R;
import id.AbstractC3557B;
import qf.C5323a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ya.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6570r extends Enum {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC6570r[] f50873h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ C5323a f50874i0;

    /* renamed from: Y  reason: collision with root package name */
    public final int f50875Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f50876Z;

    static {
        EnumC6570r[] enumC6570rArr = {new EnumC6570r("AUDIO_ISSUES", 0, R.string.voice_feedback_audio_issues, "audio_issues"), new EnumC6570r("RESPONSE_QUALITY", 1, R.string.voice_feedback_didnt_like_responses, "response_quality"), new EnumC6570r("INTERRUPTIONS", 2, R.string.voice_feedback_interrupted, "interruptions"), new EnumC6570r("TRANSCRIPTION_ISSUES", 3, R.string.voice_feedback_misheard, "transcription_issues"), new EnumC6570r("OTHER", 4, R.string.voice_feedback_other, "other")};
        f50873h0 = enumC6570rArr;
        f50874i0 = AbstractC3557B.C0(enumC6570rArr);
    }

    public EnumC6570r(String str, int i10, int i11, String str2) {
        this.f50875Y = i11;
        this.f50876Z = str2;
    }

    public static EnumC6570r valueOf(String str) {
        return (EnumC6570r) Enum.valueOf(EnumC6570r.class, str);
    }

    public static EnumC6570r[] values() {
        return (EnumC6570r[]) f50873h0.clone();
    }
}
