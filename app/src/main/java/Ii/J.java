package Ii;

import ae.AbstractC1979e;
import ae.AbstractC1981g;
import ae.AbstractC1983i;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.Window;
import id.AbstractC3557B;
import mh.C4678h;

/* loaded from: classes2.dex */
public final class J implements AbstractC1981g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ wf.k f8636a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f8637b;

    public J(Activity activity, C4678h c4678h) {
        this.f8636a = c4678h;
        this.f8637b = activity;
    }

    @Override // ae.AbstractC1981g
    public final AbstractC1979e a(MotionEvent motionEvent, wf.k kVar) {
        AbstractC3557B.c0("motionEvent", motionEvent);
        AbstractC3557B.c0("dispatch", kVar);
        this.f8636a.invoke(motionEvent);
        Window window = this.f8637b.getWindow();
        AbstractC3557B.b0("window", window);
        AbstractC1983i.b(window).remove(this);
        return (AbstractC1979e) kVar.invoke(motionEvent);
    }
}
