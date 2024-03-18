package X0;

import Z.C1724m0;
import Z.I;
import Z.o1;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.google.android.gms.internal.play_billing.N;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.J;

/* loaded from: classes2.dex */
public final class c extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a  reason: collision with root package name */
    public final J f21719a;

    /* renamed from: b  reason: collision with root package name */
    public final float f21720b;

    /* renamed from: c  reason: collision with root package name */
    public final C1724m0 f21721c = AbstractC4828h.Z(new C5254f(C5254f.f43638c), o1.f22665a);

    /* renamed from: d  reason: collision with root package name */
    public final I f21722d = AbstractC4828h.E(new b(0, this));

    public c(J j6, float f6) {
        this.f21719a = j6;
        this.f21720b = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float f6 = this.f21720b;
        if (!Float.isNaN(f6)) {
            textPaint.setAlpha(AbstractC4344b.Y0(N.o(f6, 0.0f, 1.0f) * 255));
        }
        textPaint.setShader((Shader) this.f21722d.getValue());
    }
}
