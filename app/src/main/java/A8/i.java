package a8;

import android.text.TextPaint;
import c8.C2306c;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public float f24007c;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f24009e;

    /* renamed from: f  reason: collision with root package name */
    public C2306c f24010f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f24005a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final W7.b f24006b = new W7.b(1, this);

    /* renamed from: d  reason: collision with root package name */
    public boolean f24008d = true;

    public i(h hVar) {
        this.f24009e = new WeakReference(null);
        this.f24009e = new WeakReference(hVar);
    }

    public final float a(String str) {
        float f6;
        if (!this.f24008d) {
            return this.f24007c;
        }
        TextPaint textPaint = this.f24005a;
        if (str == null) {
            f6 = 0.0f;
        } else {
            f6 = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.f24007c = f6;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f24008d = false;
        return this.f24007c;
    }
}
