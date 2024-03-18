package a8;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f23993a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f23994b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23995c;

    /* renamed from: d  reason: collision with root package name */
    public int f23996d;

    /* renamed from: k  reason: collision with root package name */
    public boolean f24003k;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f23997e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f23998f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f23999g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f24000h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f24001i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f24002j = true;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f24004l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f23993a = charSequence;
        this.f23994b = textPaint;
        this.f23995c = i10;
        this.f23996d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f23993a == null) {
            this.f23993a = "";
        }
        int max = Math.max(0, this.f23995c);
        CharSequence charSequence = this.f23993a;
        int i10 = this.f23998f;
        TextPaint textPaint = this.f23994b;
        if (i10 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f24004l);
        }
        int min = Math.min(charSequence.length(), this.f23996d);
        this.f23996d = min;
        if (this.f24003k && this.f23998f == 1) {
            this.f23997e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f23997e);
        obtain.setIncludePad(this.f24002j);
        if (this.f24003k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f24004l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f23998f);
        float f6 = this.f23999g;
        if (f6 != 0.0f || this.f24000h != 1.0f) {
            obtain.setLineSpacing(f6, this.f24000h);
        }
        if (this.f23998f > 1) {
            obtain.setHyphenationFrequency(this.f24001i);
        }
        return obtain.build();
    }
}
