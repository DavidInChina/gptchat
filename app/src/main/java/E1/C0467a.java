package E1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: E1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f4096a;

    /* renamed from: b  reason: collision with root package name */
    public final p f4097b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4098c;

    public C0467a(int i10, p pVar, int i11) {
        this.f4096a = i10;
        this.f4097b = pVar;
        this.f4098c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4096a);
        this.f4097b.f4118a.performAction(this.f4098c, bundle);
    }
}
