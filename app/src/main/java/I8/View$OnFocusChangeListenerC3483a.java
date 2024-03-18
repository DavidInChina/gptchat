package i8;

import android.view.View;

/* renamed from: i8.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class View$OnFocusChangeListenerC3483a implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32752a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC3498p f32753b;

    public /* synthetic */ View$OnFocusChangeListenerC3483a(AbstractC3498p abstractC3498p, int i10) {
        this.f32752a = i10;
        this.f32753b = abstractC3498p;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        int i10 = this.f32752a;
        AbstractC3498p abstractC3498p = this.f32753b;
        switch (i10) {
            case 0:
                C3486d c3486d = (C3486d) abstractC3498p;
                c3486d.t(c3486d.u());
                return;
            default:
                C3494l c3494l = (C3494l) abstractC3498p;
                c3494l.f32782l = z10;
                c3494l.q();
                if (!z10) {
                    c3494l.t(false);
                    c3494l.f32783m = false;
                    return;
                }
                return;
        }
    }
}
