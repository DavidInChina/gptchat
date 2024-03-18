package q;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class Z implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ TextView f43386Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Typeface f43387Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f43388h0;

    public Z(TextView textView, Typeface typeface, int i10) {
        this.f43386Y = textView;
        this.f43387Z = typeface;
        this.f43388h0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f43386Y.setTypeface(this.f43387Z, this.f43388h0);
    }
}
