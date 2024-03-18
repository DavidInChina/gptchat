package Q1;

import a1.C1915c;
import android.text.Spannable;
import android.text.SpannableString;

/* loaded from: classes2.dex */
public final class r implements s {

    /* renamed from: Y  reason: collision with root package name */
    public I f14344Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1915c f14345Z;

    public r(I i10, C1915c c1915c) {
        this.f14344Y = i10;
        this.f14345Z = c1915c;
    }

    @Override // Q1.s
    public final boolean a(CharSequence charSequence, int i10, int i11, D d10) {
        Spannable spannable;
        if ((d10.f14307c & 4) > 0) {
            return true;
        }
        if (this.f14344Y == null) {
            if (charSequence instanceof Spannable) {
                spannable = (Spannable) charSequence;
            } else {
                spannable = new SpannableString(charSequence);
            }
            this.f14344Y = new I(spannable);
        }
        this.f14345Z.getClass();
        this.f14344Y.setSpan(new E(d10), i10, i11, 33);
        return true;
    }

    @Override // Q1.s
    public final Object b() {
        return this.f14344Y;
    }
}
