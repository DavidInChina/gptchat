package q;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import l.AbstractC4308a;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f43213a;

    /* renamed from: b  reason: collision with root package name */
    public final F4.a f43214b;

    public A(TextView textView) {
        this.f43213a = textView;
        this.f43214b = new F4.a(textView);
    }

    public final void a(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f43213a.getContext().obtainStyledAttributes(attributeSet, AbstractC4308a.f37672i, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void b(boolean z10) {
        ((P5.c) this.f43214b.f5033Z).K(z10);
    }

    public final void c(boolean z10) {
        ((P5.c) this.f43214b.f5033Z).N(z10);
    }
}
