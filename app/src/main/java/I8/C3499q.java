package i8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import q.C5215i0;

/* renamed from: i8.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3499q extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32818a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f32819b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f32820c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f32821d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C3501s f32822e;

    public C3499q(C3501s c3501s, int i10, TextView textView, int i11, TextView textView2) {
        this.f32822e = c3501s;
        this.f32818a = i10;
        this.f32819b = textView;
        this.f32820c = i11;
        this.f32821d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C5215i0 c5215i0;
        int i10 = this.f32818a;
        C3501s c3501s = this.f32822e;
        c3501s.f32839n = i10;
        c3501s.f32837l = null;
        TextView textView = this.f32819b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f32820c == 1 && (c5215i0 = c3501s.f32843r) != null) {
                c5215i0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f32821d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f32821d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
