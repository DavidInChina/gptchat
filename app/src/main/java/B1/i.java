package B1;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f1720a;

    /* renamed from: b  reason: collision with root package name */
    public final TextDirectionHeuristic f1721b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1722c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1723d;

    public i(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = h.l(textPaint).setBreakStrategy(i10);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f1720a = textPaint;
        this.f1721b = textDirectionHeuristic;
        this.f1722c = i10;
        this.f1723d = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
        if (r1 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r3.getTextLocale().equals(r5.getTextLocale()) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
        if (r3.getTypeface() != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
        if (r5.getTypeface() == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
        if (r3.getTypeface().equals(r5.getTypeface()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
        if (r7.f1721b == r8.f1721b) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        LocaleList textLocales;
        LocaleList textLocales2;
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        int i10 = Build.VERSION.SDK_INT;
        if (this.f1722c == iVar.f1722c && this.f1723d == iVar.f1723d) {
            TextPaint textPaint = this.f1720a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = iVar.f1720a;
            if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags()) {
                if (i10 >= 24) {
                    textLocales = textPaint.getTextLocales();
                    textLocales2 = textPaint2.getTextLocales();
                    equals = textLocales.equals(textLocales2);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        LocaleList textLocales;
        TextDirectionHeuristic textDirectionHeuristic = this.f1721b;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f1723d;
        int i12 = this.f1722c;
        TextPaint textPaint = this.f1720a;
        if (i10 >= 24) {
            Float valueOf = Float.valueOf(textPaint.getTextSize());
            Float valueOf2 = Float.valueOf(textPaint.getTextScaleX());
            Float valueOf3 = Float.valueOf(textPaint.getTextSkewX());
            Float valueOf4 = Float.valueOf(textPaint.getLetterSpacing());
            Integer valueOf5 = Integer.valueOf(textPaint.getFlags());
            textLocales = textPaint.getTextLocales();
            return C1.b.b(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
        }
        return C1.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public final String toString() {
        String fontVariationSettings;
        LocaleList textLocales;
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f1720a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i10 >= 24) {
            StringBuilder sb4 = new StringBuilder(", textLocale=");
            textLocales = textPaint.getTextLocales();
            sb4.append(textLocales);
            sb2.append(sb4.toString());
        } else {
            sb2.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            StringBuilder sb5 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb5.append(fontVariationSettings);
            sb2.append(sb5.toString());
        }
        sb2.append(", textDir=" + this.f1721b);
        sb2.append(", breakStrategy=" + this.f1722c);
        sb2.append(", hyphenationFrequency=" + this.f1723d);
        sb2.append("}");
        return sb2.toString();
    }

    public i(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f1720a = textPaint;
        textDirection = params.getTextDirection();
        this.f1721b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f1722c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f1723d = hyphenationFrequency;
    }
}
