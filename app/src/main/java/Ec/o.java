package Ec;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import qf.C5323a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class o extends Enum {

    /* renamed from: h0  reason: collision with root package name */
    public static final n f4626h0 = new Object();

    /* renamed from: i0  reason: collision with root package name */
    public static final o f4627i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final o f4628j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ o[] f4629k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ C5323a f4630l0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f4631Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f4632Z;

    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, Ec.n] */
    static {
        o oVar = new o("Auto", 0, R.string.whisper_language_auto, "auto");
        f4627i0 = oVar;
        o oVar2 = new o("Arabic", 1, R.string.whisper_language_arabic, "ar");
        o oVar3 = new o("Bosnian", 2, R.string.whisper_language_bosnian, "bs");
        o oVar4 = new o("Bulgarian", 3, R.string.whisper_language_bulgarian, "bg");
        o oVar5 = new o("Catalan", 4, R.string.whisper_language_catalan, "ca");
        o oVar6 = new o("Chinese", 5, R.string.whisper_language_chinese, "zh");
        o oVar7 = new o("Croatian", 6, R.string.whisper_language_croatian, "hr");
        o oVar8 = new o("Czech", 7, R.string.whisper_language_czech, "cs");
        o oVar9 = new o("Danish", 8, R.string.whisper_language_danish, "da");
        o oVar10 = new o("Dutch", 9, R.string.whisper_language_dutch, "nl");
        o oVar11 = new o("English", 10, R.string.whisper_language_english, "en");
        f4628j0 = oVar11;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, new o("Finnish", 11, R.string.whisper_language_finnish, "fi"), new o("French", 12, R.string.whisper_language_french, "fr"), new o("Galician", 13, R.string.whisper_language_galician, "gl"), new o("German", 14, R.string.whisper_language_german, "de"), new o("Greek", 15, R.string.whisper_language_greek, "el"), new o("Hindi", 16, R.string.whisper_language_hindi, "hi"), new o("Hungarian", 17, R.string.whisper_language_hungarian, "hu"), new o("Indonesian", 18, R.string.whisper_language_indonesian, ParameterNames.ID), new o("Italian", 19, R.string.whisper_language_italian, "it"), new o("Japanese", 20, R.string.whisper_language_japanese, "ja"), new o("Korean", 21, R.string.whisper_language_korean, "ko"), new o("Macedonian", 22, R.string.whisper_language_macedonian, "mk"), new o("Malay", 23, R.string.whisper_language_malay, "ms"), new o("Norwegian", 24, R.string.whisper_language_norwegian, AuthorizationHeaderIms.NO), new o("Polish", 25, R.string.whisper_language_polish, "pl"), new o("Portuguese", 26, R.string.whisper_language_portuguese, "pt"), new o("Romanian", 27, R.string.whisper_language_romanian, "ro"), new o("Russian", 28, R.string.whisper_language_russian, "ru"), new o("Slovak", 29, R.string.whisper_language_slovak, "sk"), new o("Spanish", 30, R.string.whisper_language_spanish, "es"), new o("Tagalog", 31, R.string.whisper_language_tagalog, "tl"), new o("Tamil", 32, R.string.whisper_language_tamil, "ta"), new o("Thai", 33, R.string.whisper_language_thai, "th"), new o("Turkish", 34, R.string.whisper_language_turkish, "tr"), new o("Swedish", 35, R.string.whisper_language_swedish, "sv"), new o("Ukrainian", 36, R.string.whisper_language_ukrainian, "uk"), new o("Vietnamese", 37, R.string.whisper_language_vietnamese, "vi")};
        f4629k0 = oVarArr;
        f4630l0 = AbstractC3557B.C0(oVarArr);
    }

    public o(String str, int i10, int i11, String str2) {
        this.f4631Y = str2;
        this.f4632Z = i11;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f4629k0.clone();
    }
}
