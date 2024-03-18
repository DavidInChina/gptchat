package S1;

import Q1.l;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class e implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f16072a;

    /* renamed from: b  reason: collision with root package name */
    public V0.e f16073b;

    public e(TextView textView) {
        this.f16072a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f16072a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b10 = l.a().b();
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 != 3) {
                    return charSequence;
                }
            } else if ((i13 != 0 || i12 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return l.a().g(0, charSequence.length(), charSequence);
            } else {
                return charSequence;
            }
        }
        l a5 = l.a();
        if (this.f16073b == null) {
            this.f16073b = new V0.e(textView, this);
        }
        a5.h(this.f16073b);
        return charSequence;
    }
}
