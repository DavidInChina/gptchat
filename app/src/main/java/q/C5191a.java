package q;

import D1.AbstractC0360k0;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: q.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5191a implements AbstractC0360k0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f43397a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f43398b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f43399c;

    public C5191a(ActionBarContextView actionBarContextView) {
        this.f43399c = actionBarContextView;
    }

    @Override // D1.AbstractC0360k0
    public final void b(View view) {
        this.f43397a = true;
    }

    @Override // D1.AbstractC0360k0
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f43397a = false;
    }

    @Override // D1.AbstractC0360k0
    public final void d() {
        if (this.f43397a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f43399c;
        actionBarContextView.f24463m0 = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f43398b);
    }
}
