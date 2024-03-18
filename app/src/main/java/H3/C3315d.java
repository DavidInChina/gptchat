package h3;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import v.C5934c;

/* renamed from: h3.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3315d {

    /* renamed from: c  reason: collision with root package name */
    public static final C5934c f31814c = new C5934c(21);

    /* renamed from: a  reason: collision with root package name */
    public final r2.b f31815a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31816b;

    public C3315d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f6, int i10, float f10, int i11, boolean z10, int i12, int i13) {
        int i14;
        boolean z11;
        if (z10) {
            i14 = i12;
            z11 = true;
        } else {
            z11 = false;
            i14 = -16777216;
        }
        this.f31815a = new r2.b(spannableStringBuilder, alignment, null, null, f6, 0, i10, f10, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z11, i14, Integer.MIN_VALUE, 0.0f);
        this.f31816b = i13;
    }
}
