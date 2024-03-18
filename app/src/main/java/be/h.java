package be;

import Ii.D;
import ae.AbstractC1979e;
import ae.AbstractC1981g;
import ae.C1977c;
import android.view.KeyEvent;
import android.view.MotionEvent;
import id.AbstractC3557B;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class h implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25958Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f25959Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Iterator f25960h0;

    public /* synthetic */ h(i iVar, Iterator it, int i10) {
        this.f25958Y = i10;
        this.f25959Z = iVar;
        this.f25960h0 = it;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        AbstractC1979e abstractC1979e = AbstractC1979e.f24160a;
        AbstractC1979e abstractC1979e2 = C1977c.f24159b;
        int i10 = this.f25958Y;
        i iVar = this.f25959Z;
        Iterator it = this.f25960h0;
        switch (i10) {
            case 0:
                KeyEvent keyEvent = (KeyEvent) obj;
                AbstractC3557B.c0("interceptedEvent", keyEvent);
                if (it.hasNext()) {
                    ((D) it.next()).getClass();
                    return D.a(keyEvent, this);
                }
                if (iVar.f25966h0.dispatchKeyEvent(keyEvent)) {
                    abstractC1979e = abstractC1979e2;
                }
                return abstractC1979e;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                AbstractC3557B.c0("interceptedEvent", motionEvent);
                if (it.hasNext()) {
                    return ((AbstractC1981g) it.next()).a(motionEvent, this);
                }
                if (iVar.f25966h0.dispatchTouchEvent(motionEvent)) {
                    abstractC1979e = abstractC1979e2;
                }
                return abstractC1979e;
        }
    }
}
