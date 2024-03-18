package Q1;

import a1.C1915c;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class I implements Spannable {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f14313Y = false;

    /* renamed from: Z  reason: collision with root package name */
    public Spannable f14314Z;

    public I(Spannable spannable) {
        this.f14314Z = spannable;
    }

    public final void a() {
        C1915c c1915c;
        Spannable spannable = this.f14314Z;
        if (!this.f14313Y) {
            if (Build.VERSION.SDK_INT < 28) {
                c1915c = new C1915c(8);
            } else {
                c1915c = new C1915c(8);
            }
            if (c1915c.q(spannable)) {
                this.f14314Z = new SpannableString(spannable);
            }
        }
        this.f14313Y = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f14314Z.charAt(i10);
    }

    @Override // java.lang.CharSequence
    /* renamed from: chars  reason: collision with other method in class */
    public final IntStream mo34chars() {
        j$.util.stream.IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(this.f14314Z.chars());
        return IntStream.Wrapper.convert(convert);
    }

    @Override // java.lang.CharSequence
    /* renamed from: codePoints  reason: collision with other method in class */
    public final java.util.stream.IntStream mo35codePoints() {
        j$.util.stream.IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(this.f14314Z.codePoints());
        return IntStream.Wrapper.convert(convert);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f14314Z.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f14314Z.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f14314Z.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f14314Z.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f14314Z.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f14314Z.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f14314Z.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f14314Z.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f14314Z.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f14314Z.toString();
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        j$.util.stream.IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(this.f14314Z.chars());
        return convert;
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        j$.util.stream.IntStream convert;
        convert = IntStream.VivifiedWrapper.convert(this.f14314Z.codePoints());
        return convert;
    }
}
