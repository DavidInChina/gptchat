package P0;

import E9.f;
import H0.B0;
import O0.c;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.text.BreakIterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f13770a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13771b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13772c;

    /* renamed from: d  reason: collision with root package name */
    public final BreakIterator f13773d;

    public b(CharSequence charSequence, int i10, Locale locale) {
        this.f13770a = charSequence;
        if (charSequence.length() >= 0) {
            if (i10 >= 0 && i10 <= charSequence.length()) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                this.f13773d = wordInstance;
                this.f13771b = Math.max(0, -50);
                this.f13772c = Math.min(charSequence.length(), i10 + 50);
                wordInstance.setText(new c(i10, charSequence));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    public final void a(int i10) {
        int i11 = this.f13771b;
        int i12 = this.f13772c;
        if (i10 <= i12 && i11 <= i10) {
            return;
        }
        throw new IllegalArgumentException(AbstractC2469q0.j(f.A("Invalid offset: ", i10, ". Valid range is [", i11, " , "), i12, ']').toString());
    }

    public final boolean b(int i10) {
        int i11 = this.f13771b + 1;
        if (i10 <= this.f13772c && i11 <= i10 && Character.isLetterOrDigit(Character.codePointBefore(this.f13770a, i10))) {
            return true;
        }
        return false;
    }

    public final boolean c(int i10) {
        int i11 = this.f13771b + 1;
        if (i10 <= this.f13772c && i11 <= i10) {
            return B0.e(Character.codePointBefore(this.f13770a, i10));
        }
        return false;
    }

    public final boolean d(int i10) {
        if (i10 < this.f13772c && this.f13771b <= i10 && Character.isLetterOrDigit(Character.codePointAt(this.f13770a, i10))) {
            return true;
        }
        return false;
    }

    public final boolean e(int i10) {
        if (i10 < this.f13772c && this.f13771b <= i10) {
            return B0.e(Character.codePointAt(this.f13770a, i10));
        }
        return false;
    }
}
