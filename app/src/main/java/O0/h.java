package O0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f13285a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f13286b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13287c;

    /* renamed from: d  reason: collision with root package name */
    public float f13288d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    public float f13289e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    public BoringLayout.Metrics f13290f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13291g;

    public h(CharSequence charSequence, V0.d dVar, int i10) {
        this.f13285a = charSequence;
        this.f13286b = dVar;
        this.f13287c = i10;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metrics;
        if (!this.f13291g) {
            TextDirectionHeuristic a5 = t.a(this.f13287c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f13285a;
            TextPaint textPaint = this.f13286b;
            if (i10 >= 33) {
                metrics = a.b(charSequence, textPaint, a5);
            } else {
                metrics = b.b(charSequence, textPaint, a5);
            }
            this.f13290f = metrics;
            this.f13291g = true;
        }
        return this.f13290f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r2.nextSpanTransition(-1, r2.length(), Q0.e.class) != r2.length()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r1.getLetterSpacing() == 0.0f) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float b() {
        Float f6;
        if (!Float.isNaN(this.f13288d)) {
            return this.f13288d;
        }
        BoringLayout.Metrics a5 = a();
        if (a5 != null) {
            f6 = Float.valueOf(a5.width);
        } else {
            f6 = null;
        }
        TextPaint textPaint = this.f13286b;
        CharSequence charSequence = this.f13285a;
        if (f6 == null) {
            f6 = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint)));
        }
        if (f6.floatValue() != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (spanned.nextSpanTransition(-1, spanned.length(), Q0.f.class) == spanned.length()) {
                }
                f6 = Float.valueOf(f6.floatValue() + 0.5f);
            }
        }
        float floatValue = f6.floatValue();
        this.f13288d = floatValue;
        return floatValue;
    }
}
