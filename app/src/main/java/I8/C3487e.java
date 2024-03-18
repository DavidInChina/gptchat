package i8;

import com.google.android.material.internal.CheckableImageButton;
import l8.AbstractC4344b;

/* renamed from: i8.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3487e extends AbstractC3498p {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f32767e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3487e(C3497o c3497o, int i10) {
        super(c3497o);
        this.f32767e = i10;
    }

    @Override // i8.AbstractC3498p
    public final void r() {
        switch (this.f32767e) {
            case 0:
                C3497o c3497o = this.f32815b;
                c3497o.f32809v0 = null;
                CheckableImageButton checkableImageButton = c3497o.f32801n0;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC4344b.b1(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
